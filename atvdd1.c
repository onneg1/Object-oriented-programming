#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//funcao para limpar tela
void limpartela(){
	system("cls || clear");
}


int main (){
    setlocale (LC_ALL, "Portuguese");

    int mes[3];
    int temp_reposicao, lote_reposicao;
    int i;
    int soma = 0;
    float Emin, Emax; //estoque minimo, estoque maximo
    float Vmd; //vmd = venda media diaria
    char nome_produto[150];

    //solicitando o nome do produto
    printf ("Digite o nome do produto: \n");
    fgets (nome_produto, 150, stdin);
    fflush(stdin);

    //solicitando os meses
    for (i = 0; i < 3; i++){
        printf ("Digite o %dº mês: \n", i+1);
        scanf ("%d", &mes[i]);
        soma+= mes[i];
        limpartela();
    }

    //calculando VMD
    Vmd = ((soma)/3.0)/25.0;
    
    //tempo de reposicao
    printf ("Digite o tempo de reposição de %s: \n", nome_produto);
    scanf ("%d", &temp_reposicao);
    limpartela();
    
    //calculando Estoque minimo
    Emin = Vmd * temp_reposicao;

    printf ("Digite o lote de reposição de %s: \n", nome_produto);
    scanf ("%d", &lote_reposicao);
    limpartela();
    
    //calculando estoque maximo
    Emax = Emin + lote_reposicao;

    //if para exibição da mensagem
    if (Emin < lote_reposicao){
        printf ("É necessário que reponha o estoque de %s! \n", nome_produto);
    } else {
        printf ("Não é necessário repor o estoque de %s! \n", nome_produto);
    }
    
    printf ("O valor de VMD é: %.2f \n", Vmd);
    printf ("O valor do Estoque mínimo de %s é: %.2f \n", nome_produto, Emin);
    printf ("O valor do Estoque máximo de %s é: %.2f \n", nome_produto, Emax);

    return 0;
}

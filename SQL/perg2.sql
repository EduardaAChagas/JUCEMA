CREATE TABLE TABELA_PRAZO
(
 CEP_INICIO NUMBER(8) NOT NULL
, CEP_FIM NUMBER(8) NOT NULL
, PRAZO NUMBER(3) NOT NULL
);

SELECT PRAZO FROM TABELA_PRAZO
WHERE PRAZO = PRAZO
SELECT CEP_FIM, CEP_INICIO FROM TABELA_PRAZO
WHERE CEP_FIM+1 = CEP_INICIO;

CREATE TABLE TABELA_PRAZO_COMPACTADO
(
 CEP_INICIO NUMBER(8) NOT NULL
, CEP_FIM NUMBER(8) NOT NULL
, PRAZO NUMBER(3) NOT NULL
);
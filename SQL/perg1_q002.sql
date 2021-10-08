SELECT COUNT( distinct a.NUMSALA) from SALA a, TURMA b, DEPTO c

WHERE b.ANOSEM = "20022" and b.CODDEPTO = c.CODDEPTO and c.NOMEDEPTO = "informática"
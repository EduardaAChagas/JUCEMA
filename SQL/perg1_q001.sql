SELECT a.ANOSEM from PROFTURMA a, PROFESSOR b, DEPTO c

WHERE COUNT( b.codepto = c.coddepto and c.nomedepto = "Informática" ) = COUNT( b.codprof = a.codprof and b.codepto = c.coddepto and c.nomedepto = "Informática" )
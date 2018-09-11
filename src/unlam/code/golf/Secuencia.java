package unlam.code.golf;

public class Secuencia {
	
	boolean secuenciaCiclica(int[] secuencia) {
	int[] s = secuencia;
	int i = 0, p = 0, l = s.length;
	
	for(; i < l; i++)
		p = s[i] < s[p]? i: p;
	
	i = p < 1? l - 1 : p - 1;
	
	while (p != i)
		if (s[p] > s[p + 1 == l ? p = 0 : ++p])
			return 0 > 1;
	return 1 > 0;
	}
}

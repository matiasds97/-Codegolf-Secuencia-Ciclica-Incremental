package unlam.code.golf;

public class Secuencia {
	
	boolean secuenciaCiclica(int[] secuencia) {
		int[] s = secuencia;
		int i = 0, j = 1, l = s.length;
		boolean k = 0>1;
		
		while(s[i++] < s[j++]);
				j = i;
		
		while(l > 1) {
			j = j < l? j: 0;
			k = (s[i] > s[++j])? 0>1: 1>0;
		}
		return k;
	}
}

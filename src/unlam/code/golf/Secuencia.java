package unlam.code.golf;

public class Secuencia {
	
	boolean secuenciaCiclica(int[] secuencia) {
		int[] s = secuencia;
		int i = 0, j = 0, l = s.length;
		for(; i < l-1; i++) {
			if(s[i] > s[i+1])
				j = i+1;
		}
		i = j+1;
		if(l < 2)
			return 1>0;
		while(i != j) {
			if(j > l-2) {
				if(s[j] > s[0])
					return 0>1;
				j = 0;
			}
			if(s[j] > s[++j])
				return 0>1;
		}
		return 1>0;
	}
}

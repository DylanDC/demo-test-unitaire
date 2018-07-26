package dev.utils;

public class TestStringUtils {

	public static void main(String[] args) throws Exception {
		int test = StringUtils.levenshteinDistance("test", "tost");
		System.out.println(test);
		if(test!=1){
			throw new Exception("Test 1 : La distance attendu n'est pas la bonne");
				
		}else{
			System.out.println("Test 1 passant");
		}
		
		test = StringUtils.levenshteinDistance("test", "test");
		if(test != 0){
			throw new Exception("Test 2 :  La distance attendu n'est pas la bonne ");
			
		}else{
			System.out.println("Test 2 passant");
		}
		
		test = StringUtils.levenshteinDistance("tilo", "test");
		if(test != 3){
			throw new Exception("Test 3 :  La distance attendu n'est pas la bonne ");
			
		}else{
			System.out.println("Test 3 passant");
		}
		test = StringUtils.levenshteinDistance(null, null);
		if(test != 0){
			throw new Exception("Test 4 :  La distance attendu n'est pas la bonne ");
			
		}else{
			System.out.println("Test 4 passant");
		}
	}

}

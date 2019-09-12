public class percobaan7{
	public static void main(String[] args) {
		String str1 = "selamat mencoba !";
		String str2 = "selamat mencoba !";
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println();
		
		boolean boolean1 = str1.equals(str2);
		System.out.println("str1.equals(str2) = " + boolean1);
		boolean boolean2 = str1.equalsIgnoreCase(str2);
		System.out.println("str1.equalsIgnoreCase(str2) = " +boolean2);
		
		int inti =str1.compareTo(str2);
		System.out.println("str1.compareTo(str2) = " + inti);
		
		String str3 = str1.toUpperCase();
		System.out.println("str1.topUpperCase() = " + str3);
		String str4 = str1.toLowerCase();
		System.out.println("str1.tolowerCase() = " + str4);
		
		char c1 = str1.charAt(6);
		System.out.println("str1.charAt(6) = " + c1);
		
		String str5 = str1.substring(6);
		System.out.println("str1.substring(6) = " + str5);
		String str6 = str1.substring(0,5);
		System.out.println("str1.substring(0,5) = " + str6);
		
		int int2 = str1.indexOf('m');
		System.out.println("str1.indexOf('m') = " + int2);
		int int3 = str1.indexOf('m',6);
		System.out.println("str1.indexOf('m',6) = " + int3);
		int int4 = str1.indexOf("adil");
		System.out.println("str1.indexOf(\"adil\") = " + int4);
		
		int int5 = str1.lastIndexOf('a');
		System.out.println("str1.lastIndexOf('a') = " + int5);
	
		boolean boolean3 = str1.startsWith("selamat");
		System.out.println("str1.startsWith(\"selamat\") = " +boolean3);
		System.out.println();
		
		String str7 = "selamat mencoba !";
		System.out.println("str7 = " + str7);
		String str8 = str7.trim();
		System.out.println("str7.trim() = " + str8);
		
		
		str8 = str8 + " OK!";
		System.out.println("str8 = " + str8);
	}
}
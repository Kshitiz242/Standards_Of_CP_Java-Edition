//This makes IO faster in Java
public class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
                                        st=new StringTokenizer(br.readLine());				               
                                } catch (IOException e) {}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

class io{
  public static void iohelper(){
    //For Reading a line of integers 
    FastScanner scanner = new FastScanner();
    String line = scanner.br.readLine(); // Read a line of space-separated integers

    // Split the line into an array of strings
    String[] tokens = line.split(" ");

    // Convert the strings to integers
    for (String token : tokens) {
    int x = Integer.parseInt(token);
    // Process the integer x
    }
    //For reading space separated integers
    FastScanner scanner = new FastScanner();
int n = scanner.nextInt(); // Read the total number of integers

// Read n space-separated integers
for (int i = 0; i < n; i++) {
    int x = scanner.nextInt();
    // Process the integer x
}

  }
}

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(arr1[i]);
        }
        for(int i=0;i<m;i++)
        {
            hs.add(arr2[i]);
        }
        ArrayList<Integer> al=new ArrayList<>(hs);
        Collections.sort(al);
        return al;
    }
}

class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        Set<Integer> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int k:b)
        {
            hs.add(k);
            
        }
        for(int v:a)
        {
            if(!hs.contains(v))
            {
                al.add(v);
            }
            
        }
        return al;
        
        
    }
}

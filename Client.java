 class Pan
{
   private static float depth;
   private float width = 5;
   public Pan(float depth, float width)
   {
      depth = depth*2;
      this.width = width*2;
   }
   public String toString()
   {
      return depth+" "+width;
   }
   public void setDepth(float newDepth)
   {
      if(newDepth < 10)
      {
         newDepth = 14;
      }
      if(newDepth > 15)
      {
         newDepth = 15;
      }
      depth = newDepth;
      width = 3;
   }
   public float getWidth()
   {
      return width;
   }
   public float getDepth()
   {
      return depth;
   }
}

class FryingPan extends Pan
{
   private String name;
   public FryingPan(float depth, float width, String name)
   {
      super(depth*2,width*2);
      this.name = name;
   }
   public String toString()
   {
      return getWidth()+ " "+getDepth()+" "+name;
   }
}


//client on next page







public class Client
{
   public static void main(String[] args)
   {
      Pan hot = new Pan(10,4);
      Pan ice = new FryingPan(2,13,"15inch Pan");
      Pan hotter = new Pan(99,57);
      Pan freezing = new FryingPan(8,5,"12inch Pan");
           
      System.out.println(hot);
      System.out.println(ice);
           
      ice.setDepth(9);
      hot.setDepth(5);
           

      System.out.println(hotter);
      System.out.println(freezing); 
   }
}
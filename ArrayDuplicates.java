//this solution is in O(n) runtime
class ArrayDuplicates{
  public List<Integer> findDuplicates(int[] numbers){
  
    List<Integer> results = new ArrayList();
    
    //goes through array of numbers
    for(int i = 0; i < numbers.length; i++){
      int newIndex = Math.abs(numbers[i])-1;
    
    //checks if the new index is negative, if it is... its a duplicate number
    if(numbers[newIndex] < 0){
      result.add(newIndex + 1);
    }
   //this part makes the newIndex negative so it can enter the if statement
   numbers[newIndex] = (-1) * numbers[newIndex];
  }
  return results;
}
}

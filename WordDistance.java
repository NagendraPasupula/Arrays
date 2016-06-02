/**
**Given an array and two words, return the shortest distance between these two words.
**
**@Author: Venkata Nagendra Kumar Pasupula
**/


public class WordDistance{
	public int shortestDistance(String[] words, String word1, String word2) {
		int index1 = -1, index2=-1, distance = 9999999;
		for(int i=0;i<words.length;i++){
			if(words[i].equals(word1)) index1 = i;
			if(words[i].equals(word2)) index2 = i;
			if(index1 != -1 && index2 != -1) distance = Math.min(distance,Math.abs(index1-index2));
		}
		return distance;
	}
	public static void main(String[] args){
		WordDistance wd= new WordDistance();
		String[] words = {"apple","ball","cat","cat","dog","ball"};
		int dist = wd.shortestDistance(words,"ball","cat");
		System.out.println(dist);
	}
}
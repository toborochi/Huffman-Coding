package core.huffman;

public class HuffmanNode implements Comparable<HuffmanNode>{
    
   
    private HuffmanNode left,right;
    private byte character,percentage;
   
    public HuffmanNode(){
        left = right = null;
        character = percentage = (byte)0;
    }
    
    public HuffmanNode(byte character, byte percentage){
        this();
        this.character = character;        
        this.percentage = percentage;
    }
    
    public byte getCharacter(){
        return character;
    }
    
    public byte getPercentage(){
        return percentage;
    }
    
    public HuffmanNode getLeft(){
        return left;
    }
    
    public HuffmanNode getRight(){
        return right;
    }

    public void setCharacter(byte character){
        this.character = character;
    }
    
    public void setPercentage(byte percentage){
        this.percentage = percentage;
    }
    
    public void setLeft(HuffmanNode node){
        this.left = node;
    }
    
    public void setRight(HuffmanNode node){
        this.right = node;
    }
   
     @Override
    public int compareTo(HuffmanNode otherNode){
        return (getPercentage()-otherNode.getPercentage());
    }
    @Override 
    public String toString(){
        return ("["+character+":"+percentage+"]");
    }
   
    
}

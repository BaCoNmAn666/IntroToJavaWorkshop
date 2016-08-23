int x = 400;
int speed = 5;
void setup(){
  size(800, 800);
  
  
  
  
  
  
  
}
void draw(){
 background(156, 59, 185);  
  ellipse(x, 400, 50, 50);  //in draw method
  fill(125, 51, 54);   //in draw method
  stroke(252, 163, 187);
  x = x + speed;
  if(x > 800){
    speed = -speed;
  }
  if(x < 0){
    speed = -speed;
  }
 
}

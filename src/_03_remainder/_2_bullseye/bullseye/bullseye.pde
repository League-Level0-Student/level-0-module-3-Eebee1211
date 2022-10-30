
void setup() {
 size(1000,1000); 
 
  // set the size of your sketch
  
}

void draw() {
int size = 900; 
  for(int i = 0; i <= 7; i++){
  if(i % 2 == 0) {
  fill(#FF0000);
  }
  else if( i % 2 == 1) {
 fill(000000); 
  }
 ellipse(500,500,size,size);
 size = size - 100; 
 

  
  
  }
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}

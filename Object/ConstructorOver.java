class HouseDog extends Dog {
  HouseDog(String name) { //받은 값이 string일 경우
    this.setName(name);
  }
  
  HouseDog(int type) { //받은 값이 int일 경우
    if (type == 1) {
      this.setName('yorkshire');
    } else if (type == 2) {
      this.setName('bulldog');
    }
  }
        

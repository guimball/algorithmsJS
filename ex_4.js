function mdc(a, b) {
    return b ? mdc(b, a%b) : a;
  }
  

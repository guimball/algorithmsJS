function contagem(numeros, n) {
    let count = 0;
    for(let num of numeros) {
      if(num <= n) count++; 
    }
    return count;
  }
  

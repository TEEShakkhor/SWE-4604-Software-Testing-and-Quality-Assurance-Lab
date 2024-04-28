//SN

describe('Strong Normal ', () => {
    test('Validate input - locks = 1, stocks = 1, barrels = 1 (valid)', () => {
      const locks = 1;
      const stocks = 1;
      const barrels = 1;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('valid');
    });
  });
  

  describe('Strong Normal ', () => {
    test('Validate input - locks = 70, stocks = 80, barrels = 90 (valid)', () => {
      const locks = 70;
      const stocks = 80;
      const barrels = 90;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('valid');
    });
  });

  describe('Strong Normal ', () => {
    test('Validate input - locks = 40, stocks = 40, barrels = 40 (valid)', () => {
      const locks = 40;
      const stocks = 40;
      const barrels = 40;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('valid');
    });
  });




  //WR




  describe('Weak Robust ', () => {
    test('Validate input - locks = 0, stocks = 20, barrels = 30 (invalid)', () => {
      const locks = 0;
      const stocks = 20;
      const barrels = 30;
  
     //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });


  describe('Weak Robust ', () => {
    test('Validate input - locks = 20, stocks = 0, barrels = 30 (invalid)', () => {
      const locks = 20;
      const stocks = 0;
      const barrels = 30;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Weak Robust ', () => {
    test('Validate input - locks = 20, stocks = 20, barrels = 0 (invalid)', () => {
      const locks = 20;
      const stocks = 20;
      const barrels = 0;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Weak Robust ', () => {
    test('Validate input - locks = 80, stocks = 20, barrels = 30 (invalid)', () => {
      const locks = 80;
      const stocks = 20;
      const barrels = 30;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Weak Robust ', () => {
    test('Validate input - locks = 20, stocks = 90, barrels = 30 (invalid)', () => {
      const locks = 20;
      const stocks = 90;
      const barrels = 30;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Weak Robust ', () => {
    test('Validate input - locks = 20, stocks = 20, barrels = 100 (invalid)', () => {
      const locks = 20;
      const stocks = 20;
      const barrels = 100;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Weak Robust ', () => {
    test('Validate input - locks = 20, stocks = 30, barrels = 95 (invalid)', () => {
      const locks = 20;
      const stocks = 30;
      const barrels = 95;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });




  //SR




  
  describe('Strong Robust ', () => {
    test('Validate input - locks = 0, stocks = 0, barrels = 3 (invalid)', () => {
      const locks = 0;
      const stocks = 0;
      const barrels = 3;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Strong Robust ', () => {
    test('Validate input - locks = 0, stocks = 2, barrels = 0 (invalid)', () => {
      const locks = 0;
      const stocks = 2;
      const barrels = 0;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Strong Robust ', () => {
    test('Validate input - locks = 80, stocks = 90, barrels = 3 (invalid)', () => {
      const locks = 80;
      const stocks = 90;
      const barrels = 3;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });


  describe('Strong Robust ', () => {
    test('Validate input - locks = 80, stocks = 2, barrels = 100 (invalid)', () => {
      const locks = 80;
      const stocks = 2;
      const barrels = 100;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Strong Robust ', () => {
    test('Validate input - locks = 0, stocks = 90, barrels = 3 (invalid)', () => {
      const locks = 0;
      const stocks = 90;
      const barrels = 3;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Strong Robust ', () => {
    test('Validate input - locks = 80, stocks = 0, barrels = 3 (invalid)', () => {
      const locks = 80;
      const stocks = 0;
      const barrels = 3;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });

  describe('Strong Robust ', () => {
    test('Validate input - locks = 0, stocks = 0, barrels = 0 (invalid)', () => {
      const locks = 0;
      const stocks = 0;
      const barrels = 0;
  
      //function call
      const result = validateSalesInput(locks, stocks, barrels);
  
      expect(result).toBe('invalid');
    });
  });


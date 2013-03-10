load('jasmine/calculator.js');

describe("calculator", function(){
  it("should add two numbers", function(){
    expect(jasmine.Calculator.add(1, 2)).toBe(3);
  })
});


public class WhiteTriangle extends Triangle {

    public WhiteTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }
	
	@Override
	public int areaCalculation(){
		return super.areaCalculation();
	}
	
    @Override
    public String toString() {
        return "WhiteTriangle. Square = " + areaCalculation();
    }
	

}

package CV;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JPanel;

public class Print<ContentPne>{
	
	public void print(final JPanel a) {
		PrinterJob job = PrinterJob.getPrinterJob();
		job.setPrintable(new Printable() {

			
			public int print(Graphics pg, PageFormat pf, int pageNum)throws PrinterException {
				pf.setOrientation(PageFormat.PORTRAIT);
				if(pageNum>0) {
					return Printable.NO_SUCH_PAGE;
				}
				
				Graphics2D g2 =(Graphics2D)pg;
				g2.translate(pf.getImageableX()*2, pf.getImageableY()*2);
				g2.scale(0.86, 1);;
				a.print(g2);
				
				
				return Printable.PAGE_EXISTS;
			}
		});
			boolean ok = job.printDialog();
			if(ok) {
				try {
					job.print();
				}
				catch(PrinterException ex) {}
			}
			
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public String year(String a,String b) {
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		int z= x-y;
			
		return String.valueOf(z);
			
	}

}

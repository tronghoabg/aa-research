package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ihd extends defpackage.iie implements defpackage.iic {
    public java.util.List a = new java.util.ArrayList();
    public java.lang.Boolean b;
    public android.graphics.Matrix c;
    public java.lang.String d;
    public int e;

    protected ihd() {
    }

    @Override // defpackage.iic
    public final void b(defpackage.iig iigVar) throws org.xml.sax.SAXException {
        if (!(iigVar instanceof defpackage.ihw)) {
            throw new org.xml.sax.SAXException(defpackage.a.bV(iigVar, "Gradient elements cannot contain ", " elements."));
        }
        this.a.add(iigVar);
    }

    @Override // defpackage.iic
    public final java.util.List n() {
        return this.a;
    }
}

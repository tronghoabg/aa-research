package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class iir extends defpackage.iia {
    protected iir() {
    }

    @Override // defpackage.iia, defpackage.iic
    public final void b(defpackage.iig iigVar) throws org.xml.sax.SAXException {
        if (!(iigVar instanceof defpackage.iiq)) {
            throw new org.xml.sax.SAXException(defpackage.a.bV(iigVar, "Text content elements cannot contain ", " elements."));
        }
        this.i.add(iigVar);
    }
}

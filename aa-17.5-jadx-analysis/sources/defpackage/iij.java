package defpackage;

import org.xml.sax.SAXException;

/* loaded from: classes2.dex */
public class iij extends ihs {
    protected iij() {
    }

    @Override // defpackage.ihs, defpackage.ihu
    public final void b(ihy ihyVar) throws SAXException {
        if (!(ihyVar instanceof iii)) {
            throw new SAXException(a.bW(ihyVar, "Text content elements cannot contain ", " elements."));
        }
        this.i.add(ihyVar);
    }
}

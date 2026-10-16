package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* loaded from: classes2.dex */
public class igv extends ihw implements ihu {
    public List a = new ArrayList();
    public Boolean b;
    public Matrix c;
    public String d;
    public int e;

    protected igv() {
    }

    @Override // defpackage.ihu
    public final void b(ihy ihyVar) throws SAXException {
        if (!(ihyVar instanceof iho)) {
            throw new SAXException(a.bW(ihyVar, "Gradient elements cannot contain ", " elements."));
        }
        this.a.add(ihyVar);
    }

    @Override // defpackage.ihu
    public final List n() {
        return this.a;
    }
}

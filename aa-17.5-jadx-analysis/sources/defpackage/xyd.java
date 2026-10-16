package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class xyd implements Serializable, xyc {
    private static final long serialVersionUID = 0;
    final xyc a;
    volatile transient boolean b;
    transient Object c;
    private transient afep d = new afep();

    public xyd(xyc xycVar) {
        xycVar.getClass();
        this.a = xycVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new afep();
    }

    @Override // defpackage.xyc
    public final Object gu() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    Object objGu = this.a.gu();
                    this.c = objGu;
                    this.b = true;
                    return objGu;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return a.bW(obj, "Suppliers.memoize(", ")");
    }
}

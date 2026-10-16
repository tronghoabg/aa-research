package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
abstract class upv {
    private Reference a;

    private static final Object c(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    protected abstract Object a();

    public Object b() {
        Object objC = c(this.a);
        if (objC != null) {
            return objC;
        }
        synchronized (this) {
            Object objC2 = c(this.a);
            if (objC2 != null) {
                return objC2;
            }
            Object objA = a();
            if (objA == null) {
                return null;
            }
            this.a = new SoftReference(objA);
            return objA;
        }
    }
}

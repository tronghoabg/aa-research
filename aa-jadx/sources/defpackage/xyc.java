package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xyc {
    protected xyc() {
    }

    protected abstract int a(java.lang.Object obj);

    protected abstract boolean b(java.lang.Object obj, java.lang.Object obj2);

    public final int c(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return a(obj);
    }

    public final boolean d(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return b(obj, obj2);
    }
}

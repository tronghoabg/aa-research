package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xya extends defpackage.xyc implements java.io.Serializable {
    public static final defpackage.xya a = new defpackage.xya();
    private static final long serialVersionUID = 1;

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.xyc
    protected final int a(java.lang.Object obj) {
        return java.lang.System.identityHashCode(obj);
    }

    @Override // defpackage.xyc
    protected final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return false;
    }
}

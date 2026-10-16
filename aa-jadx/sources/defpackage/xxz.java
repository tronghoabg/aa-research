package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xxz extends defpackage.xyc implements java.io.Serializable {
    public static final defpackage.xxz a = new defpackage.xxz();
    private static final long serialVersionUID = 1;

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.xyc
    protected final int a(java.lang.Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.xyc
    protected final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return obj.equals(obj2);
    }
}

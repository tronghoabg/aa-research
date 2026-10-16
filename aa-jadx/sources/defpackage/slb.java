package defpackage;

/* JADX INFO: loaded from: classes.dex */
abstract class slb extends defpackage.spe {
    private static final java.lang.ref.WeakReference a = new java.lang.ref.WeakReference(null);
    private java.lang.ref.WeakReference b;

    public slb(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.spe
    public final byte[] fw() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = (byte[]) this.b.get();
            if (bArrA == null) {
                bArrA = a();
                this.b = new java.lang.ref.WeakReference(bArrA);
            }
        }
        return bArrA;
    }
}

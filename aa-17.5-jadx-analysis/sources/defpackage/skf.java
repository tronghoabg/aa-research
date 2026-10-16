package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class skf extends soj {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public skf(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.soj
    public final byte[] go() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = (byte[]) this.b.get();
            if (bArrA == null) {
                bArrA = a();
                this.b = new WeakReference(bArrA);
            }
        }
        return bArrA;
    }
}

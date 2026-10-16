package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wd {
    public java.lang.Object a;

    public wd() {
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rmy] */
    public final void a(int i, int i2, int i3, int i4) {
        ?? r0 = this.a;
        if (r0 != 0) {
            try {
                r0.e(i, i2, i3, i4);
            } catch (android.os.RemoteException unused) {
                this.a = null;
            }
        }
    }

    public wd(defpackage.rmy rmyVar) {
        this.a = rmyVar;
    }

    public wd(byte[] bArr) {
    }
}

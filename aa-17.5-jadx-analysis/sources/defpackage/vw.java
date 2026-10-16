package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class vw {
    public Object a;

    public vw() {
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rmc] */
    public final void a(int i, int i2, int i3, int i4) {
        ?? r0 = this.a;
        if (r0 != 0) {
            try {
                r0.e(i, i2, i3, i4);
            } catch (RemoteException unused) {
                this.a = null;
            }
        }
    }

    public vw(rmc rmcVar) {
        this.a = rmcVar;
    }

    public vw(byte[] bArr) {
    }
}

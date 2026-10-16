package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ilc {
    public volatile defpackage.jcd a;
    public volatile defpackage.rxi b;
    public int[] c;
    public boolean d;
    final /* synthetic */ defpackage.ild e;
    private boolean f;

    public ilc(defpackage.ild ildVar) {
        this.e = ildVar;
    }

    private final void f() {
        while (this.d) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public final defpackage.abpy a(defpackage.xoz xozVar) {
        try {
            defpackage.jcd jcdVar = this.a;
            if (jcdVar != null) {
                return jcdVar.h(xozVar.A);
            }
            if (this.b == null) {
                return null;
            }
            synchronized (this) {
                f();
                if (this.b != null) {
                    return defpackage.jcd.i(xozVar, this.b.n(xozVar.A));
                }
                return a(xozVar);
            }
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    public final void b(int[] iArr) {
        this.f = true;
        for (int i : iArr) {
            if (i == 13) {
                this.f = false;
                break;
            }
        }
        if (this.f) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ild.a.f()).ai((char) 199)).u("No driving status, always restricted");
        }
        this.c = new int[iArr.length + (this.f ? 1 : 0)];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.c[i2] = defpackage.jex.a(iArr[i2]);
        }
        if (this.f) {
            int[] iArr2 = this.c;
            iArr2[iArr2.length - 1] = 11;
        }
        java.util.Arrays.sort(this.c);
    }

    public final boolean c() {
        try {
            defpackage.jcd jcdVar = this.a;
            if (jcdVar != null) {
                return jcdVar.a;
            }
            if (this.b == null) {
                return false;
            }
            synchronized (this) {
                f();
                if (this.b != null) {
                    return this.b.h();
                }
                return c();
            }
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean d(defpackage.xoz xozVar, long j) {
        if (this.f && xozVar == defpackage.xoz.SENSOR_DRIVING_STATUS_DATA) {
            return true;
        }
        try {
            defpackage.jcd jcdVar = this.a;
            if (jcdVar != null) {
                return jcdVar.s(xozVar, j);
            }
            if (this.b == null) {
                return false;
            }
            synchronized (this) {
                f();
                if (this.b != null) {
                    return this.b.fu(xozVar.A, j);
                }
                return d(xozVar, j);
            }
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public final int[] e() {
        int[] iArr = this.c;
        return iArr != null ? iArr : new int[]{11};
    }
}

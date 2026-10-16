package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class etb {
    public int c;
    public final android.content.Context d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public boolean i = false;
    public defpackage.est j;

    public etb(android.content.Context context) {
        this.d = context.getApplicationContext();
    }

    public static final java.lang.String q(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    @java.lang.Deprecated
    public void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        throw null;
    }

    public void k(java.lang.Object obj) {
        defpackage.est estVar = this.j;
        if (estVar != null) {
            if (defpackage.ess.d(2)) {
                java.util.Objects.toString(estVar);
                android.util.Log.v("LoaderManager", "onLoadComplete: ".concat(estVar.toString()));
            }
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                estVar.m(obj);
                return;
            }
            if (defpackage.ess.d(4)) {
                android.util.Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            estVar.j(obj);
        }
    }

    public final void o() {
        if (this.e) {
            g();
        } else {
            this.h = true;
        }
    }

    public final void p() {
        l();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    protected void g() {
    }

    public void h() {
    }

    protected void l() {
    }

    public void m() {
    }

    public void n() {
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lul {
    public defpackage.dur a;
    public android.graphics.Bitmap b;
    private java.lang.String c;
    private java.lang.String d;
    private defpackage.ygw e;
    private boolean f;
    private boolean g;
    private byte h;

    public final defpackage.lum a() {
        java.lang.String str;
        java.lang.String str2;
        defpackage.ygw ygwVar;
        if (this.h == 3 && (str = this.c) != null && (str2 = this.d) != null && (ygwVar = this.e) != null) {
            return new defpackage.lum(str, str2, this.a, ygwVar, this.b, this.f, this.g);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.d == null) {
            sb.append(" title");
        }
        if (this.e == null) {
            sb.append(" messages");
        }
        if ((this.h & 1) == 0) {
            sb.append(" isRead");
        }
        if ((this.h & 2) == 0) {
            sb.append(" isGroupConversation");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.c = str;
    }

    public final void c(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 2);
    }

    public final void d(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 1);
    }

    public final void e(defpackage.ygw ygwVar) {
        if (ygwVar == null) {
            throw new java.lang.NullPointerException("Null messages");
        }
        this.e = ygwVar;
    }

    public final void f(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null title");
        }
        this.d = str;
    }
}

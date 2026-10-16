package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class onw {
    public java.lang.String a;
    public java.lang.String b;
    public android.graphics.Bitmap c;
    public android.net.Uri d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.Integer g;
    private boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private boolean m;
    private int n;
    private java.lang.String o;
    private boolean p;
    private boolean q;
    private short r = 511;

    public onw(defpackage.onx onxVar) {
        this.h = onxVar.a;
        this.i = onxVar.b;
        this.j = onxVar.c;
        this.k = onxVar.d;
        this.a = onxVar.e;
        this.b = onxVar.f;
        this.l = onxVar.g;
        this.m = onxVar.h;
        this.c = onxVar.i;
        this.d = onxVar.j;
        this.n = onxVar.k;
        this.o = onxVar.l;
        this.e = onxVar.m;
        this.p = onxVar.n;
        this.f = onxVar.o;
        this.g = onxVar.p;
        this.q = onxVar.q;
    }

    public final defpackage.onx a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (this.r == 511 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.o) != null) {
            return new defpackage.onx(this.h, this.i, this.j, this.k, str, str2, this.l, this.m, this.c, this.d, this.n, str3, this.e, this.p, this.f, this.g, this.q);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.r & 1) == 0) {
            sb.append(" isMuted");
        }
        if ((this.r & 2) == 0) {
            sb.append(" audioRouteIconId");
        }
        if ((this.r & 4) == 0) {
            sb.append(" isOnHold");
        }
        if ((this.r & 8) == 0) {
            sb.append(" supportsOnHold");
        }
        if (this.a == null) {
            sb.append(" title");
        }
        if (this.b == null) {
            sb.append(" contactType");
        }
        if ((this.r & 16) == 0) {
            sb.append(" callStartTime");
        }
        if ((this.r & 32) == 0) {
            sb.append(" isCallTimerEnabled");
        }
        if ((this.r & 64) == 0) {
            sb.append(" callType");
        }
        if (this.o == null) {
            sb.append(" extraCallMessage");
        }
        if ((this.r & 128) == 0) {
            sb.append(" supportsMerge");
        }
        if ((this.r & 256) == 0) {
            sb.append(" supportsDialpad");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.i = i;
        this.r = (short) (this.r | 2);
    }

    public final void c(long j) {
        this.l = j;
        this.r = (short) (this.r | 16);
    }

    public final void d(int i) {
        this.n = i;
        this.r = (short) (this.r | 64);
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null extraCallMessage");
        }
        this.o = str;
    }

    public final void f(boolean z) {
        this.m = z;
        this.r = (short) (this.r | 32);
    }

    public final void g(boolean z) {
        this.h = z;
        this.r = (short) (this.r | 1);
    }

    public final void h(boolean z) {
        this.j = z;
        this.r = (short) (this.r | 4);
    }

    public final void i(boolean z) {
        this.q = z;
        this.r = (short) (this.r | 256);
    }

    public final void j(boolean z) {
        this.p = z;
        this.r = (short) (this.r | 128);
    }

    public final void k(boolean z) {
        this.k = z;
        this.r = (short) (this.r | 8);
    }
}

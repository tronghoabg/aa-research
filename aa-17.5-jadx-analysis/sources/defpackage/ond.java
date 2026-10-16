package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class ond {
    public String a;
    public String b;
    public Bitmap c;
    public Uri d;
    public String e;
    public String f;
    public Integer g;
    private boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private boolean m;
    private int n;
    private String o;
    private boolean p;
    private boolean q;
    private short r = 511;

    public ond(one oneVar) {
        this.h = oneVar.a;
        this.i = oneVar.b;
        this.j = oneVar.c;
        this.k = oneVar.d;
        this.a = oneVar.e;
        this.b = oneVar.f;
        this.l = oneVar.g;
        this.m = oneVar.h;
        this.c = oneVar.i;
        this.d = oneVar.j;
        this.n = oneVar.k;
        this.o = oneVar.l;
        this.e = oneVar.m;
        this.p = oneVar.n;
        this.f = oneVar.o;
        this.g = oneVar.p;
        this.q = oneVar.q;
    }

    public final one a() {
        String str;
        String str2;
        String str3;
        if (this.r == 511 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.o) != null) {
            return new one(this.h, this.i, this.j, this.k, str, str2, this.l, this.m, this.c, this.d, this.n, str3, this.e, this.p, this.f, this.g, this.q);
        }
        StringBuilder sb = new StringBuilder();
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
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
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

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null extraCallMessage");
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

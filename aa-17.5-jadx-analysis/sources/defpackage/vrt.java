package defpackage;

import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class vrt {
    public String a;
    public ajey b;
    public String c;
    public vyk d;
    public vtx e;
    public Predicate f;
    public vpn g;
    public int h;
    private boolean i;
    private ajgu j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private byte o;

    public final vru a() {
        ajgu ajguVar;
        Predicate predicate;
        if (this.o == 31 && (ajguVar = this.j) != null && (predicate = this.f) != null) {
            return new vru(this.a, this.i, ajguVar, this.b, this.c, this.d, this.k, this.h, this.e, this.l, this.m, predicate, this.g, this.n);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.o & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.j == null) {
            sb.append(" metric");
        }
        if ((this.o & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.o & 4) == 0) {
            sb.append(" shouldAttachActiveTraces");
        }
        if ((this.o & 8) == 0) {
            sb.append(" maxActiveTraces");
        }
        if (this.f == null) {
            sb.append(" activeTracePredicate");
        }
        if ((this.o & 16) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(int i) {
        this.n = i;
        this.o = (byte) (this.o | 16);
    }

    public final void d(boolean z) {
        this.i = z;
        this.o = (byte) (this.o | 1);
    }

    public final void e(boolean z) {
        this.k = z;
        this.o = (byte) (this.o | 2);
    }

    public final void f(int i) {
        this.m = i;
        this.o = (byte) (this.o | 8);
    }

    public final void g(ajgu ajguVar) {
        if (ajguVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.j = ajguVar;
    }

    public final void h(ajey ajeyVar) {
        this.b = ajeyVar;
    }

    public final void i(boolean z) {
        this.l = z;
        this.o = (byte) (this.o | 4);
    }
}

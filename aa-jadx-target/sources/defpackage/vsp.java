package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vsp {
    public java.lang.String a;
    public ajfx b;
    public java.lang.String c;
    public defpackage.vzf d;
    public vut e;
    public java.util.function.Predicate f;
    public vqj g;
    public int h;
    private boolean i;
    private ajht j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private byte o;

    public final defpackage.vsq a() {
        ajht ajhtVar;
        java.util.function.Predicate predicate;
        if (this.o == 31 && (ajhtVar = this.j) != null && (predicate = this.f) != null) {
            return new defpackage.vsq(this.a, this.i, ajhtVar, this.b, this.c, this.d, this.k, this.h, this.e, this.l, this.m, predicate, this.g, this.n);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
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

    public final void g(ajht ajhtVar) {
        if (ajhtVar == null) {
            throw new java.lang.NullPointerException("Null metric");
        }
        this.j = ajhtVar;
    }

    public final void h(ajfx ajfxVar) {
        this.b = ajfxVar;
    }

    public final void i(boolean z) {
        this.l = z;
        this.o = (byte) (this.o | 4);
    }
}

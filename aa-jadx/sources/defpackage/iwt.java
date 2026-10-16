package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iwt {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private byte f;

    public final defpackage.iwu a() {
        if (this.f == 31) {
            return new defpackage.iwu(this.a, this.b, this.c, this.d, this.e);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" displayLeft");
        }
        if ((this.f & 2) == 0) {
            sb.append(" displayTop");
        }
        if ((this.f & 4) == 0) {
            sb.append(" displayWidth");
        }
        if ((this.f & 8) == 0) {
            sb.append(" displayHeight");
        }
        if ((this.f & 16) == 0) {
            sb.append(" roiQpOffset");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.f = (byte) (this.f | 8);
    }

    public final void c(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }

    public final void d(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    public final void e(int i) {
        this.c = i;
        this.f = (byte) (this.f | 4);
    }

    public final void f(int i) {
        this.e = i;
        this.f = (byte) (this.f | 16);
    }
}

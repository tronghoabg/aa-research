package defpackage;

/* loaded from: classes2.dex */
public final class ryu {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private byte f;

    public final ryv a() {
        if (this.f == 31) {
            return new ryv(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" connected");
        }
        if ((this.f & 2) == 0) {
            sb.append(" currentDataRole");
        }
        if ((this.f & 4) == 0) {
            sb.append(" currentPowerRole");
        }
        if ((this.f & 8) == 0) {
            sb.append(" supportedRoleCombinations");
        }
        if ((this.f & 16) == 0) {
            sb.append(" currentMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.f = (byte) (this.f | 1);
    }

    public final void c(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    public final void d(int i) {
        this.e = i;
        this.f = (byte) (this.f | 16);
    }

    public final void e(int i) {
        this.c = i;
        this.f = (byte) (this.f | 4);
    }

    public final void f(int i) {
        this.d = i;
        this.f = (byte) (this.f | 8);
    }
}

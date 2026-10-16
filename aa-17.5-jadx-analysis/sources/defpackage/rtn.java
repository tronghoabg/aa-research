package defpackage;

/* loaded from: classes2.dex */
public final class rtn {
    private int a;
    private int b;
    private boolean c;
    private boolean d;
    private int e;
    private byte f;

    public final rto a() {
        if (this.f == 31) {
            rto rtoVar = new rto(this.a, this.b, this.c, this.d, this.e);
            int i = rtoVar.a;
            if (i < 263 || i > 65539) {
                throw new IllegalArgumentException("Maximum frame size cannot be smaller than 263 or larger than 655354");
            }
            return rtoVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" fragmentSize");
        }
        if ((this.f & 2) == 0) {
            sb.append(" bufferedStreamSize");
        }
        if ((this.f & 4) == 0) {
            sb.append(" useConcurrentChannelMap");
        }
        if ((this.f & 8) == 0) {
            sb.append(" isQoSEnabled");
        }
        if ((this.f & 16) == 0) {
            sb.append(" connectionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    public final void c(int i) {
        this.e = i;
        this.f = (byte) (this.f | 16);
    }

    public final void d(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }

    public final void e(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 8);
    }

    public final void f(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 4);
    }
}

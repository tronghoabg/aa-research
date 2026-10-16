package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rug {
    public int a;
    public byte b;
    private int c;
    private boolean d;
    private boolean e;
    private int f;

    public final defpackage.ruh a() {
        if (this.b == 31) {
            defpackage.ruh ruhVar = new defpackage.ruh(this.a, this.c, this.d, this.e, this.f);
            if (ruhVar.a >= 263) {
                return ruhVar;
            }
            throw new java.lang.IllegalArgumentException("Maximum frame size cannot be smaller than 263 or larger than 655354");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" fragmentSize");
        }
        if ((this.b & 2) == 0) {
            sb.append(" bufferedStreamSize");
        }
        if ((this.b & 4) == 0) {
            sb.append(" useConcurrentChannelMap");
        }
        if ((this.b & 8) == 0) {
            sb.append(" isQoSEnabled");
        }
        if ((this.b & 16) == 0) {
            sb.append(" connectionType");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.c = i;
        this.b = (byte) (this.b | 2);
    }

    public final void c(int i) {
        this.f = i;
        this.b = (byte) (this.b | 16);
    }

    public final void d(boolean z) {
        this.e = z;
        this.b = (byte) (this.b | 8);
    }

    public final void e(boolean z) {
        this.d = z;
        this.b = (byte) (this.b | 4);
    }
}

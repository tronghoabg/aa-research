package defpackage;

/* loaded from: classes.dex */
public final class iqq {
    private long a;
    private long b;
    private long c;
    private long d;
    private byte e;

    public final ips a() {
        if (this.e == 15) {
            return new ips(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" maxAudioBufferMs");
        }
        if ((this.e & 2) == 0) {
            sb.append(" targetBufferAfterMaxBufferReachedMs");
        }
        if ((this.e & 4) == 0) {
            sb.append(" maxHuAudioBufferMs");
        }
        if ((this.e & 8) == 0) {
            sb.append(" targetHuBufferAfterMaxHuBufferReachedMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.a = j;
        this.e = (byte) (this.e | 1);
    }

    public final void c(long j) {
        this.c = j;
        this.e = (byte) (this.e | 4);
    }

    public final void d(long j) {
        this.b = j;
        this.e = (byte) (this.e | 2);
    }

    public final void e(long j) {
        this.d = j;
        this.e = (byte) (this.e | 8);
    }
}

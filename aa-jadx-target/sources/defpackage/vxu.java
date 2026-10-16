package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxu {
    public int a;
    public defpackage.xyn b = defpackage.xxe.a;
    public byte c;
    public int d;
    private float e;

    public final defpackage.vxv a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            defpackage.vxv vxvVar = new defpackage.vxv(i, this.a, this.e, this.b);
            float f = vxvVar.a;
            defpackage.ysr.bk(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
            return vxvVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(float f) {
        this.e = f;
        this.c = (byte) (this.c | 2);
    }
}

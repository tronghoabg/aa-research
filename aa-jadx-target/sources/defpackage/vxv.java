package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxv implements defpackage.vrp {
    public final float a;
    public final defpackage.xyn b;
    private final int c;
    private final int d;

    public vxv(int i, int i2, float f, defpackage.xyn xynVar) {
        this.d = i;
        this.c = i2;
        this.a = f;
        this.b = xynVar;
    }

    public static final defpackage.vxu d() {
        defpackage.vxu vxuVar = new defpackage.vxu();
        vxuVar.a = 10;
        vxuVar.c = (byte) (vxuVar.c | 1);
        vxuVar.b(1.0f);
        vxuVar.b = defpackage.xxe.a;
        vxuVar.d = 1;
        return vxuVar;
    }

    @Override // defpackage.vrp
    public final int a() {
        return this.c;
    }

    @Override // defpackage.vrp
    public final /* synthetic */ defpackage.afak b() {
        return null;
    }

    @Override // defpackage.vrp
    public final boolean c() {
        return this.d == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.vxv)) {
            return false;
        }
        defpackage.vxv vxvVar = (defpackage.vxv) obj;
        int i = this.d;
        int i2 = vxvVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.c == vxvVar.c) {
            if (java.lang.Float.floatToIntBits(this.a) == java.lang.Float.floatToIntBits(vxvVar.a) && this.b.equals(vxvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        defpackage.a.aI(i);
        float f = this.a;
        return ((((this.c ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ java.lang.Float.floatToIntBits(f)) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        return "TimerConfigurations{enablement=" + defpackage.vrq.a(this.d) + ", rateLimitPerSecond=" + this.c + ", samplingProbability=" + this.a + ", perEventConfigurationFlags=" + java.lang.String.valueOf(this.b) + "}";
    }

    public vxv() {
        throw null;
    }
}

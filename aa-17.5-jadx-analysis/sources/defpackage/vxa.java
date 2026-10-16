package defpackage;

/* loaded from: classes.dex */
public final class vxa implements vqu {
    public final float a;
    public final xxh b;
    private final int c;
    private final int d;

    public vxa(int i, int i2, float f, xxh xxhVar) {
        this.d = i;
        this.c = i2;
        this.a = f;
        this.b = xxhVar;
    }

    public static final vwz d() {
        vwz vwzVar = new vwz();
        vwzVar.a = 10;
        vwzVar.c = (byte) (vwzVar.c | 1);
        vwzVar.b(1.0f);
        vwzVar.b = xvy.a;
        vwzVar.d = 1;
        return vwzVar;
    }

    @Override // defpackage.vqu
    public final int a() {
        return this.c;
    }

    @Override // defpackage.vqu
    public final /* synthetic */ aezk b() {
        return null;
    }

    @Override // defpackage.vqu
    public final boolean c() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vxa)) {
            return false;
        }
        vxa vxaVar = (vxa) obj;
        int i = this.d;
        int i2 = vxaVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.c == vxaVar.c) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(vxaVar.a) && this.b.equals(vxaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.aJ(i);
        float f = this.a;
        return ((((this.c ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ Float.floatToIntBits(f)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + vqv.a(this.d) + ", rateLimitPerSecond=" + this.c + ", samplingProbability=" + this.a + ", perEventConfigurationFlags=" + String.valueOf(this.b) + "}";
    }

    public vxa() {
        throw null;
    }
}

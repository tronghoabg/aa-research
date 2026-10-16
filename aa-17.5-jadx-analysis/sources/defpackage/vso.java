package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class vso implements vqu {
    public final float a;
    public final int b;
    public final xxh c;
    private final aezk d;
    private final int e;

    public vso(int i, float f, int i2, aezk aezkVar, xxh xxhVar) {
        this.e = i;
        this.a = f;
        this.b = i2;
        this.d = aezkVar;
        this.c = xxhVar;
    }

    public static final vsn d() {
        vsn vsnVar = new vsn();
        vsnVar.a = 100.0f;
        vsnVar.c = (byte) (vsnVar.c | 1);
        vsnVar.d = 1;
        vsnVar.b(100);
        return vsnVar;
    }

    @Override // defpackage.vqu
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.vqu
    public final aezk b() {
        return this.d;
    }

    @Override // defpackage.vqu
    public final boolean c() {
        int i = this.e;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        aezk aezkVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vso)) {
            return false;
        }
        vso vsoVar = (vso) obj;
        int i = this.e;
        int i2 = vsoVar.e;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(vsoVar.a) && this.b == vsoVar.b && ((aezkVar = this.d) != null ? aezkVar.equals(vsoVar.d) : vsoVar.d == null) && this.c.equals(vsoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        a.aJ(i);
        int iFloatToIntBits = ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
        aezk aezkVar = this.d;
        return ((((this.b ^ (iFloatToIntBits * 1000003)) * 1000003) ^ (aezkVar == null ? 0 : aezkVar.hashCode())) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        xxh xxhVar = this.c;
        return "CrashConfigurations{enablement=" + vqv.a(this.e) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=" + String.valueOf(this.d) + ", crashLoopListener=" + String.valueOf(xxhVar) + "}";
    }

    public vso() {
        throw null;
    }
}

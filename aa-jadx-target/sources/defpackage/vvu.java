package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vvu implements defpackage.vrp {
    public final int a;
    public final defpackage.xyn b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public vvu(int i, int i2, defpackage.xyn xynVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.g = i;
        this.a = i2;
        this.b = xynVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public static defpackage.vvt d() {
        defpackage.vvt vvtVar = new defpackage.vvt();
        vvtVar.a = 3;
        vvtVar.d = (byte) (3 | vvtVar.d);
        vvtVar.b = defpackage.xxe.a;
        vvtVar.b(false);
        vvtVar.c = true;
        vvtVar.d = (byte) (vvtVar.d | 24);
        vvtVar.e = 1;
        vvtVar.d(false);
        vvtVar.c(false);
        return vvtVar;
    }

    @Override // defpackage.vrp
    public final int a() {
        return this.a;
    }

    @Override // defpackage.vrp
    public final /* synthetic */ defpackage.afak b() {
        return null;
    }

    @Override // defpackage.vrp
    public final boolean c() {
        return this.g != 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.vvu)) {
            return false;
        }
        defpackage.vvu vvuVar = (defpackage.vvu) obj;
        int i = this.g;
        int i2 = vvuVar.g;
        if (i != 0) {
            return i == i2 && this.a == vvuVar.a && this.b.equals(vvuVar.b) && this.c == vvuVar.c && this.d == vvuVar.d && this.e == vvuVar.e && this.f == vvuVar.f;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.g;
        defpackage.a.aI(i);
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "MemoryConfigurations{enablement=" + defpackage.vrq.a(this.g) + ", rateLimitPerSecond=" + this.a + ", recordMetricPerProcess=false, metricExtensionProvider=" + java.lang.String.valueOf(this.b) + ", forceGcBeforeRecordMemory=" + this.c + ", captureDebugMetrics=false, captureMemoryInfo=" + this.d + ", recordMemoryPeriodically=" + this.e + ", randomizePeriodicMemoryMetricStartTime=" + this.f + "}";
    }

    public vvu() {
        throw null;
    }
}

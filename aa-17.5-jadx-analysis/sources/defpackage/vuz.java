package defpackage;

/* loaded from: classes.dex */
public final class vuz implements vqu {
    public final int a;
    public final xxh b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public vuz(int i, int i2, xxh xxhVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.g = i;
        this.a = i2;
        this.b = xxhVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public static vuy d() {
        vuy vuyVar = new vuy();
        vuyVar.a = 3;
        vuyVar.d = (byte) (3 | vuyVar.d);
        vuyVar.b = xvy.a;
        vuyVar.b(false);
        vuyVar.c = true;
        vuyVar.d = (byte) (vuyVar.d | 24);
        vuyVar.e = 1;
        vuyVar.d(false);
        vuyVar.c(false);
        return vuyVar;
    }

    @Override // defpackage.vqu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.vqu
    public final /* synthetic */ aezk b() {
        return null;
    }

    @Override // defpackage.vqu
    public final boolean c() {
        return this.g != 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vuz)) {
            return false;
        }
        vuz vuzVar = (vuz) obj;
        int i = this.g;
        int i2 = vuzVar.g;
        if (i != 0) {
            return i == i2 && this.a == vuzVar.a && this.b.equals(vuzVar.b) && this.c == vuzVar.c && this.d == vuzVar.d && this.e == vuzVar.e && this.f == vuzVar.f;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.g;
        a.aJ(i);
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + vqv.a(this.g) + ", rateLimitPerSecond=" + this.a + ", recordMetricPerProcess=false, metricExtensionProvider=" + String.valueOf(this.b) + ", forceGcBeforeRecordMemory=" + this.c + ", captureDebugMetrics=false, captureMemoryInfo=" + this.d + ", recordMemoryPeriodically=" + this.e + ", randomizePeriodicMemoryMetricStartTime=" + this.f + "}";
    }

    public vuz() {
        throw null;
    }
}

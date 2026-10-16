package defpackage;

/* loaded from: classes3.dex */
public final class vxl implements vqu {
    private final int a;
    private final int b;
    private final vuf c;

    public vxl(vuf vufVar) {
        this.b = 2;
        this.a = 10;
        this.c = vufVar;
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vxl)) {
            return false;
        }
        vxl vxlVar = (vxl) obj;
        int i = this.b;
        int i2 = vxlVar.b;
        if (i != 0) {
            return i == i2 && this.a == vxlVar.a && this.c.equals(vxlVar.c);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aJ(i);
        vuf vufVar = this.c;
        return ((((((this.a ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ vufVar.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + vqv.a(this.b) + ", rateLimitPerSecond=" + this.a + ", dynamicSampler=" + String.valueOf(this.c) + ", recordTimerDuration=false, sendEmptyTraces=false}";
    }

    public vxl() {
        throw null;
    }
}

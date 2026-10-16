package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vxj implements defpackage.vrp {
    public final defpackage.xyn a;
    private final int b;

    public vxj(int i, defpackage.xyn xynVar) {
        this.b = i;
        this.a = xynVar;
    }

    public static final defpackage.vxi d() {
        defpackage.vxi vxiVar = new defpackage.vxi();
        vxiVar.b = (byte) 1;
        vxiVar.a = defpackage.xxe.a;
        vxiVar.c = 1;
        return vxiVar;
    }

    @Override // defpackage.vrp
    public final /* synthetic */ int a() {
        return androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.vrp
    public final defpackage.afak b() {
        return null;
    }

    @Override // defpackage.vrp
    public final boolean c() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.vxj)) {
            return false;
        }
        defpackage.vxj vxjVar = (defpackage.vxj) obj;
        int i = this.b;
        int i2 = vxjVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(vxjVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        defpackage.a.aI(i);
        return (((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final java.lang.String toString() {
        return "StorageConfigurations{enablement=" + defpackage.vrq.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + java.lang.String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    public vxj() {
        throw null;
    }
}

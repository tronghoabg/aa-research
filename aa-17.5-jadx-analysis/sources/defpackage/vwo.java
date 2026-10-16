package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class vwo implements vqu {
    public final xxh a;
    private final int b;

    public vwo(int i, xxh xxhVar) {
        this.b = i;
        this.a = xxhVar;
    }

    public static final vwn d() {
        vwn vwnVar = new vwn();
        vwnVar.b = (byte) 1;
        vwnVar.a = xvy.a;
        vwnVar.c = 1;
        return vwnVar;
    }

    @Override // defpackage.vqu
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.vqu
    public final aezk b() {
        return null;
    }

    @Override // defpackage.vqu
    public final boolean c() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vwo)) {
            return false;
        }
        vwo vwoVar = (vwo) obj;
        int i = this.b;
        int i2 = vwoVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(vwoVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aJ(i);
        return (((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + vqv.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    public vwo() {
        throw null;
    }
}

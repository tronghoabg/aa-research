package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes3.dex */
public final class vqx implements vqu {
    private final int a;
    private final vuf b;

    public vqx(vuf vufVar) {
        this.a = 2;
        this.b = vufVar;
    }

    @Override // defpackage.vqu
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
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
        if (!(obj instanceof vqx)) {
            return false;
        }
        vqx vqxVar = (vqx) obj;
        int i = this.a;
        int i2 = vqxVar.a;
        if (i != 0) {
            return i == i2 && this.b.equals(vqxVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.aJ(i);
        return this.b.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + vqv.a(this.a) + ", chargeCounterEnabled=false, metricExtensionProvider=" + String.valueOf(this.b) + "}";
    }

    public vqx() {
        throw null;
    }
}

package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes3.dex */
public final class vwg implements vqu {
    private final xxh a;
    private final xxh b;
    private final int c;

    public vwg(xxh xxhVar, xxh xxhVar2) {
        this.c = 1;
        this.a = xxhVar;
        this.b = xxhVar2;
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
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vwg)) {
            return false;
        }
        vwg vwgVar = (vwg) obj;
        int i = this.c;
        int i2 = vwgVar.c;
        if (i != 0) {
            return i2 == 1 && this.a.equals(vwgVar.a) && this.b.equals(vwgVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        a.aJ(this.c);
        return 395873938;
    }

    public final String toString() {
        xxh xxhVar = this.b;
        return "StartupConfigurations{enablement=" + vqv.a(this.c) + ", metricExtensionProvider=" + String.valueOf(this.a) + ", customTimestampProvider=" + String.valueOf(xxhVar) + "}";
    }

    public vwg() {
        throw null;
    }
}

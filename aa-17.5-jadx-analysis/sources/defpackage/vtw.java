package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes3.dex */
public final class vtw implements vqu {
    private final int a;

    public vtw(byte[] bArr) {
        this.a = 2;
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
        if (!(obj instanceof vtw)) {
            return false;
        }
        int i = this.a;
        int i2 = ((vtw) obj).a;
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.aJ(i);
        return i ^ (-721379959);
    }

    public final String toString() {
        return "CuiConfigurations{metricExtensionProvider=null, enablement=" + vqv.a(this.a) + "}";
    }

    public vtw() {
        throw null;
    }
}

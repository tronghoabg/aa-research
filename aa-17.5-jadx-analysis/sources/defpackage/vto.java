package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class vto implements vqu {
    public final String a;
    private final int b;

    public vto(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static final vtn d() {
        vtn vtnVar = new vtn();
        vtnVar.a = 1;
        vtnVar.b = "";
        return vtnVar;
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
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vto)) {
            return false;
        }
        vto vtoVar = (vto) obj;
        int i = this.b;
        int i2 = vtoVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(vtoVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aJ(i);
        return (this.a.hashCode() ^ ((i ^ 1000003) * 1000003)) * 1000003;
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + vqv.a(this.b) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    public vto() {
        throw null;
    }
}

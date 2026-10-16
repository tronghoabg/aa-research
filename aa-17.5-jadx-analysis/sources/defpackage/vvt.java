package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class vvt implements vqu {
    public final int a;
    public final boolean b;
    public final xxh c;
    public final yfq d;
    private final int e;

    public vvt(int i, int i2, boolean z, xxh xxhVar, yfq yfqVar) {
        this.e = i;
        this.a = i2;
        this.b = z;
        this.c = xxhVar;
        this.d = yfqVar;
    }

    public static final vvs d() {
        vvs vvsVar = new vvs();
        vvsVar.b(false);
        vvsVar.a = 50;
        vvsVar.c = (byte) (vvsVar.c | 1);
        vvsVar.b = xvy.a;
        vvsVar.d = 1;
        return vvsVar;
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
        return this.e == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vvt)) {
            return false;
        }
        vvt vvtVar = (vvt) obj;
        int i = this.e;
        int i2 = vvtVar.e;
        if (i != 0) {
            return i == i2 && this.a == vvtVar.a && this.b == vvtVar.b && this.c.equals(vvtVar.c) && yrm.W(this.d, vvtVar.d);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.e;
        a.aJ(i);
        return this.d.hashCode() ^ ((((((((i ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003);
    }

    public final String toString() {
        yfq yfqVar = this.d;
        return "NetworkConfigurations{enablement=" + vqv.a(this.e) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=" + this.b + ", metricExtensionProvider=" + String.valueOf(this.c) + ", customDomainAllowlist=" + String.valueOf(yfqVar) + "}";
    }

    public vvt() {
        throw null;
    }
}

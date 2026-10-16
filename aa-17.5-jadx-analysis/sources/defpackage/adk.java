package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class adk implements aey {
    private final act a;

    public adk(dlg dlgVar) {
        this.a = new act(adl.a, dlgVar);
    }

    @Override // defpackage.aey
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aey
    public final float b(float f, float f2) {
        double dA = this.a.a(f2);
        double d = acu.a;
        return f + (((float) (r6.a * r6.b * Math.exp((d / ((-1.0d) + d)) * dA))) * Math.signum(f2));
    }

    @Override // defpackage.aey
    public final float c(long j, float f, float f2) {
        acs acsVarB = this.a.b(f2);
        long j2 = acsVarB.c;
        float f3 = j2 > 0 ? (j / 1000000) / j2 : 1.0f;
        float fSignum = acsVarB.b * Math.signum(acsVarB.a);
        int i = abb.a;
        return f + (fSignum * abb.a(f3).a);
    }

    @Override // defpackage.aey
    public final long d(float f) {
        return ((long) (Math.exp(this.a.a(f) / (acu.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.aey
    public final float e(long j, float f) {
        acs acsVarB = this.a.b(f);
        long j2 = acsVarB.c;
        float f2 = j2;
        float f3 = j2 > 0 ? (j / 1000000) / f2 : 1.0f;
        int i = abb.a;
        return (((abb.a(f3).b * Math.signum(acsVarB.a)) * acsVarB.b) / f2) * 1000.0f;
    }
}

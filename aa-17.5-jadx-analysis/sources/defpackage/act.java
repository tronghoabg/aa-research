package defpackage;

/* loaded from: classes.dex */
public final class act {
    public final float a;
    public final float b;
    private final dlg c;

    public act(float f, dlg dlgVar) {
        this.a = f;
        this.c = dlgVar;
        float fA = dlgVar.a();
        float f2 = acu.a;
        this.b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        int i = abb.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    public final acs b(float f) {
        double dA = a(f);
        double d = acu.a;
        double d2 = (-1.0d) + d;
        return new acs(f, (float) (this.a * this.b * Math.exp((d / d2) * dA)), (long) (Math.exp(dA / d2) * 1000.0d));
    }
}

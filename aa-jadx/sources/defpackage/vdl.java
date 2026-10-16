package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vdl extends defpackage.vdm {
    public boolean a;

    public vdl() {
        super(80.0f);
        this.a = true;
    }

    private static final float f(float f) {
        float f2 = f % 6.2831855f;
        return f2 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? f2 + 6.2831855f : f2;
    }

    @Override // defpackage.vdm
    protected final float a() {
        float fA = super.a();
        if (java.lang.Math.abs(fA) < 0.3926991f) {
            return fA;
        }
        float f = 6.2831855f + fA;
        if (java.lang.Math.abs(f) >= 0.3926991f) {
            if (!this.a) {
                return fA > 0.3926991f ? fA - 6.2831855f : fA;
            }
            if (fA >= -0.3926991f) {
                return fA;
            }
        }
        return f;
    }

    @Override // defpackage.vdm
    public final void b(float f) {
        super.b(f(f));
    }

    @Override // defpackage.vdm
    public final void c(float f, float f2) {
        super.c(f, f2);
        this.c = f(this.c);
    }
}

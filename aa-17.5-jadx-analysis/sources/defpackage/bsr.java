package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bsr extends bsm {
    public afdr k;
    public afec l;
    public float m;
    public final cgy n;
    private final float[] o;

    public bsr(afdr afdrVar, afec afecVar, float f, long j, long j2, cmg cmgVar, cmg cmgVar2, float f2, float f3) {
        super(j, j2, cmgVar, cmgVar2, f2, f3, BitmapDescriptorFactory.HUE_RED);
        this.k = afdrVar;
        this.l = afecVar;
        this.m = f;
        this.o = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        cgy cgyVarS = bxc.s(new bml(this, 16));
        W(cgyVarS);
        this.n = cgyVarS;
    }

    @Override // defpackage.bsm
    protected final void b() {
        cjn.w(this.n);
    }

    @Override // defpackage.bsm
    protected final void d() {
        this.n.d();
    }

    public final float[] h() {
        float[] fArr = this.o;
        float f = BitmapDescriptorFactory.HUE_RED;
        fArr[0] = 0.0f;
        float fFloatValue = ((Number) this.k.invoke()).floatValue();
        if (fFloatValue >= BitmapDescriptorFactory.HUE_RED) {
            f = fFloatValue;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[1] = f;
        return fArr;
    }
}

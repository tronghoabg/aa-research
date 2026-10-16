package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bsx extends bsm {
    private final cgy D;
    public afdr k;
    public afdr l;
    public afdr m;
    public afdr n;
    public float o;
    public final float[] p;

    public bsx(afdr afdrVar, afdr afdrVar2, afdr afdrVar3, afdr afdrVar4, float f, long j, long j2, cmg cmgVar, cmg cmgVar2, float f2, float f3, float f4) {
        super(j, j2, cmgVar, cmgVar2, f2, f3, f4);
        this.k = afdrVar;
        this.l = afdrVar2;
        this.m = afdrVar3;
        this.n = afdrVar4;
        f = f < BitmapDescriptorFactory.HUE_RED ? 0.0f : f;
        this.o = f > 1.0f ? 1.0f : f;
        this.p = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        cgy cgyVarS = bxc.s(new bml(this, 18));
        W(cgyVarS);
        this.D = cgyVarS;
    }

    @Override // defpackage.bsm
    protected final void b() {
        cjn.w(this.D);
    }

    @Override // defpackage.bsm
    protected final void d() {
        this.D.d();
    }
}

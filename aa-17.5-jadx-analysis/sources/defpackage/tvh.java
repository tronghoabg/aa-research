package defpackage;

/* loaded from: classes3.dex */
public final class tvh extends tvd {
    public tvh(tuy tuyVar, float f, float f2) {
        super(2, tuyVar, f, f2);
        this.f = 0.05f;
        this.g = (float) Math.tan(Math.toRadians(20.0d));
    }

    @Override // defpackage.tur
    protected final void b(tvc tvcVar) {
        this.a.m(tvcVar);
    }

    @Override // defpackage.tur
    protected final boolean c(tvc tvcVar) {
        return this.a.u(tvcVar);
    }

    @Override // defpackage.tur
    public final /* bridge */ /* synthetic */ boolean d() {
        return true;
    }

    @Override // defpackage.tur
    protected final boolean g(tvc tvcVar) {
        return this.a.t(tvcVar);
    }

    @Override // defpackage.tvd
    protected final float i(float f) {
        return Math.min(Math.abs(f), (float) Math.abs(Math.abs(f) - 3.141592653589793d));
    }

    @Override // defpackage.tvd
    protected final float j(tuw tuwVar, int i) {
        return tuwVar.c(i);
    }

    @Override // defpackage.tvd
    protected final float k(tuw tuwVar, int i) {
        return tuwVar.b(i);
    }
}

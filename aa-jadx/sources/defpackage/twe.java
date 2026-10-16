package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class twe extends defpackage.twa {
    public twe(defpackage.tvv tvvVar, float f, float f2) {
        super(2, tvvVar, f, f2);
        this.f = 0.05f;
        this.g = 0.36397022f;
    }

    @Override // defpackage.tvo
    protected final void b(defpackage.tvz tvzVar) {
        this.a.m(tvzVar);
    }

    @Override // defpackage.tvo
    protected final boolean c(defpackage.tvz tvzVar) {
        return this.a.u(tvzVar);
    }

    @Override // defpackage.tvo
    public final /* bridge */ /* synthetic */ boolean d() {
        return true;
    }

    @Override // defpackage.tvo
    protected final boolean g(defpackage.tvz tvzVar) {
        return this.a.t(tvzVar);
    }

    @Override // defpackage.twa
    protected final float i(float f) {
        return java.lang.Math.min(java.lang.Math.abs(f), (float) java.lang.Math.abs(((double) java.lang.Math.abs(f)) - 3.141592653589793d));
    }

    @Override // defpackage.twa
    protected final float j(defpackage.tvt tvtVar, int i) {
        return tvtVar.c(i);
    }

    @Override // defpackage.twa
    protected final float k(defpackage.tvt tvtVar, int i) {
        return tvtVar.b(i);
    }
}

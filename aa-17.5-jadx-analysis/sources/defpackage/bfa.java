package defpackage;

/* loaded from: classes.dex */
public final class bfa implements aqf {
    private final /* synthetic */ aqf a;
    private final bym b;
    private final bym c;

    public bfa(aqf aqfVar, bfb bfbVar) {
        this.a = aqfVar;
        beg begVar = new beg(bfbVar, 3);
        lah lahVar = byj.a;
        this.b = new bvk(begVar, null);
        this.c = new bvk(new beg(bfbVar, 4), null);
    }

    @Override // defpackage.aqf
    public final float a(float f) {
        return this.a.a(f);
    }

    @Override // defpackage.aqf
    public final Object e(akq akqVar, afeg afegVar, afck afckVar) {
        return this.a.e(akqVar, afegVar, afckVar);
    }

    @Override // defpackage.aqf
    public final boolean g() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean h() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean i() {
        return this.a.i();
    }
}

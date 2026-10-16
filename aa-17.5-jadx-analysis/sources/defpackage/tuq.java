package defpackage;

/* loaded from: classes3.dex */
public final class tuq implements uda {
    private final ucz a;

    public tuq(ucz uczVar) {
        this.a = uczVar;
    }

    @Override // defpackage.uda
    public final abgl a() {
        return null;
    }

    @Override // defpackage.uda
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.uda
    public final void e(rfe rfeVar) {
        rfeVar.d.add(this.a);
    }

    @Override // defpackage.uda
    public final void gr(ucf ucfVar) {
        rfe rfeVar = new rfe(null, null);
        e(rfeVar);
        ucfVar.w(new rdz(this, ucfVar, rfeVar, 7, (byte[]) null));
    }

    @Override // defpackage.uda
    public final void c(ucf ucfVar) {
    }
}

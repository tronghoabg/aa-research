package defpackage;

/* loaded from: classes.dex */
public final class axd extends ayx implements axl {
    public final bwd a = new bwd();

    public axd(afec afecVar) {
        afecVar.invoke(this);
    }

    @Override // defpackage.axl
    public final void a(int i, afec afecVar, afec afecVar2, afei afeiVar) {
        this.a.a(i, new axc(afecVar, afecVar2, afeiVar));
    }

    @Override // defpackage.axl
    public final void b(Object obj, afeh afehVar) {
        this.a.a(1, new axc(obj != null ? new aui(obj, 10) : null, new awf(4), new cct(-857469575, true, new deo(afehVar, 1))));
    }

    @Override // defpackage.ayx
    public final /* synthetic */ bwd c() {
        return this.a;
    }
}

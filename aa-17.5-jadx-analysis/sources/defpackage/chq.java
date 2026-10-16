package defpackage;

/* loaded from: classes.dex */
final class chq extends cfx implements chu {
    public afec a;
    private cis b;

    public chq(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.chu
    public final void eu(cis cisVar) {
        if (affa.f(this.b, cisVar)) {
            return;
        }
        this.b = cisVar;
        this.a.invoke(cisVar);
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class bbd extends ayx {
    public final bwd a;
    private final afei b;
    private final afec c;

    public bbd(afei afeiVar, afec afecVar, int i) {
        this.b = afeiVar;
        this.c = afecVar;
        bwd bwdVar = new bwd();
        bwdVar.a(i, new bba(afecVar, afeiVar));
        this.a = bwdVar;
    }

    @Override // defpackage.ayx
    public final bwd c() {
        return this.a;
    }
}

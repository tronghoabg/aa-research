package defpackage;

/* loaded from: classes3.dex */
public final class ttt extends ttw {
    private ttv a;

    public ttt(ukz ukzVar) {
        super(wub.L(new qfe(ukzVar, 7)));
    }

    @Override // defpackage.ttw, defpackage.ttx
    public final synchronized ttv a(abgl abglVar, int i, boolean z, xxh xxhVar) {
        ttv ttvVarA;
        ttvVarA = this.a;
        if (ttvVarA == null) {
            ttvVarA = super.a(abglVar, i, z, xxhVar);
            this.a = ttvVarA;
        }
        return ttvVarA;
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class uef implements uiv {
    final /* synthetic */ ueg a;
    private final abjr b;

    public uef(ueg uegVar, abjr abjrVar) {
        this.a = uegVar;
        this.b = abjrVar;
    }

    @Override // defpackage.uiv
    public final void H(wnq wnqVar) {
        byte[] bArrF = ueg.b;
        if (wnqVar != null) {
            bArrF = ((ukh) wnqVar.c).f();
        }
        this.a.d.g(this.b.d, bArrF);
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class buy implements bxg {
    final /* synthetic */ bwl a;
    final /* synthetic */ bvd b;

    public buy(bvd bvdVar, bwl bwlVar) {
        this.b = bvdVar;
        this.a = bwlVar;
    }

    @Override // defpackage.bxg
    public final int c(bxf bxfVar, Object obj) {
        bvd bvdVar = this.b;
        if (true != (bvdVar instanceof bxg)) {
            bvdVar = null;
        }
        int iC = bvdVar != null ? bvdVar.c(bxfVar, obj) : 1;
        if (iC != 1) {
            return iC;
        }
        bwl bwlVar = this.a;
        bwlVar.d = woy.bZ(bwlVar.d, new aezu(bxfVar, obj));
        return 2;
    }

    @Override // defpackage.bxg
    public final void b() {
    }

    @Override // defpackage.bxg
    public final void a(Object obj) {
    }
}

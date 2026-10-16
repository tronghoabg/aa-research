package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes2.dex */
public final class gix implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gix(bym bymVar, bwq bwqVar, int i) {
        this.c = i;
        this.b = bymVar;
        this.a = bwqVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [asf, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck afckVar) {
        int i = this.c;
        byte[] bArr = null;
        if (i == 0) {
            return aqx.e(cqzVar, new giw(this.a, null), new fzl(this.b, 14), afckVar, 3);
        }
        if (i == 1) {
            Object objA = ahni.a(new bqi(cqzVar, (asf) this.a, (bqj) this.b, (afck) null, 1), afckVar);
            return objA == afcr.a ? objA : afak.a;
        }
        if (i == 2) {
            Object objR = cqzVar.r(new nie(this.b, this.a, null, 0), afckVar);
            return objR == afcr.a ? objR : afak.a;
        }
        affu affuVar = new affu();
        affuVar.a = 0L;
        affq affqVar = new affq();
        return ca.aT(cqzVar, new nje(affuVar, affqVar, 7, bArr), new gvp(affqVar, affuVar, cqzVar, (afec) new njf(this.a, affqVar, this.b, 6), 5), afckVar, 6);
    }

    public gix(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}

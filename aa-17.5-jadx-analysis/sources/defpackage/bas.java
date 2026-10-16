package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class bas implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bas(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [ben, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck afckVar) {
        switch (this.b) {
            case 0:
                Object objA = ahni.a(new ain(cqzVar, (bbt) this.a, (afck) null, 16), afckVar);
                return objA == afcr.a ? objA : afak.a;
            case 1:
                Object objAK = ca.aK(cqzVar, new ait((aiu) this.a, null), afckVar);
                return objAK == afcr.a ? objAK : afak.a;
            case 2:
                blr blrVar = (blr) this.a;
                Object objR = awx.r(cqzVar, blrVar.r, blrVar.q, afckVar);
                return objR == afcr.a ? objR : afak.a;
            case 3:
                Object objAK2 = ca.aK(cqzVar, new bkx(new bhd(this.a, 0), null, 1, null), afckVar);
                afcr afcrVar = afcr.a;
                if (objAK2 != afcrVar) {
                    objAK2 = afak.a;
                }
                return objAK2 == afcrVar ? objAK2 : afak.a;
            case 4:
                Object objAK3 = ca.aK(cqzVar, new bht((bhu) this.a, null), afckVar);
                return objAK3 == afcr.a ? objAK3 : afak.a;
            case 5:
                bja bjaVar = (bja) this.a;
                Object objR2 = awx.r(cqzVar, bjaVar.e, bjaVar.d, afckVar);
                return objR2 == afcr.a ? objR2 : afak.a;
            case 6:
                Object objR3 = cqzVar.r(new bkx(this.a, null, 0), afckVar);
                return objR3 == afcr.a ? objR3 : afak.a;
            case 7:
                Object objAc = asl.ac(cqzVar, this.a, afckVar);
                return objAc == afcr.a ? objAc : afak.a;
            default:
                Object objA2 = ahni.a(new nig(cqzVar, this.a, null, 1, null), afckVar);
                return objA2 == afcr.a ? objA2 : afak.a;
        }
    }
}

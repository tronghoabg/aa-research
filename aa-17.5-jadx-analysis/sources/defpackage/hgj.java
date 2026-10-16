package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes2.dex */
public final class hgj implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hgj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [afec, bwq, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck afckVar) {
        int i = this.b;
        if (i == 0) {
            return ca.aK(cqzVar, new hgi((afdr) this.a, (afck) null, 0), afckVar);
        }
        if (i == 1) {
            Object objR = cqzVar.r(new hgi((afec) this.a, (afck) null, 1), afckVar);
            return objR == afcr.a ? objR : afak.a;
        }
        int i2 = 3;
        if (i == 2) {
            return aqx.e(cqzVar, null, new hku(this.a, i2), afckVar, 7);
        }
        ?? r5 = this.a;
        if (i != 3) {
            Object objA = ahni.a(new nig(cqzVar, r5, null, 0), afckVar);
            return objA == afcr.a ? objA : afak.a;
        }
        Object objR2 = cqzVar.r(new nid((bwq) r5, (afck) null, 0), afckVar);
        return objR2 == afcr.a ? objR2 : afak.a;
    }
}

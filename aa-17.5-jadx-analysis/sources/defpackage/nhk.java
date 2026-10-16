package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class nhk implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public nhk(ben benVar, blr blrVar, int i) {
        this.c = i;
        this.b = benVar;
        this.a = blrVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ben, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck afckVar) {
        if (this.c != 0) {
            Object objA = ahni.a(new bdr(cqzVar, this.b, (blr) this.a, null), afckVar);
            return objA == afcr.a ? objA : afak.a;
        }
        Object objR = cqzVar.r(new nie(this.a, this.b, null, 1, null), afckVar);
        return objR == afcr.a ? objR : afak.a;
    }

    public nhk(bym bymVar, bwq bwqVar, int i) {
        this.c = i;
        this.a = bymVar;
        this.b = bwqVar;
    }
}

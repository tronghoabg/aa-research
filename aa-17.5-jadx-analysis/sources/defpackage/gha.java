package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class gha implements PointerInputEventHandler {
    private final /* synthetic */ int e;
    public static final gha d = new gha(3);
    public static final gha c = new gha(2);
    public static final gha b = new gha(1);
    public static final gha a = new gha(0);

    public gha(int i) {
        this.e = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck afckVar) {
        int i = this.e;
        if (i == 0) {
            return afak.a;
        }
        if (i == 1) {
            return afak.a;
        }
        if (i != 2) {
            return ca.aT(cqzVar, null, new niz(12), afckVar, 7);
        }
        Object objR = cqzVar.r(new hgp(null, 1, null), afckVar);
        return objR == afcr.a ? objR : afak.a;
    }
}

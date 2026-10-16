package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes2.dex */
public final class hgn implements PointerInputEventHandler {
    final /* synthetic */ boolean a;
    final /* synthetic */ hga b;

    public hgn(boolean z, hga hgaVar) {
        this.a = z;
        this.b = hgaVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck<? super afak> afckVar) {
        return ca.aK(cqzVar, new hgm(this.a, this.b, null), afckVar);
    }
}

package defpackage;

import android.view.Choreographer;

/* loaded from: classes3.dex */
final class vjp extends vjq {
    private final Choreographer a = Choreographer.getInstance();

    @Override // defpackage.vjq
    public final void a(vjo vjoVar) {
        this.a.postFrameCallback(vjoVar.b());
    }

    @Override // defpackage.vjq
    public final void b(vjo vjoVar) {
        this.a.removeFrameCallback(vjoVar.b());
    }
}

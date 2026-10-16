package android.support.v7.widget;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f1597a;

    /* renamed from: b, reason: collision with root package name */
    private final n f1598b;

    public k(p pVar, n nVar) {
        this.f1597a = pVar;
        this.f1598b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f1597a;
        if (pVar.f782c != null) {
            pVar.f782c.l();
        }
        View view = (View) pVar.f784e;
        if (view != null && view.getWindowToken() != null) {
            n nVar = this.f1598b;
            if (nVar.i()) {
                pVar.f1604g = nVar;
            }
        }
        pVar.f1606i = null;
    }
}

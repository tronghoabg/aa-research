package android.support.v7.app;

import android.view.Window;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aa implements android.support.v7.view.menu.ac {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f499a;

    aa(an anVar) {
        this.f499a = anVar;
    }

    @Override // android.support.v7.view.menu.ac
    public final void a(android.support.v7.view.menu.q qVar, boolean z) {
        this.f499a.J(qVar);
    }

    @Override // android.support.v7.view.menu.ac
    public final boolean b(android.support.v7.view.menu.q qVar) {
        Window.Callback callbackH = this.f499a.H();
        if (callbackH == null) {
            return true;
        }
        callbackH.onMenuOpened(108, qVar);
        return true;
    }
}

package android.support.v7.app;

import android.view.Window;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class am implements android.support.v7.view.menu.ac {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f528a;

    am(an anVar) {
        this.f528a = anVar;
    }

    @Override // android.support.v7.view.menu.ac
    public final void a(android.support.v7.view.menu.q qVar, boolean z) {
        android.support.v7.view.menu.q qVarB = qVar.b();
        android.support.v7.view.menu.q qVar2 = qVarB != qVar ? qVarB : qVar;
        an anVar = this.f528a;
        al alVarF = anVar.F(qVar2);
        if (alVarF != null) {
            if (qVarB == qVar) {
                anVar.K(alVarF, z);
            } else {
                anVar.I(alVarF.f516a, alVarF, qVarB);
                anVar.K(alVarF, true);
            }
        }
    }

    @Override // android.support.v7.view.menu.ac
    public final boolean b(android.support.v7.view.menu.q qVar) {
        Window.Callback callbackH;
        if (qVar != qVar.b()) {
            return true;
        }
        an anVar = this.f528a;
        if (!anVar.m || (callbackH = anVar.H()) == null || anVar.r) {
            return true;
        }
        callbackH.onMenuOpened(108, qVar);
        return true;
    }
}

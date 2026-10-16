package android.support.v7.widget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class o implements android.support.v7.view.menu.ac {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f1602a;

    o(p pVar) {
        this.f1602a = pVar;
    }

    @Override // android.support.v7.view.menu.ac
    public final void a(android.support.v7.view.menu.q qVar, boolean z) {
        if (qVar instanceof android.support.v7.view.menu.al) {
            qVar.b().m(false);
        }
        android.support.v7.view.menu.ac acVarA = this.f1602a.a();
        if (acVarA != null) {
            acVarA.a(qVar, z);
        }
    }

    @Override // android.support.v7.view.menu.ac
    public final boolean b(android.support.v7.view.menu.q qVar) {
        p pVar = this.f1602a;
        if (qVar == pVar.f782c) {
            return false;
        }
        ((android.support.v7.view.menu.al) qVar).getItem();
        android.support.v7.view.menu.ac acVarA = pVar.a();
        if (acVarA != null) {
            return acVarA.b(qVar);
        }
        return false;
    }
}

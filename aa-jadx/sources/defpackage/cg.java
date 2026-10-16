package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class cg implements android.transition.Transition.TransitionListener {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.util.ArrayList b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.util.ArrayList d;
    final /* synthetic */ defpackage.cj e;

    public cg(defpackage.cj cjVar, java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2) {
        this.e = cjVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition transition) {
        java.lang.Object obj = this.a;
        if (obj != null) {
            this.e.g(obj, this.b, (java.util.ArrayList) null);
        }
        java.lang.Object obj2 = this.c;
        if (obj2 != null) {
            this.e.g(obj2, this.d, (java.util.ArrayList) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition transition) {
    }
}

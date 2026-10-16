package android.support.v4.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bb implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd f166a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f167b;

    bb(bc bcVar, cd cdVar) {
        this.f167b = bcVar;
        this.f166a = cdVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        cd cdVar = this.f166a;
        ar arVarC = cdVar.c();
        cdVar.g();
        da.b((ViewGroup) arVarC.mView.getParent(), this.f167b.f168a).m();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

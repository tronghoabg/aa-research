package android.support.v7.widget;

import android.view.ViewTreeObserver;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ay implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ba f1096a;

    ay(ba baVar) {
        this.f1096a = baVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ba baVar = this.f1096a;
        if (!baVar.o(baVar.f1108b)) {
            baVar.k();
        } else {
            baVar.n();
            super/*android.support.v7.widget.dm*/.s();
        }
    }
}

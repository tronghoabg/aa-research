package kc;

import android.view.ViewTreeObserver;

/* loaded from: classes5.dex */
public final class i implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f39472a;

    public i(l lVar) {
        this.f39472a = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z2) {
        int i5 = l.f39491e;
        l lVar = this.f39472a;
        if (lVar.G("onWindowFocusChanged")) {
            lVar.f39493b.s(z2);
        }
    }
}

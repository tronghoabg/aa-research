package kc;

import android.view.ViewTreeObserver;

/* loaded from: classes5.dex */
public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f39460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f39461b;

    public d(f fVar, r rVar) {
        this.f39461b = fVar;
        this.f39460a = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f39461b;
        if (fVar.f39468g && fVar.f39466e != null) {
            this.f39460a.getViewTreeObserver().removeOnPreDrawListener(this);
            fVar.f39466e = null;
        }
        return fVar.f39468g;
    }
}

package android.support.v7.view;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class j extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f703a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f704b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f705c = 0;

    j(k kVar) {
        this.f703a = kVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        int i2 = this.f705c + 1;
        this.f705c = i2;
        k kVar = this.f703a;
        if (i2 == kVar.f706a.size()) {
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = kVar.f707b;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationEnd(null);
            }
            this.f705c = 0;
            this.f704b = false;
            kVar.b();
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        if (this.f704b) {
            return;
        }
        this.f704b = true;
        ViewPropertyAnimatorListener viewPropertyAnimatorListener = this.f703a.f707b;
        if (viewPropertyAnimatorListener != null) {
            viewPropertyAnimatorListener.onAnimationStart(null);
        }
    }
}

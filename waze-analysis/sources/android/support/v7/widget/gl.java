package android.support.v7.widget;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gl extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1561a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gm f1562b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1563c = false;

    gl(gm gmVar, int i2) {
        this.f1562b = gmVar;
        this.f1561a = i2;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationCancel(View view) {
        this.f1563c = true;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        if (this.f1563c) {
            return;
        }
        gm gmVar = this.f1562b;
        gmVar.f1564a.setVisibility(this.f1561a);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        this.f1562b.f1564a.setVisibility(0);
    }
}

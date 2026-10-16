package android.support.v7.app;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ax implements ViewPropertyAnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f558a;

    ax(az azVar) {
        this.f558a = azVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
    public final void onAnimationUpdate(View view) {
        ((View) this.f558a.f566c.getParent()).invalidate();
    }
}

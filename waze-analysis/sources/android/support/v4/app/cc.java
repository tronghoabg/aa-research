package android.support.v4.app;

import android.view.View;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cc implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f235a;

    cc(View view) {
        this.f235a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f235a;
        view2.removeOnAttachStateChangeListener(this);
        ViewCompat.requestApplyInsets(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

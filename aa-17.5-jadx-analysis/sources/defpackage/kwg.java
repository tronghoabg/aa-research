package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor;

/* loaded from: classes2.dex */
public final class kwg implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ FocusInterceptor b;
    final /* synthetic */ ViewTreeObserver c;

    public kwg(View view, FocusInterceptor focusInterceptor, ViewTreeObserver viewTreeObserver) {
        this.a = view;
        this.b = focusInterceptor;
        this.c = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        if (view.isAttachedToWindow()) {
            this.b.setVisibility(view.getVisibility());
        } else {
            this.c.removeOnGlobalLayoutListener(this);
        }
    }
}

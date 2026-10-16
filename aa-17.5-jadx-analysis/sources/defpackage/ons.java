package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class ons implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ Consumer b;

    public ons(View view, Consumer consumer) {
        this.a = view;
        this.b = consumer;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.accept(view);
    }
}

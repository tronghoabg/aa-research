package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class onr implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ Function b;

    public onr(View view, Function function) {
        this.a = view;
        this.b = function;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return ((Boolean) this.b.apply(view)).booleanValue();
    }
}

package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes3.dex */
final class wlr implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public wlr(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ykd ykdVar;
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        een eenVar = swipeDismissBehavior.a;
        if (eenVar != null && eenVar.l()) {
            this.b.postOnAnimation(this);
        } else {
            if (!this.c || (ykdVar = swipeDismissBehavior.f) == null) {
                return;
            }
            ykdVar.g(this.b);
        }
    }
}

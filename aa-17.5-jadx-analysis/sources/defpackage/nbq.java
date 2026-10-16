package defpackage;

import android.view.View;
import com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher;

/* loaded from: classes2.dex */
public final class nbq extends emn {
    final /* synthetic */ View a;
    final /* synthetic */ SlidingViewSwitcher b;
    final /* synthetic */ nbo c;

    public nbq(View view, SlidingViewSwitcher slidingViewSwitcher, nbo nboVar) {
        this.a = view;
        this.b = slidingViewSwitcher;
        this.c = nboVar;
    }

    @Override // defpackage.emn
    public final float a(Object obj) {
        return this.a.getTranslationX();
    }

    @Override // defpackage.emn
    public final void b(Object obj, float f) {
        this.b.h(f, this.c);
    }
}

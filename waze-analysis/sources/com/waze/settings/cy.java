package com.waze.settings;

import android.view.View;
import com.waze.ifs.ui.ScrollViewTopShadowOnly;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cy implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dc f36995a;

    public cy(dc dcVar) {
        this.f36995a = dcVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        h.g.b.x.f(view, "view");
        view.removeOnLayoutChangeListener(this);
        dc dcVar = this.f36995a;
        ScrollViewTopShadowOnly scrollViewTopShadowOnly = dcVar.f37019c;
        if (scrollViewTopShadowOnly == null) {
            h.g.b.x.j("scroll");
            scrollViewTopShadowOnly = null;
        }
        dcVar.t(scrollViewTopShadowOnly.canScrollVertically(1));
        com.waze.search.v2.o.f(dcVar);
    }
}

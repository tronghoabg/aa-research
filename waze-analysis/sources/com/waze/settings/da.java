package com.waze.settings;

import com.waze.ifs.ui.ScrollViewTopShadowOnly;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class da implements com.waze.sharedui.views.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dc f37014a;

    da(dc dcVar) {
        this.f37014a = dcVar;
    }

    @Override // com.waze.sharedui.views.q
    public final void a() {
        dc dcVar = this.f37014a;
        ScrollViewTopShadowOnly scrollViewTopShadowOnly = dcVar.f37019c;
        ScrollViewTopShadowOnly scrollViewTopShadowOnly2 = null;
        if (scrollViewTopShadowOnly == null) {
            h.g.b.x.j("scroll");
            scrollViewTopShadowOnly = null;
        }
        if (scrollViewTopShadowOnly.getScrollY() == 0) {
            return;
        }
        ScrollViewTopShadowOnly scrollViewTopShadowOnly3 = dcVar.f37019c;
        if (scrollViewTopShadowOnly3 == null) {
            h.g.b.x.j("scroll");
        } else {
            scrollViewTopShadowOnly2 = scrollViewTopShadowOnly3;
        }
        scrollViewTopShadowOnly2.b(this);
    }
}

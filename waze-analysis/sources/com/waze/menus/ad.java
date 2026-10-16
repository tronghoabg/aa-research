package com.waze.menus;

import android.support.v7.widget.fe;
import com.waze.R;
import com.waze.design_components.text_view.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ad extends fe {

    /* renamed from: a, reason: collision with root package name */
    private final WazeTextView f29693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(WazeTextView wazeTextView) {
        super(wazeTextView);
        h.g.b.x.f(wazeTextView, "webViewLinkView");
        this.f29693a = wazeTextView;
    }

    public final void a() {
        com.waze.web.r.c(this.f29693a, R.string.ND4C_ALGO_TRANSPARENCY_LINK_SEARCH_TITLE, null);
    }
}

package com.waze.sharedui.views;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f39217a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ URLSpan f39218b;

    ao(an anVar, URLSpan uRLSpan) {
        this.f39217a = anVar;
        this.f39218b = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        h.g.b.x.f(view, "view");
        this.f39217a.a(this.f39218b.getURL());
    }
}

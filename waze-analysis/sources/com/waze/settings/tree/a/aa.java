package com.waze.settings.tree.a;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View.OnClickListener f37463a;

    aa(View.OnClickListener onClickListener) {
        this.f37463a = onClickListener;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        h.g.b.x.f(view, "widget");
        this.f37463a.onClick(view);
    }
}

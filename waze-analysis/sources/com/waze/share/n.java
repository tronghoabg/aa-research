package com.waze.share;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f37719a;

    n(v vVar) {
        Objects.requireNonNull(vVar);
        this.f37719a = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v vVar = this.f37719a;
        if (!vVar.w()) {
            com.waze.settings.h.c.c().c(h.f37711b, null);
            aa.c(vVar.f37738c, null, vVar.f37739d, null);
        } else {
            com.waze.settings.h.c.c().a(h.f37711b, null);
            vVar.f37742g = null;
            v.p(vVar);
        }
    }
}

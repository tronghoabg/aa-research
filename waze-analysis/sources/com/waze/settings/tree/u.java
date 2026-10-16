package com.waze.settings.tree;

import android.view.View;
import com.waze.settings.de;
import h.g.b.aq;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f37592a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f37593b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ de f37594c;

    u(aq aqVar, ab abVar, de deVar) {
        this.f37592a = aqVar;
        this.f37593b = abVar;
        this.f37594c = deVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        h.g.b.x.f(view, "view");
        this.f37592a.f48105a = this.f37593b.d(this.f37594c, (com.waze.ifs.ui.x) view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        h.g.b.x.f(view, "view");
        br brVar = (br) this.f37592a.f48105a;
        if (brVar != null) {
            brVar.s(null);
        }
    }
}

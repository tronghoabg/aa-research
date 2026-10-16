package com.waze.a;

import android.os.SystemClock;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f13601a;

    /* renamed from: b, reason: collision with root package name */
    private long f13602b;

    ac(h.g.a.a aVar) {
        this.f13601a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.g.b.x.f(view, "v");
        if (SystemClock.elapsedRealtime() - this.f13602b < 1000) {
            return;
        }
        this.f13601a.invoke();
        this.f13602b = SystemClock.elapsedRealtime();
    }
}

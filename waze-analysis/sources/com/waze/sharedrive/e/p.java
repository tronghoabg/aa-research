package com.waze.sharedrive.e;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements a {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f38551a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f38552b;

    public p(Context context, h.c.j jVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f38551a = jVar;
        this.f38552b = new WeakReference(context);
    }

    @Override // com.waze.sharedrive.e.a
    public final Object a(String str, h.c.e eVar) {
        return kotlinx.coroutines.aj.v(this.f38551a, new al(this, str, (h.c.e) null, 1), eVar);
    }
}

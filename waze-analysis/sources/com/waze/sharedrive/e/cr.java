package com.waze.sharedrive.e;

import android.content.Context;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cr implements co {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f38513a;

    /* renamed from: b, reason: collision with root package name */
    private final AsyncLayoutInflater f38514b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38515c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference f38516d;

    public cr(Context context, h.c.j jVar, AsyncLayoutInflater asyncLayoutInflater, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(asyncLayoutInflater, "layoutInflater");
        h.g.b.x.f(eVar, "logger");
        this.f38513a = jVar;
        this.f38514b = asyncLayoutInflater;
        this.f38515c = eVar;
        this.f38516d = new WeakReference(context);
    }

    @Override // com.waze.sharedrive.e.co
    public final Object a(h.g.a.l lVar, h.c.e eVar) {
        return kotlinx.coroutines.aj.v(this.f38513a, new cq(this, lVar, null), eVar);
    }
}

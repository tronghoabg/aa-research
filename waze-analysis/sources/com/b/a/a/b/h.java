package com.b.a.a.b;

import android.content.Context;
import android.os.AsyncTask;
import com.b.b.a.o;
import com.b.b.a.q;
import com.b.b.a.u;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private f f2563a;

    /* renamed from: b, reason: collision with root package name */
    private q f2564b;

    /* renamed from: c, reason: collision with root package name */
    private g f2565c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f2566d;

    /* renamed from: e, reason: collision with root package name */
    private final com.b.a.a.a.b f2567e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2568f;

    private h(Context context, com.b.a.a.a.b bVar, String str) {
        this.f2566d = context;
        this.f2567e = bVar;
        this.f2568f = str;
    }

    public static h c(Context context, com.b.a.a.a.b bVar, String str) {
        u.c(context);
        u.c(str);
        return new h(context, bVar, str);
    }

    public final void h(o oVar) {
        g gVar = new g(this, this.f2567e, oVar);
        this.f2565c = gVar;
        gVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void i() {
        f fVar = this.f2563a;
        if (fVar != null) {
            fVar.c();
        }
    }

    public final void j(com.b.b.a.k kVar) {
        this.f2564b.i(kVar);
        this.f2563a.d(kVar);
    }
}

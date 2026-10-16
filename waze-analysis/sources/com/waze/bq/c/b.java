package com.waze.bq.c;

import android.content.Context;
import com.waze.t.b.aj;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17240a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17241b;

    public b(com.waze.shared_infra.i.e eVar, Context context) {
        x.f(eVar, "logger");
        x.f(context, "context");
        this.f17240a = eVar;
        this.f17241b = context;
    }

    @Override // com.waze.t.b.ai
    public final aj a() {
        return new c(this.f17240a, this.f17241b);
    }
}

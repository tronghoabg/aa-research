package com.waze.ac.c;

import com.waze.shared_infra.i.e;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ac.b.a f13847a;

    /* renamed from: b, reason: collision with root package name */
    private final e f13848b;

    public b(com.waze.ac.b.a aVar) {
        x.f(aVar, "encouragementController");
        this.f13847a = aVar;
        e eVarD = com.waze.shared_infra.i.a.d("EncouragementStateHolder");
        x.e(eVarD, "create(...)");
        this.f13848b = eVarD;
    }

    public final Object b(h.c.e eVar) {
        this.f13848b.a("listenToEncouragementRequests");
        Object objCollect = ai.D(this.f13847a.a()).collect(new a(this), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}

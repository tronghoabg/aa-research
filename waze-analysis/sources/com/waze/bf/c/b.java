package com.waze.bf.c;

import com.waze.shared_infra.i.e;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bf.b.a f16298a;

    /* renamed from: b, reason: collision with root package name */
    private final e f16299b;

    public b(com.waze.bf.b.a aVar) {
        x.f(aVar, "privacyConsentController");
        this.f16298a = aVar;
        e eVarD = com.waze.shared_infra.i.a.d("PrivacyConsentStateHolder");
        x.e(eVarD, "create(...)");
        this.f16299b = eVarD;
    }

    public final Object b(h.c.e eVar) {
        this.f16299b.a("listenToPrivacyConsentRequests");
        Object objCollect = ai.D(this.f16298a.a()).collect(new a(this), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}

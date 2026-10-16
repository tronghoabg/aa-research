package com.waze.network.d;

import e.a.ch;
import e.a.cm;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends e.a.e {

    /* renamed from: a, reason: collision with root package name */
    private static final ch f32209a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.authentication.i f32210b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32211c;

    static {
        ch chVarC = ch.c("Authorization", cm.f46534a);
        x.e(chVarC, "of(...)");
        f32209a = chVarC;
    }

    public l(com.waze.authentication.i iVar, com.waze.shared_infra.i.e eVar) {
        x.f(iVar, "authenticationRepository");
        x.f(eVar, "logger");
        this.f32210b = iVar;
        this.f32211c = eVar;
    }

    @Override // e.a.e
    public final void d(com.waze.ui.ae.d dVar, Executor executor, e.a.d dVar2) {
        x.f(dVar, "requestInfo");
        x.f(executor, "appExecutor");
        x.f(dVar2, "applier");
        ab abVarF = bo.f(executor);
        aj.z(aj.e(abVarF), new k(CoroutineExceptionHandler.f51269c, this, dVar2), null, new j(this, dVar2, (h.c.e) null, 0), 2);
    }
}

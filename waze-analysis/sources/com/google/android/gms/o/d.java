package com.google.android.gms.o;

import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f5755a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f5756b;

    d(e eVar, t tVar) {
        this.f5755a = tVar;
        Objects.requireNonNull(eVar);
        this.f5756b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            t tVar = (t) this.f5756b.f5758b.a(this.f5755a);
            e eVar = this.f5756b;
            if (tVar == null) {
                eVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = z.f5782b;
            tVar.q(executor, eVar);
            tVar.p(executor, eVar);
            tVar.l(executor, eVar);
        } catch (r e2) {
            boolean z = e2.getCause() instanceof Exception;
            e eVar2 = this.f5756b;
            if (z) {
                eVar2.f5759c.s((Exception) e2.getCause());
            } else {
                eVar2.f5759c.s(e2);
            }
        } catch (Exception e3) {
            this.f5756b.f5759c.s(e3);
        }
    }
}

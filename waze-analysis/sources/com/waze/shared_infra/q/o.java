package com.waze.shared_infra.q;

import com.google.d.b.ai;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private final ai f37949a = ai.c();

    @Override // com.waze.shared_infra.q.l
    public final long a() {
        return this.f37949a.a(TimeUnit.MILLISECONDS);
    }

    @Override // com.waze.shared_infra.q.n
    public final void b() {
        Object objA;
        try {
            o oVar = this;
            ai aiVar = this.f37949a;
            aiVar.f();
            objA = aiVar;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        h.m.c(objA);
    }

    @Override // com.waze.shared_infra.q.n
    public final void c() {
        Object objA;
        try {
            o oVar = this;
            ai aiVar = this.f37949a;
            aiVar.e();
            objA = aiVar;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        h.m.c(objA);
    }
}

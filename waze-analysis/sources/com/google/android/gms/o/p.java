package com.google.android.gms.o;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f5771a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f5772b;

    p(q qVar, t tVar) {
        this.f5771a = tVar;
        Objects.requireNonNull(qVar);
        this.f5772b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            t tVarA = this.f5772b.f5774b.a(this.f5771a.g());
            q qVar = this.f5772b;
            Executor executor = z.f5782b;
            tVarA.q(executor, qVar);
            tVarA.p(executor, qVar);
            tVarA.l(executor, qVar);
        } catch (r e2) {
            boolean z = e2.getCause() instanceof Exception;
            q qVar2 = this.f5772b;
            if (z) {
                qVar2.onFailure((Exception) e2.getCause());
            } else {
                qVar2.onFailure(e2);
            }
        } catch (CancellationException unused) {
            this.f5772b.d();
        } catch (Exception e3) {
            this.f5772b.onFailure(e3);
        }
    }
}

package androidx.datastore.core;

import h.ab;
import h.c.b.a.c;
import h.c.e;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class RunOnce {
    private final a runMutex = new h(false);
    private final CompletableDeferred<ab> didRun = bo.j();

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    public final Object awaitComplete(e<? super ab> eVar) {
        Object objC = this.didRun.c(eVar);
        return objC == h.c.a.a.f48038a ? objC : ab.f48028a;
    }

    protected abstract Object doRun(e<? super ab> eVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runIfNeeded(h.c.e<? super h.ab> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.RunOnce.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            int r1 = r0.I$1
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.h.a r0 = (kotlinx.coroutines.h.a) r0
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L34
            goto L83
        L34:
            r7 = move-exception
            goto L92
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.h.a r4 = (kotlinx.coroutines.h.a) r4
            e.b.c.b(r8)
            r8 = r4
            goto L66
        L49:
            e.b.c.b(r8)
            kotlinx.coroutines.CompletableDeferred<h.ab> r8 = r7.didRun
            boolean r8 = r8.ca()
            if (r8 == 0) goto L57
            h.ab r7 = h.ab.f48028a
            return r7
        L57:
            kotlinx.coroutines.h.a r8 = r7.runMutex
            r0.L$0 = r8
            r0.I$0 = r5
            r0.label = r4
            java.lang.Object r2 = r8.lock(r6, r0)
            if (r2 == r1) goto L96
            r2 = r5
        L66:
            kotlinx.coroutines.CompletableDeferred<h.ab> r4 = r7.didRun     // Catch: java.lang.Throwable -> L90
            boolean r4 = r4.ca()     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L74
            h.ab r7 = h.ab.f48028a     // Catch: java.lang.Throwable -> L90
            r8.unlock(r6)
            return r7
        L74:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L90
            r0.I$0 = r2     // Catch: java.lang.Throwable -> L90
            r0.I$1 = r5     // Catch: java.lang.Throwable -> L90
            r0.label = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r7.doRun(r0)     // Catch: java.lang.Throwable -> L90
            if (r0 == r1) goto L96
            r0 = r8
        L83:
            kotlinx.coroutines.CompletableDeferred<h.ab> r7 = r7.didRun     // Catch: java.lang.Throwable -> L34
            h.ab r8 = h.ab.f48028a     // Catch: java.lang.Throwable -> L34
            r7.a(r8)     // Catch: java.lang.Throwable -> L34
            r0.unlock(r6)
            h.ab r7 = h.ab.f48028a
            return r7
        L90:
            r7 = move-exception
            r0 = r8
        L92:
            r0.unlock(r6)
            throw r7
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(h.c.e):java.lang.Object");
    }
}

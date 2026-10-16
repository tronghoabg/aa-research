package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.camera.camera2.pipe.core.MutexesKt;
import androidx.camera.camera2.pipe.core.Token;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.br;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.i;
import kotlinx.coroutines.s;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class GraphSessionLock {
    private final a mutex = i.c();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1, reason: invalid class name */
    final class AnonymousClass1<T> extends c {
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
            return GraphSessionLock.this.use(null, null, this);
        }
    }

    private final <T> am<T> asyncUndispatched(af afVar, p<? super af, ? super e<? super T>, ? extends Object> pVar) {
        final s sVarC = o.c((br) afVar.getCoroutineContext().get(br.f51766a));
        am<T> amVarW = aj.w(afVar, afVar.getCoroutineContext().plus(sVarC), ag.f51345d, new GraphSessionLock$asyncUndispatched$result$1(pVar, null));
        amVarW.bY(new l() { // from class: androidx.camera.camera2.pipe.internal.GraphSessionLock$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return GraphSessionLock.asyncUndispatched$lambda$0(sVarC, (Throwable) obj);
            }
        });
        return amVarW;
    }

    static final ab asyncUndispatched$lambda$0(s sVar, Throwable th) {
        sVar.a();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object use(androidx.camera.camera2.pipe.core.Token r5, h.g.a.p<? super androidx.camera.camera2.pipe.core.Token, ? super h.c.e<? super T>, ? extends java.lang.Object> r6, h.c.e<? super T> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.pipe.internal.GraphSessionLock.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1 r0 = (androidx.camera.camera2.pipe.internal.GraphSessionLock.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1 r0 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1
            r0.<init>(r7)
        L18:
            java.lang.Object r4 = r0.result
            h.c.a.a r7 = h.c.a.a.f48038a
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.camera.camera2.pipe.core.Token r5 = (androidx.camera.camera2.pipe.core.Token) r5
            e.b.c.b(r4)     // Catch: java.lang.Throwable -> L2b
            goto L43
        L2b:
            r4 = move-exception
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r4)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2b
            r0.label = r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r4 != r7) goto L43
            return r7
        L43:
            r5.release()
            return r4
        L47:
            r5.release()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.GraphSessionLock.use(androidx.camera.camera2.pipe.core.Token, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquireToken$camera_camera2_pipe(h.c.e<? super androidx.camera.camera2.pipe.core.Token> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1 r0 = (androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1 r0 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.h.a r4 = (kotlinx.coroutines.h.a) r4
            e.b.c.b(r5)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r5)
            kotlinx.coroutines.h.a r4 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.i.c.b(r4, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            androidx.camera.camera2.pipe.core.MutexToken r5 = new androidx.camera.camera2.pipe.core.MutexToken
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.GraphSessionLock.acquireToken$camera_camera2_pipe(h.c.e):java.lang.Object");
    }

    public final Token tryAcquireToken$camera_camera2_pipe() {
        return MutexesKt.tryAcquireToken(this.mutex);
    }

    public final <T> am<T> withTokenIn$camera_camera2_pipe(af afVar, p<? super Token, ? super e<? super T>, ? extends Object> pVar) {
        x.f(afVar, "scope");
        x.f(pVar, "action");
        return asyncUndispatched(afVar, new GraphSessionLock$withTokenIn$1(this, pVar, null));
    }

    public final <T> am<T> withTokenInAsync$camera_camera2_pipe(af afVar, p<? super Token, ? super e<? super am<? extends T>>, ? extends Object> pVar) {
        x.f(afVar, "scope");
        x.f(pVar, "action");
        return asyncUndispatched(afVar, new GraphSessionLock$withTokenInAsync$1(this, pVar, null));
    }
}

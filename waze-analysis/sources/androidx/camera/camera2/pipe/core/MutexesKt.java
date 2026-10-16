package androidx.camera.camera2.pipe.core;

import h.ab;
import h.c.a.h;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.d.b;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.br;
import kotlinx.coroutines.h.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MutexesKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
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
            return MutexesKt.acquireToken(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1, reason: invalid class name and case insensitive filesystem */
    final class C01651 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01651(e<? super C01651> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MutexesKt.acquireTokenAndSuspend(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.MutexesKt$withLockAsync$1, reason: invalid class name and case insensitive filesystem */
    final class C01661 extends g implements p<af, e, Object> {
        final /* synthetic */ p<af, e, Object> $block;
        final /* synthetic */ CoroutineMutex $this_withLockAsync;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01661(CoroutineMutex coroutineMutex, p<? super af, ? super e, ? extends Object> pVar, e<? super C01661> eVar) {
            super(2, eVar);
            this.$this_withLockAsync = coroutineMutex;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C01661 c01661 = new C01661(this.$this_withLockAsync, this.$block, eVar);
            c01661.L$0 = obj;
            return c01661;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((C01661) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            p<af, e, Object> pVar;
            a mutex$camera_camera2_pipe;
            Throwable th;
            a aVar;
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    e.b.c.b(obj);
                    aj.i((af) this.L$0);
                    CoroutineMutex coroutineMutex = this.$this_withLockAsync;
                    pVar = this.$block;
                    mutex$camera_camera2_pipe = coroutineMutex.getMutex$camera_camera2_pipe();
                    this.L$0 = mutex$camera_camera2_pipe;
                    this.L$1 = pVar;
                    this.label = 1;
                    if (MutexesKt.lockAndSuspend(mutex$camera_camera2_pipe, this) != aVar2) {
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.L$0;
                    try {
                        e.b.c.b(obj);
                        aVar.unlock(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar.unlock(null);
                        throw th;
                    }
                }
                pVar = (p) this.L$1;
                a aVar3 = (a) this.L$0;
                e.b.c.b(obj);
                mutex$camera_camera2_pipe = aVar3;
                this.L$0 = mutex$camera_camera2_pipe;
                this.L$1 = null;
                this.label = 2;
                Object objD = aj.d(pVar, this);
                if (objD != aVar2) {
                    a aVar4 = mutex$camera_camera2_pipe;
                    obj = objD;
                    aVar = aVar4;
                    aVar.unlock(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                a aVar5 = mutex$camera_camera2_pipe;
                th = th3;
                aVar = aVar5;
                aVar.unlock(null);
                throw th;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1, reason: invalid class name and case insensitive filesystem */
    final class C01671 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<af, e<? super ab>, Object> $block;
        final /* synthetic */ CoroutineMutex $this_withLockLaunch;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01671(CoroutineMutex coroutineMutex, p<? super af, ? super e<? super ab>, ? extends Object> pVar, e<? super C01671> eVar) {
            super(2, eVar);
            this.$this_withLockLaunch = coroutineMutex;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C01671 c01671 = new C01671(this.$this_withLockLaunch, this.$block, eVar);
            c01671.L$0 = obj;
            return c01671;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01671) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            p<af, e<? super ab>, Object> pVar;
            a mutex$camera_camera2_pipe;
            Throwable th;
            a aVar;
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    e.b.c.b(obj);
                    aj.i((af) this.L$0);
                    CoroutineMutex coroutineMutex = this.$this_withLockLaunch;
                    pVar = this.$block;
                    mutex$camera_camera2_pipe = coroutineMutex.getMutex$camera_camera2_pipe();
                    this.L$0 = mutex$camera_camera2_pipe;
                    this.L$1 = pVar;
                    this.label = 1;
                    if (MutexesKt.lockAndSuspend(mutex$camera_camera2_pipe, this) != aVar2) {
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.L$0;
                    try {
                        e.b.c.b(obj);
                        aVar.unlock(null);
                        return ab.f48028a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar.unlock(null);
                        throw th;
                    }
                }
                pVar = (p) this.L$1;
                a aVar3 = (a) this.L$0;
                e.b.c.b(obj);
                mutex$camera_camera2_pipe = aVar3;
                this.L$0 = mutex$camera_camera2_pipe;
                this.L$1 = null;
                this.label = 2;
                if (aj.d(pVar, this) != aVar2) {
                    aVar = mutex$camera_camera2_pipe;
                    aVar.unlock(null);
                    return ab.f48028a;
                }
                return aVar2;
            } catch (Throwable th3) {
                a aVar4 = mutex$camera_camera2_pipe;
                th = th3;
                aVar = aVar4;
                aVar.unlock(null);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object acquireToken(kotlinx.coroutines.h.a r4, h.c.e<? super androidx.camera.camera2.pipe.core.Token> r5) {
        /*
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.core.MutexesKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1 r0 = (androidx.camera.camera2.pipe.core.MutexesKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1 r0 = new androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1
            r0.<init>(r5)
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
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.i.c.b(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            androidx.camera.camera2.pipe.core.MutexToken r5 = new androidx.camera.camera2.pipe.core.MutexToken
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.core.MutexesKt.acquireToken(kotlinx.coroutines.h.a, h.c.e):java.lang.Object");
    }

    private static final Object acquireToken$$forInline(a aVar, e<? super Token> eVar) {
        aVar.lock(null, eVar);
        return new MutexToken(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object acquireTokenAndSuspend(kotlinx.coroutines.h.a r4, h.c.e<? super androidx.camera.camera2.pipe.core.Token> r5) {
        /*
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.core.MutexesKt.C01651
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1 r0 = (androidx.camera.camera2.pipe.core.MutexesKt.C01651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1 r0 = new androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1
            r0.<init>(r5)
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
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = access$lockAndSuspend(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            androidx.camera.camera2.pipe.core.MutexToken r5 = new androidx.camera.camera2.pipe.core.MutexToken
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.core.MutexesKt.acquireTokenAndSuspend(kotlinx.coroutines.h.a, h.c.e):java.lang.Object");
    }

    private static final Object acquireTokenAndSuspend$$forInline(a aVar, e<? super Token> eVar) {
        lockAndSuspend(aVar, eVar);
        return new MutexToken(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lockAndSuspend(a aVar, e<? super ab> eVar) {
        Object objInvoke;
        MutexesKt$lockAndSuspend$lockFn$1 mutexesKt$lockAndSuspend$lockFn$1 = MutexesKt$lockAndSuspend$lockFn$1.INSTANCE;
        if (mutexesKt$lockAndSuspend$lockFn$1 instanceof h.c.b.a.a) {
            au.h(mutexesKt$lockAndSuspend$lockFn$1, 2);
            objInvoke = mutexesKt$lockAndSuspend$lockFn$1.invoke((MutexesKt$lockAndSuspend$lockFn$1) aVar, (a) eVar);
        } else {
            objInvoke = h.a(mutexesKt$lockAndSuspend$lockFn$1, aVar, eVar);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (objInvoke != aVar2) {
            h.d(eVar).resumeWith(ab.f48028a);
        }
        b.c(eVar);
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lockWithoutOwner(a aVar, e<? super ab> eVar) {
        Object objLock = aVar.lock(null, eVar);
        return objLock == h.c.a.a.f48038a ? objLock : ab.f48028a;
    }

    public static final Token tryAcquireToken(a aVar) {
        x.f(aVar, "<this>");
        if (aVar.tryLock(null)) {
            return new MutexToken(aVar);
        }
        return null;
    }

    public static final <T> am<T> withLockAsync(CoroutineMutex coroutineMutex, af afVar, p<? super af, ? super e<? super T>, ? extends Object> pVar) {
        x.f(coroutineMutex, "<this>");
        x.f(afVar, "scope");
        x.f(pVar, "block");
        return aj.y(afVar, null, ag.f51345d, new C01661(coroutineMutex, pVar, null), 1);
    }

    public static final br withLockLaunch(CoroutineMutex coroutineMutex, af afVar, p<? super af, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(coroutineMutex, "<this>");
        x.f(afVar, "scope");
        x.f(pVar, "block");
        return aj.z(afVar, null, ag.f51345d, new C01671(coroutineMutex, pVar, null), 1);
    }

    private static final <T> Object withLockSuspend(a aVar, h.g.a.a<? extends T> aVar2, e<? super T> eVar) {
        lockAndSuspend(aVar, eVar);
        try {
            return aVar2.invoke();
        } finally {
            aVar.unlock(null);
        }
    }
}

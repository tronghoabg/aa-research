package androidx.datastore.core;

import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import kotlinx.coroutines.b.b;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    private final String filePath;
    private final a mutex;
    private final k<ab> updateNotifications;
    private final AtomicInt version;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.SingleProcessCoordinator$lock$1, reason: invalid class name */
    final class AnonymousClass1<T> extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.lock(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.SingleProcessCoordinator$tryLock$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C04291<T> extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C04291(e<? super C04291> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.tryLock(null, this);
        }
    }

    public SingleProcessCoordinator(String str) {
        x.f(str, "filePath");
        this.filePath = str;
        this.mutex = new h(false);
        this.version = new AtomicInt(0);
        this.updateNotifications = new b(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public k<ab> getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(e<? super Integer> eVar) {
        return new Integer(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(e<? super Integer> eVar) {
        return new Integer(this.version.incrementAndGet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessCoordinator] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlinx.coroutines.h.a] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlinx.coroutines.h.a] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object lock(h.g.a.l<? super h.c.e<? super T>, ? extends java.lang.Object> r9, h.c.e<? super T> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessCoordinator.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$lock$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            int r8 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
            java.lang.Object r9 = r0.L$0
            h.g.a.l r9 = (h.g.a.l) r9
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L38:
            r9 = move-exception
            goto L7d
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.h.a r9 = (kotlinx.coroutines.h.a) r9
            java.lang.Object r2 = r0.L$0
            h.g.a.l r2 = (h.g.a.l) r2
            e.b.c.b(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L68
        L53:
            e.b.c.b(r10)
            kotlinx.coroutines.h.a r8 = r8.mutex
            r0.L$0 = r9
            r0.L$1 = r8
            r0.I$0 = r5
            r0.label = r4
            java.lang.Object r10 = r8.lock(r6, r0)
            if (r10 == r1) goto L81
            r2 = r9
            r9 = r5
        L68:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L38
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L38
            r0.I$0 = r9     // Catch: java.lang.Throwable -> L38
            r0.I$1 = r5     // Catch: java.lang.Throwable -> L38
            r0.label = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto L81
        L79:
            r8.unlock(r6)
            return r10
        L7d:
            r8.unlock(r6)
            throw r9
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.lock(h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object tryLock(h.g.a.p<? super java.lang.Boolean, ? super h.c.e<? super T>, ? extends java.lang.Object> r8, h.c.e<? super T> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessCoordinator.C04291
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator.C04291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r7 = r0.I$1
            boolean r7 = r0.Z$1
            boolean r7 = r0.Z$0
            int r8 = r0.I$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
            java.lang.Object r0 = r0.L$0
            h.g.a.p r0 = (h.g.a.p) r0
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L38
            goto L68
        L38:
            r9 = move-exception
            goto L74
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            e.b.c.b(r9)
            kotlinx.coroutines.h.a r7 = r7.mutex
            boolean r9 = r7.tryLock(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L6f
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L6f
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L6f
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L6f
            r0.Z$1 = r9     // Catch: java.lang.Throwable -> L6f
            r0.I$1 = r5     // Catch: java.lang.Throwable -> L6f
            r0.label = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 == r1) goto L6e
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L68:
            if (r7 == 0) goto L6d
            r8.unlock(r4)
        L6d:
            return r9
        L6e:
            return r1
        L6f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L74:
            if (r7 == 0) goto L79
            r8.unlock(r4)
        L79:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.tryLock(h.g.a.p, h.c.e):java.lang.Object");
    }
}

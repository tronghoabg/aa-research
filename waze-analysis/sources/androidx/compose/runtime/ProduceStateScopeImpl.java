package androidx.compose.runtime;

import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.c.j;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    private final /* synthetic */ MutableState<T> $$delegate_0;
    private final j coroutineContext;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ProduceStateScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ProduceStateScopeImpl<T> produceStateScopeImpl, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = produceStateScopeImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.awaitDispose(null, this);
        }
    }

    public ProduceStateScopeImpl(MutableState<T> mutableState, j jVar) {
        this.$$delegate_0 = mutableState;
        this.coroutineContext = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.ProduceStateScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitDispose(h.g.a.a<h.ab> r5, h.c.e<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.result
            h.c.a.a r6 = h.c.a.a.f48038a
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r5 = r0.L$0
            h.g.a.a r5 = (h.g.a.a) r5
            e.b.c.b(r4)     // Catch: java.lang.Throwable -> L33
            goto L59
        L33:
            r4 = move-exception
            goto L5f
        L35:
            e.b.c.b(r4)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L33
            r0.label = r2     // Catch: java.lang.Throwable -> L33
            h.c.e r0 = (h.c.e) r0     // Catch: java.lang.Throwable -> L33
            kotlinx.coroutines.l r4 = new kotlinx.coroutines.l     // Catch: java.lang.Throwable -> L33
            h.c.e r1 = h.c.a.h.d(r0)     // Catch: java.lang.Throwable -> L33
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L33
            r4.u()     // Catch: java.lang.Throwable -> L33
            r1 = r4
            kotlinx.coroutines.k r1 = (kotlinx.coroutines.k) r1     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r4.j()     // Catch: java.lang.Throwable -> L33
            if (r4 != r6) goto L56
            h.d.b.c(r0)     // Catch: java.lang.Throwable -> L33
        L56:
            if (r4 != r6) goto L59
            return r6
        L59:
            h.e r4 = new h.e     // Catch: java.lang.Throwable -> L33
            r4.<init>()     // Catch: java.lang.Throwable -> L33
            throw r4     // Catch: java.lang.Throwable -> L33
        L5f:
            r5.invoke()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose(h.g.a.a, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // androidx.compose.runtime.MutableState
    public l<T, ab> component2() {
        return this.$$delegate_0.component2();
    }

    @Override // kotlinx.coroutines.af
    public j getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        this.$$delegate_0.setValue(t);
    }
}

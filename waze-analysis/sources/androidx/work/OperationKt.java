package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import com.google.d.m.a.bm;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OperationKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object await(androidx.work.Operation r4, h.c.e<? super androidx.work.Operation.State.SUCCESS> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            com.google.d.m.a.bm r4 = r4.getResult()
            java.lang.String r5 = "getResult(...)"
            h.g.b.x.e(r4, r5)
            r0.label = r3
            java.lang.Object r5 = androidx.concurrent.futures.ListenableFutureKt.await(r4, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r4 = "await(...)"
            h.g.b.x.e(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, h.c.e):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, e<? super Operation.State.SUCCESS> eVar) throws Throwable {
        bm<Operation.State.SUCCESS> result = operation.getResult();
        x.e(result, "getResult(...)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(result, eVar);
        x.e(objAwait, "await(...)");
        return objAwait;
    }

    public static final Operation launchOperation(final Tracer tracer, final String str, final Executor executor, final a<ab> aVar) {
        x.f(tracer, "tracer");
        x.f(str, "label");
        x.f(executor, "executor");
        x.f(aVar, "block");
        final MutableLiveData mutableLiveData = new MutableLiveData(Operation.IN_PROGRESS);
        bm future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.OperationKt$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return OperationKt.launchOperation$lambda$0(executor, tracer, str, aVar, mutableLiveData, completer);
            }
        });
        x.e(future, "getFuture(...)");
        return new OperationImpl(mutableLiveData, future);
    }

    static final ab launchOperation$lambda$0(Executor executor, final Tracer tracer, final String str, final a aVar, final MutableLiveData mutableLiveData, final CallbackToFutureAdapter.Completer completer) {
        x.f(completer, "completer");
        executor.execute(new Runnable() { // from class: androidx.work.OperationKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.launchOperation$lambda$0$0(tracer, str, aVar, mutableLiveData, completer);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$0$0(Tracer tracer, String str, a aVar, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(str);
            } finally {
                if (zIsEnabled) {
                    tracer.endSection();
                }
            }
        }
        try {
            aVar.invoke();
            mutableLiveData.postValue(Operation.SUCCESS);
            completer.set(Operation.SUCCESS);
        } catch (Throwable th) {
            mutableLiveData.postValue(new Operation.State.FAILURE(th));
            completer.setException(th);
        }
    }
}

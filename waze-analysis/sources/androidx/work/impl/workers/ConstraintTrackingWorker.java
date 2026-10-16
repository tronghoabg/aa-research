package androidx.work.impl.workers;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import com.google.d.m.a.bm;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters workerParameters;

    /* compiled from: WazeSource */
    final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i2) {
            this.stopReason = i2;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ListenableWorker.Result>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return ConstraintTrackingWorker.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ListenableWorker.Result> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.label = 1;
            Object obj2 = ConstraintTrackingWorker.this.setupAndRunConstraintTrackingWork(this);
            return obj2 == aVar ? aVar : obj2;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.runWorker(null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2, reason: invalid class name and case insensitive filesystem */
    final class C04832 extends g implements p<af, e<? super ListenableWorker.Result>, Object> {
        final /* synthetic */ ListenableWorker $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04832(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, e<? super C04832> eVar) {
            super(2, eVar);
            this.$delegate = listenableWorker;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C04832 c04832 = new C04832(this.$delegate, this.$workConstraintsTracker, this.$workSpec, eVar);
            c04832.L$0 = obj;
            return c04832;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ListenableWorker.Result> eVar) {
            return ((C04832) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.br] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.br] */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            CancellationException cancellationException;
            AtomicInteger atomicInteger;
            bm<ListenableWorker.Result> bmVar;
            a aVar = a.f48038a;
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        c.b(obj);
                        af afVar = (af) this.L$0;
                        AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                        bm<ListenableWorker.Result> bmVarStartWork = this.$delegate.startWork();
                        x.e(bmVarStartWork, "startWork(...)");
                        br brVarZ = aj.z(afVar, null, null, new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, atomicInteger2, bmVarStartWork, null), 3);
                        try {
                            this.L$0 = atomicInteger2;
                            this.L$1 = bmVarStartWork;
                            this.L$2 = brVarZ;
                            this.label = 1;
                            obj = ListenableFutureKt.await(bmVarStartWork, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            atomicInteger = atomicInteger2;
                            bmVar = bmVarStartWork;
                            r1 = brVarZ;
                        } catch (CancellationException e2) {
                            cancellationException = e2;
                            atomicInteger = atomicInteger2;
                            bmVar = bmVarStartWork;
                            ListenableWorker listenableWorker = this.$delegate;
                            Logger.get().debug(ConstraintTrackingWorkerKt.TAG, "Delegated worker " + listenableWorker.getClass() + " was cancelled", cancellationException);
                            int i2 = atomicInteger.get();
                            if (bmVar.isCancelled() || i2 == -256) {
                                throw cancellationException;
                            }
                            throw new ConstraintUnsatisfiedException(atomicInteger.get());
                        }
                    } else {
                        if (r1 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        br brVar = (br) this.L$2;
                        bmVar = (bm) this.L$1;
                        atomicInteger = (AtomicInteger) this.L$0;
                        try {
                            c.b(obj);
                            r1 = brVar;
                        } catch (CancellationException e3) {
                            cancellationException = e3;
                            ListenableWorker listenableWorker2 = this.$delegate;
                            Logger.get().debug(ConstraintTrackingWorkerKt.TAG, "Delegated worker " + listenableWorker2.getClass() + " was cancelled", cancellationException);
                            int i22 = atomicInteger.get();
                            if (bmVar.isCancelled()) {
                                throw cancellationException;
                            }
                            throw cancellationException;
                        }
                    }
                    ListenableWorker.Result result = (ListenableWorker.Result) obj;
                    r1.s(null);
                    return result;
                } catch (Throwable th) {
                    String str = ConstraintTrackingWorkerKt.TAG;
                    ListenableWorker listenableWorker3 = this.$delegate;
                    Logger.get().debug(str, "Delegated worker " + listenableWorker3.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            } catch (Throwable th2) {
                r1.s(null);
                throw th2;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1, reason: invalid class name and case insensitive filesystem */
    final class C04841 extends h.c.b.a.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04841(e<? super C04841> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.setupAndRunConstraintTrackingWork(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5, reason: invalid class name */
    final class AnonymousClass5 extends g implements p<af, e<? super ListenableWorker.Result>, Object> {
        final /* synthetic */ ListenableWorker $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, e<? super AnonymousClass5> eVar) {
            super(2, eVar);
            this.$delegate = listenableWorker;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return ConstraintTrackingWorker.this.new AnonymousClass5(this.$delegate, this.$workConstraintsTracker, this.$workSpec, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ListenableWorker.Result> eVar) {
            return ((AnonymousClass5) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.label = 1;
            Object objRunWorker = ConstraintTrackingWorker.this.runWorker(this.$delegate, this.$workConstraintsTracker, this.$workSpec, this);
            return objRunWorker == aVar ? aVar : objRunWorker;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        x.f(context, "appContext");
        x.f(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runWorker(androidx.work.ListenableWorker r5, androidx.work.impl.constraints.WorkConstraintsTracker r6, androidx.work.impl.model.WorkSpec r7, h.c.e<? super androidx.work.ListenableWorker.Result> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorker.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1
            r0.<init>(r8)
        L18:
            java.lang.Object r4 = r0.result
            h.c.a.a r8 = h.c.a.a.f48038a
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            e.b.c.b(r4)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r4)
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2 r4 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2
            r1 = 0
            r4.<init>(r5, r6, r7, r1)
            h.g.a.p r4 = (h.g.a.p) r4
            r0.label = r2
            java.lang.Object r4 = kotlinx.coroutines.aj.d(r4, r0)
            if (r4 != r8) goto L43
            return r8
        L43:
            java.lang.String r5 = "coroutineScope(...)"
            h.g.b.x.e(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.runWorker(androidx.work.ListenableWorker, androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.model.WorkSpec, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.work.ListenableWorker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupAndRunConstraintTrackingWork(h.c.e<? super androidx.work.ListenableWorker.Result> r14) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork(h.c.e):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(e<? super ListenableWorker.Result> eVar) {
        Executor backgroundExecutor = getBackgroundExecutor();
        x.e(backgroundExecutor, "getBackgroundExecutor(...)");
        return aj.v(bo.f(backgroundExecutor), new AnonymousClass2(null), eVar);
    }
}

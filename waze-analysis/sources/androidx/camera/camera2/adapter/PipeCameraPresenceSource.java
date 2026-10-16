package androidx.camera.camera2.adapter;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.impl.AbstractCameraPresenceSource;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.concurrent.futures.ListenableFutureKt;
import com.google.d.m.a.bm;
import h.a.i;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import h.g.b.am;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PipeCameraPresenceSource extends AbstractCameraPresenceSource {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PipePresenceSrc";
    private final CameraManager cameraManager;
    private final af coroutineScope;
    private br flowCollectionJob;
    private final k<List<CameraId>> idFlow;
    private final AtomicBoolean isMonitoring;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PipeCameraPresenceSource(k<? extends List<CameraId>> kVar, af afVar, List<String> list, Context context) {
        super(list);
        x.f(kVar, "idFlow");
        x.f(afVar, "coroutineScope");
        x.f(list, "initialCameraIds");
        x.f(context, "context");
        this.idFlow = kVar;
        this.coroutineScope = afVar;
        this.isMonitoring = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        x.d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        this.cameraManager = (CameraManager) systemService;
    }

    static final Object fetchData$lambda$0(PipeCameraPresenceSource pipeCameraPresenceSource, CallbackToFutureAdapter.Completer completer) {
        x.f(completer, "completer");
        aj.z(pipeCameraPresenceSource.coroutineScope, null, null, new PipeCameraPresenceSource$fetchData$1$1(pipeCameraPresenceSource, completer, null), 3);
        return "FetchData for PipeCameraPresence0";
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource, androidx.camera.core.impl.Observable
    public bm<List<CameraIdentifier>> fetchData() {
        bm<List<CameraIdentifier>> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.adapter.PipeCameraPresenceSource$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return PipeCameraPresenceSource.fetchData$lambda$0(this.f$0, completer);
            }
        });
        x.e(future, "getFuture(...)");
        return future;
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource
    protected void startMonitoring() {
        if (!this.isMonitoring.compareAndSet(false, true)) {
            Log.i(TAG, "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i(TAG, "Starting to collect camera ID flow.");
        br brVar = this.flowCollectionJob;
        if (brVar != null) {
            brVar.s(null);
        }
        am amVar = new am();
        amVar.f48101a = true;
        final k<List<CameraId>> kVar = this.idFlow;
        this.flowCollectionJob = ai.m(ai.o(ai.K(new k<List<? extends CameraIdentifier>>() { // from class: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements l {
                final /* synthetic */ l $this_unsafeFlow;

                /* renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(l lVar) {
                    this.$this_unsafeFlow = lVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, h.c.e r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1 r0 = (androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1 r0 = new androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        e.b.c.b(r9)
                        goto L80
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        e.b.c.b(r9)
                        kotlinx.coroutines.b.l r7 = r7.$this_unsafeFlow
                        r9 = r0
                        h.c.e r9 = (h.c.e) r9
                        java.util.List r8 = (java.util.List) r8
                        java.lang.Iterable r8 = (java.lang.Iterable) r8
                        java.util.ArrayList r9 = new java.util.ArrayList
                        r9.<init>()
                        java.util.Collection r9 = (java.util.Collection) r9
                        java.util.Iterator r8 = r8.iterator()
                    L46:
                        boolean r2 = r8.hasNext()
                        if (r2 == 0) goto L75
                        java.lang.Object r2 = r8.next()
                        androidx.camera.camera2.pipe.CameraId r2 = (androidx.camera.camera2.pipe.CameraId) r2
                        java.lang.String r2 = r2.m553unboximpl()
                        r4 = 6
                        r5 = 0
                        androidx.camera.core.CameraIdentifier r5 = androidx.camera.core.CameraIdentifier.Factory.create$default(r2, r5, r5, r4, r5)     // Catch: java.lang.Exception -> L5d
                        goto L6f
                    L5d:
                        r4 = move-exception
                        java.lang.String r2 = java.lang.String.valueOf(r2)
                        java.lang.String r6 = "Failed to create CameraIdentifier for pipeId: "
                        java.lang.String r2 = r6.concat(r2)
                        java.lang.Throwable r4 = (java.lang.Throwable) r4
                        java.lang.String r6 = "PipePresenceSrc"
                        android.util.Log.w(r6, r2, r4)
                    L6f:
                        if (r5 == 0) goto L46
                        r9.add(r5)
                        goto L46
                    L75:
                        java.util.List r9 = (java.util.List) r9
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r9, r0)
                        if (r7 != r1) goto L80
                        return r1
                    L80:
                        h.ab r7 = h.ab.f48028a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(l<? super List<? extends CameraIdentifier>> lVar, e eVar) {
                Object objCollect = kVar.collect(new AnonymousClass2(lVar), eVar);
                return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
            }
        }, new AnonymousClass2(amVar, null)), new AnonymousClass3(null)), this.coroutineScope);
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource
    public void stopMonitoring() {
        Log.i(TAG, "Stopping camera ID flow collection.");
        if (this.isMonitoring.compareAndSet(true, false)) {
            br brVar = this.flowCollectionJob;
            if (brVar != null) {
                brVar.s(null);
            }
            this.flowCollectionJob = null;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<List<? extends CameraIdentifier>, e<? super ab>, Object> {
        final /* synthetic */ am $isFirstEmission;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(am amVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$isFirstEmission = amVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = PipeCameraPresenceSource.this.new AnonymousClass2(this.$isFirstEmission, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<CameraIdentifier> list, e<? super ab> eVar) {
            return ((AnonymousClass2) create(list, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                List list = (List) this.L$0;
                Log.d(PipeCameraPresenceSource.TAG, "Flow emitted new camera set: ".concat(i.aM(list, null, null, null, 0, null, 63)));
                if (!PipeCameraPresenceSource.this.isMonitoring.get()) {
                    new Integer(Log.d(PipeCameraPresenceSource.TAG, "Ignoring camera update because monitoring is stopped."));
                } else if (this.$isFirstEmission.f48101a) {
                    Log.i(PipeCameraPresenceSource.TAG, "Handling first camera set, triggering fresh query.");
                    this.label = 1;
                    if (ListenableFutureKt.await(PipeCameraPresenceSource.this.fetchData(), this) == aVar) {
                        return aVar;
                    }
                } else {
                    PipeCameraPresenceSource.this.updateData(list);
                }
                return ab.f48028a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            this.$isFirstEmission.f48101a = false;
            return ab.f48028a;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(List<? extends CameraIdentifier> list, e<? super ab> eVar) {
            return invoke2((List<CameraIdentifier>) list, eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements q<l<? super List<? extends CameraIdentifier>>, Throwable, e<? super ab>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(e<? super AnonymousClass3> eVar) {
            super(3, eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(l<? super List<CameraIdentifier>> lVar, Throwable th, e<? super ab> eVar) {
            AnonymousClass3 anonymousClass3 = PipeCameraPresenceSource.this.new AnonymousClass3(eVar);
            anonymousClass3.L$0 = th;
            return anonymousClass3.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            Throwable th = (Throwable) this.L$0;
            Log.e(PipeCameraPresenceSource.TAG, "Error in camera ID flow collection.", th);
            if (PipeCameraPresenceSource.this.isMonitoring.get()) {
                PipeCameraPresenceSource.this.updateError(th);
            } else {
                new Integer(Log.d(PipeCameraPresenceSource.TAG, "Ignoring error because monitoring is stopped."));
            }
            return ab.f48028a;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(l<? super List<? extends CameraIdentifier>> lVar, Throwable th, e<? super ab> eVar) {
            return invoke2((l<? super List<CameraIdentifier>>) lVar, th, eVar);
        }
    }
}

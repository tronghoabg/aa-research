package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.d.m.a.bm;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.i;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class StillCaptureRequestControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl _requestControl;
    private final FlashControl flashControl;
    private final a mutex;
    private final LinkedList<CaptureRequest> pendingRequests;
    private final UseCaseThreads threads;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(StillCaptureRequestControl stillCaptureRequestControl);
    }

    /* compiled from: WazeSource */
    public final class CaptureRequest {
        private final List<CaptureConfig> captureConfigs;
        private final int captureMode;
        private final int flashType;
        private final CompletableDeferred<List<Void>> result;

        public CaptureRequest(List<CaptureConfig> list, int i2, int i3, CompletableDeferred<List<Void>> completableDeferred) {
            x.f(list, "captureConfigs");
            x.f(completableDeferred, "result");
            this.captureConfigs = list;
            this.captureMode = i2;
            this.flashType = i3;
            this.result = completableDeferred;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CaptureRequest copy$default(CaptureRequest captureRequest, List list, int i2, int i3, CompletableDeferred completableDeferred, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                list = captureRequest.captureConfigs;
            }
            if ((i4 & 2) != 0) {
                i2 = captureRequest.captureMode;
            }
            if ((i4 & 4) != 0) {
                i3 = captureRequest.flashType;
            }
            if ((i4 & 8) != 0) {
                completableDeferred = captureRequest.result;
            }
            return captureRequest.copy(list, i2, i3, completableDeferred);
        }

        public final List<CaptureConfig> component1() {
            return this.captureConfigs;
        }

        public final int component2() {
            return this.captureMode;
        }

        public final int component3() {
            return this.flashType;
        }

        public final CompletableDeferred<List<Void>> component4() {
            return this.result;
        }

        public final CaptureRequest copy(List<CaptureConfig> list, int i2, int i3, CompletableDeferred<List<Void>> completableDeferred) {
            x.f(list, "captureConfigs");
            x.f(completableDeferred, "result");
            return new CaptureRequest(list, i2, i3, completableDeferred);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CaptureRequest)) {
                return false;
            }
            CaptureRequest captureRequest = (CaptureRequest) obj;
            return x.n(this.captureConfigs, captureRequest.captureConfigs) && this.captureMode == captureRequest.captureMode && this.flashType == captureRequest.flashType && x.n(this.result, captureRequest.result);
        }

        public final List<CaptureConfig> getCaptureConfigs() {
            return this.captureConfigs;
        }

        public final int getCaptureMode() {
            return this.captureMode;
        }

        public final int getFlashType() {
            return this.flashType;
        }

        public final CompletableDeferred<List<Void>> getResult() {
            return this.result;
        }

        public int hashCode() {
            return (((((this.captureConfigs.hashCode() * 31) + this.captureMode) * 31) + this.flashType) * 31) + this.result.hashCode();
        }

        public String toString() {
            return "CaptureRequest(captureConfigs=" + this.captureConfigs + ", captureMode=" + this.captureMode + ", flashType=" + this.flashType + ", result=" + this.result + ")";
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$issueCaptureRequests$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ List<CaptureConfig> $captureConfigs;
        final /* synthetic */ int $captureMode;
        final /* synthetic */ int $flashType;
        final /* synthetic */ CompletableDeferred<List<Void>> $signal;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ StillCaptureRequestControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<CaptureConfig> list, int i2, int i3, CompletableDeferred<List<Void>> completableDeferred, StillCaptureRequestControl stillCaptureRequestControl, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$captureConfigs = list;
            this.$captureMode = i2;
            this.$flashType = i3;
            this.$signal = completableDeferred;
            this.this$0 = stillCaptureRequestControl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$captureConfigs, this.$captureMode, this.$flashType, this.$signal, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.StillCaptureRequestControl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$reset$1, reason: invalid class name and case insensitive filesystem */
    final class C01461 extends g implements p<af, e<? super ab>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C01461(e<? super C01461> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return StillCaptureRequestControl.this.new C01461(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01461) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            StillCaptureRequestControl stillCaptureRequestControl;
            a aVar;
            CompletableDeferred<List<Void>> result;
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                StillCaptureRequestControl stillCaptureRequestControl2 = StillCaptureRequestControl.this;
                a aVar3 = stillCaptureRequestControl2.mutex;
                this.L$0 = aVar3;
                this.L$1 = stillCaptureRequestControl2;
                this.label = 1;
                if (aVar3.lock(null, this) == aVar2) {
                    return aVar2;
                }
                stillCaptureRequestControl = stillCaptureRequestControl2;
                aVar = aVar3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stillCaptureRequestControl = (StillCaptureRequestControl) this.L$1;
                aVar = (a) this.L$0;
                c.b(obj);
            }
            while (!stillCaptureRequestControl.pendingRequests.isEmpty()) {
                try {
                    CaptureRequest captureRequest = (CaptureRequest) stillCaptureRequestControl.pendingRequests.poll();
                    if (captureRequest != null && (result = captureRequest.getResult()) != null) {
                        result.b(new ImageCaptureException(3, "Capture request is cancelled due to a reset", null));
                    }
                } catch (Throwable th) {
                    aVar.unlock(null);
                    throw th;
                }
            }
            aVar.unlock(null);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1, reason: invalid class name and case insensitive filesystem */
    final class C01471 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01471(e<? super C01471> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StillCaptureRequestControl.this.submitRequest(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$trySubmitPendingRequests$1, reason: invalid class name and case insensitive filesystem */
    final class C01481 extends g implements p<af, e<? super ab>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        C01481(e<? super C01481> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return StillCaptureRequestControl.this.new C01481(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01481) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:8:0x0028, B:34:0x00bd, B:27:0x008e, B:29:0x009a, B:31:0x00a7), top: B:42:0x0028 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bb -> B:34:0x00bd). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 209
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.StillCaptureRequestControl.C01481.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public StillCaptureRequestControl(FlashControl flashControl, UseCaseThreads useCaseThreads) {
        x.f(flashControl, "flashControl");
        x.f(useCaseThreads, "threads");
        this.flashControl = flashControl;
        this.threads = useCaseThreads;
        this.mutex = i.c();
        this.pendingRequests = new LinkedList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateResultOrEnqueueRequest(final am<? extends List<Void>> amVar, final CaptureRequest captureRequest, final UseCaseCameraRequestControl useCaseCameraRequestControl) {
        amVar.bY(new l() { // from class: androidx.camera.camera2.impl.StillCaptureRequestControl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StillCaptureRequestControl.propagateResultOrEnqueueRequest$lambda$0(this.f$0, amVar, captureRequest, useCaseCameraRequestControl, (Throwable) obj);
            }
        });
    }

    static final ab propagateResultOrEnqueueRequest$lambda$0(StillCaptureRequestControl stillCaptureRequestControl, am amVar, CaptureRequest captureRequest, UseCaseCameraRequestControl useCaseCameraRequestControl, Throwable th) {
        if ((th instanceof ImageCaptureException) && ((ImageCaptureException) th).getImageCaptureError() == 3) {
            aj.z(stillCaptureRequestControl.threads.getSequentialScope(), null, null, new StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1(stillCaptureRequestControl, useCaseCameraRequestControl, captureRequest, null), 3);
        } else {
            CoroutineAdaptersKt.propagateCompletion(amVar, captureRequest.getResult(), th);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitRequest(androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest r7, androidx.camera.camera2.impl.UseCaseCameraRequestControl r8, h.c.e<? super kotlinx.coroutines.am<? extends java.util.List<java.lang.Void>>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.camera.camera2.impl.StillCaptureRequestControl.C01471
            if (r0 == 0) goto L13
            r0 = r9
            androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1 r0 = (androidx.camera.camera2.impl.StillCaptureRequestControl.C01471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1 r0 = new androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            java.lang.String r3 = "CXCP"
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$1
            r8 = r7
            androidx.camera.camera2.impl.UseCaseCameraRequestControl r8 = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) r8
            java.lang.Object r7 = r0.L$0
            androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest r7 = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) r7
            e.b.c.b(r9)
            goto L71
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            e.b.c.b(r9)
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r3)
            if (r9 == 0) goto L62
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "StillCaptureRequestControl: submitting "
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r5 = " at "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r9, r2)
        L62:
            androidx.camera.camera2.impl.FlashControl r9 = r6.flashControl
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.awaitFlashModeUpdate(r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            androidx.camera.camera2.impl.Camera2Logger r0 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r0 = androidx.camera.core.Logger.isDebugEnabled(r3)
            if (r0 == 0) goto L88
            java.lang.String r0 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "StillCaptureRequestControl: Issuing single capture"
            android.util.Log.d(r0, r1)
        L88:
            java.util.List r0 = r7.getCaptureConfigs()
            int r1 = r7.getCaptureMode()
            int r2 = r7.getFlashType()
            java.util.List r8 = r8.issueSingleCaptureAsync(r0, r1, r2, r9)
            androidx.camera.camera2.impl.UseCaseThreads r6 = r6.threads
            kotlinx.coroutines.af r6 = r6.getSequentialScope()
            androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4 r9 = new androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4
            r0 = 0
            r9.<init>(r8, r7, r0)
            h.g.a.p r9 = (h.g.a.p) r9
            r7 = 3
            kotlinx.coroutines.am r6 = kotlinx.coroutines.aj.y(r6, r0, r0, r9, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.StillCaptureRequestControl.submitRequest(androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest, androidx.camera.camera2.impl.UseCaseCameraRequestControl, h.c.e):java.lang.Object");
    }

    private final void trySubmitPendingRequests() {
        aj.z(this.threads.getSequentialScope(), null, null, new C01481(null), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    public final bm<List<Void>> issueCaptureRequests(List<CaptureConfig> list, int i2, int i3) {
        x.f(list, "captureConfigs");
        CompletableDeferred completableDeferredJ = bo.j();
        aj.z(this.threads.getSequentialScope(), null, null, new AnonymousClass1(list, i2, i3, completableDeferredJ, this, null), 3);
        bm<List<Void>> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asListenableFuture$default((am) completableDeferredJ, (Object) null, 1, (Object) null));
        x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
        return bmVarNonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        aj.z(this.threads.getSequentialScope(), null, null, new C01461(null), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        trySubmitPendingRequests();
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements p<af, e<? super List<? extends Void>>, Object> {
        final /* synthetic */ List<am<Void>> $deferredList;
        final /* synthetic */ CaptureRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(List<? extends am<Void>> list, CaptureRequest captureRequest, e<? super AnonymousClass4> eVar) {
            super(2, eVar);
            this.$deferredList = list;
            this.$request = captureRequest;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass4(this.$deferredList, this.$request, eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(af afVar, e<? super List<Void>> eVar) {
            return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                CaptureRequest captureRequest = this.$request;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    String str = Camera2Logger.TRUNCATED_TAG;
                    Objects.toString(captureRequest);
                    android.util.Log.d(str, "StillCaptureRequestControl: Waiting for deferred list from ".concat(String.valueOf(captureRequest)));
                }
                this.label = 1;
                obj = aj.C(this.$deferredList, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            CaptureRequest captureRequest2 = this.$request;
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "StillCaptureRequestControl: Waiting for deferred list from " + captureRequest2 + " done");
            }
            return obj;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(af afVar, e<? super List<? extends Void>> eVar) {
            return invoke2(afVar, (e<? super List<Void>>) eVar);
        }
    }
}

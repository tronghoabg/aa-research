package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class FlashControl implements UseCaseCameraControl {
    private volatile int _flashMode;
    private UseCaseCameraRequestControl _requestControl;
    private volatile ImageCapture.ScreenFlash _screenFlash;
    private CompletableDeferred<ab> _updateSignal;
    private final CameraProperties cameraProperties;
    private int flashMode;
    private ImageCapture.ScreenFlash screenFlash;
    private final State3AControl state3AControl;
    private final UseCaseThreads threads;
    private final TorchControl torchControl;
    private am<ab> updateSignal;
    private final UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(FlashControl flashControl);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        long J$0;
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
            return FlashControl.this.applyScreenFlash(0L, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ ImageCapture.ScreenFlashListener $screenFlashListener;
        final /* synthetic */ long $timeoutMillis;
        int label;
        final /* synthetic */ FlashControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(long j2, FlashControl flashControl, ImageCapture.ScreenFlashListener screenFlashListener, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$timeoutMillis = j2;
            this.this$0 = flashControl;
            this.$screenFlashListener = screenFlashListener;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$timeoutMillis, this.this$0, this.$screenFlashListener, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            long jCurrentTimeMillis = System.currentTimeMillis() + this.$timeoutMillis;
            ImageCapture.ScreenFlash screenFlash = this.this$0.getScreenFlash();
            if (screenFlash != null) {
                screenFlash.apply(jCurrentTimeMillis, this.$screenFlashListener);
            }
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "applyScreenFlash: ScreenFlash.apply() invoked, expirationTimeMillis = " + jCurrentTimeMillis);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ CompletableDeferred<ab> $onApplyCompletedSignal;
        final /* synthetic */ long $timeoutMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CompletableDeferred<ab> completableDeferred, long j2, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$onApplyCompletedSignal = completableDeferred;
            this.$timeoutMillis = j2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass3(this.$onApplyCompletedSignal, this.$timeoutMillis, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "applyScreenFlash: Waiting for ScreenFlashListener to be completed");
                }
                CompletableDeferred<ab> completableDeferred = this.$onApplyCompletedSignal;
                this.label = 1;
                obj = CoroutineAdaptersKt.awaitUntil(completableDeferred, this.$timeoutMillis, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "applyScreenFlash: ScreenFlashListener completed");
                }
            } else {
                Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
                long j2 = this.$timeoutMillis;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "applyScreenFlash: ScreenFlashListener completion timed out after " + j2 + " ms");
                }
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1, reason: invalid class name and case insensitive filesystem */
    final class C01411 extends c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        C01411(e<? super C01411> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlashControl.this.awaitFlashModeUpdate(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    final class C01421 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01421(e<? super C01421> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlashControl.this.startScreenFlashCaptureTasks(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    final class C01431 extends c {
        int label;
        /* synthetic */ Object result;

        C01431(e<? super C01431> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlashControl.this.stopScreenFlashCaptureTasks(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2, reason: invalid class name and case insensitive filesystem */
    final class C01442 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C01442(e<? super C01442> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FlashControl.this.new C01442(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01442) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            ImageCapture.ScreenFlash screenFlash = FlashControl.this.getScreenFlash();
            if (screenFlash != null) {
                screenFlash.clear();
            }
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "screenFlashPostCapture: ScreenFlash.clear() invoked");
            }
            return ab.f48028a;
        }
    }

    public FlashControl(CameraProperties cameraProperties, State3AControl state3AControl, UseCaseThreads useCaseThreads, TorchControl torchControl, UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
        x.f(cameraProperties, "cameraProperties");
        x.f(state3AControl, "state3AControl");
        x.f(useCaseThreads, "threads");
        x.f(torchControl, "torchControl");
        x.f(useFlashModeTorchFor3aUpdate, "useFlashModeTorchFor3aUpdate");
        this.cameraProperties = cameraProperties;
        this.state3AControl = state3AControl;
        this.threads = useCaseThreads;
        this.torchControl = torchControl;
        this.useFlashModeTorchFor3aUpdate = useFlashModeTorchFor3aUpdate;
        this._flashMode = 2;
        this.flashMode = this._flashMode;
        this.screenFlash = this._screenFlash;
        this.updateSignal = bo.h(ab.f48028a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyScreenFlash(long r11, h.c.e<? super kotlinx.coroutines.am<h.ab>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.camera.camera2.impl.FlashControl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1 r0 = (androidx.camera.camera2.impl.FlashControl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1 r0 = new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r11 = r0.J$0
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.CompletableDeferred r0 = (kotlinx.coroutines.CompletableDeferred) r0
            e.b.c.b(r13)
            r7 = r10
            goto L60
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            e.b.c.b(r13)
            kotlinx.coroutines.CompletableDeferred r13 = kotlinx.coroutines.bo.j()
            androidx.camera.camera2.impl.FlashControl$$ExternalSyntheticLambda1 r8 = new androidx.camera.camera2.impl.FlashControl$$ExternalSyntheticLambda1
            r8.<init>()
            int r2 = kotlinx.coroutines.av.f51370a
            kotlinx.coroutines.cj r2 = kotlinx.coroutines.e.ac.f51860a
            h.c.j r2 = (h.c.j) r2
            androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2 r4 = new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2
            r9 = 0
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            h.g.a.p r4 = (h.g.a.p) r4
            r0.L$0 = r13
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r10 = kotlinx.coroutines.aj.v(r2, r4, r0)
            if (r10 == r1) goto L74
            r0 = r13
            r11 = r5
        L60:
            androidx.camera.camera2.impl.UseCaseThreads r10 = r7.threads
            kotlinx.coroutines.af r10 = r10.getScope()
            androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3 r13 = new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3
            r1 = 0
            r13.<init>(r0, r11, r1)
            h.g.a.p r13 = (h.g.a.p) r13
            r11 = 3
            kotlinx.coroutines.am r10 = kotlinx.coroutines.aj.y(r10, r1, r1, r13, r11)
            return r10
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FlashControl.applyScreenFlash(long, h.c.e):java.lang.Object");
    }

    private final am<ab> setExternalFlashAeModeAsync() {
        boolean zIsExternalFlashAeModeSupported = CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.cameraProperties.getMetadata());
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "setExternalFlashAeModeAsync: isExternalFlashAeModeSupported = " + zIsExternalFlashAeModeSupported);
        }
        if (!zIsExternalFlashAeModeSupported) {
            return null;
        }
        am<ab> tryExternalFlashAeModeAsync = this.state3AControl.setTryExternalFlashAeModeAsync(true);
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "setExternalFlashAeModeAsync: need to wait for state3AControl.updateSignal");
        }
        tryExternalFlashAeModeAsync.bY(new l() { // from class: androidx.camera.camera2.impl.FlashControl$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FlashControl.setExternalFlashAeModeAsync$lambda$1$1((Throwable) obj);
            }
        });
        return tryExternalFlashAeModeAsync;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab setExternalFlashAeModeAsync$lambda$1$1(Throwable th) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "setExternalFlashAeModeAsync: state3AControl.updateSignal completed");
        }
        return ab.f48028a;
    }

    public static /* synthetic */ am setFlashAsync$default(FlashControl flashControl, int i2, boolean z, int i3, Object obj) {
        return flashControl.setFlashAsync(i2, z | (!((i3 & 2) == 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab setFlashAsync$lambda$1$1(CompletableDeferred completableDeferred, Throwable th) {
        ab abVar = ab.f48028a;
        completableDeferred.a(abVar);
        return abVar;
    }

    private final am<ab> setTorchForScreenFlash() {
        boolean zShouldUseFlashModeTorch = this.useFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch();
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "setTorchIfRequired: shouldUseFlashModeTorch = " + zShouldUseFlashModeTorch);
        }
        if (!zShouldUseFlashModeTorch) {
            return null;
        }
        am<ab> amVarM266setTorchAsyncOup_wC0$camera_camera2 = this.torchControl.m266setTorchAsyncOup_wC0$camera_camera2(TorchControl.TorchMode.Companion.m277getUSED_AS_FLASHIRs_R8(), false | (!((2 & 2) == 0)), true & ((2 & 4) == 0));
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "setTorchIfRequired: need to wait for torch control to be completed");
        }
        amVarM266setTorchAsyncOup_wC0$camera_camera2.bY(new l() { // from class: androidx.camera.camera2.impl.FlashControl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FlashControl.setTorchForScreenFlash$lambda$1$1((Throwable) obj);
            }
        });
        return amVarM266setTorchAsyncOup_wC0$camera_camera2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab setTorchForScreenFlash$lambda$1$1(Throwable th) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "setTorchIfRequired: torch control completed");
        }
        return ab.f48028a;
    }

    private final void stopRunningTask() {
        CompletableDeferred<ab> completableDeferred = this._updateSignal;
        if (completableDeferred != null) {
            completableDeferred.b(new CameraControl.OperationCanceledException("There is a new flash mode being set or camera was closed"));
        }
        this._updateSignal = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitFlashModeUpdate(h.c.e<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.camera.camera2.impl.FlashControl.C01411
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1 r0 = (androidx.camera.camera2.impl.FlashControl.C01411) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1 r0 = new androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            java.lang.String r3 = "CXCP"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            int r5 = r0.I$0
            e.b.c.b(r6)
            goto L5a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.b.c.b(r6)
            androidx.camera.camera2.impl.Camera2Logger r6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r6 = androidx.camera.core.Logger.isDebugEnabled(r3)
            if (r6 == 0) goto L47
            java.lang.String r6 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r2 = "FlashControl: Waiting for any ongoing update to be completed"
            android.util.Log.d(r6, r2)
        L47:
            int r6 = r5.getFlashMode()
            kotlinx.coroutines.am r5 = r5.getUpdateSignal()
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r5 = r5.m(r0)
            if (r5 == r1) goto L7d
            r5 = r6
        L5a:
            androidx.camera.camera2.impl.Camera2Logger r6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r6 = androidx.camera.core.Logger.isDebugEnabled(r3)
            if (r6 == 0) goto L77
            java.lang.String r6 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "awaitFlashModeUpdate: initialFlashMode = "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r6, r0)
        L77:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FlashControl.awaitFlashModeUpdate(h.c.e):java.lang.Object");
    }

    public final int getFlashMode() {
        return this._flashMode;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    public final ImageCapture.ScreenFlash getScreenFlash() {
        return this._screenFlash;
    }

    public final am<ab> getUpdateSignal() {
        CompletableDeferred<ab> completableDeferred = this._updateSignal;
        return completableDeferred != null ? completableDeferred : bo.h(ab.f48028a);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        this._flashMode = 2;
        this._screenFlash = null;
        stopRunningTask();
        setFlashAsync$default(this, 2, false, 2, null);
    }

    public final am<ab> setFlashAsync(int i2, boolean z) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "setFlashAsync: flashMode = " + i2 + ", requestControl = " + getRequestControl());
        }
        final CompletableDeferred<ab> completableDeferredJ = bo.j();
        if (getRequestControl() != null) {
            this._flashMode = i2;
            if (z) {
                stopRunningTask();
            } else {
                CompletableDeferred<ab> completableDeferred = this._updateSignal;
                if (completableDeferred != null) {
                    CoroutineAdaptersKt.propagateTo(completableDeferredJ, completableDeferred);
                }
            }
            this._updateSignal = completableDeferredJ;
            this.state3AControl.setFlashModeAsync(i2).bY(new l() { // from class: androidx.camera.camera2.impl.FlashControl$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return FlashControl.setFlashAsync$lambda$1$1(completableDeferredJ, (Throwable) obj);
                }
            });
        } else {
            completableDeferredJ.b(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return completableDeferredJ;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        setFlashAsync(this._flashMode, false);
    }

    public final void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this._screenFlash = screenFlash;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (kotlinx.coroutines.aj.C(r4, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startScreenFlashCaptureTasks(h.c.e<? super h.ab> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.impl.FlashControl.C01421
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1 r0 = (androidx.camera.camera2.impl.FlashControl.C01421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1 r0 = new androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L7f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            java.util.List r4 = (java.util.List) r4
            e.b.c.b(r7)
            goto L5a
        L3e:
            e.b.c.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2 = r7
            java.util.List r2 = (java.util.List) r2
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r4
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = r6.applyScreenFlash(r4, r0)
            if (r7 == r1) goto L82
            r4 = r2
        L5a:
            r2.add(r7)
            kotlinx.coroutines.am r7 = r6.setExternalFlashAeModeAsync()
            if (r7 == 0) goto L66
            r4.add(r7)
        L66:
            kotlinx.coroutines.am r6 = r6.setTorchForScreenFlash()
            if (r6 == 0) goto L6f
            r4.add(r6)
        L6f:
            java.util.Collection r4 = (java.util.Collection) r4
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.aj.C(r4, r0)
            if (r6 != r1) goto L7f
            goto L82
        L7f:
            h.ab r6 = h.ab.f48028a
            return r6
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FlashControl.startScreenFlashCaptureTasks(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopScreenFlashCaptureTasks(h.c.e<? super h.ab> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.impl.FlashControl.C01431
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1 r0 = (androidx.camera.camera2.impl.FlashControl.C01431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1 r0 = new androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            int r7 = kotlinx.coroutines.av.f51370a
            kotlinx.coroutines.cj r7 = kotlinx.coroutines.e.ac.f51860a
            h.c.j r7 = (h.c.j) r7
            androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2 r2 = new androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2
            r4 = 0
            r2.<init>(r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.v(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            androidx.camera.camera2.impl.CameraProperties r7 = r6.cameraProperties
            androidx.camera.camera2.pipe.CameraMetadata r7 = r7.getMetadata()
            boolean r7 = androidx.camera.camera2.impl.CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(r7)
            if (r7 == 0) goto L5b
            androidx.camera.camera2.impl.State3AControl r7 = r6.state3AControl
            r0 = 0
            r7.setTryExternalFlashAeModeAsync(r0)
        L5b:
            androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate r7 = r6.useFlashModeTorchFor3aUpdate
            boolean r7 = r7.shouldUseFlashModeTorch()
            if (r7 == 0) goto L72
            androidx.camera.camera2.impl.TorchControl r0 = r6.torchControl
            androidx.camera.camera2.impl.TorchControl$TorchMode$Companion r6 = androidx.camera.camera2.impl.TorchControl.TorchMode.Companion
            int r1 = r6.m275getOFFIRs_R8()
            r4 = 2
            r5 = 0
            r2 = 0
            r3 = 1
            androidx.camera.camera2.impl.TorchControl.m263setTorchAsyncOup_wC0$camera_camera2$default(r0, r1, r2, r3, r4, r5)
        L72:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FlashControl.stopScreenFlashCaptureTasks(h.c.e):java.lang.Object");
    }

    public static /* synthetic */ void getFlashMode$annotations() {
    }

    private static /* synthetic */ void get_flashMode$annotations() {
    }
}

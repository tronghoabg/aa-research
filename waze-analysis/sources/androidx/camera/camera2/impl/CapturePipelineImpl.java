package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CaptureConfigAdapter;
import androidx.camera.camera2.adapter.FrameMetadataConverter;
import androidx.camera.camera2.compat.workaround.FlashAvailabilityCheckerKt;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.camera2.config.UseCaseCameraScope;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.d.m.a.bm;
import g.a.a;
import h.a.i;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.d.b;
import h.f;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public final class CapturePipelineImpl implements CapturePipeline {
    private final CaptureConfigAdapter configAdapter;
    private final FlashControl flashControl;
    private FrameMetadata frameMetadata;
    private final f hasFlashUnit$delegate;
    private final ComboRequestListener requestListener;
    private int template;
    private final UseCaseThreads threads;
    private final TorchControl torchControl;
    private final UseCaseCameraContext useCaseCameraContext;
    private final f useCaseCameraState$delegate;
    private final a<UseCaseCameraState> useCaseCameraStateProvider;
    private final UseTorchAsFlash useTorchAsFlash;
    private final VideoUsageControl videoUsageControl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    final class PipelineTask {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ PipelineTask[] $VALUES;
        public static final PipelineTask PRE_CAPTURE = new PipelineTask("PRE_CAPTURE", 0);
        public static final PipelineTask MAIN_CAPTURE = new PipelineTask("MAIN_CAPTURE", 1);
        public static final PipelineTask POST_CAPTURE = new PipelineTask("POST_CAPTURE", 2);

        private static final /* synthetic */ PipelineTask[] $values() {
            return new PipelineTask[]{PRE_CAPTURE, MAIN_CAPTURE, POST_CAPTURE};
        }

        static {
            PipelineTask[] pipelineTaskArr$values = $values();
            $VALUES = pipelineTaskArr$values;
            $ENTRIES = b.a(pipelineTaskArr$values);
        }

        private PipelineTask(String str, int i2) {
        }

        public static h.d.a<PipelineTask> getEntries() {
            return $ENTRIES;
        }

        public static PipelineTask valueOf(String str) {
            return (PipelineTask) Enum.valueOf(PipelineTask.class, str);
        }

        public static PipelineTask[] values() {
            return (PipelineTask[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.aePreCaptureApplyCapture(null, 0L, 0, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1, reason: invalid class name and case insensitive filesystem */
    final class C01271 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01271(e<? super C01271> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.defaultCapture(null, 0, 0, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$defaultNoFlashCapture$1, reason: invalid class name and case insensitive filesystem */
    final class C01281 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C01281(e<? super C01281> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.defaultNoFlashCapture(null, 0, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1, reason: invalid class name and case insensitive filesystem */
    final class C01291 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01291(e<? super C01291> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.getFrameMetadata(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    final class C01301 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01301(e<? super C01301> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.invokeCaptureTasks(null, 0, 0, 0, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    final class C01311 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01311(e<? super C01311> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.invokeScreenFlashPostCaptureTasks(0, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    final class C01321 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01321(e<? super C01321> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.invokeScreenFlashPreCaptureTasks(0, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1, reason: invalid class name and case insensitive filesystem */
    final class C01331 extends c {
        int label;
        /* synthetic */ Object result;

        C01331(e<? super C01331> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.isPhysicalFlashRequired(0, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$isTorchAsFlash$2, reason: invalid class name and case insensitive filesystem */
    final class C01342 extends g implements l<e<? super FrameMetadata>, Object> {
        int label;

        C01342(e<? super C01342> eVar) {
            super(1, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return CapturePipelineImpl.this.new C01342(eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super FrameMetadata> eVar) {
            return ((C01342) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.label = 1;
            Object frameMetadata = CapturePipelineImpl.this.getFrameMetadata(this);
            return frameMetadata == aVar ? aVar : frameMetadata;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$lockAf$1, reason: invalid class name and case insensitive filesystem */
    final class C01351 extends c {
        long J$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C01351(e<? super C01351> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.lockAf(0L, false, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$1, reason: invalid class name and case insensitive filesystem */
    final class C01361 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C01361(e<? super C01361> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.screenFlashCapture(null, 0, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$1, reason: invalid class name and case insensitive filesystem */
    final class C01371 extends c {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C01371(e<? super C01371> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.torchApplyCapture(null, 0, 0L, null, false, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1, reason: invalid class name and case insensitive filesystem */
    final class C01381 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01381(e<? super C01381> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.torchAsFlashCapture(null, 0, 0, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1, reason: invalid class name and case insensitive filesystem */
    final class C01391 extends c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01391(e<? super C01391> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.unlockAf(0L, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1, reason: invalid class name and case insensitive filesystem */
    final class C01401 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01401(e<? super C01401> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.waitForResult(0L, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<af, e<? super FrameInfo>, Object> {
        final /* synthetic */ ResultListener $resultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ResultListener resultListener, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$resultListener = resultListener;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass3(this.$resultListener, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super FrameInfo> eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.label = 1;
            Object objC = this.$resultListener.getResult().c(this);
            return objC == aVar ? aVar : objC;
        }
    }

    public CapturePipelineImpl(CaptureConfigAdapter captureConfigAdapter, FlashControl flashControl, TorchControl torchControl, VideoUsageControl videoUsageControl, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener, UseTorchAsFlash useTorchAsFlash, final CameraProperties cameraProperties, a<UseCaseCameraState> aVar, UseCaseCameraContext useCaseCameraContext) {
        x.f(captureConfigAdapter, "configAdapter");
        x.f(flashControl, "flashControl");
        x.f(torchControl, "torchControl");
        x.f(videoUsageControl, "videoUsageControl");
        x.f(useCaseThreads, "threads");
        x.f(comboRequestListener, "requestListener");
        x.f(useTorchAsFlash, "useTorchAsFlash");
        x.f(cameraProperties, "cameraProperties");
        x.f(aVar, "useCaseCameraStateProvider");
        x.f(useCaseCameraContext, "useCaseCameraContext");
        this.configAdapter = captureConfigAdapter;
        this.flashControl = flashControl;
        this.torchControl = torchControl;
        this.videoUsageControl = videoUsageControl;
        this.threads = useCaseThreads;
        this.requestListener = comboRequestListener;
        this.useTorchAsFlash = useTorchAsFlash;
        this.useCaseCameraStateProvider = aVar;
        this.useCaseCameraContext = useCaseCameraContext;
        this.hasFlashUnit$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(FlashAvailabilityCheckerKt.isFlashAvailable(cameraProperties, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1))));
            }
        });
        this.useCaseCameraState$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.useCaseCameraStateProvider.get();
            }
        });
        this.template = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:14:0x0044, B:58:0x0167, B:60:0x016f), top: B:95:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e9  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [h.c.e, h.c.j, kotlinx.coroutines.ag] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aePreCaptureApplyCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r22, long r23, int r25, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r26, h.c.e<? super java.util.List<? extends kotlinx.coroutines.am<java.lang.Void>>> r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.aePreCaptureApplyCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, long, int, java.util.List, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object defaultCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r9, int r10, int r11, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r12, h.c.e<? super java.util.List<? extends kotlinx.coroutines.am<java.lang.Void>>> r13) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r13 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C01271
            if (r0 == 0) goto L13
            r0 = r13
            androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C01271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1
            r0.<init>(r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L53
            if (r1 == r5) goto L41
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            e.b.c.b(r13)
            return r13
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            e.b.c.b(r13)
            return r13
        L3d:
            e.b.c.b(r13)
            return r13
        L41:
            int r10 = r7.I$0
            java.lang.Object r9 = r7.L$1
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r9 = r7.L$0
            androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams r9 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) r9
            e.b.c.b(r13)
        L4f:
            r2 = r9
            r5 = r10
            r6 = r12
            goto L6b
        L53:
            e.b.c.b(r13)
            boolean r13 = r8.getHasFlashUnit()
            if (r13 == 0) goto La0
            r7.L$0 = r9
            r7.L$1 = r12
            r7.I$0 = r10
            r7.label = r5
            java.lang.Object r13 = r8.isPhysicalFlashRequired(r11, r7)
            if (r13 != r0) goto L4f
            goto La9
        L6b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r9 = r13.booleanValue()
            if (r9 == 0) goto L78
            long r10 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_3A_WITH_FLASH_TIMEOUT_IN_NS$p()
            goto L7c
        L78:
            long r10 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_3A_TIMEOUT_IN_NS$p()
        L7c:
            r12 = 0
            if (r9 != 0) goto L90
            if (r5 != 0) goto L82
            goto L90
        L82:
            r7.L$0 = r12
            r7.L$1 = r12
            r7.label = r3
            java.lang.Object r8 = r8.defaultNoFlashCapture(r2, r5, r6, r7)
            if (r8 != r0) goto L8f
            goto La9
        L8f:
            return r8
        L90:
            r7.L$0 = r12
            r7.L$1 = r12
            r7.label = r4
            r1 = r8
            r3 = r10
            java.lang.Object r8 = r1.aePreCaptureApplyCapture(r2, r3, r5, r6, r7)
            if (r8 != r0) goto L9f
            goto La9
        L9f:
            return r8
        La0:
            r1 = r8
            r7.label = r2
            java.lang.Object r8 = r1.defaultNoFlashCapture(r9, r10, r12, r7)
            if (r8 != r0) goto Laa
        La9:
            return r0
        Laa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.defaultCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, int, java.util.List, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object defaultNoFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r10, int r11, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r12, h.c.e<? super java.util.List<? extends kotlinx.coroutines.am<java.lang.Void>>> r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.defaultNoFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, java.util.List, h.c.e):java.lang.Object");
    }

    private final l<FrameMetadata, Boolean> getConvergeCondition(final boolean z) {
        return new l() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CapturePipelineImpl.getConvergeCondition$lambda$0(z, (FrameMetadata) obj));
            }
        };
    }

    static final boolean getConvergeCondition$lambda$0(boolean z, FrameMetadata frameMetadata) {
        x.f(frameMetadata, "frameMetadata");
        return ConvergenceUtils.is3AConverged(FrameMetadataConverter.INSTANCE.toCameraCaptureResult(frameMetadata), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFrameMetadata(h.c.e<? super androidx.camera.camera2.pipe.FrameMetadata> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C01291
            if (r0 == 0) goto L13
            r0 = r10
            androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C01291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1
            r0.<init>(r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.label
            java.lang.String r8 = "CXCP"
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r0 = r5.L$0
            androidx.camera.camera2.impl.CapturePipelineImpl r0 = (androidx.camera.camera2.impl.CapturePipelineImpl) r0
            e.b.c.b(r10)
            r1 = r9
            goto L63
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            e.b.c.b(r10)
            androidx.camera.camera2.pipe.FrameMetadata r10 = r9.frameMetadata
            if (r10 != 0) goto L71
            androidx.camera.camera2.impl.Camera2Logger r10 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r10 = androidx.camera.core.Logger.isDebugEnabled(r8)
            if (r10 == 0) goto L4f
            java.lang.String r10 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "getFrameMetadata: waiting for result"
            android.util.Log.d(r10, r1)
        L4f:
            r10 = r2
            long r2 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_FLASH_REQUIRED_TIMEOUT_IN_NS$p()
            r5.L$0 = r9
            r5.label = r10
            r6 = 2
            r7 = 0
            r4 = 0
            r1 = r9
            java.lang.Object r10 = waitForResult$default(r1, r2, r4, r5, r6, r7)
            if (r10 == r0) goto L70
            r0 = r1
        L63:
            androidx.camera.camera2.pipe.FrameInfo r10 = (androidx.camera.camera2.pipe.FrameInfo) r10
            if (r10 == 0) goto L6c
            androidx.camera.camera2.pipe.FrameMetadata r9 = r10.getMetadata()
            goto L6d
        L6c:
            r9 = 0
        L6d:
            r0.frameMetadata = r9
            goto L72
        L70:
            return r0
        L71:
            r1 = r9
        L72:
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r8)
            if (r9 == 0) goto L92
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            androidx.camera.camera2.pipe.FrameMetadata r10 = access$getFrameMetadata$p(r1)
            java.util.Objects.toString(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "getFrameMetadata: frameMetadata = "
            java.lang.String r10 = r0.concat(r10)
            android.util.Log.d(r9, r10)
        L92:
            androidx.camera.camera2.pipe.FrameMetadata r9 = r1.frameMetadata
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.getFrameMetadata(h.c.e):java.lang.Object");
    }

    private final boolean getHasFlashUnit() {
        return ((Boolean) this.hasFlashUnit$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UseCaseCameraState getUseCaseCameraState() {
        return (UseCaseCameraState) this.useCaseCameraState$delegate.getValue();
    }

    private final Object invoke(List<? extends PipelineTask> list, MainCaptureParams mainCaptureParams, l<? super e<? super ab>, ? extends Object> lVar, l<? super e<? super ab>, ? extends Object> lVar2, e<? super List<? extends am<Void>>> eVar) {
        List<am<Void>> listD;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            Objects.toString(list);
            android.util.Log.d(str, "CapturePipeline#List<PipelineTask>.invoke: tasks = ".concat(String.valueOf(list)));
        }
        if (list.contains(PipelineTask.PRE_CAPTURE)) {
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
            }
            lVar.invoke(eVar);
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
            }
        }
        if (list.contains(PipelineTask.MAIN_CAPTURE)) {
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
            }
            if (mainCaptureParams == null) {
                throw new IllegalStateException("Required value was null.");
            }
            listD = submitRequestInternal(mainCaptureParams);
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
            }
        } else {
            listD = i.d(bo.h(null));
        }
        if (list.contains(PipelineTask.POST_CAPTURE)) {
            aj.z(this.threads.getSequentialScope(), null, null, new CapturePipelineImpl$invoke$7$1(listD, lVar2, null), 3);
        }
        return listD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeCaptureTasks(java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r10, int r11, int r12, int r13, androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r14, h.c.e<? super java.util.List<? extends kotlinx.coroutines.am<java.lang.Void>>> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.invokeCaptureTasks(java.util.List, int, int, int, androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isPhysicalFlashRequired(int r6, h.c.e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C01331
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C01331) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            e.b.c.b(r7)
            goto L4f
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r7)
            if (r6 == 0) goto L46
            if (r6 == r4) goto L44
            r5 = 2
            if (r6 == r5) goto L6b
            r5 = 3
            if (r6 != r5) goto L3e
            goto L6b
        L3e:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r6)
            throw r5
        L44:
            r3 = r4
            goto L6b
        L46:
            r0.label = r4
            java.lang.Object r7 = r5.getFrameMetadata(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            androidx.camera.camera2.pipe.FrameMetadata r7 = (androidx.camera.camera2.pipe.FrameMetadata) r7
            if (r7 == 0) goto L6b
            android.hardware.camera2.CaptureResult$Key r5 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.String r6 = "CONTROL_AE_STATE"
            h.g.b.x.e(r5, r6)
            java.lang.Object r5 = r7.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L63
            goto L6b
        L63:
            int r5 = r5.intValue()
            r6 = 4
            if (r5 != r6) goto L6b
            goto L44
        L6b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.isPhysicalFlashRequired(int, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isTorchAsFlash(int i2, e<? super Boolean> eVar) {
        if (getTemplate() == 3 || i2 == 1) {
            return true;
        }
        return this.useTorchAsFlash.shouldUseTorchAsFlash(new C01342(null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lockAf(long r26, boolean r28, h.c.e<? super androidx.camera.camera2.pipe.Result3A> r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.lockAf(long, boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object screenFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r7, int r8, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r9, h.c.e<? super java.util.List<? extends kotlinx.coroutines.am<java.lang.Void>>> r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.screenFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, java.util.List, h.c.e):java.lang.Object");
    }

    private final List<am<Void>> submitRequestInternal(MainCaptureParams mainCaptureParams) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CapturePipeline#submitRequestInternal; Submitting " + mainCaptureParams.getConfigs() + " with CameraPipe");
        }
        ArrayList arrayList = new ArrayList();
        List<CaptureConfig> configs = mainCaptureParams.getConfigs();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = configs.iterator();
        while (true) {
            Request requestM185mapToRequestnAberiA = null;
            if (!it.hasNext()) {
                break;
            }
            CaptureConfig captureConfig = (CaptureConfig) it.next();
            final CompletableDeferred completableDeferredJ = bo.j();
            arrayList.add(completableDeferredJ);
            try {
                requestM185mapToRequestnAberiA = this.configAdapter.m185mapToRequestnAberiA(captureConfig, mainCaptureParams.m252getRequestTemplatefGx8uWA(), mainCaptureParams.getSessionConfigOptions(), i.d(new Request.Listener() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$requests$1$1
                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public void onAborted(Request request) {
                        x.f(request, "request");
                        completableDeferredJ.b(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onBufferLost-DlC0U5Y */
                    public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onBufferLost-iiEMlm4 */
                    public /* synthetic */ void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onComplete-CcXjc1I */
                    public /* synthetic */ void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                        Request.Listener.CC.m854$default$onCompleteCcXjc1I(this, requestMetadata, j2, frameInfo);
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onFailed-CcXjc1I */
                    public void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
                        x.f(requestMetadata, "requestMetadata");
                        x.f(requestFailure, "requestFailure");
                        completableDeferredJ.b(new ImageCaptureException(2, "Capture request failed with reason " + requestFailure.getReason(), null));
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onPartialCaptureResult-CcXjc1I */
                    public /* synthetic */ void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
                        Request.Listener.CC.m856$default$onPartialCaptureResultCcXjc1I(this, requestMetadata, j2, frameMetadata);
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onReadoutStarted-mP9r-9w */
                    public /* synthetic */ void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public /* synthetic */ void onRequestSequenceAborted(RequestMetadata requestMetadata) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onRequestSequenceCompleted-RuT0dZU */
                    public /* synthetic */ void mo193onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j2) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public /* synthetic */ void onRequestSequenceCreated(RequestMetadata requestMetadata) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public /* synthetic */ void onRequestSequenceSubmitted(RequestMetadata requestMetadata) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onStarted-uGKBvU4 */
                    public /* synthetic */ void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) {
                        x.f(requestMetadata, "requestMetadata");
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onTotalCaptureResult-CcXjc1I */
                    public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                        x.f(requestMetadata, "requestMetadata");
                        x.f(frameInfo, "totalCaptureResult");
                        completableDeferredJ.a(null);
                    }
                }));
            } catch (IllegalStateException e2) {
                IllegalStateException illegalStateException = e2;
                if (Logger.isInfoEnabled(Log.TAG)) {
                    android.util.Log.i(Camera2Logger.TRUNCATED_TAG, "CapturePipeline#submitRequestInternal: configAdapter.mapToRequest failed!", illegalStateException);
                }
                completableDeferredJ.b(new ImageCaptureException(2, "Capture request failed with reason ".concat(String.valueOf(e2.getMessage())), illegalStateException));
            }
            if (requestM185mapToRequestnAberiA != null) {
                arrayList2.add(requestM185mapToRequestnAberiA);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return arrayList;
        }
        aj.z(this.threads.getSequentialScope(), null, null, new CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1(null, this, arrayList, arrayList3), 3);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object torchApplyCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r26, int r27, long r28, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r30, boolean r31, h.c.e<? super java.util.List<? extends kotlinx.coroutines.am<java.lang.Void>>> r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.torchApplyCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, long, java.util.List, boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object torchAsFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r10, int r11, int r12, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r13, h.c.e<? super java.util.List<? extends kotlinx.coroutines.am<java.lang.Void>>> r14) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C01381
            if (r0 == 0) goto L13
            r0 = r14
            androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C01381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1
            r0.<init>(r14)
        L18:
            r8 = r0
            java.lang.Object r14 = r8.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            e.b.c.b(r14)
            return r14
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            e.b.c.b(r14)
            return r14
        L3b:
            int r10 = r8.I$0
            java.lang.Object r11 = r8.L$1
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r8.L$0
            androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams r12 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) r12
            e.b.c.b(r14)
            r6 = r11
            r11 = r10
            r10 = r12
            goto L78
        L4c:
            e.b.c.b(r14)
            androidx.camera.camera2.impl.Camera2Logger r14 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            java.lang.String r14 = "CXCP"
            boolean r14 = androidx.camera.core.Logger.isDebugEnabled(r14)
            if (r14 == 0) goto L62
            java.lang.String r14 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#torchAsFlashCapture"
            android.util.Log.d(r14, r1)
        L62:
            boolean r14 = r9.getHasFlashUnit()
            if (r14 == 0) goto Lad
            r8.L$0 = r10
            r8.L$1 = r13
            r8.I$0 = r11
            r8.label = r4
            java.lang.Object r14 = r9.isPhysicalFlashRequired(r12, r8)
            if (r14 != r0) goto L77
            goto Lbb
        L77:
            r6 = r13
        L78:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r12 = r14.booleanValue()
            if (r12 == 0) goto Lab
            androidx.camera.camera2.compat.workaround.UseTorchAsFlash r12 = r9.useTorchAsFlash
            r13 = r4
            r14 = r5
            long r4 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_3A_WITH_FLASH_TIMEOUT_IN_NS$p()
            boolean r12 = r12.shouldDisableAePrecapture()
            r1 = 0
            if (r12 != 0) goto L99
            androidx.camera.camera2.impl.VideoUsageControl r12 = r9.videoUsageControl
            boolean r12 = r12.isInVideoUsage()
            if (r12 != 0) goto L99
            r7 = r13
            goto L9a
        L99:
            r7 = r1
        L9a:
            r8.L$0 = r14
            r8.L$1 = r14
            r8.label = r3
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.Object r9 = r1.torchApplyCapture(r2, r3, r4, r6, r7, r8)
            if (r9 != r0) goto Laa
            goto Lbb
        Laa:
            return r9
        Lab:
            r3 = r11
            r13 = r6
        Lad:
            r1 = r9
            r14 = r5
            r8.L$0 = r14
            r8.L$1 = r14
            r8.label = r2
            java.lang.Object r9 = r1.defaultNoFlashCapture(r10, r11, r13, r8)
            if (r9 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.torchAsFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, int, java.util.List, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.camera.camera2.impl.CapturePipelineImpl] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.AutoCloseable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unlockAf(long r15, h.c.e<? super androidx.camera.camera2.pipe.Result3A> r17) throws java.lang.Exception {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C01391
            if (r1 == 0) goto L15
            r1 = r0
            androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1 r1 = (androidx.camera.camera2.impl.CapturePipelineImpl.C01391) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1 r1 = new androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1
            r1.<init>(r0)
        L1a:
            r10 = r1
            java.lang.Object r0 = r10.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r10.label
            r13 = 3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L43
            if (r2 == r3) goto L38
            if (r2 != r13) goto L30
            e.b.c.b(r0)
            return r0
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L38:
            java.lang.Object r14 = r10.L$0
            java.lang.AutoCloseable r14 = (java.lang.AutoCloseable) r14
            e.b.c.b(r0)     // Catch: java.lang.Throwable -> L40
            goto L7a
        L40:
            r0 = move-exception
            r1 = r0
            goto L8c
        L43:
            long r5 = r10.J$0
            e.b.c.b(r0)
        L48:
            r8 = r5
            goto L5f
        L4a:
            e.b.c.b(r0)
            androidx.camera.camera2.config.UseCaseCameraContext r14 = r14.useCaseCameraContext
            androidx.camera.camera2.pipe.CameraGraph r14 = r14.getGraph()
            r5 = r15
            r10.J$0 = r5
            r10.label = r4
            java.lang.Object r0 = r14.acquireSession(r10)
            if (r0 == r1) goto L92
            goto L48
        L5f:
            r14 = r0
            java.lang.AutoCloseable r14 = (java.lang.AutoCloseable) r14
            r2 = r14
            androidx.camera.camera2.pipe.CameraGraph$Session r2 = (androidx.camera.camera2.pipe.CameraGraph.Session) r2     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L40
            r10.L$0 = r14     // Catch: java.lang.Throwable -> L40
            r10.label = r3     // Catch: java.lang.Throwable -> L40
            r11 = 29
            r12 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.Object r0 = androidx.camera.camera2.pipe.CameraGraph.Session.CC.unlock3A$default(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L40
            if (r0 == r1) goto L92
        L7a:
            kotlinx.coroutines.am r0 = (kotlinx.coroutines.am) r0     // Catch: java.lang.Throwable -> L40
            r2 = 0
            h.a.r.y(r14, r2)
            r10.L$0 = r2
            r10.label = r13
            java.lang.Object r14 = r0.c(r10)
            if (r14 != r1) goto L8b
            goto L92
        L8b:
            return r14
        L8c:
            throw r1     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            h.a.r.y(r14, r1)
            throw r0
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.unlockAf(long, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForResult(long r9, h.g.a.l<? super androidx.camera.camera2.pipe.FrameInfo, java.lang.Boolean> r11, h.c.e<? super androidx.camera.camera2.pipe.FrameInfo> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C01401
            if (r0 == 0) goto L13
            r0 = r12
            androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C01401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r9 = r0.L$0
            androidx.camera.camera2.impl.ResultListener r9 = (androidx.camera.camera2.impl.ResultListener) r9
            e.b.c.b(r12)
            goto L75
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            e.b.c.b(r12)
            androidx.camera.camera2.impl.ResultListener r12 = new androidx.camera.camera2.impl.ResultListener
            r12.<init>(r9, r11)
            androidx.camera.camera2.impl.ComboRequestListener r11 = r8.requestListener
            r2 = r12
            androidx.camera.camera2.pipe.Request$Listener r2 = (androidx.camera.camera2.pipe.Request.Listener) r2
            androidx.camera.camera2.impl.UseCaseThreads r4 = r8.threads
            java.util.concurrent.Executor r4 = r4.getSequentialExecutor()
            r11.addListener(r2, r4)
            androidx.camera.camera2.impl.UseCaseThreads r11 = r8.threads
            kotlinx.coroutines.af r11 = r11.getSequentialScope()
            androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$resultListener$1$1 r2 = new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$resultListener$1$1
            r4 = 0
            r2.<init>(r12, r8, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r5 = 3
            kotlinx.coroutines.aj.z(r11, r4, r4, r2, r5)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 / r5
            androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3 r11 = new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3
            r11.<init>(r12, r4)
            h.g.a.p r11 = (h.g.a.p) r11
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.aj.I(r9, r11, r0)
            if (r9 == r1) goto L82
            r7 = r12
            r12 = r9
            r9 = r7
        L75:
            r10 = r12
            androidx.camera.camera2.pipe.FrameInfo r10 = (androidx.camera.camera2.pipe.FrameInfo) r10
            if (r10 != 0) goto L81
            androidx.camera.camera2.impl.ComboRequestListener r8 = r8.requestListener
            androidx.camera.camera2.pipe.Request$Listener r9 = (androidx.camera.camera2.pipe.Request.Listener) r9
            r8.removeListener(r9)
        L81:
            return r12
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.waitForResult(long, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object waitForResult$default(CapturePipelineImpl capturePipelineImpl, long j2, l lVar, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = new l() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    CapturePipelineImpl.waitForResult$lambda$0((FrameInfo) obj2);
                    return true;
                }
            };
        }
        return capturePipelineImpl.waitForResult(j2, lVar, eVar);
    }

    static final boolean waitForResult$lambda$0(FrameInfo frameInfo) {
        x.f(frameInfo, "<unused var>");
        return true;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public Object getCameraCapturePipeline(final int i2, final int i3, final int i4, e<? super CameraCapturePipeline> eVar) {
        return new CameraCapturePipeline() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl.getCameraCapturePipeline.2
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public bm<Void> invokePostCapture() {
                final af scope = CapturePipelineImpl.this.threads.getScope();
                final CapturePipelineImpl capturePipelineImpl = CapturePipelineImpl.this;
                final int i5 = i2;
                final int i6 = i3;
                final int i7 = i4;
                bm<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ int $captureMode$inlined;
                        final /* synthetic */ CallbackToFutureAdapter.Completer $completer;
                        final /* synthetic */ int $flashMode$inlined;
                        final /* synthetic */ int $flashType$inlined;
                        Object L$0;
                        int label;
                        final /* synthetic */ CapturePipelineImpl this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(CallbackToFutureAdapter.Completer completer, e eVar, CapturePipelineImpl capturePipelineImpl, int i2, int i3, int i4) {
                            super(2, eVar);
                            this.$completer = completer;
                            this.this$0 = capturePipelineImpl;
                            this.$captureMode$inlined = i2;
                            this.$flashMode$inlined = i3;
                            this.$flashType$inlined = i4;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass1(this.$completer, eVar, this.this$0, this.$captureMode$inlined, this.$flashMode$inlined, this.$flashType$inlined);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
                        
                            if (kotlinx.coroutines.aj.E((java.util.Collection) r13, r10) == r0) goto L18;
                         */
                        @Override // h.c.b.a.a
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
                            /*
                                r12 = this;
                                h.c.a.a r0 = h.c.a.a.f48038a
                                int r1 = r12.label
                                r2 = 2
                                r3 = 1
                                if (r1 == 0) goto L26
                                if (r1 == r3) goto L1c
                                if (r1 != r2) goto L14
                                java.lang.Object r12 = r12.L$0
                                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r12 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r12
                                e.b.c.b(r13)
                                goto L58
                            L14:
                                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                                r12.<init>(r13)
                                throw r12
                            L1c:
                                java.lang.Object r1 = r12.L$0
                                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r1 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r1
                                e.b.c.b(r13)
                                r10 = r12
                                r12 = r1
                                goto L4b
                            L26:
                                e.b.c.b(r13)
                                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r13 = r12.$completer
                                r1 = r12
                                h.c.e r1 = (h.c.e) r1
                                androidx.camera.camera2.impl.CapturePipelineImpl r4 = r12.this$0
                                androidx.camera.camera2.impl.CapturePipelineImpl$PipelineTask r1 = androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.POST_CAPTURE
                                java.util.List r5 = h.a.i.d(r1)
                                int r6 = r12.$captureMode$inlined
                                int r7 = r12.$flashMode$inlined
                                int r8 = r12.$flashType$inlined
                                r12.L$0 = r13
                                r12.label = r3
                                r9 = 0
                                r10 = r12
                                java.lang.Object r12 = androidx.camera.camera2.impl.CapturePipelineImpl.access$invokeCaptureTasks(r4, r5, r6, r7, r8, r9, r10)
                                if (r12 == r0) goto L5f
                                r11 = r13
                                r13 = r12
                                r12 = r11
                            L4b:
                                java.util.Collection r13 = (java.util.Collection) r13
                                r10.L$0 = r12
                                r10.label = r2
                                java.lang.Object r13 = kotlinx.coroutines.aj.E(r13, r10)
                                if (r13 != r0) goto L58
                                goto L5f
                            L58:
                                r13 = 0
                                r12.set(r13)
                                h.ab r12 = h.ab.f48028a
                                return r12
                            L5f:
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer<T> completer) {
                        x.f(completer, "completer");
                        return aj.z(scope, null, null, new AnonymousClass1(completer, null, capturePipelineImpl, i5, i6, i7), 3);
                    }
                });
                x.e(future, "getFuture(...)");
                return future;
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public bm<Void> invokePreCapture() {
                final af scope = CapturePipelineImpl.this.threads.getScope();
                final CapturePipelineImpl capturePipelineImpl = CapturePipelineImpl.this;
                final int i5 = i2;
                final int i6 = i3;
                final int i7 = i4;
                bm<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ int $captureMode$inlined;
                        final /* synthetic */ CallbackToFutureAdapter.Completer $completer;
                        final /* synthetic */ int $flashMode$inlined;
                        final /* synthetic */ int $flashType$inlined;
                        Object L$0;
                        int label;
                        final /* synthetic */ CapturePipelineImpl this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(CallbackToFutureAdapter.Completer completer, e eVar, CapturePipelineImpl capturePipelineImpl, int i2, int i3, int i4) {
                            super(2, eVar);
                            this.$completer = completer;
                            this.this$0 = capturePipelineImpl;
                            this.$captureMode$inlined = i2;
                            this.$flashMode$inlined = i3;
                            this.$flashType$inlined = i4;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass1(this.$completer, eVar, this.this$0, this.$captureMode$inlined, this.$flashMode$inlined, this.$flashType$inlined);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
                        
                            if (kotlinx.coroutines.aj.E((java.util.Collection) r13, r10) == r0) goto L18;
                         */
                        @Override // h.c.b.a.a
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
                            /*
                                r12 = this;
                                h.c.a.a r0 = h.c.a.a.f48038a
                                int r1 = r12.label
                                r2 = 2
                                r3 = 1
                                if (r1 == 0) goto L26
                                if (r1 == r3) goto L1c
                                if (r1 != r2) goto L14
                                java.lang.Object r12 = r12.L$0
                                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r12 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r12
                                e.b.c.b(r13)
                                goto L58
                            L14:
                                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                                r12.<init>(r13)
                                throw r12
                            L1c:
                                java.lang.Object r1 = r12.L$0
                                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r1 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r1
                                e.b.c.b(r13)
                                r10 = r12
                                r12 = r1
                                goto L4b
                            L26:
                                e.b.c.b(r13)
                                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r13 = r12.$completer
                                r1 = r12
                                h.c.e r1 = (h.c.e) r1
                                androidx.camera.camera2.impl.CapturePipelineImpl r4 = r12.this$0
                                androidx.camera.camera2.impl.CapturePipelineImpl$PipelineTask r1 = androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.PRE_CAPTURE
                                java.util.List r5 = h.a.i.d(r1)
                                int r6 = r12.$captureMode$inlined
                                int r7 = r12.$flashMode$inlined
                                int r8 = r12.$flashType$inlined
                                r12.L$0 = r13
                                r12.label = r3
                                r9 = 0
                                r10 = r12
                                java.lang.Object r12 = androidx.camera.camera2.impl.CapturePipelineImpl.access$invokeCaptureTasks(r4, r5, r6, r7, r8, r9, r10)
                                if (r12 == r0) goto L5f
                                r11 = r13
                                r13 = r12
                                r12 = r11
                            L4b:
                                java.util.Collection r13 = (java.util.Collection) r13
                                r10.L$0 = r12
                                r10.label = r2
                                java.lang.Object r13 = kotlinx.coroutines.aj.E(r13, r10)
                                if (r13 != r0) goto L58
                                goto L5f
                            L58:
                                r13 = 0
                                r12.set(r13)
                                h.ab r12 = h.ab.f48028a
                                return r12
                            L5f:
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer<T> completer) {
                        x.f(completer, "completer");
                        return aj.z(scope, null, null, new AnonymousClass1(completer, null, capturePipelineImpl, i5, i6, i7), 3);
                    }
                });
                x.e(future, "getFuture(...)");
                return future;
            }
        };
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public int getTemplate() {
        return this.template;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[Catch: all -> 0x00ba, TryCatch #1 {all -> 0x00ba, blocks: (B:31:0x007f, B:33:0x008a, B:37:0x0097), top: B:54:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:14:0x002f, B:40:0x00a2, B:42:0x00aa), top: B:52:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeScreenFlashPostCaptureTasks(int r9, h.c.e<? super h.ab> r10) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C01311
            if (r0 == 0) goto L13
            r0 = r10
            androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C01311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            java.lang.String r5 = "CXCP"
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L45
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r8 = r0.L$0
            java.lang.AutoCloseable r8 = (java.lang.AutoCloseable) r8
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L34
            goto La2
        L34:
            r9 = move-exception
            goto Lbe
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            int r8 = r0.I$0
            e.b.c.b(r10)
            goto L7c
        L45:
            int r9 = r0.I$0
            e.b.c.b(r10)
            goto L5a
        L4b:
            e.b.c.b(r10)
            androidx.camera.camera2.impl.FlashControl r10 = r8.flashControl
            r0.I$0 = r9
            r0.label = r6
            java.lang.Object r10 = r10.stopScreenFlashCaptureTasks(r0)
            if (r10 == r1) goto Lc4
        L5a:
            androidx.camera.camera2.impl.Camera2Logger r10 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r10 = androidx.camera.core.Logger.isDebugEnabled(r5)
            if (r10 == 0) goto L6b
            java.lang.String r10 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r2 = "screenFlashPostCapture: Acquiring session for unlocking 3A"
            android.util.Log.d(r10, r2)
        L6b:
            androidx.camera.camera2.config.UseCaseCameraContext r8 = r8.useCaseCameraContext
            androidx.camera.camera2.pipe.CameraGraph r8 = r8.getGraph()
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r10 = r8.acquireSession(r0)
            if (r10 == r1) goto Lc4
            r8 = r9
        L7c:
            r9 = r10
            java.lang.AutoCloseable r9 = (java.lang.AutoCloseable) r9
            r10 = r9
            androidx.camera.camera2.pipe.CameraGraph$Session r10 = (androidx.camera.camera2.pipe.CameraGraph.Session) r10     // Catch: java.lang.Throwable -> Lba
            androidx.camera.camera2.impl.Camera2Logger r2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE     // Catch: java.lang.Throwable -> Lba
            boolean r2 = androidx.camera.core.Logger.isDebugEnabled(r5)     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto L93
            java.lang.String r2 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "screenFlashPostCapture: Unlocking 3A"
            android.util.Log.d(r2, r4)     // Catch: java.lang.Throwable -> Lba
        L93:
            if (r8 != 0) goto L96
            goto L97
        L96:
            r6 = 0
        L97:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Lba
            r0.label = r3     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r8 = r10.unlock3APostCapture(r6, r0)     // Catch: java.lang.Throwable -> Lba
            if (r8 == r1) goto Lc4
            r8 = r9
        La2:
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE     // Catch: java.lang.Throwable -> L34
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto Lb3
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()     // Catch: java.lang.Throwable -> L34
            java.lang.String r10 = "screenFlashPostCapture: Unlocking 3A done"
            android.util.Log.d(r9, r10)     // Catch: java.lang.Throwable -> L34
        Lb3:
            r9 = 0
            h.a.r.y(r8, r9)
            h.ab r8 = h.ab.f48028a
            return r8
        Lba:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lbe:
            throw r9     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r10 = move-exception
            h.a.r.y(r8, r9)
            throw r10
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.invokeScreenFlashPostCaptureTasks(int, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r0 == r2) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:32:0x0081, B:34:0x008c, B:35:0x0095, B:39:0x009d), top: B:60:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeScreenFlashPreCaptureTasks(int r16, h.c.e<? super h.ab> r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.invokeScreenFlashPreCaptureTasks(int, h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public void setTemplate(int i2) {
        this.template = i2;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    /* renamed from: submitStillCaptures-BvXKQx0 */
    public Object mo224submitStillCapturesBvXKQx0(List<CaptureConfig> list, int i2, Config config, int i3, int i4, int i5, e<? super List<? extends am<Void>>> eVar) {
        return invokeCaptureTasks(i.i(PipelineTask.PRE_CAPTURE, PipelineTask.MAIN_CAPTURE, PipelineTask.POST_CAPTURE), i3, i5, i4, new MainCaptureParams(list, i2, config, null), eVar);
    }

    /* compiled from: WazeSource */
    final class MainCaptureParams {
        private final List<CaptureConfig> configs;
        private final int requestTemplate;
        private final Config sessionConfigOptions;

        private MainCaptureParams(List<CaptureConfig> list, int i2, Config config) {
            x.f(list, "configs");
            x.f(config, "sessionConfigOptions");
            this.configs = list;
            this.requestTemplate = i2;
            this.sessionConfigOptions = config;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-9al78dA$default, reason: not valid java name */
        public static /* synthetic */ MainCaptureParams m249copy9al78dA$default(MainCaptureParams mainCaptureParams, List list, int i2, Config config, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                list = mainCaptureParams.configs;
            }
            if ((i3 & 2) != 0) {
                i2 = mainCaptureParams.requestTemplate;
            }
            if ((i3 & 4) != 0) {
                config = mainCaptureParams.sessionConfigOptions;
            }
            return mainCaptureParams.m251copy9al78dA(list, i2, config);
        }

        public final List<CaptureConfig> component1() {
            return this.configs;
        }

        /* renamed from: component2-fGx8uWA, reason: not valid java name */
        public final int m250component2fGx8uWA() {
            return this.requestTemplate;
        }

        public final Config component3() {
            return this.sessionConfigOptions;
        }

        /* renamed from: copy-9al78dA, reason: not valid java name */
        public final MainCaptureParams m251copy9al78dA(List<CaptureConfig> list, int i2, Config config) {
            x.f(list, "configs");
            x.f(config, "sessionConfigOptions");
            return new MainCaptureParams(list, i2, config, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainCaptureParams)) {
                return false;
            }
            MainCaptureParams mainCaptureParams = (MainCaptureParams) obj;
            return x.n(this.configs, mainCaptureParams.configs) && RequestTemplate.m890equalsimpl0(this.requestTemplate, mainCaptureParams.requestTemplate) && x.n(this.sessionConfigOptions, mainCaptureParams.sessionConfigOptions);
        }

        public final List<CaptureConfig> getConfigs() {
            return this.configs;
        }

        /* renamed from: getRequestTemplate-fGx8uWA, reason: not valid java name */
        public final int m252getRequestTemplatefGx8uWA() {
            return this.requestTemplate;
        }

        public final Config getSessionConfigOptions() {
            return this.sessionConfigOptions;
        }

        public int hashCode() {
            return (((this.configs.hashCode() * 31) + this.requestTemplate) * 31) + this.sessionConfigOptions.hashCode();
        }

        public String toString() {
            return "MainCaptureParams(configs=" + this.configs + ", requestTemplate=" + RequestTemplate.m893toStringimpl(this.requestTemplate) + ", sessionConfigOptions=" + this.sessionConfigOptions + ")";
        }

        public /* synthetic */ MainCaptureParams(List list, int i2, Config config, o oVar) {
            this(list, i2, config);
        }
    }
}

package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.camera2.config.UseCaseCameraScope;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.TagBundle;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import g.a.a;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.f;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public final class UseCaseCameraRequestControlImpl implements UseCaseCameraRequestControl {
    private static final CompletableDeferred<ab> canceledResult;
    private final CameraXConfig cameraXConfig;
    private final f capturePipeline$delegate;
    private final a<CapturePipeline> capturePipelineProvider;
    private volatile boolean closed;
    private final Map<UseCaseCameraRequestControl.Type, InfoBundle> infoBundleMap;
    private final UseCaseThreads threads;
    private final UseCaseCameraContext useCaseCameraContext;
    private final f useCaseCameraState$delegate;
    private final a<UseCaseCameraState> useCaseCameraStateProvider;
    private final f useCaseSurfaceManager$delegate;
    private final a<UseCaseSurfaceManager> useCaseSurfaceManagerProvider;
    public static final Companion Companion = new Companion(null);
    private static final CompletableDeferred<Result3A> submitFailedResult = bo.h(new Result3A(Result3A.Status.Companion.m909getSUBMIT_FAILEDJvTi9ms(), null, null, 6, null));

    /* compiled from: WazeSource */
    public abstract class Bindings {
        @UseCaseCameraScope
        public abstract UseCaseCameraRequestControl bindRequestControl(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$submitParameters$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ Config.OptionPriority $optionPriority;
        final /* synthetic */ UseCaseCameraRequestControl.Type $type;
        final /* synthetic */ Map<CaptureRequest.Key<?>, Object> $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UseCaseCameraRequestControl.Type type, Map<CaptureRequest.Key<?>, ? extends Object> map, Config.OptionPriority optionPriority, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$type = type;
            this.$values = map;
            this.$optionPriority = optionPriority;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return UseCaseCameraRequestControlImpl.this.new AnonymousClass1(this.$type, this.$values, this.$optionPriority, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (((kotlinx.coroutines.am) r8).c(r7) == r0) goto L17;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r8)
                goto L40
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L18:
                e.b.c.b(r8)
                goto L32
            L1c:
                e.b.c.b(r8)
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl r8 = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.this
                androidx.camera.camera2.impl.UseCaseCameraRequestControl$Type r1 = r7.$type
                java.util.Map<android.hardware.camera2.CaptureRequest$Key<?>, java.lang.Object> r4 = r7.$values
                androidx.camera.core.impl.Config$OptionPriority r5 = r7.$optionPriority
                r6 = r7
                h.c.e r6 = (h.c.e) r6
                r7.label = r3
                java.lang.Object r8 = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.access$setParametersInternal(r8, r1, r4, r5, r6)
                if (r8 == r0) goto L43
            L32:
                kotlinx.coroutines.am r8 = (kotlinx.coroutines.am) r8
                r1 = r7
                h.c.e r1 = (h.c.e) r1
                r7.label = r2
                java.lang.Object r7 = r8.c(r1)
                if (r7 != r0) goto L40
                goto L43
            L40:
                h.ab r7 = h.ab.f48028a
                return r7
            L43:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1, reason: invalid class name and case insensitive filesystem */
    final class C01491 extends c {
        int label;
        /* synthetic */ Object result;

        C01491(e<? super C01491> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UseCaseCameraRequestControlImpl.this.updateCameraStateAsync(null, null, this);
        }
    }

    static {
        CompletableDeferred<ab> completableDeferredJ = bo.j();
        completableDeferredJ.s(null);
        canceledResult = completableDeferredJ;
    }

    public UseCaseCameraRequestControlImpl(a<CapturePipeline> aVar, a<UseCaseCameraState> aVar2, UseCaseCameraContext useCaseCameraContext, a<UseCaseSurfaceManager> aVar3, UseCaseThreads useCaseThreads, CameraXConfig cameraXConfig) {
        x.f(aVar, "capturePipelineProvider");
        x.f(aVar2, "useCaseCameraStateProvider");
        x.f(useCaseCameraContext, "useCaseCameraContext");
        x.f(aVar3, "useCaseSurfaceManagerProvider");
        x.f(useCaseThreads, "threads");
        this.capturePipelineProvider = aVar;
        this.useCaseCameraStateProvider = aVar2;
        this.useCaseCameraContext = useCaseCameraContext;
        this.useCaseSurfaceManagerProvider = aVar3;
        this.threads = useCaseThreads;
        this.cameraXConfig = cameraXConfig;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            toString();
            android.util.Log.d(str, "Configured ".concat(toString()));
        }
        this.capturePipeline$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.capturePipelineProvider.get();
            }
        });
        this.useCaseSurfaceManager$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.useCaseSurfaceManagerProvider.get();
            }
        });
        this.useCaseCameraState$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.useCaseCameraStateProvider.get();
            }
        });
        this.infoBundleMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<am<Void>> failedResults(int i2, String str) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            CompletableDeferred completableDeferredJ = bo.j();
            completableDeferredJ.b(new ImageCaptureException(2, str, null));
            arrayList.add(completableDeferredJ);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CapturePipeline getCapturePipeline() {
        return (CapturePipeline) this.capturePipeline$delegate.getValue();
    }

    private final UseCaseCameraState getUseCaseCameraState() {
        return (UseCaseCameraState) this.useCaseCameraState$delegate.getValue();
    }

    private final UseCaseSurfaceManager getUseCaseSurfaceManager() {
        return (UseCaseSurfaceManager) this.useCaseSurfaceManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasInvalidSurface(List<CaptureConfig> list) {
        for (CaptureConfig captureConfig : list) {
            if (captureConfig.getSurfaces().isEmpty()) {
                return true;
            }
            List<DeferrableSurface> surfaces = captureConfig.getSurfaces();
            x.e(surfaces, "getSurfaces(...)");
            Iterator<T> it = surfaces.iterator();
            while (it.hasNext()) {
                if (this.useCaseCameraContext.getSurfaceToStreamMap().get((DeferrableSurface) it.next()) == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoBundle merge(Map<UseCaseCameraRequestControl.Type, InfoBundle> map) {
        InfoBundle infoBundle = new InfoBundle(null, null, null, RequestTemplate.m887boximpl(1), 7, null);
        Iterator<UseCaseCameraRequestControl.Type> it = UseCaseCameraRequestControl.Type.getEntries().iterator();
        while (it.hasNext()) {
            InfoBundle infoBundle2 = map.get(it.next());
            if (infoBundle2 != null) {
                infoBundle.getOptions().insertAllOptions(infoBundle2.getOptions().getMutableConfig());
                infoBundle.getTags().putAll(infoBundle2.getTags());
                infoBundle.getListeners().addAll(infoBundle2.getListeners());
                RequestTemplate requestTemplateM288getTemplateejQnlcg = infoBundle2.m288getTemplateejQnlcg();
                if (requestTemplateM288getTemplateejQnlcg != null) {
                    infoBundle.m289setTemplatexlOpshk(RequestTemplate.m887boximpl(requestTemplateM288getTemplateejQnlcg.m894unboximpl()));
                }
            }
        }
        return infoBundle;
    }

    private final <R> R runIfNotClosed(h.g.a.a<? extends R> aVar) {
        if (this.closed) {
            return null;
        }
        return aVar.invoke();
    }

    private final <T> am<T> runOnSequential(l<? super e<? super am<? extends T>>, ? extends Object> lVar) {
        UseCaseThreads useCaseThreads = this.threads;
        ag agVarDetermineStartStrategy$camera_camera2 = determineStartStrategy$camera_camera2(useCaseThreads);
        CompletableDeferred completableDeferredJ = bo.j();
        aj.z(useCaseThreads.getSequentialScope(), null, agVarDetermineStartStrategy$camera_camera2, new UseCaseCameraRequestControlImpl$runOnSequential$$inlined$confineDeferredSuspend$1(lVar, completableDeferredJ, null), 1);
        return completableDeferredJ;
    }

    private final <T> List<am<T>> runOnSequentialList(int i2, l<? super e<? super List<? extends am<? extends T>>>, ? extends Object> lVar) {
        ag agVarDetermineStartStrategy$camera_camera2 = determineStartStrategy$camera_camera2(this.threads);
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(bo.j());
        }
        ArrayList arrayList2 = arrayList;
        aj.z(this.threads.getSequentialScope(), null, agVarDetermineStartStrategy$camera_camera2, new UseCaseCameraRequestControlImpl$runOnSequentialList$$inlined$confineDeferredListSuspend$1(lVar, arrayList2, null), 1);
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setParametersInternal(UseCaseCameraRequestControl.Type type, Map<CaptureRequest.Key<?>, ? extends Object> map, Config.OptionPriority optionPriority, e<? super am<ab>> eVar) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl#setParametersAsync: [" + type + "] values = " + map + ", optionPriority = " + optionPriority);
        }
        Map<UseCaseCameraRequestControl.Type, InfoBundle> map2 = this.infoBundleMap;
        InfoBundle infoBundle = map2.get(type);
        if (infoBundle == null) {
            InfoBundle infoBundle2 = new InfoBundle(null, null, null, null, 15, null);
            map2.put(type, infoBundle2);
            infoBundle = infoBundle2;
        }
        this.infoBundleMap.put(type, withParameters(infoBundle, map, optionPriority));
        return updateCameraStateAsync$default(this, merge(this.infoBundleMap), null, eVar, 1, null);
    }

    private final TagBundle toTagBundle(InfoBundle infoBundle) {
        MutableTagBundle mutableTagBundleCreate = MutableTagBundle.create();
        for (Map.Entry<String, Object> entry : infoBundle.getTags().entrySet()) {
            mutableTagBundleCreate.putTag(entry.getKey(), entry.getValue());
        }
        x.e(mutableTagBundleCreate, "also(...)");
        return mutableTagBundleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateCameraStateAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle r11, java.util.Set<androidx.camera.camera2.pipe.StreamId> r12, h.c.e<? super kotlinx.coroutines.am<h.ab>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.C01491
            if (r0 == 0) goto L13
            r0 = r13
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 r0 = (androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.C01491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 r0 = new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1
            r0.<init>(r13)
        L18:
            r9 = r0
            java.lang.Object r13 = r9.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            e.b.c.b(r13)
            goto Lb0
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            e.b.c.b(r13)
            boolean r13 = r10.closed
            if (r13 != 0) goto Lb4
            androidx.camera.core.CameraXConfig r13 = r10.cameraXConfig
            if (r13 == 0) goto L57
            androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator r13 = androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt.getCamera2CaptureRequestConfigurator(r13)
            if (r13 == 0) goto L57
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r1 = r11.getOptions()
            androidx.camera.camera2.impl.Camera2ImplConfig r1 = r1.build()
            androidx.camera.core.impl.Config r1 = (androidx.camera.core.impl.Config) r1
            java.util.Map r1 = androidx.camera.camera2.impl.Camera2ImplConfigKt.toParameters(r1)
            java.util.Map r1 = h.a.r.r(r1)
            androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt.configureWithUnchecked(r13, r1)
        L57:
            androidx.camera.camera2.impl.CapturePipeline r13 = r10.getCapturePipeline()
            androidx.camera.camera2.pipe.RequestTemplate r1 = r11.m288getTemplateejQnlcg()
            h.g.b.x.c(r1)
            int r1 = r1.m894unboximpl()
            r3 = -1
            if (r1 == r3) goto L75
            androidx.camera.camera2.pipe.RequestTemplate r1 = r11.m288getTemplateejQnlcg()
            h.g.b.x.c(r1)
            int r1 = r1.m894unboximpl()
            goto L76
        L75:
            r1 = r2
        L76:
            r13.setTemplate(r1)
            androidx.camera.camera2.impl.UseCaseCameraState r1 = r10.getUseCaseCameraState()
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r13 = r11.getOptions()
            androidx.camera.camera2.impl.Camera2ImplConfig r13 = r13.build()
            androidx.camera.core.impl.Config r13 = (androidx.camera.core.impl.Config) r13
            java.util.Map r13 = androidx.camera.camera2.impl.Camera2ImplConfigKt.toParameters(r13)
            androidx.camera.camera2.pipe.Metadata$Key r3 = androidx.camera.camera2.impl.TagsKt.getCAMERAX_TAG_BUNDLE()
            androidx.camera.core.impl.TagBundle r10 = r10.toTagBundle(r11)
            h.k r4 = new h.k
            r4.<init>(r3, r10)
            java.util.Map r4 = h.a.r.e(r4)
            androidx.camera.camera2.pipe.RequestTemplate r7 = r11.m288getTemplateejQnlcg()
            java.util.Set r8 = r11.getListeners()
            r9.label = r2
            r3 = 0
            r5 = 0
            r6 = r12
            r2 = r13
            java.lang.Object r13 = r1.m292updateAsyncTp9XwKQ(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 == r0) goto Lb3
        Lb0:
            kotlinx.coroutines.am r13 = (kotlinx.coroutines.am) r13
            goto Lb5
        Lb3:
            return r0
        Lb4:
            r13 = 0
        Lb5:
            if (r13 != 0) goto Lbc
            kotlinx.coroutines.CompletableDeferred<h.ab> r10 = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.canceledResult
            kotlinx.coroutines.am r10 = (kotlinx.coroutines.am) r10
            return r10
        Lbc:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.updateCameraStateAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$InfoBundle, java.util.Set, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object updateCameraStateAsync$default(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, InfoBundle infoBundle, Set set, e eVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            set = null;
        }
        return useCaseCameraRequestControlImpl.updateCameraStateAsync(infoBundle, set, eVar);
    }

    private final Object useGraphSessionOrFailed(p<? super CameraGraph.Session, ? super e<? super am<Result3A>>, ? extends Object> pVar, e<? super am<Result3A>> eVar) throws Exception {
        try {
            AutoCloseable autoCloseable = (AutoCloseable) this.useCaseCameraContext.getGraph().acquireSession(eVar);
            try {
                CameraGraph.Session session = (CameraGraph.Session) autoCloseable;
                am amVar = (am) pVar.invoke(session, null);
                r.y(autoCloseable, null);
                return amVar;
            } finally {
            }
        } catch (CancellationException e2) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            CancellationException cancellationException = e2;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Cannot acquire the CameraGraph.Session", cancellationException);
            }
            return submitFailedResult;
        }
    }

    private final InfoBundle withParameters(InfoBundle infoBundle, Map<CaptureRequest.Key<?>, ? extends Object> map, Config.OptionPriority optionPriority) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(infoBundle.getOptions().getMutableConfig());
        builder.addAllCaptureRequestOptionsWithPriority(map, optionPriority);
        return InfoBundle.m285copy0am55g4$default(infoBundle, builder, r.t(infoBundle.getTags()), i.at(infoBundle.getListeners()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoBundle withoutParameters(InfoBundle infoBundle, List<? extends CaptureRequest.Key<?>> list) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(infoBundle.getOptions().getMutableConfig());
        builder.removeCaptureRequestOptions(list);
        return InfoBundle.m285copy0am55g4$default(infoBundle, builder, r.t(infoBundle.getTags()), i.at(infoBundle.getListeners()), null, 8, null);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public Object awaitSurfaceSetup(e<? super Boolean> eVar) {
        return getUseCaseSurfaceManager().awaitSetupCompletion(eVar);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<Result3A> cancelFocusAndMeteringAsync() {
        am<Result3A> amVarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1(this, null));
        return amVarRunOnSequential == null ? submitFailedResult : amVarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public void close() {
        this.closed = true;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControl: closed");
        }
        getUseCaseCameraState().close();
    }

    public final ag determineStartStrategy$camera_camera2(UseCaseThreads useCaseThreads) {
        x.f(useCaseThreads, "<this>");
        return useCaseThreads.isOnSequentialThread() ? ag.f51345d : ag.f51342a;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public List<am<Void>> issueSingleCaptureAsync(List<CaptureConfig> list, int i2, int i3, int i4) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl;
        List<CaptureConfig> list2;
        List<am<Void>> listRunOnSequentialList;
        x.f(list, "captureSequence");
        if (this.closed) {
            useCaseCameraRequestControlImpl = this;
            list2 = list;
            listRunOnSequentialList = null;
        } else {
            useCaseCameraRequestControlImpl = this;
            list2 = list;
            listRunOnSequentialList = useCaseCameraRequestControlImpl.runOnSequentialList(list.size(), new UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(useCaseCameraRequestControlImpl, list2, i2, i3, i4, null));
        }
        return listRunOnSequentialList == null ? useCaseCameraRequestControlImpl.failedResults(list2.size(), "Capture request is cancelled on closed CameraGraph") : listRunOnSequentialList;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> removeParametersAsync(List<? extends CaptureRequest.Key<?>> list, UseCaseCameraRequestControl.Type type) {
        x.f(list, "keys");
        x.f(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        am<ab> amVarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$removeParametersAsync$1$1(this, type, list, null));
        return amVarRunOnSequential == null ? canceledResult : amVarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> setParametersAsync(Map<CaptureRequest.Key<?>, ? extends Object> map, UseCaseCameraRequestControl.Type type, Config.OptionPriority optionPriority) {
        x.f(map, "values");
        x.f(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(optionPriority, "optionPriority");
        am<ab> amVarRunOnSequential = !this.closed ? runOnSequential(new UseCaseCameraRequestControlImpl$setParametersAsync$1$1(this, type, map, optionPriority, null)) : null;
        return amVarRunOnSequential == null ? canceledResult : amVarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: setTorchOffAsync-MtizInI */
    public am<Result3A> mo253setTorchOffAsyncMtizInI(int i2) {
        am<Result3A> amVarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$setTorchOffAsync$1$1(this, i2, null));
        return amVarRunOnSequential == null ? submitFailedResult : amVarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<Result3A> setTorchOnAsync() {
        am<Result3A> amVarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(this, null));
        return amVarRunOnSequential == null ? submitFailedResult : amVarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: startFocusAndMeteringAsync-HEKfQLs */
    public am<Result3A> mo254startFocusAndMeteringAsyncHEKfQLs(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, long j2, l<? super FrameMetadata, Boolean> lVar) {
        am<Result3A> amVarRunOnSequential = !this.closed ? runOnSequential(new UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(this, list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode, lVar, j2, null)) : null;
        return amVarRunOnSequential == null ? submitFailedResult : amVarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> submitParameters(Map<CaptureRequest.Key<?>, ? extends Object> map, UseCaseCameraRequestControl.Type type, Config.OptionPriority optionPriority) {
        x.f(map, "values");
        x.f(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(optionPriority, "optionPriority");
        if (this.closed) {
            return canceledResult;
        }
        this.threads.checkOnSequentialThread();
        return aj.y(this.threads.getSequentialScope(), null, ag.f51345d, new AnonymousClass1(type, map, optionPriority, null), 1);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<Result3A> update3aRegions(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3) {
        am<Result3A> amVarRunOnSequential = !this.closed ? runOnSequential(new UseCaseCameraRequestControlImpl$update3aRegions$1$1(this, list, list2, list3, null)) : null;
        return amVarRunOnSequential == null ? submitFailedResult : amVarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> updateCamera2ConfigAsync(Config config, Map<String, ? extends Object> map) {
        x.f(config, "config");
        x.f(map, "tags");
        am<ab> amVarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(this, config, map, null));
        return amVarRunOnSequential == null ? canceledResult : amVarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> updateRepeatingRequestAsync(boolean z, Collection<? extends UseCase> collection) {
        x.f(collection, "runningUseCases");
        am<ab> amVarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(collection, z, this, null));
        return amVarRunOnSequential == null ? canceledResult : amVarRunOnSequential;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InfoBundle toInfoBundle(SessionConfig sessionConfig, Executor executor) {
            return new InfoBundle(extractCamera2ImplConfigBuilder(sessionConfig), extractTags(sessionConfig), extractListeners(sessionConfig, executor), RequestTemplate.m887boximpl(m284extractTemplateAREDGk(sessionConfig)), null);
        }

        public final Camera2ImplConfig.Builder extractCamera2ImplConfigBuilder(SessionConfig sessionConfig) {
            x.f(sessionConfig, "<this>");
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            if (!x.n(sessionConfig.getExpectedFrameRateRange(), StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                x.e(key, "CONTROL_AE_TARGET_FPS_RANGE");
                builder.setCaptureRequestOption(key, sessionConfig.getExpectedFrameRateRange());
            }
            Config implementationOptions = sessionConfig.getImplementationOptions();
            x.e(implementationOptions, "getImplementationOptions(...)");
            builder.insertAllOptions(implementationOptions);
            return builder;
        }

        public final Set<Request.Listener> extractListeners(SessionConfig sessionConfig, Executor executor) {
            x.f(sessionConfig, "<this>");
            x.f(executor, "callbackExecutor");
            CameraCallbackMap.Companion companion = CameraCallbackMap.Companion;
            List<CameraCaptureCallback> repeatingCameraCaptureCallbacks = sessionConfig.getRepeatingCameraCaptureCallbacks();
            x.e(repeatingCameraCaptureCallbacks, "getRepeatingCameraCaptureCallbacks(...)");
            return e.c.d.a.q(companion.createFor(repeatingCameraCaptureCallbacks, executor));
        }

        public final Map<String, Object> extractTags(SessionConfig sessionConfig) {
            x.f(sessionConfig, "<this>");
            TagBundle tagBundle = sessionConfig.getRepeatingCaptureConfig().getTagBundle();
            x.e(tagBundle, "getTagBundle(...)");
            return r.t(UseCaseCameraRequestControlKt.toMap(tagBundle));
        }

        /* renamed from: extractTemplate-ARED-Gk, reason: not valid java name */
        public final int m284extractTemplateAREDGk(SessionConfig sessionConfig) {
            x.f(sessionConfig, "$this$extractTemplate");
            return sessionConfig.getTemplateType();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Camera2ImplConfig.Builder extractCamera2ImplConfigBuilder(Config config) {
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            builder.insertAllOptions(config);
            return builder;
        }
    }

    /* compiled from: WazeSource */
    final class InfoBundle {
        private final Set<Request.Listener> listeners;
        private final Camera2ImplConfig.Builder options;
        private final Map<String, Object> tags;
        private RequestTemplate template;

        public /* synthetic */ InfoBundle(Camera2ImplConfig.Builder builder, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, RequestTemplate requestTemplate, int i2, o oVar) {
            this((i2 & 1) != 0 ? new Camera2ImplConfig.Builder() : builder, (i2 & 2) != 0 ? new LinkedHashMap() : linkedHashMap, (i2 & 4) != 0 ? new LinkedHashSet() : linkedHashSet, (i2 & 8) != 0 ? null : requestTemplate, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-0am55g4$default, reason: not valid java name */
        public static /* synthetic */ InfoBundle m285copy0am55g4$default(InfoBundle infoBundle, Camera2ImplConfig.Builder builder, Map map, Set set, RequestTemplate requestTemplate, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                builder = infoBundle.options;
            }
            if ((i2 & 2) != 0) {
                map = infoBundle.tags;
            }
            if ((i2 & 4) != 0) {
                set = infoBundle.listeners;
            }
            if ((i2 & 8) != 0) {
                requestTemplate = infoBundle.template;
            }
            return infoBundle.m287copy0am55g4(builder, map, set, requestTemplate);
        }

        public final Camera2ImplConfig.Builder component1() {
            return this.options;
        }

        public final Map<String, Object> component2() {
            return this.tags;
        }

        public final Set<Request.Listener> component3() {
            return this.listeners;
        }

        /* renamed from: component4-ejQnlcg, reason: not valid java name */
        public final RequestTemplate m286component4ejQnlcg() {
            return this.template;
        }

        /* renamed from: copy-0am55g4, reason: not valid java name */
        public final InfoBundle m287copy0am55g4(Camera2ImplConfig.Builder builder, Map<String, Object> map, Set<Request.Listener> set, RequestTemplate requestTemplate) {
            x.f(builder, "options");
            x.f(map, "tags");
            x.f(set, "listeners");
            return new InfoBundle(builder, map, set, requestTemplate, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoBundle)) {
                return false;
            }
            InfoBundle infoBundle = (InfoBundle) obj;
            return x.n(this.options, infoBundle.options) && x.n(this.tags, infoBundle.tags) && x.n(this.listeners, infoBundle.listeners) && x.n(this.template, infoBundle.template);
        }

        public final Set<Request.Listener> getListeners() {
            return this.listeners;
        }

        public final Camera2ImplConfig.Builder getOptions() {
            return this.options;
        }

        public final Map<String, Object> getTags() {
            return this.tags;
        }

        /* renamed from: getTemplate-ejQnlcg, reason: not valid java name */
        public final RequestTemplate m288getTemplateejQnlcg() {
            return this.template;
        }

        public int hashCode() {
            int iHashCode = (((this.options.hashCode() * 31) + this.tags.hashCode()) * 31) + this.listeners.hashCode();
            RequestTemplate requestTemplate = this.template;
            return (iHashCode * 31) + (requestTemplate == null ? 0 : requestTemplate.m894unboximpl());
        }

        /* renamed from: setTemplate-xlOpshk, reason: not valid java name */
        public final void m289setTemplatexlOpshk(RequestTemplate requestTemplate) {
            this.template = requestTemplate;
        }

        public String toString() {
            return "InfoBundle(options=" + this.options + ", tags=" + this.tags + ", listeners=" + this.listeners + ", template=" + this.template + ")";
        }

        public /* synthetic */ InfoBundle(Camera2ImplConfig.Builder builder, Map map, Set set, RequestTemplate requestTemplate, o oVar) {
            this(builder, map, set, requestTemplate);
        }

        private InfoBundle(Camera2ImplConfig.Builder builder, Map<String, Object> map, Set<Request.Listener> set, RequestTemplate requestTemplate) {
            x.f(builder, "options");
            x.f(map, "tags");
            x.f(set, "listeners");
            this.options = builder;
            this.tags = map;
            this.listeners = set;
            this.template = requestTemplate;
        }
    }

    public /* synthetic */ UseCaseCameraRequestControlImpl(a aVar, a aVar2, UseCaseCameraContext useCaseCameraContext, a aVar3, UseCaseThreads useCaseThreads, CameraXConfig cameraXConfig, int i2, o oVar) {
        this(aVar, aVar2, useCaseCameraContext, aVar3, useCaseThreads, (i2 & 32) != 0 ? null : cameraXConfig);
    }
}

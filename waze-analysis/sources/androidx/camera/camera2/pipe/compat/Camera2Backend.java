package androidx.camera.camera2.pipe.compat;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.content.Context;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.Camera2DeviceManager;
import androidx.camera.camera2.pipe.config.Camera2ControllerComponent;
import androidx.camera.camera2.pipe.config.Camera2ControllerConfig;
import androidx.camera.camera2.pipe.config.CameraPipeContext;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2Backend implements CameraBackend, Camera2CameraController.ShutdownListener {
    private final Set<CameraController> activeCameraControllers;
    private final Camera2ControllerComponent.Builder camera2CameraControllerComponent;
    private final Camera2DeviceCache camera2DeviceCache;
    private final Camera2DeviceManager camera2DeviceManager;
    private final Camera2MetadataCache camera2MetadataCache;
    private final Context cameraPipeContext;
    private final Object lock;
    private final Threads threads;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2Backend$shutdownAsync$2, reason: invalid class name */
    final class AnonymousClass2 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
        Object L$0;
        Object L$1;
        int label;

        AnonymousClass2(h.c.e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return Camera2Backend.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (r8 == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
        
            if (r7.this$0.camera2DeviceManager.closeAll(true).c(r7) != r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006d -> B:23:0x0070). Please report as a decompilation issue!!! */
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
                if (r1 == 0) goto L25
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                e.b.c.b(r8)
                goto Lb7
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L19:
                java.lang.Object r1 = r7.L$1
                androidx.camera.camera2.pipe.CameraController r1 = (androidx.camera.camera2.pipe.CameraController) r1
                java.lang.Object r4 = r7.L$0
                java.util.Iterator r4 = (java.util.Iterator) r4
                e.b.c.b(r8)
                goto L70
            L25:
                e.b.c.b(r8)
                androidx.camera.camera2.pipe.compat.Camera2Backend r8 = androidx.camera.camera2.pipe.compat.Camera2Backend.this
                java.lang.Object r1 = androidx.camera.camera2.pipe.compat.Camera2Backend.access$getLock$p(r8)
                monitor-enter(r1)
                java.util.Set r8 = androidx.camera.camera2.pipe.compat.Camera2Backend.access$getActiveCameraControllers$p(r8)     // Catch: java.lang.Throwable -> Lbb
                monitor-exit(r1)
                java.util.Iterator r8 = r8.iterator()
                r4 = r8
            L39:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L8e
                java.lang.Object r8 = r4.next()
                r1 = r8
                androidx.camera.camera2.pipe.CameraController r1 = (androidx.camera.camera2.pipe.CameraController) r1
                androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
                boolean r8 = r8.getDEBUG_LOGGABLE()
                if (r8 == 0) goto L60
                java.lang.String r8 = "Camera2Backend#shutdownAsync: Awaiting closure from "
                java.util.Objects.toString(r1)
                java.lang.String r5 = java.lang.String.valueOf(r1)
                java.lang.String r6 = "CXCP"
                java.lang.String r8 = r8.concat(r5)
                android.util.Log.d(r6, r8)
            L60:
                r8 = r7
                h.c.e r8 = (h.c.e) r8
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r8 = r1.awaitClosed(r8)
                if (r8 != r0) goto L70
                goto Lba
            L70:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L39
                androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
                boolean r8 = r8.getWARN_LOGGABLE()
                if (r8 == 0) goto L39
                java.lang.String r8 = "Failed to await closure from "
                java.lang.String r5 = "!"
                java.lang.String r8 = androidx.camera.camera2.pipe.compat.a.a(r1, r8, r5)
                java.lang.String r1 = "CXCP"
                android.util.Log.w(r1, r8)
                goto L39
            L8e:
                androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
                boolean r8 = r8.getDEBUG_LOGGABLE()
                if (r8 == 0) goto L9d
                java.lang.String r8 = "CXCP"
                java.lang.String r1 = "Camera2Backend#shutdownAsync: Closing all cameras (if any)"
                android.util.Log.d(r8, r1)
            L9d:
                androidx.camera.camera2.pipe.compat.Camera2Backend r8 = androidx.camera.camera2.pipe.compat.Camera2Backend.this
                androidx.camera.camera2.pipe.compat.Camera2DeviceManager r8 = androidx.camera.camera2.pipe.compat.Camera2Backend.access$getCamera2DeviceManager$p(r8)
                kotlinx.coroutines.am r8 = r8.closeAll(r3)
                r1 = r7
                h.c.e r1 = (h.c.e) r1
                r3 = 0
                r7.L$0 = r3
                r7.L$1 = r3
                r7.label = r2
                java.lang.Object r7 = r8.c(r1)
                if (r7 == r0) goto Lba
            Lb7:
                h.ab r7 = h.ab.f48028a
                return r7
            Lba:
                return r0
            Lbb:
                r7 = move-exception
                monitor-exit(r1)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2Backend.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Camera2Backend(Threads threads, Camera2DeviceCache camera2DeviceCache, Camera2MetadataCache camera2MetadataCache, Camera2DeviceManager camera2DeviceManager, Camera2ControllerComponent.Builder builder, @CameraPipeContext Context context) {
        x.f(threads, "threads");
        x.f(camera2DeviceCache, "camera2DeviceCache");
        x.f(camera2MetadataCache, "camera2MetadataCache");
        x.f(camera2DeviceManager, "camera2DeviceManager");
        x.f(builder, "camera2CameraControllerComponent");
        x.f(context, "cameraPipeContext");
        this.threads = threads;
        this.camera2DeviceCache = camera2DeviceCache;
        this.camera2MetadataCache = camera2MetadataCache;
        this.camera2DeviceManager = camera2DeviceManager;
        this.camera2CameraControllerComponent = builder;
        this.cameraPipeContext = context;
        this.lock = new Object();
        this.activeCameraControllers = new LinkedHashSet();
    }

    private final List<OutputConfiguration> buildOutputConfiguration(CameraGraph.Config config) {
        OutputConfiguration outputConfigurationM4m;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<CameraStream.Config> it = config.getStreams().iterator();
        while (it.hasNext()) {
            for (OutputStream.Config config2 : it.next().getOutputs()) {
                AndroidOutputConfiguration.Companion companion = AndroidOutputConfiguration.Companion;
                Integer numValueOf = Integer.valueOf(config2.m765getFormat8FPWQzE());
                OutputStream.OutputType sURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe = OutputStream.OutputType.Companion.getSURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe();
                OutputStream.MirrorMode mirrorModeM766getMirrorModedO1_9xk = config2.m766getMirrorModedO1_9xk();
                OutputStream.TimestampBase timestampBaseM769getTimestampBasepcPfPbY = config2.m769getTimestampBasepcPfPbY();
                OutputStream.DynamicRangeProfile dynamicRangeProfileM764getDynamicRangeProfileOoVcG5w = config2.m764getDynamicRangeProfileOoVcG5w();
                OutputStream.StreamUseCase streamUseCaseM767getStreamUseCase8x2ez34 = config2.m767getStreamUseCase8x2ez34();
                List<OutputStream.SensorPixelMode> sensorPixelModes = config2.getSensorPixelModes();
                Size size = config2.getSize();
                String strM763getCamera1LO98Z0 = config2.m763getCamera1LO98Z0();
                OutputConfigurationWrapper outputConfigurationWrapperM998creategWWoySg$default = AndroidOutputConfiguration.Companion.m998creategWWoySg$default(companion, null, numValueOf, sURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe, mirrorModeM766getMirrorModedO1_9xk, timestampBaseM769getTimestampBasepcPfPbY, dynamicRangeProfileM764getDynamicRangeProfileOoVcG5w, streamUseCaseM767getStreamUseCase8x2ez34, sensorPixelModes, size, false, 0, (strM763getCamera1LO98Z0 != null && CameraId.m549equalsimpl0(strM763getCamera1LO98Z0, config.m505getCameraDz_R5H8())) ? null : config2.m763getCamera1LO98Z0(), DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE, null);
                if (outputConfigurationWrapperM998creategWWoySg$default != null && (outputConfigurationM4m = a$$ExternalSyntheticApiModelOutline0.m4m(outputConfigurationWrapperM998creategWWoySg$default.unwrapAs(a$$ExternalSyntheticApiModelOutline0.m16m()))) != null) {
                    linkedHashSet.add(outputConfigurationM4m);
                }
            }
        }
        return i.ao(linkedHashSet);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public List<CameraId> awaitCameraIds() {
        return this.camera2DeviceCache.awaitCameraIds();
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: awaitCameraMetadata-EfqyGwQ */
    public CameraMetadata mo358awaitCameraMetadataEfqyGwQ(String str) {
        x.f(str, "cameraId");
        return this.camera2MetadataCache.mo1047awaitCameraMetadataEfqyGwQ(str);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public Set<Set<CameraId>> awaitConcurrentCameraIds() {
        return this.camera2DeviceCache.awaitConcurrentCameraIds();
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public CameraController createCameraController(CameraContext cameraContext, CameraGraphId cameraGraphId, CameraGraph.Config config, GraphListener graphListener, StreamGraph streamGraph, SurfaceTracker surfaceTracker) {
        x.f(cameraContext, "cameraContext");
        x.f(cameraGraphId, "graphId");
        x.f(config, "graphConfig");
        x.f(graphListener, "graphListener");
        x.f(streamGraph, "streamGraph");
        x.f(surfaceTracker, "surfaceTracker");
        CameraController cameraController = this.camera2CameraControllerComponent.camera2ControllerConfig(new Camera2ControllerConfig(this, cameraGraphId, config, graphListener, (StreamGraphImpl) streamGraph, surfaceTracker, this)).build().cameraController();
        synchronized (this.lock) {
            this.activeCameraControllers.add(cameraController);
        }
        return cameraController;
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: disconnect-EfqyGwQ */
    public void mo359disconnectEfqyGwQ(String str) {
        x.f(str, "cameraId");
        this.camera2DeviceManager.mo1023closeEfqyGwQ(str);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public void disconnectAll() {
        Camera2DeviceManager.CC.closeAll$default(this.camera2DeviceManager, false, 1, null);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public am<ab> disconnectAllAsync() {
        return Camera2DeviceManager.CC.closeAll$default(this.camera2DeviceManager, false, 1, null);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: disconnectAsync-EfqyGwQ */
    public am<ab> mo360disconnectAsyncEfqyGwQ(String str) {
        x.f(str, "cameraId");
        return this.camera2DeviceManager.mo1023closeEfqyGwQ(str);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public k<List<CameraId>> getCameraIds() {
        return this.camera2DeviceCache.getCameraIds();
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: getCameraMetadata-0r8Bogc */
    public Object mo361getCameraMetadata0r8Bogc(String str, h.c.e<? super CameraMetadata> eVar) {
        return this.camera2MetadataCache.mo1049getCameraMetadata0r8Bogc(str, eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public /* synthetic */ Object getConcurrentCameraIds(h.c.e eVar) {
        return CameraBackend.CC.getConcurrentCameraIds$suspendImpl(this, eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: getId-QwmhuAM */
    public String mo362getIdQwmhuAM() {
        CameraBackendId.m383constructorimpl("CXCP-Camera2");
        return "CXCP-Camera2";
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: isConfigSupported-NpXggIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo363isConfigSupportedNpXggIU(androidx.camera.camera2.pipe.CameraGraph.Config r7, h.c.e<? super androidx.camera.camera2.pipe.ConfigQueryResult> r8) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2Backend.mo363isConfigSupportedNpXggIU(androidx.camera.camera2.pipe.CameraGraph$Config, h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener
    public void onControllerClosed(CameraController cameraController) {
        x.f(cameraController, "cameraController");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            Objects.toString(cameraController);
            android.util.Log.d(Log.TAG, String.valueOf(cameraController).concat(" finalized"));
        }
        synchronized (this.lock) {
            this.activeCameraControllers.remove(cameraController);
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: prewarm-EfqyGwQ */
    public void mo364prewarmEfqyGwQ(String str) {
        x.f(str, "cameraId");
        this.camera2DeviceManager.mo1025prewarmEfqyGwQ(str);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: prewarmGraphConfigQuery-0r8Bogc */
    public /* synthetic */ Object mo365prewarmGraphConfigQuery0r8Bogc(String str, h.c.e eVar) {
        return null;
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    /* renamed from: prewarmIsConfigSupported-EfqyGwQ */
    public void mo366prewarmIsConfigSupportedEfqyGwQ(String str) {
        x.f(str, "cameraId");
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        aj.z(this.threads.getCameraPipeScope(), null, null, new Camera2Backend$prewarmIsConfigSupported$1(this, str, null), 3);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public am<ab> shutdownAsync() {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "Camera2Backend#shutdownAsync");
        }
        this.camera2DeviceCache.shutdown();
        return aj.y(this.threads.getCameraPipeScope(), null, null, new AnonymousClass2(null), 3);
    }

    @Override // androidx.camera.camera2.pipe.CameraBackend
    public Object getCameraIds(h.c.e<? super List<CameraId>> eVar) {
        return this.camera2DeviceCache.getCameraIds(eVar);
    }
}

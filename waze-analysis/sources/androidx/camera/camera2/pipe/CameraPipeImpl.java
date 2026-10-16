package androidx.camera.camera2.pipe;

import android.os.Trace;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameGraph;
import androidx.camera.camera2.pipe.config.CameraGraphConfigModule;
import androidx.camera.camera2.pipe.config.CameraPipeComponent;
import androidx.camera.camera2.pipe.config.FrameGraphConfigModule;
import androidx.camera.camera2.pipe.core.Log;
import h.a.i;
import h.a.r;
import h.c.e;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeImpl implements CameraPipe {
    private final CameraPipeComponent component;
    private final int debugId;
    private final Object lock;
    private boolean shutdown;

    public CameraPipeImpl(CameraPipeComponent cameraPipeComponent) {
        x.f(cameraPipeComponent, "component");
        this.component = cameraPipeComponent;
        this.debugId = CameraPipeKt.getCameraPipeIds().e();
        this.lock = new Object();
    }

    private final CameraGraph createCameraGraphLocked(CameraGraph.Config config, CameraGraphId cameraGraphId) {
        try {
            Trace.beginSection("CXCP#CameraGraph-".concat(CameraId.m552toStringimpl(config.m505getCameraDz_R5H8())));
            return this.component.cameraGraphComponentBuilder().cameraGraphConfigModule(new CameraGraphConfigModule(config, cameraGraphId)).build().cameraGraph();
        } finally {
            Trace.endSection();
        }
    }

    private final FrameGraph createFrameGraphLocked(FrameGraph.Config config, CameraGraphId cameraGraphId) {
        try {
            Trace.beginSection("CXCP#CreateFrameGraph-".concat(CameraId.m552toStringimpl(config.getCameraGraphConfig().m505getCameraDz_R5H8())));
            return this.component.frameGraphComponentBuilder().frameGraphConfigModule(new FrameGraphConfigModule(this.component.cameraGraphComponentBuilder().cameraGraphConfigModule(new CameraGraphConfigModule(config.getCameraGraphConfig(), cameraGraphId)).build(), config)).build().frameGraph();
        } finally {
            Trace.endSection();
        }
    }

    private final CameraBackend getBackend(CameraGraph.Config config) {
        CameraBackend cameraBackendMo389getSG3A4s8;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            CameraBackendFactory customCameraBackend = config.getCustomCameraBackend();
            if (customCameraBackend != null) {
                cameraBackendMo389getSG3A4s8 = customCameraBackend.create(this.component.cameraContext());
            } else {
                String strM506getCameraBackendIdAKmI2lo = config.m506getCameraBackendIdAKmI2lo();
                CameraPipeComponent cameraPipeComponent = this.component;
                if (strM506getCameraBackendIdAKmI2lo != null) {
                    cameraBackendMo389getSG3A4s8 = cameraPipeComponent.cameraBackends().mo389getSG3A4s8(strM506getCameraBackendIdAKmI2lo);
                    if (cameraBackendMo389getSG3A4s8 == null) {
                        throw new IllegalStateException("Failed to initialize " + CameraBackendId.m387toStringimpl(strM506getCameraBackendIdAKmI2lo) + " from " + config);
                    }
                } else {
                    cameraBackendMo389getSG3A4s8 = cameraPipeComponent.cameraBackends().getDefault();
                }
            }
        }
        return cameraBackendMo389getSG3A4s8;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public CameraSurfaceManager cameraSurfaceManager() {
        CameraSurfaceManager cameraSurfaceManager;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            cameraSurfaceManager = this.component.cameraSurfaceManager();
        }
        return cameraSurfaceManager;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public CameraDevices cameras() {
        CameraDevices cameraDevicesCameras;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            cameraDevicesCameras = this.component.cameras();
        }
        return cameraDevicesCameras;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public CameraGraph create(CameraGraph.Config config) {
        x.f(config, "config");
        return createCameraGraph(config);
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public CameraGraph createCameraGraph(CameraGraph.Config config) {
        CameraGraph cameraGraphCreateCameraGraphLocked;
        x.f(config, "config");
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            cameraGraphCreateCameraGraphLocked = createCameraGraphLocked(config, CameraGraphId.Companion.nextId(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1))));
        }
        return cameraGraphCreateCameraGraphLocked;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public List<CameraGraph> createCameraGraphs(CameraGraph.ConcurrentConfig concurrentConfig) {
        ArrayList arrayList;
        x.f(concurrentConfig, "config");
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            Map mapC = r.c();
            Iterator<CameraGraph.Config> it = concurrentConfig.getGraphConfigs().iterator();
            while (it.hasNext()) {
                mapC.put(it.next(), CameraGraphId.Companion.nextId(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1))));
            }
            Map mapB = r.b(mapC);
            List<CameraGraph.Config> graphConfigs = concurrentConfig.getGraphConfigs();
            ArrayList arrayList2 = new ArrayList(i.q(graphConfigs, 10));
            Iterator<T> it2 = graphConfigs.iterator();
            while (it2.hasNext()) {
                arrayList2.add(CameraId.m546boximpl(((CameraGraph.Config) it2.next()).m505getCameraDz_R5H8()));
            }
            ConcurrentCameraGraphs concurrentCameraGraphs = new ConcurrentCameraGraphs(i.au(mapB.values()), i.au(arrayList2));
            List<CameraGraph.Config> graphConfigs2 = concurrentConfig.getGraphConfigs();
            ArrayList arrayList3 = new ArrayList(i.q(graphConfigs2, 10));
            for (CameraGraph.Config config : graphConfigs2) {
                config.setConcurrentCameraGraphs$camera_camera2_pipe(concurrentCameraGraphs);
                Object obj = mapB.get(config);
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList3.add(createCameraGraphLocked(config, (CameraGraphId) obj));
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public FrameGraph createFrameGraph(FrameGraph.Config config) {
        FrameGraph frameGraphCreateFrameGraphLocked;
        x.f(config, "frameGraphConfig");
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            frameGraphCreateFrameGraphLocked = createFrameGraphLocked(config, CameraGraphId.Companion.nextId(true));
        }
        return frameGraphCreateFrameGraphLocked;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public List<FrameGraph> createFrameGraphs(FrameGraph.ConcurrentConfig concurrentConfig) {
        ArrayList arrayList;
        x.f(concurrentConfig, "frameGraphConfigs");
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            Map mapC = r.c();
            Iterator<FrameGraph.Config> it = concurrentConfig.getFrameGraphConfigs().iterator();
            while (it.hasNext()) {
                mapC.put(it.next(), CameraGraphId.Companion.nextId(true));
            }
            Map mapB = r.b(mapC);
            List<FrameGraph.Config> frameGraphConfigs = concurrentConfig.getFrameGraphConfigs();
            ArrayList arrayList2 = new ArrayList(i.q(frameGraphConfigs, 10));
            Iterator<T> it2 = frameGraphConfigs.iterator();
            while (it2.hasNext()) {
                arrayList2.add(CameraId.m546boximpl(((FrameGraph.Config) it2.next()).getCameraGraphConfig().m505getCameraDz_R5H8()));
            }
            ConcurrentCameraGraphs concurrentCameraGraphs = new ConcurrentCameraGraphs(i.au(mapB.values()), i.au(arrayList2));
            List<FrameGraph.Config> frameGraphConfigs2 = concurrentConfig.getFrameGraphConfigs();
            ArrayList arrayList3 = new ArrayList(i.q(frameGraphConfigs2, 10));
            for (FrameGraph.Config config : frameGraphConfigs2) {
                config.getCameraGraphConfig().setConcurrentCameraGraphs$camera_camera2_pipe(concurrentCameraGraphs);
                Object obj = mapB.get(config);
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList3.add(createFrameGraphLocked(config, (CameraGraphId) obj));
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    /* renamed from: getGlobalAudioRestrictionMode-_b5Q8KE */
    public int mo570getGlobalAudioRestrictionMode_b5Q8KE() {
        synchronized (this.lock) {
            if (!this.shutdown) {
                AudioRestrictionMode audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A = this.component.cameraAudioRestrictionController().mo1001getGlobalAudioRestrictionMode4o0Og1A();
                return audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A != null ? audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A.m336unboximpl() : AudioRestrictionMode.Companion.m337getAUDIO_RESTRICTION_NONE_b5Q8KE();
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Trying to get audio restriction after shutdown! Returning NONE");
            }
            return AudioRestrictionMode.Companion.m337getAUDIO_RESTRICTION_NONE_b5Q8KE();
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    /* renamed from: isConfigSupported-NpXggIU */
    public Object mo571isConfigSupportedNpXggIU(CameraGraph.Config config, e<? super ConfigQueryResult> eVar) {
        CameraBackend backend = getBackend(config);
        if (backend != null) {
            return backend.mo363isConfigSupportedNpXggIU(config, eVar);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public void prewarmIsConfigSupported(CameraGraph.Config config) {
        x.f(config, "graphConfig");
        CameraBackend backend = getBackend(config);
        if (backend == null) {
            throw new IllegalStateException("Required value was null.");
        }
        backend.mo366prewarmIsConfigSupportedEfqyGwQ(config.m505getCameraDz_R5H8());
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    /* renamed from: setGlobalAudioRestrictionMode-LwUUkyU */
    public void mo572setGlobalAudioRestrictionModeLwUUkyU(int i2) {
        synchronized (this.lock) {
            if (!this.shutdown) {
                this.component.cameraAudioRestrictionController().mo1002setGlobalAudioRestrictionMode3NUV5dA(AudioRestrictionMode.m330boximpl(i2));
            } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Trying to set audio restriction after shutdown!");
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public void shutdown() {
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            this.component.cameraPipeLifetime().shutdown();
            this.shutdown = true;
        }
    }

    public String toString() {
        return "CameraPipe-" + this.debugId;
    }
}

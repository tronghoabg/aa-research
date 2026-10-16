package androidx.camera.camera2.pipe.internal;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendFactory;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.config.CameraPipeContext;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.c.k;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraBackendsImpl implements CameraBackends {
    private final Map<CameraBackendId, CameraBackend> activeCameraBackends;
    private final Map<CameraBackendId, CameraBackendFactory> cameraBackends;
    private final Context cameraPipeContext;

    /* renamed from: default, reason: not valid java name */
    private final CameraBackend f1default;
    private final String defaultBackendId;
    private final Object lock;
    private final Threads threads;

    /* compiled from: WazeSource */
    public final class CameraBackendContext implements CameraContext {
        private final Context appContext;
        private final CameraBackends cameraBackends;
        private final Threads threads;

        public CameraBackendContext(Context context, Threads threads, CameraBackends cameraBackends) {
            x.f(context, "appContext");
            x.f(threads, "threads");
            x.f(cameraBackends, "cameraBackends");
            this.appContext = context;
            this.threads = threads;
            this.cameraBackends = cameraBackends;
        }

        @Override // androidx.camera.camera2.pipe.CameraContext
        public Context getAppContext() {
            return this.appContext;
        }

        @Override // androidx.camera.camera2.pipe.CameraContext
        public CameraBackends getCameraBackends() {
            return this.cameraBackends;
        }

        @Override // androidx.camera.camera2.pipe.CameraContext
        public Threads getThreads() {
            return this.threads;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CameraBackendsImpl(String str, Map<CameraBackendId, ? extends CameraBackendFactory> map, Context context, Threads threads, CameraPipeLifetime cameraPipeLifetime) {
        x.f(str, "defaultBackendId");
        x.f(map, "cameraBackends");
        x.f(context, "cameraPipeContext");
        x.f(threads, "threads");
        x.f(cameraPipeLifetime, "cameraPipeLifetime");
        this.defaultBackendId = str;
        this.cameraBackends = map;
        this.cameraPipeContext = context;
        this.threads = threads;
        this.lock = new Object();
        this.activeCameraBackends = new LinkedHashMap();
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.CAMERA, new Runnable() { // from class: androidx.camera.camera2.pipe.internal.CameraBackendsImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                aj.t(k.f48060a, new CameraBackendsImpl$1$1(this.f$0, null));
            }
        });
        CameraBackend cameraBackendMo389getSG3A4s8 = mo389getSG3A4s8(str);
        if (cameraBackendMo389getSG3A4s8 != null) {
            this.f1default = cameraBackendMo389getSG3A4s8;
            return;
        }
        throw new IllegalStateException("Failed to load the default backend for " + CameraBackendId.m387toStringimpl(str) + "! Available backends are " + map.keySet());
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    /* renamed from: get-SG3A4s8 */
    public CameraBackend mo389getSG3A4s8(String str) {
        x.f(str, "backendId");
        synchronized (this.lock) {
            CameraBackend cameraBackend = this.activeCameraBackends.get(CameraBackendId.m382boximpl(str));
            if (cameraBackend != null) {
                return cameraBackend;
            }
            CameraBackendFactory cameraBackendFactory = this.cameraBackends.get(CameraBackendId.m382boximpl(str));
            CameraBackend cameraBackendCreate = cameraBackendFactory != null ? cameraBackendFactory.create(new CameraBackendContext(this.cameraPipeContext, this.threads, this)) : null;
            if (cameraBackendCreate != null) {
                if (!CameraBackendId.m385equalsimpl0(str, cameraBackendCreate.mo362getIdQwmhuAM())) {
                    throw new IllegalStateException("Unexpected backend id! Expected " + CameraBackendId.m387toStringimpl(str) + " but it was actually " + CameraBackendId.m387toStringimpl(cameraBackendCreate.mo362getIdQwmhuAM()));
                }
                this.activeCameraBackends.put(CameraBackendId.m382boximpl(str), cameraBackendCreate);
            }
            return cameraBackendCreate;
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    public Set<CameraBackendId> getActiveIds() {
        Set<CameraBackendId> setKeySet;
        synchronized (this.lock) {
            setKeySet = this.activeCameraBackends.keySet();
        }
        return setKeySet;
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    public Set<CameraBackendId> getAllIds() {
        return this.cameraBackends.keySet();
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    public CameraBackend getDefault() {
        return this.f1default;
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    public Object shutdown(e<? super ab> eVar) {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "CameraBackends#shutdown");
        }
        Map<CameraBackendId, CameraBackend> map = this.activeCameraBackends;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<CameraBackendId, CameraBackend>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().shutdownAsync());
        }
        Object objE = aj.E(arrayList, eVar);
        return objE == a.f48038a ? objE : ab.f48028a;
    }

    public /* synthetic */ CameraBackendsImpl(String str, Map map, @CameraPipeContext Context context, Threads threads, CameraPipeLifetime cameraPipeLifetime, o oVar) {
        this(str, map, context, threads, cameraPipeLifetime);
    }
}

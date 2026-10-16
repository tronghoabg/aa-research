package androidx.camera.camera2.pipe;

import android.view.Surface;
import androidx.camera.camera2.pipe.core.Log;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.a.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraSurfaceManager {
    public static final boolean DEBUG = false;
    public static final Companion Companion = new Companion(null);
    private static final b surfaceTokenDebugIds = h.e.b.f(0);
    private final Object lock = new Object();
    private final Map<Surface, Integer> useCountMap = new LinkedHashMap();
    private final Set<SurfaceListener> listeners = new LinkedHashSet();

    /* compiled from: WazeSource */
    public interface SurfaceListener {
        void onSurfaceActive(Surface surface);

        void onSurfaceInactive(Surface surface);
    }

    /* compiled from: WazeSource */
    public final class SurfaceToken implements AutoCloseable {
        private final kotlinx.a.a closed;
        private final int debugId;
        private final Surface surface;
        final /* synthetic */ CameraSurfaceManager this$0;

        public SurfaceToken(CameraSurfaceManager cameraSurfaceManager, Surface surface) {
            x.f(surface, "surface");
            this.this$0 = cameraSurfaceManager;
            this.surface = surface;
            this.debugId = CameraSurfaceManager.Companion.getSurfaceTokenDebugIds$camera_camera2_pipe().e();
            this.closed = h.e.b.e(false);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.closed.b(false, true)) {
                this.this$0.onTokenClosed$camera_camera2_pipe(this);
            }
        }

        public final Surface getSurface$camera_camera2_pipe() {
            return this.surface;
        }

        public String toString() {
            return "SurfaceToken-" + this.debugId;
        }
    }

    public final void addListener(SurfaceListener surfaceListener) {
        Set setKeySet;
        x.f(surfaceListener, "listener");
        synchronized (this.lock) {
            this.listeners.add(surfaceListener);
            Map<Surface, Integer> map = this.useCountMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Surface, Integer> entry : map.entrySet()) {
                if (entry.getValue().intValue() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            setKeySet = linkedHashMap.keySet();
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            surfaceListener.onSurfaceActive((Surface) it.next());
        }
    }

    public final void onTokenClosed$camera_camera2_pipe(SurfaceToken surfaceToken) {
        Surface surface$camera_camera2_pipe;
        List listAo;
        x.f(surfaceToken, "surfaceToken");
        synchronized (this.lock) {
            surface$camera_camera2_pipe = surfaceToken.getSurface$camera_camera2_pipe();
            Integer num = this.useCountMap.get(surface$camera_camera2_pipe);
            if (num == null) {
                throw new IllegalStateException("Surface " + surface$camera_camera2_pipe + " (" + surfaceToken + ") has no use count");
            }
            int iIntValue = num.intValue() - 1;
            this.useCountMap.put(surface$camera_camera2_pipe, Integer.valueOf(iIntValue));
            if (iIntValue == 0) {
                listAo = i.ao(this.listeners);
                this.useCountMap.remove(surface$camera_camera2_pipe);
            } else {
                listAo = null;
            }
        }
        if (listAo != null) {
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                ((SurfaceListener) it.next()).onSurfaceInactive(surface$camera_camera2_pipe);
            }
        }
    }

    public final AutoCloseable registerSurface$camera_camera2_pipe(Surface surface) {
        SurfaceToken surfaceToken;
        List listAo;
        x.f(surface, "surface");
        if (!surface.isValid() && Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.lock) {
            surfaceToken = new SurfaceToken(this, surface);
            Integer num = this.useCountMap.get(surface);
            int iIntValue = (num != null ? num.intValue() : 0) + 1;
            this.useCountMap.put(surface, Integer.valueOf(iIntValue));
            listAo = iIntValue == 1 ? i.ao(this.listeners) : null;
        }
        if (listAo != null) {
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                ((SurfaceListener) it.next()).onSurfaceActive(surface);
            }
        }
        return surfaceToken;
    }

    public final void removeListener(SurfaceListener surfaceListener) {
        x.f(surfaceListener, "listener");
        synchronized (this.lock) {
            this.listeners.remove(surfaceListener);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b getSurfaceTokenDebugIds$camera_camera2_pipe() {
            return CameraSurfaceManager.surfaceTokenDebugIds;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

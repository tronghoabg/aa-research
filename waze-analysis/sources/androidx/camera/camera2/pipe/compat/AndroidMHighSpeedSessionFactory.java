package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import h.a.r;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidMHighSpeedSessionFactory implements CaptureSessionFactory {
    private final StreamGraphImpl streamGraph;
    private final Threads threads;

    public AndroidMHighSpeedSessionFactory(StreamGraphImpl streamGraphImpl, Threads threads) {
        x.f(streamGraphImpl, "streamGraph");
        x.f(threads, "threads");
        this.streamGraph = streamGraphImpl;
        this.threads = threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public CaptureSessionFactory.Result create(CameraDeviceWrapper cameraDeviceWrapper, Map<StreamId, ? extends Surface> map, CaptureSessionState captureSessionState) throws Exception {
        x.f(cameraDeviceWrapper, "cameraDevice");
        x.f(map, "surfaces");
        x.f(captureSessionState, "captureSessionState");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<StreamId, ? extends Surface>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        if (cameraDeviceWrapper.createConstrainedHighSpeedCaptureSession(arrayList, captureSessionState)) {
            return new CaptureSessionFactory.Result.Success(r.j(), CaptureSessionFactoryKt.buildSimpleOutputSurfaceMap(map, this.streamGraph));
        }
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, c.a(captureSessionState, cameraDeviceWrapper, "Failed to create ConstrainedHighSpeedCaptureSession from ", " for ", "!"));
        }
        captureSessionState.onSessionFinalized();
        return CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}

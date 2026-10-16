package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.params.InputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import h.a.i;
import h.a.r;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidMSessionFactory implements CaptureSessionFactory {
    private final CameraGraph.Config graphConfig;
    private final StreamGraphImpl streamGraph;
    private final Threads threads;

    public AndroidMSessionFactory(Threads threads, StreamGraphImpl streamGraphImpl, CameraGraph.Config config) {
        x.f(threads, "threads");
        x.f(streamGraphImpl, "streamGraph");
        x.f(config, "graphConfig");
        this.threads = threads;
        this.streamGraph = streamGraphImpl;
        this.graphConfig = config;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public CaptureSessionFactory.Result create(CameraDeviceWrapper cameraDeviceWrapper, Map<StreamId, ? extends Surface> map, CaptureSessionState captureSessionState) throws Exception {
        x.f(cameraDeviceWrapper, "cameraDevice");
        x.f(map, "surfaces");
        x.f(captureSessionState, "captureSessionState");
        if (this.graphConfig.getInput() != null) {
            OutputStream.Config config = (OutputStream.Config) i.X(((InputStream.Config) i.X(this.graphConfig.getInput())).getStream().getOutputs());
            InputConfiguration inputConfiguration = new InputConfiguration(config.getSize().getWidth(), config.getSize().getHeight(), config.m765getFormat8FPWQzE());
            ArrayList arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<StreamId, ? extends Surface>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            if (!cameraDeviceWrapper.createReprocessableCaptureSession(inputConfiguration, arrayList, captureSessionState)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, c.a(captureSessionState, cameraDeviceWrapper, "Failed to create reprocessable captures session from ", " for ", "!"));
                }
                captureSessionState.onSessionFinalized();
                return CaptureSessionFactory.Result.Failed.INSTANCE;
            }
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator<Map.Entry<StreamId, ? extends Surface>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getValue());
            }
            if (!cameraDeviceWrapper.createCaptureSession(arrayList2, captureSessionState)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, c.a(captureSessionState, cameraDeviceWrapper, "Failed to create captures session from ", " for ", "!"));
                }
                captureSessionState.onSessionFinalized();
                return CaptureSessionFactory.Result.Failed.INSTANCE;
            }
        }
        return new CaptureSessionFactory.Result.Success(r.j(), CaptureSessionFactoryKt.buildSimpleOutputSurfaceMap(map, this.streamGraph));
    }
}

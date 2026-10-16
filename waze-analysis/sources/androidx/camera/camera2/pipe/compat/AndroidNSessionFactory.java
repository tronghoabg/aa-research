package androidx.camera.camera2.pipe.compat;

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
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidNSessionFactory implements CaptureSessionFactory {
    private final CameraGraph.Config graphConfig;
    private final StreamGraphImpl streamGraph;
    private final Threads threads;

    public AndroidNSessionFactory(Threads threads, StreamGraphImpl streamGraphImpl, CameraGraph.Config config) {
        x.f(threads, "threads");
        x.f(streamGraphImpl, "streamGraph");
        x.f(config, "graphConfig");
        this.threads = threads;
        this.streamGraph = streamGraphImpl;
        this.graphConfig = config;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public CaptureSessionFactory.Result create(CameraDeviceWrapper cameraDeviceWrapper, Map<StreamId, ? extends Surface> map, CaptureSessionState captureSessionState) throws Exception {
        boolean zCreateReprocessableCaptureSessionByConfigurations;
        x.f(cameraDeviceWrapper, "cameraDevice");
        x.f(map, "surfaces");
        x.f(captureSessionState, "captureSessionState");
        OutputConfigurations outputConfigurationsBuildOutputConfigurations = CaptureSessionFactoryKt.buildOutputConfigurations(this.graphConfig, this.streamGraph, map);
        if (outputConfigurationsBuildOutputConfigurations.getAll().isEmpty()) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                CameraGraph.Config config = this.graphConfig;
                Objects.toString(config);
                android.util.Log.w(Log.TAG, "Failed to create OutputConfigurations for ".concat(String.valueOf(config)));
            }
            captureSessionState.onSessionFinalized();
            return CaptureSessionFactory.Result.Failed.INSTANCE;
        }
        if (this.graphConfig.getInput() == null) {
            zCreateReprocessableCaptureSessionByConfigurations = cameraDeviceWrapper.createCaptureSessionByOutputConfigurations(outputConfigurationsBuildOutputConfigurations.getAll(), captureSessionState);
        } else {
            OutputStream.Config config2 = (OutputStream.Config) i.X(((InputStream.Config) i.X(this.graphConfig.getInput())).getStream().getOutputs());
            zCreateReprocessableCaptureSessionByConfigurations = cameraDeviceWrapper.createReprocessableCaptureSessionByConfigurations(new InputConfigData(config2.getSize().getWidth(), config2.getSize().getHeight(), config2.m765getFormat8FPWQzE()), outputConfigurationsBuildOutputConfigurations.getAll(), captureSessionState);
        }
        if (zCreateReprocessableCaptureSessionByConfigurations) {
            return new CaptureSessionFactory.Result.Success(r.j(), outputConfigurationsBuildOutputConfigurations.getOutputSurfaceMap());
        }
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, c.a(captureSessionState, cameraDeviceWrapper, "Failed to create capture session from ", " for ", "!"));
        }
        captureSessionState.onSessionFinalized();
        return CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}

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
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidPSessionFactory implements CaptureSessionFactory {
    private final CameraGraph.Config graphConfig;
    private final StreamGraphImpl streamGraph;
    private final Threads threads;

    public AndroidPSessionFactory(Threads threads, CameraGraph.Config config, StreamGraphImpl streamGraphImpl) {
        x.f(threads, "threads");
        x.f(config, "graphConfig");
        x.f(streamGraphImpl, "streamGraph");
        this.threads = threads;
        this.graphConfig = config;
        this.streamGraph = streamGraphImpl;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public CaptureSessionFactory.Result create(CameraDeviceWrapper cameraDeviceWrapper, Map<StreamId, ? extends Surface> map, CaptureSessionState captureSessionState) throws Exception {
        int iM509getSessionMode2uNL3no;
        int i2;
        ArrayList arrayList;
        x.f(cameraDeviceWrapper, "cameraDevice");
        x.f(map, "surfaces");
        x.f(captureSessionState, "captureSessionState");
        int iM509getSessionMode2uNL3no2 = this.graphConfig.m509getSessionMode2uNL3no();
        if (CameraGraph.OperatingMode.m530equalsimpl0(iM509getSessionMode2uNL3no2, CameraGraph.OperatingMode.Companion.m537getNORMAL2uNL3no())) {
            i2 = 0;
        } else {
            if (CameraGraph.OperatingMode.m530equalsimpl0(iM509getSessionMode2uNL3no2, CameraGraph.OperatingMode.Companion.m536getHIGH_SPEED2uNL3no())) {
                iM509getSessionMode2uNL3no = 1;
            } else {
                boolean zM530equalsimpl0 = CameraGraph.OperatingMode.m530equalsimpl0(iM509getSessionMode2uNL3no2, CameraGraph.OperatingMode.Companion.m535getEXTENSION2uNL3no());
                CameraGraph.Config config = this.graphConfig;
                if (zM530equalsimpl0) {
                    throw new IllegalArgumentException("Unsupported session mode: ".concat(CameraGraph.OperatingMode.m532toStringimpl(config.m509getSessionMode2uNL3no())));
                }
                iM509getSessionMode2uNL3no = config.m509getSessionMode2uNL3no();
            }
            i2 = iM509getSessionMode2uNL3no;
        }
        OutputConfigurations outputConfigurationsBuildOutputConfigurations = CaptureSessionFactoryKt.buildOutputConfigurations(this.graphConfig, this.streamGraph, map);
        if (outputConfigurationsBuildOutputConfigurations.getAll().isEmpty()) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                CameraGraph.Config config2 = this.graphConfig;
                Objects.toString(config2);
                android.util.Log.w(Log.TAG, "Failed to create OutputConfigurations for ".concat(String.valueOf(config2)));
            }
            captureSessionState.onSessionFinalized();
            return CaptureSessionFactory.Result.Failed.INSTANCE;
        }
        List<InputStream.Config> input = this.graphConfig.getInput();
        if (input != null) {
            List<InputStream.Config> list = input;
            ArrayList arrayList2 = new ArrayList(i.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                OutputStream.Config config3 = (OutputStream.Config) i.X(((InputStream.Config) it.next()).getStream().getOutputs());
                arrayList2.add(new InputConfigData(config3.getSize().getWidth(), config3.getSize().getHeight(), config3.m765getFormat8FPWQzE()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = arrayList;
        if (arrayList3 != null) {
            ArrayList arrayList4 = arrayList3;
            if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    if (((InputConfigData) it2.next()).getFormat() != ((InputConfigData) arrayList3.get(0)).getFormat()) {
                        throw new IllegalStateException("All InputStream.Config objects must have the same format for multi resolution");
                    }
                }
            }
        }
        CameraGraph.Config config4 = this.graphConfig;
        if (cameraDeviceWrapper.createCaptureSession(new SessionConfigData(i2, arrayList3, outputConfigurationsBuildOutputConfigurations.getAll(), this.threads.getCamera2Executor(), captureSessionState, config4.m510getSessionTemplatefGx8uWA(), config4.getSessionParameters(), config4.m508getSessionColorSpacedxVZaPA(), null))) {
            return new CaptureSessionFactory.Result.Success(outputConfigurationsBuildOutputConfigurations.getDeferred(), outputConfigurationsBuildOutputConfigurations.getOutputSurfaceMap());
        }
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, c.a(captureSessionState, cameraDeviceWrapper, "Failed to create capture session from ", " for ", "!"));
        }
        captureSessionState.onSessionFinalized();
        return CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}

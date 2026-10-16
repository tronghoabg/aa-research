package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.HandlerExecutor;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import h.g.b.x;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidExtensionSessionFactory implements CaptureSessionFactory {
    private final Camera2MetadataProvider camera2MetadataProvider;
    private final CameraGraph.Config graphConfig;
    private final StreamGraphImpl streamGraph;
    private final StrictMode strictMode;
    private final Threads threads;

    public AndroidExtensionSessionFactory(Threads threads, CameraGraph.Config config, StreamGraphImpl streamGraphImpl, Camera2MetadataProvider camera2MetadataProvider, StrictMode strictMode) {
        x.f(threads, "threads");
        x.f(config, "graphConfig");
        x.f(streamGraphImpl, "streamGraph");
        x.f(camera2MetadataProvider, "camera2MetadataProvider");
        x.f(strictMode, "strictMode");
        this.threads = threads;
        this.graphConfig = config;
        this.streamGraph = streamGraphImpl;
        this.camera2MetadataProvider = camera2MetadataProvider;
        this.strictMode = strictMode;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public CaptureSessionFactory.Result create(CameraDeviceWrapper cameraDeviceWrapper, Map<StreamId, ? extends Surface> map, CaptureSessionState captureSessionState) throws Exception {
        x.f(cameraDeviceWrapper, "cameraDevice");
        x.f(map, "surfaces");
        x.f(captureSessionState, "captureSessionState");
        boolean zM530equalsimpl0 = CameraGraph.OperatingMode.m530equalsimpl0(this.graphConfig.m509getSessionMode2uNL3no(), CameraGraph.OperatingMode.Companion.m535getEXTENSION2uNL3no());
        CameraGraph.Config config = this.graphConfig;
        if (!zM530equalsimpl0) {
            throw new IllegalArgumentException("Unsupported session mode: " + CameraGraph.OperatingMode.m532toStringimpl(config.m509getSessionMode2uNL3no()) + " for Extension CameraGraph");
        }
        Object obj = config.getSessionParameters().get(CameraPipeKeys.INSTANCE.getCamera2ExtensionMode());
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            throw new IllegalStateException("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
        }
        int iIntValue = num.intValue();
        if (this.graphConfig.getInput() != null) {
            throw new IllegalStateException("Reprocessing is not supported for Extensions");
        }
        CameraMetadata cameraMetadataMo1047awaitCameraMetadataEfqyGwQ = this.camera2MetadataProvider.mo1047awaitCameraMetadataEfqyGwQ(cameraDeviceWrapper.mo985getCameraIdDz_R5H8());
        Set<Integer> supportedExtensions = cameraMetadataMo1047awaitCameraMetadataEfqyGwQ.getSupportedExtensions();
        StrictMode strictMode = this.strictMode;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (!supportedExtensions.contains(numValueOf)) {
            String str = cameraDeviceWrapper + " does not support extension mode " + iIntValue + ". Supported extensions are " + supportedExtensions;
            if (strictMode.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, str);
            }
        }
        if (this.graphConfig.getPostviewStream() != null) {
            CameraExtensionMetadata cameraExtensionMetadataAwaitExtensionMetadata = cameraMetadataMo1047awaitCameraMetadataEfqyGwQ.awaitExtensionMetadata(iIntValue);
            StrictMode strictMode2 = this.strictMode;
            if (!cameraExtensionMetadataAwaitExtensionMetadata.isPostviewSupported()) {
                Objects.toString(cameraDeviceWrapper);
                String strValueOf = String.valueOf(cameraDeviceWrapper);
                boolean enabled = strictMode2.getEnabled();
                String strConcat = strValueOf.concat(" does not support Postview streams");
                if (enabled) {
                    throw new IllegalStateException(strConcat);
                }
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, strConcat);
                }
            }
            if (this.graphConfig.getPostviewStream().getOutputs().size() != 1) {
                throw new IllegalStateException("Postview streams can only have one OutputStream.config object");
            }
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
        if (!outputConfigurationsBuildOutputConfigurations.getDeferred().isEmpty()) {
            throw new IllegalStateException("Deferred output is not supported for Extensions");
        }
        ExtensionSessionState extensionSessionState = new ExtensionSessionState(captureSessionState);
        CameraGraph.Config config3 = this.graphConfig;
        if (cameraDeviceWrapper.createExtensionSession(new ExtensionSessionConfigData(2, outputConfigurationsBuildOutputConfigurations.getAll(), new HandlerExecutor(this.threads.getCamera2Handler()), captureSessionState, config3.m510getSessionTemplatefGx8uWA(), config3.getSessionParameters(), numValueOf, extensionSessionState, outputConfigurationsBuildOutputConfigurations.getPostviewOutput()))) {
            return new CaptureSessionFactory.Result.Success(outputConfigurationsBuildOutputConfigurations.getDeferred(), outputConfigurationsBuildOutputConfigurations.getOutputSurfaceMap());
        }
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, c.a(captureSessionState, cameraDeviceWrapper, "Failed to create ExtensionCaptureSession from ", " for ", "!"));
        }
        captureSessionState.onSessionFinalized();
        return CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}

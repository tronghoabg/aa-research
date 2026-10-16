package androidx.camera.camera2.config;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.camera.camera2.adapter.CameraControlAdapter;
import androidx.camera.camera2.adapter.CameraInfoAdapter;
import androidx.camera.camera2.adapter.CameraInternalAdapter;
import androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.adapter.ZslControlImpl;
import androidx.camera.camera2.compat.Camera2CameraControlCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class CameraModule {
    public static final Companion Companion = new Companion(null);

    public abstract CameraControlInternal bindCameraControlInternal(CameraControlAdapter cameraControlAdapter);

    public abstract CameraInfoInternal bindCameraInfoInternal(CameraInfoAdapter cameraInfoAdapter);

    public abstract CameraInternal bindCameraInternal(CameraInternalAdapter cameraInternalAdapter);

    public abstract CameraProperties bindCameraProperties(CameraPipeCameraProperties cameraPipeCameraProperties);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        @CameraScope
        public final Camera2CameraControl provideCamera2CameraControl(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
            x.f(camera2CameraControlCompat, "compat");
            x.f(useCaseThreads, "threads");
            x.f(comboRequestListener, "requestListener");
            return Camera2CameraControl.Companion.create(camera2CameraControlCompat, useCaseThreads, comboRequestListener);
        }

        @CameraScope
        public final String provideCameraIdString(CameraConfig cameraConfig) {
            x.f(cameraConfig, "config");
            return cameraConfig.m231getCameraIdDz_R5H8();
        }

        @CameraScope
        public final CameraMetadata provideCameraMetadata(CameraPipe cameraPipe, CameraConfig cameraConfig) {
            x.f(cameraPipe, "cameraPipe");
            x.f(cameraConfig, "config");
            try {
                return cameraPipe.cameras().mo434awaitCameraMetadataEfqyGwQ(cameraConfig.m231getCameraIdDz_R5H8());
            } catch (DoNotDisturbException unused) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (!Logger.isErrorEnabled(Log.TAG)) {
                    return null;
                }
                android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Failed to inject camera metadata: Do Not Disturb mode is on.");
                return null;
            }
        }

        @CameraScope
        public final Quirks provideCameraQuirksValues(CameraQuirks cameraQuirks) {
            x.f(cameraQuirks, "cameraQuirks");
            return cameraQuirks.getQuirks();
        }

        @CameraScope
        public final EncoderProfilesProvider provideEncoderProfilesProvider(String str, CameraQuirks cameraQuirks) {
            x.f(str, "cameraIdString");
            x.f(cameraQuirks, "cameraQuirks");
            return new EncoderProfilesProviderAdapter(str, cameraQuirks.getQuirks());
        }

        @CameraScope
        public final StreamConfigurationMap provideStreamConfigurationMap(CameraMetadata cameraMetadata) {
            if (cameraMetadata == null) {
                return null;
            }
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
            return (StreamConfigurationMap) cameraMetadata.get(key);
        }

        @CameraScope
        public final SupportedSurfaceCombination provideSupportedSurfaceCombination(Context context, CameraProperties cameraProperties, EncoderProfilesProvider encoderProfilesProvider, ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer) {
            x.f(context, "context");
            x.f(cameraProperties, "cameraProperties");
            x.f(encoderProfilesProvider, "encoderProfilesProvider");
            x.f(extraSupportedSurfaceCombinationsContainer, "extraSupportedSurfaceCombinationsContainer");
            return new SupportedSurfaceCombination(context, cameraProperties.getMetadata(), encoderProfilesProvider, FeatureCombinationQuery.NO_OP_FEATURE_COMBINATION_QUERY, extraSupportedSurfaceCombinationsContainer);
        }

        @CameraScope
        public final UseCaseThreads provideUseCaseThreads(CameraConfig cameraConfig, CameraThreadConfig cameraThreadConfig) {
            x.f(cameraConfig, "cameraConfig");
            x.f(cameraThreadConfig, "cameraThreadConfig");
            Executor cameraExecutor = cameraThreadConfig.getCameraExecutor();
            x.e(cameraExecutor, "getCameraExecutor(...)");
            Executor cameraExecutor2 = cameraThreadConfig.getCameraExecutor();
            x.e(cameraExecutor2, "getCameraExecutor(...)");
            ab abVarF = bo.f(cameraExecutor2);
            return new UseCaseThreads(aj.e(aj.Q().plus(abVarF).plus(new ae("CXCP-UseCase-".concat(String.valueOf(cameraConfig.m231getCameraIdDz_R5H8()))))), cameraExecutor, abVarF);
        }

        @CameraScope
        public final ZslControl provideZslControl(CameraProperties cameraProperties) {
            x.f(cameraProperties, "cameraProperties");
            return new ZslControlImpl(cameraProperties);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

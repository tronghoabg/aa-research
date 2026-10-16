package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.adapter.CameraFactoryProvider;
import androidx.camera.camera2.adapter.CameraSurfaceAdapter;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2Config {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class DefaultProvider implements CameraXConfig.Provider {
        @Override // androidx.camera.core.CameraXConfig.Provider
        public CameraXConfig getCameraXConfig() {
            return Camera2Config.Companion.defaultConfig();
        }
    }

    private Camera2Config() {
    }

    public static final CameraXConfig defaultConfig() {
        return Companion.defaultConfig();
    }

    public static final CameraXConfig from(CameraPipe cameraPipe, Context context, CameraThreadConfig cameraThreadConfig) {
        return Companion.from(cameraPipe, context, cameraThreadConfig);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ CameraXConfig from$default(Companion companion, CameraPipe cameraPipe, Context context, CameraThreadConfig cameraThreadConfig, int i2, Object obj) {
            if (1 == (i2 & 1)) {
                cameraPipe = null;
            }
            if ((i2 & 2) != 0) {
                context = null;
            }
            if ((i2 & 4) != 0) {
                cameraThreadConfig = null;
            }
            return companion.from(cameraPipe, context, cameraThreadConfig);
        }

        public final CameraXConfig defaultConfig() {
            return from$default(this, null, null, null, 7, null);
        }

        public final CameraXConfig from(CameraPipe cameraPipe, Context context, CameraThreadConfig cameraThreadConfig) {
            CameraFactoryProvider cameraFactoryProvider = new CameraFactoryProvider(cameraPipe, context, cameraThreadConfig);
            CameraXConfig.Builder builder = new CameraXConfig.Builder();
            builder.setCameraFactoryProvider(cameraFactoryProvider);
            builder.setDeviceSurfaceManagerProvider(new CameraDeviceSurfaceManager.Provider() { // from class: androidx.camera.camera2.Camera2Config$Companion$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider
                public final CameraDeviceSurfaceManager newInstance(Context context2, Object obj, Set set, String str) {
                    return new CameraSurfaceAdapter(context2, obj, set, str);
                }
            });
            builder.setUseCaseConfigFactoryProvider(new UseCaseConfigFactory.Provider() { // from class: androidx.camera.camera2.Camera2Config$Companion$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
                public final UseCaseConfigFactory newInstance(Context context2, boolean z) {
                    return new CameraUseCaseAdapter(context2, z);
                }
            });
            builder.setRepeatingStreamForced(true);
            CameraXConfig cameraXConfigBuild = builder.build();
            x.e(cameraXConfigBuild, "build(...)");
            return cameraXConfigBuild;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

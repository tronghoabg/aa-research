package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.Config;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CaptureRequestConfiguratorKt {
    private static final Config.Option<Camera2CaptureRequestConfigurator> OPTION_CAPTURE_REQUEST_CONFIGURATOR;

    static {
        Config.Option<Camera2CaptureRequestConfigurator> optionCreate = Config.Option.create("camerax.core.appConfig.captureRequestConfigurator", Camera2CaptureRequestConfigurator.class);
        x.e(optionCreate, "create(...)");
        OPTION_CAPTURE_REQUEST_CONFIGURATOR = optionCreate;
    }

    public static final void configureWithUnchecked(Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator, Map<Object, ? extends Object> map) {
        x.f(camera2CaptureRequestConfigurator, "<this>");
        x.f(map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Object, ? extends Object> entry : map.entrySet()) {
            if (entry.getKey() instanceof CaptureRequest.Key) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        camera2CaptureRequestConfigurator.configureWith(linkedHashMap);
    }

    public static final Camera2CaptureRequestConfigurator getCamera2CaptureRequestConfigurator(CameraXConfig cameraXConfig) {
        x.f(cameraXConfig, "<this>");
        return (Camera2CaptureRequestConfigurator) cameraXConfig.getConfig().retrieveOption(OPTION_CAPTURE_REQUEST_CONFIGURATOR, null);
    }

    public static final Config.Option<Camera2CaptureRequestConfigurator> getOPTION_CAPTURE_REQUEST_CONFIGURATOR() {
        return OPTION_CAPTURE_REQUEST_CONFIGURATOR;
    }

    public static final CameraXConfig.Builder setCamera2CaptureRequestConfigurator(CameraXConfig.Builder builder, Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator) {
        x.f(builder, "<this>");
        x.f(camera2CaptureRequestConfigurator, "captureRequestConfigurator");
        builder.getMutableConfig().insertOption(OPTION_CAPTURE_REQUEST_CONFIGURATOR, camera2CaptureRequestConfigurator);
        return builder;
    }
}

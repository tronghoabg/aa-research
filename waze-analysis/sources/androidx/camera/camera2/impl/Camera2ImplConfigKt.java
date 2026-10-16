package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.Config;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ImplConfigKt {
    public static final Config.Option<Object> createCaptureRequestOption(CaptureRequest.Key<?> key) {
        x.f(key, "<this>");
        Config.Option<Object> optionCreate = Config.Option.create(Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM.concat(String.valueOf(key.getName())), Object.class, key);
        x.e(optionCreate, "create(...)");
        return optionCreate;
    }

    public static final Map<CaptureRequest.Key<?>, Object> toParameters(Config config) {
        Object objRetrieveOption;
        x.f(config, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Config.Option<?> option : config.listOptions()) {
            Object token = option.getToken();
            CaptureRequest.Key key = token instanceof CaptureRequest.Key ? (CaptureRequest.Key) token : null;
            if (key != null && (objRetrieveOption = config.retrieveOption(option)) != null) {
                linkedHashMap.put(key, objRetrieveOption);
            }
        }
        return linkedHashMap;
    }
}

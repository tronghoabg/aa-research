package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CaptureRequest;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class SessionParametersLegacy {
    private final Map<CaptureRequest.Key<?>, Object> mKeyVal;

    /* compiled from: WazeSource */
    public final class Builder {
        private final HashMap<CaptureRequest.Key<?>, Object> mKeyVal = new HashMap<>();

        public SessionParametersLegacy build() {
            return new SessionParametersLegacy(SessionParametersLegacy$Builder$$ExternalSyntheticBackport0.m(this.mKeyVal));
        }

        public <T> Builder set(CaptureRequest.Key<T> key, T t) {
            this.mKeyVal.put(key, t);
            return this;
        }
    }

    private SessionParametersLegacy(Map<CaptureRequest.Key<?>, Object> map) {
        this.mKeyVal = map;
    }

    public Map<CaptureRequest.Key<?>, Object> asMap() {
        return DesugarCollections.unmodifiableMap(this.mKeyVal);
    }

    public <T> T get(CaptureRequest.Key<T> key) {
        return (T) this.mKeyVal.get(key);
    }

    public Set<CaptureRequest.Key<?>> getKeys() {
        return SessionParametersLegacy$$ExternalSyntheticBackport0.m(this.mKeyVal.keySet());
    }
}

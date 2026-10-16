package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.Metadata;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Parameters {
    <T> void apply(CaptureRequest.Key<T> key, T t, ParameterUpdateListener parameterUpdateListener);

    void clear();

    <T> T get(CaptureRequest.Key<T> key);

    <T> T get(Metadata.Key<T> key);

    <T> boolean remove(CaptureRequest.Key<T> key);

    <T> boolean remove(Metadata.Key<T> key);

    boolean removeAll(Set<?> set);

    <T> void set(CaptureRequest.Key<T> key, T t);

    <T> void set(Metadata.Key<T> key, T t);

    void setAll(Map<Object, ? extends Object> map);
}

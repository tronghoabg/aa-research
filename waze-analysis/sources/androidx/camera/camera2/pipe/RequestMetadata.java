package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface RequestMetadata extends Metadata, UnsafeWrapper {
    <T> T get(CaptureRequest.Key<T> key);

    <T> T getOrDefault(CaptureRequest.Key<T> key, T t);

    boolean getRepeating();

    Request getRequest();

    /* renamed from: getRequestNumber-my6kx4g */
    long mo198getRequestNumbermy6kx4g();

    Map<StreamId, Surface> getStreams();

    /* renamed from: getTemplate-fGx8uWA */
    int mo199getTemplatefGx8uWA();
}

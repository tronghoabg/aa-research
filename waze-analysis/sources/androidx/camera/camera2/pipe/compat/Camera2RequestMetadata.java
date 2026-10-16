package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.view.Surface;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2RequestMetadata implements RequestMetadata {
    private final CameraCaptureSessionWrapper cameraCaptureSessionWrapper;
    private final CaptureRequest captureRequest;
    private final Map<?, Object> defaultParameters;
    private final Map<?, Object> graphParameters;
    private final boolean repeating;
    private final Request request;
    private final long requestNumber;
    private final Map<?, Object> requiredParameters;
    private final Map<StreamId, Surface> streams;
    private final int template;

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2RequestMetadata(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, CaptureRequest captureRequest, Map<?, ? extends Object> map, Map<?, ? extends Object> map2, Map<?, ? extends Object> map3, Map<StreamId, ? extends Surface> map4, int i2, boolean z, Request request, long j2) {
        x.f(cameraCaptureSessionWrapper, "cameraCaptureSessionWrapper");
        x.f(captureRequest, "captureRequest");
        x.f(map, "defaultParameters");
        x.f(map2, "graphParameters");
        x.f(map3, "requiredParameters");
        x.f(map4, "streams");
        x.f(request, "request");
        this.cameraCaptureSessionWrapper = cameraCaptureSessionWrapper;
        this.captureRequest = captureRequest;
        this.defaultParameters = map;
        this.graphParameters = map2;
        this.requiredParameters = map3;
        this.streams = map4;
        this.template = i2;
        this.repeating = z;
        this.request = request;
        this.requestNumber = j2;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T get(Metadata.Key<T> key) {
        x.f(key, "key");
        return this.requiredParameters.containsKey(key) ? (T) this.requiredParameters.get(key) : getRequest().getExtras().containsKey(key) ? (T) getRequest().getExtras().get(key) : this.graphParameters.containsKey(key) ? (T) this.graphParameters.get(key) : (T) this.defaultParameters.get(key);
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public <T> T getOrDefault(CaptureRequest.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) get(key);
        return t2 == null ? t : t2;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public boolean getRepeating() {
        return this.repeating;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public Request getRequest() {
        return this.request;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    /* renamed from: getRequestNumber-my6kx4g */
    public long mo198getRequestNumbermy6kx4g() {
        return this.requestNumber;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public Map<StreamId, Surface> getStreams() {
        return this.streams;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    /* renamed from: getTemplate-fGx8uWA */
    public int mo199getTemplatefGx8uWA() {
        return this.template;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, CaptureRequest.class)) {
            Parcelable parcelable = this.captureRequest;
            x.d(parcelable, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2RequestMetadata.unwrapAs");
            return (T) parcelable;
        }
        if (x.n(cls, CameraCaptureSession.class)) {
            T t = (T) this.cameraCaptureSessionWrapper.unwrapAs(CameraCaptureSession.class);
            if (t == null) {
                return null;
            }
            return t;
        }
        if (!x.n(cls, bi$$ExternalSyntheticApiModelOutline0.m134m())) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Check failed.");
        }
        T t2 = (T) this.cameraCaptureSessionWrapper.unwrapAs(bi$$ExternalSyntheticApiModelOutline0.m134m());
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T getOrDefault(Metadata.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) get(key);
        return t2 == null ? t : t2;
    }

    public /* synthetic */ Camera2RequestMetadata(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, CaptureRequest captureRequest, Map map, Map map2, Map map3, Map map4, int i2, boolean z, Request request, long j2, o oVar) {
        this(cameraCaptureSessionWrapper, captureRequest, map, map2, map3, map4, i2, z, request, j2);
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public <T> T get(CaptureRequest.Key<T> key) {
        x.f(key, "key");
        return (T) this.captureRequest.get(key);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}

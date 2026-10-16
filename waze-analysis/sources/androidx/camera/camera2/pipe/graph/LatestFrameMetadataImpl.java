package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.LatestFrameMetadata;
import androidx.camera.camera2.pipe.Metadata;
import h.a.c;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LatestFrameMetadataImpl implements LatestFrameMetadata {
    private final FrameNumber[] captureResultFrameNumbers;
    private final CaptureResult.Key<?>[] captureResultKeys;
    private final Object[] captureResultValues;
    private final FrameNumber[] metadataFrameNumbers;
    private final Object[] metadataValues;
    private final Metadata.Key<?>[] rawMetadataKeys;

    public LatestFrameMetadataImpl(CaptureResult.Key<?>[] keyArr, Object[] objArr, FrameNumber[] frameNumberArr, Metadata.Key<?>[] keyArr2, Object[] objArr2, FrameNumber[] frameNumberArr2) {
        x.f(keyArr, "captureResultKeys");
        x.f(objArr, "captureResultValues");
        x.f(frameNumberArr, "captureResultFrameNumbers");
        x.f(keyArr2, "rawMetadataKeys");
        x.f(objArr2, "metadataValues");
        x.f(frameNumberArr2, "metadataFrameNumbers");
        this.captureResultKeys = keyArr;
        this.captureResultValues = objArr;
        this.captureResultFrameNumbers = frameNumberArr;
        this.rawMetadataKeys = keyArr2;
        this.metadataValues = objArr2;
        this.metadataFrameNumbers = frameNumberArr2;
    }

    @Override // androidx.camera.camera2.pipe.LatestFrameMetadata
    public <T> T get(CaptureResult.Key<T> key) {
        x.f(key, "key");
        int length = this.captureResultKeys.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (x.n(this.captureResultKeys[i2], key)) {
                return (T) this.captureResultValues[i2];
            }
        }
        return null;
    }

    public final FrameNumber[] getCaptureResultFrameNumbers() {
        return this.captureResultFrameNumbers;
    }

    public final CaptureResult.Key<?>[] getCaptureResultKeys() {
        return this.captureResultKeys;
    }

    public final Object[] getCaptureResultValues() {
        return this.captureResultValues;
    }

    @Override // androidx.camera.camera2.pipe.LatestFrameMetadata
    /* renamed from: getFrameNumber-nwBJogA */
    public FrameNumber mo718getFrameNumbernwBJogA(CaptureResult.Key<?> key) {
        x.f(key, "key");
        int length = this.captureResultKeys.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (x.n(this.captureResultKeys[i2], key)) {
                return this.captureResultFrameNumbers[i2];
            }
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.LatestFrameMetadata
    public List<CaptureResult.Key<?>> getKeys() {
        return c.i(this.captureResultKeys);
    }

    public final FrameNumber[] getMetadataFrameNumbers() {
        return this.metadataFrameNumbers;
    }

    @Override // androidx.camera.camera2.pipe.LatestFrameMetadata
    public List<Metadata.Key<?>> getMetadataKeys() {
        return c.i(this.rawMetadataKeys);
    }

    public final Object[] getMetadataValues() {
        return this.metadataValues;
    }

    @Override // androidx.camera.camera2.pipe.LatestFrameMetadata
    public <T> T getOrDefault(CaptureResult.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) get(key);
        return t2 == null ? t : t2;
    }

    public final Metadata.Key<?>[] getRawMetadataKeys() {
        return this.rawMetadataKeys;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T getOrDefault(Metadata.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) get(key);
        return t2 == null ? t : t2;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T get(Metadata.Key<T> key) {
        x.f(key, "key");
        int length = this.rawMetadataKeys.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (x.n(this.rawMetadataKeys[i2], key)) {
                return (T) this.metadataValues[i2];
            }
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.LatestFrameMetadata
    /* renamed from: getFrameNumber-nwBJogA */
    public FrameNumber mo719getFrameNumbernwBJogA(Metadata.Key<?> key) {
        x.f(key, "key");
        int length = this.rawMetadataKeys.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (x.n(this.rawMetadataKeys[i2], key)) {
                return this.metadataFrameNumbers[i2];
            }
        }
        return null;
    }
}

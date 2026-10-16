package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraExtensionMetadata implements CameraExtensionMetadata {
    private final h.f<Boolean> _isCaptureProgressSupported;
    private final h.f<Boolean> _isPostviewSupported;
    private final h.f<Set<CameraCharacteristics.Key<?>>> _keys;
    private final h.f<Set<CaptureRequest.Key<?>>> _requestKeys;
    private final h.f<Set<CaptureResult.Key<?>>> _resultKeys;
    private final String camera;
    private final int cameraExtension;
    private final Map<k<Size, Integer>, h.f<Range<Long>>> estimatedCaptureLatencyRangeMillis;
    private final CameraExtensionCharacteristics extensionCharacteristics;
    private final boolean isRedacted;
    private final Map<Metadata.Key<?>, Object> metadata;
    private final Map<Class<?>, h.f<Set<Size>>> supportedExtensionSizesByClass;
    private final Map<Integer, h.f<Set<Size>>> supportedExtensionSizesByFormat;
    private final Map<k<Size, Integer>, h.f<Set<Size>>> supportedPostviewSizes;

    private Camera2CameraExtensionMetadata(String str, boolean z, int i2, CameraExtensionCharacteristics cameraExtensionCharacteristics, Map<Metadata.Key<?>, ? extends Object> map) {
        x.f(str, "camera");
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        x.f(map, TtmlNode.TAG_METADATA);
        this.camera = str;
        this.isRedacted = z;
        this.cameraExtension = i2;
        this.extensionCharacteristics = cameraExtensionCharacteristics;
        this.metadata = map;
        this.supportedExtensionSizesByFormat = new LinkedHashMap();
        this.supportedExtensionSizesByClass = new LinkedHashMap();
        this.supportedPostviewSizes = new LinkedHashMap();
        this.estimatedCaptureLatencyRangeMillis = new LinkedHashMap();
        h hVar = h.f48131b;
        this._keys = h.g.b(hVar, new h.g.a.a<Set<? extends CameraCharacteristics.Key<?>>>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrEmptySet$1
            @Override // h.g.a.a
            public final Set<? extends CameraCharacteristics.Key<?>> invoke() {
                String strConcat = CameraId.m552toStringimpl(this.this$0.mo496getCameraDz_R5H8()).concat("#extensionKeys");
                try {
                    try {
                        Trace.beginSection(strConcat);
                        Set<CameraCharacteristics.Key<?>> extensionKeys = Build.VERSION.SDK_INT >= 35 ? Api35Compat.getExtensionKeys(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension()) : e.c.d.a.p();
                        if (extensionKeys == null) {
                            extensionKeys = e.c.d.a.p();
                        }
                        return extensionKeys;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, b.a(strConcat, "Failed to get ", "! Caching {} and ignoring exception."), th);
                    }
                    return e.c.d.a.p();
                }
            }
        });
        this._requestKeys = h.g.b(hVar, new h.g.a.a<Set<? extends CaptureRequest.Key<Object>>>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrEmptySet$2
            @Override // h.g.a.a
            public final Set<? extends CaptureRequest.Key<Object>> invoke() {
                String strConcat = CameraId.m552toStringimpl(this.this$0.mo496getCameraDz_R5H8()).concat("#availableCaptureRequestKeys");
                try {
                    try {
                        Trace.beginSection(strConcat);
                        Set<? extends CaptureRequest.Key<Object>> setAu = Build.VERSION.SDK_INT >= 33 ? i.au(Api33Compat.getAvailableCaptureRequestKeys(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension())) : e.c.d.a.p();
                        if (setAu == null) {
                            setAu = e.c.d.a.p();
                        }
                        return setAu;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, b.a(strConcat, "Failed to get ", "! Caching {} and ignoring exception."), th);
                    }
                    return e.c.d.a.p();
                }
            }
        });
        this._resultKeys = h.g.b(hVar, new h.g.a.a<Set<? extends CaptureResult.Key<Object>>>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrEmptySet$3
            @Override // h.g.a.a
            public final Set<? extends CaptureResult.Key<Object>> invoke() {
                String strConcat = CameraId.m552toStringimpl(this.this$0.mo496getCameraDz_R5H8()).concat("#availableCaptureResultKeys");
                try {
                    try {
                        Trace.beginSection(strConcat);
                        Set<? extends CaptureResult.Key<Object>> setAu = Build.VERSION.SDK_INT >= 33 ? i.au(Api33Compat.getAvailableCaptureResultKeys(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension())) : e.c.d.a.p();
                        if (setAu == null) {
                            setAu = e.c.d.a.p();
                        }
                        return setAu;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, b.a(strConcat, "Failed to get ", "! Caching {} and ignoring exception."), th);
                    }
                    return e.c.d.a.p();
                }
            }
        });
        this._isPostviewSupported = h.g.b(hVar, new h.g.a.a<Boolean>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrFalse$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h.g.a.a
            public final Boolean invoke() {
                String strConcat = CameraId.m552toStringimpl(this.this$0.mo496getCameraDz_R5H8()).concat("#isPostviewSupported");
                boolean z2 = false;
                try {
                    try {
                        Trace.beginSection(strConcat);
                        boolean zIsPostviewAvailable = Build.VERSION.SDK_INT >= 34 ? Api34Compat.isPostviewAvailable(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension()) : false;
                        Trace.endSection();
                        z2 = zIsPostviewAvailable;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, b.a(strConcat, "Failed to get ", "! Caching false and ignoring exception."), th2);
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
        this._isCaptureProgressSupported = h.g.b(hVar, new h.g.a.a<Boolean>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrFalse$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h.g.a.a
            public final Boolean invoke() {
                String strConcat = CameraId.m552toStringimpl(this.this$0.mo496getCameraDz_R5H8()).concat("#isCaptureProgressSupported");
                boolean z2 = false;
                try {
                    try {
                        Trace.beginSection(strConcat);
                        boolean zIsCaptureProcessProgressAvailable = Build.VERSION.SDK_INT >= 34 ? Api34Compat.isCaptureProcessProgressAvailable(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension()) : false;
                        Trace.endSection();
                        z2 = zIsCaptureProcessProgressAvailable;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, b.a(strConcat, "Failed to get ", "! Caching false and ignoring exception."), th2);
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public <T> T get(CameraCharacteristics.Key<T> key) {
        x.f(key, "key");
        if (Build.VERSION.SDK_INT >= 35) {
            return (T) Api35Compat.getExtensionCharacteristic(this.extensionCharacteristics, getCameraExtension(), key);
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    /* renamed from: getCamera-Dz_R5H8 */
    public String mo496getCameraDz_R5H8() {
        return this.camera;
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public int getCameraExtension() {
        return this.cameraExtension;
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public Range<Long> getEstimatedCaptureLatencyRangeMillis(final Size size, final int i2) {
        h.f<Range<Long>> fVar;
        x.f(size, "captureSize");
        synchronized (this.estimatedCaptureLatencyRangeMillis) {
            Map<k<Size, Integer>, h.f<Range<Long>>> map = this.estimatedCaptureLatencyRangeMillis;
            k<Size, Integer> kVar = new k<>(size, Integer.valueOf(i2));
            h.f<Range<Long>> fVarB = map.get(kVar);
            if (fVarB == null) {
                final String str = CameraId.m552toStringimpl(mo496getCameraDz_R5H8()) + "#getEstimatedCaptureLatencyRangeMillis(" + size + ", " + i2 + ")";
                fVarB = h.g.b(h.f48131b, new h.g.a.a<Range<Long>>() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$getEstimatedCaptureLatencyRangeMillis$lambda$0$0$$inlined$lazyOrNull$1
                    @Override // h.g.a.a
                    public final Range<Long> invoke() {
                        try {
                            Trace.beginSection(str);
                            return Api31Compat.getEstimatedCaptureLatencyRangeMillis(this.extensionCharacteristics, this.getCameraExtension(), size, i2);
                        } finally {
                            Trace.endSection();
                        }
                    }
                });
                map.put(kVar, fVarB);
            }
            fVar = fVarB;
        }
        return fVar.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public Set<CameraCharacteristics.Key<?>> getKeys() {
        return this._keys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public <T> T getOrDefault(CameraCharacteristics.Key<T> key, T t) {
        T t2;
        x.f(key, "key");
        return (Build.VERSION.SDK_INT < 35 || (t2 = (T) Api35Compat.getExtensionCharacteristic(this.extensionCharacteristics, getCameraExtension(), key)) == null) ? t : t2;
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public Set<Size> getOutputSizes(final Class<?> cls) {
        h.f<Set<Size>> fVar;
        x.f(cls, "klass");
        synchronized (this.supportedExtensionSizesByClass) {
            Map<Class<?>, h.f<Set<Size>>> map = this.supportedExtensionSizesByClass;
            h.f<Set<Size>> fVarB = map.get(cls);
            if (fVarB == null) {
                final String str = CameraId.m552toStringimpl(mo496getCameraDz_R5H8()) + "#getExtensionSupportedSizes(" + cls.getName() + ")";
                fVarB = h.g.b(h.f48131b, new h.g.a.a<Set<? extends Size>>() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$getOutputSizes$lambda$1$0$$inlined$lazyOrEmptySet$1
                    @Override // h.g.a.a
                    public final Set<? extends Size> invoke() {
                        String str2 = str;
                        try {
                            try {
                                Trace.beginSection(str2);
                                Set<? extends Size> setAu = i.au(Api31Compat.getExtensionSupportedSizes(this.extensionCharacteristics, this.getCameraExtension(), (Class<?>) cls));
                                if (setAu == null) {
                                    setAu = e.c.d.a.p();
                                }
                                return setAu;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                android.util.Log.w(Log.TAG, b.a(str2, "Failed to get ", "! Caching {} and ignoring exception."), th);
                            }
                            return e.c.d.a.p();
                        }
                    }
                });
                map.put(cls, fVarB);
            }
            fVar = fVarB;
        }
        return fVar.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public Set<Size> getPostviewSizes(final Size size, final int i2) {
        h.f<Set<Size>> fVar;
        x.f(size, "captureSize");
        if (Build.VERSION.SDK_INT < 34) {
            return e.c.d.a.p();
        }
        synchronized (this.supportedPostviewSizes) {
            Map<k<Size, Integer>, h.f<Set<Size>>> map = this.supportedPostviewSizes;
            k<Size, Integer> kVar = new k<>(size, Integer.valueOf(i2));
            h.f<Set<Size>> fVarB = map.get(kVar);
            if (fVarB == null) {
                final String str = CameraId.m552toStringimpl(mo496getCameraDz_R5H8()) + "#getPostviewSupportedSizes(" + size + ", " + i2 + ")";
                fVarB = h.g.b(h.f48131b, new h.g.a.a<Set<? extends Size>>() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$getPostviewSizes$lambda$0$0$$inlined$lazyOrEmptySet$1
                    @Override // h.g.a.a
                    public final Set<? extends Size> invoke() {
                        String str2 = str;
                        try {
                            try {
                                Trace.beginSection(str2);
                                Set<? extends Size> setAu = i.au(Api34Compat.getPostviewSupportedSizes(this.extensionCharacteristics, this.getCameraExtension(), size, i2));
                                if (setAu == null) {
                                    setAu = e.c.d.a.p();
                                }
                                return setAu;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                android.util.Log.w(Log.TAG, b.a(str2, "Failed to get ", "! Caching {} and ignoring exception."), th);
                            }
                            return e.c.d.a.p();
                        }
                    }
                });
                map.put(kVar, fVarB);
            }
            fVar = fVarB;
        }
        return fVar.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public Set<CaptureRequest.Key<?>> getRequestKeys() {
        return this._requestKeys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public Set<CaptureResult.Key<?>> getResultKeys() {
        return this._resultKeys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public boolean isCaptureProgressSupported() {
        return this._isCaptureProgressSupported.getValue().booleanValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public boolean isPostviewSupported() {
        return this._isPostviewSupported.getValue().booleanValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public boolean isRedacted() {
        return this.isRedacted;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (!x.n(cls, bi$$ExternalSyntheticApiModelOutline0.m140m$1())) {
            return null;
        }
        Object obj = this.extensionCharacteristics;
        x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata.unwrapAs");
        return (T) obj;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T get(Metadata.Key<T> key) {
        x.f(key, "key");
        return (T) this.metadata.get(key);
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T getOrDefault(Metadata.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) this.metadata.get(key);
        return t2 == null ? t : t2;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public Set<Size> getOutputSizes(final int i2) {
        h.f<Set<Size>> fVar;
        synchronized (this.supportedExtensionSizesByFormat) {
            Map<Integer, h.f<Set<Size>>> map = this.supportedExtensionSizesByFormat;
            Integer numValueOf = Integer.valueOf(i2);
            h.f<Set<Size>> fVarB = map.get(numValueOf);
            if (fVarB == null) {
                fVarB = h.g.b(h.f48131b, new h.g.a.a<Set<? extends Size>>(i2, this, i2) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$getOutputSizes$lambda$0$0$$inlined$lazyOrEmptySet$1
                    final /* synthetic */ int $imageFormat$inlined;
                    final /* synthetic */ int $imageFormat$inlined$1;

                    {
                        this.$imageFormat$inlined$1 = i2;
                    }

                    @Override // h.g.a.a
                    public final Set<? extends Size> invoke() {
                        String str = CameraId.m552toStringimpl(this.this$0.mo496getCameraDz_R5H8()) + "#getExtensionSupportedSizes(" + this.$imageFormat$inlined + ")";
                        try {
                            try {
                                Trace.beginSection(str);
                                Set<? extends Size> setAu = i.au(Api31Compat.getExtensionSupportedSizes(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension(), this.$imageFormat$inlined$1));
                                if (setAu == null) {
                                    setAu = e.c.d.a.p();
                                }
                                return setAu;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                android.util.Log.w(Log.TAG, b.a(str, "Failed to get ", "! Caching {} and ignoring exception."), th);
                            }
                            return e.c.d.a.p();
                        }
                    }
                });
                map.put(numValueOf, fVarB);
            }
            fVar = fVarB;
        }
        return fVar.getValue();
    }

    public /* synthetic */ Camera2CameraExtensionMetadata(String str, boolean z, int i2, CameraExtensionCharacteristics cameraExtensionCharacteristics, Map map, o oVar) {
        this(str, z, i2, cameraExtensionCharacteristics, map);
    }
}

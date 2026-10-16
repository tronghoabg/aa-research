package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraMetadata implements CameraMetadata {
    private final h.f<Set<CameraCharacteristics.Key<?>>> _keys;
    private final h.f<Set<CameraId>> _physicalCameraIds;
    private final h.f<Set<CaptureRequest.Key<?>>> _physicalRequestKeys;
    private final h.f<Set<CaptureRequest.Key<?>>> _requestKeys;
    private final h.f<Set<CaptureResult.Key<?>>> _resultKeys;
    private final h.f<Set<CameraCharacteristics.Key<?>>> _sessionCharacteristicsKeys;
    private final h.f<Set<CaptureRequest.Key<?>>> _sessionKeys;
    private final h.f<Set<Integer>> _supportedExtensions;
    private final Set<CameraCharacteristics.Key<?>> cacheBlocklist;
    private final String camera;
    private final CameraCharacteristics characteristics;
    private final ArrayMap<Integer, CameraExtensionMetadata> extensionCache;
    private final boolean isRedacted;
    private final Map<Metadata.Key<?>, Object> metadata;
    private final Camera2MetadataProvider metadataProvider;
    private final ArrayMap<CameraCharacteristics.Key<?>, Object> values;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$getExtensionMetadata$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Camera2CameraMetadata.this.getExtensionMetadata(0, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CameraMetadata(String str, boolean z, CameraCharacteristics cameraCharacteristics, Camera2MetadataProvider camera2MetadataProvider, Map<Metadata.Key<?>, ? extends Object> map, Set<? extends CameraCharacteristics.Key<?>> set) {
        x.f(str, "camera");
        x.f(cameraCharacteristics, "characteristics");
        x.f(camera2MetadataProvider, "metadataProvider");
        x.f(map, TtmlNode.TAG_METADATA);
        x.f(set, "cacheBlocklist");
        this.camera = str;
        this.isRedacted = z;
        this.characteristics = cameraCharacteristics;
        this.metadataProvider = camera2MetadataProvider;
        this.metadata = map;
        this.cacheBlocklist = set;
        this.values = new ArrayMap<>();
        this.extensionCache = new ArrayMap<>();
        h hVar = h.f48131b;
        this._supportedExtensions = h.g.b(hVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f$0);
            }
        });
        this._keys = h.g.b(hVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraMetadata._keys$lambda$0(this.f$0);
            }
        });
        this._requestKeys = h.g.b(hVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraMetadata._requestKeys$lambda$0(this.f$0);
            }
        });
        this._resultKeys = h.g.b(hVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraMetadata._resultKeys$lambda$0(this.f$0);
            }
        });
        this._physicalCameraIds = h.g.b(hVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f$0);
            }
        });
        this._physicalRequestKeys = h.g.b(hVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f$0);
            }
        });
        this._sessionCharacteristicsKeys = h.g.b(hVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda6
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f$0);
            }
        });
        this._sessionKeys = h.g.b(hVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda7
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraMetadata._sessionKeys$lambda$0(this.f$0);
            }
        });
    }

    static final Set _keys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            try {
                Trace.beginSection(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8()) + "#keys");
                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                if (keys == null) {
                    keys = i.h();
                }
                return i.au(keys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getKeys from " + CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8()) + "}", assertionError);
            }
            return e.c.d.a.p();
        }
    }

    static final Set _physicalCameraIds$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            try {
                Trace.beginSection(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8()) + "#physicalCameraIds");
                Set<String> physicalCameraIds = Api28Compat.getPhysicalCameraIds(camera2CameraMetadata.characteristics);
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    android.util.Log.i(Log.TAG, "Loaded physicalCameraIds from " + CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8()) + ": " + physicalCameraIds);
                }
                if (physicalCameraIds == null) {
                    physicalCameraIds = e.c.d.a.p();
                }
                Set<String> set = physicalCameraIds;
                ArrayList arrayList = new ArrayList(i.q(set, 10));
                for (String str : set) {
                    CameraId.m547constructorimpl(str);
                    arrayList.add(CameraId.m546boximpl(str));
                }
                return i.au(arrayList);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getPhysicalCameraIds from ".concat(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8())), assertionError);
            }
            return e.c.d.a.p();
        } catch (NullPointerException e3) {
            NullPointerException nullPointerException = e3;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getPhysicalCameraIds from ".concat(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8())), nullPointerException);
            }
            return e.c.d.a.p();
        }
    }

    static final Set _physicalRequestKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            try {
                Trace.beginSection("Camera-" + camera2CameraMetadata.mo565getCameraDz_R5H8() + "#availablePhysicalCameraRequestKeys");
                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = Api28Compat.getAvailablePhysicalCameraRequestKeys(camera2CameraMetadata.characteristics);
                if (availablePhysicalCameraRequestKeys == null) {
                    availablePhysicalCameraRequestKeys = i.h();
                }
                return i.au(availablePhysicalCameraRequestKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getAvailablePhysicalCameraRequestKeys from Camera-".concat(String.valueOf(camera2CameraMetadata.mo565getCameraDz_R5H8())), assertionError);
            }
            return e.c.d.a.p();
        }
    }

    static final Set _requestKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            try {
                Trace.beginSection(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8()) + "#availableCaptureRequestKeys");
                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                if (availableCaptureRequestKeys == null) {
                    availableCaptureRequestKeys = i.h();
                }
                return i.au(availableCaptureRequestKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getAvailableCaptureRequestKeys from ".concat(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8())), assertionError);
            }
            return e.c.d.a.p();
        }
    }

    static final Set _resultKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            try {
                Trace.beginSection(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8()) + "#availableCaptureResultKeys");
                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys == null) {
                    availableCaptureResultKeys = i.h();
                }
                return i.au(availableCaptureResultKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getAvailableCaptureResultKeys from ".concat(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8())), assertionError);
            }
            return e.c.d.a.p();
        }
    }

    static final Set _sessionCharacteristicsKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        if (Build.VERSION.SDK_INT < 35) {
            return e.c.d.a.p();
        }
        try {
            try {
                Trace.beginSection("Camera-" + camera2CameraMetadata.mo565getCameraDz_R5H8() + "#getAvailableSessionCharacteristicsKeys");
                List<CameraCharacteristics.Key<?>> availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                if (availableSessionCharacteristicsKeys == null) {
                    availableSessionCharacteristicsKeys = i.h();
                }
                return i.au(availableSessionCharacteristicsKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getAvailableSessionCharacteristicsKeys from Camera-".concat(String.valueOf(camera2CameraMetadata.mo565getCameraDz_R5H8())), assertionError);
            }
            return e.c.d.a.p();
        }
    }

    static final Set _sessionKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            try {
                Trace.beginSection("Camera-" + camera2CameraMetadata.mo565getCameraDz_R5H8() + "#availableSessionKeys");
                List<CaptureRequest.Key<?>> availableSessionKeys = Api28Compat.getAvailableSessionKeys(camera2CameraMetadata.characteristics);
                if (availableSessionKeys == null) {
                    availableSessionKeys = i.h();
                }
                return i.au(availableSessionKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getAvailableSessionKeys from Camera-".concat(String.valueOf(camera2CameraMetadata.mo565getCameraDz_R5H8())), assertionError);
            }
            return e.c.d.a.p();
        }
    }

    static final Set _supportedExtensions$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            try {
                Trace.beginSection(d.a(camera2CameraMetadata.mo565getCameraDz_R5H8(), "Camera-", "#supportedExtensions"));
                return camera2CameraMetadata.metadataProvider.mo1050getSupportedCameraExtensionsEfqyGwQ(camera2CameraMetadata.mo565getCameraDz_R5H8());
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to getSupportedExtensions from Camera-".concat(CameraId.m552toStringimpl(camera2CameraMetadata.mo565getCameraDz_R5H8())), assertionError);
            }
            return e.c.d.a.p();
        }
    }

    private final <T> T getOrThrow(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key<T> key) {
        try {
            return (T) cameraCharacteristics.get(key);
        } catch (AssertionError unused) {
            throw new IllegalStateException(a.a(key, "Failed to get characteristic for ", ": Framework throw an AssertionError"));
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public CameraExtensionMetadata awaitExtensionMetadata(int i2) {
        Integer numValueOf;
        CameraExtensionMetadata cameraExtensionMetadata;
        synchronized (this.extensionCache) {
            ArrayMap<Integer, CameraExtensionMetadata> arrayMap = this.extensionCache;
            numValueOf = Integer.valueOf(i2);
            cameraExtensionMetadata = arrayMap.get(numValueOf);
        }
        if (cameraExtensionMetadata != null) {
            return cameraExtensionMetadata;
        }
        CameraExtensionMetadata cameraExtensionMetadataMo1046awaitCameraExtensionMetadata0r8Bogc = this.metadataProvider.mo1046awaitCameraExtensionMetadata0r8Bogc(mo565getCameraDz_R5H8(), i2);
        synchronized (this.extensionCache) {
            this.extensionCache.put(numValueOf, cameraExtensionMetadataMo1046awaitCameraExtensionMetadata0r8Bogc);
        }
        return cameraExtensionMetadataMo1046awaitCameraExtensionMetadata0r8Bogc;
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    /* renamed from: awaitPhysicalMetadata-EfqyGwQ */
    public CameraMetadata mo564awaitPhysicalMetadataEfqyGwQ(String str) {
        x.f(str, "cameraId");
        if (getPhysicalCameraIds().contains(CameraId.m546boximpl(str))) {
            return this.metadataProvider.mo1047awaitCameraMetadataEfqyGwQ(str);
        }
        throw new IllegalStateException(CameraId.m552toStringimpl(str) + " is not a valid physical camera on " + this);
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public <T> T get(CameraCharacteristics.Key<T> key) {
        T t;
        x.f(key, "key");
        if (this.cacheBlocklist.contains(key)) {
            return (T) getOrThrow(this.characteristics, key);
        }
        synchronized (this.values) {
            t = (T) this.values.get(key);
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) getOrThrow(this.characteristics, key);
        if (t2 == null) {
            return t2;
        }
        synchronized (this.values) {
            this.values.put(key, t2);
        }
        return t2;
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    /* renamed from: getCamera-Dz_R5H8 */
    public String mo565getCameraDz_R5H8() {
        return this.camera;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraMetadata
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getExtensionMetadata(int r6, h.c.e<? super androidx.camera.camera2.pipe.CameraExtensionMetadata> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.pipe.compat.Camera2CameraMetadata.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$getExtensionMetadata$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2CameraMetadata.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$getExtensionMetadata$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$getExtensionMetadata$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r6 = r0.I$0
            e.b.c.b(r7)
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            e.b.c.b(r7)
            android.util.ArrayMap<java.lang.Integer, androidx.camera.camera2.pipe.CameraExtensionMetadata> r7 = r5.extensionCache
            monitor-enter(r7)
            android.util.ArrayMap<java.lang.Integer, androidx.camera.camera2.pipe.CameraExtensionMetadata> r2 = r5.extensionCache     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L6f
            androidx.camera.camera2.pipe.CameraExtensionMetadata r2 = (androidx.camera.camera2.pipe.CameraExtensionMetadata) r2     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            if (r2 == 0) goto L48
            return r2
        L48:
            androidx.camera.camera2.pipe.compat.Camera2MetadataProvider r7 = r5.metadataProvider
            java.lang.String r2 = r5.mo565getCameraDz_R5H8()
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.mo1048getCameraExtensionMetadataRzXb1QE(r2, r6, r0)
            if (r7 == r1) goto L6e
        L58:
            android.util.ArrayMap<java.lang.Integer, androidx.camera.camera2.pipe.CameraExtensionMetadata> r0 = r5.extensionCache
            androidx.camera.camera2.pipe.CameraExtensionMetadata r7 = (androidx.camera.camera2.pipe.CameraExtensionMetadata) r7
            monitor-enter(r0)
            android.util.ArrayMap<java.lang.Integer, androidx.camera.camera2.pipe.CameraExtensionMetadata> r5 = r5.extensionCache     // Catch: java.lang.Throwable -> L6b
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L6b
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L6b
            r5.put(r1, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)
            return r7
        L6b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L6e:
            return r1
        L6f:
            r5 = move-exception
            monitor-exit(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata.getExtensionMetadata(int, h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public Set<CameraCharacteristics.Key<?>> getKeys() {
        return this._keys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T getOrDefault(Metadata.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) this.metadata.get(key);
        return t2 == null ? t : t2;
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public Set<CameraId> getPhysicalCameraIds() {
        return this._physicalCameraIds.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    /* renamed from: getPhysicalMetadata-0r8Bogc */
    public Object mo566getPhysicalMetadata0r8Bogc(String str, h.c.e<? super CameraMetadata> eVar) {
        if (getPhysicalCameraIds().contains(CameraId.m546boximpl(str))) {
            return this.metadataProvider.mo1049getCameraMetadata0r8Bogc(str, eVar);
        }
        throw new IllegalStateException(CameraId.m552toStringimpl(str) + " is not a valid physical camera on " + this);
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public Set<CaptureRequest.Key<?>> getPhysicalRequestKeys() {
        return this._physicalRequestKeys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public Set<CaptureRequest.Key<?>> getRequestKeys() {
        return this._requestKeys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public Set<CaptureResult.Key<?>> getResultKeys() {
        return this._resultKeys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public Set<CameraCharacteristics.Key<?>> getSessionCharacteristicsKeys() {
        return this._sessionCharacteristicsKeys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public Set<CaptureRequest.Key<?>> getSessionKeys() {
        return this._sessionKeys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public Set<Integer> getSupportedExtensions() {
        return this._supportedExtensions.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public boolean isRedacted() {
        return this.isRedacted;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (!x.n(cls, CameraCharacteristics.class)) {
            return null;
        }
        Object obj = this.characteristics;
        x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2CameraMetadata.unwrapAs");
        return (T) obj;
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public <T> T getOrDefault(CameraCharacteristics.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) get(key);
        return t2 == null ? t : t2;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T get(Metadata.Key<T> key) {
        x.f(key, "key");
        return (T) this.metadata.get(key);
    }

    public /* synthetic */ Camera2CameraMetadata(String str, boolean z, CameraCharacteristics cameraCharacteristics, Camera2MetadataProvider camera2MetadataProvider, Map map, Set set, o oVar) {
        this(str, z, cameraCharacteristics, camera2MetadataProvider, map, set);
    }
}

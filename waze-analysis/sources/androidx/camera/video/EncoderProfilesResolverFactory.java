package androidx.camera.video;

import android.util.LruCache;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EncoderProfilesResolverFactory {
    public static final EncoderProfilesResolverFactory INSTANCE = new EncoderProfilesResolverFactory();
    private static final LruCache<CacheKey, EncoderProfilesResolver> cache = new LruCache<>(16);

    /* compiled from: WazeSource */
    final class CacheKey {
        private final Object cameraConfig;
        private final String cameraId;
        private final int videoCapabilitiesSource;
        private final VideoEncoderInfo.Finder videoEncoderInfoFinder;
        private final int videoRecordingType;

        public CacheKey(String str, Object obj, int i2, int i3, VideoEncoderInfo.Finder finder) {
            x.f(str, "cameraId");
            x.f(obj, "cameraConfig");
            x.f(finder, "videoEncoderInfoFinder");
            this.cameraId = str;
            this.cameraConfig = obj;
            this.videoRecordingType = i2;
            this.videoCapabilitiesSource = i3;
            this.videoEncoderInfoFinder = finder;
        }

        public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, String str, Object obj, int i2, int i3, VideoEncoderInfo.Finder finder, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                str = cacheKey.cameraId;
            }
            if ((i4 & 2) != 0) {
                obj = cacheKey.cameraConfig;
            }
            if ((i4 & 4) != 0) {
                i2 = cacheKey.videoRecordingType;
            }
            if ((i4 & 8) != 0) {
                i3 = cacheKey.videoCapabilitiesSource;
            }
            if ((i4 & 16) != 0) {
                finder = cacheKey.videoEncoderInfoFinder;
            }
            VideoEncoderInfo.Finder finder2 = finder;
            int i5 = i2;
            return cacheKey.copy(str, obj, i5, i3, finder2);
        }

        public final String component1() {
            return this.cameraId;
        }

        public final Object component2() {
            return this.cameraConfig;
        }

        public final int component3() {
            return this.videoRecordingType;
        }

        public final int component4() {
            return this.videoCapabilitiesSource;
        }

        public final VideoEncoderInfo.Finder component5() {
            return this.videoEncoderInfoFinder;
        }

        public final CacheKey copy(String str, Object obj, int i2, int i3, VideoEncoderInfo.Finder finder) {
            x.f(str, "cameraId");
            x.f(obj, "cameraConfig");
            x.f(finder, "videoEncoderInfoFinder");
            return new CacheKey(str, obj, i2, i3, finder);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) obj;
            return x.n(this.cameraId, cacheKey.cameraId) && x.n(this.cameraConfig, cacheKey.cameraConfig) && this.videoRecordingType == cacheKey.videoRecordingType && this.videoCapabilitiesSource == cacheKey.videoCapabilitiesSource && x.n(this.videoEncoderInfoFinder, cacheKey.videoEncoderInfoFinder);
        }

        public final Object getCameraConfig() {
            return this.cameraConfig;
        }

        public final String getCameraId() {
            return this.cameraId;
        }

        public final int getVideoCapabilitiesSource() {
            return this.videoCapabilitiesSource;
        }

        public final VideoEncoderInfo.Finder getVideoEncoderInfoFinder() {
            return this.videoEncoderInfoFinder;
        }

        public final int getVideoRecordingType() {
            return this.videoRecordingType;
        }

        public int hashCode() {
            return (((((((this.cameraId.hashCode() * 31) + this.cameraConfig.hashCode()) * 31) + this.videoRecordingType) * 31) + this.videoCapabilitiesSource) * 31) + this.videoEncoderInfoFinder.hashCode();
        }

        public String toString() {
            return "CacheKey(cameraId=" + this.cameraId + ", cameraConfig=" + this.cameraConfig + ", videoRecordingType=" + this.videoRecordingType + ", videoCapabilitiesSource=" + this.videoCapabilitiesSource + ", videoEncoderInfoFinder=" + this.videoEncoderInfoFinder + ")";
        }
    }

    private EncoderProfilesResolverFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EncoderProfilesResolver createResolver(CameraInfo cameraInfo, int i2, int i3, VideoEncoderInfo.Finder finder) {
        x.d(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.CameraInfoInternal");
        int i4 = i2 != 2 ? 1 : 2;
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
        EncoderProfilesProvider encoderProfilesProviderResolve = EncoderProfilesProviderResolver.INSTANCE.resolve(cameraInfoInternal, i3, i4, finder);
        Set<DynamicRange> supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
        x.e(supportedDynamicRanges, "getSupportedDynamicRanges(...)");
        return new EncoderProfilesResolver(encoderProfilesProviderResolve, i4, supportedDynamicRanges);
    }

    public static final EncoderProfilesResolver getResolver(final CameraInfo cameraInfo, final int i2, final int i3, final VideoEncoderInfo.Finder finder) {
        EncoderProfilesResolver resolver$lambda$1;
        x.f(cameraInfo, "cameraInfo");
        x.f(finder, "videoEncoderInfoFinder");
        f fVarA = g.a(new a() { // from class: androidx.camera.video.EncoderProfilesResolverFactory$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return EncoderProfilesResolverFactory.INSTANCE.createResolver(cameraInfo, i2, i3, finder);
            }
        });
        if (INSTANCE.shouldSkipCache(cameraInfo)) {
            return getResolver$lambda$1(fVarA);
        }
        AdapterCameraInfo adapterCameraInfo = (AdapterCameraInfo) cameraInfo;
        String cameraId = adapterCameraInfo.getCameraId();
        x.e(cameraId, "getCameraId(...)");
        CameraConfig cameraConfig = adapterCameraInfo.getCameraConfig();
        x.e(cameraConfig, "getCameraConfig(...)");
        CacheKey cacheKey = new CacheKey(cameraId, cameraConfig, i2, i3, finder);
        LruCache<CacheKey, EncoderProfilesResolver> lruCache = cache;
        synchronized (lruCache) {
            resolver$lambda$1 = lruCache.get(cacheKey);
            if (resolver$lambda$1 == null) {
                resolver$lambda$1 = getResolver$lambda$1(fVarA);
                lruCache.put(cacheKey, resolver$lambda$1);
            }
        }
        return resolver$lambda$1;
    }

    public static /* synthetic */ EncoderProfilesResolver getResolver$default(CameraInfo cameraInfo, int i2, int i3, VideoEncoderInfo.Finder finder, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            finder = VideoEncoderInfoImpl.FINDER;
        }
        int i5 = i4 & 4;
        int i6 = i4 & 2;
        if (i5 != 0) {
            i3 = 0;
        }
        if (i6 != 0) {
            i2 = 1;
        }
        return getResolver(cameraInfo, i2, i3, finder);
    }

    private static final EncoderProfilesResolver getResolver$lambda$1(f<EncoderProfilesResolver> fVar) {
        return fVar.getValue();
    }

    private final boolean shouldSkipCache(CameraInfo cameraInfo) {
        if (!(cameraInfo instanceof AdapterCameraInfo)) {
            return true;
        }
        AdapterCameraInfo adapterCameraInfo = (AdapterCameraInfo) cameraInfo;
        return adapterCameraInfo.isExternalCamera() || adapterCameraInfo.getLensFacing() == -1;
    }
}

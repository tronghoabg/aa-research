package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import h.a.i;
import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MimeMatchedVideoCapabilities implements VideoCapabilities {
    private final CameraInfoInternal cameraInfo;
    private final String mime;
    private final f validatedData$delegate;

    public MimeMatchedVideoCapabilities(String str, CameraInfoInternal cameraInfoInternal, final VideoEncoderInfo.Finder finder) {
        x.f(str, "mime");
        x.f(cameraInfoInternal, "cameraInfo");
        x.f(finder, "videoEncoderInfoFinder");
        this.mime = str;
        this.cameraInfo = cameraInfoInternal;
        this.validatedData$delegate = g.a(new a() { // from class: androidx.camera.video.MimeMatchedVideoCapabilities$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return MimeMatchedVideoCapabilities.validatedData_delegate$lambda$0(finder, this);
            }
        });
    }

    private final ValidatedData getValidatedData() {
        return (ValidatedData) this.validatedData$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final ValidatedData validatedData_delegate$lambda$0(VideoEncoderInfo.Finder finder, MimeMatchedVideoCapabilities mimeMatchedVideoCapabilities) {
        Object next;
        VideoEncoderInfo videoEncoderInfoFind = finder.find(mimeMatchedVideoCapabilities.mime);
        int i2 = 3;
        Set set = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        if (videoEncoderInfoFind == null) {
            return new ValidatedData(set, objArr11 == true ? 1 : 0, i2, objArr10 == true ? 1 : 0);
        }
        Set<DynamicRange> supportedDynamicRanges = mimeMatchedVideoCapabilities.cameraInfo.getSupportedDynamicRanges();
        x.e(supportedDynamicRanges, "getSupportedDynamicRanges(...)");
        if (supportedDynamicRanges.isEmpty()) {
            return new ValidatedData(objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, i2, objArr7 == true ? 1 : 0);
        }
        Set setAs = i.as(supportedDynamicRanges, VideoConfigUtil.INSTANCE.getDynamicRangesForMime(mimeMatchedVideoCapabilities.mime));
        if (setAs.isEmpty()) {
            return new ValidatedData(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i2, objArr4 == true ? 1 : 0);
        }
        List<Size> supportedResolutions = mimeMatchedVideoCapabilities.cameraInfo.getSupportedResolutions(34);
        x.e(supportedResolutions, "getSupportedResolutions(...)");
        HashSet hashSetZ = i.Z(supportedResolutions);
        List<Quality> sortedQualities = Quality.getSortedQualities();
        x.e(sortedQualities, "getSortedQualities(...)");
        ArrayList<Quality.ConstantQuality> arrayList = new ArrayList();
        for (Object obj : sortedQualities) {
            if (obj instanceof Quality.ConstantQuality) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Quality.ConstantQuality constantQuality : arrayList) {
            List<Size> typicalSizes = constantQuality.getTypicalSizes();
            x.e(typicalSizes, "getTypicalSizes(...)");
            Iterator<T> it = typicalSizes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Size size = (Size) next;
                if (hashSetZ.contains(size) && videoEncoderInfoFind.isSizeSupported(size.getWidth(), size.getHeight())) {
                    break;
                }
            }
            Size size2 = (Size) next;
            k kVar = size2 != null ? new k(constantQuality, size2) : null;
            if (kVar != null) {
                arrayList2.add(kVar);
            }
        }
        Map mapQ = r.q(arrayList2);
        return mapQ.isEmpty() ? new ValidatedData(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0) : new ValidatedData(setAs, mapQ);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public Size getResolution(Quality quality, DynamicRange dynamicRange) {
        x.f(quality, "quality");
        x.f(dynamicRange, "dynamicRange");
        if (DynamicRanges.canResolve(dynamicRange, getValidatedData().getDynamicRanges())) {
            return getValidatedData().getQualityToSizeMap().get(quality);
        }
        return null;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return getValidatedData().getDynamicRanges();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public List<Quality> getSupportedQualities(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        return DynamicRanges.canResolve(dynamicRange, getValidatedData().getDynamicRanges()) ? i.ao(getValidatedData().getQualityToSizeMap().keySet()) : i.h();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isQualitySupported(Quality quality, DynamicRange dynamicRange) {
        x.f(quality, "quality");
        x.f(dynamicRange, "dynamicRange");
        return DynamicRanges.canResolve(dynamicRange, getValidatedData().getDynamicRanges()) && getValidatedData().getQualityToSizeMap().containsKey(quality);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isStabilizationSupported() {
        return this.cameraInfo.isVideoStabilizationSupported();
    }

    public String toString() {
        return "MimeMatchedVideoCapabilities(mime=" + this.mime + ", cameraInfo=" + this.cameraInfo + ")";
    }

    /* compiled from: WazeSource */
    final class ValidatedData {
        private final Set<DynamicRange> dynamicRanges;
        private final Map<Quality, Size> qualityToSizeMap;

        public /* synthetic */ ValidatedData(Set set, Map map, int i2, o oVar) {
            this((i2 & 1) != 0 ? e.c.d.a.p() : set, (i2 & 2) != 0 ? r.j() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidatedData copy$default(ValidatedData validatedData, Set set, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                set = validatedData.dynamicRanges;
            }
            if ((i2 & 2) != 0) {
                map = validatedData.qualityToSizeMap;
            }
            return validatedData.copy(set, map);
        }

        public final Set<DynamicRange> component1() {
            return this.dynamicRanges;
        }

        public final Map<Quality, Size> component2() {
            return this.qualityToSizeMap;
        }

        public final ValidatedData copy(Set<DynamicRange> set, Map<Quality, Size> map) {
            x.f(set, "dynamicRanges");
            x.f(map, "qualityToSizeMap");
            return new ValidatedData(set, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidatedData)) {
                return false;
            }
            ValidatedData validatedData = (ValidatedData) obj;
            return x.n(this.dynamicRanges, validatedData.dynamicRanges) && x.n(this.qualityToSizeMap, validatedData.qualityToSizeMap);
        }

        public final Set<DynamicRange> getDynamicRanges() {
            return this.dynamicRanges;
        }

        public final Map<Quality, Size> getQualityToSizeMap() {
            return this.qualityToSizeMap;
        }

        public int hashCode() {
            return (this.dynamicRanges.hashCode() * 31) + this.qualityToSizeMap.hashCode();
        }

        public String toString() {
            return "ValidatedData(dynamicRanges=" + this.dynamicRanges + ", qualityToSizeMap=" + this.qualityToSizeMap + ")";
        }

        public ValidatedData(Set<DynamicRange> set, Map<Quality, Size> map) {
            x.f(set, "dynamicRanges");
            x.f(map, "qualityToSizeMap");
            this.dynamicRanges = set;
            this.qualityToSizeMap = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ValidatedData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}

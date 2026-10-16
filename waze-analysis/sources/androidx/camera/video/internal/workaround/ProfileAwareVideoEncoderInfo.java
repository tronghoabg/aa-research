package androidx.camera.video.internal.workaround;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import h.a.i;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import h.n.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ProfileAwareVideoEncoderInfo implements VideoEncoderInfo {
    private static final String TAG = "ProfileAwareEncoderInfo";
    private final f _supportedHeights$delegate;
    private final f _supportedWidths$delegate;
    private final f isHeightStretchApplied$delegate;
    private final f isWidthStretchApplied$delegate;
    private final f profileData$delegate;
    private final VideoEncoderInfo videoEncoderInfo;
    public static final Companion Companion = new Companion(null);
    private static final Map<String, ProfileData> profileCache = new LinkedHashMap();

    /* compiled from: WazeSource */
    final class ProfileData {
        private final Set<Size> extraSizes;
        private final int maxHeight;
        private final int maxWidth;

        public ProfileData(Set<Size> set, int i2, int i3) {
            x.f(set, "extraSizes");
            this.extraSizes = set;
            this.maxWidth = i2;
            this.maxHeight = i3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProfileData copy$default(ProfileData profileData, Set set, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                set = profileData.extraSizes;
            }
            if ((i4 & 2) != 0) {
                i2 = profileData.maxWidth;
            }
            if ((i4 & 4) != 0) {
                i3 = profileData.maxHeight;
            }
            return profileData.copy(set, i2, i3);
        }

        public final Set<Size> component1() {
            return this.extraSizes;
        }

        public final int component2() {
            return this.maxWidth;
        }

        public final int component3() {
            return this.maxHeight;
        }

        public final ProfileData copy(Set<Size> set, int i2, int i3) {
            x.f(set, "extraSizes");
            return new ProfileData(set, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileData)) {
                return false;
            }
            ProfileData profileData = (ProfileData) obj;
            return x.n(this.extraSizes, profileData.extraSizes) && this.maxWidth == profileData.maxWidth && this.maxHeight == profileData.maxHeight;
        }

        public final Set<Size> getExtraSizes() {
            return this.extraSizes;
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final int getMaxWidth() {
            return this.maxWidth;
        }

        public int hashCode() {
            return (((this.extraSizes.hashCode() * 31) + this.maxWidth) * 31) + this.maxHeight;
        }

        public String toString() {
            return "ProfileData(extraSizes=" + this.extraSizes + ", maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ")";
        }
    }

    private ProfileAwareVideoEncoderInfo(VideoEncoderInfo videoEncoderInfo) {
        this.videoEncoderInfo = videoEncoderInfo;
        this.profileData$delegate = g.a(new a() { // from class: androidx.camera.video.internal.workaround.ProfileAwareVideoEncoderInfo$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ProfileAwareVideoEncoderInfo.Companion.getOrComputeProfileData(this.f$0.videoEncoderInfo.getMime());
            }
        });
        this.isWidthStretchApplied$delegate = g.a(new a() { // from class: androidx.camera.video.internal.workaround.ProfileAwareVideoEncoderInfo$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(ProfileAwareVideoEncoderInfo.isWidthStretchApplied_delegate$lambda$0(this.f$0));
            }
        });
        this.isHeightStretchApplied$delegate = g.a(new a() { // from class: androidx.camera.video.internal.workaround.ProfileAwareVideoEncoderInfo$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(ProfileAwareVideoEncoderInfo.isHeightStretchApplied_delegate$lambda$0(this.f$0));
            }
        });
        this._supportedWidths$delegate = g.a(new a() { // from class: androidx.camera.video.internal.workaround.ProfileAwareVideoEncoderInfo$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return ProfileAwareVideoEncoderInfo._supportedWidths_delegate$lambda$0(this.f$0);
            }
        });
        this._supportedHeights$delegate = g.a(new a() { // from class: androidx.camera.video.internal.workaround.ProfileAwareVideoEncoderInfo$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return ProfileAwareVideoEncoderInfo._supportedHeights_delegate$lambda$0(this.f$0);
            }
        });
    }

    static final Range _supportedHeights_delegate$lambda$0(ProfileAwareVideoEncoderInfo profileAwareVideoEncoderInfo) {
        Range<Integer> supportedHeights = profileAwareVideoEncoderInfo.videoEncoderInfo.getSupportedHeights();
        if (!profileAwareVideoEncoderInfo.isHeightStretchApplied()) {
            return supportedHeights;
        }
        Comparable lower = supportedHeights.getLower();
        ProfileData profileData = profileAwareVideoEncoderInfo.getProfileData();
        x.c(profileData);
        return Range.create(lower, Integer.valueOf(profileData.getMaxHeight()));
    }

    static final Range _supportedWidths_delegate$lambda$0(ProfileAwareVideoEncoderInfo profileAwareVideoEncoderInfo) {
        Range<Integer> supportedWidths = profileAwareVideoEncoderInfo.videoEncoderInfo.getSupportedWidths();
        if (!profileAwareVideoEncoderInfo.isWidthStretchApplied()) {
            return supportedWidths;
        }
        Comparable lower = supportedWidths.getLower();
        ProfileData profileData = profileAwareVideoEncoderInfo.getProfileData();
        x.c(profileData);
        return Range.create(lower, Integer.valueOf(profileData.getMaxWidth()));
    }

    public static final VideoEncoderInfo from(VideoEncoderInfo videoEncoderInfo) {
        return Companion.from(videoEncoderInfo);
    }

    private final ProfileData getProfileData() {
        return (ProfileData) this.profileData$delegate.getValue();
    }

    private final Range<Integer> get_supportedHeights() {
        Object value = this._supportedHeights$delegate.getValue();
        x.e(value, "getValue(...)");
        return (Range) value;
    }

    private final Range<Integer> get_supportedWidths() {
        Object value = this._supportedWidths$delegate.getValue();
        x.e(value, "getValue(...)");
        return (Range) value;
    }

    private final boolean isHeightStretchApplied() {
        return ((Boolean) this.isHeightStretchApplied$delegate.getValue()).booleanValue();
    }

    static final boolean isHeightStretchApplied_delegate$lambda$0(ProfileAwareVideoEncoderInfo profileAwareVideoEncoderInfo) {
        if (profileAwareVideoEncoderInfo.getProfileData() == null) {
            return false;
        }
        ProfileData profileData = profileAwareVideoEncoderInfo.getProfileData();
        x.c(profileData);
        return profileData.getMaxHeight() > ((Number) profileAwareVideoEncoderInfo.videoEncoderInfo.getSupportedHeights().getUpper()).intValue();
    }

    private final boolean isWidthStretchApplied() {
        return ((Boolean) this.isWidthStretchApplied$delegate.getValue()).booleanValue();
    }

    static final boolean isWidthStretchApplied_delegate$lambda$0(ProfileAwareVideoEncoderInfo profileAwareVideoEncoderInfo) {
        if (profileAwareVideoEncoderInfo.getProfileData() == null) {
            return false;
        }
        ProfileData profileData = profileAwareVideoEncoderInfo.getProfileData();
        x.c(profileData);
        return profileData.getMaxWidth() > ((Number) profileAwareVideoEncoderInfo.videoEncoderInfo.getSupportedWidths().getUpper()).intValue();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return this.videoEncoderInfo.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.videoEncoderInfo.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getMime() {
        return this.videoEncoderInfo.getMime();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getName() {
        return this.videoEncoderInfo.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedBitrateRange() {
        return this.videoEncoderInfo.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeights() {
        return get_supportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeightsFor(int i2) {
        Set<Size> extraSizes;
        try {
            return this.videoEncoderInfo.getSupportedHeightsFor(i2);
        } catch (IllegalArgumentException e2) {
            ProfileData profileData = this.getProfileData();
            if (profileData != null && (extraSizes = profileData.getExtraSizes()) != null) {
                Set<Size> set = extraSizes;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (((Size) it.next()).getWidth() == i2) {
                            return this.get_supportedHeights();
                        }
                    }
                }
            }
            throw e2;
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidths() {
        return get_supportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidthsFor(int i2) {
        Set<Size> extraSizes;
        try {
            return this.videoEncoderInfo.getSupportedWidthsFor(i2);
        } catch (IllegalArgumentException e2) {
            ProfileData profileData = this.getProfileData();
            if (profileData != null && (extraSizes = profileData.getExtraSizes()) != null) {
                Set<Size> set = extraSizes;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (((Size) it.next()).getHeight() == i2) {
                            return this.get_supportedWidths();
                        }
                    }
                }
            }
            throw e2;
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.videoEncoderInfo.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i2, int i3) {
        Set<Size> extraSizes;
        ProfileData profileData = getProfileData();
        return !(profileData == null || (extraSizes = profileData.getExtraSizes()) == null || !extraSizes.contains(new Size(i2, i3))) || this.videoEncoderInfo.isSizeSupported(i2, i3);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public /* synthetic */ boolean isSizeSupportedAllowSwapping(int i2, int i3) {
        return VideoEncoderInfo.CC.$default$isSizeSupportedAllowSwapping(this, i2, i3);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final android.util.Size findMatchingSizeFromProfile(int r5, int r6, java.lang.String r7) {
            /*
                r4 = this;
                boolean r0 = android.media.CamcorderProfile.hasProfile(r5, r6)
                r1 = 0
                if (r0 != 0) goto L9
                goto L94
            L9:
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r0 < r2) goto L7e
                java.lang.String r0 = java.lang.String.valueOf(r5)
                android.media.EncoderProfiles r0 = android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0.m(r0, r6)
                h.g.b.x.c(r0)
                java.util.List r0 = android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0.m(r0)
                java.lang.String r2 = "getVideoProfiles(...)"
                h.g.b.x.e(r0, r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r2 = r0 instanceof java.util.Collection
                if (r2 == 0) goto L33
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L33
                goto L7e
            L33:
                java.util.Iterator r2 = r0.iterator()
            L37:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L7e
                java.lang.Object r3 = r2.next()
                android.media.EncoderProfiles$VideoProfile r3 = android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0.m125m(r3)
                if (r3 == 0) goto L37
                java.util.Iterator r4 = r0.iterator()
            L4b:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L69
                java.lang.Object r5 = r4.next()
                android.media.EncoderProfiles$VideoProfile r6 = android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0.m125m(r5)
                if (r6 == 0) goto L60
                java.lang.String r6 = android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0.m137m(r6)
                goto L61
            L60:
                r6 = r1
            L61:
                r0 = 1
                boolean r6 = h.n.o.m(r6, r7, r0)
                if (r6 == 0) goto L4b
                goto L6a
            L69:
                r5 = r1
            L6a:
                android.media.EncoderProfiles$VideoProfile r4 = android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0.m125m(r5)
                if (r4 == 0) goto L94
                android.util.Size r5 = new android.util.Size
                int r6 = android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0.m(r4)
                int r4 = android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0.m$1(r4)
                r5.<init>(r6, r4)
                return r5
            L7e:
                android.media.CamcorderProfile r5 = android.media.CamcorderProfile.get(r5, r6)
                int r6 = r5.videoCodec
                boolean r4 = r4.isMimeMatch(r6, r7)
                if (r4 == 0) goto L94
                android.util.Size r4 = new android.util.Size
                int r6 = r5.videoFrameWidth
                int r5 = r5.videoFrameHeight
                r4.<init>(r6, r5)
                return r4
            L94:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.workaround.ProfileAwareVideoEncoderInfo.Companion.findMatchingSizeFromProfile(int, int, java.lang.String):android.util.Size");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ProfileData getOrComputeProfileData(String str) {
            synchronized (ProfileAwareVideoEncoderInfo.profileCache) {
                if (ProfileAwareVideoEncoderInfo.profileCache.containsKey(str)) {
                    return (ProfileData) ProfileAwareVideoEncoderInfo.profileCache.get(str);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int iMax = 0;
                Iterator it = i.i(0, 1).iterator();
                int iMax2 = 0;
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    for (Quality quality : Quality.getSortedQualities()) {
                        x.d(quality, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
                        Size sizeFindMatchingSizeFromProfile = ProfileAwareVideoEncoderInfo.Companion.findMatchingSizeFromProfile(iIntValue, ((Quality.ConstantQuality) quality).getQualityValue(1), str);
                        if (sizeFindMatchingSizeFromProfile != null) {
                            linkedHashSet.add(sizeFindMatchingSizeFromProfile);
                            iMax = Math.max(iMax, sizeFindMatchingSizeFromProfile.getWidth());
                            iMax2 = Math.max(iMax2, sizeFindMatchingSizeFromProfile.getHeight());
                        }
                    }
                }
                ProfileData profileData = linkedHashSet.isEmpty() ? null : new ProfileData(linkedHashSet, iMax, iMax2);
                Logger.d(ProfileAwareVideoEncoderInfo.TAG, "Add ProfileData for " + str + ": " + profileData);
                ProfileAwareVideoEncoderInfo.profileCache.put(str, profileData);
                return profileData;
            }
        }

        private final boolean isMimeMatch(int i2, String str) {
            String videoCodecMimeType = EncoderProfilesProxy.CC.getVideoCodecMimeType(i2);
            x.e(videoCodecMimeType, "getVideoCodecMimeType(...)");
            return o.m(videoCodecMimeType, str, true);
        }

        public final void clearCache$camera_video() {
            synchronized (ProfileAwareVideoEncoderInfo.profileCache) {
                ProfileAwareVideoEncoderInfo.profileCache.clear();
            }
        }

        public final VideoEncoderInfo from(VideoEncoderInfo videoEncoderInfo) {
            x.f(videoEncoderInfo, "videoEncoderInfo");
            return new ProfileAwareVideoEncoderInfo(videoEncoderInfo, null);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public /* synthetic */ ProfileAwareVideoEncoderInfo(VideoEncoderInfo videoEncoderInfo, h.g.b.o oVar) {
        this(videoEncoderInfo);
    }
}

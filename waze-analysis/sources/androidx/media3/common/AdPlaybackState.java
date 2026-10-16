package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.j.e;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new AdGroup[0], 0, C.TIME_UNSET, 0);
    private static final AdGroup REMOVED_AD_GROUP = new AdGroup(0).withAdCount(0);
    private static final String FIELD_AD_GROUPS = Util.intToStringMaxRadix(1);
    private static final String FIELD_AD_RESUME_POSITION_US = Util.intToStringMaxRadix(2);
    private static final String FIELD_CONTENT_DURATION_US = Util.intToStringMaxRadix(3);
    private static final String FIELD_REMOVED_AD_GROUP_COUNT = Util.intToStringMaxRadix(4);

    /* compiled from: WazeSource */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    /* compiled from: WazeSource */
    public final class SkipInfo {
        public final String labelId;
        public final long skipDurationUs;
        public final long skipOffsetUs;
        private static final String FIELD_SKIP_OFFSET_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_SKIP_DURATION_US = Util.intToStringMaxRadix(1);
        private static final String FIELD_LABEL_ID = Util.intToStringMaxRadix(2);

        public SkipInfo(long j2, long j3, String str) {
            if (j2 == C.TIME_UNSET) {
                if (j3 == C.TIME_UNSET) {
                    z = str != null;
                    j2 = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                } else {
                    j2 = -9223372036854775807L;
                }
            }
            an.l(z);
            this.skipOffsetUs = j2 == C.TIME_UNSET ? 0L : j2;
            this.skipDurationUs = j3;
            this.labelId = str;
        }

        public static SkipInfo fromBundle(Bundle bundle) {
            return new SkipInfo(bundle.getLong(FIELD_SKIP_OFFSET_US), bundle.getLong(FIELD_SKIP_DURATION_US), bundle.getString(FIELD_LABEL_ID));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                SkipInfo skipInfo = (SkipInfo) obj;
                if (this.skipOffsetUs == skipInfo.skipOffsetUs && this.skipDurationUs == skipInfo.skipDurationUs && Objects.equals(this.labelId, skipInfo.labelId)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.skipOffsetUs), Long.valueOf(this.skipDurationUs), this.labelId);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(FIELD_SKIP_OFFSET_US, this.skipOffsetUs);
            bundle.putLong(FIELD_SKIP_DURATION_US, this.skipDurationUs);
            bundle.putString(FIELD_LABEL_ID, this.labelId);
            return bundle;
        }
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, C.TIME_UNSET, 0);
    }

    private static AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i2 = 0; i2 < length; i2++) {
            adGroupArr[i2] = new AdGroup(jArr[i2]);
        }
        return adGroupArr;
    }

    public static AdPlaybackState fromAdPlaybackState(Object obj, AdPlaybackState adPlaybackState) {
        int i2 = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        AdGroup[] adGroupArr = new AdGroup[i2];
        int i3 = 0;
        while (i3 < i2) {
            AdGroup adGroup = adPlaybackState.adGroups[i3];
            long j2 = adGroup.timeUs;
            int i4 = adGroup.count;
            int i5 = adGroup.originalCount;
            int[] iArr = adGroup.states;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            MediaItem[] mediaItemArr = adGroup.mediaItems;
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = adGroup.durationsUs;
            adGroupArr[i3] = new AdGroup(j2, i4, i5, iArrCopyOf, mediaItemArr2, Arrays.copyOf(jArr, jArr.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted, adGroup.ids, adGroup.skipInfos, adGroup.isPlaceholder);
            i3++;
            i2 = i2;
        }
        return new AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    public static AdPlaybackState fromBundle(Bundle bundle, int i2) {
        AdGroup[] adGroupArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_AD_GROUPS);
        if (parcelableArrayList == null) {
            adGroupArr = new AdGroup[0];
        } else {
            AdGroup[] adGroupArr2 = new AdGroup[parcelableArrayList.size()];
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                adGroupArr2[i3] = AdGroup.fromBundle((Bundle) parcelableArrayList.get(i3), i2);
            }
            adGroupArr = adGroupArr2;
        }
        String str = FIELD_AD_RESUME_POSITION_US;
        AdPlaybackState adPlaybackState = NONE;
        return new AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(FIELD_CONTENT_DURATION_US, adPlaybackState.contentDurationUs), bundle.getInt(FIELD_REMOVED_AD_GROUP_COUNT, adPlaybackState.removedAdGroupCount));
    }

    private boolean isPositionBeforeAdGroup(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        AdGroup adGroup = getAdGroup(i2);
        long j4 = adGroup.timeUs;
        return j4 == Long.MIN_VALUE ? j3 == C.TIME_UNSET || adGroup.isLivePostrollPlaceholder() || j2 < j3 : j2 < j4;
    }

    public static long sumOfDurations(long... jArr) {
        long jE = 0;
        for (long j2 : jArr) {
            if (j2 != C.TIME_UNSET) {
                jE = e.e(jE, j2);
            }
        }
        return jE;
    }

    public AdPlaybackState copy() {
        int length = this.adGroups.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i2 = 0; i2 < length; i2++) {
            adGroupArr[i2] = this.adGroups[i2].copy();
        }
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i2 = this.adGroupCount - 1;
        return i2 >= 0 && isLivePostrollPlaceholder(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
            if (Objects.equals(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && Arrays.equals(this.adGroups, adPlaybackState.adGroups)) {
                return true;
            }
        }
        return false;
    }

    public AdGroup getAdGroup(int i2) {
        int i3 = this.removedAdGroupCount;
        return i2 < i3 ? REMOVED_AD_GROUP : this.adGroups[i2 - i3];
    }

    public int getAdGroupIndexAfterPositionUs(long j2, long j3) {
        if (j2 != Long.MIN_VALUE && (j3 == C.TIME_UNSET || j2 < j3)) {
            int i2 = this.removedAdGroupCount;
            while (i2 < this.adGroupCount && ((getAdGroup(i2).timeUs != Long.MIN_VALUE && getAdGroup(i2).timeUs <= j2) || !getAdGroup(i2).shouldPlayAdGroup())) {
                i2++;
            }
            if (i2 < this.adGroupCount) {
                if (j3 == C.TIME_UNSET || getAdGroup(i2).timeUs <= j3) {
                    return i2;
                }
                return -1;
            }
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j2, long j3) {
        AdPlaybackState adPlaybackState;
        int i2 = this.adGroupCount - 1;
        int i3 = i2 - (isLivePostrollPlaceholder(i2) ? 1 : 0);
        while (true) {
            adPlaybackState = this;
            if (i3 < 0) {
                break;
            }
            long j4 = j2;
            long j5 = j3;
            if (!adPlaybackState.isPositionBeforeAdGroup(j4, j5, i3)) {
                break;
            }
            i3--;
            this = adPlaybackState;
            j2 = j4;
            j3 = j5;
        }
        if (i3 < 0 || !adPlaybackState.getAdGroup(i3).hasUnplayedAds()) {
            return -1;
        }
        return i3;
    }

    public int getAdIndexOfAdId(int i2, String str) {
        return getAdGroup(i2).getIndexOfAdId(str);
    }

    public int hashCode() {
        Object obj = this.adsId;
        return (((((((((this.adGroupCount * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31) + Arrays.hashCode(this.adGroups);
    }

    public boolean isAdInErrorState(int i2, int i3) {
        AdGroup adGroup;
        int i4;
        return i2 < this.adGroupCount && (i4 = (adGroup = getAdGroup(i2)).count) != -1 && i3 < i4 && adGroup.states[i3] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i2) {
        return i2 == this.adGroupCount + (-1) && getAdGroup(i2).isLivePostrollPlaceholder();
    }

    public Bundle toBundle(int i2) {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle(i2));
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_AD_GROUPS, arrayList);
        }
        long j2 = this.adResumePositionUs;
        AdPlaybackState adPlaybackState = NONE;
        if (j2 != adPlaybackState.adResumePositionUs) {
            bundle.putLong(FIELD_AD_RESUME_POSITION_US, j2);
        }
        long j3 = this.contentDurationUs;
        if (j3 != adPlaybackState.contentDurationUs) {
            bundle.putLong(FIELD_CONTENT_DURATION_US, j3);
        }
        int i3 = this.removedAdGroupCount;
        if (i3 != adPlaybackState.removedAdGroupCount) {
            bundle.putInt(FIELD_REMOVED_AD_GROUP_COUNT, i3);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.adsId);
        sb.append(", adResumePositionUs=");
        sb.append(this.adResumePositionUs);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.adGroups.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.adGroups[i2].timeUs);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.adGroups[i2].states.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.adGroups[i2].states[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.adGroups[i2].durationsUs[i3]);
                sb.append(')');
                if (i3 < this.adGroups[i2].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.adGroups.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public AdPlaybackState withAdCount(int i2, int i3) {
        an.l(i3 > 0);
        int i4 = i2 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i4].count == i3) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i4] = this.adGroups[i4].withAdCount(i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        int i2 = 0;
        an.l(jArr.length == this.adGroupCount);
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        while (true) {
            int i3 = this.adGroupCount;
            int i4 = this.removedAdGroupCount;
            if (i2 >= i3 - i4) {
                return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, i4);
            }
            adGroupArr2[i2] = adGroupArr2[i2].withAdDurationsUs(jArr[i4 + i2]);
            i2++;
        }
    }

    public AdPlaybackState withAdGroupTimeUs(int i2, long j2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        AdGroup[] adGroupArr3 = this.adGroups;
        int i3 = i2 - this.removedAdGroupCount;
        adGroupArr2[i3] = adGroupArr3[i3].withTimeUs(j2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdId(int i2, int i3, String str) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i4 = i2 - this.removedAdGroupCount;
        adGroupArr2[i4] = adGroupArr2[i4].withAdId(str, i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdLoadError(int i2, int i3) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i4 = i2 - this.removedAdGroupCount;
        adGroupArr2[i4] = adGroupArr2[i4].withAdState(4, i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdResumePositionUs(long j2) {
        return this.adResumePositionUs == j2 ? this : new AdPlaybackState(this.adsId, this.adGroups, j2, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdSkipInfo(int i2, int i3, SkipInfo skipInfo) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i4 = i2 - this.removedAdGroupCount;
        adGroupArr2[i4] = adGroupArr2[i4].withAdSkipInfo(skipInfo, i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdsId(Object obj) {
        return new AdPlaybackState(obj, this.adGroups, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAvailableAd(int i2, int i3) {
        return withAvailableAdMediaItem(i2, i3, MediaItem.fromUri(Uri.EMPTY));
    }

    public AdPlaybackState withAvailableAdMediaItem(int i2, int i3, MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i4 = i2 - this.removedAdGroupCount;
        boolean z = true;
        if (!adGroupArr2[i4].isServerSideInserted && ((localConfiguration = mediaItem.localConfiguration) == null || localConfiguration.uri.equals(Uri.EMPTY))) {
            z = false;
        }
        an.u(z);
        adGroupArr2[i4] = adGroupArr2[i4].withAdMediaItem(mediaItem, i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public AdPlaybackState withAvailableAdUri(int i2, int i3, Uri uri) {
        return withAvailableAdMediaItem(i2, i3, MediaItem.fromUri(uri));
    }

    public AdPlaybackState withContentDurationUs(long j2) {
        return this.contentDurationUs == j2 ? this : new AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j2, this.removedAdGroupCount);
    }

    public AdPlaybackState withContentResumeOffsetUs(int i2, long j2) {
        AdGroup[] adGroupArr = this.adGroups;
        int i3 = i2 - this.removedAdGroupCount;
        if (adGroupArr[i3].contentResumeOffsetUs == j2) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withContentResumeOffsetUs(j2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    AdPlaybackState withIsPlaceholder(int i2, boolean z, boolean z2) {
        AdGroup[] adGroupArr = this.adGroups;
        int i3 = i2 - this.removedAdGroupCount;
        AdGroup adGroup = adGroupArr[i3];
        if (adGroup.isPlaceholder == z && adGroup.isServerSideInserted == z2) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withIsPlaceholder(z, z2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withIsServerSideInserted(int i2, boolean z) {
        AdGroup[] adGroupArr = this.adGroups;
        int i3 = i2 - this.removedAdGroupCount;
        if (adGroupArr[i3].isServerSideInserted == z) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withIsServerSideInserted(z);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public AdPlaybackState withLastAdRemoved(int i2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i3 = i2 - this.removedAdGroupCount;
        adGroupArr2[i3] = adGroupArr2[i3].withLastAdRemoved();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withLivePostrollPlaceholderAppended(boolean z) {
        int i2 = this.adGroupCount;
        return withNewAdGroup(i2, Long.MIN_VALUE).withIsPlaceholder(i2, true, z);
    }

    public AdPlaybackState withNewAdGroup(int i2, long j2) {
        AdGroup adGroup = new AdGroup(j2);
        AdGroup[] adGroupArr = (AdGroup[]) Util.nullSafeArrayAppend(this.adGroups, adGroup);
        int length = this.adGroups.length;
        int i3 = i2 - this.removedAdGroupCount;
        System.arraycopy(adGroupArr, i3, adGroupArr, i3 + 1, length - i3);
        adGroupArr[i3] = adGroup;
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withOriginalAdCount(int i2, int i3) {
        AdGroup[] adGroupArr = this.adGroups;
        int i4 = i2 - this.removedAdGroupCount;
        if (adGroupArr[i4].originalCount == i3) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i4] = adGroupArr2[i4].withOriginalAdCount(i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withPlayedAd(int i2, int i3) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i4 = i2 - this.removedAdGroupCount;
        adGroupArr2[i4] = adGroupArr2[i4].withAdState(3, i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withRemovedAdGroupCount(int i2) {
        int i3 = this.removedAdGroupCount;
        if (i3 == i2) {
            return this;
        }
        an.l(i2 > i3);
        int i4 = this.adGroupCount - i2;
        AdGroup[] adGroupArr = new AdGroup[i4];
        System.arraycopy(this.adGroups, i2 - this.removedAdGroupCount, adGroupArr, 0, i4);
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i2);
    }

    public AdPlaybackState withRemovedAdGroupCountBefore(long j2) {
        int i2 = this.removedAdGroupCount;
        while (i2 < this.adGroupCount) {
            long j3 = getAdGroup(i2).timeUs;
            if (j2 <= j3 || j3 == Long.MIN_VALUE) {
                break;
            }
            i2++;
        }
        return withRemovedAdGroupCount(i2);
    }

    public AdPlaybackState withRemovedAdsAfterIndex(int i2, int i3) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i4 = i2 - this.removedAdGroupCount;
        adGroupArr2[i4] = adGroupArr2[i4].withRemovedAdsAfterIndex(i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withResetAdGroup(int i2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i3 = i2 - this.removedAdGroupCount;
        adGroupArr2[i3] = adGroupArr2[i3].withAllAdsReset();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withSkippedAd(int i2, int i3) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i4 = i2 - this.removedAdGroupCount;
        adGroupArr2[i4] = adGroupArr2[i4].withAdState(2, i3);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withSkippedAdGroup(int i2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i3 = i2 - this.removedAdGroupCount;
        adGroupArr2[i3] = adGroupArr2[i3].withAllAdsSkipped();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withUnavailableAdGroup(int i2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i3 = i2 - this.removedAdGroupCount;
        adGroupArr2[i3] = adGroupArr2[i3].withAllAdsUnavailable();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public AdPlaybackState withLivePostrollPlaceholderAppended() {
        return withLivePostrollPlaceholderAppended(true);
    }

    public boolean endsWithLivePostrollPlaceHolder(boolean z) {
        int i2 = this.adGroupCount - 1;
        return i2 >= 0 && isLivePostrollPlaceholder(i2, z);
    }

    private AdPlaybackState(Object obj, AdGroup[] adGroupArr, long j2, long j3, int i2) {
        this.adsId = obj;
        this.adResumePositionUs = j2;
        this.contentDurationUs = j3;
        this.adGroupCount = adGroupArr.length + i2;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i2;
    }

    /* compiled from: WazeSource */
    public final class AdGroup {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final String[] ids;
        public final boolean isPlaceholder;
        public final boolean isServerSideInserted;
        public final MediaItem[] mediaItems;
        public final int originalCount;
        public final SkipInfo[] skipInfos;
        public final int[] states;
        public final long timeUs;

        @Deprecated
        public final Uri[] uris;
        private static final String FIELD_TIME_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_COUNT = Util.intToStringMaxRadix(1);
        private static final String FIELD_URIS = Util.intToStringMaxRadix(2);
        private static final String FIELD_STATES = Util.intToStringMaxRadix(3);
        private static final String FIELD_DURATIONS_US = Util.intToStringMaxRadix(4);
        private static final String FIELD_CONTENT_RESUME_OFFSET_US = Util.intToStringMaxRadix(5);
        private static final String FIELD_IS_SERVER_SIDE_INSERTED = Util.intToStringMaxRadix(6);
        private static final String FIELD_ORIGINAL_COUNT = Util.intToStringMaxRadix(7);
        static final String FIELD_MEDIA_ITEMS = Util.intToStringMaxRadix(8);
        static final String FIELD_IDS = Util.intToStringMaxRadix(9);
        static final String FIELD_IS_PLACEHOLDER = Util.intToStringMaxRadix(10);
        private static final String FIELD_SKIP_INFOS = Util.intToStringMaxRadix(11);

        private AdGroup(long j2, int i2, int i3, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, long j3, boolean z, String[] strArr, SkipInfo[] skipInfoArr, boolean z2) {
            Uri uri;
            int length = iArr.length;
            int length2 = mediaItemArr.length;
            int i4 = 0;
            an.l(length == length2);
            an.l(length == skipInfoArr.length);
            this.timeUs = j2;
            this.count = i2;
            this.originalCount = i3;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j3;
            this.isServerSideInserted = z;
            this.uris = new Uri[length2];
            while (true) {
                Uri[] uriArr = this.uris;
                if (i4 >= uriArr.length) {
                    this.ids = strArr;
                    this.skipInfos = skipInfoArr;
                    this.isPlaceholder = z2;
                    return;
                }
                MediaItem mediaItem = mediaItemArr[i4];
                if (mediaItem == null) {
                    uri = null;
                } else {
                    MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
                    an.B(localConfiguration);
                    uri = localConfiguration.uri;
                }
                uriArr[i4] = uri;
                i4++;
            }
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i2) {
            int length = jArr.length;
            int iMax = Math.max(i2, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        private static SkipInfo[] copySkipInfosWithSpaceForAdCount(SkipInfo[] skipInfoArr, int i2) {
            return (SkipInfo[]) Arrays.copyOf(skipInfoArr, Math.max(i2, skipInfoArr.length));
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i2) {
            int length = iArr.length;
            int iMax = Math.max(i2, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public static AdGroup fromBundle(Bundle bundle, int i2) {
            int i3;
            long j2 = bundle.getLong(FIELD_TIME_US);
            int i4 = bundle.getInt(FIELD_COUNT);
            int i5 = bundle.getInt(FIELD_ORIGINAL_COUNT);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_URIS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_MEDIA_ITEMS);
            int[] intArray = bundle.getIntArray(FIELD_STATES);
            long[] longArray = bundle.getLongArray(FIELD_DURATIONS_US);
            long j3 = bundle.getLong(FIELD_CONTENT_RESUME_OFFSET_US);
            boolean z = bundle.getBoolean(FIELD_IS_SERVER_SIDE_INSERTED);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(FIELD_IDS);
            ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(FIELD_SKIP_INFOS);
            boolean z2 = bundle.getBoolean(FIELD_IS_PLACEHOLDER);
            if (intArray == null) {
                intArray = new int[0];
            }
            MediaItem[] mediaItemsFromBundleArrays = getMediaItemsFromBundleArrays(parcelableArrayList2, parcelableArrayList, i2);
            if (longArray == null) {
                i3 = 0;
                longArray = new long[0];
            } else {
                i3 = 0;
            }
            String[] strArr = stringArrayList == null ? new String[i3] : (String[]) stringArrayList.toArray(new String[i3]);
            SkipInfo[] skipInfosFromBundleArrays = parcelableArrayList3 == null ? new SkipInfo[i3] : getSkipInfosFromBundleArrays(parcelableArrayList3);
            return new AdGroup(j2, i4, i5, intArray, mediaItemsFromBundleArrays, longArray, j3, z, strArr, skipInfosFromBundleArrays, z2);
        }

        private ArrayList<Bundle> getMediaItemsArrayBundles(int i2) {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            MediaItem[] mediaItemArr = this.mediaItems;
            int length = mediaItemArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                MediaItem mediaItem = mediaItemArr[i3];
                arrayList.add(mediaItem == null ? null : mediaItem.toBundleIncludeLocalConfiguration(i2));
            }
            return arrayList;
        }

        private static MediaItem[] getMediaItemsFromBundleArrays(ArrayList<Bundle> arrayList, ArrayList<Uri> arrayList2, int i2) {
            int i3 = 0;
            if (arrayList != null) {
                MediaItem[] mediaItemArr = new MediaItem[arrayList.size()];
                while (i3 < arrayList.size()) {
                    Bundle bundle = arrayList.get(i3);
                    mediaItemArr[i3] = bundle == null ? null : MediaItem.fromBundle(bundle, i2);
                    i3++;
                }
                return mediaItemArr;
            }
            if (arrayList2 == null) {
                return new MediaItem[0];
            }
            MediaItem[] mediaItemArr2 = new MediaItem[arrayList2.size()];
            while (i3 < arrayList2.size()) {
                Uri uri = arrayList2.get(i3);
                mediaItemArr2[i3] = uri == null ? null : MediaItem.fromUri(uri);
                i3++;
            }
            return mediaItemArr2;
        }

        private ArrayList<Bundle> getSkipInfoArrayBundles() {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            SkipInfo[] skipInfoArr = this.skipInfos;
            int length = skipInfoArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                SkipInfo skipInfo = skipInfoArr[i2];
                arrayList.add(skipInfo == null ? null : skipInfo.toBundle());
            }
            return arrayList;
        }

        private static SkipInfo[] getSkipInfosFromBundleArrays(List<Bundle> list) {
            SkipInfo[] skipInfoArr = new SkipInfo[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = list.get(i2);
                skipInfoArr[i2] = bundle == null ? null : SkipInfo.fromBundle(bundle);
            }
            return skipInfoArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AdGroup withIsPlaceholder(boolean z, boolean z2) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z2, this.ids, this.skipInfos, z);
        }

        public AdGroup copy() {
            int[] iArr = this.states;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            MediaItem[] mediaItemArr = this.mediaItems;
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = this.durationsUs;
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            String[] strArr = this.ids;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            SkipInfo[] skipInfoArr = this.skipInfos;
            SkipInfo[] skipInfoArr2 = (SkipInfo[]) Arrays.copyOf(skipInfoArr, skipInfoArr.length);
            boolean z = this.isPlaceholder;
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyOf, mediaItemArr2, jArrCopyOf, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArr2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                AdGroup adGroup = (AdGroup) obj;
                if (this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && Arrays.equals(this.mediaItems, adGroup.mediaItems) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted && Arrays.equals(this.ids, adGroup.ids) && Arrays.equals(this.skipInfos, adGroup.skipInfos) && this.isPlaceholder == adGroup.isPlaceholder) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getIndexOfAdId(String str) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.ids;
                if (i2 >= strArr.length) {
                    return -1;
                }
                if (Objects.equals(strArr[i2], str)) {
                    return i2;
                }
                i2++;
            }
        }

        public int getNextAdIndexToPlay(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i4 >= iArr.length || this.isServerSideInserted || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.count; i2++) {
                int i3 = this.states[i2];
                if (i3 == 0 || i3 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j2 = this.timeUs;
            long j3 = j2 ^ (j2 >>> 32);
            int iHashCode = (((((((((this.count * 31) + this.originalCount) * 31) + ((int) j3)) * 31) + Arrays.hashCode(this.mediaItems)) * 31) + Arrays.hashCode(this.states)) * 31) + Arrays.hashCode(this.durationsUs);
            String[] strArr = this.ids;
            long j4 = this.contentResumeOffsetUs;
            return (((((((((iHashCode * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + (this.isServerSideInserted ? 1 : 0)) * 31) + Arrays.hashCode(strArr)) * 31) + Arrays.hashCode(this.skipInfos)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        public boolean isLivePostrollPlaceholder() {
            return this.isPlaceholder && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public Bundle toBundle(int i2) {
            Bundle bundle = new Bundle();
            bundle.putLong(FIELD_TIME_US, this.timeUs);
            bundle.putInt(FIELD_COUNT, this.count);
            bundle.putInt(FIELD_ORIGINAL_COUNT, this.originalCount);
            bundle.putParcelableArrayList(FIELD_URIS, new ArrayList<>(Arrays.asList(this.uris)));
            bundle.putParcelableArrayList(FIELD_MEDIA_ITEMS, getMediaItemsArrayBundles(i2));
            bundle.putIntArray(FIELD_STATES, this.states);
            bundle.putLongArray(FIELD_DURATIONS_US, this.durationsUs);
            bundle.putLong(FIELD_CONTENT_RESUME_OFFSET_US, this.contentResumeOffsetUs);
            bundle.putBoolean(FIELD_IS_SERVER_SIDE_INSERTED, this.isServerSideInserted);
            bundle.putStringArrayList(FIELD_IDS, new ArrayList<>(Arrays.asList(this.ids)));
            bundle.putParcelableArrayList(FIELD_SKIP_INFOS, getSkipInfoArrayBundles());
            bundle.putBoolean(FIELD_IS_PLACEHOLDER, this.isPlaceholder);
            return bundle;
        }

        public AdGroup withAdCount(int i2) {
            MediaItem[] mediaItemArr = this.mediaItems;
            long[] jArr = this.durationsUs;
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArr, i2);
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, i2);
            String[] strArr = (String[]) Arrays.copyOf(this.ids, i2);
            SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(this.skipInfos, i2);
            boolean z = this.isPlaceholder;
            long j2 = this.contentResumeOffsetUs;
            boolean z2 = this.isServerSideInserted;
            return new AdGroup(this.timeUs, i2, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArrCopyDurationsUsWithSpaceForAdCount, j2, z2, strArr, skipInfoArrCopySkipInfosWithSpaceForAdCount, z);
        }

        public AdGroup withAdDurationsUs(long[] jArr) {
            MediaItem[] mediaItemArr = this.mediaItems;
            int length = jArr.length;
            int length2 = mediaItemArr.length;
            if (length < length2) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, length2);
            } else if (this.count != -1 && length > length2) {
                jArr = Arrays.copyOf(jArr, length2);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAdId(String str, int i2) {
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2 + 1);
            int length = jArrCopyDurationsUsWithSpaceForAdCount.length;
            int length2 = iArrCopyStatesWithSpaceForAdCount.length;
            if (length != length2) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, length2);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != length2) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, length2);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = (String[]) Arrays.copyOf(this.ids, length2);
            strArr[i2] = str;
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAdMediaItem(MediaItem mediaItem, int i2) {
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2 + 1);
            int length = jArrCopyDurationsUsWithSpaceForAdCount.length;
            int length2 = iArrCopyStatesWithSpaceForAdCount.length;
            if (length != length2) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, length2);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(this.mediaItems, length2);
            mediaItemArr[i2] = mediaItem;
            iArrCopyStatesWithSpaceForAdCount[i2] = 1;
            String[] strArr = this.ids;
            if (strArr.length != length2) {
                strArr = (String[]) Arrays.copyOf(strArr, length2);
            }
            String[] strArr2 = strArr;
            SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = this.skipInfos;
            if (skipInfoArrCopySkipInfosWithSpaceForAdCount.length != length2) {
                skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(skipInfoArrCopySkipInfosWithSpaceForAdCount, length2);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        public AdGroup withAdSkipInfo(SkipInfo skipInfo, int i2) {
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2 + 1);
            int length = jArrCopyDurationsUsWithSpaceForAdCount.length;
            int length2 = iArrCopyStatesWithSpaceForAdCount.length;
            if (length != length2) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, length2);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != length2) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, length2);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = this.ids;
            if (strArr.length != length2) {
                strArr = (String[]) Arrays.copyOf(strArr, length2);
            }
            String[] strArr2 = strArr;
            SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(this.skipInfos, length2);
            skipInfoArrCopySkipInfosWithSpaceForAdCount[i2] = skipInfo;
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        public AdGroup withAdState(int i2, int i3) {
            int i4 = this.count;
            an.l(i4 == -1 || i3 < i4);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3 + 1);
            int i5 = iArrCopyStatesWithSpaceForAdCount[i3];
            an.l(i5 == 0 || i5 == 1 || i5 == i2);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            int length = jArrCopyDurationsUsWithSpaceForAdCount.length;
            int length2 = iArrCopyStatesWithSpaceForAdCount.length;
            if (length != length2) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, length2);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != length2) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, length2);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = this.ids;
            if (strArr.length != length2) {
                strArr = (String[]) Arrays.copyOf(strArr, length2);
            }
            String[] strArr2 = strArr;
            iArrCopyStatesWithSpaceForAdCount[i3] = i2;
            SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = this.skipInfos;
            if (skipInfoArrCopySkipInfosWithSpaceForAdCount.length != length2) {
                skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(skipInfoArrCopySkipInfosWithSpaceForAdCount, length2);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        @Deprecated
        public AdGroup withAdUri(Uri uri, int i2) {
            return withAdMediaItem(MediaItem.fromUri(uri), i2);
        }

        public AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArrCopyOf[i2];
                if (i3 == 3 || i3 == 2 || i3 == 4) {
                    iArrCopyOf[i2] = this.mediaItems[i2] == null ? 0 : 1;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(this.timeUs, 0, this.originalCount, new int[0], new MediaItem[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArrCopyOf[i2];
                if (i3 == 1 || i3 == 0) {
                    iArrCopyOf[i2] = 2;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAllAdsUnavailable() {
            if (this.count == -1) {
                return this;
            }
            int length = this.states.length;
            int[] iArr = new int[length];
            Arrays.fill(iArr, 0);
            long[] jArr = new long[length];
            Arrays.fill(jArr, C.TIME_UNSET);
            long j2 = this.timeUs;
            int i2 = this.count;
            return new AdGroup(j2, i2, this.originalCount, iArr, new MediaItem[i2], jArr, 0L, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withContentResumeOffsetUs(long j2) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, j2, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withIsServerSideInserted(boolean z) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z, this.ids, this.skipInfos, this.isPlaceholder);
        }

        @Deprecated
        public AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            MediaItem[] mediaItemArr = this.mediaItems;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, length);
            long[] jArrCopyOf = this.durationsUs;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, mediaItemArr2, jArr, this.contentResumeOffsetUs != 0 ? AdPlaybackState.sumOfDurations(jArr) : 0L, this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, length), (SkipInfo[]) Arrays.copyOf(this.skipInfos, length), this.isPlaceholder);
        }

        public AdGroup withOriginalAdCount(int i2) {
            return new AdGroup(this.timeUs, this.count, i2, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withRemovedAdsAfterIndex(int i2) {
            an.l(i2 >= 0);
            int i3 = this.count;
            if (i3 == -1 || i2 >= i3 - 1) {
                return this;
            }
            int i4 = i2 + 1;
            long[] jArr = this.durationsUs;
            long j2 = this.timeUs;
            int i5 = this.originalCount;
            int[] iArr = this.states;
            MediaItem[] mediaItemArr = this.mediaItems;
            long[] jArrCopyOf = Arrays.copyOf(jArr, i4);
            return new AdGroup(j2, i4, i5, Arrays.copyOf(iArr, i4), (MediaItem[]) Arrays.copyOf(mediaItemArr, i4), jArrCopyOf, this.contentResumeOffsetUs != 0 ? AdPlaybackState.sumOfDurations(jArrCopyOf) : 0L, this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, i4), (SkipInfo[]) Arrays.copyOf(this.skipInfos, i4), this.isPlaceholder);
        }

        public AdGroup withTimeUs(long j2) {
            return new AdGroup(j2, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public boolean isLivePostrollPlaceholder(boolean z) {
            return this.isServerSideInserted == z && isLivePostrollPlaceholder();
        }

        public AdGroup(long j2) {
            this(j2, -1, -1, new int[0], new MediaItem[0], new long[0], 0L, false, new String[0], new SkipInfo[0], false);
        }

        @Deprecated
        public Bundle toBundle() {
            return toBundle(10);
        }

        @Deprecated
        public static AdGroup fromBundle(Bundle bundle) {
            return fromBundle(bundle, 10);
        }
    }

    public boolean isLivePostrollPlaceholder(int i2, boolean z) {
        return i2 == this.adGroupCount + (-1) && getAdGroup(i2).isLivePostrollPlaceholder(z);
    }

    public AdPlaybackState withAdDurationsUs(int i2, long... jArr) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        int i3 = i2 - this.removedAdGroupCount;
        adGroupArr2[i3] = adGroupArr2[i3].withAdDurationsUs(jArr);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public static AdPlaybackState fromBundle(Bundle bundle) {
        return fromBundle(bundle, 10);
    }

    @Deprecated
    public Bundle toBundle() {
        return toBundle(10);
    }
}

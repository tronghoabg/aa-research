package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class MappingTrackSelector extends TrackSelector {
    private MappedTrackInfo currentMappedTrackInfo;

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup, int[] iArr, boolean z) {
        int length = rendererCapabilitiesArr.length;
        int i2 = 0;
        boolean z2 = true;
        for (int i3 = 0; i3 < rendererCapabilitiesArr.length; i3++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i3];
            int iMax = 0;
            for (int i4 = 0; i4 < trackGroup.length; i4++) {
                iMax = Math.max(iMax, RendererCapabilities.CC.getFormatSupport(rendererCapabilities.supportsFormat(trackGroup.getFormat(i4))));
            }
            boolean z3 = iArr[i3] == 0;
            if (iMax > i2) {
                length = i3;
                z2 = z3;
            } else if (iMax == i2 && z && !z2 && z3) {
                z2 = true;
                length = i3;
            }
            i2 = iMax;
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) {
        int[] iArr = new int[trackGroup.length];
        for (int i2 = 0; i2 < trackGroup.length; i2++) {
            iArr[i2] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i2));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = rendererCapabilitiesArr[i2].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    protected abstract Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        int length = rendererCapabilitiesArr.length + 1;
        int[] iArr = new int[length];
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[length][][];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = trackGroupArray.length;
            trackGroupArr[i3] = new TrackGroup[i4];
            iArr2[i3] = new int[i4][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i5 = 0; i5 < trackGroupArray.length; i5++) {
            TrackGroup trackGroup = trackGroupArray.get(i5);
            int iFindRenderer = findRenderer(rendererCapabilitiesArr, trackGroup, iArr, trackGroup.type == 5);
            int[] formatSupport = iFindRenderer == rendererCapabilitiesArr.length ? new int[trackGroup.length] : getFormatSupport(rendererCapabilitiesArr[iFindRenderer], trackGroup);
            int i6 = iArr[iFindRenderer];
            trackGroupArr[iFindRenderer][i6] = trackGroup;
            iArr2[iFindRenderer][i6] = formatSupport;
            iArr[iFindRenderer] = i6 + 1;
        }
        int length2 = rendererCapabilitiesArr.length;
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[length2];
        String[] strArr = new String[length2];
        int[] iArr3 = new int[length2];
        while (true) {
            int length3 = rendererCapabilitiesArr.length;
            if (i2 >= length3) {
                MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[length3], iArr[length3])));
                Pair<RendererConfiguration[], ExoTrackSelection[]> pairSelectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports, mediaPeriodId, timeline);
                return new TrackSelectorResult((RendererConfiguration[]) pairSelectTracks.first, (ExoTrackSelection[]) pairSelectTracks.second, TrackSelectionUtil.buildTracks(mappedTrackInfo, (TrackSelection[]) pairSelectTracks.second), mappedTrackInfo);
            }
            int i7 = iArr[i2];
            trackGroupArrayArr[i2] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i2], i7));
            iArr2[i2] = (int[][]) Util.nullSafeArrayCopy(iArr2[i2], i7);
            strArr[i2] = rendererCapabilitiesArr[i2].getName();
            iArr3[i2] = rendererCapabilitiesArr[i2].getTrackType();
            i2++;
        }
    }

    /* compiled from: WazeSource */
    public final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final String[] rendererNames;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        /* compiled from: WazeSource */
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        MappedTrackInfo(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            this.rendererCount = iArr.length;
        }

        public int getAdaptiveSupport(int i2, int i3, int[] iArr) {
            int i4 = 0;
            String str = null;
            int iMin = 16;
            boolean z = false;
            int i5 = 0;
            while (i4 < iArr.length) {
                String str2 = this.rendererTrackGroups[i2].get(i3).getFormat(iArr[i4]).sampleMimeType;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, RendererCapabilities.CC.getAdaptiveSupport(this.rendererFormatSupports[i2][i3][i4]));
                i4++;
                i5 = i6;
            }
            return z ? Math.min(iMin, this.rendererMixedMimeTypeAdaptiveSupports[i2]) : iMin;
        }

        public int getCapabilities(int i2, int i3, int i4) {
            return this.rendererFormatSupports[i2][i3][i4];
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        public String getRendererName(int i2) {
            return this.rendererNames[i2];
        }

        public int getRendererSupport(int i2) {
            int iMax = 0;
            for (int[] iArr : this.rendererFormatSupports[i2]) {
                for (int i3 : iArr) {
                    int formatSupport = RendererCapabilities.CC.getFormatSupport(i3);
                    int i4 = 1;
                    if (formatSupport != 0 && formatSupport != 1 && formatSupport != 2) {
                        if (formatSupport != 3) {
                            if (formatSupport == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i4 = 2;
                    }
                    iMax = Math.max(iMax, i4);
                }
            }
            return iMax;
        }

        public int getRendererType(int i2) {
            return this.rendererTrackTypes[i2];
        }

        public TrackGroupArray getTrackGroups(int i2) {
            return this.rendererTrackGroups[i2];
        }

        public int getTrackSupport(int i2, int i3, int i4) {
            return RendererCapabilities.CC.getFormatSupport(getCapabilities(i2, i3, i4));
        }

        public int getTypeSupport(int i2) {
            int iMax = 0;
            for (int i3 = 0; i3 < this.rendererCount; i3++) {
                if (this.rendererTrackTypes[i3] == i2) {
                    iMax = Math.max(iMax, getRendererSupport(i3));
                }
            }
            return iMax;
        }

        public TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public int getAdaptiveSupport(int i2, int i3, boolean z) {
            int i4 = this.rendererTrackGroups[i2].get(i3).length;
            int[] iArr = new int[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                int trackSupport = getTrackSupport(i2, i3, i6);
                if (trackSupport == 4 || (z && trackSupport == 3)) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            return getAdaptiveSupport(i2, i3, Arrays.copyOf(iArr, i5));
        }
    }
}

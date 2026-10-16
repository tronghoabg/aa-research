package androidx.camera.video;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.Quality;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class QualityRatioToResolutionsTable {
    private static final Map<Integer, Rational> sAspectRatioMap;
    static final Map<Quality, Range<Integer>> sQualityRangeMap;
    private final Map<QualityRatio, List<Size>> mTable = new HashMap();

    /* compiled from: WazeSource */
    abstract class QualityRatio {
        QualityRatio() {
        }

        static QualityRatio of(Quality quality, int i2) {
            return new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality, i2);
        }

        abstract int getAspectRatio();

        abstract Quality getQuality();
    }

    static {
        HashMap map = new HashMap();
        sQualityRangeMap = map;
        map.put(Quality.UHD, Range.create(Integer.valueOf(DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_RIGHT), 4319));
        map.put(Quality.QHD, Range.create(Integer.valueOf(DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT), Integer.valueOf(DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_CENTER)));
        map.put(Quality.FHD, Range.create(Integer.valueOf(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT), Integer.valueOf(DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TARGET)));
        map.put(Quality.HD, Range.create(Integer.valueOf(DisplayStrings.DS_KM_PD), Integer.valueOf(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TITLE)));
        map.put(Quality.SD, Range.create(241, 719));
        HashMap map2 = new HashMap();
        sAspectRatioMap = map2;
        map2.put(0, AspectRatioUtil.ASPECT_RATIO_4_3);
        map2.put(1, AspectRatioUtil.ASPECT_RATIO_16_9);
    }

    QualityRatioToResolutionsTable(List<Size> list, Map<Quality, Size> map) {
        for (Quality quality : sQualityRangeMap.keySet()) {
            this.mTable.put(QualityRatio.of(quality, -1), new ArrayList());
            Iterator<Integer> it = sAspectRatioMap.keySet().iterator();
            while (it.hasNext()) {
                this.mTable.put(QualityRatio.of(quality, it.next().intValue()), new ArrayList());
            }
        }
        addProfileSizesToTable(map);
        addResolutionsToTable(list);
        sortQualityRatioRow(map);
    }

    private void addProfileSizesToTable(Map<Quality, Size> map) {
        for (Map.Entry<Quality, Size> entry : map.entrySet()) {
            ((List) Objects.requireNonNull(getQualityRatioRow(entry.getKey(), -1))).add(entry.getValue());
        }
    }

    private void addResolutionsToTable(List<Size> list) {
        Integer numFindMappedAspectRatio;
        for (Size size : list) {
            Quality qualityFindMappedQuality = findMappedQuality(size);
            if (qualityFindMappedQuality != null && (numFindMappedAspectRatio = findMappedAspectRatio(size)) != null) {
                ((List) Objects.requireNonNull(getQualityRatioRow(qualityFindMappedQuality, numFindMappedAspectRatio.intValue()))).add(size);
            }
        }
    }

    private static Integer findMappedAspectRatio(Size size) {
        for (Map.Entry<Integer, Rational> entry : sAspectRatioMap.entrySet()) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, entry.getValue(), SizeUtil.RESOLUTION_QVGA)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static Quality findMappedQuality(Size size) {
        for (Map.Entry<Quality, Range<Integer>> entry : sQualityRangeMap.entrySet()) {
            if (entry.getValue().contains((Range<Integer>) Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    private List<Size> getQualityRatioRow(Quality quality, int i2) {
        return this.mTable.get(QualityRatio.of(quality, i2));
    }

    private String getRatioLabel(int i2) {
        if (i2 == -1) {
            return "DEFAULT";
        }
        if (i2 == 0) {
            return "4:3";
        }
        if (i2 == 1) {
            return "16:9";
        }
        return "UNKNOWN (" + i2 + ")";
    }

    static /* synthetic */ int lambda$sortQualityRatioRow$0(int i2, Size size, Size size2) {
        return Math.abs(SizeUtil.getArea(size) - i2) - Math.abs(SizeUtil.getArea(size2) - i2);
    }

    private void sortQualityRatioRow(Map<Quality, Size> map) {
        for (Map.Entry<QualityRatio, List<Size>> entry : this.mTable.entrySet()) {
            Size size = map.get(entry.getKey().getQuality());
            if (size != null) {
                final int area = SizeUtil.getArea(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: androidx.camera.video.QualityRatioToResolutionsTable$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return QualityRatioToResolutionsTable.lambda$sortQualityRatioRow$0(area, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }

    List<Size> getResolutions(Quality quality, int i2) {
        List<Size> qualityRatioRow = getQualityRatioRow(quality, i2);
        return qualityRatioRow != null ? new ArrayList(qualityRatioRow) : new ArrayList(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QualityRatioToResolutionsTable {\n");
        for (Quality quality : sQualityRangeMap.keySet()) {
            sb.append("  ");
            sb.append(((Quality.ConstantQuality) quality).getName());
            sb.append(":\n");
            ArrayList arrayList = new ArrayList();
            arrayList.add(-1);
            arrayList.addAll(sAspectRatioMap.keySet());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iIntValue = ((Integer) arrayList.get(i2)).intValue();
                Object qualityRatioRow = getQualityRatioRow(quality, iIntValue);
                String ratioLabel = getRatioLabel(iIntValue);
                sb.append("    ");
                sb.append(ratioLabel);
                sb.append(" -> ");
                if (qualityRatioRow == null) {
                    qualityRatioRow = "null";
                }
                sb.append(qualityRatioRow);
                sb.append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

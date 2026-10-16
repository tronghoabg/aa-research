package androidx.camera.video;

import android.util.Size;
import com.waze.strings.DisplayStrings;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class Quality {
    static final Set<Quality> ALL_QUALITIES;
    public static final Quality FHD;
    public static final Quality HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    public static final Quality QHD;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;
    public static final int QUALITY_SOURCE_HIGH_SPEED = 2;
    public static final int QUALITY_SOURCE_REGULAR = 1;
    public static final Quality SD;
    public static final Quality UHD;

    /* compiled from: WazeSource */
    public abstract class ConstantQuality extends Quality {
        public ConstantQuality() {
            super();
        }

        static ConstantQuality of(int i2, int i3, String str, List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i2, i3, str, list);
        }

        abstract int getHighSpeedValue();

        public abstract String getName();

        public int getQualityValue(int i2) {
            if (i2 == 1) {
                return getValue();
            }
            if (i2 == 2) {
                return getHighSpeedValue();
            }
            throw new AssertionError("Unknown quality source: " + i2);
        }

        public abstract List<Size> getTypicalSizes();

        abstract int getValue();
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface QualitySource {
    }

    static {
        ConstantQuality constantQualityOf = ConstantQuality.of(4, 2002, "SD", DesugarCollections.unmodifiableList(Arrays.asList(new Size(DisplayStrings.DS_KM_PD, 480), new Size(640, 480))));
        SD = constantQualityOf;
        ConstantQuality constantQualityOf2 = ConstantQuality.of(5, 2003, "HD", Collections.singletonList(new Size(DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, DisplayStrings.DS_KM_PD)));
        HD = constantQualityOf2;
        ConstantQuality constantQualityOf3 = ConstantQuality.of(6, 2004, "FHD", Collections.singletonList(new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT)));
        FHD = constantQualityOf3;
        ConstantQuality constantQualityOf4 = ConstantQuality.of(8, 2005, "UHD", Collections.singletonList(new Size(DisplayStrings.DS_COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_RIGHT)));
        UHD = constantQualityOf4;
        ConstantQuality constantQualityOf5 = ConstantQuality.of(11, -1, "QHD", Collections.singletonList(new Size(DisplayStrings.DS_CARPLAY_ENABLE_MIC_PERMISSION_OK, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT)));
        QHD = constantQualityOf5;
        ConstantQuality constantQualityOf6 = ConstantQuality.of(0, 2000, "LOWEST", Collections.EMPTY_LIST);
        LOWEST = constantQualityOf6;
        ConstantQuality constantQualityOf7 = ConstantQuality.of(1, 2001, "HIGHEST", Collections.EMPTY_LIST);
        HIGHEST = constantQualityOf7;
        NONE = ConstantQuality.of(-1, -1, "NONE", Collections.EMPTY_LIST);
        List<Quality> listAsList = Arrays.asList(constantQualityOf4, constantQualityOf5, constantQualityOf3, constantQualityOf2, constantQualityOf);
        QUALITIES_ORDER_BY_SIZE = listAsList;
        HashSet hashSet = new HashSet(listAsList);
        hashSet.add(constantQualityOf6);
        hashSet.add(constantQualityOf7);
        ALL_QUALITIES = DesugarCollections.unmodifiableSet(hashSet);
    }

    private Quality() {
    }

    public static Quality castOrNull(int i2) {
        for (Quality quality : ALL_QUALITIES) {
            ConstantQuality constantQuality = (ConstantQuality) quality;
            if (constantQuality.getValue() == i2 || constantQuality.getHighSpeedValue() == i2) {
                return quality;
            }
        }
        return null;
    }

    static boolean containsQuality(Quality quality) {
        return ALL_QUALITIES.contains(quality);
    }

    public static List<Quality> getSortedQualities() {
        return new ArrayList(QUALITIES_ORDER_BY_SIZE);
    }
}

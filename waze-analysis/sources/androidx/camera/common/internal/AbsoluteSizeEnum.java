package androidx.camera.common.internal;

import android.util.Size;
import com.waze.strings.DisplayStrings;
import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AbsoluteSizeEnum {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AbsoluteSizeEnum[] $VALUES;
    private final Size size;
    public static final AbsoluteSizeEnum VGA = new AbsoluteSizeEnum("VGA", 0, new Size(640, 480));
    public static final AbsoluteSizeEnum XGA = new AbsoluteSizeEnum("XGA", 1, new Size(1024, 768));
    public static final AbsoluteSizeEnum S720P_16_9 = new AbsoluteSizeEnum("S720P_16_9", 2, new Size(DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, DisplayStrings.DS_KM_PD));
    public static final AbsoluteSizeEnum S1080P_4_3 = new AbsoluteSizeEnum("S1080P_4_3", 3, new Size(DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
    public static final AbsoluteSizeEnum S1080P_16_9 = new AbsoluteSizeEnum("S1080P_16_9", 4, new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
    public static final AbsoluteSizeEnum S1440P_4_3 = new AbsoluteSizeEnum("S1440P_4_3", 5, new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT));
    public static final AbsoluteSizeEnum S1440P_16_9 = new AbsoluteSizeEnum("S1440P_16_9", 6, new Size(DisplayStrings.DS_CARPLAY_ENABLE_MIC_PERMISSION_OK, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT));
    public static final AbsoluteSizeEnum UHD = new AbsoluteSizeEnum("UHD", 7, new Size(DisplayStrings.DS_COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_RIGHT));

    private static final /* synthetic */ AbsoluteSizeEnum[] $values() {
        return new AbsoluteSizeEnum[]{VGA, XGA, S720P_16_9, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD};
    }

    static {
        AbsoluteSizeEnum[] absoluteSizeEnumArr$values = $values();
        $VALUES = absoluteSizeEnumArr$values;
        $ENTRIES = b.a(absoluteSizeEnumArr$values);
    }

    private AbsoluteSizeEnum(String str, int i2, Size size) {
        this.size = size;
    }

    public static a<AbsoluteSizeEnum> getEntries() {
        return $ENTRIES;
    }

    public static AbsoluteSizeEnum valueOf(String str) {
        return (AbsoluteSizeEnum) Enum.valueOf(AbsoluteSizeEnum.class, str);
    }

    public static AbsoluteSizeEnum[] values() {
        return (AbsoluteSizeEnum[]) $VALUES.clone();
    }

    public final Size getSize() {
        return this.size;
    }
}

package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import com.waze.strings.DisplayStrings;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SmallDisplaySizeQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Size> MODEL_TO_DISPLAY_SIZE_MAP = r.k(new k("REDMI NOTE 8", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_ROUTE_POPUP_CRITAIR_MISSING_YES)), new k("REDMI NOTE 7", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_ROUTE_POPUP_CRITAIR_MISSING_YES)), new k("SM-A207M", new Size(DisplayStrings.DS_KM_PD, DisplayStrings.DS_MAP_POPUP_PARKED_MENU_REMOVE)), new k("REDMI NOTE 7S", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_ROUTE_POPUP_CRITAIR_MISSING_YES)), new k("SM-A127F", new Size(DisplayStrings.DS_KM_PD, 1600)), new k("SM-A536E", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_TITLE)), new k("220233L2I", new Size(DisplayStrings.DS_KM_PD, 1600)), new k("V2149", new Size(DisplayStrings.DS_KM_PD, 1600)), new k("VIVO 1920", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_ROUTE_POPUP_CRITAIR_MISSING_YES)), new k("CPH2223", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_TITLE)), new k("V2029", new Size(DisplayStrings.DS_KM_PD, 1600)), new k("CPH1901", new Size(DisplayStrings.DS_KM_PD, DisplayStrings.DS_TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TITLE)), new k("REDMI Y3", new Size(DisplayStrings.DS_KM_PD, DisplayStrings.DS_TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TITLE)), new k("SM-A045M", new Size(DisplayStrings.DS_KM_PD, 1600)), new k("SM-A146U", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_BUTTON_DONT_ALLOW)), new k("CPH1909", new Size(DisplayStrings.DS_KM_PD, DisplayStrings.DS_TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TITLE)), new k("NOKIA 4.2", new Size(DisplayStrings.DS_KM_PD, DisplayStrings.DS_TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TITLE)), new k("SM-G960U1", new Size(DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT, DisplayStrings.DS_DETOUR_LABEL_SIMILAR_ETA)), new k("SM-A137F", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_BUTTON_DONT_ALLOW)), new k("VIVO 1816", new Size(DisplayStrings.DS_KM_PD, DisplayStrings.DS_TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TITLE)), new k("INFINIX X6817", new Size(DisplayStrings.DS_KM_PD, DisplayStrings.DS_DANGEROUS_ADDRESS_GO1)), new k("SM-A037F", new Size(DisplayStrings.DS_KM_PD, 1600)), new k("NOKIA 2.4", new Size(DisplayStrings.DS_KM_PD, 1600)), new k("SM-A125M", new Size(DisplayStrings.DS_KM_PD, 1600)), new k("INFINIX X670", new Size(DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT, DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_TITLE)));

    public final Size getDisplaySize() {
        Map<String, Size> map = MODEL_TO_DISPLAY_SIZE_MAP;
        String str = Build.MODEL;
        x.e(str, "MODEL");
        String upperCase = str.toUpperCase(Locale.ROOT);
        x.e(upperCase, "toUpperCase(...)");
        Size size = map.get(upperCase);
        x.c(size);
        return size;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean load() {
            Map map = SmallDisplaySizeQuirk.MODEL_TO_DISPLAY_SIZE_MAP;
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String upperCase = str.toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            return map.containsKey(upperCase);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

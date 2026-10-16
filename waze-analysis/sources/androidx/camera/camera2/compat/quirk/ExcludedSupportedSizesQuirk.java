package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExcludedSupportedSizesQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ExcludedSupportedSizesQuirk";
    private static final int UNKNOWN_IMAGE_FORMAT = -1;

    private final List<Size> getHuaweiP20LiteExcludedSizes(String str, int i2, Class<?> cls) {
        return (x.n(str, "0") && (i2 == 34 || i2 == 35 || cls != null)) ? i.i(new Size(DisplayStrings.DS_KM_PD, DisplayStrings.DS_KM_PD), new Size(DisplayStrings.DS_NIGHT, DisplayStrings.DS_NIGHT)) : i.h();
    }

    private final List<Size> getNokia7PlusExcludedSizes(int i2) {
        return i2 == 35 ? i.i(new Size(4032, DisplayStrings.DS_AAOS_SEARCH_ND4C_CLOSE_BUTTON), new Size(4000, 3000), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, 2448), new Size(DisplayStrings.DS_AAOS_ROUTING_ALERT_BLUETOOTH_PERMISSION_CHECK_PHONE_TITLE, DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_TITLE), new Size(DisplayStrings.DS_AAOS_SEARCH_ND4C_CLOSE_BUTTON, DisplayStrings.DS_AAOS_SEARCH_ND4C_CLOSE_BUTTON), new Size(DisplayStrings.DS_AADC_REQUEST_USER_AGE_OK, DisplayStrings.DS_AADC_REQUEST_USER_AGE_OK), new Size(2448, 2448)) : i.h();
    }

    private final List<Size> getOnePlus6ExcludedSizes(String str, int i2) {
        return (x.n(str, "0") && i2 == 256) ? i.i(new Size(4160, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE), new Size(4000, 3000)) : i.h();
    }

    private final List<Size> getOnePlus6TExcludedSizes(String str, int i2) {
        return (x.n(str, "0") && i2 == 256) ? i.i(new Size(4160, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE), new Size(4000, 3000)) : i.h();
    }

    private final List<Size> getRedmiNote9ProExcludedSizes(String str, int i2) {
        return (x.n(str, "0") && i2 == 256) ? i.d(new Size(9280, 6944)) : i.h();
    }

    private final List<Size> getSamsungA05sExcludedSizes(int i2) {
        return i2 == 35 ? i.i(new Size(DisplayStrings.DS_COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_RIGHT), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, 2448), new Size(DisplayStrings.DS_AAOS_ROUTING_ALERT_BLUETOOTH_PERMISSION_CHECK_PHONE_TITLE, DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_TITLE), new Size(DisplayStrings.DS_GOOGLE_ASSISTANT_SEARCH_TOOLTIP_SUBTITLE_DEFAULT, DisplayStrings.DS_NEARING_PARKING_NO_GPS_TEXT), new Size(DisplayStrings.DS_RECEIVE_SHARE_DRIVE_CLOSE, DisplayStrings.DS_CUSTOM_PROMPTS_CATEGORY_SPECIAL), new Size(DisplayStrings.DS_RECEIVE_SHARE_DRIVE_CLOSE, DisplayStrings.DS_CUSTOM_PROMPT_START_9), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT)) : i.h();
    }

    private final List<Size> getSamsungJ7Api27AboveExcludedSizes(String str, int i2, Class<?> cls) {
        if (x.n(str, "0")) {
            if (i2 == 34 || cls != null) {
                return i.i(new Size(4128, DisplayStrings.DS_AAOS_ABOUT_SETTINGS_TERMS_OF_USE_BUTTON), new Size(4128, 2322), new Size(DisplayStrings.DS_AAOS_TERMS_SETTINGS_TITLE, DisplayStrings.DS_AAOS_TERMS_SETTINGS_TITLE), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, 2448), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, DisplayStrings.DS_STOP_POINT_QUESTION_REPLACE_LABEL), new Size(2048, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE), new Size(2048, DisplayStrings.DS_PHOTOS), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
            }
            if (i2 == 35) {
                return i.i(new Size(2048, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE), new Size(2048, DisplayStrings.DS_PHOTOS), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
            }
        } else if (x.n(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && (i2 == 34 || i2 == 35 || cls != null)) {
            return i.i(new Size(DisplayStrings.DS_CARPLAY_STOP, DisplayStrings.DS_CUSTOM_PROMPT_START_1), new Size(DisplayStrings.DS_CARPLAY_ENABLE_MIC_PERMISSION_OK, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE), new Size(2048, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE), new Size(2048, DisplayStrings.DS_PHOTOS), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
        }
        return i.h();
    }

    private final List<Size> getSamsungJ7PrimeApi27AboveExcludedSizes(String str, int i2, Class<?> cls) {
        if (x.n(str, "0")) {
            if (i2 == 34 || cls != null) {
                return i.i(new Size(4128, DisplayStrings.DS_AAOS_ABOUT_SETTINGS_TERMS_OF_USE_BUTTON), new Size(4128, 2322), new Size(DisplayStrings.DS_AAOS_TERMS_SETTINGS_TITLE, DisplayStrings.DS_AAOS_TERMS_SETTINGS_TITLE), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, 2448), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, DisplayStrings.DS_STOP_POINT_QUESTION_REPLACE_LABEL), new Size(2048, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE), new Size(2048, DisplayStrings.DS_PHOTOS), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
            }
            if (i2 == 35) {
                return i.i(new Size(4128, 2322), new Size(DisplayStrings.DS_AAOS_TERMS_SETTINGS_TITLE, DisplayStrings.DS_AAOS_TERMS_SETTINGS_TITLE), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, 2448), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, DisplayStrings.DS_STOP_POINT_QUESTION_REPLACE_LABEL), new Size(2048, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE), new Size(2048, DisplayStrings.DS_PHOTOS), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
            }
        } else if (x.n(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && (i2 == 34 || i2 == 35 || cls != null)) {
            return i.i(new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, 2448), new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, DisplayStrings.DS_STOP_POINT_QUESTION_REPLACE_LABEL), new Size(2448, 2448), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE), new Size(2048, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE), new Size(2048, DisplayStrings.DS_PHOTOS), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
        }
        return i.h();
    }

    private final List<Size> getSamsungZFold4ExcludedSizes(String str, int i2) {
        return (x.n(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && i2 == 35) ? i.i(new Size(DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, DisplayStrings.DS_KM_PD), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT), new Size(2304, DisplayStrings.DS_LOCATION_PREVIEW_HOME_SET_BUTTON), new Size(640, DisplayStrings.DS_ONE_DAY_AGO), new Size(177, 144), new Size(DisplayStrings.DS_ROUTE_POPUP_LICENCE_PLATE_WRONG_YES, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT), new Size(DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_TITLE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT), new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_USER_NAME), new Size(DisplayStrings.DS_DAYS_TO, DisplayStrings.DS_DAYS_TO), new Size(DisplayStrings.DS_NOTIFICATIONS_ON_ROUTE_DANGER_ZONES1, DisplayStrings.DS_NOTIFICATIONS_ON_ROUTE_DANGER_ZONES1), new Size(2736, 2736), new Size(DisplayStrings.DS_SOUND_OUTPUT_TITLE, DisplayStrings.DS_LOGIN_FAILED)) : i.h();
    }

    public final List<Size> getExcludedSizes(String str, int i2) {
        x.f(str, "cameraId");
        Companion companion = Companion;
        if (companion.isOnePlus6$camera_camera2()) {
            return getOnePlus6ExcludedSizes(str, i2);
        }
        if (companion.isOnePlus6T$camera_camera2()) {
            return getOnePlus6TExcludedSizes(str, i2);
        }
        if (companion.isHuaweiP20Lite$camera_camera2()) {
            return getHuaweiP20LiteExcludedSizes(str, i2, null);
        }
        if (companion.isSamsungJ7PrimeApi27Above$camera_camera2()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, i2, null);
        }
        if (companion.isSamsungJ7Api27Above$camera_camera2()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, i2, null);
        }
        if (companion.isRedmiNote9Pro$camera_camera2()) {
            return getRedmiNote9ProExcludedSizes(str, i2);
        }
        if (companion.isSamsungA05s$camera_camera2()) {
            return getSamsungA05sExcludedSizes(i2);
        }
        if (companion.isNokia7Plus$camera_camera2()) {
            return getNokia7PlusExcludedSizes(i2);
        }
        if (companion.isSamsungZFold4$camera_camera2()) {
            return getSamsungZFold4ExcludedSizes(str, i2);
        }
        Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return i.h();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return isOnePlus6$camera_camera2() || isOnePlus6T$camera_camera2() || isHuaweiP20Lite$camera_camera2() || isSamsungJ7PrimeApi27Above$camera_camera2() || isSamsungJ7Api27Above$camera_camera2() || isRedmiNote9Pro$camera_camera2() || isSamsungA05s$camera_camera2() || isNokia7Plus$camera_camera2() || isSamsungZFold4$camera_camera2();
        }

        public final boolean isHuaweiP20Lite$camera_camera2() {
            return Device.INSTANCE.isHuaweiDevice() && o.m("HWANE", Build.DEVICE, true);
        }

        public final boolean isNokia7Plus$camera_camera2() {
            if (Device.INSTANCE.isNokiaDevice()) {
                return o.m("B2N", Build.DEVICE, true) || o.m("B2N_sprout", Build.DEVICE, true);
            }
            return false;
        }

        public final boolean isOnePlus6$camera_camera2() {
            return Device.INSTANCE.isOnePlusDevice() && o.m("OnePlus6", Build.DEVICE, true);
        }

        public final boolean isOnePlus6T$camera_camera2() {
            return Device.INSTANCE.isOnePlusDevice() && o.m("OnePlus6T", Build.DEVICE, true);
        }

        public final boolean isRedmiNote9Pro$camera_camera2() {
            return Device.INSTANCE.isRedmiDevice() && o.m("joyeuse", Build.DEVICE, true);
        }

        public final boolean isSamsungA05s$camera_camera2() {
            if (!Device.INSTANCE.isSamsungDevice() || !o.m("a05s", Build.DEVICE, true)) {
                return false;
            }
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String upperCase = str.toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            return o.F(upperCase, "SM-A057", false);
        }

        public final boolean isSamsungJ7Api27Above$camera_camera2() {
            return Device.INSTANCE.isSamsungDevice() && o.m("J7XELTE", Build.DEVICE, true);
        }

        public final boolean isSamsungJ7PrimeApi27Above$camera_camera2() {
            return Device.INSTANCE.isSamsungDevice() && o.m("ON7XELTE", Build.DEVICE, true);
        }

        public final boolean isSamsungZFold4$camera_camera2() {
            if (Device.INSTANCE.isSamsungDevice()) {
                return o.m("q4q", Build.DEVICE, true) || o.m("SCG16", Build.DEVICE, true) || o.m("SC-55C", Build.DEVICE, true);
            }
            return false;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public final List<Size> getExcludedSizes(String str, Class<?> cls) {
        x.f(str, "cameraId");
        x.f(cls, "klass");
        Companion companion = Companion;
        if (companion.isHuaweiP20Lite$camera_camera2()) {
            return getHuaweiP20LiteExcludedSizes(str, -1, cls);
        }
        if (companion.isSamsungJ7PrimeApi27Above$camera_camera2()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, -1, cls);
        }
        if (companion.isSamsungJ7Api27Above$camera_camera2()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, -1, cls);
        }
        Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return i.h();
    }
}

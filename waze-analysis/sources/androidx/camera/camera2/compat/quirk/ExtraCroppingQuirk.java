package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceConfig;
import com.waze.strings.DisplayStrings;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExtraCroppingQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Range<Integer>> SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurfaceConfig.ConfigType.values().length];
            try {
                iArr[SurfaceConfig.ConfigType.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurfaceConfig.ConfigType.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurfaceConfig.ConfigType.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Integer num = (Comparable) 21;
        Integer num2 = (Comparable) 26;
        SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP = r.m(new k("SM-T580", null), new k("SM-J710MN", new Range(num, num2)), new k("SM-A320FL", null), new k("SM-G570M", null), new k("SM-G610F", null), new k("SM-G610M", new Range(num, num2)));
    }

    public final Size getVerifiedResolution(SurfaceConfig.ConfigType configType) {
        x.f(configType, "configType");
        if (!Companion.isSamsungDistortion$camera_camera2()) {
            return null;
        }
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        int iOrdinal = configType.ordinal();
        if (iOrdinal == 0) {
            return new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT);
        }
        if (iOrdinal == 1) {
            return new Size(DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, DisplayStrings.DS_KM_PD);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new Size(DisplayStrings.DS_DESTINATION_MENU_ADD_SHORTCUT, DisplayStrings.DS_STOP_POINT_QUESTION_REPLACE_LABEL);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return isSamsungDistortion$camera_camera2();
        }

        public final boolean isSamsungDistortion$camera_camera2() {
            if (!Device.INSTANCE.isSamsungDevice()) {
                return false;
            }
            Map map = ExtraCroppingQuirk.SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP;
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String upperCase = str.toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            if (!map.containsKey(upperCase)) {
                return false;
            }
            Map map2 = ExtraCroppingQuirk.SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP;
            String str2 = Build.MODEL;
            x.e(str2, "MODEL");
            String upperCase2 = str2.toUpperCase(Locale.ROOT);
            x.e(upperCase2, "toUpperCase(...)");
            Range range = (Range) map2.get(upperCase2);
            if (range != null) {
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return true;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

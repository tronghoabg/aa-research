package androidx.camera.core.internal.utils;

import android.util.Size;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import com.waze.strings.DisplayStrings;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SizeUtil {
    public static final Size RESOLUTION_ZERO = new Size(0, 0);
    public static final Size RESOLUTION_QVGA = new Size(DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT, 240);
    public static final Size RESOLUTION_VGA = new Size(640, 480);
    public static final Size RESOLUTION_480P = new Size(DisplayStrings.DS_KM_PD, 480);
    public static final Size RESOLUTION_720P = new Size(DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, DisplayStrings.DS_KM_PD);
    public static final Size RESOLUTION_1080P = new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT);
    public static final Size RESOLUTION_1440P = new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT);
    public static final Size RESOLUTION_1440P_16_9 = new Size(DisplayStrings.DS_CARPLAY_ENABLE_MIC_PERMISSION_OK, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT);
    public static final Size RESOLUTION_UHD = new Size(DisplayStrings.DS_COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_RIGHT);

    private SizeUtil() {
    }

    public static <T> T findNearestHigherFor(Size size, TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            return entryCeilingEntry.getValue();
        }
        Map.Entry<Size, T> entryFloorEntry = treeMap.floorEntry(size);
        if (entryFloorEntry != null) {
            return entryFloorEntry.getValue();
        }
        return null;
    }

    public static int getArea(Size size) {
        return getArea(size.getWidth(), size.getHeight());
    }

    public static Size getMaxSize(List<Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Size) Collections.max(list, new CompareSizesByArea());
    }

    public static boolean isLongerInAnyEdge(Size size, Size size2) {
        return size.getWidth() > size2.getWidth() || size.getHeight() > size2.getHeight();
    }

    public static boolean isSmallerByArea(Size size, Size size2) {
        return getArea(size) < getArea(size2);
    }

    public static int getArea(int i2, int i3) {
        return i2 * i3;
    }
}

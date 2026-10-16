package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class StretchedVideoResolutionQuirk implements Quirk {
    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean load() {
        return isMotoE5Play();
    }

    public Size getAlternativeResolution(int i2) {
        if (i2 == 4) {
            return new Size(640, 480);
        }
        if (i2 == 5) {
            return new Size(960, DisplayStrings.DS_KM_PD);
        }
        if (i2 != 6) {
            return null;
        }
        return new Size(DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT);
    }
}

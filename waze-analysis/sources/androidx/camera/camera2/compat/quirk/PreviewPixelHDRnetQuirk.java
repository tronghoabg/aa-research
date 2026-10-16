package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreviewPixelHDRnetQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> SUPPORTED_DEVICES = i.i("sunfish", "bramble", "redfin", "barbet");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            if (!Device.INSTANCE.isGoogleDevice()) {
                return false;
            }
            List list = PreviewPixelHDRnetQuirk.SUPPORTED_DEVICES;
            String str = Build.DEVICE;
            x.e(str, "DEVICE");
            Locale locale = Locale.getDefault();
            x.e(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            x.e(lowerCase, "toLowerCase(...)");
            return list.contains(lowerCase);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

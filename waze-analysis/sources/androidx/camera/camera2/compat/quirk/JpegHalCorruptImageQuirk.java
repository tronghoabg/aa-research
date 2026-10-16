package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class JpegHalCorruptImageQuirk implements SoftwareJpegEncodingPreferredQuirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> KNOWN_AFFECTED_DEVICES = i.i("heroqltevzw", "heroqltetmo", "k61v1_basic_ref");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            List list = JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES;
            String str = Build.DEVICE;
            x.e(str, "DEVICE");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            return list.contains(lowerCase);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

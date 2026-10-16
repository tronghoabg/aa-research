package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoInterlacingQuirk implements SurfaceProcessingQuirk {
    public static final VideoInterlacingQuirk INSTANCE = new VideoInterlacingQuirk();

    private VideoInterlacingQuirk() {
    }

    private final List<String> getDEVICE_MODELS() {
        return i.d("SM-N9208");
    }

    private final boolean isSamsungS6() {
        if (!o.m(Build.BRAND, "Samsung", true)) {
            return false;
        }
        String str = Build.PRODUCT;
        x.e(str, "PRODUCT");
        return o.o(str, "zeroflte", true);
    }

    public static final boolean load() {
        VideoInterlacingQuirk videoInterlacingQuirk = INSTANCE;
        List<String> device_models = videoInterlacingQuirk.getDEVICE_MODELS();
        String str = Build.MODEL;
        x.e(str, "MODEL");
        Locale locale = Locale.getDefault();
        x.e(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        x.e(upperCase, "toUpperCase(...)");
        return device_models.contains(upperCase) || videoInterlacingQuirk.isSamsungS6();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public /* synthetic */ boolean workaroundBySurfaceProcessing() {
        return true;
    }
}

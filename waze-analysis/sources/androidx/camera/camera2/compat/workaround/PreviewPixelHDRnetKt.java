package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.impl.SessionConfig;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreviewPixelHDRnetKt {
    private static final Rational ASPECT_RATIO_16_9 = new Rational(16, 9);

    private static final boolean isAspectRatioMatch(Size size, Rational rational) {
        return x.n(rational, new Rational(size.getWidth(), size.getHeight()));
    }

    public static final void setupHDRnet(SessionConfig.Builder builder, Size size) {
        x.f(builder, "<this>");
        x.f(size, "resolution");
        if (((PreviewPixelHDRnetQuirk) DeviceQuirks.INSTANCE.get(PreviewPixelHDRnetQuirk.class)) == null || isAspectRatioMatch(size, ASPECT_RATIO_16_9)) {
            return;
        }
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
        x.e(key, "TONEMAP_MODE");
        builder2.setCaptureRequestOption(key, 2);
        builder.addImplementationOptions(builder2.build());
    }
}

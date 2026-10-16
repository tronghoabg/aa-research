package defpackage;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class vjr {
    public static final Interpolator a;

    static {
        new PathInterpolator(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
        new PathInterpolator(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        a = new PathInterpolator(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
    }
}

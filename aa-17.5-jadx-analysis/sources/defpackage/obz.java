package defpackage;

import android.view.animation.Interpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class obz {
    private static final Interpolator d = new oby(0);
    public float b;
    public float a = BitmapDescriptorFactory.HUE_RED;
    public final List c = new ArrayList();

    public obz(float f) {
        this.b = f;
    }

    public final obx a() {
        return new obx(this, d, this.b);
    }
}

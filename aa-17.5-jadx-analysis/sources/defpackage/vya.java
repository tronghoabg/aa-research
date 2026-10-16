package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Random;

/* loaded from: classes.dex */
public final class vya {
    private final float a;
    private final Random b;

    public vya(Random random, float f) {
        boolean z = false;
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        woy.O(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}

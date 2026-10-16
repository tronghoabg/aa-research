package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ajz extends EdgeEffect {
    public final float a;
    public float b;

    public ajz(Context context) {
        super(context);
        this.a = dlf.w(context).eA(1.0f);
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = BitmapDescriptorFactory.HUE_RED;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = BitmapDescriptorFactory.HUE_RED;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = BitmapDescriptorFactory.HUE_RED;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = BitmapDescriptorFactory.HUE_RED;
        super.onPull(f, f2);
    }
}

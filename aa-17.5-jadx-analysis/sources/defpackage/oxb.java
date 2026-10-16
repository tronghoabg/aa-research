package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class oxb extends Animation {
    public float a;

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        transformation.getMatrix().setTranslate(BitmapDescriptorFactory.HUE_RED, this.a);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oxy extends android.view.animation.Animation {
    public float a;

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        super.applyTransformation(f, transformation);
        transformation.getMatrix().setTranslate(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this.a);
    }
}

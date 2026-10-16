package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jif extends android.view.animation.AnimationSet {
    private final float[] a;

    public jif(android.view.animation.TranslateAnimation translateAnimation) {
        super(false);
        this.a = new float[9];
        addAnimation(translateAnimation);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, android.view.animation.Transformation transformation) {
        boolean transformation2 = super.getTransformation(j, transformation);
        android.graphics.Matrix matrix = transformation.getMatrix();
        float[] fArr = this.a;
        matrix.getValues(fArr);
        fArr[5] = -fArr[5];
        transformation.getMatrix().setValues(fArr);
        return transformation2;
    }
}

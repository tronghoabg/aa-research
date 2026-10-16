package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jhy extends defpackage.jia {
    final defpackage.jik a;
    private final float[] l;

    public jhy(defpackage.jik jikVar, float f) {
        super(k(jikVar.a) + ((long) jikVar.c), f);
        this.l = new float[9];
        this.a = jikVar;
    }

    private static long k(android.view.animation.Animation animation) {
        if (!(animation instanceof android.view.animation.AnimationSet)) {
            return animation.getDuration() + animation.getStartOffset();
        }
        java.util.Iterator<android.view.animation.Animation> it = ((android.view.animation.AnimationSet) animation).getAnimations().iterator();
        long jMax = 0;
        while (it.hasNext()) {
            jMax = java.lang.Math.max(jMax, k(it.next()));
        }
        return jMax;
    }

    @Override // defpackage.jia, defpackage.jhz
    public final int a() {
        android.view.animation.Animation animation = this.a.a;
        if (animation.getZAdjustment() == -1) {
            return -1;
        }
        return animation.getZAdjustment() == 1 ? 1 : 0;
    }

    @Override // defpackage.jia
    protected final defpackage.jib b(boolean z, long j) {
        defpackage.jik jikVar = this.a;
        long jRound = java.lang.Math.round(java.lang.Math.max(0L, j - ((long) jikVar.c)) / this.j);
        android.view.animation.Transformation transformation = new android.view.animation.Transformation();
        transformation.setTransformationType(3);
        jikVar.a.getTransformation(jRound, transformation);
        float alpha = transformation.getAlpha();
        defpackage.jib jibVar = this.k;
        jibVar.b = alpha;
        android.graphics.Matrix matrix = transformation.getMatrix();
        float[] fArr = this.l;
        matrix.getValues(fArr);
        float[] fArr2 = jibVar.a;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[3];
        fArr2[2] = 0.0f;
        fArr2[3] = fArr[6];
        fArr2[4] = fArr[1];
        fArr2[5] = fArr[4];
        fArr2[6] = 0.0f;
        fArr2[7] = fArr[7];
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = fArr[2];
        fArr2[13] = fArr[5];
        fArr2[14] = 0.0f;
        fArr2[15] = fArr[8];
        return jibVar;
    }

    @Override // defpackage.jia, defpackage.jhz
    public final boolean c() {
        int i = this.a.c;
        return i == 0 || j(android.os.SystemClock.elapsedRealtime(), (long) i);
    }

    @Override // defpackage.jia, defpackage.jhz
    public final boolean d() {
        return this.a.a();
    }
}

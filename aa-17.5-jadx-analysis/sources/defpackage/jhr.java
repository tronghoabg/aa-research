package defpackage;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jhr extends jht {
    final jid a;
    private final float[] l;

    public jhr(jid jidVar, float f) {
        super(k(jidVar.a) + jidVar.c, f);
        this.l = new float[9];
        this.a = jidVar;
    }

    private static long k(Animation animation) {
        if (!(animation instanceof AnimationSet)) {
            return animation.getDuration() + animation.getStartOffset();
        }
        Iterator<Animation> it = ((AnimationSet) animation).getAnimations().iterator();
        long jMax = 0;
        while (it.hasNext()) {
            jMax = Math.max(jMax, k(it.next()));
        }
        return jMax;
    }

    @Override // defpackage.jht, defpackage.jhs
    public final int a() {
        Animation animation = this.a.a;
        if (animation.getZAdjustment() == -1) {
            return -1;
        }
        return animation.getZAdjustment() == 1 ? 1 : 0;
    }

    @Override // defpackage.jht
    protected final jhu b(boolean z, long j) {
        jid jidVar = this.a;
        long jRound = Math.round(Math.max(0L, j - jidVar.c) / this.j);
        Transformation transformation = new Transformation();
        transformation.setTransformationType(3);
        jidVar.a.getTransformation(jRound, transformation);
        float alpha = transformation.getAlpha();
        jhu jhuVar = this.k;
        jhuVar.b = alpha;
        Matrix matrix = transformation.getMatrix();
        float[] fArr = this.l;
        matrix.getValues(fArr);
        float[] fArr2 = jhuVar.a;
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
        return jhuVar;
    }

    @Override // defpackage.jht, defpackage.jhs
    public final boolean c() {
        int i = this.a.c;
        return i == 0 || j(SystemClock.elapsedRealtime(), (long) i);
    }

    @Override // defpackage.jht, defpackage.jhs
    public final boolean d() {
        return this.a.a();
    }
}

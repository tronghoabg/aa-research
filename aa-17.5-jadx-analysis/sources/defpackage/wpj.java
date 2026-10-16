package defpackage;

import android.graphics.Matrix;

/* loaded from: classes3.dex */
final class wpj extends wkp {
    final /* synthetic */ wpl a;

    public wpj(wpl wplVar) {
        this.a = wplVar;
    }

    @Override // defpackage.wkp
    /* renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.a.y = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.wkp, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}

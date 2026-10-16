package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wqg extends defpackage.wlo {
    final /* synthetic */ defpackage.wqi a;

    public wqg(defpackage.wqi wqiVar) {
        this.a = wqiVar;
    }

    @Override // defpackage.wlo
    /* JADX INFO: renamed from: a */
    public final android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        this.a.y = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.wlo, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        return evaluate(f, (android.graphics.Matrix) obj, (android.graphics.Matrix) obj2);
    }
}

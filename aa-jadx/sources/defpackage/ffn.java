package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ffn implements android.animation.TypeEvaluator {
    private android.graphics.Rect a;

    public ffn(android.graphics.Rect rect) {
        this.a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Rect rect = (android.graphics.Rect) obj;
        android.graphics.Rect rect2 = (android.graphics.Rect) obj2;
        int i = rect.left + ((int) ((rect2.left - rect.left) * f));
        int i2 = rect.top + ((int) ((rect2.top - rect.top) * f));
        int i3 = rect.right + ((int) ((rect2.right - rect.right) * f));
        int i4 = rect.bottom + ((int) ((rect2.bottom - rect.bottom) * f));
        android.graphics.Rect rect3 = this.a;
        if (rect3 == null) {
            return new android.graphics.Rect(i, i2, i3, i4);
        }
        rect3.set(i, i2, i3, i4);
        return this.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class onh implements android.animation.TypeEvaluator {
    public static final defpackage.onh a = new defpackage.onh();
    private static final android.animation.ArgbEvaluator b = new android.animation.ArgbEvaluator();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ong ongVar = (defpackage.ong) obj;
        defpackage.ong ongVar2 = (defpackage.ong) obj2;
        ongVar.getClass();
        ongVar2.getClass();
        int i = ongVar.a;
        int i2 = ongVar2.a;
        android.animation.ArgbEvaluator argbEvaluator = b;
        java.lang.Object objEvaluate = argbEvaluator.evaluate(f, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        objEvaluate.getClass();
        int iIntValue = ((java.lang.Integer) objEvaluate).intValue();
        java.lang.Object objEvaluate2 = argbEvaluator.evaluate(f, java.lang.Integer.valueOf(ongVar.b), java.lang.Integer.valueOf(ongVar2.b));
        objEvaluate2.getClass();
        return new defpackage.ong(iIntValue, ((java.lang.Integer) objEvaluate2).intValue());
    }
}

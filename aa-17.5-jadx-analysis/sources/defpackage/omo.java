package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public final class omo implements TypeEvaluator {
    public static final omo a = new omo();
    private static final ArgbEvaluator b = new ArgbEvaluator();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        omn omnVar = (omn) obj;
        omn omnVar2 = (omn) obj2;
        omnVar.getClass();
        omnVar2.getClass();
        int i = omnVar.a;
        int i2 = omnVar2.a;
        ArgbEvaluator argbEvaluator = b;
        Object objEvaluate = argbEvaluator.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2));
        objEvaluate.getClass();
        int iIntValue = ((Integer) objEvaluate).intValue();
        Object objEvaluate2 = argbEvaluator.evaluate(f, Integer.valueOf(omnVar.b), Integer.valueOf(omnVar2.b));
        objEvaluate2.getClass();
        return new omn(iIntValue, ((Integer) objEvaluate2).intValue());
    }
}

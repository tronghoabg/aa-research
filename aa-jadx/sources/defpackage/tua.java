package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tua implements android.animation.TypeEvaluator {
    public static final defpackage.tua a = new defpackage.tua(3);
    private final /* synthetic */ int b;

    public tua(int i) {
        this.b = i;
    }

    public static final java.lang.Integer a(float f, java.lang.Integer num, java.lang.Integer num2) {
        int iIntValue = num.intValue();
        int i = iIntValue >> 24;
        int iIntValue2 = num2.intValue();
        int i2 = iIntValue2 >> 24;
        float fPow = (float) java.lang.Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) java.lang.Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) java.lang.Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) java.lang.Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) java.lang.Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) java.lang.Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float f2 = (i & 255) / 255.0f;
        return java.lang.Integer.valueOf((java.lang.Math.round((f2 + (f * (((i2 & 255) / 255.0f) - f2))) * 255.0f) << 24) | (java.lang.Math.round(((float) java.lang.Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (java.lang.Math.round(((float) java.lang.Math.pow(fPow2 + ((fPow5 - fPow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | java.lang.Math.round(((float) java.lang.Math.pow(fPow3 + ((fPow6 - fPow3) * f), 0.45454545454545453d)) * 255.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        int i = this.b;
        if (i == 0) {
            defpackage.tpm tpmVar = (defpackage.tpm) obj;
            defpackage.tpm tpmVar2 = (defpackage.tpm) obj2;
            if (f == 1.0f) {
                return tpmVar2;
            }
            defpackage.tpm tpmVar3 = new defpackage.tpm();
            defpackage.tpm.p(tpmVar, tpmVar2, f, tpmVar3);
            return tpmVar3;
        }
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return ((defpackage.tuk) obj).c((defpackage.tuk) obj2, f);
        }
        if (i != 3) {
            throw null;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int i2 = iIntValue >> 24;
        int i3 = iIntValue >> 16;
        int i4 = iIntValue >> 8;
        int i5 = iIntValue & 255;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        int i6 = i2 & 255;
        int i7 = i3 & 255;
        int i8 = i4 & 255;
        return java.lang.Integer.valueOf((i5 + ((int) (f * ((iIntValue2 & 255) - i5)))) | ((i6 + ((int) ((((iIntValue2 >> 24) & 255) - i6) * f))) << 24) | ((i7 + ((int) ((((iIntValue2 >> 16) & 255) - i7) * f))) << 16) | ((i8 + ((int) ((((iIntValue2 >> 8) & 255) - i8) * f))) << 8));
    }
}

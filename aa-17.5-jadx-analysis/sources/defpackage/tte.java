package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes3.dex */
public final class tte implements TypeEvaluator {
    public static final tte a = new tte(3);
    private final /* synthetic */ int b;

    public tte(int i) {
        this.b = i;
    }

    public static final Integer a(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue() >> 24;
        int iIntValue2 = num2.intValue() >> 24;
        float fPow = (float) Math.pow(((r12 >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((r12 >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((r12 & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((r13 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((r13 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((r13 & 255) / 255.0f, 2.2d);
        float f2 = (iIntValue & 255) / 255.0f;
        return Integer.valueOf((Math.round((f2 + (f * (((iIntValue2 & 255) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(fPow2 + ((fPow5 - fPow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow3 + ((fPow6 - fPow3) * f), 0.45454545454545453d)) * 255.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            too tooVar = (too) obj;
            too tooVar2 = (too) obj2;
            if (f == 1.0f) {
                return tooVar2;
            }
            too tooVar3 = new too();
            too.p(tooVar, tooVar2, f, tooVar3);
            return tooVar3;
        }
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return ((tto) obj).c((tto) obj2, f);
        }
        if (i != 3) {
            throw null;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = iIntValue >> 24;
        int i3 = iIntValue >> 16;
        int i4 = iIntValue >> 8;
        int i5 = iIntValue & 255;
        int iIntValue2 = ((Integer) obj2).intValue();
        return Integer.valueOf((i5 + ((int) (f * ((iIntValue2 & 255) - i5)))) | (((i2 & 255) + ((int) ((((iIntValue2 >> 24) & 255) - r7) * f))) << 24) | (((i3 & 255) + ((int) ((((iIntValue2 >> 16) & 255) - r0) * f))) << 16) | (((i4 & 255) + ((int) ((((iIntValue2 >> 8) & 255) - r1) * f))) << 8));
    }
}

package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ArgbEvaluator implements TypeEvaluator<Object> {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f2, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue() >> 24;
        int iIntValue2 = ((Integer) obj2).intValue() >> 24;
        float fPow = (float) Math.pow(((r10 >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((r10 >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((r10 & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((r13 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((r13 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((r13 & 255) / 255.0f, 2.2d);
        float fPow7 = (float) Math.pow(fPow + ((fPow4 - fPow) * f2), 0.45454545454545453d);
        float fPow8 = (float) Math.pow(fPow2 + ((fPow5 - fPow2) * f2), 0.45454545454545453d);
        float f3 = (iIntValue & 255) / 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fPow3 + ((fPow6 - fPow3) * f2), 0.45454545454545453d)) * 255.0f) | (Math.round((f3 + (f2 * (((iIntValue2 & 255) / 255.0f) - f3))) * 255.0f) << 24) | (Math.round(fPow7 * 255.0f) << 16) | (Math.round(fPow8 * 255.0f) << 8));
    }
}

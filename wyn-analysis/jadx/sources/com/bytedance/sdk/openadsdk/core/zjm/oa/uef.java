package com.bytedance.sdk.openadsdk.core.zjm.oa;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class uef {
    public static float oa(Context context) {
        return af.yo(context, af.cq(context));
    }

    public static Pair<Float, Float> uef(Window window, int i5) {
        View decorView = window.getDecorView();
        float[] fArrUef = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrUef[0] = af.yo(window.getContext(), fArrUef[0]);
        float fYo = af.yo(window.getContext(), fArrUef[1]);
        fArrUef[1] = fYo;
        if (fArrUef[0] < 10.0f || fYo < 10.0f) {
            fArrUef = uef(window.getContext(), af.yo(window.getContext(), af.uef()), i5);
        }
        float fMax = Math.max(fArrUef[0], fArrUef[1]);
        float fMin = Math.min(fArrUef[0], fArrUef[1]);
        if (i5 == 1) {
            fArrUef[0] = fMin;
            fArrUef[1] = fMax;
        } else {
            fArrUef[0] = fMax;
            fArrUef[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrUef[0]), Float.valueOf(fArrUef[1]));
    }

    private static float[] uef(Context context, int i5, int i10) {
        float fUef = uef(context);
        float fOa = oa(context);
        if ((i10 == 1) != (fUef > fOa)) {
            float f10 = fUef + fOa;
            fOa = f10 - fOa;
            fUef = f10 - fOa;
        }
        if (i10 == 1) {
            fUef -= i5;
        } else {
            fOa -= i5;
        }
        return new float[]{fOa, fUef};
    }

    public static float uef(Context context) {
        return af.yo(context, af.wrv(context));
    }
}

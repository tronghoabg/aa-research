package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import com.google.android.gms.common.api.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class dj {
    private static final Map<String, Pair<? extends Drawable, Integer>> uef = new HashMap();

    /* renamed from: oa, reason: collision with root package name */
    private static Integer f26145oa = null;

    public static Drawable uef(Context context, String str) {
        return uef(context, str, true);
    }

    public static Drawable uef(Context context, String str, boolean z2) {
        Pair<? extends Drawable, Integer> pair;
        f26145oa = Integer.valueOf(com.bytedance.sdk.openadsdk.core.sy.moa().wrv());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = uef;
        map.size();
        if (!map.containsKey(str) || (pair = map.get(str)) == null) {
            uef();
            return uef(str, context, z2);
        }
        Drawable drawable = (Drawable) pair.first;
        map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
        return drawable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.drawable.Drawable uef(java.lang.String r28, android.content.Context r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 3774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.dj.uef(java.lang.String, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    private static void uef() {
        Map<String, Pair<? extends Drawable, Integer>> map = uef;
        if (map.size() < f26145oa.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = f.API_PRIORITY_OTHER;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        uef.remove(key);
    }

    private static GradientDrawable uef(int i5, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i5);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i10, i10, i11, i11, i12, i12, i13, i13});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable uef(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable uef(Context context, int i5) {
        return uef(context, Color.parseColor("#1A73E8"), i5);
    }

    public static Drawable uef(Context context, int i5, int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i5);
        gradientDrawable.setCornerRadius(af.oa(context, i10));
        return gradientDrawable;
    }
}

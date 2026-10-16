package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dj;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class yo {
    private int ivm;
    private int lw;
    private int moa;
    Paint uef;

    /* renamed from: oa, reason: collision with root package name */
    Path f24808oa = new Path();
    Path yo = new Path();

    public yo() {
        Paint paint = new Paint();
        this.uef = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(android.graphics.Canvas r21, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.view.yo.uef(android.graphics.Canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, android.view.View):void");
    }

    public void uef(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.ivm * f10);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof dj) {
            int i5 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i5 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i5).setTranslationX((-(this.ivm - layoutParams.width)) / 2);
                i5++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void uef(View view, int i5, int i10) {
        String str;
        this.moa = i5 / 2;
        this.lw = i10 / 2;
        if (this.ivm == 0 && view.getLayoutParams().width > 0) {
            this.ivm = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.yo.addRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5, i10), i10 / 2, i10 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.moa * 2);
            view.setPivotY(this.lw);
        } else if ("left".equals(str)) {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(this.lw);
        } else {
            view.setPivotX(this.moa);
            view.setPivotY(this.lw);
        }
    }
}

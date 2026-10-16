package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.uef;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class zjm {
    private int ivm;
    private int lw;
    private View moa;

    /* renamed from: oa, reason: collision with root package name */
    private uef f24696oa;
    Paint uef;
    private String xs;
    private AnimatorSet yo = new AnimatorSet();

    public zjm(View view, uef uefVar) {
        this.moa = view;
        this.f24696oa = uefVar;
        Paint paint = new Paint();
        this.uef = paint;
        paint.setAntiAlias(true);
    }

    public void oa() {
        AnimatorSet animatorSet = this.yo;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void uef() {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        List<uef.C0038uef> listYo = this.f24696oa.yo();
        if (listYo == null || listYo.size() <= 0) {
            return;
        }
        for (uef.C0038uef c0038uef : listYo) {
            if (c0038uef != null) {
                objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0038uef.uef());
                if (TextUtils.equals(c0038uef.lw(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0038uef.lw(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0038uef.lw());
                }
                objectAnimator.setStartDelay(c0038uef.moa());
                objectAnimator.setTarget(this.moa);
                if (TextUtils.equals(c0038uef.lw(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0038uef.ivm(), (int) c0038uef.xs());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0038uef.ivm() + "; to=" + c0038uef.xs());
                } else {
                    objectAnimator.setFloatValues(c0038uef.ivm(), c0038uef.xs());
                }
                int iOa = (int) this.f24696oa.oa();
                if (iOa != 0) {
                    objectAnimator.setRepeatCount(iOa);
                } else {
                    objectAnimator.setRepeatCount((int) c0038uef.oa());
                }
                if (TextUtils.equals(c0038uef.lw(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strIvm = this.f24696oa.ivm();
                if (TextUtils.isEmpty(strIvm)) {
                    strIvm = c0038uef.yo();
                }
                if (TextUtils.equals(strIvm, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0038uef.bcc() != null && c0038uef.bcc().length > 0) {
                    objectAnimator.setFloatValues(c0038uef.bcc());
                }
                if (TextUtils.equals(c0038uef.lw(), "rotationX")) {
                    this.moa.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.zjm.1
                        @Override // java.lang.Runnable
                        public void run() {
                            zjm.this.moa.setPivotX(zjm.this.moa.getWidth() / 2.0f);
                            zjm.this.moa.setPivotY(zjm.this.moa.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0038uef.lw(), "ripple")) {
                    this.xs = c0038uef.zjm();
                }
                String strCz = c0038uef.cz();
                strCz.getClass();
                switch (strCz) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.f24696oa.moa() != 0) {
            this.yo.setDuration(this.f24696oa.moa());
        }
        this.yo.setStartDelay(this.f24696oa.lw());
        if (TextUtils.equals(this.f24696oa.uef(), "sequentially")) {
            this.yo.playSequentially(arrayList);
        } else {
            this.yo.playTogether(arrayList);
        }
        this.yo.start();
    }

    public void uef(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || TextUtils.isEmpty(this.xs)) {
                return;
            }
            this.uef.setColor(com.bytedance.adsdk.ugeno.xs.uef.uef(this.xs));
            this.uef.setAlpha(90);
            ((ViewGroup) this.moa.getParent()).setClipChildren(true);
            canvas.drawCircle(this.lw, this.ivm, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.uef);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void uef(int i5, int i10) {
        this.lw = i5 / 2;
        this.ivm = i10 / 2;
    }
}

package com.bytedance.adsdk.ugeno.uef;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.uef.uef.uef;
import com.bytedance.adsdk.ugeno.uef.yo;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef extends AnimatorListenerAdapter {
    private String bcc;
    private oa cz;
    private int ivm = 1;
    private int lw;
    private Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private yo f24768oa;
    private com.bytedance.adsdk.ugeno.oa.yo uef;
    private com.bytedance.adsdk.ugeno.uef.uef.uef xs;
    private ValueAnimator yo;

    public uef(Context context, com.bytedance.adsdk.ugeno.oa.yo yoVar, yo yoVar2) {
        this.uef = yoVar;
        this.f24768oa = yoVar2;
        this.moa = context;
    }

    public String lw() {
        return this.bcc;
    }

    public ValueAnimator moa() {
        String key;
        com.bytedance.adsdk.ugeno.uef.oa.uef yoVar;
        yo yoVar2 = this.f24768oa;
        if (yoVar2 == null || this.uef == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapOa = yoVar2.oa();
        ArrayList arrayList = new ArrayList();
        if (mapOa != null && !mapOa.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapOa.entrySet()) {
                if (entry != null) {
                    key = entry.getKey();
                    String strYo = lw.uef(key).yo();
                    strYo.getClass();
                    switch (strYo) {
                        case "int":
                            yoVar = new com.bytedance.adsdk.ugeno.uef.oa.yo(this.moa, this.uef, key, entry.getValue());
                            break;
                        case "float":
                            yoVar = new com.bytedance.adsdk.ugeno.uef.oa.oa(this.moa, this.uef, key, entry.getValue());
                            break;
                        case "point":
                            yoVar = new com.bytedance.adsdk.ugeno.uef.oa.moa(this.moa, this.uef, key, entry.getValue());
                            break;
                        default:
                            yoVar = null;
                            break;
                    }
                    if (yoVar != null) {
                        arrayList.addAll(yoVar.lw());
                    }
                }
            }
        }
        JSONObject jSONObjectUef = this.f24768oa.uef();
        if (jSONObjectUef != null) {
            com.bytedance.adsdk.ugeno.uef.uef.uef uefVarUef = uef.C0045uef.uef(this.uef, jSONObjectUef);
            this.xs = uefVarUef;
            if (uefVarUef != null) {
                arrayList.addAll(uefVarUef.yo());
            }
        }
        final View viewDj = this.uef.dj();
        if (viewDj == null) {
            return null;
        }
        final yo.uef uefVarXs = this.f24768oa.xs();
        if (uefVarXs != null) {
            viewDj.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.uef.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewDj.getWidth();
                    int height = viewDj.getHeight();
                    viewDj.setPivotX(moa.uef(uefVarXs.uef, width));
                    viewDj.setPivotY(moa.uef(uefVarXs.f24773oa, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewDj, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.lw = moa.uef(this.f24768oa.moa());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.f24768oa.yo());
        int i5 = this.lw;
        if (i5 != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i5);
        }
        this.ivm = this.f24768oa.zjm();
        this.bcc = this.f24768oa.cz();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.f24768oa.ivm());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(moa.uef(this.f24768oa.lw()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(moa.oa(this.f24768oa.bcc()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.yo = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void oa() {
        ValueAnimator valueAnimator = this.yo;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        oa oaVar = this.cz;
        if (oaVar != null) {
            oaVar.oa();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        oa oaVar = this.cz;
        if (oaVar != null) {
            oaVar.uef();
        }
    }

    public void uef() {
        ValueAnimator valueAnimator = this.yo;
        if (valueAnimator == null || this.ivm == 0 || this.lw == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public void yo() {
        ValueAnimator valueAnimator = this.yo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void oa(Canvas canvas) {
        com.bytedance.adsdk.ugeno.uef.uef.uef uefVar = this.xs;
        if (uefVar != null) {
            uefVar.oa(canvas);
        }
    }

    public void uef(oa oaVar) {
        this.cz = oaVar;
    }

    public void uef(Canvas canvas) {
        com.bytedance.adsdk.ugeno.uef.uef.uef uefVar = this.xs;
        if (uefVar != null) {
            uefVar.uef(canvas);
        }
    }

    public void uef(int i5, int i10) {
        com.bytedance.adsdk.ugeno.uef.uef.uef uefVar = this.xs;
        if (uefVar != null) {
            uefVar.uef(i5, i10);
        }
    }
}

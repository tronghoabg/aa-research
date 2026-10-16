package com.bytedance.adsdk.ugeno.uef.oa;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uef.lw;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class moa extends uef {
    private List<Keyframe> bcc;

    /* renamed from: com.bytedance.adsdk.ugeno.uef.oa.moa$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[lw.values().length];
            uef = iArr;
            try {
                iArr[lw.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[lw.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public moa(Context context, com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, Map<Float, String> map) {
        super(context, yoVar, str, map);
        this.bcc = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public TypeEvaluator ivm() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public List<PropertyValuesHolder> lw() {
        String strOa = this.moa.oa();
        moa();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strOa + "X", (Keyframe[]) this.lw.toArray(new Keyframe[0]));
        this.ivm.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strOa + "Y", (Keyframe[]) this.bcc.toArray(new Keyframe[0]));
        this.ivm.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorIvm = ivm();
        if (typeEvaluatorIvm != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorIvm);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorIvm);
        }
        return this.ivm;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public void oa() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i5 = AnonymousClass1.uef[this.moa.ordinal()];
        if (i5 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xs.wk());
            keyframeOfFloat2 = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xs.ab());
        } else if (i5 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xs.bs());
            keyframeOfFloat2 = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xs.sy());
        }
        if (keyframeOfFloat != null) {
            this.lw.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.bcc.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public void uef(float f10, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.moa == lw.TRANSLATE) {
                fOptDouble = bcc.uef(this.uef, fOptDouble);
                fOptDouble2 = bcc.uef(this.uef, fOptDouble2);
            }
            this.lw.add(Keyframe.ofFloat(f10, fOptDouble));
            this.bcc.add(Keyframe.ofFloat(f10, fOptDouble2));
        } catch (JSONException unused) {
        }
    }
}

package com.bytedance.adsdk.ugeno.uef.oa;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.uef.lw;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class yo extends uef {
    public yo(Context context, com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, TreeMap<Float, String> treeMap) {
        super(context, yoVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public TypeEvaluator ivm() {
        return this.moa == lw.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public void oa() {
        if (this.moa == lw.BACKGROUND_COLOR) {
            this.lw.add(Keyframe.ofInt(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xs.af()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public void uef(float f10, String str) {
        this.lw.add(this.moa == lw.BACKGROUND_COLOR ? Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.xs.uef.uef(str)) : Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.xs.yo.uef(str, 0)));
    }
}

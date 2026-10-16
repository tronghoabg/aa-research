package com.bytedance.adsdk.ugeno.uef.oa;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.uef.lw;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class uef {
    protected List<PropertyValuesHolder> ivm = new ArrayList();
    protected List<Keyframe> lw = new ArrayList();
    protected lw moa;

    /* renamed from: oa, reason: collision with root package name */
    protected String f24767oa;
    protected Context uef;
    protected com.bytedance.adsdk.ugeno.oa.yo xs;
    protected Map<Float, String> yo;

    public uef(Context context, com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, Map<Float, String> map) {
        this.uef = context;
        this.f24767oa = str;
        this.yo = map;
        this.moa = lw.uef(this.f24767oa);
        this.xs = yoVar;
    }

    public abstract TypeEvaluator ivm();

    public List<PropertyValuesHolder> lw() {
        String strOa = this.moa.oa();
        moa();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strOa, (Keyframe[]) this.lw.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorIvm = ivm();
        if (typeEvaluatorIvm != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorIvm);
        }
        this.ivm.add(propertyValuesHolderOfKeyframe);
        return this.ivm;
    }

    public void moa() {
        Map<Float, String> map = this.yo;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!uef()) {
            oa();
        }
        for (Map.Entry<Float, String> entry : this.yo.entrySet()) {
            if (entry != null) {
                uef(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        yo();
    }

    public abstract void oa();

    public abstract void uef(float f10, String str);

    public boolean uef() {
        Map<Float, String> map = this.yo;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.yo.containsKey(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public void yo() {
        Map<Float, String> map = this.yo;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.yo;
        if (map2 instanceof TreeMap) {
            Float f10 = (Float) ((TreeMap) map2).lastKey();
            if (f10.floatValue() != 100.0f) {
                uef(100.0f, this.yo.get(f10));
            }
        }
    }
}

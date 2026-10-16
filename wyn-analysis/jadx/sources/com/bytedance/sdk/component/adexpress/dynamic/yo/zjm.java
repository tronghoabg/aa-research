package com.bytedance.sdk.component.adexpress.dynamic.yo;

import N0.a;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class zjm {
    public static xs uef(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar, com.bytedance.sdk.component.adexpress.dynamic.moa.zjm zjmVar, com.bytedance.sdk.component.adexpress.oa.cq cqVar) {
        String strRl;
        String strGsd;
        if (context == null || lwVar == null || xsVar == null) {
            return null;
        }
        strRl = xsVar.rl();
        strGsd = cqVar.gsd();
        strRl.getClass();
        switch (strRl) {
            case "0":
                return new lw(context, lwVar, xsVar);
            case "1":
                return new yo(context, lwVar, xsVar);
            case "2":
                return new oa(context, lwVar, xsVar);
            case "5":
                return xsVar.gem() == 1 ? new bs(context, lwVar, xsVar, xsVar.wxf()) : new ab(context, lwVar, xsVar);
            case "6":
            case "11":
                return new dz(context, lwVar, xsVar);
            case "7":
            case "14":
                return new wrv(context, lwVar, xsVar);
            case "8":
                return new cq(context, lwVar, xsVar);
            case "9":
            case "16":
                return new wk(context, lwVar, xsVar, strRl, zjmVar.uef(), zjmVar.oa(), zjmVar.moa(), zjmVar.xs());
            case "10":
                return new moa(context, lwVar, xsVar);
            case "12":
                return new ab(context, lwVar, xsVar);
            case "13":
                return new bs(context, lwVar, xsVar);
            case "17":
            case "18":
                return new oib(context, lwVar, xsVar, strRl, zjmVar);
            case "20":
                String strF = null;
                if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                    return new dj(context, lwVar, xsVar, a.f(strGsd, "static/lotties/glass-swipe/glass-swipe.json"), "20");
                }
                if (!TextUtils.isEmpty(strGsd)) {
                    strF = a.f(strGsd, "brush_mask.json");
                }
                return new dj(context, lwVar, xsVar, strF, "20");
            case "22":
                return com.bytedance.sdk.component.adexpress.moa.oa() ? new dj(context, lwVar, xsVar, a.f(strGsd, "static/lotties/202327swiper-up-star/index.json"), "22") : new sy(context, lwVar, xsVar);
            case "23":
                if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                    return new dj(context, lwVar, xsVar, a.f(strGsd, "static/lotties/202327swiper-up-star/click.json"), "23");
                }
                return null;
            case "24":
                String strF2 = null;
                if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                    return new uef(context, lwVar, xsVar);
                }
                if (!TextUtils.isEmpty(strGsd)) {
                    strF2 = a.f(strGsd, "swiper_up_star.json");
                }
                return new dj(context, lwVar, xsVar, strF2, "24");
            case "25":
                if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                    return new dj(context, lwVar, xsVar, a.f(strGsd, "static/lotties/gesture-slide.json"), "25");
                }
                break;
            case "29":
                return new ivm(context, lwVar, xsVar, zjmVar.uef(), zjmVar.oa(), zjmVar.moa(), zjmVar.xs());
        }
        return null;
    }
}

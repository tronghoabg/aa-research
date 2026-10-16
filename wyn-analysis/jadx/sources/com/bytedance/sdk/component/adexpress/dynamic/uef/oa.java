package com.bytedance.sdk.component.adexpress.dynamic.uef;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ab;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dhk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dxx;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gsd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gzw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ku;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.orq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sy;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tpx;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ue;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wrv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zjm;
import com.bytedance.sdk.component.adexpress.dynamic.moa.bcc;
import com.bytedance.sdk.component.adexpress.moa;
import com.bytedance.sdk.component.adexpress.oa.cq;

/* loaded from: classes.dex */
public class oa {
    public static lw uef(Context context, DynamicRootView dynamicRootView, bcc bccVar) {
        cq renderRequest;
        if (context == null || dynamicRootView == null || bccVar == null || bccVar.zjm() == null) {
            return null;
        }
        switch (bccVar.zjm().uef()) {
            case -1:
                return new ku(context, dynamicRootView, bccVar);
            case 0:
                return new rt(context, dynamicRootView, bccVar);
            case 1:
                return new dj(context, dynamicRootView, bccVar);
            case 2:
                return new xs(context, dynamicRootView, bccVar);
            case 3:
                return new cz(context, dynamicRootView, bccVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cq(context, dynamicRootView, bccVar);
            case 5:
                return new dz(context, dynamicRootView, bccVar);
            case 6:
            case 9:
            case 17:
                return new ivm(context, dynamicRootView, bccVar);
            case 7:
                return new dxx(context, dynamicRootView, bccVar);
            case 8:
                return new sy(context, dynamicRootView, bccVar);
            case 10:
                return new ab(context, dynamicRootView, bccVar);
            case 11:
                return new gsd(context, dynamicRootView, bccVar);
            case 12:
                return new zjm(context, dynamicRootView, bccVar);
            case 13:
                return new gr(context, dynamicRootView, bccVar);
            case 14:
                return new ue(context, dynamicRootView, bccVar);
            case 15:
                return moa.oa() ? new pz(context, dynamicRootView, bccVar) : new cp(context, dynamicRootView, bccVar);
            case 16:
                return new dj(context, dynamicRootView, bccVar);
            case 18:
                return new gzw(context, dynamicRootView, bccVar);
            case 19:
                return new orq(context, dynamicRootView, bccVar);
            case 20:
                return new dhk(context, dynamicRootView, bccVar);
            case 21:
                return new tpx(context, dynamicRootView, bccVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bcc(context, dynamicRootView, bccVar);
            case 23:
                return new bs(context, dynamicRootView, bccVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.moa(context, dynamicRootView, bccVar);
            case 25:
                return new wrv(context, dynamicRootView, bccVar);
            case 26:
                return "vertical".equals(bccVar.zjm().lw().bx()) ? new fz(context, dynamicRootView, bccVar) : new yo(context, dynamicRootView, bccVar);
            case 27:
                return new cp(context, dynamicRootView, bccVar);
            case 28:
                if (!moa.oa() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new wk(context, dynamicRootView, bccVar, renderRequest.gsd());
            default:
                return null;
        }
    }
}

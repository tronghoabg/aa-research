package com.bytedance.sdk.openadsdk.gsd.oa;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.gb;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class lw {
    private static final Map<Integer, oa> uef = new ConcurrentHashMap();

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public int f25909oa = -1;
        public int uef;

        public uef(int i5) {
            this.uef = i5;
        }
    }

    public static void oa(Integer num) {
        uef.remove(num);
    }

    public static void uef(View view, gzw gzwVar, uef uefVar) {
        if (view == null || gzwVar == null || gzwVar.jzd()) {
            return;
        }
        boolean zYo = yo(gzwVar);
        if (cp.oa(gzwVar) && uefVar != null) {
            uefVar.uef = -1;
        }
        uef(uef(view, gzwVar, zYo, uefVar));
    }

    private static boolean yo(gzw gzwVar) {
        if (gzwVar == null) {
            return false;
        }
        String strUef = gb.uef(gzwVar);
        return ((!"open_ad".equals(strUef) && !"fullscreen_interstitial_ad".equals(strUef) && !"rewarded_video".equals(strUef)) || cp.oa(gzwVar) || gzwVar.wxf() == 5 || gzwVar.wxf() == 33 || !gzw.lw(gzwVar) || gzwVar.nj() == null) ? false : true;
    }

    public static Integer oa(gzw gzwVar) {
        return Integer.valueOf((gzwVar.ofp() + gzwVar.iou()).hashCode());
    }

    private static oa uef(View view, gzw gzwVar, boolean z2, uef uefVar) {
        if (view == null || gzwVar == null || gzwVar.iou() == null) {
            return null;
        }
        Integer numOa = oa(gzwVar);
        Map<Integer, oa> map = uef;
        if (map.containsKey(numOa)) {
            oa oaVar = map.get(numOa);
            if (oaVar != null) {
                oaVar.uef(view);
            }
            return oaVar;
        }
        oa oaVarUef = oa.uef(z2, numOa, view, gzwVar, uefVar);
        map.put(numOa, oaVarUef);
        return oaVarUef;
    }

    private static void uef(oa oaVar) {
        if (oaVar == null) {
            return;
        }
        oaVar.uef();
    }

    public static void uef(gzw gzwVar, int i5) {
        if (gzwVar == null || gzwVar.iou() == null) {
            return;
        }
        uef(uef.get(oa(gzwVar)), i5);
    }

    public static void uef(oa oaVar, int i5) {
        if (oaVar == null) {
            return;
        }
        oaVar.uef(i5);
    }

    public static void uef(gzw gzwVar) {
        if (gzwVar == null || gzwVar.iou() == null) {
            return;
        }
        Integer numOa = oa(gzwVar);
        Map<Integer, oa> map = uef;
        oa oaVar = map.get(numOa);
        if (oaVar != null) {
            oaVar.zjm();
        }
        oa(numOa);
        if (map.size() <= 0) {
            xs.uef();
        }
    }

    public static oa uef(Integer num) {
        return uef.get(num);
    }
}

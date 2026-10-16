package com.bytedance.sdk.openadsdk.component.uef;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.core.zjm.cz;
import com.bytedance.sdk.openadsdk.core.zjm.zjm;
import com.bytedance.sdk.openadsdk.tpx.uef.uef.moa;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class oa {
    public static cz oa(gzw gzwVar, Activity activity, final com.bytedance.sdk.openadsdk.component.bcc.uef uefVar, com.bytedance.sdk.openadsdk.component.cz.oa oaVar) {
        cz czVar = new cz(activity.getApplicationContext(), gzwVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.uef.oa.2
            @Override // com.bytedance.sdk.openadsdk.core.yo.uef, com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(uefVar.yo()));
                uef(map);
                super.uef(view, f10, f11, f12, f13, sparseArray, z2);
            }
        };
        czVar.oa(oaVar);
        uef(activity.getApplicationContext(), gzwVar, czVar);
        uef(czVar, gzwVar);
        return czVar;
    }

    public static uef uef(gzw gzwVar, Activity activity, com.bytedance.sdk.openadsdk.component.bcc.uef uefVar) {
        uef uefVar2 = new uef(activity.getApplicationContext(), gzwVar, "open_ad", 4, uefVar);
        uefVar2.oa(activity.findViewById(R.id.content));
        uef(activity.getApplicationContext(), gzwVar, uefVar2);
        uef(uefVar2, gzwVar);
        return uefVar2;
    }

    public static zjm uef(gzw gzwVar, Activity activity, final com.bytedance.sdk.openadsdk.component.bcc.uef uefVar, com.bytedance.sdk.openadsdk.component.cz.oa oaVar) {
        zjm zjmVar = new zjm(activity, gzwVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.uef.oa.1
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(uefVar.yo()));
                uef(map);
                super.uef(view, f10, f11, f12, f13, sparseArray, z2);
            }
        };
        zjmVar.oa(oaVar);
        uef(activity.getApplicationContext(), gzwVar, zjmVar);
        uef(zjmVar, gzwVar);
        return zjmVar;
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.yo.oa oaVar, gzw gzwVar) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(gzwVar.zou()));
        map.put("openad_creative_type", gzw.lw(gzwVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(cp.yo(gzwVar) ? 3 : 1));
        oaVar.uef(map);
    }

    private static void uef(Context context, gzw gzwVar, com.bytedance.sdk.openadsdk.core.yo.oa oaVar) {
        if (gzwVar == null || gzwVar.ykf() != 4) {
            return;
        }
        oaVar.uef(moa.uef(context, "open_ad"));
    }
}

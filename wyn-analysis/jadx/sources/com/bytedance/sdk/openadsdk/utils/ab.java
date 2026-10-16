package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.wrv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ab implements com.bytedance.sdk.openadsdk.oem.uef {
    private static com.bytedance.sdk.openadsdk.core.wk.moa.oa ivm;
    private static boolean lw;
    private static String moa;

    /* renamed from: oa, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.core.model.gzw f26126oa;
    private static final ab uef = new ab();
    private static com.bytedance.sdk.openadsdk.component.reward.yo.oa xs;
    private static Context yo;

    public static void oa() {
        lw = true;
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, Context context, String str, com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        uef(gzwVar, context, str, oaVar, null);
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, Context context, String str, com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar) {
        uef(gzwVar, context, str, null, oaVar);
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, Context context, String str, com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar, com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar2) {
        com.bytedance.sdk.openadsdk.core.model.pz pzVarAzx = gzwVar.azx();
        if (pzVarAzx != null) {
            if (pzVarAzx.xs() || pzVarAzx.bcc()) {
                f26126oa = gzwVar;
                yo = context;
                moa = str;
                ivm = oaVar;
                xs = oaVar2;
                IPBroadcastReceiver iPBroadcastReceiverUef = IPBroadcastReceiver.uef(context, gzwVar);
                if (iPBroadcastReceiverUef != null) {
                    iPBroadcastReceiverUef.uef(uef);
                }
            }
        }
    }

    public static void uef() {
        if (f26126oa == null) {
            return;
        }
        IPBroadcastReceiver iPBroadcastReceiverUef = IPBroadcastReceiver.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), f26126oa);
        if (iPBroadcastReceiverUef != null) {
            iPBroadcastReceiverUef.uef();
        }
        lw = false;
        f26126oa = null;
        yo = null;
        moa = null;
        ivm = null;
        xs = null;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.uef
    public void uef(String str, final int i5) {
        com.bytedance.sdk.openadsdk.core.model.ivm ivmVarNo;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = f26126oa;
        if (gzwVar == null || yo == null || (ivmVarNo = gzwVar.no()) == null) {
            return;
        }
        String strYo = ivmVarNo.yo();
        if (TextUtils.isEmpty(strYo) || !strYo.equals(str)) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ab.1
            @Override // java.lang.Runnable
            public void run() {
                int i10;
                if (ab.f26126oa == null || ab.yo == null || (i10 = i5) <= 0 || i10 > 5) {
                    return;
                }
                boolean z2 = true;
                boolean z10 = i10 == 1;
                if (ab.lw) {
                    if (ab.ivm != null) {
                        ab.ivm.hts();
                    }
                    if (ab.xs != null) {
                        ab.xs.uef();
                    }
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.moa.yo.uef("click", ab.f26126oa, new wrv.uef().uef(), ab.moa, true, (Map<String, Object>) map, 1);
                } else {
                    z2 = z10;
                }
                if (z2) {
                    ab.uef();
                }
            }
        });
    }
}

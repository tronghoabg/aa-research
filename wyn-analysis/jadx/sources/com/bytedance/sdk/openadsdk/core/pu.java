package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.oa;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.moa.oa;
import com.bytedance.sdk.openadsdk.oib.yo.uef;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class pu {
    private static boolean uef = false;

    public static void uef(boolean z2) {
        uef = z2;
    }

    private static com.bytedance.sdk.openadsdk.ab.uef.oa uef(int i5, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        com.bytedance.sdk.openadsdk.ab.uef.oa oaVar = new com.bytedance.sdk.openadsdk.ab.uef.oa();
        oaVar.uef(oa.uef.uef);
        oaVar.uef(gzwVar);
        oaVar.oa(com.bytedance.sdk.openadsdk.utils.gb.uef(gzwVar));
        oaVar.uef(i5);
        oaVar.uef(false);
        oaVar.oa(gzwVar.ykf());
        return oaVar;
    }

    public static boolean uef(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.moa.uef uefVar, String str, com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yoVar, boolean z2, int i10) {
        String strUef;
        com.bytedance.sdk.openadsdk.moa.yo.uef(uef(-1, gzwVar));
        if (context != null && gzwVar != null && i5 != -1) {
            com.bytedance.sdk.openadsdk.core.model.cq cqVarAgr = gzwVar.agr();
            HashMap map = new HashMap();
            if (gzwVar.orw() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i10 >= 11));
            }
            if (i10 != 0 && gzwVar.ebe()) {
                map.put("dsp_click_type", Integer.valueOf(i10));
            }
            if (cqVarAgr != null && !TextUtils.isEmpty(cqVarAgr.uef())) {
                if (uef(context, gzwVar, i5, str, z2, map)) {
                    com.bytedance.sdk.openadsdk.moa.yo.uef(uef(2, gzwVar));
                    com.bytedance.sdk.openadsdk.utils.lw.uef(gzwVar);
                    return true;
                }
                if (cqVarAgr.yo() != 2 || gzwVar.hw() == 5 || gzwVar.hw() == 15) {
                    if (cqVarAgr.yo() == 1 && !TextUtils.isEmpty(cqVarAgr.oa())) {
                        strUef = cqVarAgr.oa();
                    } else {
                        strUef = uef(gzwVar);
                    }
                } else if (yoVar != null) {
                    if (!yoVar.moa(gzwVar)) {
                        if (yoVar.yo(gzwVar)) {
                            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.moa.yo.uef(uef(3, gzwVar));
                            com.bytedance.sdk.openadsdk.utils.lw.uef(gzwVar);
                            return true;
                        }
                        strUef = uef(cqVarAgr, gzwVar);
                        com.bytedance.sdk.openadsdk.moa.yo.uef(uef(3, gzwVar));
                    } else {
                        com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.moa.yo.uef(uef(3, gzwVar));
                        com.bytedance.sdk.openadsdk.utils.lw.uef(gzwVar);
                        return true;
                    }
                } else {
                    strUef = uef(cqVarAgr, gzwVar);
                }
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, "open_fallback_url", map);
            } else {
                strUef = uef(gzwVar);
            }
            String str2 = strUef;
            if (gzwVar.orw() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.moa.yo.uef(uef(4, gzwVar));
                boolean zUef = com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.uef(context, str2, strSubstring, str, gzwVar);
                if (zUef) {
                    com.bytedance.sdk.openadsdk.utils.lw.uef(gzwVar);
                }
                return zUef;
            }
            boolean zUef2 = uef(context, gzwVar, i5, pAGNativeAd, uefVar, str, z2, str2);
            if (zUef2) {
                com.bytedance.sdk.openadsdk.utils.lw.uef(gzwVar);
            }
            return zUef2;
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(uef(1, gzwVar));
        return false;
    }

    private static String uef(com.bytedance.sdk.openadsdk.core.model.cq cqVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (!TextUtils.isEmpty(cqVar.oa())) {
            return cqVar.oa();
        }
        return uef(gzwVar);
    }

    private static String uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar.ebe() && gzwVar.nkc() != null) {
            return gzwVar.nkc().cz();
        }
        return gzwVar.cc();
    }

    public static boolean uef(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, String str, boolean z2, Map<String, Object> map) {
        if (gzwVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.cq cqVarAgr = gzwVar.agr();
        if (cqVarAgr != null && !TextUtils.isEmpty(cqVarAgr.uef())) {
            if (map == null) {
                map = new HashMap<>();
            }
            return com.bytedance.sdk.openadsdk.tpx.uef.uef.uef.uef(context, cqVarAgr.uef(), gzwVar, i5, map, z2);
        }
        lw.uef(gzwVar, str, cqVarAgr == null ? -1 : -2, cqVarAgr != null ? cqVarAgr.moa() : null);
        return false;
    }

    public static boolean uef(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.moa.uef uefVar, String str, boolean z2, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.cp.oa(gzwVar)) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(uef(5, gzwVar));
            return false;
        }
        int iYkf = gzwVar.ykf();
        if (iYkf != 2 && iYkf != 8) {
            com.bytedance.sdk.component.utils.oa.uef(context, uef(context, str2, gzwVar, i5, pAGNativeAd, uefVar, str, z2), null);
            uef = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.gsd.uef(context, str2, gzwVar, oa.uef.uef, false);
    }

    public static void uef(Context context, String str, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, String str2, boolean z2) {
        com.bytedance.sdk.component.utils.oa.uef(context, uef(context, str, gzwVar, i5, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.moa.uef) null, str2, z2), null);
    }

    public static void uef(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, final String str2, boolean z2, dhk dhkVar) {
        com.bytedance.sdk.component.utils.oa.uef(context, uef(context, str, gzwVar, i5, null, null, str2, z2, true, dhkVar), new oa.InterfaceC0066oa() { // from class: com.bytedance.sdk.openadsdk.core.pu.1
            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef() throws JSONException {
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef(Throwable th) throws JSONException {
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent uef(Context context, String str, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.moa.uef uefVar, String str2, boolean z2) {
        return uef(context, str, gzwVar, i5, pAGNativeAd, uefVar, str2, z2, false, null);
    }

    public static boolean uef(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, int i5, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i10);
            com.bytedance.sdk.openadsdk.moa.yo.ivm(gzwVar, str, jSONObject);
            Intent intentUef = uef(context, gzwVar, str, i5);
            if (intentUef == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.oa.uef(context, intentUef, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent uef(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, int i5) {
        if (context == null || gzwVar == null || !com.bytedance.sdk.openadsdk.core.model.cp.oa(gzwVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String strDj = com.bytedance.sdk.openadsdk.core.model.cp.dj(gzwVar);
        if (!TextUtils.isEmpty(strDj)) {
            if (strDj.contains("?")) {
                strDj = strDj.concat("&orientation=portrait");
            } else {
                strDj = strDj.concat("?orientation=portrait");
            }
        }
        gzwVar.lw(strDj);
        gzwVar.ivm(str);
        gzwVar.moa(i5);
        intent.putExtra("meta_index", cp.uef().uef(gzwVar));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent uef(Context context, String str, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.moa.uef uefVar, String str2, boolean z2, boolean z10, dhk dhkVar) {
        Intent intent;
        if (!z10 && com.bytedance.sdk.openadsdk.core.model.cp.oa(gzwVar) && (pAGNativeAd != 0 || uefVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zUef = uef(gzwVar, z2);
            intent.putExtra("ad_pending_download", zUef);
            String strDj = com.bytedance.sdk.openadsdk.core.model.cp.dj(gzwVar);
            if (!TextUtils.isEmpty(strDj)) {
                if (strDj.contains("?")) {
                    str = strDj.concat("&orientation=portrait");
                } else {
                    str = strDj.concat("?orientation=portrait");
                }
            }
            gzwVar.oa(zUef);
        } else if (!z10 && gzwVar.ykf() == 3 && ((gzwVar.wxf() == 2 || (gzwVar.wxf() == 1 && uef)) && !gzwVar.okm())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (z10 && dhkVar != null) {
            gzwVar.dhk(dhkVar.oa());
            gzwVar.uef(dhkVar.uef());
        }
        gzwVar.lw(str);
        gzwVar.ivm(str2);
        gzwVar.moa(i5);
        intent.putExtra("meta_index", cp.uef().uef(gzwVar));
        if (gzwVar.hw() == 5 || gzwVar.hw() == 15 || gzwVar.hw() == 50) {
            com.bytedance.sdk.openadsdk.oib.yo.uef uefVarYo = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof uef.InterfaceC0131uef) {
                    uefVarYo = ((uef.InterfaceC0131uef) pAGNativeAd).ivm();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.uef.oa.uef.oa) {
                    uefVarYo = ((com.bytedance.sdk.openadsdk.uef.oa.uef.oa) pAGNativeAd).oa();
                }
                if (uefVarYo != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, uefVarYo.uef().toString());
                }
            }
            if (uefVar != null && uefVar.oa() && (uefVarYo = uefVar.yo()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, uefVarYo.uef().toString());
            }
            if (uefVarYo != null) {
                intent.putExtra("video_is_auto_play", uefVarYo.moa);
                if (com.bytedance.sdk.component.utils.wk.yo()) {
                    uefVarYo.uef().toString();
                }
            }
        }
        return intent;
    }

    private static boolean uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, boolean z2) {
        if (z2 && gzwVar != null && gzwVar.ykf() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.cp.oa(gzwVar);
        }
        return false;
    }
}

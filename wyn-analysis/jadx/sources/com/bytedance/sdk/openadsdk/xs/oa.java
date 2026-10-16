package com.bytedance.sdk.openadsdk.xs;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.moa.yo;
import com.bytedance.sdk.openadsdk.utils.km;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    private static final String[] uef = {"gecko16-normal-useast5.tiktokv.us"};

    /* renamed from: com.bytedance.sdk.openadsdk.xs.oa$oa, reason: collision with other inner class name */
    public static class C0138oa {
        private static final oa uef = new oa();
    }

    public interface uef {
        void uef();
    }

    private static String moa() {
        String[] strArrVjj = sy.moa().vjj();
        if (strArrVjj == null) {
            strArrVjj = uef;
        }
        String str = strArrVjj[new SecureRandom().nextInt(strArrVjj.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = uef;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public static void yo() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.xs.oa.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return km.lw();
                }
            });
        } catch (Throwable th) {
            dhk.uef("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }

    public ILoader oa() {
        try {
            return GeckoHubImp.inst(sy.uef()).getGeckoResLoader();
        } catch (Throwable th) {
            dhk.uef("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private oa() {
        try {
            GeckoHubImp.inst(sy.uef());
        } catch (Throwable th) {
            dhk.uef("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    public static oa uef() {
        return C0138oa.uef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(Map<String, gzw> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put("msg", str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<gzw> it = map.values().iterator();
            while (it.hasNext()) {
                moa.uef(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            dhk.uef("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void uef(Map<String, gzw> map) {
        uef(map, (uef) null, false);
    }

    public void uef(final Map<String, gzw> map, final uef uefVar, boolean z2) {
        try {
            String strUef = cq.uef(sy.uef());
            if (TextUtils.isEmpty(strUef)) {
                return;
            }
            for (gzw gzwVar : map.values()) {
                if (gzwVar != null) {
                    if (!z2 && gzwVar.kkq()) {
                        map.remove(gzwVar.vup());
                    } else {
                        moa.oa(gzwVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(moa());
            GeckoHubImp.inst(sy.uef()).preload(strUef, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.xs.oa.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        gzw gzwVar2 = (gzw) map.get(jSONObject.optString("channel"));
                        if (gzwVar2 != null) {
                            yo.uef.uef(str, jSONObject, gzwVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        uef uefVar2 = uefVar;
                        if (uefVar2 != null) {
                            uefVar2.uef();
                        }
                        oa.oa(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.xs.uef());
        } catch (Throwable th) {
            oa(map, null, th.toString());
            dhk.uef("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    public void uef(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(sy.uef()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                dhk.uef("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel uef(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(sy.uef()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            dhk.uef("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int uef(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(sy.uef()).getResCount(iLoader, str);
        } catch (Throwable th) {
            dhk.uef("GeckoHub", "getResCount error", th);
            return 0;
        }
    }
}

package com.bytedance.sdk.openadsdk.gzw;

import N0.a;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.bcc;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.openadsdk.core.gsd;
import com.bytedance.sdk.openadsdk.core.rt;
import com.bytedance.sdk.openadsdk.core.settings.cz;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.gzw.oa;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.gzw;
import com.bytedance.sdk.openadsdk.utils.km;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.qonversion.android.sdk.internal.Constants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw {
    private static volatile moa moa;

    /* renamed from: oa, reason: collision with root package name */
    public static String f25920oa;
    private static final AtomicBoolean yo = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, Object> uef = new ConcurrentHashMap<>();

    public static boolean bcc() {
        return uef("no_call_close", 0) == 1;
    }

    public static boolean cz() {
        return uef("iv_rv_listen_new_arch", 0) == 1;
    }

    private static moa dj() {
        return uef(sy.uef(), zjm.oa().moa());
    }

    public static int ivm() {
        if (oa()) {
            return uef("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static int lw() {
        if (oa()) {
            return uef("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static boolean moa() {
        return oa() && uef("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static boolean oa() {
        return uef("ad_load_and_render_opt", "enable", 0) == 1;
    }

    public static moa uef(final Context context, final String str) {
        if (moa == null) {
            synchronized (lw.class) {
                try {
                    if (moa == null) {
                        try {
                            moa moaVar = new moa(new ivm() { // from class: com.bytedance.sdk.openadsdk.gzw.lw.1
                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public boolean bcc() {
                                    return com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw();
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public JSONObject ivm() {
                                    try {
                                        JSONObject jSONObjectUef = cz.uef(gr.uef(sy.uef(), 0L));
                                        if (!jSONObjectUef.has("app_id")) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectUef.put("app_id", str);
                                            } else {
                                                if (TextUtils.isEmpty(zjm.oa().moa())) {
                                                    return null;
                                                }
                                                jSONObjectUef.put("app_id", zjm.oa().moa());
                                            }
                                        }
                                        return gsd.uef(PangleEncryptConstant.CryptDataScene.STRATEGY, jSONObjectUef);
                                    } catch (Throwable th) {
                                        dhk.yo("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public String lw() {
                                    String strUef = gb.uef("/api/ad/union/sdk/strategies/adn", false, true);
                                    lw.f25920oa = strUef;
                                    return strUef;
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public Handler moa() {
                                    return wk.oa();
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public Context oa() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : sy.uef();
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public ExecutorService uef() {
                                    return km.lw();
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public Map<String, String> xs() throws JSONException {
                                    HashMap map = new HashMap();
                                    map.put("User-Agent", gb.moa());
                                    String strOa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!strOa.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", strOa);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new rt(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (jSONObjectEncryptType4 != null) {
                                            map.put("transfer-param", jSONObjectEncryptType4.optString(PglCryptUtils.KEY_MESSAGE));
                                            if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                                map.put("cypher", "4");
                                            } else {
                                                map.put("cypher", "3");
                                            }
                                        }
                                    }
                                    try {
                                        map.put("x-pangle-target-idc", dj.oa().jp());
                                    } catch (Throwable unused2) {
                                    }
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public String yo() {
                                    if (tpx.uef(oa())) {
                                        return "pag_adn_strategy_center";
                                    }
                                    return "pag_adn_strategy_center_" + tpx.yo(oa());
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public JSONObject uef(JSONObject jSONObject) {
                                    String strUef = gsd.uef(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                    if (!TextUtils.isEmpty(strUef)) {
                                        try {
                                            return new JSONObject(strUef);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.ivm
                                public HandlerThread uef(String str2, int i5) {
                                    return bcc.uef(str2, i5);
                                }
                            });
                            moa = moaVar;
                            moaVar.uef(new uef() { // from class: com.bytedance.sdk.openadsdk.gzw.lw.2
                                @Override // com.bytedance.sdk.openadsdk.gzw.uef
                                public void oa() {
                                    com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.gzw.lw.2.2
                                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                            return AbstractC1593a.f("strategy_fetch");
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.ivm.uef.uef().oa();
                                    com.bytedance.sdk.openadsdk.orq.uef.yo.uef().oa();
                                    gzw.oa();
                                    HashMap map = new HashMap();
                                    String strUef = lw.uef(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(strUef)) {
                                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strUef);
                                    }
                                    com.bytedance.sdk.openadsdk.core.wrv.yo.uef(map);
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.uef
                                public void uef() {
                                    com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.gzw.lw.2.1
                                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                            return AbstractC1593a.f("strategy_fetch");
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.gzw.uef
                                public void uef(int i5, String str2) {
                                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.gzw.lw.2.3
                                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                            return AbstractC1593a.f("strategy_fetch");
                                        }
                                    });
                                    gzw.uef(lw.f25920oa);
                                }
                            });
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return moa;
    }

    public static boolean xs() {
        return uef("jsb_opt_enable", 0) == 1;
    }

    public static boolean yo() {
        return oa() && uef("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static boolean zjm() {
        return uef("iv_rv_top_bar_listen_new", 0) == 1;
    }

    public static int uef(String str, int i5) {
        moa moaVarDj = dj();
        return moaVarDj != null ? moaVarDj.uef(str, i5) : i5;
    }

    public static boolean uef(String str, boolean z2) {
        moa moaVarDj = dj();
        return moaVarDj != null ? moaVarDj.uef(str, z2) : z2;
    }

    public static String uef(String str, String str2) {
        moa moaVarDj = dj();
        return moaVarDj != null ? moaVarDj.uef(str, str2) : str2;
    }

    public static <T> T uef(String str, T t10, oa.uef<T> uefVar) {
        moa moaVarDj = dj();
        return moaVarDj != null ? (T) moaVarDj.uef(str, t10, uefVar) : t10;
    }

    public static int uef(String str, String str2, int i5) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strG = a.g(str, Constants.USER_ID_SEPARATOR, str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = uef;
            Object obj = concurrentHashMap.get(strG);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strUef = dj().uef(str, "");
                if (!TextUtils.isEmpty(strUef)) {
                    int iOptInt = new JSONObject(strUef).optInt(str2, i5);
                    concurrentHashMap.put(strG, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th) {
                dhk.yo("StrategyUtils", th.getMessage());
            }
        }
        return i5;
    }

    public static String uef(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strG = a.g(str, Constants.USER_ID_SEPARATOR, str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = uef;
            Object obj = concurrentHashMap.get(strG);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strUef = dj().uef(str, "");
                if (!TextUtils.isEmpty(strUef)) {
                    String strOptString = new JSONObject(strUef).optString(str2, str3);
                    concurrentHashMap.put(strG, strOptString);
                    return strOptString;
                }
            } catch (Throwable th) {
                dhk.yo("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    public static void uef() {
        moa moaVarDj;
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw() || (moaVarDj = dj()) == null || yo.getAndSet(true)) {
            return;
        }
        moaVarDj.uef();
    }
}

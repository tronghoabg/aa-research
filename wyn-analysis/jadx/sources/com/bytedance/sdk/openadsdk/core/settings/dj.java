package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.wrv;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.settings.TTSdkSettings;
import com.bytedance.sdk.openadsdk.core.settings.cz;
import com.bytedance.sdk.openadsdk.core.settings.lw;
import com.bytedance.sdk.openadsdk.core.settings.zjm;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.uef.zjm;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.google.android.gms.common.api.f;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.metadata.DublinCore;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dj implements cz.uef {
    private static final String cz;
    private static boolean dj;
    public static String ivm;
    public static int lw;
    public static String moa;

    /* renamed from: oa, reason: collision with root package name */
    public static final String f25741oa;
    private static final ConcurrentLinkedQueue<zjm.uef> oib;
    private static String rt;
    public static final String uef;
    static final ConcurrentHashMap<String, Integer> xs;
    public static final String yo;

    /* renamed from: ab, reason: collision with root package name */
    private int f25742ab;
    lw.oa<com.bytedance.sdk.openadsdk.moa.uef.zjm> bcc;
    private int bs;
    private final bcc cq;
    private final Runnable dhk;
    private final AtomicBoolean dz;
    private lw.oa<JSONObject> gsd;
    private final lw.oa<Set<String>> gzw;
    private final Set<String> orq;
    private boolean sy;
    private final lw.oa<Map<String, Integer>> tpx;
    private volatile boolean wk;
    private final com.bytedance.sdk.openadsdk.core.settings.uef wrv;
    private Set<String> zjm;

    public static final class uef {
        static final dj uef = new dj();
    }

    static {
        CharSequence[] charSequenceArr = {"bus_con_collect", gb.ku()};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr[0]);
        sb2.append((CharSequence) Constants.USER_ID_SEPARATOR);
        sb2.append(charSequenceArr[1]);
        uef = sb2.toString();
        CharSequence[] charSequenceArr2 = {"bus_con", gb.ku(), gb.cp(), "timeout"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr2[0]);
        for (int i5 = 1; i5 < 4; i5++) {
            sb3.append((CharSequence) Constants.USER_ID_SEPARATOR);
            sb3.append(charSequenceArr2[i5]);
        }
        f25741oa = sb3.toString();
        CharSequence[] charSequenceArr3 = {"bus_con", gb.ku(), gb.cp(), "alpha"};
        StringBuilder sb4 = new StringBuilder();
        sb4.append(charSequenceArr3[0]);
        for (int i10 = 1; i10 < 4; i10++) {
            sb4.append((CharSequence) Constants.USER_ID_SEPARATOR);
            sb4.append(charSequenceArr3[i10]);
        }
        yo = sb4.toString();
        cz = gb.gzw();
        moa = "";
        lw = -2;
        ivm = AndroidTcfDataSource.TCF_TCSTRING_KEY;
        dj = false;
        oib = new ConcurrentLinkedQueue<>();
        xs = new ConcurrentHashMap<>();
    }

    private String dy() {
        return this.cq.uef("force_language", "");
    }

    public static boolean uu() {
        return dj;
    }

    private Set<String> wd() {
        return (Set) this.cq.uef("perf_con_applog_send", this.orq, this.gzw);
    }

    public static String wf() {
        if (rt == null) {
            String strOa = com.bytedance.sdk.openadsdk.core.yo.uef().oa("settings_host_from_meta", "");
            rt = strOa;
            if (strOa == null) {
                rt = "";
            }
        }
        return rt;
    }

    public boolean ab() {
        return this.cq.uef("allow_blind_mode_request_ad", false);
    }

    public String af() {
        return this.cq.uef("ads_url", "");
    }

    public Set<String> aje() {
        return (Set) this.cq.uef("privacy_fields_allowed", Collections.EMPTY_SET, lw.f25746oa);
    }

    public JSONObject aos() {
        return (JSONObject) this.cq.uef("perf_con_thread_pool_config", new JSONObject(), this.gsd);
    }

    public String au() {
        return this.cq.uef(DublinCore.PREFIX_DC, "TX");
    }

    public void bcc() {
        this.cq.oa().uef("ab_test_param").uef();
    }

    public boolean bs() {
        return this.cq.uef("support_gzip", false);
    }

    public boolean bx() {
        return this.cq.uef("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public String cl() {
        return this.cq.uef("dual_event_url", (String) null);
    }

    public String cop() {
        return this.cq.uef("dyn_draw_engine_url", cz);
    }

    public String cp() {
        return this.cq.uef("ab_test_param", "");
    }

    public Set<String> cq() {
        return wd();
    }

    public boolean cz() {
        return this.cq.uef("if_both_open", 0) == 1;
    }

    public boolean dh() {
        return this.cq.uef("perf_con_is_new_net_thread", 0) == 1;
    }

    public String dhk() {
        return this.cq.uef("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public int dj() {
        return this.cq.uef("splash_video_load_strategy", 0);
    }

    public String dor() {
        return this.cq.uef(DublinCore.PREFIX_DC, "");
    }

    public boolean dv() {
        return this.cq.uef("perf_con_apm_native", f.API_PRIORITY_OTHER) == 1;
    }

    public int dxx() {
        return this.cq.uef(AppLovinMediationProvider.MAX, 50);
    }

    public int dz() {
        wd();
        return this.bs;
    }

    public int etd() {
        return this.cq.uef("vbtt", 5);
    }

    public int fjj() {
        return this.cq.uef("perf_con_close_button_delay_check_time", -1);
    }

    public long fz() {
        return this.cq.uef("duration", 10000L);
    }

    public boolean fzf() {
        return this.cq.uef("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public boolean gb() {
        return this.cq.yo();
    }

    public int gem() {
        return this.cq.uef("ivrv_downward", 0);
    }

    public long ggp() {
        return this.cq.uef("last_req_time", 0L);
    }

    public float gr() {
        return this.cq.uef(yo, 1.0f);
    }

    public boolean gsd() {
        return this.cq.uef(uef, false);
    }

    public boolean gzw() {
        return this.cq.uef("bus_con_url_check", 1) != 0;
    }

    public Set<String> hdd() {
        bcc bccVar = this.cq;
        Set<String> set = Collections.EMPTY_SET;
        Set<String> set2 = (Set) bccVar.uef("dual_event_url_backup", set, lw.f25746oa);
        return (set2 == null || set2.size() == 0) ? set : set2;
    }

    public boolean hg() {
        return this.cq.uef("read_video_from_cache", 1) == 1;
    }

    public int hnk() {
        int iUef = this.cq.uef("perf_con_webview_cache_count_v3", 0);
        if (iUef < 0) {
            return 0;
        }
        return iUef;
    }

    public String hts() {
        return this.cq.uef("privacy_app_reg", "");
    }

    public JSONObject ivm() {
        return (JSONObject) this.cq.uef("digest", null, lw.uef);
    }

    public boolean ix() {
        int iUef = this.wrv.uef("perf_con_apm", 100);
        if (iUef == 0) {
            return false;
        }
        return iUef < 0 || iUef >= 100 || iUef > ((int) (Math.random() * 100.0d));
    }

    public long jkf() {
        long jUef = this.cq.uef("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jUef < 0 || jUef > 86400000) ? TTAdConstant.AD_MAX_EVENT_TIME : jUef;
    }

    public String jp() {
        return this.cq.uef("target_region", "");
    }

    public int km() {
        int iUef = this.cq.uef("fetch_tpl_second", 0);
        if (iUef <= 0) {
            return 0;
        }
        return iUef;
    }

    public boolean ku() {
        return this.cq.uef("landingpage_new_style", -1) == 1;
    }

    public void lo() {
        lw.uef uefVarOa = this.cq.oa();
        uefVarOa.uef("settings_url", "");
        uefVarOa.uef();
        ku("");
    }

    public int lw() {
        return this.cq.uef("max_tpl_cnts", 100);
    }

    public ivm lz() {
        return (ivm) this.cq.uef("insert_js_config", ivm.uef, new lw.oa<ivm>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.lw.oa
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public ivm oa(String str) {
                return new ivm(str);
            }
        });
    }

    public String moa() {
        return this.cq.uef("aes_key", "");
    }

    public long ne() {
        return this.cq.uef("perf_con_adlog_expire_time", 0L);
    }

    public Set<String> nj() {
        bcc bccVar = this.cq;
        Set<String> set = Collections.EMPTY_SET;
        Set<String> set2 = (Set) bccVar.uef("ads_url_backup", set, lw.f25746oa);
        return (set2 == null || set2.size() == 0) ? set : set2;
    }

    public boolean nkh() {
        return this.cq.uef("privacy_debug_unlock", 1) != 0;
    }

    public boolean oib() {
        return this.cq.uef("bus_con_adshow_check_enable", true);
    }

    public String orq() {
        return this.cq.uef("bus_con_check_clz", "");
    }

    public int ot() {
        return this.cq.uef("blank_detect_rate", 30);
    }

    public int ou() {
        int iUef = this.cq.uef("perf_con_webview_cache_count", 0);
        if (iUef < 0) {
            return 0;
        }
        return iUef;
    }

    public int oyt() {
        int iUef = this.cq.uef("fetch_tpl_timeout_ctrl", 3000);
        if (iUef <= 0) {
            return 3000;
        }
        return iUef;
    }

    public void pu() {
        String strDy = dy();
        if (TextUtils.isEmpty(strDy)) {
            return;
        }
        if (strDy.equals("zh-Hant")) {
            wrv.uef(sy.uef(), "zh", "tw");
        } else {
            wrv.uef(sy.uef(), strDy, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            dhk.yo("TTAD.SdkSettings", th.getMessage());
        }
    }

    public int pz() {
        return this.cq.uef("loadedCallbackOpportunity", 0);
    }

    public boolean qn() {
        return this.cq.uef("bus_con_video_keep_screen_on", 1) == 1;
    }

    public int rj() {
        int iUef = this.cq.uef("privacy_personalized_ad", f.API_PRIORITY_OTHER);
        if (iUef != Integer.MAX_VALUE) {
            return iUef;
        }
        int iRt = gb.rt();
        if (iRt == 1 || iRt == 2) {
            return 2;
        }
        return iRt != 3 ? 0 : 1;
    }

    public String rl() {
        return this.cq.uef("app_log_url", "");
    }

    public int rt() {
        return this.cq.uef(f25741oa, 10000);
    }

    public String sk() {
        return this.cq.uef("settings_url", "");
    }

    public void sw() {
        wk.oa().removeCallbacks(this.dhk);
        wk.oa().postDelayed(this.dhk, jkf());
    }

    public String swd() {
        return this.cq.uef("policy_url", "");
    }

    public boolean sy() {
        return this.cq.uef("ad_revenue_enable", true);
    }

    public boolean syr() {
        return this.cq.uef("token_enable", 0) == 1;
    }

    public com.bytedance.sdk.openadsdk.moa.uef.zjm tam() {
        return (com.bytedance.sdk.openadsdk.moa.uef.zjm) this.cq.uef("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.moa.uef.zjm.uef, this.bcc);
    }

    public int tc() {
        int iUef = this.cq.uef("bus_con_auto_click_delay", 3000);
        if (iUef <= 0) {
            return 3000;
        }
        return iUef;
    }

    public int tpx() {
        return this.cq.uef("bus_con_behavior_count", 300);
    }

    public int ue() {
        return this.cq.uef("bus_con_slide_num", 2);
    }

    public Set<String> uf() {
        return (Set) this.cq.uef("token_adx_ids", Collections.EMPTY_SET, lw.f25746oa);
    }

    public boolean uqx() {
        int iUef = this.cq.uef("privacy_ad_enable", f.API_PRIORITY_OTHER);
        if (iUef == 1) {
            return true;
        }
        if (iUef == 0) {
            return false;
        }
        int iRt = gb.rt();
        return iRt == 1 || iRt == 2 || iRt == 3;
    }

    public Set<String> us() {
        return (Set) this.cq.uef("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, lw.f25746oa);
    }

    public int vep() {
        return this.cq.uef("perf_con_sync_gaid", 0);
    }

    public boolean vj() {
        if (com.bytedance.sdk.component.adexpress.moa.oa.uef(sy.uef())) {
            return this.cq.uef("support_rtl", false);
        }
        return false;
    }

    public String[] vjj() {
        Set<String> set;
        try {
            set = this.zjm;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.cq.uef("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    this.zjm.add(jSONArray.getString(i5));
                }
            }
            Set<String> setUef = bcc.uef(this.zjm);
            this.zjm = setUef;
            if (setUef != null) {
                if (setUef.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.zjm.toArray(new String[0]);
    }

    public boolean vyg() {
        return this.wk;
    }

    public int wk() {
        wd();
        return this.f25742ab;
    }

    public int wrv() {
        return this.cq.uef("perf_con_drawable_code", 0);
    }

    public boolean wxf() {
        return this.cq.uef("global_rate", 1.0f) == 1.0f;
    }

    public long xs() {
        return this.cq.uef("data_time", 0L);
    }

    public boolean xvp() {
        return this.dz.get();
    }

    public String zjm() {
        return this.cq.uef("ab_test_version", "");
    }

    public boolean zou() {
        return this.cq.uef("bus_con_sec_type", f.API_PRIORITY_OTHER) != 0;
    }

    private dj() {
        this.zjm = DesugarCollections.synchronizedSet(new HashSet());
        this.wrv = new com.bytedance.sdk.openadsdk.core.settings.uef();
        this.cq = new bcc(new zjm.uef() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.zjm.uef
            public void oa() {
                com.bytedance.sdk.openadsdk.core.dj.oa.uef().wk();
                if (dj.oib == null || dj.oib.isEmpty()) {
                    return;
                }
                Iterator it = dj.oib.iterator();
                while (it.hasNext()) {
                    ((zjm.uef) it.next()).oa();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.zjm.uef
            public void uef() {
                zjm.uef[] uefVarArr;
                boolean unused = dj.dj = true;
                com.bytedance.sdk.openadsdk.core.dj.oa.uef().dz();
                if (dj.oib == null || dj.oib.size() == 0 || (uefVarArr = (zjm.uef[]) dj.oib.toArray()) == null) {
                    return;
                }
                for (zjm.uef uefVar : uefVarArr) {
                    uefVar.uef();
                }
            }
        });
        this.dz = new AtomicBoolean(false);
        this.wk = false;
        this.f25742ab = 5000;
        this.bs = 10;
        this.dhk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.7
            @Override // java.lang.Runnable
            public void run() {
                dj.this.uef(2, false);
                dj.this.sw();
            }
        };
        this.tpx = new lw.oa<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.lw.oa
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> oa(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt < 0 || iOptInt > 100) {
                                map.put(next, 100);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    return map;
                } catch (Exception e7) {
                    dhk.yo("get applog rate from sp failed:" + e7.getMessage(), new Object[0]);
                    return null;
                }
            }
        };
        this.orq = new HashSet();
        this.gzw = new lw.oa<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.lw.oa
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public Set<String> oa(String str) throws JSONException {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            dj.this.bs = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            dj.this.f25742ab = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                String string = jSONArray.getString(i5);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e7) {
                        Log.i("TTAD.SdkSettings", e7.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.gsd = new lw.oa<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.lw.oa
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public JSONObject oa(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    dhk.yo("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.bcc = new lw.oa<com.bytedance.sdk.openadsdk.moa.uef.zjm>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.lw.oa
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.moa.uef.zjm oa(String str) {
                com.bytedance.sdk.openadsdk.moa.uef.zjm zjmVar = new com.bytedance.sdk.openadsdk.moa.uef.zjm();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    zjmVar.uef(jSONObject.optInt("enable_strategy", 0) == 1);
                    zjmVar.uef(uef(jSONObject.optJSONObject(BuildConfig.FLAVOR)));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zjmVar.uef(next, uef(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return zjmVar;
            }

            private zjm.uef uef(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new zjm.uef(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
    }

    public static void ku(String str) {
        if (str == null) {
            str = "";
        }
        String strWf = wf();
        if (strWf == null || !strWf.equals(str)) {
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("settings_host_from_meta", str);
            rt = str;
            oa().uef(8, true);
        }
    }

    private static SharedPreferences yo(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    public int ab(String str) {
        return ue(str).zjm;
    }

    public boolean bcc(String str) {
        return str == null || ue(str).dz == 1;
    }

    public boolean bs(String str) {
        return ue(str).orq == 0;
    }

    public boolean cp(String str) {
        Set<String> setUf;
        if (TextUtils.isEmpty(str) || (setUf = uf()) == null || setUf.size() == 0) {
            return false;
        }
        return setUf.contains(str);
    }

    public boolean cq(String str) {
        try {
            return ue(str).gzw != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public int cz(String str) {
        if (str == null) {
            return 1;
        }
        return ue(str).dz;
    }

    public int dhk(String str) {
        return ue(str).dhk;
    }

    public int dj(String str) {
        return ue(str).dj;
    }

    public boolean gr(String str) {
        return sy.moa().ue(str).wk == 1;
    }

    public int gsd(String str) {
        return ue(str).f25750ue;
    }

    public int gzw(String str) {
        return ue(str).gr;
    }

    public boolean ivm(String str) {
        return ue(str).xs == 1;
    }

    public boolean lw(String str) {
        int i5 = ue(str).lw;
        return i5 != 1 ? i5 == 2 && com.bytedance.sdk.component.utils.sy.yo(sy.uef()) != 0 : com.bytedance.sdk.component.utils.sy.moa(sy.uef());
    }

    public boolean moa(String str) {
        return ue(str).pz;
    }

    public JSONObject oib(String str) throws JSONException {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.cq.uef("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", ue(str).dxx);
                return jSONObject2;
            } catch (JSONException e7) {
                e = e7;
                jSONObject = jSONObject2;
                dhk.yo("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e10) {
            e = e10;
        }
    }

    public int orq(String str) {
        return ue(str).rt;
    }

    public boolean pz(String str) {
        Set set = (Set) this.cq.uef("privacy_fields_allowed", Collections.EMPTY_SET, lw.f25746oa);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iRt = gb.rt();
        if (iRt != 1) {
            if (iRt != 2 && iRt != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean rt(String str) {
        return ue(str).ku;
    }

    public boolean sy(String str) {
        return str == null || DeviceUtils.zjm(sy.uef()) == 0 || ue(str).cq == 1;
    }

    public boolean tpx(String str) {
        return ue(str).tpx;
    }

    public oa ue(String str) {
        return yo.uef(str);
    }

    public int wrv(String str) {
        return ue(str).wrv;
    }

    public int xs(String str) {
        return ue(str).sy;
    }

    public int zjm(String str) {
        return str == null ? TTAdConstant.STYLE_SIZE_RADIO_3_2 : ue(str).f25748ab;
    }

    public int dz(String str) {
        return ue(String.valueOf(str)).bcc;
    }

    public void uef() {
        File file;
        try {
            yo.uef();
            this.cq.moa();
            this.wrv.moa();
            Context contextUef = sy.uef();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                file = new File(contextUef.getDataDir(), "shared_prefs");
            } else {
                file = new File(contextUef.getDatabasePath(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).getParentFile().getParentFile(), "shared_prefs");
            }
            File file2 = new File(file, "tt_sdk_settings.xml");
            if (file2.exists() && file2.isFile()) {
                String strReplace = file2.getName().replace(".xml", "");
                if (i5 >= 24) {
                    contextUef.deleteSharedPreferences(strReplace);
                } else {
                    contextUef.getSharedPreferences(strReplace, 0).edit().clear().apply();
                    com.bytedance.sdk.component.utils.xs.yo(file2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean wk(String str) {
        return dz(str) != 1;
    }

    public synchronized void yo() {
        SystemClock.elapsedRealtime();
        boolean z2 = this.wk;
        this.wrv.uef(this.wk);
        this.cq.uef(this.wk);
        yo.uef(!z2);
        this.wk = true;
        SystemClock.elapsedRealtime();
        if (!z2) {
            wk.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.3
                @Override // java.lang.Runnable
                public void run() {
                    dj.this.uef(1, com.bytedance.sdk.openadsdk.core.dj.oa.uef().xs() || com.bytedance.sdk.openadsdk.core.dj.oa.uef().zjm());
                    dj.this.sw();
                }
            }, 1000L);
        }
    }

    public static String oa(Context context) {
        SharedPreferences sharedPreferencesYo;
        return (context == null || (sharedPreferencesYo = yo(context)) == null) ? "" : sharedPreferencesYo.getString(ivm, "");
    }

    public static dj oa() {
        return uef.uef;
    }

    public int oa(String str) {
        Integer num;
        Map map = (Map) this.cq.uef("perf_con_applog_rate", null, this.tpx);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public int oa(int i5) {
        return ue(String.valueOf(i5)).f25749oa;
    }

    public boolean yo(String str) {
        return ue(str).yo == 1;
    }

    public int yo(int i5) {
        return ue(String.valueOf(i5)).cz;
    }

    public static int uef(Context context) {
        if (context == null) {
            return -2;
        }
        try {
            SharedPreferences sharedPreferencesYo = yo(context);
            if (sharedPreferencesYo == null) {
                return -2;
            }
            int i5 = sharedPreferencesYo.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
            int i10 = sharedPreferencesYo.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
            if (i5 == Integer.MIN_VALUE && i10 == Integer.MIN_VALUE) {
                return -2;
            }
            return sharedPreferencesYo.getInt("IABTCF_gdprApplies", -1);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public void uef(JSONObject jSONObject, lw.uef uefVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        bcc bccVar = this.cq;
        String str = cz;
        String strUef = bccVar.uef("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strUef) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strUef)) {
            wk.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(dj.this.cq.uef("dyn_draw_engine_url", dj.cz), strOptString)) {
                        com.bytedance.sdk.component.adexpress.uef.oa.lw.oa().yo();
                    }
                }
            }, 5000L);
        }
        uefVar.uef("dyn_draw_engine_url", strOptString);
    }

    public int uef(String str) {
        if (str == null) {
            return 0;
        }
        return sy.moa().ue(str).oib;
    }

    public int uef(int i5) {
        return ue(String.valueOf(i5)).fz;
    }

    public void uef(long j8) {
        this.cq.oa().uef("last_req_time", j8).uef();
    }

    public void uef(@TTSdkSettings.FETCH_REQUEST_SOURCE final int i5, boolean z2) {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().moa()) {
            return;
        }
        if (!wk.lw() && i5 != 1 && i5 != 2) {
            if (z2) {
                this.sy = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.zjm.oa().moa())) {
                return;
            }
            if (this.sy) {
                this.sy = false;
                if (!z2) {
                    z2 = true;
                }
            }
            long jGgp = ggp();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jJkf = jkf();
            long j8 = jCurrentTimeMillis - jGgp;
            if ((z2 || j8 >= jJkf) && this.dz.compareAndSet(false, true)) {
                km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("setting_req") { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.dj.oa.uef().uef(new com.bytedance.sdk.openadsdk.core.dj.moa() { // from class: com.bytedance.sdk.openadsdk.core.settings.dj.6.1
                            @Override // com.bytedance.sdk.openadsdk.core.dj.moa
                            public void uef(boolean z10) {
                                if (!z10) {
                                    dj.this.dz.set(false);
                                } else {
                                    dj djVar = dj.this;
                                    new cz(djVar, djVar.cq, dj.this.wrv).run();
                                }
                            }
                        }, i5 == 6);
                    }
                });
                wk.oa().removeCallbacks(this.dhk);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.cz.uef
    public void uef(boolean z2) {
        Set<String> setNj;
        this.dz.set(false);
        sw();
        if (z2) {
            HashMap map = new HashMap();
            Set<String> setAje = aje();
            if (setAje != null && !setAje.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setAje);
            }
            String strSy = gb.sy();
            if (!TextUtils.isEmpty(strSy)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strSy);
            }
            if (com.bytedance.sdk.openadsdk.utils.oa.oa() && (setNj = oa().nj()) != null && !setNj.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, setNj);
            } else {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, jp());
            com.bytedance.sdk.openadsdk.core.wrv.yo.uef(map);
        }
    }

    public static void uef(zjm.uef uefVar) {
        ConcurrentLinkedQueue<zjm.uef> concurrentLinkedQueue = oib;
        if (concurrentLinkedQueue.contains(uefVar)) {
            return;
        }
        concurrentLinkedQueue.add(uefVar);
    }
}

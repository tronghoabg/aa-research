package com.bytedance.sdk.openadsdk.orq;

import N0.a;
import Va.M6;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bcc {

    /* renamed from: ab, reason: collision with root package name */
    private boolean f26058ab;
    private String af;
    private boolean agr;
    private float aje;
    private int aos;
    private boolean au;
    private boolean az;
    private final Handler bcc;
    private boolean bs;
    private int bx;

    /* renamed from: cc, reason: collision with root package name */
    private int f26059cc;
    private String cl;
    private int cop;
    private long cp;
    private Runnable cq;
    private Runnable cz;

    /* renamed from: df, reason: collision with root package name */
    private boolean f26060df;
    private yo dh;
    private String dhk;
    private Runnable dj;
    private int dor;
    private int dv;
    private long dxx;
    private int dy;
    private Runnable dz;
    private boolean efa;
    private int ej;
    private volatile boolean em;
    private int etd;
    private JSONObject fjj;
    private long fz;
    private JSONObject fzf;
    private long gb;
    private int gem;
    private uef ggp;
    private boolean gk;
    private long gr;
    private boolean gsd;
    private boolean gzw;
    private String hdd;

    /* renamed from: hg, reason: collision with root package name */
    private int f26061hg;
    private long hnk;
    private int hts;
    private volatile boolean hw;
    private int ifk;
    private String iou;
    private final String ivm;
    private ivm ix;
    private int jkf;
    private int jp;
    private boolean jx;
    private String kik;
    private long km;
    private long ku;
    private JSONObject lo;
    private String lpy;
    public final String lw;
    private long lz;
    private int meb;
    public final String moa;

    /* renamed from: ne, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.orq.uef f26062ne;
    private int nj;
    private boolean nkh;
    private List<JSONObject> no;

    /* renamed from: oa, reason: collision with root package name */
    public final String f26063oa;
    private Set<String> oib;
    private boolean orq;
    private int ot;
    private long ou;
    private long oyt;
    private long pu;
    private int pz;
    private String qn;
    private int rj;
    private String rl;
    private String rt;
    private String sk;
    private Context sw;
    private String swd;
    private boolean sy;
    private float syr;
    private Map<String, String> tam;

    /* renamed from: tc, reason: collision with root package name */
    private String f26064tc;
    private ViewTreeObserver.OnGlobalLayoutListener tkg;
    private String tpx;

    /* renamed from: try, reason: not valid java name */
    private String f4try;

    /* renamed from: ue, reason: collision with root package name */
    private long f26065ue;
    public final String uef;

    /* renamed from: uf, reason: collision with root package name */
    private float f26066uf;
    private String up;
    private int uqx;
    private String us;
    private String uu;
    private boolean uxr;
    private String vep;
    private WeakReference<View> vj;
    private JSONObject vjj;
    private int vup;
    private int vyg;

    /* renamed from: wd, reason: collision with root package name */
    private int f26067wd;

    /* renamed from: wf, reason: collision with root package name */
    private int f26068wf;
    private oa wk;
    private boolean wp;
    private final Handler wrv;
    private int wxf;
    private final String xs;
    private WebView xvp;
    private boolean xw;
    private int ykf;
    public final String yo;
    private Runnable zjm;
    private String zou;
    private boolean zrl;

    public enum uef {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private bcc(Context context, WebView webView, yo yoVar, com.bytedance.sdk.openadsdk.orq.uef uefVar, uef uefVar2) {
        this.ivm = "playable_stuck_check_ping";
        this.xs = "playable_apply_media_permission_callback";
        this.bcc = new Handler(Looper.getMainLooper());
        this.wrv = new Handler(Looper.getMainLooper());
        this.f26058ab = true;
        this.bs = true;
        this.sy = true;
        this.uef = "PL_sdk_playable_global_viewable";
        this.f26063oa = "PL_sdk_page_screen_blank";
        this.yo = "PL_sdk_playable_destroy_analyze_summary";
        this.moa = "PL_sdk_playable_hardware_dialog_cancel";
        this.lw = "PL_sdk_playable_hardware_dialog_setting";
        this.oib = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.dhk = null;
        this.tpx = "embeded_ad";
        this.orq = true;
        this.gzw = true;
        this.gsd = false;
        this.rt = "";
        this.gr = 10L;
        this.f26065ue = 10L;
        this.pz = 700;
        this.cp = 0L;
        this.ku = 0L;
        this.fz = -1L;
        this.dxx = -1L;
        this.lz = -1L;
        this.oyt = -1L;
        this.km = -1L;
        this.pu = -1L;
        this.gb = -1L;
        this.af = "";
        this.sk = "";
        this.rl = "";
        this.swd = "";
        this.gem = 0;
        this.cop = 0;
        this.au = false;
        this.dor = 0;
        this.etd = -1;
        this.uqx = 0;
        this.rj = 0;
        this.dv = 0;
        this.zou = null;
        this.nkh = false;
        this.hts = 0;
        this.vyg = 0;
        this.wxf = 0;
        this.f26061hg = 0;
        this.ou = 0L;
        this.hnk = 0L;
        this.ot = -2;
        this.jkf = 0;
        this.aos = 0;
        this.bx = 0;
        this.fzf = new JSONObject();
        this.tam = new HashMap();
        this.fjj = new JSONObject();
        this.qn = "";
        this.aje = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.syr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.uxr = false;
        this.az = false;
        this.jx = false;
        this.no = new ArrayList();
        this.agr = true;
        this.em = true;
        this.hw = true;
        this.tkg = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) bcc.this.vj.get();
                    if (view == null) {
                        return;
                    }
                    bcc.this.oa(view);
                } catch (Throwable th) {
                    xs.uef("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.vup = -1;
        this.ot = 0;
        this.ggp = uefVar2;
        this.xvp = webView;
        cz.uef(webView);
        uef(webView);
        uef(context, yoVar, uefVar);
    }

    public static /* synthetic */ int cq(bcc bccVar) {
        int i5 = bccVar.cop;
        bccVar.cop = i5 + 1;
        return i5;
    }

    private void rl() {
        String str;
        if (this.fjj == null || (str = this.us) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.fjj.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.us).getHost();
        if (TextUtils.isEmpty(host)) {
            this.us = M6.t(new StringBuilder(), this.us, "/cid_", strOptString);
        } else {
            this.us = this.us.replace(host, a.g(host, "/cid_", strOptString));
        }
    }

    private void sk() {
        this.wk = new oa(this, this.pz);
        this.cz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.5
            @Override // java.lang.Runnable
            public void run() {
                if (bcc.this.orq) {
                    bcc.this.orq = false;
                    bcc.this.bcc.removeCallbacks(bcc.this.zjm);
                    bcc.this.uef(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.zjm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.6
            @Override // java.lang.Runnable
            public void run() {
                if (bcc.this.orq) {
                    bcc.this.orq = false;
                    bcc.this.em = false;
                    bcc.this.bcc.removeCallbacks(bcc.this.cz);
                    bcc.this.uef(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.cq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (bcc.this.xvp != null) {
                    bcc.this.xvp.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.7.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (bcc.this.wk != null) {
                                bcc.this.wk.uef(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (bcc.this.wrv != null) {
                    bcc.this.wrv.postDelayed(this, 500L);
                }
            }
        };
        this.dz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                bcc.this.uef("playable_stuck_check_ping", new JSONObject());
                if (bcc.this.wrv != null) {
                    bcc.this.wrv.postDelayed(this, 500L);
                }
            }
        };
        this.dj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.9
            @Override // java.lang.Runnable
            public void run() {
                if (bcc.this.hnk <= 0) {
                    bcc.this.oa(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (bcc.this.hnk - bcc.this.ou > bcc.this.pz) {
                        bcc.this.oa(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    bcc.this.dxx();
                    bcc.this.ou = 0L;
                    bcc.this.hnk = 0L;
                }
            }
        };
    }

    private void swd() {
        Runnable runnable;
        Runnable runnable2;
        this.wk.uef(System.currentTimeMillis());
        Handler handler = this.wrv;
        if (handler != null) {
            int i5 = this.ot;
            if (i5 == 0 && (runnable2 = this.cq) != null) {
                handler.post(runnable2);
            } else if ((i5 == 1 || i5 == 2) && (runnable = this.dz) != null) {
                handler.post(runnable);
            }
            this.wk.uef(500);
        }
    }

    public static /* synthetic */ int wrv(bcc bccVar) {
        int i5 = bccVar.gem;
        bccVar.gem = i5 + 1;
        return i5;
    }

    public String ab() {
        com.bytedance.sdk.openadsdk.orq.uef uefVar;
        if (TextUtils.isEmpty(this.rl) && (uefVar = this.f26062ne) != null) {
            this.rl = uefVar.uef().toString();
        }
        return this.rl;
    }

    public int af() {
        return this.vup;
    }

    public com.bytedance.sdk.openadsdk.orq.uef bs() {
        return this.f26062ne;
    }

    public void cp() {
        oa oaVar;
        this.hnk = System.currentTimeMillis();
        int i5 = this.ot;
        if ((i5 == 1 || i5 == 2) && (oaVar = this.wk) != null) {
            oaVar.uef(System.currentTimeMillis());
        }
    }

    public JSONObject dhk() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.f26066uf);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.nj);
            jSONObject2.put("height", this.jp);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.ykf);
            jSONObject3.put("y", this.f26068wf);
            jSONObject3.put("width", this.meb);
            jSONObject3.put("height", this.dy);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.ifk);
            jSONObject4.put("y", this.f26067wd);
            jSONObject4.put("width", this.ej);
            jSONObject4.put("height", this.f26059cc);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public void dxx() {
        if (this.gzw) {
            this.pu = System.currentTimeMillis();
            if (this.ggp == uef.FEED_AWEME) {
                if (this.f26060df && this.jkf == 3) {
                    oa oaVar = this.wk;
                    if (oaVar != null && oaVar.oa()) {
                        swd();
                        return;
                    } else {
                        if (this.wk == null) {
                            this.wk = new oa(this, this.pz);
                            swd();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.f26060df && this.jkf == 2) {
                oa oaVar2 = this.wk;
                if (oaVar2 != null && oaVar2.oa()) {
                    swd();
                } else if (this.wk == null) {
                    this.wk = new oa(this, this.pz);
                    swd();
                }
            }
        }
    }

    public JSONObject dz() {
        boolean zUef;
        boolean zUef2;
        try {
            boolean z2 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zUef = lw.uef(this.sw, "android.permission.READ_MEDIA_IMAGES");
                zUef2 = true;
            } else {
                zUef = lw.uef(this.sw, "android.permission.READ_EXTERNAL_STORAGE");
                zUef2 = lw.uef(this.sw, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zUef);
            jSONObject.put("isHasWrite", zUef2);
            if (!zUef || !zUef2) {
                z2 = false;
            }
            jSONObject.put("result", z2);
            return jSONObject;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void fz() {
        this.hw = false;
        this.bcc.removeCallbacks(this.zjm);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.lz > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.lz);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            yo("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public String gb() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public void gr() {
        if (this.f26062ne != null) {
            uef uefVar = uef.LAND_PAGE;
        }
    }

    public void gsd() {
        this.etd = 2;
    }

    public void gzw() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.km > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.km);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.lz > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.lz;
                this.gb = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            yo("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void km() {
        if (this.jx) {
            return;
        }
        this.jx = true;
        this.ku = 0L;
        this.bs = true;
        oyt();
        try {
            View view = this.vj.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.tkg);
            }
        } catch (Throwable unused) {
        }
        try {
            this.ix.oa();
        } catch (Throwable unused2) {
        }
        try {
            oa oaVar = this.wk;
            if (oaVar != null) {
                oaVar.uef();
                this.wk = null;
            }
            Handler handler = this.wrv;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.us)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.gem);
                jSONObject.put("playable_hit_times", this.cop);
                int i5 = this.gem;
                if (i5 > 0) {
                    jSONObject.put("playable_hit_ratio", this.cop / (i5 * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                yo("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.us)) {
                if (this.fz != -1) {
                    this.cp += System.currentTimeMillis() - this.fz;
                    this.fz = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.cp);
                yo("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.em = false;
        this.hw = false;
        this.bcc.removeCallbacks(this.cz);
        this.bcc.removeCallbacks(this.zjm);
        this.bcc.removeCallbacksAndMessages(null);
    }

    public void ku() {
        int i5;
        int i10 = this.ot;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (this.em) {
                this.bcc.postDelayed(this.cz, this.gr * 1000);
            }
            if ((this.hw && wrv(this.us)) || (i5 = this.ot) == 1 || i5 == 2) {
                this.bcc.postDelayed(this.zjm, this.f26065ue * 1000);
            }
        }
    }

    public void lz() {
        try {
            oa oaVar = this.wk;
            if (oaVar != null) {
                oaVar.uef();
            }
            Handler handler = this.wrv;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public JSONObject oib() {
        return this.fjj;
    }

    public void orq() {
        com.bytedance.sdk.openadsdk.orq.uef uefVar = this.f26062ne;
        if (uefVar != null) {
            uefVar.yo();
        }
    }

    public void oyt() {
        this.aos = 0;
        this.bx = 0;
        this.f26066uf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.nj = 0;
        this.jp = 0;
        this.f26068wf = 0;
        this.ykf = 0;
        this.meb = 0;
        this.dy = 0;
        this.f26067wd = 0;
        this.ifk = 0;
        this.ej = 0;
        this.f26059cc = 0;
    }

    public int pu() {
        return (this.dxx == -1 || !this.f26060df) ? 1 : 2;
    }

    public void pz() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.km > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.km);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.lz > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.lz);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            yo("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void rt() {
        this.nkh = true;
    }

    public JSONObject sy() {
        if (this.fzf.isNull("width")) {
            View view = this.vj.get();
            if (view == null) {
                return this.fzf;
            }
            oa(view);
        }
        return this.fzf;
    }

    public void tpx() {
        com.bytedance.sdk.openadsdk.orq.uef uefVar = this.f26062ne;
        if (uefVar != null) {
            uefVar.oa();
        }
    }

    public void ue() {
        if (this.f26062ne != null) {
            uef uefVar = uef.LAND_PAGE;
        }
    }

    public JSONObject wk() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.ggp.ordinal());
            jSONObject.put("safe_area_top_height", this.aje);
            jSONObject.put("safe_area_bottom_height", this.syr);
            jSONObject.put("playable_enter_from", this.rj);
            jSONObject.put("playable_retry_count", this.uqx);
            jSONObject.put("playable_card_session", this.af);
            jSONObject.put("playable_video_session", this.sk);
            jSONObject.put("playable_network_type", ab());
            jSONObject.put("aweme_id", this.swd);
            return jSONObject;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    private boolean wrv(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public boolean bcc() {
        return this.wp;
    }

    public JSONObject cq() {
        try {
            boolean zUef = lw.uef(this.sw, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zUef);
            return jSONObject;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public boolean cz() {
        return this.f26060df;
    }

    public Set<String> dj() {
        return this.ix.uef();
    }

    public String ivm() {
        return this.f26064tc;
    }

    public String lw() {
        return this.cl;
    }

    public String moa() {
        return this.hdd;
    }

    public String xs() {
        return this.lpy;
    }

    public JSONObject yo() {
        return this.lo;
    }

    public JSONObject zjm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.efa);
            return jSONObject;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public JSONObject bcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", lw.oa(this.sw, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put("result", lw.oa(this.sw, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put("result", lw.uef(this.sw));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void cz(String str) {
        WebView webView;
        boolean z2 = this.jkf == -1;
        this.jkf = 2;
        if (!z2) {
            this.vep = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.oyt = jCurrentTimeMillis;
                long j8 = this.lz;
                jSONObject.put("playable_html_load_start_duration", j8 != -1 ? jCurrentTimeMillis - j8 : 0L);
                jSONObject.put("playable_has_show", pu());
            } catch (Throwable th) {
                xs.uef("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            yo("PL_sdk_html_load_finish", jSONObject);
        }
        this.em = false;
        this.bcc.removeCallbacks(this.cz);
        try {
            if (this.ot == 0) {
                if (this.f26058ab && (webView = this.xvp) != null) {
                    this.f26058ab = false;
                    webView.evaluateJavascript(gb(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                dxx();
            }
        } catch (Throwable th2) {
            xs.uef("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void dj(String str) {
        this.bcc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.3
            @Override // java.lang.Runnable
            public void run() {
                bcc.cq(bcc.this);
            }
        });
    }

    public bcc ivm(String str) {
        this.tpx = str;
        return this;
    }

    public bcc lw(String str) {
        this.lpy = str;
        return this;
    }

    public bcc moa(String str) {
        this.f26064tc = str;
        return this;
    }

    public JSONObject wrv() {
        try {
            boolean zUef = lw.uef(this.sw, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zUef);
            return jSONObject;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public bcc xs(String str) {
        int iIndexOf;
        String strDecode;
        this.qn = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.ot == -1) {
                            oa(2);
                        } else {
                            oa(1);
                        }
                    }
                } else {
                    oa(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                oa(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.us = str;
        return this;
    }

    public bcc yo(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.lo = jSONObject;
            return this;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.aos == view.getWidth() && this.bx == view.getHeight()) {
                return;
            }
            this.aos = view.getWidth();
            this.bx = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.aos);
            jSONObject.put("height", this.bx);
            uef("resize", jSONObject);
            this.fzf = jSONObject;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public void ivm(JSONObject jSONObject) {
        oa(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void lw(JSONObject jSONObject) {
        this.vjj = jSONObject;
        this.dv++;
        lz();
        this.bcc.removeCallbacks(this.dj);
        if (this.gzw) {
            this.pu = System.currentTimeMillis();
            this.ou = System.currentTimeMillis();
            this.hnk = 0L;
            int i5 = this.ot;
            if (i5 == 0) {
                WebView webView = this.xvp;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.10
                        @Override // android.webkit.ValueCallback
                        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            bcc.this.hnk = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i5 == 1 || i5 == 2) {
                uef("playable_stuck_check_ping", new JSONObject());
            }
            this.bcc.postDelayed(this.dj, this.pz);
        }
    }

    public bcc moa(boolean z2) {
        this.efa = z2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.efa);
            uef("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    private void uef(Context context, yo yoVar, com.bytedance.sdk.openadsdk.orq.uef uefVar) {
        this.dhk = UUID.randomUUID().toString();
        this.sw = context;
        this.f26062ne = uefVar;
        this.dh = yoVar;
        zjm.uef(uefVar);
        this.ix = new ivm(this);
        sk();
        if (this.xvp == null) {
            this.vup = 4;
            this.bcc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.4
                @Override // java.lang.Runnable
                public void run() {
                    bcc.this.uef(5, "webview is null");
                }
            });
        }
    }

    public void zjm(String str) {
        this.bcc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.2
            @Override // java.lang.Runnable
            public void run() {
                bcc.wrv(bcc.this);
            }
        });
    }

    public void ivm(boolean z2) {
        this.gk = z2;
    }

    public bcc yo(boolean z2) throws JSONException {
        if (this.vup != -1 && this.f26060df != z2) {
            this.f26060df = z2;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.f26060df) {
                    jSONObject.put("playable_background_show_type", this.vyg);
                }
            } catch (JSONException unused) {
            }
            yo(this.f26060df ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.dxx == -1 && this.f26060df) {
                this.dxx = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.vup == 1 ? 1 : 2);
                    int i5 = this.vup;
                    if (i5 != -1) {
                        jSONObject2.put("webview_state", i5);
                    }
                } catch (JSONException unused2) {
                }
                yo("PL_sdk_page_show", jSONObject2);
            }
            if (this.dxx != -1 && !this.f26060df && !this.uxr) {
                this.uxr = true;
            }
            if (this.f26060df) {
                this.fz = System.currentTimeMillis();
            } else if (this.fz != -1) {
                this.cp += System.currentTimeMillis() - this.fz;
                this.fz = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.f26060df);
                uef("viewableChange", jSONObject3);
            } catch (Throwable th) {
                xs.uef("PlayablePlugin", "setViewable error", th);
            }
            if (this.f26060df) {
                dxx();
            } else {
                lz();
            }
        }
        return this;
    }

    public void moa(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.zou = jSONObject.optString("section");
        }
    }

    private String moa(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.us = str3;
        return str3;
    }

    public void bcc(String str) {
        this.jkf = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.lz = jCurrentTimeMillis;
            long j8 = this.dxx;
            jSONObject.put("playable_page_show_duration", j8 != -1 ? jCurrentTimeMillis - j8 : 0L);
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        yo("PL_sdk_html_load_start", jSONObject);
        this.em = true;
        this.hw = true;
        if (this.agr) {
            ku();
            this.em = false;
            this.hw = false;
        }
        if (this.bs) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (lw.uef(this.sw, lw.wrv)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    if (lw.oa(this.sw, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (lw.uef(this.sw, lw.dj)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (lw.uef(this.sw, lw.zjm)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (lw.uef(this.sw, lw.cz)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (lw.uef(this.sw, lw.bcc)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    if (lw.oa(this.sw, "android.permission.CAMERA")) {
                        stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (lw.uef(this.sw, lw.xs)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    if (lw.uef(this.sw)) {
                        stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                yo("PL_sdk_hardware_detect", jSONObject2);
                this.bs = false;
            } catch (Throwable th2) {
                xs.uef("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public JSONObject moa(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (xs.uef() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectUef = this.ix.uef(str, jSONObject);
        if (xs.uef()) {
            System.currentTimeMillis();
            if (jSONObjectUef != null) {
                jSONObjectUef.toString();
            }
        }
        return jSONObjectUef;
    }

    public Map<String, String> oa() {
        return this.tam;
    }

    public bcc oa(String str) {
        this.hdd = str;
        return this;
    }

    public bcc oa(boolean z2) {
        this.xw = z2;
        return this;
    }

    public void uef(View view) {
        if (view == null) {
            return;
        }
        try {
            this.vj = new WeakReference<>(view);
            oa(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.tkg);
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public bcc oa(long j8) {
        if (j8 <= 0) {
            this.f26065ue = 10L;
            return this;
        }
        this.f26065ue = j8;
        return this;
    }

    private void lw(String str, JSONObject jSONObject) throws JSONException {
        try {
            int i5 = this.ot;
            if (i5 == 0) {
                if (this.ggp != uef.LAND_PAGE && !wrv(this.us)) {
                    rl();
                }
                jSONObject.put("playable_url", this.us);
            } else if (i5 == 3 || i5 == 4) {
                jSONObject.put("playable_url", moa(this.iou, this.f4try));
            } else if (i5 == 1 || i5 == 2) {
                jSONObject.put("playable_url", yo(this.kik, this.up));
            }
            jSONObject.put("playable_render_type", this.ot);
            if (this.f26062ne != null) {
                if (this.ot == 0 && (this.ggp != uef.LAND_PAGE || wrv(this.us))) {
                    this.f26062ne.uef(jSONObject);
                } else if (this.ot != 0) {
                    this.f26062ne.uef(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void oa(JSONObject jSONObject) {
        if (this.f26062ne != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context uef() {
        return this.sw;
    }

    public void oa(String str, String str2) {
        Bitmap bitmapUef;
        if (TextUtils.isEmpty(str2) || (bitmapUef = lw.uef(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.sw.getContentResolver(), bitmapUef, str, "");
    }

    public bcc uef(String str, String str2) {
        this.tam.put(str, str2);
        return this;
    }

    public bcc uef(String str) {
        this.cl = str;
        return this;
    }

    public void cz(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.jkf = 3;
                dxx();
            } else {
                this.jkf = -2;
            }
            if (zOptBoolean || !this.orq) {
                return;
            }
            this.orq = false;
            this.em = false;
            this.hw = false;
            this.bcc.removeCallbacks(this.cz);
            this.bcc.removeCallbacks(this.zjm);
            uef(4, "CaseRenderFail");
        }
    }

    public bcc uef(boolean z2) {
        this.wp = z2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.wp);
            uef("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public bcc oa(int i5) {
        this.ot = i5;
        return this;
    }

    public JSONObject xs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return wrv();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : dz();
        }
        return cq();
    }

    public void oa(int i5, String str) {
        this.etd = i5;
        if (this.vjj == null) {
            this.vjj = new JSONObject();
        }
        try {
            this.vjj.put("playable_stuck_type", i5);
            this.vjj.put("playable_stuck_reason", str);
            if (this.pu > 0) {
                this.vjj.put("playable_stuck_duration", System.currentTimeMillis() - this.pu);
            } else {
                this.vjj.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        yo("PL_sdk_page_stuck", this.vjj);
        lz();
        if (this.f26062ne == null || i5 != 2) {
            return;
        }
        this.vjj = new JSONObject();
    }

    public bcc uef(long j8) {
        if (j8 <= 0) {
            this.gr = 10L;
            return this;
        }
        this.gr = j8;
        return this;
    }

    public bcc lw(boolean z2) {
        this.agr = z2;
        return this;
    }

    public void uef(int i5) {
        this.vup = i5;
    }

    public void xs(boolean z2) {
        this.zrl = z2;
    }

    public void uef(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.orq.uef uefVar = this.f26062ne;
        if (uefVar == null || uefVar.oa(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            oa(strOptString2, strOptString);
        }
    }

    public bcc yo(JSONObject jSONObject) {
        this.fjj = jSONObject;
        return this;
    }

    private void yo(int i5, String str) {
        com.bytedance.sdk.openadsdk.orq.uef uefVar = this.f26062ne;
        if (uefVar != null) {
            uefVar.uef(i5, str);
        }
    }

    public void oa(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        lw(str, jSONObject);
    }

    public void uef(String str, JSONObject jSONObject) {
        if (this.zrl) {
            if (!xs.uef() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (xs.uef() && jSONObject != null) {
            jSONObject.toString();
        }
        yo yoVar = this.dh;
        if (yoVar != null) {
            yoVar.uef(str, jSONObject);
        }
    }

    private String yo(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.uu) && !TextUtils.isEmpty(this.qn)) {
            Uri uri = Uri.parse(this.qn);
            String host = uri.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.uu = builderAppendQueryParameter.toString();
        }
        return this.uu;
    }

    public bcc uef(float f10) {
        this.f26066uf = f10;
        return this;
    }

    public void uef(int i5, String str) {
        lz();
        yo(i5, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i5);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "reportRenderFatal error", th);
        }
        yo("PL_sdk_global_faild", jSONObject);
    }

    public void yo(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.au && this.cop > 0) {
                this.au = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.gk ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.f26060df);
            jSONObject.put("playable_session_id", this.dhk);
            int i5 = this.ot;
            if (i5 == 0) {
                if (this.ggp != uef.LAND_PAGE && !wrv(this.us)) {
                    rl();
                }
                jSONObject.put("playable_url", this.us);
            } else if (i5 == 3 || i5 == 4) {
                jSONObject.put("playable_url", moa(this.iou, this.f4try));
            } else if (i5 == 1 || i5 == 2) {
                jSONObject.put("playable_url", yo(this.kik, this.up));
            }
            jSONObject.put("playable_full_url", this.qn);
            jSONObject.put("playable_replay_count", this.dor);
            jSONObject.put("playable_is_prerender", this.xw);
            jSONObject.put("playable_is_preload", this.au);
            jSONObject.put("playable_render_type", this.ot);
            jSONObject.put("playable_scenes_type", this.ggp.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.kik) ? "" : this.kik);
            if (!TextUtils.isEmpty(this.up)) {
                str2 = this.up;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.iou);
            jSONObject.put("playable_minigamelite_schema", this.f4try);
            jSONObject.put("playable_is_debug", this.az);
            jSONObject.put("playable_retry_count", this.uqx);
            jSONObject.put("playable_enter_from", this.rj);
            jSONObject.put("playable_sequence", this.dv);
            jSONObject.put("playable_current_section", this.zou);
            jSONObject.put("is_playable_finish", this.nkh);
            jSONObject.put("playable_card_session", this.af);
            jSONObject.put("playable_video_session", this.sk);
            jSONObject.put("playable_network_type", ab());
            jSONObject.put("playable_lynx_version", this.rt);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.tpx);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            jSONObject2.put("refer", "playable");
            jSONObject2.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, this.fjj.opt("cid"));
            jSONObject2.put("log_extra", this.fjj.opt("log_extra"));
            int i10 = this.ot;
            if (i10 != -1 && i10 != -2) {
                if (this.f26062ne != null) {
                    List<JSONObject> list = this.no;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.no.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.ot);
                                jSONObjectOptJSONObject.put("playable_url", this.us);
                            }
                            this.f26062ne.uef(jSONObjectOptJSONObject);
                        }
                        this.no.clear();
                    }
                    if (this.ot == 0 && (this.ggp != uef.LAND_PAGE || wrv(this.us))) {
                        this.f26062ne.uef(jSONObject);
                        return;
                    } else {
                        if (this.ot != 0) {
                            this.f26062ne.uef(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.no == null) {
                this.no = new ArrayList();
            }
            this.no.add(jSONObject2);
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void uef(int i5, String str, String str2) {
        this.jkf = -1;
        this.vep = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i5);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", pu());
        } catch (Throwable th) {
            xs.uef("PlayablePlugin", "onWebReceivedError error", th);
        }
        yo("PL_sdk_html_load_error", jSONObject);
        if (this.orq) {
            this.orq = false;
            this.em = false;
            this.hw = false;
            this.bcc.removeCallbacks(this.cz);
            this.bcc.removeCallbacks(this.zjm);
            uef(1, "ContainerLoadFail");
        }
    }

    public void uef(boolean z2, String str, int i5) {
        if (z2) {
            this.jkf = -1;
            this.vep = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i5);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", pu());
            } catch (Throwable th) {
                xs.uef("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            yo("PL_sdk_html_load_error", jSONObject);
            if (this.orq) {
                this.orq = false;
                this.em = false;
                this.hw = false;
                this.bcc.removeCallbacks(this.cz);
                this.bcc.removeCallbacks(this.zjm);
                uef(1, "ContainerLoadFail");
            }
        }
    }

    private bcc(Context context, int i5, yo yoVar, com.bytedance.sdk.openadsdk.orq.uef uefVar) {
        this.ivm = "playable_stuck_check_ping";
        this.xs = "playable_apply_media_permission_callback";
        this.bcc = new Handler(Looper.getMainLooper());
        this.wrv = new Handler(Looper.getMainLooper());
        this.f26058ab = true;
        this.bs = true;
        this.sy = true;
        this.uef = "PL_sdk_playable_global_viewable";
        this.f26063oa = "PL_sdk_page_screen_blank";
        this.yo = "PL_sdk_playable_destroy_analyze_summary";
        this.moa = "PL_sdk_playable_hardware_dialog_cancel";
        this.lw = "PL_sdk_playable_hardware_dialog_setting";
        this.oib = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.dhk = null;
        this.tpx = "embeded_ad";
        this.orq = true;
        this.gzw = true;
        this.gsd = false;
        this.rt = "";
        this.gr = 10L;
        this.f26065ue = 10L;
        this.pz = 700;
        this.cp = 0L;
        this.ku = 0L;
        this.fz = -1L;
        this.dxx = -1L;
        this.lz = -1L;
        this.oyt = -1L;
        this.km = -1L;
        this.pu = -1L;
        this.gb = -1L;
        this.af = "";
        this.sk = "";
        this.rl = "";
        this.swd = "";
        this.gem = 0;
        this.cop = 0;
        this.au = false;
        this.dor = 0;
        this.etd = -1;
        this.uqx = 0;
        this.rj = 0;
        this.dv = 0;
        this.zou = null;
        this.nkh = false;
        this.hts = 0;
        this.vyg = 0;
        this.wxf = 0;
        this.f26061hg = 0;
        this.ou = 0L;
        this.hnk = 0L;
        this.ot = -2;
        this.jkf = 0;
        this.aos = 0;
        this.bx = 0;
        this.fzf = new JSONObject();
        this.tam = new HashMap();
        this.fjj = new JSONObject();
        this.qn = "";
        this.aje = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.syr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.uxr = false;
        this.az = false;
        this.jx = false;
        this.no = new ArrayList();
        this.agr = true;
        this.em = true;
        this.hw = true;
        this.tkg = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.orq.bcc.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) bcc.this.vj.get();
                    if (view == null) {
                        return;
                    }
                    bcc.this.oa(view);
                } catch (Throwable th) {
                    xs.uef("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.vup = -1;
        this.ot = i5;
        this.ggp = uef.LAND_PAGE;
        uef(context, yoVar, uefVar);
    }

    public static bcc uef(Context context, WebView webView, yo yoVar, com.bytedance.sdk.openadsdk.orq.uef uefVar) {
        if (yoVar == null || uefVar == null) {
            return null;
        }
        if (webView == null) {
            return new bcc(context, 0, yoVar, uefVar);
        }
        return new bcc(context, webView, yoVar, uefVar, uef.LAND_PAGE);
    }
}

package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.pu;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gzw {
    protected static int dj;
    public static final String moa;

    /* renamed from: oa, reason: collision with root package name */
    public static final String f25679oa;
    public static final String yo;
    private uef aje;
    private long aos;
    private sy au;
    private String az;
    protected int bcc;
    private boolean bs;
    private int bx;
    private String cgg;
    private com.bykv.vk.openvk.uef.uef.uef.yo.oa cl;
    private com.bytedance.sdk.openadsdk.core.model.uef cp;
    public long cq;
    protected long cz;

    /* renamed from: df, reason: collision with root package name */
    private JSONObject f25682df;
    private int dhk;
    private sy dor;
    private int dxx;
    private AdSlot dy;
    private wk ebe;
    private String ej;
    private int em;
    private String epe;
    private String etd;
    private boolean fjj;
    private String fz;
    private int fzf;

    /* renamed from: ga, reason: collision with root package name */
    private int f25683ga;
    private int gem;
    private String ggp;
    private boolean gv;
    private com.bytedance.sdk.openadsdk.core.cq.bcc.uef gye;
    private JSONObject gze;
    private long gzw;
    private com.bykv.vk.openvk.uef.uef.uef.yo.oa hdd;

    /* renamed from: hg, reason: collision with root package name */
    private int f25684hg;
    private tpx hjx;
    private ivm hnk;
    private oib hpb;
    private boolean hq;
    private String hts;
    private int hw;

    /* renamed from: ib, reason: collision with root package name */
    private ku f25685ib;
    private boolean jh;
    private String jkf;
    private PAGBannerSize jn;
    private bcc jnk;
    private int jvw;
    private String jx;
    private com.bytedance.sdk.openadsdk.core.cq.bcc.uef jzd;
    private pz kid;
    private String kik;
    private int km;
    private cp kn;
    private boolean ksq;
    private String ku;
    private bs ln;
    private Map<String, Object> lo;
    private int lox;
    private boolean lz;
    private String mbv;
    private dxx mva;
    private String nkc;
    private String nkh;
    private int no;
    private volatile boolean nx;
    private int nyn;
    private gr ofp;
    private String oib;
    private long orq;
    private int ot;
    private String ovw;
    private int oyt;
    private String pz;
    private int qn;
    private String qr;
    private String qt;
    private int rl;
    private gsd rt;
    private com.bytedance.sdk.openadsdk.core.dz.uef rwy;
    private int ry;
    private String sw;
    private int swd;
    private lw sy;
    private String syr;
    private boolean tam;

    /* renamed from: tc, reason: collision with root package name */
    private com.bykv.vk.openvk.uef.uef.uef.yo.oa f25687tc;
    private String tko;
    private xs tv;

    /* renamed from: uf, reason: collision with root package name */
    private JSONObject f25689uf;
    private dz up;
    private String uqx;
    private boolean us;
    private boolean uu;
    private JSONObject uxr;
    private int uz;
    private int vep;
    private cq vjj;
    private JSONObject vk;
    private String vxo;
    private String vyg;

    /* renamed from: wd, reason: collision with root package name */
    private int f25690wd;
    private String wxf;
    private boolean wze;
    private boolean xvd;
    private int xw;

    /* renamed from: yd, reason: collision with root package name */
    private int f25693yd;
    private String yka;
    private boolean zec;
    private String zou;
    private int zrl;

    /* renamed from: ab, reason: collision with root package name */
    private long f25680ab = 0;
    protected boolean uef = false;
    protected boolean lw = com.bytedance.sdk.openadsdk.gsd.uef.yo.uef;
    protected int ivm = com.bytedance.sdk.openadsdk.gsd.uef.yo.f25919oa;
    protected String xs = com.bytedance.sdk.openadsdk.gsd.uef.yo.yo;
    private int tpx = 0;
    private boolean gsd = false;
    private List<String> gr = new ArrayList();

    /* renamed from: ue, reason: collision with root package name */
    private int f25688ue = -1;
    protected int zjm = 0;
    private final List<sy> pu = new ArrayList();
    private final List<String> gb = new ArrayList();
    private final List<FilterWord> af = new ArrayList();
    private final pu sk = pu.yo();
    public boolean wrv = false;
    private int cop = 0;
    private List<String> rj = new ArrayList();
    private List<String> dv = new ArrayList();
    private String ou = "0";
    private String xvp = "";
    private int vj = 0;
    private int ix = 2;

    /* renamed from: ne, reason: collision with root package name */
    private int f25686ne = -1;
    private int dh = 0;
    private int nj = 0;
    private int jp = 1;

    /* renamed from: wf, reason: collision with root package name */
    private dj f25691wf = new dj();
    private int ykf = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int meb = 0;
    private int ifk = 1;

    /* renamed from: cc, reason: collision with root package name */
    private int f25681cc = 0;
    private int lpy = 0;
    private int wp = 0;
    private int efa = 1;
    private int iou = 1;

    /* renamed from: try, reason: not valid java name */
    private float f3try = 100.0f;
    private int agr = -1;
    private int tkg = 2;
    private int vup = 1;
    private int gk = 0;
    private int anj = -1;
    private long pp = -1;
    private int ht = 0;
    private int jr = Integer.MIN_VALUE;
    private boolean cuu = false;

    /* renamed from: wg, reason: collision with root package name */
    private int f25692wg = 0;
    private int vl = -1;
    private long hve = -1;
    private int dqw = 50;
    private int sjj = -1;
    private final oa orw = new oa();
    private boolean hnd = false;
    private int lu = 0;
    private com.bytedance.sdk.openadsdk.gsd.uef.oa puz = null;
    protected int dz = -1;
    protected int wk = -1;
    private float wzm = -1.0f;

    public static class uef {
        private List<Integer> bcc;
        private String cq;
        private String cz;
        private String dj;
        private String dz;
        private String ivm;
        private String lw;
        private String moa;

        /* renamed from: oa, reason: collision with root package name */
        private String f25694oa;
        private String uef;
        private String wrv;
        private String xs;
        private String yo;
        private String zjm;

        public static com.bytedance.sdk.openadsdk.core.cq.bcc.uef oa(uef uefVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.cq.bcc.uef().uef(uefVar.moa()).oa(uefVar.dz()).yo(uefVar.cq()).moa(uefVar.wk()).lw(str);
        }

        public static com.bytedance.sdk.component.adexpress.uef.yo.moa uef(uef uefVar, String str) {
            return com.bytedance.sdk.component.adexpress.uef.yo.moa.uef().uef(uefVar.moa()).oa(uefVar.lw()).yo(uefVar.ivm()).moa(uefVar.xs()).lw(uefVar.yo()).ivm(str);
        }

        public String bcc() {
            return this.lw;
        }

        public String cq() {
            return this.wrv;
        }

        public String cz() {
            return this.xs;
        }

        public String dj() {
            return this.zjm;
        }

        public String dz() {
            return this.cq;
        }

        public String ivm() {
            return this.yo;
        }

        public String lw() {
            return this.f25694oa;
        }

        public String moa() {
            return this.uef;
        }

        public String wk() {
            return this.dz;
        }

        public boolean wrv() {
            return !TextUtils.isEmpty(this.zjm) && this.zjm.equals("v3");
        }

        public String xs() {
            return this.moa;
        }

        public String yo() {
            return this.ivm;
        }

        public String zjm() {
            return this.dj;
        }

        public void bcc(String str) {
            this.xs = str;
        }

        public void cq(String str) {
            this.dz = str;
        }

        public void cz(String str) {
            this.dj = str;
        }

        public void dj(String str) {
            this.wrv = str;
        }

        public void ivm(String str) {
            this.moa = str;
        }

        public void lw(String str) {
            this.yo = str;
        }

        public void moa(String str) {
            this.f25694oa = str;
        }

        public void wrv(String str) {
            this.cq = str;
        }

        public void xs(String str) {
            this.lw = str;
        }

        public void yo(String str) {
            this.uef = str;
        }

        public void zjm(String str) {
            this.zjm = str;
        }

        public String oa() {
            return this.cz;
        }

        public void oa(String str) {
            this.ivm = str;
        }

        public List<Integer> uef() {
            return this.bcc;
        }

        public void uef(List<Integer> list) {
            this.bcc = list;
        }

        public void uef(String str) {
            this.cz = str;
        }
    }

    static {
        CharSequence[] charSequenceArr = {"is", gb.ku()};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr[0]);
        sb2.append((CharSequence) Constants.USER_ID_SEPARATOR);
        sb2.append(charSequenceArr[1]);
        f25679oa = sb2.toString();
        CharSequence[] charSequenceArr2 = {"is", gb.ku(), "sample"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr2[0]);
        for (int i5 = 1; i5 < 3; i5++) {
            sb3.append((CharSequence) Constants.USER_ID_SEPARATOR);
            sb3.append(charSequenceArr2[i5]);
        }
        yo = sb3.toString();
        CharSequence[] charSequenceArr3 = {gb.ku(), "strategy"};
        StringBuilder sb4 = new StringBuilder();
        sb4.append(charSequenceArr3[0]);
        sb4.append((CharSequence) Constants.USER_ID_SEPARATOR);
        sb4.append(charSequenceArr3[1]);
        moa = sb4.toString();
        dj = 330;
    }

    public gzw() {
        com.bytedance.sdk.openadsdk.core.model.uef uefVar = new com.bytedance.sdk.openadsdk.core.model.uef();
        this.cp = uefVar;
        uefVar.uef(this);
    }

    private com.bytedance.sdk.openadsdk.core.cq.bcc.uef oe() {
        dxx dxxVarAje = aje();
        if (dxxVarAje == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.cq.bcc.uef().uef(dxxVarAje.uef()).oa(dxxVarAje.oa()).yo(dxxVarAje.yo()).moa(dxxVarAje.moa()).lw(jnk() + "_v3");
    }

    public static boolean ou(int i5) {
        return i5 == 44 || i5 == 43 || i5 == 30 || i5 == 40 || i5 == 41 || i5 == 39;
    }

    private com.bytedance.sdk.openadsdk.core.cq.bcc.uef wgf() {
        uef uefVarVep = vep();
        if (uefVarVep == null) {
            return null;
        }
        return uef.oa(uefVarVep, String.valueOf(jnk()));
    }

    public boolean ab() {
        return this.hq;
    }

    public boolean af() {
        return this.jh;
    }

    public cq agr() {
        return this.vjj;
    }

    public dxx aje() {
        return this.mva;
    }

    public JSONObject anj() throws JSONException {
        JSONObject jSONObjectCq = cq(false);
        JSONObject jSONObjectOib = com.bytedance.sdk.openadsdk.core.settings.dj.oa().oib(String.valueOf(jnk()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectCq);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectOib);
            return jSONObject;
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("MaterialMeta", "toJsonObjPlus", e7.getMessage());
            return jSONObject;
        }
    }

    public int aos() {
        return this.lpy;
    }

    public List<gzw> at() {
        return this.cp.lw();
    }

    public int atl() {
        return this.ivm;
    }

    public String au() {
        JSONObject jSONObjectZec;
        if (this.epe == null && (jSONObjectZec = zec()) != null) {
            this.epe = jSONObjectZec.optString("cid", "");
        }
        return this.epe;
    }

    public String az() {
        return this.nkh;
    }

    public pz azx() {
        return this.kid;
    }

    public ku bbb() {
        return this.f25685ib;
    }

    public String bcc() {
        rt rtVarDj;
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa = moa();
        if (uefVarMoa == null || (rtVarDj = uefVarMoa.dj()) == null) {
            return null;
        }
        return rtVarDj.xs();
    }

    public int bn() {
        return this.lu;
    }

    public int bqx() {
        return this.wk;
    }

    public long bs() {
        return this.hve;
    }

    public int bx() {
        if (ebe()) {
            return 5;
        }
        if (gze() != 100.0f || ggp() == 2) {
            return 0;
        }
        return this.meb;
    }

    public String cc() {
        return this.etd;
    }

    public String cd() {
        return this.vxo;
    }

    public int cgg() {
        if (this.iou != 2) {
            this.iou = 1;
        }
        return this.iou;
    }

    public AdSlot cl() {
        return this.dy;
    }

    public int cop() {
        return this.dqw;
    }

    public String cp() {
        return this.yka;
    }

    public int cq() {
        return this.dxx;
    }

    public com.bytedance.sdk.component.cz.oa.uef cuu() {
        com.bytedance.sdk.component.cz.oa.uef uefVar = new com.bytedance.sdk.component.cz.oa.uef();
        uefVar.uef(this.qn);
        uefVar.oa(this.ou);
        uefVar.yo(this.ggp);
        uefVar.uef(em());
        return uefVar;
    }

    public long cz() {
        return this.f25680ab;
    }

    public List<String> df() {
        return this.rj;
    }

    public String dh() {
        return this.az;
    }

    public boolean dhk() {
        return this.fjj;
    }

    public String dj() {
        return this.ku;
    }

    public String dor() {
        return this.qt;
    }

    public long dos() {
        return this.orq;
    }

    public int dqw() {
        if (this.anj < 0) {
            JSONObject jSONObjectZec = zec();
            if (jSONObjectZec != null) {
                this.anj = jSONObjectZec.optInt("ad_slot_type", 0);
            } else {
                this.anj = 0;
            }
        }
        return this.anj;
    }

    public xs dv() {
        return this.tv;
    }

    public boolean dxx() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectLo = lo();
        if (jSONObjectLo == null || (jSONArrayOptJSONArray = jSONObjectLo.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
            if (jSONArrayOptJSONArray.optInt(i5) == 186) {
                return true;
            }
        }
        return false;
    }

    public boolean dy() {
        return this.f25683ga == 1;
    }

    public boolean dz() {
        return this.bs;
    }

    public boolean ebe() {
        int i5 = this.ht;
        return (i5 == 1 || i5 == 3) && nkc() != null;
    }

    public List<String> efa() {
        return this.gb;
    }

    public sy ej() {
        return this.dor;
    }

    public String em() {
        return this.sw;
    }

    public int epe() {
        return this.anj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gzw.class == obj.getClass()) {
            gzw gzwVar = (gzw) obj;
            if (this.ou.equals(gzwVar.iou()) && this.sw.equals(gzwVar.em())) {
                return true;
            }
        }
        return false;
    }

    public int etd() {
        if (this.sjj < 0) {
            try {
                JSONObject jSONObjectZec = zec();
                if (jSONObjectZec != null) {
                    this.sjj = jSONObjectZec.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.sjj = 0;
                }
            } catch (Throwable unused) {
                this.sjj = 0;
            }
        }
        return this.sjj;
    }

    public boolean fjj() {
        return tc() == 100 || this.swd == 20;
    }

    public boolean fz() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectLo = lo();
        if (jSONObjectLo != null && (jSONArrayOptJSONArray = jSONObjectLo.optJSONArray("tag_ids")) != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                if (jSONArrayOptJSONArray.optInt(i5) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public dj fzf() {
        return this.f25691wf;
    }

    public boolean ga() {
        return dqw() == 1;
    }

    public int gb() {
        return this.f25692wg;
    }

    public boolean geh() {
        return true;
    }

    public boolean gem() {
        return this.zec;
    }

    public int ggp() {
        int i5 = this.swd;
        if (i5 == 5 || i5 == 6 || i5 == 33) {
            return 1;
        }
        if (ib()) {
            return 2;
        }
        return this.ix;
    }

    public long gk() {
        return this.aos;
    }

    public oib gr() {
        return this.hpb;
    }

    public tpx gsd() {
        return this.hjx;
    }

    public void gv() {
        this.nx = true;
    }

    public long gyd() {
        return this.cz;
    }

    public int gye() {
        return this.ry;
    }

    public float gze() {
        if (this.f3try <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f3try = 100.0f;
        }
        return (this.f3try * 1000.0f) / 1000.0f;
    }

    public boolean gzw() {
        return (TextUtils.isEmpty(tpx()) || TextUtils.isEmpty(orq())) ? false : true;
    }

    public int hc() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa = moa();
        if (uefVarMoa != null && uefVarMoa.dj() != null) {
            return uefVarMoa.dj().cz();
        }
        if (cl() != null) {
            strValueOf = cl().getCodeId();
        } else {
            int iJnk = jnk();
            strValueOf = iJnk != 0 ? String.valueOf(iJnk) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.sy.moa().wrv(strValueOf);
        }
        return 30;
    }

    public int hdd() {
        return this.ykf;
    }

    public int hg() {
        return this.gem;
    }

    public Map<String, Object> hjx() {
        return this.lo;
    }

    public boolean hnd() {
        int i5 = this.swd;
        return (i5 == 2 || i5 == 1) && 3 == this.rl;
    }

    public int hnk() {
        return this.vup;
    }

    public int ho() {
        int i5 = this.wk;
        return i5 >= 0 ? i5 : com.bytedance.sdk.openadsdk.core.sy.moa().dj(String.valueOf(jnk()));
    }

    public boolean hpb() {
        wk wkVar;
        return ebe() && !vxo() && (wkVar = this.ebe) != null && wkVar.uef() == 1;
    }

    public com.bykv.vk.openvk.uef.uef.uef.yo.oa hq() {
        return this.hdd;
    }

    public boolean hs() {
        int i5 = this.gem;
        return i5 == 44 || i5 == 43;
    }

    public JSONObject ht() {
        return this.gze;
    }

    public long hts() {
        xs xsVar = this.tv;
        if (xsVar == null) {
            return 0L;
        }
        return xsVar.yo();
    }

    public boolean hve() {
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar = this.cl;
        return oaVar == null || oaVar.oib() != 1;
    }

    public int hw() {
        return this.ot;
    }

    public gr hzk() {
        return this.ofp;
    }

    public boolean ib() {
        return cl() != null && cl().getDurationSlotType() == 8 && tv();
    }

    public int ifj() {
        Map<String, Object> map = this.lo;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public sy ifk() {
        return this.au;
    }

    public PAGBannerSize ik() {
        return this.jn;
    }

    public String iou() {
        return this.ou;
    }

    public boolean ivm() {
        gr grVar;
        int iWxf = wxf();
        if (gem() && cp.yo(this) && iWxf != 43 && iWxf != 44) {
            return false;
        }
        if (!gem() && ou(iWxf) && (grVar = this.ofp) != null && grVar.uef() == 1) {
            return false;
        }
        boolean z2 = (iWxf == 33 || iWxf == 5 || iWxf == 6 || iWxf == 19 || iWxf == 12) ? false : true;
        if (ebe() || ggp() == 2 || !z2 || !com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm.uef(gb.yo(this.anj))) {
            return ggp() == 2 && z2;
        }
        return true;
    }

    public int ix() {
        return this.nj;
    }

    public int jh() {
        return this.zrl;
    }

    public int jkf() {
        return this.vj;
    }

    public double jn() {
        return cz(zec());
    }

    public int jnk() {
        JSONObject jSONObjectZec = zec();
        if (jSONObjectZec != null) {
            return jSONObjectZec.optInt("rit", 0);
        }
        return 0;
    }

    public String jp() {
        return this.jkf;
    }

    public int jr() {
        return this.vep;
    }

    public boolean jvw() {
        return dqw() == 5;
    }

    public String jx() {
        return this.oib;
    }

    public boolean jzd() {
        return this.nx;
    }

    public String kid() {
        ivm ivmVarNo = no();
        if (ivmVarNo == null || TextUtils.isEmpty(ivmVarNo.uef())) {
            return null;
        }
        return ivmVarNo.uef();
    }

    public String kik() {
        if (!TextUtils.isEmpty(this.hts)) {
            return this.hts;
        }
        Context contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
        int iYkf = ykf();
        if (iYkf != 2 && iYkf != 3) {
            if (iYkf == 4) {
                return contextUef != null ? com.bytedance.sdk.component.utils.orq.uef(contextUef, "tt_video_download_apk") : this.hts;
            }
            if (iYkf != 8) {
                return this.hts;
            }
        }
        return contextUef != null ? com.bytedance.sdk.component.utils.orq.uef(contextUef, "tt_video_mobile_go_detail") : this.hts;
    }

    public boolean kkq() {
        oib oibVar;
        if (this.dy == null || (oibVar = this.hpb) == null) {
            return false;
        }
        return oibVar.uef(!TextUtils.isEmpty(r0.getBidAdm()));
    }

    public com.bytedance.sdk.openadsdk.core.cq.bcc.uef km() {
        return this.jzd;
    }

    public JSONObject kn() {
        return this.f25682df;
    }

    public float knp() {
        float f10 = this.wzm;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f10;
        }
        dxx dxxVar = this.mva;
        if (dxxVar != null) {
            String strMoa = dxxVar.moa();
            if (TextUtils.isEmpty(strMoa)) {
                strMoa = com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef("adv3", this.mva.uef(), this.mva.oa());
            }
            if (strMoa != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strMoa).optJSONObject("body");
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.wzm = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.wzm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public com.bykv.vk.openvk.uef.uef.uef.yo.oa ksq() {
        return this.f25687tc;
    }

    public boolean ku() {
        List<Integer> listUef;
        return (vep() == null || (listUef = vep().uef()) == null || !listUef.contains(57)) ? false : true;
    }

    public boolean ln() {
        if (this.pu.isEmpty()) {
            return false;
        }
        if (this.ot == 4 && this.pu.size() < 3) {
            return false;
        }
        Iterator<sy> it = this.pu.iterator();
        while (it.hasNext()) {
            if (!it.next().lw()) {
                return false;
            }
        }
        return true;
    }

    public JSONObject lo() {
        return this.vk;
    }

    public boolean lox() {
        return !ebe() && nx() == 1;
    }

    public List<sy> lpy() {
        return this.pu;
    }

    public int lt() {
        return this.bcc;
    }

    public pu lu() {
        return this.sk;
    }

    public int lun() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa = moa();
        if (uefVarMoa != null && uefVarMoa.dj() != null) {
            return uefVarMoa.dj().cz();
        }
        if (cl() != null) {
            strValueOf = cl().getCodeId();
        } else {
            int iJnk = jnk();
            strValueOf = iJnk != 0 ? String.valueOf(iJnk) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.sy.moa().dhk(strValueOf);
        }
        return 5;
    }

    public String lw() {
        int iEpe = epe();
        return iEpe != 1 ? iEpe != 3 ? iEpe != 5 ? iEpe != 7 ? iEpe != 8 ? "unknown" : "fullscreen_interstitial_ad" : "rewarded_video" : "embeded_ad" : "open_ad" : "banner_ad";
    }

    public String lz() {
        return this.qr;
    }

    public int mbv() {
        JSONObject jSONObject = this.gze;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public boolean meb() {
        return this.f25693yd == 1;
    }

    public com.bytedance.sdk.openadsdk.core.model.uef moa() {
        return this.cp;
    }

    public int mva() {
        return this.uz;
    }

    public List<String> nau() {
        return this.gr;
    }

    public int ne() {
        return this.jp;
    }

    public com.bykv.vk.openvk.uef.uef.uef.yo.oa nj() {
        return this.cl;
    }

    public com.bytedance.sdk.openadsdk.core.dz.uef nkc() {
        return this.rwy;
    }

    public int nkh() {
        if (ku()) {
            return 5;
        }
        return tv() ? 4 : 1;
    }

    public boolean nl() {
        gsd gsdVar = this.rt;
        return gsdVar != null && gsdVar.uef() > 0;
    }

    public ivm no() {
        return this.hnk;
    }

    public boolean nuo() {
        return this.uef;
    }

    public int nx() {
        return this.dh;
    }

    public boolean nyn() {
        return dqw() == 7;
    }

    public int oa() {
        xs xsVarDv = dv();
        if (xsVarDv != null) {
            return xsVarDv.uef();
        }
        return -1;
    }

    public moa odd() {
        moa moaVarCq;
        lw lwVar = this.sy;
        if (lwVar != null) {
            moaVarCq = lwVar.oa();
        } else {
            com.bytedance.sdk.openadsdk.core.dz.uef uefVar = this.rwy;
            moaVarCq = uefVar != null ? uefVar.cq() : null;
        }
        if (moaVarCq != null) {
            moaVarCq.uef(this);
        }
        return moaVarCq;
    }

    public String ofp() {
        JSONObject jSONObjectZec;
        String strOptString = this.ovw;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectZec = zec()) != null) {
            strOptString = jSONObjectZec.optString("req_id", "");
            dxx(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public boolean oib() {
        return this.tam;
    }

    public boolean okm() {
        return this.wrv;
    }

    public String omp() {
        return this.xs;
    }

    public String oq() {
        return this.pz;
    }

    public String orq() {
        return this.nkc;
    }

    public int orw() {
        return this.ht;
    }

    public String ot() {
        return this.xvp;
    }

    public int ovw() {
        int i5 = this.agr;
        if (i5 >= 0) {
            return i5;
        }
        return 30;
    }

    public boolean oyt() {
        return this.gv;
    }

    public void pmc() {
        if (!TextUtils.isEmpty(dh())) {
            dz("0");
        }
        Map<String, Object> mapHjx = hjx();
        if (mapHjx == null || !mapHjx.containsKey(InAppPurchaseMetaData.KEY_PRICE)) {
            return;
        }
        mapHjx.put(InAppPurchaseMetaData.KEY_PRICE, "0");
    }

    public int pp() {
        return this.no;
    }

    public com.bytedance.sdk.openadsdk.core.cq.bcc.uef pu() {
        return this.gye;
    }

    public void puz() {
        this.sk.lw();
        xs(false);
    }

    public String pz() {
        return this.mbv;
    }

    public int qe() {
        int i5 = this.dz;
        return i5 >= 0 ? i5 : com.bytedance.sdk.openadsdk.core.sy.moa().dhk(String.valueOf(jnk()));
    }

    public int ql() {
        return this.tpx;
    }

    public int qn() {
        JSONObject jSONObject;
        int i5 = this.jr;
        return (Integer.MIN_VALUE != i5 || (jSONObject = this.vk) == null) ? i5 : jSONObject.optInt("click_trigger_type", 0);
    }

    public boolean qr() {
        return this.lox == 1;
    }

    public long qt() {
        if (this.pp < 0) {
            JSONObject jSONObjectZec = zec();
            if (jSONObjectZec != null) {
                this.pp = jSONObjectZec.optLong("ad_id", 0L);
            } else {
                this.pp = 0L;
            }
        }
        return this.pp;
    }

    public boolean qz() {
        gr grVar = this.ofp;
        if (grVar == null || grVar.oa() != 1) {
            return false;
        }
        gsd gsdVar = this.rt;
        return gsdVar == null || gsdVar.uef() <= 0;
    }

    public void rj() {
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar = this.cl;
        if (oaVar == null || TextUtils.isEmpty(oaVar.wrv())) {
            return;
        }
        try {
            if (!this.cl.wrv().contains("style_id")) {
                this.gv = false;
            } else {
                this.gv = true;
                this.qr = Uri.parse(this.cl.wrv()).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo(th.getMessage(), new Object[0]);
        }
    }

    public int rl() {
        try {
            JSONObject jSONObjectZec = zec();
            if (jSONObjectZec != null) {
                return jSONObjectZec.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public bcc rt() {
        return this.jnk;
    }

    public long rw() {
        return this.gzw;
    }

    public JSONObject rwy() {
        return this.uxr;
    }

    public int ry() {
        return this.em;
    }

    public com.bytedance.sdk.openadsdk.gsd.uef.oa sa() {
        return this.puz;
    }

    public boolean sjj() {
        return dqw() == 3 || dqw() == 4;
    }

    public boolean sk() {
        return this.ksq;
    }

    public int sw() {
        return this.f25686ne;
    }

    public boolean swd() {
        return this.xvd;
    }

    public int sy() {
        return this.zjm;
    }

    public com.bytedance.sdk.component.adexpress.uef.yo.moa syr() {
        uef uefVarVep = vep();
        if (uefVarVep == null) {
            return null;
        }
        return uef.uef(uefVarVep, String.valueOf(jnk()));
    }

    public String tam() {
        return this.syr;
    }

    public int tc() {
        return this.fzf;
    }

    public List<FilterWord> tkg() {
        return this.af;
    }

    public boolean tko() {
        return ebe() || this.sy != null;
    }

    public boolean tpq() {
        return this.hnd;
    }

    public String tpx() {
        return this.tko;
    }

    /* renamed from: try, reason: not valid java name */
    public String m167try() {
        return this.ggp;
    }

    public boolean tv() {
        return this.ht == 2;
    }

    public boolean ue() {
        return this.wze;
    }

    public gsd uef() {
        return this.rt;
    }

    public int uf() {
        dz dzVar = this.up;
        if (dzVar == null) {
            return 0;
        }
        return dzVar.uef();
    }

    public String up() {
        return this.hts;
    }

    public boolean uqx() {
        if (this.anj <= 0) {
            this.anj = dqw();
        }
        int i5 = this.anj;
        return (i5 == 7 || i5 == 8) && !lw(this) && hg() != 21 && this.nyn == 1;
    }

    public int us() {
        return this.qn;
    }

    public boolean uu() {
        uef uefVar = this.aje;
        if (uefVar != null) {
            return !TextUtils.isEmpty(uefVar.dj());
        }
        int i5 = this.nj;
        return i5 == 9 || i5 == 10 || i5 == 11;
    }

    public List<String> uxr() {
        return this.dv;
    }

    public int uz() {
        return this.hw;
    }

    public uef vep() {
        return this.aje;
    }

    public int vj() {
        return this.wp;
    }

    public lw vjh() {
        return this.sy;
    }

    public int vjj() {
        return this.tkg;
    }

    public wk vk() {
        return this.ebe;
    }

    public int vl() {
        return this.f25684hg;
    }

    public String vup() {
        return this.kik;
    }

    public boolean vxo() {
        return this.sk.uef > 0;
    }

    public cp vyg() {
        return this.kn;
    }

    public int wd() {
        return this.jvw;
    }

    public String wf() {
        return this.wxf;
    }

    public int wg() {
        return this.gk;
    }

    public boolean wk() {
        return this.lz;
    }

    public long wmv() {
        Map<String, Object> mapHjx = hjx();
        if (mapHjx == null) {
            return 0L;
        }
        try {
            Object obj = mapHjx.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String wp() {
        return this.uqx;
    }

    public String wrv() {
        return this.fz;
    }

    public int wxf() {
        return this.swd;
    }

    public String wze() {
        return this.cgg;
    }

    public long wzm() {
        return this.cq;
    }

    public boolean xg() {
        return this.gsd;
    }

    public int xs() {
        return this.km;
    }

    public String xvd() {
        return this.vyg;
    }

    public boolean xvp() {
        return this.f25681cc == 1;
    }

    public String xw() {
        return this.zou;
    }

    public int yc() {
        int i5 = this.f25688ue;
        return i5 >= 0 ? i5 : nyn() ? 30 : 5;
    }

    public boolean yd() {
        return dqw() == 8;
    }

    public bs yka() {
        return this.ln;
    }

    public int ykf() {
        return this.rl;
    }

    public int yo() {
        return this.oyt;
    }

    public oa ys() {
        return this.orw;
    }

    public JSONObject zec() {
        if (this.f25689uf == null) {
            try {
                if (!TextUtils.isEmpty(this.sw)) {
                    this.f25689uf = new JSONObject(this.sw);
                }
            } catch (JSONException e7) {
                com.bytedance.sdk.component.utils.dhk.yo("MaterialMeta", e7.getMessage());
            }
        }
        return this.f25689uf;
    }

    public boolean zg() {
        return this.lw;
    }

    public int zjm() {
        return this.dhk;
    }

    public int zou() {
        xs xsVar = this.tv;
        if (xsVar == null) {
            return 2;
        }
        return xsVar.oa();
    }

    public boolean zrl() {
        return this.uu;
    }

    public boolean zyw() {
        return this.cuu;
    }

    private static double cz(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    private String gb(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.ab.uef(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    public static boolean moa(gzw gzwVar) {
        return (gzwVar == null || gzwVar.nj() == null || gzwVar.nj().uef() != 1) ? false : true;
    }

    public void ab(int i5) {
        this.f25681cc = i5;
    }

    public void af(int i5) {
        this.agr = i5;
    }

    public void bs(int i5) {
        this.wp = i5;
    }

    public void cop(int i5) {
        this.ry = Math.max(0, i5);
    }

    public void cp(int i5) {
        this.f25693yd = i5;
    }

    public void cq(int i5) {
        this.vj = i5;
    }

    public void dhk(int i5) {
        this.lpy = i5;
    }

    public void dj(boolean z2) {
        this.zec = z2;
    }

    public void dor(int i5) {
        this.vep = i5;
    }

    public void dv(int i5) {
        this.ht = i5;
    }

    public void dz(int i5) {
        this.f25686ne = i5;
    }

    public void gem(int i5) {
        this.lox = i5;
    }

    public void gr(int i5) {
        this.xw = i5;
    }

    public void gsd(int i5) {
        this.ykf = i5;
    }

    public void gzw(int i5) {
        this.f25690wd = i5;
    }

    public void hg(int i5) {
        this.tpx = i5;
    }

    public void hts(int i5) {
        if (i5 < 0 || i5 > 30) {
            i5 = 6;
        }
        this.ivm = i5;
    }

    public void km(int i5) {
        this.iou = i5;
    }

    public void lz(int i5) {
        this.ot = i5;
    }

    public void oib(int i5) {
        this.jp = i5;
    }

    public void orq(int i5) {
        this.meb = i5;
    }

    public int ou() {
        return this.cop;
    }

    public void oyt(int i5) {
        this.bx = i5;
    }

    public void pu(int i5) {
        this.dh = i5;
    }

    public void pz(int i5) {
        this.qn = i5;
    }

    public void rt(int i5) {
        this.efa = i5;
    }

    public void sk(int i5) {
        this.f25688ue = i5;
    }

    public void swd(int i5) {
        this.hw = i5;
    }

    public void sy(int i5) {
        this.nj = i5;
    }

    public void tpx(int i5) {
        this.ifk = i5;
    }

    public void ue(int i5) {
        this.fzf = i5;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        if (uefVar != null) {
            this.cp = uefVar;
        }
    }

    public void vyg(int i5) {
        this.dz = i5;
    }

    public void wk(int i5) {
        this.ix = i5;
    }

    public void wrv(int i5) {
        this.swd = i5;
    }

    public void wxf(int i5) {
        this.wk = i5;
    }

    public void xs(String str) {
        this.tko = str;
    }

    public void yo(int i5) {
        this.dhk = i5;
    }

    public void zjm(String str) {
        this.yka = str;
    }

    public void zou(int i5) {
        this.lu = i5;
    }

    public static boolean yo(gzw gzwVar) {
        return (gzwVar == null || gzwVar.nj() == null || gzwVar.nj().moa() != 7 || cp.oa(gzwVar)) ? false : true;
    }

    public void ab(String str) {
        this.jkf = str;
    }

    public void bs(String str) {
        this.wxf = str;
    }

    public void cp(String str) {
        this.cgg = str;
    }

    public void cq(String str) {
        this.jx = str;
    }

    public void cz(String str) {
        this.mbv = str;
    }

    public void dhk(String str) {
        this.zou = str;
    }

    public void dj(String str) {
        this.qt = str;
    }

    public void dz(String str) {
        this.az = str;
    }

    public void gr(String str) {
        this.sw = str;
    }

    public void gsd(String str) {
        this.ggp = str;
    }

    public void gzw(String str) {
        this.ou = str;
    }

    public void km(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.gr.add(str);
    }

    public void lz(String str) {
        this.vxo = str;
    }

    public void nkh(int i5) {
        this.bcc = i5;
    }

    public void oa(int i5) {
        this.km = i5;
    }

    public void oib(String str) {
        this.uqx = str;
    }

    public void orq(String str) {
        this.hts = str;
    }

    public void oyt(String str) {
        if (TextUtils.isEmpty(str)) {
            this.xs = com.bytedance.sdk.openadsdk.gsd.uef.yo.yo;
        } else {
            this.xs = str;
        }
    }

    public void pu(String str) {
        this.pz = str;
    }

    public void pz(String str) {
        this.ej = str;
    }

    public void rl(int i5) {
        this.em = i5;
    }

    public void rt(String str) {
        this.oib = str;
    }

    public void sy(String str) {
        this.etd = str;
    }

    public void tpx(String str) {
        this.nkh = str;
    }

    public void ue(String str) {
        this.kik = str;
    }

    public void uef(int i5) {
        this.oyt = i5;
    }

    public void wk(String str) {
        this.syr = str;
    }

    public void wrv(String str) {
        this.xvp = str;
    }

    public void xs(boolean z2) {
        this.wze = z2;
    }

    public void zjm(boolean z2) {
        this.xvd = z2;
    }

    private static long bcc(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static int moa(String str) {
        return uef(yo(str));
    }

    public static boolean oa(gzw gzwVar) {
        return (uef(gzwVar) || yo(gzwVar)) ? false : true;
    }

    public static JSONObject yo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("MaterialMeta", e7.getMessage());
            return null;
        }
    }

    public void ab(boolean z2) {
        this.uef = z2;
    }

    public void bs(boolean z2) {
        this.hnd = z2;
    }

    public JSONObject cq(boolean z2) throws JSONException {
        try {
            String strCd = cd();
            if (TextUtils.isEmpty(strCd)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            if (z2) {
                jSONObject.put("raw_response_info", strCd);
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(strCd).optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && yo() >= 0 && yo() < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(yo());
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectOptJSONObject.get(next));
                    }
                }
                AdSlot adSlotCl = cl();
                if (adSlotCl != null) {
                    jSONObject.put("adslot", adSlotCl.toJsonObj());
                }
                if (!TextUtils.isEmpty(this.mbv)) {
                    jSONObject.put("gdid_encrypted", this.mbv);
                }
                jSONObject.put("hasReportShow", this.xvd);
                jSONObject.put("isMrcReportFinish", this.nx);
                return jSONObject;
            }
            return null;
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.uef("MaterialMeta", "toJsonObj error", e7);
            return null;
        }
    }

    public void cz(boolean z2) {
        this.ksq = z2;
    }

    public void dj(int i5) {
        this.cop = i5;
    }

    public void dz(boolean z2) {
        this.wrv = z2;
    }

    public void ku(int i5) {
        this.rl = i5;
    }

    public void oib(boolean z2) {
        this.gsd = z2;
    }

    public void sy(boolean z2) {
        this.lw = z2;
    }

    public void uef(long j8) {
        this.f25680ab = j8;
    }

    public void wk(boolean z2) {
        this.cuu = z2;
    }

    public void wrv(boolean z2) {
        this.uu = z2;
    }

    public void xs(int i5) {
        this.f25692wg = i5;
    }

    public void zjm(int i5) {
        uef(i5, -1);
    }

    public static double oa(String str) {
        return cz(yo(str));
    }

    public static boolean uef(gzw gzwVar, boolean z2, boolean z10, boolean z11, boolean z12) {
        if (uef(gzwVar) || z12 || gzwVar == null || gzwVar.nj() == null || TextUtils.isEmpty(gzwVar.nj().wrv())) {
            return false;
        }
        return yo(gzwVar) ? z11 : (gzwVar.nj() == null || gzwVar.nj().uef() != 1) ? z2 : z10;
    }

    public void au(int i5) {
        this.uz = i5;
    }

    public void bcc(String str) {
        this.nkc = str;
    }

    public void cz(int i5) {
        this.nyn = i5;
    }

    public void dxx(int i5) {
        this.jvw = i5;
    }

    public void fz(int i5) {
        this.f25683ga = i5;
    }

    public void gb(int i5) {
        this.no = i5;
    }

    public void ku(String str) {
        this.vyg = str;
    }

    public void moa(int i5) {
        this.dxx = i5;
    }

    public void xs(JSONObject jSONObject) {
        this.orw.uef(jSONObject);
    }

    public void bcc(boolean z2) {
        this.jh = z2;
    }

    public void dxx(String str) {
        this.ovw = str;
    }

    public String fz(String str) {
        JSONObject jSONObjectZec = zec();
        return jSONObjectZec != null ? jSONObjectZec.optString("rit", str) : str;
    }

    public void moa(boolean z2) {
        this.tam = z2;
    }

    public void uqx(int i5) {
        this.zrl = i5;
    }

    public void xs(long j8) {
        this.gzw = j8;
    }

    public static boolean ivm(gzw gzwVar) {
        Object obj;
        if (gzwVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapHjx = gzwVar.hjx();
            if (mapHjx == null || (obj = mapHjx.get(TTAdConstant.SDK_BIDDING_TYPE)) == null) {
                return false;
            }
            return 2 == Integer.parseInt(obj.toString());
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public static String oa(Context context, gzw gzwVar) {
        if (context != null && gzwVar != null) {
            try {
                if (gzwVar.ykf() != 8) {
                    if (gzwVar.rt().uef()) {
                    }
                }
                String strUef = com.bytedance.sdk.openadsdk.core.uef.uef.uef(context);
                if (TextUtils.isEmpty(strUef)) {
                    return null;
                }
                return strUef;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public void bcc(int i5) {
        this.dqw = i5;
    }

    public void etd(int i5) {
        this.gk = i5;
    }

    public void moa(JSONObject jSONObject) {
        this.uxr = jSONObject;
    }

    public void yo(boolean z2) {
        this.hq = z2;
    }

    public static boolean lw(gzw gzwVar) {
        if (gzwVar == null) {
            return false;
        }
        int iHw = gzwVar.hw();
        return gzwVar.ebe() || iHw == 5 || iHw == 15 || iHw == 50;
    }

    public void moa(long j8) {
        this.cq = j8;
    }

    public void rj(int i5) {
        this.f25684hg = i5;
    }

    public void yo(sy syVar) {
        PAGBannerSize pAGBannerSizeIk = ik();
        if (pAGBannerSizeIk != null && pAGBannerSizeIk.getWidth() > 0 && pAGBannerSizeIk.getHeight() > 0) {
            uef(syVar, af.oa(com.bytedance.sdk.openadsdk.core.sy.uef(), pAGBannerSizeIk.getWidth()), af.oa(com.bytedance.sdk.openadsdk.core.sy.uef(), pAGBannerSizeIk.getHeight()));
        }
        this.pu.add(syVar);
    }

    public static boolean uef(gzw gzwVar) {
        return (gzwVar == null || gzwVar.nj() == null || gzwVar.nj().moa() != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.wk.uef.oa uef(String str, gzw gzwVar) {
        gzwVar.etd(0);
        int iDqw = gzwVar.dqw();
        int i5 = 3;
        if (iDqw == 3) {
            i5 = 4;
        } else if (iDqw == 7) {
            i5 = 1;
        } else if (iDqw == 8) {
            i5 = 2;
        }
        com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVar = new com.bytedance.sdk.openadsdk.core.wk.uef.oa(str, gzwVar.ksq(), gzwVar.hq(), gzwVar.wg(), gzwVar.jh(), i5);
        oaVar.uef(com.bytedance.sdk.openadsdk.gzw.lw.uef("video_error_conf", 0));
        oaVar.yo(com.bykv.vk.openvk.uef.uef.oa.uef.oa(oaVar.ab()));
        return oaVar;
    }

    public void lw(String str) {
        this.ku = str;
    }

    public void ivm(String str) {
        this.fz = str;
    }

    public void lw(int i5) {
        this.vl = i5;
    }

    public void oa(boolean z2) {
        this.lz = z2;
    }

    public void ivm(int i5) {
        this.zjm = i5;
    }

    public void lw(boolean z2) {
        this.fjj = z2;
    }

    public void oa(long j8) {
        this.hve = j8;
    }

    public void ivm(boolean z2) {
        this.us = z2;
    }

    public void lw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.rl = 4;
        this.ou = jSONObject.optString("id");
        this.jkf = jSONObject.optString("source");
        ivm ivmVar = new ivm();
        this.hnk = ivmVar;
        ivmVar.yo(jSONObject.optString("pkg_name"));
        this.hnk.oa(jSONObject.optString(MediationMetaData.KEY_NAME));
        this.hnk.uef(jSONObject.optString("download_url"));
    }

    public void oa(com.bytedance.sdk.openadsdk.core.cq.bcc.uef uefVar) {
        this.gye = uefVar;
        com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef(uefVar, "endcard");
    }

    public void ivm(JSONObject jSONObject) {
        this.gze = jSONObject;
    }

    public void yo(long j8) {
        this.aos = j8;
    }

    public static long uef(String str) {
        return bcc(yo(str));
    }

    public void ivm(long j8) {
        this.orq = j8;
    }

    public void oa(double d3) {
        if (d3 != 2.0d && d3 != 1.0d) {
            this.tkg = 2;
        } else {
            this.tkg = (int) d3;
        }
    }

    public void yo(JSONObject jSONObject) {
        this.f25682df = jSONObject;
    }

    public void yo(com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar) {
        this.hdd = oaVar;
    }

    public static int uef(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public void oa(JSONObject jSONObject) {
        this.vk = jSONObject;
    }

    public static String uef(Context context, gzw gzwVar) {
        if (context == null || gzwVar == null || !((gzwVar.dqw() == 8 || gzwVar.dqw() == 7) && gzwVar.fjj())) {
            return null;
        }
        String strOa = oa(context, gzwVar);
        if (TextUtils.isEmpty(strOa) || com.bytedance.sdk.openadsdk.core.uef.uef.uef() != 1) {
            return null;
        }
        return strOa;
    }

    public void oa(sy syVar) {
        this.dor = syVar;
    }

    public void oa(com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar) {
        this.f25687tc = oaVar;
    }

    public static void oa(gzw gzwVar, JSONObject jSONObject) throws JSONException {
        ivm ivmVarNo = gzwVar.no();
        if (ivmVarNo != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", ivmVarNo.oa());
            jSONObject2.put("package_name", ivmVarNo.yo());
            jSONObject2.put("download_url", ivmVarNo.uef());
            jSONObject2.put("score", ivmVarNo.moa());
            jSONObject2.put("comment_num", ivmVarNo.lw());
            jSONObject2.put("app_size", ivmVarNo.ivm());
            jSONObject2.put("app_category", ivmVarNo.xs());
            jSONObject.put("app", jSONObject2);
        }
    }

    public void lw(long j8) {
        this.cz = j8;
    }

    public void uef(boolean z2) {
        this.bs = z2;
    }

    public void uef(bcc bccVar) {
        this.jnk = bccVar;
    }

    public void uef(tpx tpxVar) {
        this.hjx = tpxVar;
    }

    public void uef(oib oibVar) {
        this.hpb = oibVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.cq.bcc.uef uefVar) {
        this.jzd = uefVar;
        com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef(uefVar, "endcard");
    }

    public void uef(xs xsVar) {
        this.tv = xsVar;
    }

    public void uef(cp cpVar) {
        this.kn = cpVar;
    }

    public void uef(int i5, int i10) {
        this.gem = i5;
        this.swd = i5;
        if (this.dy == null) {
            this.swd = 0;
            return;
        }
        if (i10 <= 0) {
            i10 = dqw();
        }
        if (this.dy.getDurationSlotType() != 3 && i10 != 3) {
            if (this.dy.getDurationSlotType() != 7 && this.dy.getDurationSlotType() != 8 && i10 != 7 && i10 != 8) {
                if (!this.zec && cp.oa(this)) {
                    this.swd = 4;
                    return;
                }
                if (this.gem == 4 && !cp.oa(this)) {
                    this.swd = 0;
                }
                int i11 = this.gem;
                if (i11 == 41) {
                    this.swd = 41;
                    return;
                }
                if (i5 >= 5) {
                    this.swd = 0;
                    return;
                }
                if (i11 == 2 && ykf() != 3) {
                    this.swd = 0;
                    return;
                } else {
                    if (i5 == 0 || (i5 == 1 && ykf() != 3)) {
                        this.swd = 0;
                        return;
                    }
                    return;
                }
            }
            if (!this.zec) {
                if (cp.yo(this)) {
                    this.swd = 12;
                    return;
                } else if (cp.oa(this)) {
                    this.swd = 9;
                    return;
                }
            }
            if (this.gem == 5 && !dhk.moa(this)) {
                this.swd = 7;
            }
            if (this.gem == 6 && !dhk.oa(this)) {
                this.swd = 7;
            }
            if (this.gem == 8 && tc() != 100) {
                this.swd = 7;
            }
            if (this.gem == 19 && TextUtils.isEmpty(this.etd)) {
                this.swd = 7;
            }
            if (this.gem == 20 && TextUtils.isEmpty(this.etd)) {
                this.swd = 7;
            }
            if (this.gem == 38 && !dhk.yo(this)) {
                this.swd = 7;
            }
            if (i5 < 5) {
                this.swd = 7;
                return;
            }
            return;
        }
        this.swd = 14;
    }

    public void uef(double d3) {
        if (d3 != 2.0d && d3 != 1.0d) {
            this.vup = 1;
        } else {
            this.vup = (int) d3;
        }
    }

    public void uef(dj djVar) {
        this.f25691wf = djVar;
    }

    public void uef(AdSlot adSlot) {
        this.dy = adSlot;
    }

    public void uef(uef uefVar) {
        this.aje = uefVar;
        com.bytedance.sdk.component.adexpress.uef.yo.moa moaVarSyr = syr();
        if (moaVarSyr != null && !uu()) {
            com.bytedance.sdk.component.adexpress.uef.oa.oa.uef(moaVarSyr);
        }
        if (uefVar == null || TextUtils.isEmpty(uefVar.cq())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef(wgf(), "ad");
    }

    public void uef(dxx dxxVar) {
        this.mva = dxxVar;
        if (dxxVar == null || TextUtils.isEmpty(dxxVar.yo())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef(oe(), "adv3");
    }

    public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar) {
        this.cl = oaVar;
    }

    public void uef(dz dzVar) {
        this.up = dzVar;
    }

    public void uef(sy syVar) {
        uef(syVar, dj);
        String strGb = gb(syVar.uef());
        if (!TextUtils.isEmpty(strGb)) {
            syVar.oa(strGb);
        }
        this.au = syVar;
    }

    private void uef(sy syVar, int i5) {
        if (syVar != null) {
            try {
                if (TextUtils.isEmpty(syVar.uef())) {
                    return;
                }
                if (syVar.oa() == 0 && syVar.yo() == 0) {
                    syVar.uef(i5);
                    syVar.oa(i5);
                    return;
                }
                if (syVar.oa() == 0) {
                    if (syVar.yo() > i5) {
                        syVar.oa(i5);
                        syVar.uef(i5);
                        return;
                    } else {
                        syVar.uef(syVar.yo());
                        return;
                    }
                }
                if (syVar.yo() == 0) {
                    if (syVar.oa() > i5) {
                        syVar.oa(i5);
                        syVar.uef(i5);
                        return;
                    } else {
                        syVar.oa(syVar.oa());
                        return;
                    }
                }
                if (syVar.oa() > syVar.yo()) {
                    if (syVar.oa() > i5) {
                        syVar.oa((int) (i5 / (syVar.oa() / syVar.yo())));
                        syVar.uef(i5);
                        return;
                    }
                    return;
                }
                if (syVar.yo() > i5) {
                    syVar.uef((int) (i5 * (syVar.oa() / syVar.yo())));
                    syVar.oa(i5);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void uef(sy syVar, int i5, int i10) {
        try {
            if (syVar.yo() >= i10) {
                syVar.uef((int) ((syVar.oa() / syVar.yo()) * i10));
                syVar.oa(i10);
            } else if (syVar.oa() >= i5) {
                syVar.uef((int) ((i5 / i10) * syVar.yo()));
            }
        } catch (Throwable unused) {
        }
    }

    public void uef(ivm ivmVar) {
        this.hnk = ivmVar;
    }

    public void uef(cq cqVar) {
        this.vjj = cqVar;
    }

    public void uef(FilterWord filterWord) {
        this.af.add(filterWord);
    }

    public void uef(Map<String, Object> map) {
        this.lo = map;
    }

    public void uef(float f10) {
        this.f3try = f10;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.dz.uef uefVar) {
        this.rwy = uefVar;
    }

    public void uef(bs bsVar) {
        this.ln = bsVar;
    }

    public void uef(wk wkVar) {
        this.ebe = wkVar;
    }

    public void uef(pz pzVar) {
        this.kid = pzVar;
    }

    public void uef(PAGBannerSize pAGBannerSize) {
        this.jn = pAGBannerSize;
    }

    public void uef(gr grVar) {
        this.ofp = grVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.gsd.uef.oa oaVar) {
        this.puz = oaVar;
    }

    public void uef(ku kuVar) {
        this.f25685ib = kuVar;
    }

    public void uef(lw lwVar) {
        this.sy = lwVar;
    }

    public void uef(gsd gsdVar) {
        this.rt = gsdVar;
    }

    public static void uef(gzw gzwVar, JSONObject jSONObject) throws JSONException {
        List<sy> listLpy = gzwVar.lpy();
        if (listLpy != null) {
            JSONArray jSONArray = new JSONArray();
            for (sy syVar : listLpy) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", syVar.uef());
                jSONObject2.put("height", syVar.yo());
                jSONObject2.put("width", syVar.oa());
                jSONObject2.put("image_preview", syVar.ivm());
                jSONObject2.put("image_key", syVar.xs());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }
}

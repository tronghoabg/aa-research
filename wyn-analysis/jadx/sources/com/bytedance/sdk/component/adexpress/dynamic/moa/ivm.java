package com.bytedance.sdk.component.adexpress.dynamic.moa;

import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm {

    /* renamed from: ab, reason: collision with root package name */
    private String f24851ab;
    private int af;
    private int aje;
    private List<uef> aos;
    private int au;
    private long az = -1;
    private float bcc;
    private String bs;
    private int bx;

    /* renamed from: cc, reason: collision with root package name */
    private String f24852cc;
    private int cl;
    private boolean cop;
    private double cp;
    private String cq;
    private float cz;

    /* renamed from: df, reason: collision with root package name */
    private int f24853df;
    private int dh;
    private String dhk;
    private double dj;
    private boolean dor;
    private boolean dv;
    private String dxx;
    private int dy;
    private String dz;
    private String efa;
    private boolean ej;
    private int etd;
    private boolean fjj;
    private String fz;
    private int fzf;
    private int gb;
    private int gem;
    private int ggp;
    private int gr;
    private String gsd;
    private String gzw;
    private int hdd;

    /* renamed from: hg, reason: collision with root package name */
    private boolean f24854hg;
    private int hnk;
    private String hts;
    private int ifk;
    private float ivm;
    private int ix;
    private int jkf;
    private int jp;
    private String kik;
    private boolean km;
    private String ku;
    private JSONObject lo;
    private boolean lpy;
    private boolean lw;
    private String lz;
    private int meb;
    private float moa;

    /* renamed from: ne, reason: collision with root package name */
    private int f24855ne;
    private JSONObject nj;
    private boolean nkh;

    /* renamed from: oa, reason: collision with root package name */
    private float f24856oa;
    private String oib;
    private String orq;
    private int ot;
    private int ou;
    private String oyt;
    private int pu;
    private double pz;
    private JSONObject qn;
    private boolean rj;
    private int rl;
    private boolean rt;
    private int sk;
    private String sw;
    private double swd;
    private String sy;
    private String syr;
    private boolean tam;

    /* renamed from: tc, reason: collision with root package name */
    private boolean f24857tc;
    private String tpx;

    /* renamed from: ue, reason: collision with root package name */
    private int f24858ue;
    private float uef;

    /* renamed from: uf, reason: collision with root package name */
    private boolean f24859uf;
    private String up;
    private String uqx;
    private int us;
    private double uu;
    private int uxr;
    private boolean vep;
    private boolean vj;
    private int vjj;
    private JSONObject vyg;

    /* renamed from: wd, reason: collision with root package name */
    private String f24860wd;

    /* renamed from: wf, reason: collision with root package name */
    private int f24861wf;
    private String wk;
    private int wp;
    private double wrv;
    private int wxf;
    private float xs;
    private String xvp;
    private String xw;
    private int ykf;
    private float yo;
    private float zjm;
    private boolean zou;

    private void ue(String str) {
        this.kik = str;
    }

    public static ivm uef(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ivm ivmVar = new ivm();
        ivmVar.oa(jSONObject.optString("adType", "embeded"));
        ivmVar.wk(jSONObject.optString("clickArea", "creative"));
        ivmVar.ab(jSONObject.optString("clickTigger", "click"));
        ivmVar.yo(jSONObject.optString("fontFamily", "PingFangSC"));
        ivmVar.moa(jSONObject.optString("textAlign", "left"));
        ivmVar.lw(jSONObject.optString("color", "#999999"));
        ivmVar.ivm(jSONObject.optString("bgColor", "transparent"));
        ivmVar.xs(jSONObject.optString("bgImgUrl", ""));
        ivmVar.ue(jSONObject.optString("bgImgData", ""));
        ivmVar.bcc(jSONObject.optString("borderColor", "#000000"));
        ivmVar.cz(jSONObject.optString("borderStyle", "solid"));
        ivmVar.zjm(jSONObject.optString("heightMode", "auto"));
        ivmVar.dj(jSONObject.optString("widthMode", "fixed"));
        ivmVar.wrv(jSONObject.optString("interactText", ""));
        ivmVar.yo(jSONObject.optBoolean("isShowBgControl", false));
        ivmVar.cq(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            ivmVar.xs(jSONObjectOptJSONObject.optInt("translateY", 0));
            ivmVar.bcc(jSONObjectOptJSONObject.optInt("translateX", 0));
            ivmVar.moa(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            ivmVar.lw(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        ivmVar.dz(jSONObject.optString("interactType", ""));
        ivmVar.lw(jSONObject.optInt("interactSlideDirection", -1));
        ivmVar.bs(jSONObject.optString("justifyHorizontal", "space-around"));
        ivmVar.sy(jSONObject.optString("justifyVertical", "flex-start"));
        ivmVar.oa(jSONObject.optDouble("timingStart"));
        ivmVar.yo(jSONObject.optDouble("timingEnd"));
        ivmVar.moa((float) jSONObject.optDouble("width", 0.0d));
        ivmVar.yo((float) jSONObject.optDouble("height", 0.0d));
        ivmVar.uef((float) jSONObject.optDouble("borderRadius", 0.0d));
        ivmVar.oa((float) jSONObject.optDouble("borderSize", 0.0d));
        ivmVar.oa(jSONObject.optBoolean("interactValidate", false));
        ivmVar.cz((float) jSONObject.optDouble("fontSize", 0.0d));
        ivmVar.lw((float) jSONObject.optDouble("paddingBottom", 0.0d));
        ivmVar.ivm((float) jSONObject.optDouble("paddingLeft", 0.0d));
        ivmVar.xs((float) jSONObject.optDouble("paddingRight", 0.0d));
        ivmVar.bcc((float) jSONObject.optDouble("paddingTop", 0.0d));
        ivmVar.moa(jSONObject.optBoolean("lineFeed", false));
        ivmVar.cz(jSONObject.optInt("lineCount", 0));
        ivmVar.ivm(jSONObject.optDouble("lineHeight", 1.2d));
        ivmVar.dz(jSONObject.optInt("letterSpacing", 0));
        ivmVar.lw(jSONObject.optBoolean("isDataFixed", false));
        ivmVar.wk(jSONObject.optInt("fontWeight"));
        ivmVar.ivm(jSONObject.optBoolean("lineLimit"));
        ivmVar.ab(jSONObject.optInt("position"));
        ivmVar.oib(jSONObject.optString("align"));
        ivmVar.xs(jSONObject.optBoolean("useLeft"));
        ivmVar.bcc(jSONObject.optBoolean("useRight"));
        ivmVar.cz(jSONObject.optBoolean("useTop"));
        ivmVar.zjm(jSONObject.optBoolean("useBottom"));
        ivmVar.dhk(jSONObject.optString(JsonStorageKeyNames.DATA_KEY));
        ivmVar.oa(jSONObject.optJSONObject("i18n"));
        ivmVar.wrv(jSONObject.optInt("marginLeft"));
        ivmVar.cq(jSONObject.optInt("marginRight"));
        ivmVar.zjm(jSONObject.optInt("marginTop"));
        ivmVar.dj(jSONObject.optInt("marginBottom"));
        ivmVar.bs(jSONObject.optInt("tagMaxCount"));
        ivmVar.dj(jSONObject.optBoolean("allowTextFlow"));
        ivmVar.sy(jSONObject.optInt("textFlowType"));
        ivmVar.oib(jSONObject.optInt("textFlowDuration"));
        ivmVar.dhk(jSONObject.optInt("left"));
        ivmVar.tpx(jSONObject.optInt("right"));
        ivmVar.orq(jSONObject.optInt("top"));
        ivmVar.gzw(jSONObject.optInt("bottom"));
        ivmVar.tpx(jSONObject.optString("alignItems", "flex-start"));
        ivmVar.orq(jSONObject.optString("direction", ""));
        ivmVar.uef(jSONObject.optBoolean("loop", false));
        ivmVar.gsd(jSONObject.optInt("zIndex"));
        ivmVar.cp(jSONObject.optInt("interactVisibleTime"));
        ivmVar.rt(jSONObject.optInt("interactHiddenTime"));
        ivmVar.cq(jSONObject.optBoolean("interactEnableMask"));
        ivmVar.dz(jSONObject.optBoolean("interactWontHide"));
        ivmVar.uef(jSONObject.optString("bgGradient"));
        ivmVar.fz(jSONObject.optInt("areaType"));
        ivmVar.dxx(jSONObject.optInt("interactSlideThreshold", 0));
        ivmVar.km(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.moa.oa() ? 0 : 120));
        ivmVar.sy(jSONObject.optBoolean("openPlayableLandingPage", false));
        ivmVar.yo(jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO));
        ivmVar.moa(jSONObject.optJSONObject("image"));
        ivmVar.lz(jSONObject.optInt("borderShadowExtent"));
        ivmVar.wk(jSONObject.optBoolean("bgGauseBlur"));
        ivmVar.oyt(jSONObject.optInt("bgGauseBlurRadius"));
        ivmVar.ab(jSONObject.optBoolean("showTimeProgress", false));
        ivmVar.bs(jSONObject.optBoolean("showPlayButton", false));
        ivmVar.uef(jSONObject.optDouble("bgColorCg", 0.0d));
        ivmVar.ivm(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        ivmVar.oa(jSONObject.optInt("borderTopLeftRadius", 0));
        ivmVar.uef(jSONObject.optInt("borderTopRightRadius", 0));
        ivmVar.moa(jSONObject.optInt("borderBottomLeftRadius", 0));
        ivmVar.yo(jSONObject.optInt("borderBottomRightRadius", 0));
        ivmVar.lw(jSONObject.optJSONObject("interactI18n"));
        ivmVar.gsd(jSONObject.optString("imageObjectFit"));
        ivmVar.rt(jSONObject.optString("interactTitle"));
        ivmVar.ku(jSONObject.optInt("interactTextPositionTop"));
        ivmVar.gzw(jSONObject.optString("imageLottieTosPath"));
        ivmVar.wrv(jSONObject.optBoolean("animationsLoop"));
        ivmVar.gr(jSONObject.optInt("lottieAppNameMaxLength"));
        ivmVar.pz(jSONObject.optInt("lottieAdDescMaxLength"));
        ivmVar.ue(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i5);
                    uef uefVar = new uef();
                    uefVar.yo(jSONObject2.optString("animationType"));
                    uefVar.uef(jSONObject2.optDouble("animationDuration"));
                    uefVar.oa(jSONObject2.optDouble("animationScaleX"));
                    uefVar.yo(jSONObject2.optDouble("animationScaleY"));
                    uefVar.moa(jSONObject2.optString("animationTimeFunction"));
                    uefVar.moa(jSONObject2.optDouble("animationDelay"));
                    uefVar.ivm(jSONObject2.optInt("animationIterationCount"));
                    uefVar.lw(jSONObject2.optString("animationDirection"));
                    uefVar.lw(jSONObject2.optDouble("animationInterval"));
                    uefVar.uef(jSONObject2.optInt("animationBorderWidth"));
                    uefVar.uef(jSONObject2.optLong(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR));
                    uefVar.oa(jSONObject2.optInt("animationEffectWidth"));
                    uefVar.yo(jSONObject2.optInt("animationSwing", 1));
                    uefVar.moa(jSONObject2.optInt("animationTranslateX"));
                    uefVar.lw(jSONObject2.optInt("animationTranslateY"));
                    uefVar.oa(jSONObject2.optString("animationRippleBackgroundColor"));
                    uefVar.uef(jSONObject2.optString("animationScaleDirection"));
                    uefVar.xs(jSONObject2.optInt("animationFadeStart"));
                    uefVar.bcc(jSONObject2.optInt("animationFadeEnd"));
                    uefVar.ivm(jSONObject2.optString("animationFillMode"));
                    uefVar.cz(jSONObject2.optInt("animationBounceHeight"));
                    if (ivmVar.oib() > 0.0d) {
                        uefVar.moa(uefVar.dz() + ivmVar.oib());
                    }
                    arrayList.add(uefVar);
                }
                ivmVar.uef(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                ivmVar.gr(jSONObject.optString("triggerSlideDirection", "0"));
                ivmVar.uef(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return ivmVar;
    }

    public float ab() {
        return this.bcc;
    }

    public String af() {
        return this.dxx;
    }

    public int aje() {
        return this.ifk;
    }

    public String aos() {
        return this.sw;
    }

    public int au() {
        return this.af;
    }

    public double bcc() {
        return this.uu;
    }

    public float bs() {
        return this.cz;
    }

    public String bx() {
        return this.xvp;
    }

    public boolean cc() {
        return this.vep;
    }

    public int cl() {
        return this.f24855ne;
    }

    public int cop() {
        return this.gb;
    }

    public String cp() {
        return this.gzw;
    }

    public boolean cq() {
        return this.lw;
    }

    public int cz() {
        return this.jp;
    }

    public void df() {
        uef(this, this.qn);
    }

    public int dh() {
        return this.ggp;
    }

    public double dhk() {
        return this.wrv;
    }

    public float dj() {
        return this.uef;
    }

    public int dor() {
        return this.sk;
    }

    public boolean dv() {
        return this.cop;
    }

    public int dxx() {
        return this.gr;
    }

    public boolean dy() {
        return this.tam;
    }

    public float dz() {
        return this.ivm;
    }

    public String efa() {
        return this.xw;
    }

    public String ej() {
        return this.syr;
    }

    public int etd() {
        return this.rl;
    }

    public int fjj() {
        return this.f24853df;
    }

    public boolean fz() {
        return this.rt;
    }

    public int fzf() {
        return this.ix;
    }

    public String gb() {
        return this.fz;
    }

    public int gem() {
        return this.pu;
    }

    public boolean ggp() {
        return this.f24854hg;
    }

    public String gr() {
        return this.oib;
    }

    public String gsd() {
        return this.sy;
    }

    public String gzw() {
        return this.bs;
    }

    public String hdd() {
        return this.f24852cc;
    }

    public boolean hg() {
        return this.dv;
    }

    public boolean hnk() {
        return this.nkh;
    }

    public int hts() {
        return this.etd;
    }

    public int ifk() {
        return this.us;
    }

    public JSONObject ivm() {
        return this.nj;
    }

    public int ix() {
        return this.ot;
    }

    public int jkf() {
        return this.wxf;
    }

    public int jp() {
        return this.fzf;
    }

    public double km() {
        return this.cp;
    }

    public String ku() {
        return this.gsd;
    }

    public String lo() {
        return this.f24860wd;
    }

    public JSONObject lpy() {
        return this.lo;
    }

    public int lw() {
        return this.dy;
    }

    public int lz() {
        return this.f24858ue;
    }

    public int meb() {
        return this.hdd;
    }

    public int moa() {
        return this.meb;
    }

    public int ne() {
        return this.jkf;
    }

    public int nj() {
        return this.bx;
    }

    public boolean nkh() {
        return this.dor;
    }

    public int oa() {
        return this.f24861wf;
    }

    public double oib() {
        return this.dj;
    }

    public String orq() {
        return this.f24851ab;
    }

    public JSONObject ot() {
        return this.vyg;
    }

    public boolean ou() {
        return this.zou;
    }

    public double oyt() {
        return this.pz;
    }

    public String pu() {
        return this.ku;
    }

    public String pz() {
        return this.orq;
    }

    public boolean qn() {
        return this.f24859uf;
    }

    public int rj() {
        return this.gem;
    }

    public String rl() {
        return this.oyt;
    }

    public String rt() {
        return this.kik;
    }

    public String sk() {
        return this.lz;
    }

    public int sw() {
        return this.ou;
    }

    public boolean swd() {
        return this.km;
    }

    public float sy() {
        return this.zjm;
    }

    public List<uef> syr() {
        return this.aos;
    }

    public int tam() {
        return this.wp;
    }

    public boolean tc() {
        return this.lpy;
    }

    public String tpx() {
        return this.wk;
    }

    public int uf() {
        List<uef> list = this.aos;
        if (list == null) {
            return 0;
        }
        for (uef uefVar : list) {
            if ("translate".equals(uefVar.cz()) && uefVar.xs() < 0) {
                return -uefVar.xs();
            }
        }
        return 0;
    }

    public double uqx() {
        return this.swd;
    }

    public int us() {
        return this.uxr;
    }

    public int uu() {
        return this.dh;
    }

    public void uxr() {
        uef(this, this.lo);
    }

    public boolean vep() {
        return this.ej;
    }

    public int vj() {
        return this.vjj;
    }

    public String vjj() {
        return this.hts;
    }

    public String vyg() {
        return this.uqx;
    }

    public boolean wd() {
        return this.fjj;
    }

    public int wf() {
        return this.cl;
    }

    public float wk() {
        return this.xs;
    }

    public String wp() {
        return this.efa;
    }

    public float wrv() {
        return this.f24856oa;
    }

    public boolean wxf() {
        return this.rj;
    }

    public int xs() {
        return this.aje;
    }

    public int xvp() {
        return this.hnk;
    }

    public long xw() {
        return this.az;
    }

    public boolean ykf() {
        return this.f24857tc;
    }

    public int yo() {
        return this.ykf;
    }

    public String zjm() {
        return this.up;
    }

    public int zou() {
        return this.au;
    }

    public void ab(String str) {
        this.dxx = str;
    }

    public void bcc(float f10) {
        this.cz = f10;
    }

    public void bs(String str) {
        this.lz = str;
    }

    public void cp(int i5) {
        this.dh = i5;
    }

    public void cq(String str) {
        this.gsd = str;
    }

    public void cz(float f10) {
        this.zjm = f10;
    }

    public void dhk(String str) {
        this.hts = str;
    }

    public void dj(String str) {
        this.orq = str;
    }

    public void dxx(int i5) {
        this.fzf = i5;
    }

    public void dz(String str) {
        this.ku = str;
    }

    public void fz(int i5) {
        this.bx = i5;
    }

    public void gr(int i5) {
        this.wp = i5;
    }

    public void gsd(int i5) {
        this.ix = i5;
    }

    public void gzw(int i5) {
        this.ggp = i5;
    }

    public void ivm(int i5) {
        this.jp = i5;
    }

    public void km(int i5) {
        this.us = i5;
    }

    public void ku(int i5) {
        this.ifk = i5;
    }

    public void lw(int i5) {
        this.aje = i5;
    }

    public void lz(int i5) {
        this.cl = i5;
    }

    public void moa(int i5) {
        this.dy = i5;
    }

    public void oa(int i5) {
        this.ykf = i5;
    }

    public void oib(String str) {
        this.uqx = str;
    }

    public void orq(int i5) {
        this.jkf = i5;
    }

    public void oyt(int i5) {
        this.hdd = i5;
    }

    public void pz(int i5) {
        this.uxr = i5;
    }

    public void rt(int i5) {
        this.f24855ne = i5;
    }

    public void sy(String str) {
        this.oyt = str;
    }

    public void tpx(int i5) {
        this.ot = i5;
    }

    public String ue() {
        return this.tpx;
    }

    public void wk(String str) {
        this.fz = str;
    }

    public void wrv(String str) {
        this.gzw = str;
    }

    public void xs(float f10) {
        this.bcc = f10;
    }

    public void yo(int i5) {
        this.meb = i5;
    }

    public void zjm(String str) {
        this.tpx = str;
    }

    public void ab(int i5) {
        this.etd = i5;
    }

    public void bcc(String str) {
        this.oib = str;
    }

    public void bs(int i5) {
        this.wxf = i5;
    }

    public void cq(int i5) {
        this.rl = i5;
    }

    public void cz(String str) {
        this.dhk = str;
    }

    public void dhk(int i5) {
        this.vjj = i5;
    }

    public void dj(int i5) {
        this.af = i5;
    }

    public void dz(int i5) {
        this.gem = i5;
    }

    public void gr(String str) {
        this.xw = str;
    }

    public void gsd(String str) {
        this.f24860wd = str;
    }

    public void gzw(String str) {
        this.f24852cc = str;
    }

    public void ivm(float f10) {
        this.xs = f10;
    }

    public void lw(float f10) {
        this.ivm = f10;
    }

    public void moa(float f10) {
        this.moa = f10;
    }

    public void oa(float f10) {
        this.f24856oa = f10;
    }

    public void oib(int i5) {
        this.hnk = i5;
    }

    public void orq(String str) {
        this.xvp = str;
    }

    public void rt(String str) {
        this.efa = str;
    }

    public void sy(int i5) {
        this.ou = i5;
    }

    public void tpx(String str) {
        this.sw = str;
    }

    public void ue(int i5) {
        this.f24853df = i5;
    }

    public void wk(int i5) {
        this.au = i5;
    }

    public void wrv(int i5) {
        this.sk = i5;
    }

    public void xs(String str) {
        this.sy = str;
    }

    public void yo(float f10) {
        this.yo = f10;
    }

    public void zjm(int i5) {
        this.gb = i5;
    }

    public void ab(boolean z2) {
        this.tam = z2;
    }

    public void bcc(int i5) {
        this.f24858ue = i5;
    }

    public void bs(boolean z2) {
        this.fjj = z2;
    }

    public void cq(boolean z2) {
        this.ej = z2;
    }

    public void cz(int i5) {
        this.pu = i5;
    }

    public void dj(boolean z2) {
        this.f24854hg = z2;
    }

    public void dz(boolean z2) {
        this.f24859uf = z2;
    }

    public void ivm(String str) {
        this.bs = str;
    }

    public void lw(String str) {
        this.f24851ab = str;
    }

    public void moa(String str) {
        this.wk = str;
    }

    public void oa(boolean z2) {
        this.lw = z2;
    }

    public void sy(boolean z2) {
        this.vep = z2;
    }

    public void wk(boolean z2) {
        this.f24857tc = z2;
    }

    public void wrv(boolean z2) {
        this.lpy = z2;
    }

    public void xs(int i5) {
        this.gr = i5;
    }

    public void yo(double d3) {
        this.wrv = d3;
    }

    public void zjm(boolean z2) {
        this.nkh = z2;
    }

    public void bcc(boolean z2) {
        this.dv = z2;
    }

    public void cz(boolean z2) {
        this.zou = z2;
    }

    public void ivm(double d3) {
        this.swd = d3;
    }

    public void lw(double d3) {
        this.cp = d3;
    }

    public void moa(double d3) {
        this.pz = d3;
    }

    public void oa(double d3) {
        this.dj = d3;
    }

    public void xs(boolean z2) {
        this.rj = z2;
    }

    public void yo(String str) {
        this.dz = str;
    }

    public void ivm(boolean z2) {
        this.dor = z2;
    }

    public void lw(boolean z2) {
        this.cop = z2;
    }

    public void moa(boolean z2) {
        this.km = z2;
    }

    public void oa(String str) {
        this.cq = str;
    }

    public void yo(boolean z2) {
        this.rt = z2;
    }

    public void lw(JSONObject jSONObject) {
        this.nj = jSONObject;
    }

    public void moa(JSONObject jSONObject) {
        this.lo = jSONObject;
    }

    public void oa(JSONObject jSONObject) {
        this.vyg = jSONObject;
    }

    public void yo(JSONObject jSONObject) {
        this.qn = jSONObject;
    }

    public boolean uef() {
        return this.vj;
    }

    public void uef(boolean z2) {
        this.vj = z2;
    }

    public void uef(int i5) {
        this.f24861wf = i5;
    }

    public void uef(double d3) {
        this.uu = d3;
    }

    public void uef(String str) {
        this.up = str;
    }

    public void uef(float f10) {
        this.uef = f10;
    }

    public void uef(List<uef> list) {
        this.aos = list;
    }

    public void uef(long j8) {
        this.az = j8;
    }

    private void uef(ivm ivmVar, JSONObject jSONObject) {
        String next;
        if (ivmVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            next = itKeys.next();
            next.getClass();
            switch (next) {
                case "isShowBgControl":
                    ivmVar.yo(jSONObject.optBoolean(next, false));
                    break;
                case "clickArea":
                    ivmVar.wk(jSONObject.optString(next));
                    break;
                case "triggerSlideDirection":
                    ivmVar.gr(jSONObject.optString(next));
                    break;
                case "bgImgUrl":
                    ivmVar.xs(jSONObject.optString(next));
                    break;
                case "lineCount":
                    ivmVar.cz(jSONObject.optInt(next));
                    break;
                case "openPlayableLandingPage":
                    ivmVar.sy(jSONObject.optBoolean(next));
                    break;
                case "lineLimit":
                    ivmVar.ivm(jSONObject.optBoolean(next));
                    break;
                case "interactBgColor":
                    ivmVar.cq(jSONObject.optString(next));
                    break;
                case "paddingLeft":
                    ivmVar.ivm((float) jSONObject.optDouble(next));
                    break;
                case "adType":
                    ivmVar.oa(jSONObject.optString(next));
                    break;
                case "bottom":
                    ivmVar.gzw(jSONObject.optInt(next));
                    break;
                case "fontFamily":
                    ivmVar.yo(jSONObject.optString(next));
                    break;
                case "height":
                    ivmVar.yo((float) jSONObject.optDouble(next));
                    break;
                case "textAlign":
                    ivmVar.moa(jSONObject.optString(next));
                    break;
                case "alignItems":
                    ivmVar.tpx(jSONObject.optString(next));
                    break;
                case "interactValidate":
                    ivmVar.oa(jSONObject.optBoolean(next));
                    break;
                case "marginTop":
                    ivmVar.zjm(jSONObject.optInt(next));
                    break;
                case "useBottom":
                    ivmVar.zjm(jSONObject.optBoolean(next));
                    break;
                case "triggerSlideMinDistance":
                    ivmVar.uef(jSONObject.optLong(next));
                    break;
                case "direction":
                    ivmVar.orq(jSONObject.optString(next));
                    break;
                case "tagMaxCount":
                    ivmVar.bs(jSONObject.optInt(next));
                    break;
                case "interactHiddenTime":
                    ivmVar.rt(jSONObject.optInt(next));
                    break;
                case "useTop":
                    ivmVar.cz(jSONObject.optBoolean(next));
                    break;
                case "fontWeight":
                    ivmVar.wk(jSONObject.optInt(next));
                    break;
                case "zIndex":
                    ivmVar.gsd(jSONObject.optInt(next));
                    break;
                case "timingStart":
                    ivmVar.oa(jSONObject.optDouble(next));
                    break;
                case "lineHeight":
                    ivmVar.ivm(jSONObject.optDouble(next));
                    break;
                case "textFlowDuration":
                    ivmVar.oib(jSONObject.optInt(next));
                    break;
                case "useRight":
                    ivmVar.bcc(jSONObject.optBoolean(next));
                    break;
                case "marginBottom":
                    ivmVar.dj(jSONObject.optInt(next));
                    break;
                case "bgColor":
                    ivmVar.ivm(jSONObject.optString(next));
                    break;
                case "useLeft":
                    ivmVar.xs(jSONObject.optBoolean(next));
                    break;
                case "widthMode":
                    ivmVar.dj(jSONObject.optString(next));
                    break;
                case "top":
                    ivmVar.orq(jSONObject.optInt(next));
                    break;
                case "data":
                    ivmVar.dhk(jSONObject.optString(next));
                    break;
                case "left":
                    ivmVar.dhk(jSONObject.optInt(next));
                    break;
                case "loop":
                    ivmVar.uef(jSONObject.optBoolean(next));
                    break;
                case "paddingTop":
                    ivmVar.bcc((float) jSONObject.optDouble(next));
                    break;
                case "align":
                    ivmVar.oib(jSONObject.optString(next));
                    break;
                case "color":
                    ivmVar.lw(jSONObject.optString(next));
                    break;
                case "right":
                    ivmVar.tpx(jSONObject.optInt(next));
                    break;
                case "width":
                    ivmVar.moa((float) jSONObject.optDouble(next));
                    break;
                case "timingEnd":
                    ivmVar.yo(jSONObject.optDouble(next));
                    break;
                case "paddingBottom":
                    ivmVar.lw((float) jSONObject.optDouble(next));
                    break;
                case "allowTextFlow":
                    ivmVar.dj(jSONObject.optBoolean(next));
                    break;
                case "interactWontHide":
                    ivmVar.dz(jSONObject.optBoolean(next));
                    break;
                case "fontSize":
                    ivmVar.cz((float) jSONObject.optDouble(next));
                    break;
                case "justifyVertical":
                    ivmVar.sy(jSONObject.optString(next));
                    break;
                case "interactVisibleTime":
                    ivmVar.cp(jSONObject.optInt(next));
                    break;
                case "paddingRight":
                    ivmVar.xs((float) jSONObject.optDouble(next));
                    break;
                case "borderColor":
                    ivmVar.bcc(jSONObject.optString(next));
                    break;
                case "borderStyle":
                    ivmVar.cz(jSONObject.optString(next));
                    break;
                case "position":
                    ivmVar.ab(jSONObject.optInt(next));
                    break;
                case "isDataFixed":
                    ivmVar.lw(jSONObject.optBoolean(next));
                    break;
                case "marginRight":
                    ivmVar.cq(jSONObject.optInt(next));
                    break;
                case "justifyHorizontal":
                    ivmVar.bs(jSONObject.optString(next));
                    break;
                case "interactPosition":
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        ivmVar.xs(jSONObjectOptJSONObject.optInt("translateY", 0));
                        ivmVar.bcc(jSONObjectOptJSONObject.optInt("translateX", 0));
                        ivmVar.moa(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        ivmVar.lw(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case "lineFeed":
                    ivmVar.moa(jSONObject.optBoolean(next));
                    break;
                case "interactText":
                    ivmVar.wrv(jSONObject.optString(next));
                    break;
                case "interactType":
                    ivmVar.dz(jSONObject.optString(next));
                    break;
                case "borderRadius":
                    ivmVar.uef((float) jSONObject.optDouble(next));
                    break;
                case "clickTigger":
                    ivmVar.ab(jSONObject.optString(next));
                    break;
                case "heightMode":
                    ivmVar.zjm(jSONObject.optString(next));
                    break;
                case "textFlowType":
                    ivmVar.sy(jSONObject.optInt(next));
                    break;
                case "borderSize":
                    ivmVar.oa((float) jSONObject.optDouble(next));
                    break;
                case "marginLeft":
                    ivmVar.wrv(jSONObject.optInt(next));
                    break;
                case "letterSpacing":
                    ivmVar.dz(jSONObject.optInt(next));
                    break;
            }
        }
    }
}

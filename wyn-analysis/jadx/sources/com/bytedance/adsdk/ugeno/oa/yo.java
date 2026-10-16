package com.bytedance.adsdk.ugeno.oa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.ab;
import com.bytedance.adsdk.ugeno.core.bcc;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.core.dj;
import com.bytedance.adsdk.ugeno.core.oa.ivm;
import com.bytedance.adsdk.ugeno.core.oa.lw;
import com.bytedance.adsdk.ugeno.core.oa.moa;
import com.bytedance.adsdk.ugeno.core.sy;
import com.bytedance.adsdk.ugeno.core.wk;
import com.bytedance.adsdk.ugeno.core.xs;
import com.bytedance.adsdk.ugeno.core.zjm;
import com.bytedance.adsdk.ugeno.moa;
import com.bytedance.adsdk.ugeno.moa.cz;
import com.bytedance.adsdk.ugeno.moa.dz;
import com.bytedance.adsdk.ugeno.oa.uef;
import com.bytedance.adsdk.ugeno.uef;
import com.bytedance.adsdk.ugeno.xs.uef;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class yo<T extends View> implements View.OnTouchListener, wk.oa, wk.uef, moa {

    /* renamed from: ab, reason: collision with root package name */
    protected float f24750ab;
    protected ImageView.ScaleType af;
    private boolean agr;
    private boolean aje;
    protected float aos;
    protected float au;
    private sy az;
    protected xs.uef bcc;
    protected float bs;
    protected float bx;

    /* renamed from: cc, reason: collision with root package name */
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.oa.yo f24751cc;
    protected bcc cl;
    protected float cop;
    protected float cp;
    protected float cq;
    protected dj cz;

    /* renamed from: df, reason: collision with root package name */
    private zjm f24752df;
    protected float dh;
    protected float dhk;
    protected String dj;
    protected float dor;
    protected boolean dv;
    protected boolean dxx;
    private String dy;
    protected float dz;
    private boolean efa;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.oa.oa ej;
    private boolean em;
    protected float etd;
    protected Map<Integer, cq> fjj;
    protected boolean fz;
    protected float fzf;
    protected String gb;
    protected float gem;
    protected float ggp;
    private long gk;
    protected float gr;
    protected boolean gsd;
    protected boolean gzw;
    protected wk hdd;

    /* renamed from: hg, reason: collision with root package name */
    protected float f24753hg;
    private dz hjx;
    protected ViewGroup.LayoutParams hnk;
    protected int hts;
    private com.bytedance.adsdk.ugeno.moa.uef.uef hw;

    @Deprecated
    private ivm ifk;
    private boolean iou;
    protected uef<ViewGroup> ivm;
    protected float ix;
    protected float jkf;
    private boolean jp;
    private boolean jx;
    private boolean kik;
    protected boolean km;
    private com.bytedance.adsdk.ugeno.moa.cq kn;
    protected float ku;
    private boolean lo;

    @Deprecated
    private lw lpy;
    protected T lw;
    protected boolean lz;
    private GradientDrawable meb;
    protected JSONObject moa;

    /* renamed from: ne, reason: collision with root package name */
    protected float f24754ne;
    private boolean nj;
    protected float nkh;
    private JSONObject no;

    /* renamed from: oa, reason: collision with root package name */
    protected Context f24755oa;
    protected float oib;
    protected boolean orq;
    protected com.bytedance.adsdk.ugeno.uef.ivm ot;
    protected boolean ou;
    protected boolean oyt;
    protected int pu;
    protected float pz;
    private boolean qn;
    protected boolean rj;
    protected boolean rl;
    protected boolean rt;
    protected float sk;
    protected float sw;
    protected boolean swd;
    protected float sy;
    private boolean syr;
    protected com.bytedance.adsdk.ugeno.core.ivm tam;

    /* renamed from: tc, reason: collision with root package name */
    protected ab f24756tc;
    private boolean tkg;
    protected float tpx;

    /* renamed from: try, reason: not valid java name */
    private boolean f2try;

    /* renamed from: ue, reason: collision with root package name */
    protected float f24757ue;
    private boolean uef;

    /* renamed from: uf, reason: collision with root package name */
    private boolean f24758uf;
    private boolean up;
    protected boolean uqx;
    protected boolean us;
    protected cz uu;
    private String uxr;
    protected uef.C0046uef vep;
    protected float vj;
    protected com.bytedance.adsdk.ugeno.uef.uef vjj;
    private boolean vup;
    protected String vyg;

    /* renamed from: wd, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.uef f24759wd;

    /* renamed from: wf, reason: collision with root package name */
    private boolean f24760wf;
    protected float wk;

    @Deprecated
    private moa.uef wp;
    protected String wrv;
    protected int wxf;
    protected uef<ViewGroup> xs;
    protected float xvp;
    private boolean xw;
    private boolean ykf;
    protected JSONObject yo;
    protected boolean zjm;
    protected boolean zou;
    private float zrl;

    public yo(Context context) {
        this(context, null);
    }

    private void cz() throws JSONException {
        cq cqVar;
        if (this.hdd == null || !oa(18) || (cqVar = this.fjj.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectYo = cqVar.yo();
        if (jSONObjectYo != null) {
            try {
                jSONObjectYo.put("rotateZ", com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObjectYo.optString("rotateZ"), this.moa));
            } catch (JSONException unused) {
            }
        }
        this.hdd.uef(cqVar, this, this);
    }

    private void dv() {
        if (TextUtils.equals("dashed", this.vyg)) {
            GradientDrawable gradientDrawable = this.meb;
            float f10 = this.nkh;
            gradientDrawable.setStroke((int) f10, this.hts, 3.0f * f10, f10);
        } else {
            if (!TextUtils.equals("dotted", this.vyg)) {
                this.meb.setStroke((int) this.nkh, this.hts);
                return;
            }
            GradientDrawable gradientDrawable2 = this.meb;
            float f11 = this.nkh;
            gradientDrawable2.setStroke((int) f11, this.hts, f11 / 2.0f, f11);
        }
    }

    @Deprecated
    private void moa() throws JSONException {
        com.bytedance.adsdk.ugeno.core.oa.moa moaVarMoa;
        this.lw.setVisibility(this.wxf);
        float f10 = this.bx;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.lw.setRotation(f10);
        }
        xs.uef uefVar = this.bcc;
        if (uefVar != null && TextUtils.isEmpty(uefVar.oa())) {
            this.lw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.oa.yo.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    yo yoVar = yo.this;
                    if (yoVar.cl != null) {
                        boolean unused = yoVar.jx;
                    }
                }
            });
        } else if (oa(1) && !this.efa) {
            this.lw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.oa.yo.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    yo yoVar = yo.this;
                    if (yoVar.hdd == null || !yoVar.jx) {
                        return;
                    }
                    yo yoVar2 = yo.this;
                    wk wkVar = yoVar2.hdd;
                    cq cqVar = yoVar2.fjj.get(1);
                    yo yoVar3 = yo.this;
                    wkVar.uef(cqVar, yoVar3, yoVar3);
                }
            });
        }
        if (this.hdd != null && oa(4)) {
            if (oa(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + lz());
                this.xw = true;
                this.lpy = new lw(this.f24755oa, this.fjj.get(4), this.fjj.get(1), this.xw, rj(), this.vup);
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + lz());
                this.lpy = new lw(this.f24755oa, this.fjj.get(4), this.xw, rj(), this.vup);
            }
        }
        if (this.hdd != null && oa(1) && this.efa) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.efa + ", view.id: " + lz());
            this.f24751cc = new com.bytedance.adsdk.ugeno.core.oa.yo(this.f24755oa, this.fjj.get(1));
        }
        cz();
        if (this.hdd != null && oa(3) && (moaVarMoa = com.bytedance.adsdk.ugeno.lw.uef().moa()) != null) {
            this.wp = moaVarMoa.uef(this.f24755oa, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.oa.yo.3
            };
        }
        if (this.hdd != null && oa(9)) {
            ivm ivmVar = new ivm(this.f24755oa, this.fjj.get(9), this);
            this.ifk = ivmVar;
            ivmVar.uef(this.hdd);
        }
        if (oa(10)) {
            com.bytedance.adsdk.ugeno.core.oa.oa oaVar = new com.bytedance.adsdk.ugeno.core.oa.oa(this.f24755oa, this.fjj.get(10), this);
            this.ej = oaVar;
            oaVar.uef(this.hdd);
        }
    }

    private void zjm() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.dj);
        this.lw.setContentDescription(sb2);
    }

    private void zou() {
        float f10 = this.uqx ? this.cop : this.gem;
        float f11 = this.rj ? this.dor : this.gem;
        float f12 = this.dv ? this.au : this.gem;
        float f13 = this.zou ? this.etd : this.gem;
        this.meb.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    public float ab() {
        return this.sw;
    }

    public int af() {
        return this.pu;
    }

    public float au() {
        T t10 = this.lw;
        return t10 instanceof com.bytedance.adsdk.ugeno.uef.xs ? ((com.bytedance.adsdk.ugeno.uef.xs) t10).getShine() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void bcc() {
        zjm zjmVar = this.f24752df;
        if (zjmVar != null) {
            zjmVar.oa();
        }
        com.bytedance.adsdk.ugeno.uef.uef uefVar = this.vjj;
        if (uefVar != null) {
            uefVar.yo();
        }
        com.bytedance.adsdk.ugeno.uef.ivm ivmVar = this.ot;
        if (ivmVar != null) {
            ivmVar.yo();
        }
    }

    public float bs() {
        return this.vj;
    }

    public float cop() {
        T t10 = this.lw;
        return t10 instanceof com.bytedance.adsdk.ugeno.uef.xs ? ((com.bytedance.adsdk.ugeno.uef.xs) t10).getRipple() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ViewGroup.LayoutParams cp() {
        return this.hnk;
    }

    public void cq() {
        boolean zOptBoolean = this.moa.optBoolean("gesture_through_enable", false);
        xs.uef uefVar = this.bcc;
        boolean z2 = uefVar == null || uefVar.yo();
        this.tkg = zOptBoolean && z2;
        Log.d("GesThrough_UGenWidget", "gesBySettings: " + zOptBoolean + ", gesByTemplate: " + z2 + ", mGestureThroughEnabled: " + this.tkg);
        this.vup = this.moa.optBoolean("is_adapt_two_finger", false);
    }

    public float dhk() {
        return this.aos;
    }

    public T dj() {
        return this.lw;
    }

    public float dor() {
        T t10 = this.lw;
        return t10 instanceof com.bytedance.adsdk.ugeno.uef.xs ? ((com.bytedance.adsdk.ugeno.uef.xs) t10).getStretch() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public uef dxx() {
        return this.ivm;
    }

    public void dz() {
        this.lw.setPadding((int) (this.dxx ? this.f24757ue : this.gr), (int) (this.oyt ? this.cp : this.gr), (int) (this.lz ? this.pz : this.gr), (int) (this.km ? this.ku : this.gr));
    }

    public float etd() {
        T t10 = this.lw;
        return t10 instanceof com.bytedance.adsdk.ugeno.uef.xs ? ((com.bytedance.adsdk.ugeno.uef.xs) t10).getRubIn() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public boolean fz() {
        return this.zjm;
    }

    public boolean gb() {
        return this.ou;
    }

    public boolean gem() {
        return this.f24753hg > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public JSONObject gr() {
        return this.yo;
    }

    public wk gsd() {
        return this.hdd;
    }

    public float gzw() {
        return this.gem;
    }

    public yo<T> ivm(String str) {
        return oa(str);
    }

    public int km() {
        return (int) this.cq;
    }

    public xs.uef ku() {
        return this.bcc;
    }

    public yo<T> lw(String str) {
        return uef(str);
    }

    public String lz() {
        return this.dj;
    }

    public void oa(JSONObject jSONObject) {
        this.moa = jSONObject;
        cq();
    }

    public float oib() {
        return this.dh;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        lw lwVar;
        wk wkVar;
        com.bytedance.adsdk.ugeno.core.oa.yo yoVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            rl();
        } else if (action == 1 || action == 3) {
            swd();
        }
        ab abVar = this.f24756tc;
        if (abVar != null) {
            abVar.uef(this, motionEvent);
        }
        if (oa(17) && motionEvent.getAction() == 0) {
            this.hdd.uef(this.fjj.get(17), this, this);
        }
        if (oa(1) && this.efa && (wkVar = this.hdd) != null && (yoVar = this.f24751cc) != null) {
            return yoVar.uef(wkVar, this, motionEvent);
        }
        wk wkVar2 = this.hdd;
        if (wkVar2 != null && (lwVar = this.lpy) != null) {
            return lwVar.uef(wkVar2, this, motionEvent, rj());
        }
        cz czVar = this.uu;
        if (czVar != null) {
            return czVar.uef(motionEvent);
        }
        return false;
    }

    public float orq() {
        return this.fzf;
    }

    public String oyt() {
        return this.wrv;
    }

    public int pu() {
        return (int) this.dz;
    }

    public void pz() {
        com.bytedance.adsdk.ugeno.lw.uef().oa().uef(this.cz, this.gb, new uef.InterfaceC0044uef() { // from class: com.bytedance.adsdk.ugeno.oa.yo.4
            @Override // com.bytedance.adsdk.ugeno.uef.InterfaceC0044uef
            public void uef(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                yo yoVar = yo.this;
                if (!yoVar.rl) {
                    com.bytedance.adsdk.ugeno.xs.bcc.uef(new Runnable() { // from class: com.bytedance.adsdk.ugeno.oa.yo.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            yo.this.uef(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapUef = com.bytedance.adsdk.ugeno.xs.bcc.uef(yoVar.f24755oa, bitmap, (int) yoVar.sk);
                if (bitmapUef != null) {
                    com.bytedance.adsdk.ugeno.xs.bcc.uef(new Runnable() { // from class: com.bytedance.adsdk.ugeno.oa.yo.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            yo.this.uef(new BitmapDrawable(bitmapUef));
                        }
                    });
                }
            }
        });
    }

    public boolean rj() {
        return this.tkg;
    }

    public void rl() {
    }

    public long rt() {
        return this.gk;
    }

    public com.bytedance.adsdk.ugeno.moa.uef.uef sk() {
        return this.hw;
    }

    public void swd() {
    }

    public float sy() {
        return this.ix;
    }

    public float tpx() {
        return this.bx;
    }

    public void ue() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapUef;
        if (TextUtils.isEmpty(this.gb)) {
            if (this.us) {
                uef(this.vep);
                return;
            } else {
                this.meb.setColor(this.pu);
                moa(this.pu);
                return;
            }
        }
        if (!this.gb.startsWith("local://")) {
            pz();
            return;
        }
        String strReplace = this.gb.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.rl ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f24755oa.getResources().openRawResource(com.bytedance.adsdk.ugeno.xs.moa.oa(this.f24755oa, strReplace)), null, options);
            if (this.rl && (bitmapUef = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, bitmapDecodeStream, (int) this.sk)) != null) {
                bitmapDrawable = new BitmapDrawable(this.f24755oa.getResources(), bitmapUef);
                uef(bitmapDrawable);
            } else {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.f24755oa.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
                uef(bitmapDrawable);
            }
        } catch (Throwable unused) {
        }
    }

    public T uef() {
        return null;
    }

    public boolean uqx() {
        return this.ykf;
    }

    public float wk() {
        return this.ggp;
    }

    public JSONObject wrv() {
        return this.moa;
    }

    public void xs() {
        com.bytedance.adsdk.ugeno.core.uef uefVar = this.f24759wd;
        if (uefVar != null) {
            zjm zjmVar = new zjm(this.lw, uefVar);
            this.f24752df = zjmVar;
            zjmVar.uef();
        }
        com.bytedance.adsdk.ugeno.uef.uef uefVar2 = this.vjj;
        if (uefVar2 != null) {
            uefVar2.uef();
        }
        com.bytedance.adsdk.ugeno.uef.ivm ivmVar = this.ot;
        if (ivmVar != null) {
            ivmVar.oa();
        }
        cz czVar = this.uu;
        if (czVar != null) {
            czVar.lw();
        }
        if (this.ej != null && oa(10)) {
            this.ej.uef();
        }
        if (this.ifk != null && oa(9)) {
            this.ifk.uef();
        }
        lw lwVar = this.lpy;
        if (lwVar != null) {
            lwVar.uef();
        }
        this.gk = System.currentTimeMillis();
    }

    public yo(Context context, uef<ViewGroup> uefVar) {
        this.cq = -2.0f;
        this.dz = -2.0f;
        this.vyg = "solid";
        this.wxf = 0;
        this.ou = true;
        this.jkf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ggp = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.sw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.xvp = 1.0f;
        this.vj = 1.0f;
        this.ix = 1.0f;
        this.f24754ne = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.dh = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.aos = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.fzf = 1.0f;
        this.f24760wf = true;
        this.jx = true;
        this.agr = false;
        this.em = false;
        this.tkg = false;
        this.vup = false;
        this.zrl = 12.0f;
        this.f24755oa = context;
        this.ivm = uefVar;
        this.fjj = new HashMap();
        this.meb = new GradientDrawable();
        this.lw = (T) uef();
    }

    private void yo() {
        if (this.uef) {
            this.lw.setTranslationX(this.ggp);
        }
        if (this.qn) {
            this.lw.setTranslationY(this.sw);
        }
        if (this.lo) {
            this.lw.setScaleX(this.vj);
        }
        if (this.aje) {
            this.lw.setScaleY(this.ix);
        }
        if (this.syr) {
            this.lw.setRotation(this.f24754ne);
        }
        if (this.f24758uf) {
            this.lw.setRotationX(this.dh);
        }
        if (this.nj) {
            this.lw.setRotationY(-this.aos);
        }
        if (this.jp) {
            this.lw.setAlpha(this.fzf);
        }
        float f10 = this.bx;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.lw.setRotation(f10);
        }
        if (this.syr || this.f24758uf || this.nj) {
            this.lw.setCameraDistance(10000.0f);
        }
    }

    public List<com.bytedance.adsdk.ugeno.moa.moa.yo> dj(String str) {
        cz czVar;
        if (TextUtils.isEmpty(str) || (czVar = this.uu) == null) {
            return null;
        }
        return czVar.uef(str);
    }

    @Override // com.bytedance.adsdk.ugeno.moa
    public void ivm() {
        if (this.az == null || this.iou) {
            return;
        }
        this.iou = true;
    }

    @Override // com.bytedance.adsdk.ugeno.moa
    public void lw() {
        if (this.az == null || this.kik) {
            return;
        }
        this.kik = true;
    }

    public void uef(String str, Map<String, Object> map) {
    }

    public com.bytedance.adsdk.ugeno.uef.uef wrv(String str) {
        com.bytedance.adsdk.ugeno.uef.uef uefVar = this.vjj;
        if (uefVar != null && TextUtils.equals(str, uefVar.lw())) {
            return this.vjj;
        }
        com.bytedance.adsdk.ugeno.uef.ivm ivmVar = this.ot;
        if (ivmVar != null) {
            return ivmVar.uef(str);
        }
        return null;
    }

    public void oa() throws JSONException {
        ue();
        dz();
        yo(this.wxf);
        yo();
        moa();
        cz czVar = this.uu;
        if (czVar != null) {
            czVar.uef();
            this.uu.oa();
            this.uu.yo();
        }
        this.lw.setOnTouchListener(this);
        zjm();
        ViewGroup viewGroup = (ViewGroup) this.lw.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.f24760wf);
        }
        com.bytedance.adsdk.ugeno.uef.uef uefVar = this.vjj;
        if (uefVar != null) {
            uefVar.moa();
        }
        com.bytedance.adsdk.ugeno.uef.ivm ivmVar = this.ot;
        if (ivmVar != null) {
            ivmVar.uef();
        }
        cz czVar2 = this.uu;
        if (czVar2 != null) {
            czVar2.moa();
        }
        if (this.hdd == null || !oa(22)) {
            return;
        }
        this.hdd.uef(this.fjj.get(22), this, this);
    }

    public void uef(JSONObject jSONObject) throws JSONException {
        this.moa = jSONObject;
        cq();
        JSONObject jSONObject2 = this.yo;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        uef<ViewGroup> uefVar = this.ivm;
        uef.C0043uef c0043uefZjm = uefVar instanceof uef ? uefVar.zjm() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(this.yo.optString(next), jSONObject);
            uef(next, strUef);
            if (c0043uefZjm != null) {
                c0043uefZjm.uef(this.f24755oa, next, strUef);
            }
        }
        if (c0043uefZjm != null) {
            uef(c0043uefZjm.uef());
        }
        if (this.no == null || this.moa == null) {
            return;
        }
        try {
            if (fz()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("i18n", this.no);
                this.moa.put("xNode", jSONObject3);
                return;
            }
            this.moa.put("i18n", this.no);
        } catch (JSONException unused) {
        }
    }

    public void zjm(String str) {
        this.wrv = str;
    }

    public void ivm(int i5) {
        if (fz()) {
            T t10 = this.lw;
            if (t10 instanceof oa) {
                ((oa) t10).oa(i5);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof oa) {
                ((oa) viewParent).oa(this.lw, i5);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.lw.getLayoutParams();
        layoutParams.height = i5;
        this.lw.setLayoutParams(layoutParams);
    }

    public void lw(int i5) {
        if (fz()) {
            T t10 = this.lw;
            if (t10 instanceof oa) {
                ((oa) t10).uef(i5);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof oa) {
                ((oa) viewParent).uef(this.lw, i5);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.lw.getLayoutParams();
        layoutParams.width = i5;
        this.lw.setLayoutParams(layoutParams);
    }

    private ImageView.ScaleType cq(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.af = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.af = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.af = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.af = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.af;
    }

    private boolean dz(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    public yo<T> bcc(String str) {
        return moa(str);
    }

    public void cz(String str) {
        this.dj = str;
    }

    public yo<T> xs(String str) {
        return yo(str);
    }

    public void uef(sy syVar) {
        this.az = syVar;
    }

    public void uef(ab abVar) {
        this.f24756tc = abVar;
    }

    public void yo(int i5) {
        ViewParent viewParent = (ViewGroup) this.lw.getParent();
        if (viewParent instanceof oa) {
            ((oa) viewParent).yo(this.lw, i5);
        } else {
            this.lw.setVisibility(i5);
        }
    }

    public void uef(wk wkVar) {
        this.hdd = wkVar;
    }

    public void uef(uef.C0046uef c0046uef) {
        if (c0046uef == null) {
            return;
        }
        this.meb.setShape(0);
        this.meb.setOrientation(c0046uef.uef);
        if (Build.VERSION.SDK_INT >= 29) {
            this.meb.setColors(c0046uef.f24777oa, c0046uef.yo);
        } else {
            this.meb.setColors(c0046uef.f24777oa);
        }
        zou();
        dv();
        this.lw.setBackground(this.meb);
    }

    public boolean oa(int i5) {
        Map<Integer, cq> map = this.fjj;
        return map != null && map.containsKey(Integer.valueOf(i5));
    }

    public yo<T> oa(String str) {
        if (TextUtils.isEmpty(this.wrv) || !TextUtils.equals(this.wrv, str)) {
            return null;
        }
        return this;
    }

    public void yo(JSONObject jSONObject) {
        this.yo = jSONObject;
    }

    public void oa(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.fjj == null) {
            return;
        }
        try {
            int iUef = com.bytedance.adsdk.ugeno.core.dz.uef(str).uef();
            cq cqVar = new cq();
            cqVar.uef(iUef);
            cqVar.uef(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iUef == 3) {
                try {
                    this.zrl = Float.parseFloat(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("shakeAmplitude"), this.moa));
                } catch (NumberFormatException unused) {
                    this.zrl = 12.0f;
                }
            }
            if (!(this.hdd instanceof com.bytedance.adsdk.ugeno.core.uef.oa)) {
                uef(iUef, jSONObject, cqVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    public yo<T> yo(String str) {
        if (!TextUtils.isEmpty(this.wrv) && TextUtils.equals(this.wrv, str) && this.wxf == 0) {
            return this;
        }
        return null;
    }

    public void moa(int i5) {
        this.meb.setShape(0);
        this.meb.setColor(i5);
        zou();
        dv();
        this.lw.setBackground(this.meb);
    }

    public void uef(Drawable drawable) {
        this.lw.setBackground(drawable);
    }

    public void uef(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.lw;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.hnk = layoutParams;
    }

    public yo<T> moa(String str) {
        if (wrv(str) != null) {
            return this;
        }
        return null;
    }

    public void uef(boolean z2, boolean z10) {
        if (this.lw != null) {
            uef(this.hnk);
            if (z2) {
                lw((int) this.cq);
            }
            if (z10) {
                ivm((int) this.dz);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.moa
    public void oa(Canvas canvas) {
        if (this instanceof uef) {
            com.bytedance.adsdk.ugeno.uef.uef uefVar = this.vjj;
            if (uefVar != null) {
                uefVar.oa(canvas);
            }
            com.bytedance.adsdk.ugeno.uef.ivm ivmVar = this.ot;
            if (ivmVar != null) {
                ivmVar.oa(canvas);
            }
        }
    }

    public void uef(xs.uef uefVar) {
        this.bcc = uefVar;
    }

    public yo<T> uef(String str) {
        if (TextUtils.isEmpty(this.dj) || !TextUtils.equals(this.dj, str)) {
            return null;
        }
        return this;
    }

    public void uef(boolean z2) {
        this.zjm = z2;
    }

    public void uef(uef uefVar) {
        this.ivm = uefVar;
    }

    @Override // com.bytedance.adsdk.ugeno.moa
    public void oa(int i5, int i10, int i11, int i12) {
        zjm zjmVar = this.f24752df;
        if (zjmVar != null) {
            zjmVar.uef(i5, i10);
        }
        com.bytedance.adsdk.ugeno.uef.uef uefVar = this.vjj;
        if (uefVar != null) {
            uefVar.uef(i5, i10);
        }
        com.bytedance.adsdk.ugeno.uef.ivm ivmVar = this.ot;
        if (ivmVar != null) {
            ivmVar.uef(i5, i10);
        }
    }

    public void uef(dj djVar) {
        this.cz = djVar;
    }

    public void uef(bcc bccVar) {
        this.cl = bccVar;
    }

    public void uef(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "clickable":
                this.jx = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, true);
                break;
            case "onRenderSuccess":
            case "onDelay":
            case "onShake":
            case "onSlide":
            case "onTimer":
            case "onTwist":
            case "onDown":
            case "onTap":
            case "onLoadMore":
            case "onExposure":
            case "onAnimation":
            case "onPullToRefresh":
            case "onScroll":
            case "onLongTap":
                oa(str, str2);
                break;
            case "translateX":
                this.uef = true;
                this.ggp = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "translateY":
                this.qn = true;
                this.sw = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "paddingLeft":
                this.f24757ue = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.dxx = true;
                break;
            case "minWidth":
                this.dhk = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "background":
            case "backgroundColor":
                if (com.bytedance.adsdk.ugeno.xs.uef.yo(str2)) {
                    this.us = true;
                    this.vep = com.bytedance.adsdk.ugeno.xs.uef.oa(str2);
                    break;
                } else {
                    this.pu = com.bytedance.adsdk.ugeno.xs.uef.uef(str2, 0);
                    this.us = false;
                    break;
                }
            case "events":
                this.uu = cz.uef(this, str2);
                break;
            case "opacity":
                this.jp = true;
                this.fzf = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1.0f);
                break;
            case "borderTopLeftRadius":
                this.cop = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.uqx = true;
                break;
            case "height":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.dz = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.dz = -2.0f;
                } else {
                    this.dz = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                }
                this.em = true;
                break;
            case "margin":
                this.wk = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                break;
            case "marginTop":
                this.sy = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.gsd = true;
                break;
            case "backgroundDrawable":
            case "backgroundImage":
                this.gb = str2;
                break;
            case "rotate":
                this.syr = true;
                this.f24754ne = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "scaleX":
                this.lo = true;
                this.vj = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "scaleY":
                this.aje = true;
                this.ix = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "padding":
                this.gr = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.fz = true;
                break;
            case "triggerFunc":
                this.uxr = str2;
                break;
            case "marginBottom":
                this.oib = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.rt = true;
                break;
            case "minHeight":
                this.tpx = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "id":
                this.dj = str2;
                break;
            case "i18n":
                this.no = com.bytedance.adsdk.ugeno.xs.oa.uef(str2, (JSONObject) null);
                break;
            case "name":
                this.wrv = str2;
                break;
            case "backgroundImageBlur":
                float fUef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.sk = fUef;
                if (fUef > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.rl = true;
                    break;
                }
                break;
            case "paddingTop":
                this.cp = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.oyt = true;
                break;
            case "click":
                this.dy = str2;
                break;
            case "ratio":
                this.f24753hg = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "scale":
                this.lo = true;
                this.aje = true;
                float[] fArrOa = com.bytedance.adsdk.ugeno.uef.moa.oa(str2, this.moa);
                this.vj = fArrOa[0];
                this.ix = fArrOa[1];
                break;
            case "width":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.cq = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.cq = -2.0f;
                } else {
                    this.cq = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                }
                this.agr = true;
                break;
            case "paddingBottom":
                this.ku = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.km = true;
                break;
            case "animations":
                List<com.bytedance.adsdk.ugeno.uef.yo> listUef = com.bytedance.adsdk.ugeno.uef.moa.uef(str2, this.moa);
                if (listUef != null && !listUef.isEmpty()) {
                    this.ot = new com.bytedance.adsdk.ugeno.uef.ivm(this.f24755oa, this, listUef);
                    break;
                }
                break;
            case "borderTopRightRadius":
                this.dor = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.rj = true;
                break;
            case "overflow":
                this.f24760wf = dz(str2);
                break;
            case "borderBottomLeftRadius":
                this.au = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.dv = true;
                break;
            case "borderBottomRightRadius":
                this.etd = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.zou = true;
                break;
            case "paddingRight":
                this.pz = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.lz = true;
                break;
            case "borderColor":
                this.hts = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "borderStyle":
                this.vyg = str2;
                break;
            case "borderWidth":
                this.nkh = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                break;
            case "marginRight":
                this.bs = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.gzw = true;
                break;
            case "translate":
                this.uef = true;
                this.qn = true;
                float[] fArrOa2 = com.bytedance.adsdk.ugeno.uef.moa.oa(str2, this.moa);
                this.ggp = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, fArrOa2[0]);
                this.sw = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, fArrOa2[1]);
                break;
            case "animation":
                try {
                    this.vjj = new com.bytedance.adsdk.ugeno.uef.uef(this.f24755oa, this, com.bytedance.adsdk.ugeno.uef.moa.uef(new JSONObject(str2), this.moa));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            case "animatorSet":
                this.f24759wd = com.bytedance.adsdk.ugeno.core.uef.uef(str2, this);
                break;
            case "backgroundScale":
                this.swd = true;
                this.af = cq(str2);
                break;
            case "borderRadius":
                this.gem = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                break;
            case "rotateX":
                this.f24758uf = true;
                this.dh = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "rotateY":
                this.nj = true;
                this.aos = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "rotateZ":
                this.bx = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "disable":
                this.ykf = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, false);
                break;
            case "visibility":
                if (TextUtils.equals("visible", str2)) {
                    this.wxf = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.wxf = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.wxf = 8;
                }
                this.lw.setVisibility(this.wxf);
                break;
            case "marginLeft":
                this.f24750ab = com.bytedance.adsdk.ugeno.xs.bcc.uef(this.f24755oa, str2);
                this.orq = true;
                break;
            case "availability":
                this.ou = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public yo oa(yo yoVar) {
        return (yoVar.dxx() == null && (yoVar instanceof uef)) ? yoVar : oa(yoVar.dxx());
    }

    @Deprecated
    public void uef(int i5, JSONObject jSONObject, cq cqVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            cq cqVar2 = new cq();
            cqVar2.uef(jSONObjectOptJSONObject);
            cqVar2.uef(this);
            cqVar.uef(cqVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("fail");
        if (jSONObjectOptJSONObject2 != null) {
            cq cqVar3 = new cq();
            cqVar3.uef(jSONObjectOptJSONObject2);
            cqVar3.uef(this);
            cqVar.oa(cqVar3);
        }
        cqVar.uef(jSONObject);
        this.fjj.put(Integer.valueOf(i5), cqVar);
    }

    @Override // com.bytedance.adsdk.ugeno.moa
    public int[] uef(int i5, int i10) {
        if (this.f24753hg > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.agr) {
                int size = View.MeasureSpec.getSize(i5);
                float f10 = this.f24753hg;
                if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.em) {
                int size2 = View.MeasureSpec.getSize(i10);
                float f11 = this.f24753hg;
                if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i5 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.az != null && !this.up) {
            this.up = true;
        }
        return new int[]{i5, i10};
    }

    @Override // com.bytedance.adsdk.ugeno.moa
    public void uef(int i5, int i10, int i11, int i12) {
        if (this.az == null || this.f2try) {
            return;
        }
        this.f2try = true;
    }

    @Override // com.bytedance.adsdk.ugeno.moa
    public void uef(Canvas canvas, IAnimation iAnimation) {
        zjm zjmVar = this.f24752df;
        if (zjmVar != null) {
            zjmVar.uef(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.moa
    public void uef(Canvas canvas) {
        if (this instanceof uef) {
            return;
        }
        com.bytedance.adsdk.ugeno.uef.uef uefVar = this.vjj;
        if (uefVar != null) {
            uefVar.uef(canvas);
        }
        com.bytedance.adsdk.ugeno.uef.ivm ivmVar = this.ot;
        if (ivmVar != null) {
            ivmVar.uef(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.wk.oa
    public void uef(cq cqVar) {
        uef<ViewGroup> uefVar;
        yo<T> yoVarLw;
        if (cqVar == null || cqVar.yo() == null || !TextUtils.equals(cqVar.yo().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = cqVar.yo().optString("nodeId");
        yo(8);
        this.xs = (uef) oa(this);
        if (TextUtils.isEmpty(strOptString) || (uefVar = this.xs) == null || (yoVarLw = uefVar.lw(strOptString)) == null) {
            return;
        }
        yoVarLw.yo(8);
    }

    public void uef(com.bytedance.adsdk.ugeno.moa.uef.uef uefVar) {
        this.hw = uefVar;
    }

    public void uef(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listDj = dj(str);
        if (listDj == null || listDj.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar : listDj) {
            yoVar.uef(this.uu);
            yoVar.uef(objArr);
        }
    }

    public void uef(com.bytedance.adsdk.ugeno.core.lw lwVar) {
        cz czVar = this.uu;
        if (czVar != null) {
            czVar.uef(lwVar);
        }
    }

    public void uef(com.bytedance.adsdk.ugeno.core.ivm ivmVar) {
        this.tam = ivmVar;
    }

    public void uef(dz dzVar) {
        cz czVar = this.uu;
        if (czVar != null) {
            czVar.uef(dzVar);
        }
        this.hjx = dzVar;
    }

    public void uef(com.bytedance.adsdk.ugeno.moa.cq cqVar) {
        cz czVar = this.uu;
        if (czVar != null) {
            czVar.uef(cqVar);
        }
        this.kn = cqVar;
    }
}

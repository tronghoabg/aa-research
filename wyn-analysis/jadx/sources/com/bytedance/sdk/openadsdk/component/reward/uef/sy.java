package com.bytedance.sdk.openadsdk.component.reward.uef;

import N0.a;
import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.pz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;
import com.bytedance.sdk.openadsdk.core.yo.oa;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.moa.yo;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes3.dex */
public class sy implements com.bytedance.sdk.openadsdk.cq.cz {
    private long af;
    private ILoader cop;
    private final com.bytedance.sdk.openadsdk.component.reward.uef.oa cp;
    private int cq;
    private View dhk;
    private int dj;
    private com.bytedance.sdk.openadsdk.common.lw dv;
    private int dz;
    private com.bytedance.sdk.openadsdk.core.widget.uef.lw fz;
    private String gem;
    private long gsd;
    private float gzw;
    private boolean km;
    private boolean lz;
    com.bytedance.sdk.openadsdk.moa.cq moa;
    private boolean nkh;
    private boolean oib;
    private float orq;
    private boolean oyt;
    private boolean pu;
    private ivm.uef rj;
    private int rl;
    private boolean sy;
    private View tpx;
    oyt uef;
    private boolean uqx;
    private com.bytedance.sdk.component.cz.ivm wk;
    private final boolean wrv;
    protected com.bytedance.sdk.openadsdk.moa.moa.lw xs;
    protected String yo;
    private final String zjm;
    private boolean zou;

    /* renamed from: oa, reason: collision with root package name */
    protected boolean f25420oa = true;

    /* renamed from: ab, reason: collision with root package name */
    private boolean f25419ab = false;
    private final AtomicBoolean bs = new AtomicBoolean(true);
    int lw = 0;
    String ivm = "";
    boolean bcc = false;
    private SparseArray<yo.uef> rt = new SparseArray<>();
    private boolean gr = true;

    /* renamed from: ue, reason: collision with root package name */
    private float f25421ue = -1.0f;
    private float pz = -1.0f;
    private boolean ku = false;
    private long dxx = 0;
    private long gb = -1;
    private volatile int sk = 0;
    private int swd = -1;
    private volatile int au = 0;
    private volatile int dor = 0;
    private long etd = 0;
    public boolean cz = false;
    private int hts = -1;

    public interface oa {
        void uef(WebView webView, String str);
    }

    public sy(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.cp = oaVar;
        this.zjm = oaVar.lw;
        this.wrv = oaVar.moa;
    }

    public static /* synthetic */ int cq(sy syVar) {
        int i5 = syVar.dor;
        syVar.dor = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int dj(sy syVar) {
        int i5 = syVar.au;
        syVar.au = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int dz(sy syVar) {
        int i5 = syVar.sk;
        syVar.sk = i5 + 1;
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lz() {
        this.lz = true;
        this.nkh = false;
        this.cp.sk.removeMessages(600);
        this.cp.sk.removeMessages(700);
        this.cp.sk.removeMessages(900);
        this.cp.dxx.moa(false);
        this.cp.f25409ab.set(true);
        this.cp.f25410hg.cq();
        gzw gzwVar = this.cp.f25412oa;
        gzwVar.vxo();
        if (gzwVar.vxo() || !gb.bcc(cp.uef(gzwVar))) {
            return;
        }
        View viewZjm = this.cp.oyt.zjm();
        View.OnClickListener onClickListener = (View.OnClickListener) viewZjm.getTag(viewZjm.getId());
        if (onClickListener != null) {
            uef uefVar = new uef(this.cp, viewZjm, onClickListener);
            viewZjm.setOnClickListener(uefVar);
            viewZjm.setOnTouchListener(uefVar);
        }
    }

    private com.bytedance.sdk.openadsdk.moa.moa.lw oyt() {
        return new com.bytedance.sdk.openadsdk.moa.oib(2, this.wrv ? "rewarded_video" : "fullscreen_interstitial_ad", this.cp.f25412oa);
    }

    public boolean cp() {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.wk;
        return ivmVar == null || ivmVar.getWebView() == null;
    }

    public boolean dxx() {
        return this.cz;
    }

    public boolean fz() {
        return this.lz;
    }

    public void ku() {
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.moa;
        if (cqVar != null) {
            cqVar.lw();
        }
    }

    public boolean pz() {
        return this.nkh;
    }

    public void ab() throws JSONException {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.wk;
        if (ivmVar != null) {
            ivmVar.wk();
        }
        if (this.gb > 0) {
            this.af = (SystemClock.elapsedRealtime() - this.gb) + this.af;
            this.gb = 0L;
        }
        oyt oytVar = this.uef;
        if (oytVar != null) {
            oytVar.uef(false);
            oa(this.uef, false);
            uef(this.uef, true, false);
        }
    }

    public com.bytedance.sdk.component.cz.ivm bcc() {
        return this.wk;
    }

    public void bs() {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.wk;
        if (ivmVar != null) {
            ivmVar.cq();
        }
        if (this.gb == 0) {
            this.gb = SystemClock.elapsedRealtime();
        }
        gzw gzwVar = this.cp.f25412oa;
        oyt oytVar = this.uef;
        if (oytVar != null) {
            oytVar.dj();
            com.bytedance.sdk.component.cz.ivm ivmVar2 = this.wk;
            if (ivmVar2 != null) {
                if (ivmVar2.getVisibility() == 0) {
                    this.uef.uef(true);
                    oa(this.uef, true);
                    uef(this.uef, false, true);
                    if (cp.bcc(gzwVar) && !this.lz && this.cp.f25412oa.vxo()) {
                        xs();
                    }
                } else {
                    this.uef.uef(false);
                    oa(this.uef, false);
                    uef(this.uef, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.moa;
        if (cqVar != null) {
            cqVar.xs();
        }
    }

    public boolean cq() {
        return this.bs.get();
    }

    public oyt cz() {
        return this.uef;
    }

    public boolean dhk() {
        return gzw.yo(this.cp.f25412oa) ? this.oyt && !this.km && this.cp.fz.wrv() : this.oyt && !this.km && this.bs.get() && this.sy;
    }

    public void dj() {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.wk;
        if (ivmVar != null) {
            pz.uef(ivmVar);
        }
        gzw gzwVar = this.cp.f25412oa;
        long j8 = this.af;
        if (j8 > 0) {
            if (this.gb > 0) {
                this.af = (SystemClock.elapsedRealtime() - this.gb) + j8;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", gzw.yo(gzwVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef(this.cp.f25412oa, this.zjm, "second_endcard_duration", jSONObject, this.af);
        }
        this.wk = null;
        if (this.xs != null && !dhk.moa(gzwVar) && !dhk.xs(gzwVar) && !gzw.yo(gzwVar)) {
            this.xs.uef(true);
            this.xs.dj();
        }
        oyt oytVar = this.uef;
        if (oytVar != null) {
            oytVar.wrv();
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.moa;
        if (cqVar != null) {
            cqVar.moa(gzwVar.fjj());
        }
        DeviceUtils.AudioInfoReceiver.oa(this);
    }

    public boolean dz() {
        return this.sy;
    }

    public boolean gr() {
        oyt oytVar = this.uef;
        if (oytVar == null) {
            return false;
        }
        return oytVar.cz();
    }

    public boolean gsd() {
        return this.bcc;
    }

    public void gzw() {
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.moa;
        if (cqVar != null) {
            cqVar.uef(System.currentTimeMillis());
        }
    }

    public String oib() {
        return this.ivm;
    }

    public void orq() {
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.ivm();
        }
    }

    public void rt() {
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.cz();
        }
    }

    public int sy() {
        return this.lw;
    }

    public void tpx() {
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.xs();
        }
    }

    public boolean ue() {
        this.bs.get();
        return this.sy && this.bs.get();
    }

    public void wk() {
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.bcc();
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.moa;
        if (cqVar != null) {
            cqVar.bcc();
        }
    }

    public boolean wrv() {
        String str = this.yo;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void xs() {
        this.uef.uef("showPlayableEndCardOverlay", (JSONObject) null);
        this.cp.sk.sendEmptyMessageDelayed(600, 1000L);
        this.cp.sk.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.10
            @Override // java.lang.Runnable
            public void run() {
                sy.this.lz();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.dz dzVar = this.cp.hnk;
        if (dzVar != null) {
            dzVar.uef(0L);
        }
    }

    public void zjm() {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        gzw gzwVar = this.cp.f25412oa;
        String strBcc = gzwVar.bcc();
        if (!TextUtils.isEmpty(strBcc) && (bccVar = this.cp.sw) != null && (bccVar.pu() || this.cp.sw.sk().gr())) {
            this.yo = strBcc;
        } else if (cp.lw(gzwVar)) {
            com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
            if (oaVarNj != null) {
                this.yo = oaVarNj.wrv();
            }
        } else {
            this.yo = cp.wrv(gzwVar);
        }
        String strUef = uef(this.yo, gzwVar, this.dj, this.dz, this.cq);
        this.yo = strUef;
        if (TextUtils.isEmpty(strUef)) {
            return;
        }
        this.oyt = this.yo.contains("use_second_endcard=1");
    }

    public void ivm() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cp;
        gzw gzwVar = oaVar.f25412oa;
        if (TextUtils.isEmpty(gzw.uef(oaVar.af, gzwVar))) {
            if (gzwVar != null && !gzwVar.oyt() && this.cop == null && wrv()) {
                this.gem = gzwVar.vup();
                this.cop = com.bytedance.sdk.openadsdk.xs.oa.uef().oa();
                int iUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.cop, this.gem);
                this.rl = iUef;
                this.swd = iUef > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.gem)) {
                    com.bytedance.sdk.openadsdk.moa.cq cqVar = this.moa;
                    if (cqVar != null) {
                        cqVar.uef(this.swd);
                    }
                    yo.uef.uef(this.etd, gzwVar, "landingpage_endcard", this.cop, this.gem);
                }
            }
            if ((!TextUtils.isEmpty(this.yo) && this.yo.contains("play.google.com/store")) || ((gzwVar != null && !gzwVar.gem() && dhk.bcc(gzwVar)) || dhk.xs(gzwVar))) {
                this.bcc = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.f25420oa + ",webViewIsLoading " + this.zou);
            if (this.f25420oa) {
                boolean z2 = this.cp.jkf;
                if (this.wk != null && ((z2 || !TextUtils.isEmpty(this.yo)) && gzw.oa(gzwVar))) {
                    if (this.zou) {
                        return;
                    }
                    String strC = b.c(new StringBuilder(), this.yo, "&is_pre_render=1");
                    com.bytedance.sdk.openadsdk.moa.cq cqVar2 = this.moa;
                    if (cqVar2 != null) {
                        cqVar2.moa();
                    }
                    com.bytedance.sdk.openadsdk.utils.gzw.uef(this.wk, strC);
                    this.zou = true;
                    return;
                }
                if (gzw.yo(gzwVar)) {
                    this.cp.fz.yo();
                }
            }
        }
    }

    public void lw() {
        if (cp.lw(this.cp.f25412oa) && this.cp.vj) {
            return;
        }
        ivm();
    }

    public boolean moa() {
        return this.km;
    }

    public void oa() {
        this.dhk = this.cp.pu.findViewById(R.id.content);
        com.bytedance.sdk.component.cz.ivm ivmVar = (com.bytedance.sdk.component.cz.ivm) this.cp.km.findViewById(com.bytedance.sdk.openadsdk.utils.bs.f26132ab);
        this.wk = ivmVar;
        if (ivmVar != null && gzw.oa(this.cp.f25412oa)) {
            this.wk.lw();
        } else {
            af.uef((View) this.wk, 8);
        }
        com.bytedance.sdk.component.cz.ivm ivmVar2 = this.wk;
        if (ivmVar2 != null) {
            ivmVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() throws JSONException {
                    if (sy.this.wk == null || sy.this.wk.getViewTreeObserver() == null) {
                        return;
                    }
                    sy.this.wk.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = sy.this.wk.getMeasuredWidth();
                    int measuredHeight = sy.this.wk.getMeasuredHeight();
                    if (sy.this.wk.getVisibility() == 0) {
                        sy.this.uef(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public boolean yo() {
        return this.pu;
    }

    public void lw(boolean z2) {
        if (this.uef == null || this.cp.pu.isFinishing()) {
            return;
        }
        this.uef.ivm(z2);
    }

    public void moa(boolean z2) {
        if (cp.oa(this.cp.f25412oa)) {
            return;
        }
        lw(z2);
    }

    public void yo(boolean z2) {
        oa(this.uef, z2);
    }

    public static class uef extends com.bytedance.sdk.openadsdk.core.yo.uef implements oa.uef {

        /* renamed from: oa, reason: collision with root package name */
        private final View f25429oa;
        private final com.bytedance.sdk.openadsdk.component.reward.uef.oa uef;
        private final View.OnClickListener yo;

        public uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, View view, View.OnClickListener onClickListener) {
            super(oaVar.pu, oaVar.f25412oa, oaVar.lw, oaVar.moa ? 7 : 5);
            this.uef = oaVar;
            this.f25429oa = view;
            this.yo = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            uef(map);
            uef(oaVar.orq.yo());
            uef(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.yo.uef, com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
        public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
            if (!this.uef.f25412oa.vxo()) {
                super.uef(view, f10, f11, f12, f13, sparseArray, z2);
                this.uef.gb.lz();
            } else {
                this.yo.onClick(view);
                this.f25429oa.setOnTouchListener(null);
                this.f25429oa.setOnClickListener(this.yo);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
        public void uef(View view, int i5) {
            this.f25429oa.setOnTouchListener(null);
            this.f25429oa.setOnClickListener(this.yo);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cq.cz
    public void yo(int i5) {
        int i10 = this.hts;
        if (i10 <= 0 && i5 > 0) {
            moa(false);
        } else if (i10 > 0 && i5 == 0) {
            moa(true);
        }
        this.hts = i5;
    }

    public void xs(boolean z2) {
        this.nkh = z2;
    }

    public void uef() {
        if (this.oib) {
            return;
        }
        this.oib = true;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cp;
        this.dj = oaVar.etd;
        this.cq = oaVar.rj;
        this.dz = oaVar.dv;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        oa();
        this.etd = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    public void oa(boolean z2) {
        uef(this.uef, z2);
    }

    public void oa(oyt oytVar, boolean z2) {
        try {
            oytVar.xs(z2);
        } catch (Exception unused) {
        }
    }

    public void oa(int i5) {
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.uef(i5);
            this.xs.yo();
        }
    }

    public void uef(String str, final com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        uef(str, new oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.uef.sy.oa
            public void uef(WebView webView, String str2) {
                if (sy.this.cp.pu.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.uef.oa unused = sy.this.cp;
                sy.this.cq();
            }
        });
        uef(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j8) {
                sy.this.cp.orq.oa();
                com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar2 = oaVar;
                if (oaVar2 != null) {
                    oaVar2.hts();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5, com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        this.cp.dhk.get();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cp;
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = oaVar2.sw;
        if (bccVar == null || !bccVar.wrv || oaVar2.dhk.get()) {
            return;
        }
        this.cp.dhk.set(true);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.cp;
        if (oaVar3.vjj && dhk.cq(oaVar3.f25412oa) && oaVar != null) {
            oaVar.lw();
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.cq.xs xsVar, String str, final com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        if (this.wk == null) {
            return;
        }
        HashMap map = new HashMap();
        final gzw gzwVar = this.cp.f25412oa;
        map.put("click_scence", 2);
        this.xs = oyt();
        oyt oytVar = new oyt(this.cp.pu);
        this.uef = oytVar;
        oytVar.uef(this.cp.gb);
        oyt oytVarUef = this.uef.oa(this.wk).uef(gzwVar).uef(com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef(gzwVar)).yo(gzwVar.iou()).moa(gzwVar.em()).oa(gzwVar.nyn() ? 7 : 5).uef(new com.bytedance.sdk.openadsdk.core.zjm.uef.yo(this.wk)).lw(gzwVar.kid()).uef(this.wk);
        if (wrv()) {
            str = "landingpage_endcard";
        }
        oytVarUef.oa(str).uef(map).uef(this.xs).uef(new com.bytedance.sdk.openadsdk.core.widget.lw() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.lw
            public void uef() {
                if (sy.this.fz != null) {
                    sy.this.fz.yo();
                }
                com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar2 = oaVar;
                if (oaVar2 != null) {
                    oaVar2.hts();
                }
            }
        }).uef(new oyt.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.7
            @Override // com.bytedance.sdk.openadsdk.core.oyt.uef
            public void uef() {
                sy.this.lz();
            }
        });
        this.uef.uef(new com.bytedance.sdk.openadsdk.core.zjm.uef.moa(this.wk));
        this.uef.uef(this.cp.oyt.zjm()).uef(this.cp.gzw.yo()).uef(new com.bytedance.sdk.openadsdk.cq.yo() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.9
            @Override // com.bytedance.sdk.openadsdk.cq.yo
            public void uef(boolean z2, int i5, String str2) throws JSONException {
                if (z2) {
                    sy syVar = sy.this;
                    syVar.cz = true;
                    if (syVar.uqx) {
                        sy.this.uqx = false;
                        sy syVar2 = sy.this;
                        syVar2.uef(syVar2.cp.gem, true);
                    }
                }
                if (gzw.moa(gzwVar)) {
                    sy.this.uef(z2, i5, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.cq.yo
            public void uef() {
                sy.this.pu = true;
                sy.this.cp.oyt.zjm().performClick();
            }
        });
        this.uef.lw(this.oyt);
    }

    public void ivm(boolean z2) {
        this.km = true;
        JSONObject jSONObject = new JSONObject();
        gzw gzwVar = this.cp.f25412oa;
        try {
            jSONObject.put("endcard_overlay_render_type", gzw.yo(gzwVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, this.zjm, "use_second_endcard", jSONObject);
        this.gb = SystemClock.elapsedRealtime();
        try {
            if (!gzw.yo(gzwVar)) {
                this.uef.uef("click_endcard_close", (JSONObject) null);
            } else if (z2) {
                this.cp.fz.bcc();
                com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, this.zjm, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        this.cp.hnk.uef(r5.xs);
    }

    public void uef(int i5, int i10) throws JSONException {
        if (this.uef == null || this.cp.pu.isFinishing()) {
            return;
        }
        this.uef.uef(i5, i10);
    }

    public void uef(boolean z2) {
        this.f25420oa = z2;
    }

    private static String uef(String str, gzw gzwVar, int i5, int i10, int i11) {
        String strConcat;
        String strConcat2;
        float fGze = gzwVar.gze();
        if (!TextUtils.isEmpty(str)) {
            if (i5 == 1) {
                if (str.contains("?")) {
                    strConcat2 = str.concat("&");
                } else {
                    strConcat2 = str.concat("?");
                }
                str = a.f(strConcat2, "orientation=portrait");
            }
            if (str.contains("?")) {
                strConcat = str.concat("&");
            } else {
                strConcat = str.concat("?");
            }
            str = strConcat + "height=" + i10 + "&width=" + i11 + "&aspect_ratio=" + fGze;
        }
        return !cp.oa(gzwVar) ? com.bytedance.sdk.openadsdk.utils.ivm.uef(str) : str;
    }

    public void uef(int i5) {
        if (this.sy || !this.bs.get()) {
            uef(0, this.cp.gb);
        }
        af.uef((View) this.wk, i5);
        com.bytedance.sdk.component.cz.ivm ivmVar = this.wk;
        if (ivmVar != null) {
            af.uef((View) ivmVar.getWebView(), i5);
        }
        gzw gzwVar = this.cp.f25412oa;
        if (this.wk == null || !gzwVar.fjj()) {
            return;
        }
        this.wk.setLandingPage(true);
        this.wk.setTag("landingpage_endcard");
        this.wk.setMaterialMeta(gzwVar.cuu());
    }

    public void uef(float f10) {
        af.uef(this.wk, f10);
    }

    public void uef(oyt oytVar, boolean z2) {
        if (this.uef == null || this.cp.pu.isFinishing()) {
            return;
        }
        oytVar.uef(z2);
    }

    private void uef(String str, final oa oaVar) {
        com.bytedance.sdk.component.cz.ivm ivmVar;
        final gzw gzwVar = this.cp.f25412oa;
        com.bytedance.sdk.component.cz.ivm ivmVar2 = this.wk;
        if (ivmVar2 == null || ivmVar2.getWebView() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVarOa = new com.bytedance.sdk.openadsdk.moa.cq(gzwVar, this.wk.getWebView(), new com.bytedance.sdk.openadsdk.moa.wrv() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.11
            @Override // com.bytedance.sdk.openadsdk.moa.wrv
            public void uef(int i5) {
                if (TextUtils.isEmpty(sy.this.gem)) {
                    return;
                }
                yo.uef.uef(sy.this.rl, sy.this.sk, sy.this.dor, sy.this.au - sy.this.dor, gzwVar, "landingpage_endcard", i5);
            }
        }, this.swd).oa(true);
        this.moa = cqVarOa;
        this.rj = cqVarOa.uef;
        cqVarOa.uef(wrv() ? "landingpage_endcard" : str);
        this.moa.oa(this.zjm);
        this.moa.yo(true);
        int i5 = Build.VERSION.SDK_INT;
        this.wk.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.12
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                com.bytedance.sdk.openadsdk.moa.cq cqVar = sy.this.moa;
                if (cqVar != null) {
                    cqVar.oa(i11);
                }
            }
        });
        cz czVar = this.cp.gzw;
        if (czVar != null) {
            this.moa.uef(czVar.uef());
        }
        com.bytedance.sdk.openadsdk.common.lw lwVarUef = gb.uef(gzwVar, this.wk, this.cp.pu, this.zjm);
        this.dv = lwVarUef;
        if (lwVarUef != null) {
            lwVarUef.uef(wrv() ? "landingpage_endcard" : str);
        }
        if (wrv()) {
            gb.uef(gzwVar, this.wk);
        }
        com.bytedance.sdk.openadsdk.core.widget.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.widget.uef.lw(com.bytedance.sdk.openadsdk.core.sy.uef(), this.uef, gzwVar.iou(), this.dv, this.moa, gzwVar.fjj()) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                sy.this.zou = false;
                sy.this.sy = true;
                sy syVar = sy.this;
                syVar.uef(100, syVar.cp.gb);
                if (sy.this.cp.ku.dhk()) {
                    View viewZjm = sy.this.cp.oyt.zjm();
                    if (viewZjm instanceof com.bytedance.sdk.openadsdk.core.ivm.moa) {
                        ((com.bytedance.sdk.openadsdk.core.ivm.moa) viewZjm).setImageResource(orq.moa(sy.this.cp.af, "tt_skip_btn"));
                    }
                }
                DeviceUtils.AudioInfoReceiver.uef(sy.this);
                sy.this.hts = DeviceUtils.xs();
                com.bytedance.sdk.openadsdk.moa.moa.lw lwVar2 = sy.this.xs;
                if (lwVar2 != null) {
                    lwVar2.lw();
                }
                com.bytedance.sdk.openadsdk.component.reward.uef.oa unused = sy.this.cp;
                oa oaVar2 = oaVar;
                if (oaVar2 != null) {
                    oaVar2.uef(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                com.bytedance.sdk.openadsdk.moa.moa.lw lwVar2 = sy.this.xs;
                if (lwVar2 != null) {
                    lwVar2.moa();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str2, String str3) {
                super.onReceivedError(webView, i10, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
                com.bytedance.sdk.openadsdk.component.reward.uef.oa unused = sy.this.cp;
                webResourceRequest.isForMainFrame();
                webResourceRequest.getUrl();
                webResourceResponse.getStatusCode();
                if (webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest.isForMainFrame()) {
                    sy.this.bs.set(false);
                    sy.this.zou = false;
                    sy.this.lw = webResourceResponse.getStatusCode();
                    sy syVar = sy.this;
                    syVar.ivm = "onReceivedHttpError";
                    syVar.uef(syVar.lw, syVar.cp.gb);
                }
                if (sy.this.xs != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", webResourceResponse.getStatusCode());
                        jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                        sy.this.xs.uef(jSONObject);
                    } catch (JSONException unused2) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                try {
                    if (TextUtils.isEmpty(sy.this.gem)) {
                        return super.shouldInterceptRequest(webView, str2);
                    }
                    sy.dj(sy.this);
                    WebResourceResponseModel webResourceResponseModelUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(sy.this.cop, sy.this.gem, str2);
                    if (webResourceResponseModelUef != null && webResourceResponseModelUef.getWebResourceResponse() != null) {
                        sy.cq(sy.this);
                        return webResourceResponseModelUef.getWebResourceResponse();
                    }
                    if (webResourceResponseModelUef != null && webResourceResponseModelUef.getMsg() == 2) {
                        sy.dz(sy.this);
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.uef("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !sy.this.uef(webResourceRequest.getUrl().toString())) {
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        com.bytedance.sdk.openadsdk.component.reward.uef.oa unused = sy.this.cp;
                        webResourceError.getErrorCode();
                        String.valueOf(webResourceError.getDescription());
                        String.valueOf(webResourceRequest.getUrl());
                    }
                    if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                        sy.this.bs.set(false);
                        sy.this.zou = false;
                        sy.this.uef(webResourceError != null ? webResourceError.getErrorCode() : -1, sy.this.cp.gb);
                    }
                    if (sy.this.xs != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put("msg", webResourceError.getDescription());
                            }
                            sy.this.xs.uef(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceError != null) {
                        sy.this.lw = webResourceError.getErrorCode();
                        sy.this.ivm = String.valueOf(webResourceError.getDescription());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                try {
                    return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.uef("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            }
        };
        this.fz = lwVar;
        this.wk.setWebViewClient(lwVar);
        this.fz.uef(gzwVar);
        this.fz.uef(this.wrv ? "rewarded_video" : "fullscreen_interstitial_ad");
        if (gzwVar.fjj() && (ivmVar = this.wk) != null && ivmVar.getWebView() != null) {
            this.wk.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.3
                private final int yo = com.bytedance.sdk.openadsdk.core.sy.oa();

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int actionMasked;
                    int i10;
                    com.bytedance.sdk.openadsdk.moa.cq cqVar = sy.this.moa;
                    if (cqVar != null) {
                        cqVar.uef(motionEvent);
                    }
                    if (sy.this.dv != null) {
                        sy.this.dv.uef(motionEvent);
                    }
                    try {
                        actionMasked = motionEvent.getActionMasked();
                    } catch (Throwable th) {
                        Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                    }
                    if (actionMasked != 0) {
                        int i11 = 3;
                        if (actionMasked == 1) {
                            i10 = i11;
                        } else if (actionMasked != 2) {
                            i11 = actionMasked != 3 ? -1 : 4;
                            i10 = i11;
                        } else {
                            float rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (Math.abs(rawX - sy.this.orq) >= this.yo || Math.abs(rawY - sy.this.gzw) >= this.yo) {
                                sy.this.gr = false;
                            }
                            sy.this.f25421ue += Math.abs(motionEvent.getX() - sy.this.orq);
                            sy.this.pz += Math.abs(motionEvent.getY() - sy.this.gzw);
                            i10 = (System.currentTimeMillis() - sy.this.gsd <= 200 || (sy.this.f25421ue <= 8.0f && sy.this.pz <= 8.0f)) ? 2 : 1;
                        }
                        return false;
                    }
                    sy.this.gr = true;
                    sy.this.rt = new SparseArray();
                    sy.this.orq = motionEvent.getRawX();
                    sy.this.gzw = motionEvent.getRawY();
                    sy.this.gsd = System.currentTimeMillis();
                    try {
                        long landingPageClickBegin = sy.this.wk.getLandingPageClickBegin();
                        if (landingPageClickBegin > 0 && landingPageClickBegin < sy.this.gsd) {
                            sy.this.gsd = landingPageClickBegin;
                            sy.this.wk.setLandingPageClickBegin(-1L);
                        }
                    } catch (Exception unused) {
                    }
                    sy.this.f25421ue = -1.0f;
                    sy.this.pz = -1.0f;
                    i10 = 0;
                    sy.this.rt.put(motionEvent.getActionMasked(), new yo.uef(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                    if (motionEvent.getAction() == 1 && dhk.ivm(sy.this.cp.f25412oa) && sy.this.cp.gb != null) {
                        sy.this.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                sy.this.cp.gb.nkh();
                            }
                        });
                    }
                    if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!sy.this.f25419ab || dhk.zjm(gzwVar)) && sy.this.gr)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("down_x", sy.this.orq);
                        jSONObject.put("down_y", sy.this.gzw);
                        jSONObject.put("down_time", sy.this.gsd);
                        jSONObject.put("up_x", motionEvent.getRawX());
                        jSONObject.put("up_y", motionEvent.getRawY());
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            long landingPageClickEnd = sy.this.wk.getLandingPageClickEnd();
                            if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                try {
                                    sy.this.wk.setLandingPageClickEnd(-1L);
                                } catch (Exception unused2) {
                                }
                                jCurrentTimeMillis = landingPageClickEnd;
                            }
                        } catch (Exception unused3) {
                        }
                        jSONObject.put("up_time", jCurrentTimeMillis);
                        int[] iArr = new int[2];
                        sy syVar = sy.this;
                        syVar.tpx = syVar.cp.km.findViewById(520093713);
                        if (sy.this.tpx != null) {
                            sy.this.tpx.getLocationOnScreen(iArr);
                            jSONObject.put("button_x", iArr[0]);
                            jSONObject.put("button_y", iArr[1]);
                            jSONObject.put("button_width", sy.this.tpx.getWidth());
                            jSONObject.put("button_height", sy.this.tpx.getHeight());
                        }
                        if (sy.this.dhk != null) {
                            int[] iArr2 = new int[2];
                            sy.this.dhk.getLocationOnScreen(iArr2);
                            jSONObject.put("ad_x", iArr2[0]);
                            jSONObject.put("ad_y", iArr2[1]);
                            jSONObject.put("width", sy.this.dhk.getWidth());
                            jSONObject.put("height", sy.this.dhk.getHeight());
                        }
                        jSONObject.put("toolType", motionEvent.getToolType(0));
                        jSONObject.put("deviceId", motionEvent.getDeviceId());
                        jSONObject.put("source", motionEvent.getSource());
                        jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.wrv.uef(sy.this.rt, com.bytedance.sdk.openadsdk.core.zjm.oa().uef() ? 1 : 2));
                        jSONObject.put("user_behavior_type", sy.this.gr ? 1 : 2);
                        jSONObject.put("click_scence", 2);
                        if (sy.this.fz != null) {
                            sy.this.fz.uef(jSONObject);
                        }
                        if (!sy.this.f25419ab && !dhk.cz(gzwVar)) {
                            if (sy.this.wrv) {
                                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, "rewarded_video", "click", jSONObject);
                            } else {
                                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, "fullscreen_interstitial_ad", "click", jSONObject);
                            }
                            sy.this.f25419ab = true;
                        }
                        return false;
                    }
                    return false;
                }
            });
        }
        com.bytedance.sdk.component.cz.ivm ivmVar3 = this.wk;
        if (ivmVar3 != null) {
            ivmVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(this.uef, this.moa, this.dv) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.sy.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                }
            });
        }
        uef(this.wk);
        if (i5 >= 24) {
            this.wk.setLayerType(1, null);
        }
        this.wk.setBackgroundColor(-1);
        this.wk.setDisplayZoomControls(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.cp.f25412oa.fjj() && str.endsWith(".mp4");
    }

    public void uef(DownloadListener downloadListener) {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.wk;
        if (ivmVar == null || downloadListener == null) {
            return;
        }
        ivmVar.setDownloadListener(downloadListener);
    }

    public void uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(this.cp.pu).uef(false).oa(false).uef(ivmVar.getWebView());
        ivmVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.dhk.uef(ivmVar.getWebView(), BuildConfig.VERSION_CODE));
        ivmVar.setMixedContentMode(0);
    }

    public void uef(boolean z2, boolean z10) throws JSONException {
        uef(this.uef, z2, z10);
    }

    public void uef(oyt oytVar, boolean z2, boolean z10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z2);
            jSONObject.put("endcard_show", z10);
            com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = this.cp.sw;
            String str = "end";
            if (bccVar != null) {
                jSONObject.put("multi_ads_show", bccVar.sk().zjm());
                if (!bccVar.bs) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", "end");
            }
            oytVar.uef("endcard_control_event", jSONObject);
            if (z10) {
                if (this.sy) {
                    return;
                }
                this.uqx = true;
                return;
            }
            this.uqx = false;
        } catch (Exception unused) {
        }
    }

    public void uef(boolean z2, int i5, String str) {
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.xs;
        if (lwVar == null) {
            return;
        }
        if (z2) {
            lwVar.oa();
        } else {
            lwVar.uef(i5, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.dxx < 100) {
            return false;
        }
        this.dxx = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}

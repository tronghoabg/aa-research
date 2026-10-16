package com.bytedance.sdk.openadsdk.core.zjm;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.oa.cq;
import com.bytedance.sdk.component.adexpress.oa.zjm;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.km;
import com.bytedance.sdk.openadsdk.core.moa.xs;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.pu;
import com.bytedance.sdk.openadsdk.core.yo.uef;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class tpx extends com.bytedance.sdk.openadsdk.core.ivm.yo implements com.bytedance.sdk.component.adexpress.dynamic.moa, com.bytedance.sdk.component.adexpress.oa.bcc, com.bytedance.sdk.component.adexpress.oa.wk, uef.InterfaceC0112uef, ab {

    /* renamed from: ab, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.oa.yo f25866ab;
    private boolean af;
    private final Runnable au;
    private String bcc;
    protected com.bytedance.sdk.openadsdk.moa.moa.lw bs;
    private final Runnable cop;
    public com.bytedance.sdk.component.adexpress.oa.moa<? extends View> cp;
    public FrameLayout cq;
    protected final Context cz;
    protected String dhk;
    protected AdSlot dj;
    private final Runnable dor;
    private List<com.bytedance.sdk.component.adexpress.oa.zjm> dv;
    private float dxx;
    protected boolean dz;
    private ThemeStatusBroadcastReceiver etd;
    private float fz;
    private xs.uef gb;
    private final ViewTreeObserver.OnScrollChangedListener gem;
    private float ggp;
    public com.bytedance.sdk.openadsdk.moa.xs gr;
    int gsd;
    public boolean gzw;

    /* renamed from: hg, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.oa.cq f25867hg;
    private final SparseArray<yo.uef> hnk;
    private com.bytedance.sdk.openadsdk.core.cq.oa.xs hts;
    private cz ivm;
    private float jkf;
    private boolean km;
    protected Activity ku;
    private PAGExpressAdWrapperListener lw;
    private String lz;
    private TTDislikeDialogAbstract moa;
    private com.bytedance.sdk.component.adexpress.oa.ivm nkh;

    /* renamed from: oa, reason: collision with root package name */
    private int f25868oa;
    protected int oib;
    protected ViewGroup orq;
    private float ot;
    private int ou;
    private com.bytedance.sdk.openadsdk.core.cq.yo.oa oyt;
    private String pu;
    protected com.bytedance.sdk.component.adexpress.oa.oa pz;
    private zjm.uef rj;
    private final AtomicBoolean rl;
    boolean rt;
    private gzw sk;
    private long sw;
    private yo swd;
    boolean sy;
    protected HashSet<String> tpx;

    /* renamed from: ue, reason: collision with root package name */
    long f25869ue;
    private boolean uef;
    private ue uqx;
    private float vjj;
    private com.bytedance.sdk.openadsdk.core.cq.ivm.moa vyg;
    protected boolean wk;
    protected com.bytedance.sdk.openadsdk.core.model.gzw wrv;
    private com.bytedance.sdk.component.adexpress.oa.cz wxf;
    private zjm xs;
    private com.bytedance.sdk.openadsdk.core.moa.cz xvp;
    private com.bytedance.sdk.openadsdk.yo.yo yo;
    protected String zjm;
    private com.bytedance.sdk.component.adexpress.oa.ab zou;

    public tpx(Activity activity, Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, String str) {
        super(context);
        this.uef = true;
        this.f25868oa = 0;
        this.zjm = "embeded_ad";
        this.bcc = null;
        this.wk = false;
        this.sy = true;
        this.oib = -1;
        this.lz = "";
        this.gzw = false;
        this.af = true;
        this.gsd = -1;
        this.gr = new com.bytedance.sdk.openadsdk.moa.xs();
        this.f25869ue = 0L;
        this.rl = new AtomicBoolean(false);
        this.gem = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                tpx tpxVar = tpx.this;
                if (tpxVar.sy && tpxVar.zjm()) {
                    tpx.this.cp();
                    tpx tpxVar2 = tpx.this;
                    tpxVar2.removeCallbacks(tpxVar2.cop);
                    tpx tpxVar3 = tpx.this;
                    tpxVar3.postDelayed(tpxVar3.cop, 500L);
                }
            }
        };
        this.cop = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.2
            @Override // java.lang.Runnable
            public void run() {
                if (!km.uef(tpx.this, 0, 5, false)) {
                    tpx.this.ivm(8);
                } else {
                    tpx tpxVar = tpx.this;
                    tpxVar.ivm(tpxVar.getVisibility());
                }
            }
        };
        this.au = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.3
            @Override // java.lang.Runnable
            public void run() {
                tpx.this.ivm(0);
            }
        };
        this.dor = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.4
            @Override // java.lang.Runnable
            public void run() {
                tpx.this.ivm(8);
            }
        };
        this.ou = 8;
        this.hnk = new SparseArray<>();
        this.vjj = -1.0f;
        this.ot = -1.0f;
        this.jkf = -1.0f;
        this.ggp = -1.0f;
        this.sw = 0L;
        this.ku = activity;
        this.zjm = str;
        this.cz = context;
        this.wrv = gzwVar;
        this.dj = adSlot;
        this.gzw = false;
        xs();
    }

    private void ab() {
        if (this.wrv.dqw() == 1 && this.wrv.ebe()) {
            sy();
            this.rj = new com.bytedance.sdk.component.adexpress.oa.wrv(this.dv, this.wxf);
            return;
        }
        if (lz()) {
            bs();
            return;
        }
        try {
            ue();
            ue ueVar = new ue(this.cz, this.f25867hg, this.etd, this.bs, this.wrv);
            this.uqx = ueVar;
            com.bytedance.sdk.component.adexpress.oa.ab abVar = new com.bytedance.sdk.component.adexpress.oa.ab(this.cz, this.f25867hg, ueVar, this);
            this.zou = abVar;
            this.dv.add(abVar);
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.uef("NativeExpressView", "NativeExpressView dynamicRender fail", e7);
        }
        sy();
        this.rj = new com.bytedance.sdk.component.adexpress.oa.wrv(this.dv, this.wxf);
    }

    private void bs() {
        this.f25868oa = this.wrv.ix();
        try {
            ue();
            pz();
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.uef("NativeExpressView", "NativeExpressView dynamicRender fail", e7);
        }
        this.uef = this.wrv.ne() == 1;
        boolean zUef = com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(this.wrv);
        if (this.uef && !zUef) {
            sy();
        }
        Objects.toString(this.dv);
        this.rj = new com.bytedance.sdk.component.adexpress.oa.wrv(this.dv, this.wxf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cp() {
        if (this.rl.get()) {
            this.gr.uef(System.currentTimeMillis(), km.uef(this));
        }
    }

    private void dxx() {
        List<com.bytedance.sdk.component.adexpress.oa.zjm> list = this.dv;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.oa.zjm> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void dz() {
        gzw.uef uefVarVep = this.wrv.vep();
        if (!TextUtils.equals(this.zjm, "embeded_ad") || uefVarVep == null) {
            return;
        }
        String strZjm = uefVarVep.zjm();
        if (TextUtils.isEmpty(strZjm)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZjm);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.dxx = iOptInt2;
            this.fz = iOptInt;
        } catch (Exception unused) {
        }
    }

    private void fz() {
        List<com.bytedance.sdk.component.adexpress.oa.zjm> list = this.dv;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.oa.zjm> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private boolean ku() {
        return com.bytedance.sdk.openadsdk.core.model.gzw.lw(this.wrv);
    }

    private boolean lz() {
        return TextUtils.equals(this.zjm, "fullscreen_interstitial_ad") || TextUtils.equals(this.zjm, "rewarded_video") || TextUtils.equals("open_ad", this.zjm) || ue.oa(this.zjm) || TextUtils.equals(this.zjm, "embeded_ad");
    }

    private void pz() {
        tpx tpxVar;
        com.bytedance.sdk.openadsdk.core.cq.ivm.moa moaVar;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 = this.wrv;
        if (gzwVar2 == null || gzwVar2.dqw() != 1 || this.wrv.ggp() == 2) {
            if (!com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm.uef(this.zjm) || (gzwVar = this.wrv) == null || gzwVar.ggp() == 2) {
                com.bytedance.sdk.openadsdk.core.bcc.uef.uef uefVar = new com.bytedance.sdk.openadsdk.core.bcc.uef.uef();
                int i5 = this.f25868oa;
                if (i5 != 0) {
                    if (i5 == 3) {
                        com.bytedance.sdk.component.adexpress.dynamic.lw.xs xsVar = new com.bytedance.sdk.component.adexpress.dynamic.lw.xs();
                        Context applicationContext = this.cz.getApplicationContext();
                        com.bytedance.sdk.component.adexpress.oa.cq cqVar = this.f25867hg;
                        ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.etd;
                        boolean z2 = this.gzw;
                        com.bytedance.sdk.component.adexpress.oa.oa oaVar = new com.bytedance.sdk.component.adexpress.oa.oa(applicationContext, cqVar, themeStatusBroadcastReceiver, z2, xsVar, this, uefVar, new xs(this.cz, themeStatusBroadcastReceiver, z2, xsVar, cqVar, uefVar));
                        this.pz = oaVar;
                        this.dv.add(oaVar);
                        return;
                    }
                    if (i5 == 7) {
                        com.bytedance.sdk.openadsdk.core.cq.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.cq.ivm.moa(this.cz, this.wrv, this.gzw, (com.bytedance.sdk.openadsdk.core.cq.ivm.uef) this.f25867hg, this);
                        this.vyg = moaVar2;
                        com.bytedance.sdk.openadsdk.core.cq.oa.xs xsVar2 = new com.bytedance.sdk.openadsdk.core.cq.oa.xs(this.cz, moaVar2, this, this.f25867hg);
                        this.hts = xsVar2;
                        xsVar2.uef(this);
                        this.dv.add(this.hts);
                        return;
                    }
                    switch (i5) {
                        case 10:
                            if (!this.km || (moaVar = this.vyg) == null) {
                                tpxVar = this;
                                tpxVar.vyg = new com.bytedance.sdk.openadsdk.core.cq.ivm.xs(this.cz, this.wrv, this.gzw, (com.bytedance.sdk.openadsdk.core.cq.ivm.uef) this.f25867hg, this);
                            } else {
                                moaVar.uef(this.wrv, this.gzw, (com.bytedance.sdk.openadsdk.core.cq.ivm.uef) this.f25867hg, this);
                                tpxVar = this;
                            }
                            com.bytedance.sdk.openadsdk.core.cq.oa.xs xsVar3 = new com.bytedance.sdk.openadsdk.core.cq.oa.xs(tpxVar.cz, tpxVar.vyg, this, tpxVar.f25867hg);
                            tpxVar.hts = xsVar3;
                            xsVar3.uef(this);
                            tpxVar.dv.add(tpxVar.hts);
                            break;
                        case 11:
                            rt rtVar = new rt(this.cz, this.f25867hg, this.etd, this.bs, this.wrv);
                            this.uqx = rtVar;
                            rtVar.oa(this.ku);
                            com.bytedance.sdk.component.adexpress.oa.ab abVar = new com.bytedance.sdk.component.adexpress.oa.ab(this.cz, this.f25867hg, this.uqx, this);
                            this.zou = abVar;
                            this.dv.add(abVar);
                            break;
                    }
                    return;
                }
                ue ueVar = new ue(this.cz, this.f25867hg, this.etd, this.bs, this.wrv);
                this.uqx = ueVar;
                com.bytedance.sdk.component.adexpress.oa.ab abVar2 = new com.bytedance.sdk.component.adexpress.oa.ab(this.cz, this.f25867hg, ueVar, this);
                this.zou = abVar2;
                this.dv.add(abVar2);
            }
        }
    }

    private void sy() {
        if (com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm.uef(this.zjm)) {
            com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm ivmVar = new com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm(this.cz, this.wrv, this.gzw, (com.bytedance.sdk.openadsdk.core.cq.ivm.uef) this.f25867hg, this, this.fz, this.dxx, this.wk, this.zjm);
            com.bytedance.sdk.openadsdk.core.cq.oa.xs xsVar = new com.bytedance.sdk.openadsdk.core.cq.oa.xs(this.cz, ivmVar, this, this.f25867hg);
            ivmVar.uef((ab) this);
            this.dv.add(xsVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.oa.ivm ivmVar2 = new com.bytedance.sdk.component.adexpress.oa.ivm(this.cz, this.f25867hg, new orq(this, this.etd, this.f25867hg));
        this.nkh = ivmVar2;
        this.dv.add(ivmVar2);
    }

    private void ue() {
        if (com.bytedance.sdk.openadsdk.core.wk.lw()) {
            return;
        }
        cq.uef();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void wk() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.zjm.tpx.wk():void");
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.wk
    public void a_(int i5) {
        com.bytedance.sdk.component.adexpress.oa.cz czVar = this.wxf;
        if (czVar != null) {
            if (!this.uef) {
                czVar.xs();
            }
            this.wxf.bcc();
            ((dz) this.wxf).zjm();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.lw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.cz.uef(i5), i5);
        }
        gzw gzwVar = this.sk;
        if (gzwVar != null) {
            gzwVar.uef(this.wrv, this.zjm);
        }
    }

    public void bcc() {
        this.bs = new com.bytedance.sdk.openadsdk.moa.oib(1, this.zjm, this.wrv);
    }

    public void cq() {
        try {
            yo yoVar = this.swd;
            if (yoVar != null) {
                yoVar.oa();
            }
            gsd();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.oa.zjm> list = this.dv;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.oa.zjm> it = list.iterator();
                while (it.hasNext()) {
                    it.next().uef();
                }
            }
            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.wrv);
            com.bytedance.sdk.openadsdk.gsd.uef.yo.oa(this.wrv);
            this.yo = null;
            this.moa = null;
            this.dj = null;
            this.wrv = null;
            this.lw = null;
            this.ivm = null;
            this.f25866ab = null;
            this.xs = null;
            com.bytedance.sdk.openadsdk.core.cq.yo.oa oaVar = this.oyt;
            if (oaVar != null) {
                oaVar.moa();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef("NativeExpressView", "detach error", th);
        }
    }

    public boolean cz() {
        return true;
    }

    public boolean dhk() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i5;
        cz czVar = this.ivm;
        if (czVar != null) {
            czVar.oa(motionEvent.getDeviceId());
            this.ivm.uef(motionEvent.getSource());
            this.ivm.yo(motionEvent.getToolType(0));
        }
        zjm zjmVar = this.xs;
        if (zjmVar != null) {
            zjmVar.oa(motionEvent.getDeviceId());
            this.xs.uef(motionEvent.getSource());
            this.xs.yo(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i10 = 3;
            if (actionMasked == 1) {
                i5 = i10;
            } else if (actionMasked != 2) {
                i10 = actionMasked != 3 ? -1 : 4;
                i5 = i10;
            } else {
                this.jkf = Math.abs(motionEvent.getX() - this.vjj) + this.jkf;
                this.ggp = Math.abs(motionEvent.getY() - this.ot) + this.ggp;
                this.vjj = motionEvent.getX();
                this.ot = motionEvent.getY();
                i5 = (System.currentTimeMillis() - this.sw <= 200 || (this.jkf <= 8.0f && this.ggp <= 8.0f)) ? 2 : 1;
            }
        } else {
            this.vjj = motionEvent.getRawX();
            this.ot = motionEvent.getRawY();
            this.sw = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.wrv.yo.uef(motionEvent);
            i5 = 0;
        }
        SparseArray<yo.uef> sparseArray = this.hnk;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new yo.uef(i5, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void dj() {
        ue ueVar = this.uqx;
        if (ueVar == null || ueVar.lw() == null) {
            return;
        }
        this.uqx.bcc();
    }

    public com.bytedance.sdk.openadsdk.moa.xs getAdShowTime() {
        return this.gr;
    }

    public yo getBrandBannerController() {
        return this.swd;
    }

    public cz getClickCreativeListener() {
        return this.ivm;
    }

    public zjm getClickListener() {
        return this.xs;
    }

    public String getClosedListenerKey() {
        return this.pu;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar != null) {
            return moaVar.yo();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.dxx).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.fz).intValue();
    }

    public PAGExpressAdWrapperListener getExpressInteractionListener() {
        return this.lw;
    }

    public oyt getJsObject() {
        ue ueVar = this.uqx;
        if (ueVar != null) {
            return ueVar.tpx();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        dj djVarDhk;
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (!(moaVar instanceof ue) || (djVarDhk = ((ue) moaVar).dhk()) == null) {
            return 0;
        }
        return djVarDhk.uef();
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.sy.moa().oyt();
    }

    public String getUgenTemplateErrorReason() {
        return this.lz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.uef.InterfaceC0112uef
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.moa.cz czVar = this.xvp;
        if (czVar != null) {
            return czVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.cz.ivm getWebView() {
        ue ueVar = this.uqx;
        if (ueVar == null) {
            return null;
        }
        return ueVar.moa();
    }

    public void gr() {
        com.bytedance.sdk.openadsdk.core.cq.yo.oa oaVar = new com.bytedance.sdk.openadsdk.core.cq.yo.oa(this.cz, this.wrv);
        this.oyt = oaVar;
        oaVar.uef(this);
        this.oyt.uef(new com.bytedance.sdk.openadsdk.core.cq.yo.uef() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.7
            @Override // com.bytedance.sdk.openadsdk.core.cq.yo.uef
            public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
                uef(view, i5, yoVar);
            }
        });
    }

    public void gsd() {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.wrv;
        if (gzwVar == null || (moaVarOdd = gzwVar.odd()) == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        moaVarUef.lw(getVideoProgress());
    }

    public boolean gzw() {
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        return moaVar != null && (moaVar instanceof orq);
    }

    public void ivm() {
    }

    public int lw() {
        return 0;
    }

    public long moa() {
        return 0L;
    }

    public void oa() {
    }

    public void oib() {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar instanceof ue) {
            if (moaVar == null) {
                return;
            }
            ((ue) moaVar).zjm();
            com.bytedance.sdk.component.utils.cz.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.6
                @Override // java.lang.Runnable
                public void run() {
                    tpx.this.lw(1);
                }
            }, (this.wrv != null ? r0.gr().moa() : 5) * 1000);
        } else if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.xs) {
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.xs) moaVar).dj();
        }
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.wrv;
        if (gzwVar != null && (moaVarOdd = gzwVar.odd()) != null && (moaVarUef = moaVarOdd.uef()) != null) {
            moaVarUef.uef(0L);
        }
        if ((this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.xs) && com.bytedance.sdk.openadsdk.core.model.bs.uef(this.wrv)) {
            uef(this.cp);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cp();
        fz();
        getViewTreeObserver().addOnScrollChangedListener(this.gem);
        com.bytedance.sdk.openadsdk.core.zjm.oa().uef(this.pu, this.gb);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.gem);
        com.bytedance.sdk.openadsdk.core.zjm.oa().ivm(this.pu);
        dxx();
        uef(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        cp();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        onWindowVisibilityChanged(z2 ? getVisibility() : 8);
        cp();
        com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(this.wrv, z2);
        if (com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(this.wrv)) {
            return;
        }
        if (z2) {
            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.wrv, 4);
        } else {
            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.wrv, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        if (dhk()) {
            uef(i5, true, false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void onvideoComplate() {
    }

    public void orq() {
        try {
            FrameLayout frameLayout = this.cq;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.cq);
        } catch (Throwable unused) {
        }
    }

    public boolean rt() {
        return this.rl.get();
    }

    public void setActivity(Activity activity) {
        this.ku = activity;
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.oa.yo yoVar) {
        this.f25866ab = yoVar;
        com.bytedance.sdk.component.adexpress.oa.ivm ivmVar = this.nkh;
        if (ivmVar != null) {
            ivmVar.uef(yoVar);
        }
    }

    public void setBannerClickClosedListener(xs.uef uefVar) {
        this.gb = uefVar;
    }

    public void setClickCreativeListener(cz czVar) {
        this.ivm = czVar;
        if (czVar != null) {
            czVar.uef((uef.InterfaceC0112uef) this);
        }
    }

    public void setClickListener(zjm zjmVar) {
        this.xs = zjmVar;
    }

    public void setClosedListenerKey(String str) {
        this.pu = str;
        yo yoVar = this.swd;
        if (yoVar != null) {
            yoVar.uef(str);
        }
    }

    public void setDirectDestroyWebView(boolean z2) {
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar instanceof com.bytedance.sdk.component.adexpress.lw.uef) {
            ((com.bytedance.sdk.component.adexpress.lw.uef) moaVar).oa(z2);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.yo.yo yoVar) {
        uef uefVar;
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar != null && (moaVar instanceof orq) && (uefVar = (uef) moaVar.lw()) != null) {
            uefVar.setDislikeInner(yoVar);
        }
        yo yoVar2 = this.swd;
        if (yoVar2 != null) {
            yoVar2.uef(yoVar);
        }
        this.yo = yoVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.lw = pAGExpressAdWrapperListener;
        yo yoVar = this.swd;
        if (yoVar != null) {
            yoVar.uef(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.lw lwVar) {
        if (this.uqx != null && getJsObject() != null) {
            getJsObject().uef(lwVar);
        }
        com.bytedance.sdk.openadsdk.core.cq.ivm.moa moaVar = this.vyg;
        if (moaVar != null) {
            moaVar.uef(lwVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        uef uefVar;
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar != null && (moaVar instanceof orq) && (uefVar = (uef) moaVar.lw()) != null) {
            uefVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        yo yoVar = this.swd;
        if (yoVar != null) {
            yoVar.uef(tTDislikeDialogAbstract);
        }
        this.moa = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z2) {
        this.gzw = z2;
        com.bytedance.sdk.component.adexpress.oa.oa oaVar = this.pz;
        if (oaVar != null && oaVar.oa() != null) {
            this.pz.oa().setSoundMute(z2);
        }
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) {
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.moa) moaVar).setSoundMute(z2);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setTime(CharSequence charSequence, int i5, int i10, boolean z2) throws NumberFormatException {
        try {
            int i11 = Integer.parseInt(String.valueOf(charSequence));
            oa(i11, i5);
            com.bytedance.sdk.openadsdk.core.cq.yo.oa oaVar = this.oyt;
            if (oaVar != null) {
                oaVar.uef(i11);
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setTimeUpdate(int i5) {
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.moa.cz czVar) {
        this.xvp = czVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        ue ueVar = this.uqx;
        if (ueVar != null) {
            ueVar.uef(oaVar);
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.cq.bcc bccVar) {
        if (this.uqx == null || getJsObject() == null) {
            return;
        }
        getJsObject().uef(bccVar);
    }

    public void tpx() {
        if (this.wrv == null) {
            return;
        }
        this.f25869ue = SystemClock.elapsedRealtime();
        if (this.wrv.tv()) {
            yo yoVar = this.swd;
            if (yoVar == null) {
                a_(106);
                return;
            } else {
                yoVar.uef((com.bytedance.sdk.component.adexpress.oa.wk) this);
                this.swd.uef();
                return;
            }
        }
        this.bs.uef();
        zjm.uef uefVar = this.rj;
        if (uefVar != null) {
            uefVar.uef(this);
        }
        try {
            this.rj.uef();
        } catch (Throwable unused) {
        }
    }

    public void uef() {
    }

    public void wrv() {
        ue ueVar = this.uqx;
        if (ueVar == null || ueVar.lw() == null) {
            return;
        }
        this.uqx.ab();
    }

    public void xs() {
        this.tpx = new HashSet<>();
        this.etd = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.dj;
        if (adSlot != null) {
            this.fz = adSlot.getExpressViewAcceptedWidth();
            this.dxx = this.dj.getExpressViewAcceptedHeight();
            dz();
            this.bcc = this.dj.getCodeId();
            if (TextUtils.equals(this.zjm, "fullscreen_interstitial_ad")) {
                this.gsd = this.wrv.qe();
            } else if (TextUtils.equals(this.zjm, "rewarded_video")) {
                this.gsd = this.wrv.ho();
            } else if (TextUtils.equals(this.zjm, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.wrv;
                if (gzwVar == null || gzwVar.oa() < 0) {
                    this.gsd = com.bytedance.sdk.openadsdk.core.sy.moa().gzw(this.bcc);
                } else {
                    this.gsd = this.wrv.oa();
                }
                if (this.gsd < 0) {
                    this.gsd = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.wrv.tv()) {
            this.swd = new yo(this.cz, this, this.wrv, this.zjm);
            return;
        }
        wk();
        this.dv = new ArrayList();
        ab();
        com.bytedance.sdk.component.adexpress.oa.ab abVar = this.zou;
        if (abVar != null) {
            this.uqx = (ue) abVar.oa();
        }
        oyt jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.ivm(this.zjm);
        }
    }

    public long yo() {
        return 0L;
    }

    public boolean zjm() {
        return true;
    }

    public void ivm(int i5) {
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar == null || !(moaVar instanceof ue)) {
            return;
        }
        ((ue) moaVar).uef(i5);
        this.ou = i5;
    }

    public void oa(int i5) {
    }

    public void uef(int i5) {
    }

    public void yo(JSONObject jSONObject) {
    }

    public void lw(int i5) {
        if (com.bytedance.sdk.openadsdk.core.model.dhk.yo(this.wrv)) {
            com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
            if (moaVar instanceof ue) {
                ((ue) moaVar).oa(i5);
            }
        }
    }

    public boolean oa(com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        return true;
    }

    public void uef(int i5, com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
    }

    public boolean oa(JSONObject jSONObject) {
        return false;
    }

    public void uef(int i5, String str) {
    }

    public lw.uef yo(int i5) {
        return new lw.uef(i5);
    }

    public void uef(cq.uef uefVar) {
    }

    public void oa(int i5, int i10) {
        int iMin;
        if (TextUtils.equals(this.zjm, "banner_ad")) {
            return;
        }
        String str = this.zjm;
        int i11 = this.gsd;
        int i12 = ((i10 < i11 || i11 < 0 || !(this.rt || TextUtils.equals(str, "open_ad"))) && !((i5 == 0 && TextUtils.equals(this.zjm, "open_ad")) || lw() == 5)) ? 0 : 1;
        if (i10 <= this.gsd) {
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.wrv;
            if (gzwVar != null && gzwVar.nj() != null) {
                iMin = (int) (Math.min(this.gsd, this.wrv.nj().ivm() * this.wrv.nj().orq()) - i10);
            } else {
                iMin = this.gsd - i10;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.oa.oa oaVar = this.pz;
        if (oaVar != null && oaVar.oa() != null) {
            this.pz.oa().setTime(String.valueOf(i5), i12, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) {
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.moa) moaVar).setTime(String.valueOf(i5), i12, iMin, false);
        }
    }

    public void uef(String str, JSONObject jSONObject) {
    }

    public void uef(boolean z2, String str) {
    }

    public boolean uef(JSONObject jSONObject) {
        return false;
    }

    public void uef(int i5, boolean z2, boolean z10) {
        this.sy = z2;
        removeCallbacks(this.dor);
        removeCallbacks(this.au);
        if (i5 == 0) {
            if (z10) {
                this.au.run();
                return;
            } else {
                postDelayed(this.au, 50L);
                return;
            }
        }
        if (z10) {
            this.dor.run();
        } else {
            postDelayed(this.dor, 50L);
        }
    }

    public void oa(int i5, String str) throws JSONException {
        oyt oytVarTpx;
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar == null || !(moaVar instanceof ue) || (oytVarTpx = ((ue) moaVar).tpx()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i5);
            jSONObject.put("flag", str);
            oytVarTpx.uef("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.dhk.uef("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i5));
        if (i5 == -1 || yoVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (cp.yo(this.wrv)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        map.put("dynamic_show_type", Integer.valueOf(getDynamicShowType()));
        com.bytedance.sdk.openadsdk.core.model.ab abVar = (com.bytedance.sdk.openadsdk.core.model.ab) yoVar;
        if (com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(this.wrv)) {
            map.put("duration", Integer.valueOf(abVar.bs));
        }
        if (com.bytedance.sdk.openadsdk.core.model.dhk.yo(this.wrv)) {
            try {
                JSONObject jSONObject2 = abVar.cq;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo(th.toString(), new Object[0]);
            }
        }
        cz czVar = this.ivm;
        if (czVar != null) {
            czVar.moa(getDynamicShowType());
            this.ivm.uef(map);
        }
        zjm zjmVar = this.xs;
        if (zjmVar != null) {
            zjmVar.moa(getDynamicShowType());
            this.xs.uef(map);
        }
        float f10 = abVar.uef;
        float f11 = abVar.f25657oa;
        float f12 = abVar.yo;
        float f13 = abVar.moa;
        boolean z2 = abVar.dj;
        SparseArray<yo.uef> sparseArray = abVar.zjm;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.hnk;
        }
        SparseArray<yo.uef> sparseArray2 = sparseArray;
        String str = abVar.xs;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectUef = view != this ? uef(view) : null;
            view2 = view;
        }
        abVar.bcc = i5;
        if (jSONObjectUef != null && abVar.cz == null) {
            abVar.cz = jSONObjectUef;
        }
        if (i5 != 13) {
            switch (i5) {
                case 1:
                    FrameLayout frameLayout = this.cq;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.wrv;
                    if (gzwVar == null || gzwVar.hnk() != 1 || z2) {
                        zjm zjmVar2 = this.xs;
                        if (zjmVar2 != null) {
                            zjmVar2.uef(abVar);
                            this.xs.uef(str);
                            this.xs.uef(view2, f10, f11, f12, f13, sparseArray2, z2);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.lw;
                        if (pAGExpressAdWrapperListener != null && !abVar.dz) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (abVar.wrv > 0) {
                        pu.uef(true);
                    }
                    cz czVar2 = this.ivm;
                    if (czVar2 != null) {
                        czVar2.uef(abVar);
                        this.ivm.uef(str);
                        if (com.bytedance.sdk.openadsdk.core.model.dhk.yo(this.wrv) && (jSONObject = abVar.cq) != null) {
                            this.ivm.moa(jSONObject.optBoolean("is_ceiling_page", false));
                        }
                        this.ivm.uef(view2, f10, f11, f12, f13, sparseArray2, z2);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.lw;
                    if (pAGExpressAdWrapperListener2 != null && !abVar.dz) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    pu.uef(false);
                    if (!com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(this.wrv)) {
                        com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.wrv, 9);
                        break;
                    }
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.moa;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                        break;
                    } else {
                        com.bytedance.sdk.openadsdk.yo.yo yoVar2 = this.yo;
                        if (yoVar2 != null) {
                            yoVar2.uef();
                            break;
                        } else {
                            TTDelegateActivity.uef(this.wrv, this.pu);
                            break;
                        }
                    }
                case 4:
                    FrameLayout frameLayout2 = this.cq;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 = this.wrv;
                    if (gzwVar2 == null || gzwVar2.hnk() != 1 || z2) {
                        gb.yo(this.wrv);
                        if ("embeded_ad".equals(this.zjm) && ku() && !this.dz && gb.yo(this.wrv)) {
                            cz czVar3 = this.ivm;
                            if (czVar3 != null) {
                                czVar3.uef(abVar);
                                this.ivm.uef(str);
                                this.ivm.uef(view2, f10, f11, f12, f13, sparseArray2, z2);
                            }
                        } else {
                            zjm zjmVar3 = this.xs;
                            if (zjmVar3 != null) {
                                zjmVar3.uef(abVar);
                                this.xs.uef(str);
                                this.xs.uef(view2, f10, f11, f12, f13, sparseArray2, z2);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.lw;
                        if (pAGExpressAdWrapperListener3 != null && !abVar.dz) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    uef(!this.gzw, "dynamicClick");
                    break;
                case 6:
                    uef();
                    break;
                case 7:
                    TTWebsiteActivity.uef(this.cz, this.wrv, this.zjm);
                    break;
            }
            return;
        }
        int i10 = abVar.wk;
        if (i10 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i10);
                uef(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    public void xs(int i5) {
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if ((moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.xs) && i5 == 4) {
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.xs) moaVar).zjm();
        }
    }

    public tpx(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, String str) {
        super(context);
        this.uef = true;
        this.f25868oa = 0;
        this.zjm = "embeded_ad";
        this.bcc = null;
        this.wk = false;
        this.sy = true;
        this.oib = -1;
        this.lz = "";
        this.gzw = false;
        this.af = true;
        this.gsd = -1;
        this.gr = new com.bytedance.sdk.openadsdk.moa.xs();
        this.f25869ue = 0L;
        this.rl = new AtomicBoolean(false);
        this.gem = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                tpx tpxVar = tpx.this;
                if (tpxVar.sy && tpxVar.zjm()) {
                    tpx.this.cp();
                    tpx tpxVar2 = tpx.this;
                    tpxVar2.removeCallbacks(tpxVar2.cop);
                    tpx tpxVar3 = tpx.this;
                    tpxVar3.postDelayed(tpxVar3.cop, 500L);
                }
            }
        };
        this.cop = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.2
            @Override // java.lang.Runnable
            public void run() {
                if (!km.uef(tpx.this, 0, 5, false)) {
                    tpx.this.ivm(8);
                } else {
                    tpx tpxVar = tpx.this;
                    tpxVar.ivm(tpxVar.getVisibility());
                }
            }
        };
        this.au = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.3
            @Override // java.lang.Runnable
            public void run() {
                tpx.this.ivm(0);
            }
        };
        this.dor = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.4
            @Override // java.lang.Runnable
            public void run() {
                tpx.this.ivm(8);
            }
        };
        this.ou = 8;
        this.hnk = new SparseArray<>();
        this.vjj = -1.0f;
        this.ot = -1.0f;
        this.jkf = -1.0f;
        this.ggp = -1.0f;
        this.sw = 0L;
        this.zjm = str;
        this.cz = context;
        this.wrv = gzwVar;
        this.dj = adSlot;
        this.gzw = false;
        xs();
    }

    public tpx(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, String str, boolean z2, boolean z10) {
        super(context);
        this.uef = true;
        this.f25868oa = 0;
        this.zjm = "embeded_ad";
        this.bcc = null;
        this.wk = false;
        this.sy = true;
        this.oib = -1;
        this.lz = "";
        this.gzw = false;
        this.af = true;
        this.gsd = -1;
        this.gr = new com.bytedance.sdk.openadsdk.moa.xs();
        this.f25869ue = 0L;
        this.rl = new AtomicBoolean(false);
        this.gem = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                tpx tpxVar = tpx.this;
                if (tpxVar.sy && tpxVar.zjm()) {
                    tpx.this.cp();
                    tpx tpxVar2 = tpx.this;
                    tpxVar2.removeCallbacks(tpxVar2.cop);
                    tpx tpxVar3 = tpx.this;
                    tpxVar3.postDelayed(tpxVar3.cop, 500L);
                }
            }
        };
        this.cop = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.2
            @Override // java.lang.Runnable
            public void run() {
                if (!km.uef(tpx.this, 0, 5, false)) {
                    tpx.this.ivm(8);
                } else {
                    tpx tpxVar = tpx.this;
                    tpxVar.ivm(tpxVar.getVisibility());
                }
            }
        };
        this.au = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.3
            @Override // java.lang.Runnable
            public void run() {
                tpx.this.ivm(0);
            }
        };
        this.dor = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.tpx.4
            @Override // java.lang.Runnable
            public void run() {
                tpx.this.ivm(8);
            }
        };
        this.ou = 8;
        this.hnk = new SparseArray<>();
        this.vjj = -1.0f;
        this.ot = -1.0f;
        this.jkf = -1.0f;
        this.ggp = -1.0f;
        this.sw = 0L;
        this.zjm = str;
        this.cz = context;
        this.wrv = gzwVar;
        this.dj = adSlot;
        this.gzw = z2;
        this.af = z10;
        xs();
    }

    public static JSONObject uef(View view) throws JSONException {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void uef(com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar, com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar;
        this.rl.set(true);
        this.cp = moaVar;
        moaVar.yo();
        if (this.ou != getWindowVisibility() && cz()) {
            ivm(getWindowVisibility());
        }
        if (moaVar.yo() == 3 && (gzwVar = this.wrv) != null && gzwVar.wxf() == 1) {
            this.wrv.wrv(0);
        }
        if (moaVar.yo() != 1 || (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa)) {
            View viewLw = moaVar.lw();
            if (viewLw.getParent() != null) {
                ((ViewGroup) viewLw.getParent()).removeView(viewLw);
            }
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                arrayList.add(getChildAt(i5));
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof com.bytedance.sdk.component.cz.ivm) {
                    removeView((View) arrayList.get(i10));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.dhk.yo(this.wrv)) {
                addView(moaVar.lw(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(moaVar.lw());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 = this.wrv;
        if (gzwVar2 != null) {
            com.bytedance.sdk.openadsdk.ab.moa.uef(gzwVar2.cz(), this.f25869ue, this.zjm, moaVar.yo());
        }
        com.bytedance.sdk.component.adexpress.oa.cz czVar = this.wxf;
        if (czVar != null) {
            ((dz) czVar).zjm();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.lw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) dzVar.yo(), (float) dzVar.moa());
        }
        if ((this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.xs) && com.bytedance.sdk.openadsdk.core.model.bs.uef(this.wrv)) {
            gr();
        }
        if (!com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(this.wrv) && oa(dzVar)) {
            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this, this.wrv, yo(getDynamicShowType()));
        }
        gzw gzwVar3 = this.sk;
        if (gzwVar3 != null) {
            gzwVar3.uef(this.wrv, this.zjm);
        }
    }

    public JSONObject uef(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) throws JSONException {
        if (!(this.cp instanceof ue)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (gzwVar != null) {
                if (gzwVar.vep() != null && gzwVar.vep().wrv()) {
                    jSONObject.put("engine_version", gzwVar.vep().dj());
                } else if (gzwVar.aje() != null) {
                    if (com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(gzwVar)) {
                        jSONObject.put("engine_version", "v4");
                    } else {
                        jSONObject.put("engine_version", "v3");
                    }
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e7) {
            e7.getMessage();
            return jSONObject;
        }
    }

    public void uef(com.bytedance.sdk.component.adexpress.oa.moa moaVar) {
        if (this.oyt == null) {
            return;
        }
        try {
            if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.xs) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.cq.ivm.xs) moaVar).ivm().dj();
                this.orq = viewGroup;
                if (viewGroup != null) {
                    this.oyt.oa();
                    View viewYo = this.oyt.yo();
                    if (viewYo != null) {
                        ViewGroup viewGroup2 = (ViewGroup) viewYo.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewYo);
                        }
                        this.orq.addView(viewYo, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, String str, boolean z2, boolean z10) {
        if (gzwVar == null) {
            return;
        }
        this.zjm = str;
        this.wrv = gzwVar;
        this.dj = adSlot;
        this.gzw = z2;
        this.af = z10;
        int iIx = gzwVar.ix();
        this.f25868oa = iIx;
        if (iIx != 10) {
            return;
        }
        this.km = true;
        xs();
        tpx();
        this.km = false;
    }
}

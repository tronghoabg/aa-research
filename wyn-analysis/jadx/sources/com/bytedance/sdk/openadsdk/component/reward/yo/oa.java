package com.bytedance.sdk.openadsdk.component.reward.yo;

import N0.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.reward.uef.wk;
import com.bytedance.sdk.openadsdk.component.reward.uef.wrv;
import com.bytedance.sdk.openadsdk.component.reward.yo.uef.oa;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.core.zjm.gsd;
import com.bytedance.sdk.openadsdk.utils.ab;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class oa implements ue.uef, PAGExpressAdWrapperListener, uef {

    /* renamed from: ab, reason: collision with root package name */
    protected boolean f25460ab;
    protected com.bytedance.sdk.openadsdk.component.reward.yo.uef.yo bcc;
    protected wrv cz;
    private com.bytedance.sdk.openadsdk.component.reward.yo.uef.uef dhk;
    protected long dz;
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo gzw;
    protected String ivm;
    protected gzw lw;
    protected Activity moa;

    /* renamed from: oa, reason: collision with root package name */
    public boolean f25461oa;
    private com.bytedance.sdk.openadsdk.component.reward.yo.uef.ivm oib;
    private ViewGroup orq;
    private com.bytedance.sdk.openadsdk.component.reward.yo.uef.moa sy;
    protected String uef;
    protected boolean wk;
    protected Context wrv;
    public wk xs;
    protected com.bytedance.sdk.openadsdk.component.reward.uef.uef zjm;
    private final AtomicBoolean bs = new AtomicBoolean(false);
    protected boolean yo = false;
    private boolean tpx = false;
    protected final ue dj = new ue(Looper.getMainLooper(), this);
    protected AtomicBoolean cq = new AtomicBoolean(false);

    public oa(Activity activity, Context context, gzw gzwVar, String str, ViewGroup viewGroup, String str2) {
        this.moa = activity;
        this.lw = gzwVar;
        this.ivm = str;
        this.wrv = context;
        this.orq = viewGroup;
        this.bcc = new com.bytedance.sdk.openadsdk.component.reward.yo.uef.yo(this, activity, gzwVar, str);
        this.xs = new wk(viewGroup, gzwVar, str, activity, activity.getApplicationContext(), this);
        this.cz = new wrv(activity, gzwVar, gzwVar.cgg(), false, this.f25461oa, null);
        this.sy = new com.bytedance.sdk.openadsdk.component.reward.yo.uef.moa(this, activity, gzwVar);
        this.oib = new com.bytedance.sdk.openadsdk.component.reward.yo.uef.ivm(gzwVar);
        this.dhk = new com.bytedance.sdk.openadsdk.component.reward.yo.uef.uef(viewGroup, activity);
        this.zjm = new com.bytedance.sdk.openadsdk.component.reward.uef.uef(activity, gzwVar, gzwVar.cgg());
        this.uef = str2;
        this.bcc.uef(this);
        this.xs.uef((PAGExpressAdWrapperListener) this);
        this.zjm.uef(uef(gzwVar));
        this.cz.uef(gzwVar.cl().getDurationSlotType() == 7);
    }

    private void bs() {
        com.bytedance.sdk.openadsdk.component.reward.uef.uef uefVar = this.zjm;
        if (uefVar == null) {
            return;
        }
        uefVar.uef();
        if (this.zjm.lw() != null) {
            this.orq.addView(this.zjm.lw(), new FrameLayout.LayoutParams(-1, -1));
            this.zjm.oa();
        }
    }

    private void sy() {
        dhk.uef("BaseManagerBundle", "removeLoadingPage: ");
        try {
            com.bytedance.sdk.openadsdk.component.reward.uef.uef uefVar = this.zjm;
            if (uefVar != null) {
                uefVar.yo();
            }
        } catch (Throwable th) {
            dhk.uef("BaseManagerBundle", "removeLoadingPage: ", th);
            com.bytedance.sdk.openadsdk.component.reward.uef.uef uefVar2 = this.zjm;
            if (uefVar2 == null || uefVar2.lw() == null) {
                return;
            }
            this.zjm.lw().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public void ab() {
        Activity activity;
        if (com.bytedance.sdk.openadsdk.gzw.lw.bcc() && (activity = this.moa) != null && activity.isChangingConfigurations()) {
            dhk.uef("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.f25460ab) {
            dhk.uef("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.f25460ab = true;
        gzw gzwVar = this.lw;
        if (gzwVar != null && !gzwVar.swd()) {
            long jCz = this.lw.cz();
            if (jCz > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jCz;
                if (jElapsedRealtime > 0) {
                    this.lw.oa(jElapsedRealtime);
                }
            }
            if (this.bcc != null) {
                JSONObject jSONObject = new JSONObject();
                wk wkVar = this.xs;
                if (wkVar != null && wkVar.oa() != null) {
                    jSONObject = this.xs.oa().uef(jSONObject, this.lw);
                }
                this.dz = System.currentTimeMillis();
                this.bcc.uef(jSONObject);
            }
        }
        wk();
    }

    public void bcc() {
        wrv wrvVar = this.cz;
        if (wrvVar != null) {
            wrvVar.uef();
        }
    }

    public void cq() {
    }

    public void cz() {
        dhk.uef("BaseManagerBundle", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        wrv();
    }

    public abstract void dj();

    public boolean dz() {
        return this.yo;
    }

    public void ivm() {
        dhk.uef("BaseManagerBundle", "onPause: ");
        wk wkVar = this.xs;
        if (wkVar != null) {
            wkVar.moa();
        }
        com.bytedance.sdk.openadsdk.component.reward.yo.uef.uef uefVar = this.dhk;
        if (uefVar != null) {
            uefVar.yo();
        }
    }

    public void lw() {
        wk wkVar = this.xs;
        if (wkVar == null) {
            return;
        }
        gsd gsdVarOa = wkVar.oa();
        this.xs.uef((uef) this);
        if (gsdVarOa != null) {
            this.oib.uef(gsdVarOa.getWebView());
            this.xs.uef(this.oib);
            gsdVarOa.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lw() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.oa.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.lw
                public void uef() {
                    oa.this.cz();
                }
            });
        }
    }

    public void moa() {
        if (this.tpx || this.lw == null) {
            return;
        }
        this.tpx = true;
        this.moa.getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.oa.1
            @Override // java.lang.Runnable
            public void run() {
                int iCgg = oa.this.lw.cgg();
                oa oaVar = oa.this;
                float[] fArrUef = wrv.uef(iCgg, oaVar.moa, oaVar.lw, false);
                dhk.uef("BaseManagerBundle", "show loading page");
                wk wkVar = oa.this.xs;
                if (wkVar != null) {
                    wkVar.uef(fArrUef);
                    oa.this.lw();
                    oa.this.xs.lw();
                    oa.this.xs.uef(new com.bytedance.sdk.openadsdk.core.zjm.lw() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.oa.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.zjm.lw
                        public void uef(String str) {
                            if (oa.this.sy != null) {
                                oa.this.sy.uef(str);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i5) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i5) {
        this.cq.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(View view, float f10, float f11) throws JSONException {
        this.cq.set(true);
        if (this.bcc != null) {
            JSONObject jSONObject = new JSONObject();
            wk wkVar = this.xs;
            if (wkVar != null && wkVar.oa() != null) {
                jSONObject = this.xs.oa().uef(jSONObject, this.lw);
            }
            this.dz = System.currentTimeMillis();
            this.bcc.uef(jSONObject);
        }
        if (this.dhk == null || !bcc.moa()) {
            return;
        }
        this.dhk.uef();
        this.dhk.uef(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.oa.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                oa oaVar = oa.this;
                if (oaVar.moa != null) {
                    wk wkVar2 = oaVar.xs;
                    if (wkVar2 != null && wkVar2.oa() != null) {
                        oa.this.xs.oa().setDirectDestroyWebView(true);
                    }
                    oa.this.cq();
                    oa.this.moa.finish();
                }
            }
        });
        this.dhk.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.oa.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.yo.uef.oa.uef
            public void uef() {
                wk wkVar2 = oa.this.xs;
                if (wkVar2 != null) {
                    wkVar2.uef();
                    dhk.uef("BaseManagerBundle", "onSendHeartbeat: ");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.yo.uef.oa.uef
            public void uef(oa.EnumC0079oa enumC0079oa) {
                dhk.uef("BaseManagerBundle", "onHeartbeatStatusChanged: ".concat(String.valueOf(enumC0079oa)));
                if (enumC0079oa == oa.EnumC0079oa.TIMEOUT) {
                    oa.this.dhk.oa();
                    oa.this.dhk.uef(oa.this.lw);
                }
            }
        });
        this.xs.uef(new moa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.oa.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.yo.moa
            public void uef() {
                if (oa.this.dhk != null) {
                    oa.this.dhk.moa();
                    dhk.uef("BaseManagerBundle", "responseHeartBeat: ");
                }
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.uef.uef uefVar = this.zjm;
        if (uefVar != null) {
            uefVar.yo();
            this.zjm.moa();
        }
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
    }

    public abstract void uef(boolean z2, int i5, String str, int i10, String str2, int i11);

    public abstract void wk();

    public abstract void wrv();

    public void xs() {
        sy();
        com.bytedance.sdk.openadsdk.component.reward.yo.uef.yo yoVar = this.bcc;
        if (yoVar != null && yoVar.uef() && this.bcc.oa() > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.bcc.oa());
            wk wkVar = this.xs;
            com.bytedance.sdk.openadsdk.moa.yo.uef(strValueOf, this.lw, this.ivm, (wkVar == null || wkVar.oa() == null) ? null : this.xs.oa().getAdShowTime());
        }
        com.bytedance.sdk.openadsdk.component.reward.yo.uef.moa moaVar = this.sy;
        if (moaVar != null) {
            moaVar.uef();
        }
        wk wkVar2 = this.xs;
        if (wkVar2 != null) {
            wkVar2.ivm();
        }
        ab.uef();
    }

    public void yo(Bundle bundle) {
        if (bundle != null) {
            this.wk = bundle.getBoolean("enable_new_arch", false);
            return;
        }
        Activity activity = this.moa;
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        this.wk = this.moa.getIntent().getBooleanExtra("enable_new_arch", false);
    }

    public void zjm() {
        dj();
        wk wkVar = this.xs;
        if (wkVar == null || wkVar.oa() == null) {
            return;
        }
        this.xs.oa().oib();
    }

    public void oa(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.yo.uef.yo yoVar = this.bcc;
        if (yoVar != null && yoVar.uef()) {
            this.lw.zjm(true);
        }
        if (this.bs.get()) {
            this.lw.bcc(true);
        }
    }

    public void uef(Bundle bundle) {
        ab.uef(this.lw, this.wrv, this.ivm, this);
        bs();
    }

    public void uef(boolean z2) {
        if (this.bcc != null) {
            wk wkVar = this.xs;
            this.bcc.uef(z2, (wkVar == null || wkVar.oa() == null) ? null : this.xs.oa().getAdShowTime());
            this.bcc.uef(z2, this.lw, this.ivm);
        }
    }

    public void yo() {
        moa();
        wrv wrvVar = this.cz;
        if (wrvVar != null) {
            wrvVar.uef(this.dj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.uef
    public void oa() {
        if (this.bs.compareAndSet(false, true)) {
            dhk.uef("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            zjm();
        }
    }

    public void oa(boolean z2) {
        this.yo = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.uef
    public void uef() {
        cz();
        this.lw.puz();
        this.lw.moa(true);
        if (gzw.lw(this.lw)) {
            gzw gzwVar = this.lw;
            com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, this.ivm, gzwVar.wzm());
        }
    }

    public com.bytedance.sdk.openadsdk.core.yo.lw uef(gzw gzwVar) {
        if (this.gzw == null) {
            this.gzw = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this.moa, this.ivm);
        }
        Activity activity = this.moa;
        String str = this.ivm;
        com.bytedance.sdk.openadsdk.core.yo.lw lwVar = new com.bytedance.sdk.openadsdk.core.yo.lw(activity, gzwVar, str, TextUtils.equals(str, "rewarded_video") ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.oa.6
            @Override // com.bytedance.sdk.openadsdk.core.yo.lw
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, int i5, int i10, int i11, boolean z2) {
                HashMap map = new HashMap();
                a.p(0, map, "duration", 1, "click_scence");
                uef(map);
                oa.this.cz();
            }
        };
        lwVar.uef(this.gzw);
        return lwVar;
    }
}

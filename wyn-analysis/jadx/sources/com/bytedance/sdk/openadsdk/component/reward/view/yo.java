package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.oa.dz;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.zjm.ab;
import com.bytedance.sdk.openadsdk.core.zjm.sy;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.core.zjm.ue;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.bytedance.sdk.openadsdk.moa.oib;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import j$.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo extends tpx {
    public static float uef = 100.0f;
    private float ivm;
    private final com.bytedance.sdk.openadsdk.component.reward.uef.oa lw;
    public int moa;

    /* renamed from: oa, reason: collision with root package name */
    ab f25453oa;
    private com.bytedance.sdk.openadsdk.orq.uef.uef xs;
    sy yo;

    public yo(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, AdSlot adSlot, String str) {
        super(oaVar.pu, oaVar.f25412oa, adSlot, str, oaVar.gem, !oaVar.vjj);
        this.moa = 1;
        this.ivm = -1.0f;
        this.lw = oaVar;
        setVideoBusiness(oaVar.gb);
    }

    private void dz() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.oa.yo() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yo.2
            @Override // com.bytedance.sdk.component.adexpress.oa.yo
            public boolean uef(ViewGroup viewGroup, int i5) {
                try {
                    ((tpx) viewGroup).orq();
                    yo.this.yo = new sy(viewGroup.getContext());
                    yo yoVar = yo.this;
                    yoVar.yo.uef(((tpx) yoVar).wrv, (tpx) viewGroup, yo.this.lw.km);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa(dz dzVar) {
        if (dzVar == null) {
            return;
        }
        double dLw = dzVar.lw();
        double dIvm = dzVar.ivm();
        double dXs = dzVar.xs();
        double dBcc = dzVar.bcc();
        int iOa = af.oa(this.cz, (float) dLw);
        int iOa2 = af.oa(this.cz, (float) dIvm);
        int iOa3 = af.oa(this.cz, (float) dXs);
        int iOa4 = af.oa(this.cz, (float) dBcc);
        if ((dBcc != 0.0d && dXs != 0.0d) || this.cp.yo() == 7 || this.cp.yo() == 10 || (this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa)) {
            if ((this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) && (dzVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.oa)) {
                FrameLayout frameLayoutAb = ((com.bytedance.sdk.openadsdk.core.cq.ivm.oa) dzVar).ab();
                if (frameLayoutAb != null) {
                    if (this.cq.getParent() != null) {
                        ((ViewGroup) this.cq.getParent()).removeView(this.cq);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutAb.addView(this.cq, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.cq.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iOa3, iOa4);
            }
            layoutParams2.width = iOa3;
            layoutParams2.height = iOa4;
            layoutParams2.topMargin = iOa2;
            layoutParams2.leftMargin = iOa;
            layoutParams2.setMarginStart(iOa);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.cq.setLayoutParams(layoutParams2);
        }
    }

    private void yo(dz dzVar) {
        FrameLayout frameLayoutBs;
        boolean z2;
        try {
            if (!(dzVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.oa) || (frameLayoutBs = ((com.bytedance.sdk.openadsdk.core.cq.ivm.oa) dzVar).bs()) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = this.lw.sw;
            boolean z10 = true;
            if (bccVar == null || bccVar.sk() == null) {
                z2 = false;
            } else {
                com.bytedance.sdk.openadsdk.activity.single.bcc bccVarDj = this.lw.sw.sk().dj();
                com.bytedance.sdk.openadsdk.activity.single.bcc bccVar2 = this.lw.sw;
                z2 = bccVarDj == bccVar2;
                if (!bccVar2.sk().gzw() && z2) {
                    z10 = false;
                }
            }
            boolean z11 = z10;
            com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = new com.bytedance.sdk.openadsdk.orq.uef.uef(this.cz, this.wrv, this.lw.etd, z11, frameLayoutBs);
            this.xs = uefVar;
            uefVar.uef(this.lw.gb);
            this.xs.uef(false, (com.bytedance.sdk.openadsdk.cq.xs) null);
            this.xs.uef();
            dhk.uef("TTAD.FRExpressView", "initPlayable success mute = " + this.lw.gem + ",isCurrentScene->" + z2 + ",isMute = " + z11);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void bcc() {
        Context context = this.cz;
        if ((context instanceof TTBaseVideoActivity) && ((TTBaseVideoActivity) context).pu()) {
            this.bs = new oib(19, this.zjm, this.wrv);
        } else {
            super.bcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void cq() {
        try {
            com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.xs;
            if (uefVar != null) {
                uefVar.moa();
            }
        } catch (Throwable unused) {
        }
        if (!rt() && (getExpressInteractionListener() instanceof PAGRewardFullExpressAdListenerProxy)) {
            ((PAGRewardFullExpressAdListenerProxy) getExpressInteractionListener()).triggerUnfinishedFail(this);
        }
        super.cq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public boolean cz() {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = this.lw.sw;
        if (bccVar == null || !bccVar.sk().gr()) {
            return true;
        }
        return this.lw.cop;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.model.dhk dhkVar;
        dj djVar = this.lw.oyt;
        if (djVar != null && (dhkVar = djVar.wk) != null && dhkVar.cz()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.ivm = motionEvent.getY();
            } else if (action == 1) {
            }
            if (af.uef(this.ivm, motionEvent.getY(), this.cz)) {
                dhkVar.oa(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void dj() {
        super.dj();
        if (this.xs != null) {
            com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = this.lw.sw;
            if (bccVar != null && bccVar.sk() != null) {
                this.xs.uef(this.lw.sw.sk().gzw());
            }
            this.xs.oa();
        }
    }

    public View getBackupContainerBackgroundView() {
        if (gzw()) {
            return this.yo.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        return gzw() ? this.yo.getVideoContainer() : this.cq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void ivm() {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.ivm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public int lw() {
        ab abVar = this.f25453oa;
        if (abVar == null) {
            return 0;
        }
        int iLw = abVar.lw();
        xs(iLw);
        return iLw;
    }

    public void setExpressVideoListenerProxy(ab abVar) {
        this.f25453oa = abVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setSoundMute(boolean z2) {
        super.setSoundMute(z2);
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.xs;
        if (uefVar != null) {
            uefVar.uef(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void wrv() {
        super.wrv();
        if (this.xs != null) {
            com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = this.lw.sw;
            if (bccVar != null && bccVar.sk() != null) {
                this.xs.uef(true);
            }
            this.xs.yo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void xs() {
        this.wk = true;
        this.cq = new FrameLayout(this.cz);
        if (!com.bytedance.sdk.openadsdk.core.cq.lw.uef(this.wrv) && !com.bytedance.sdk.openadsdk.core.cq.lw.oa(this.wrv)) {
            addView(this.cq, new FrameLayout.LayoutParams(-1, -1));
        }
        super.xs();
        com.bytedance.sdk.component.cz.ivm webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        dz();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.cq.bcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yo.1
            @Override // com.bytedance.sdk.openadsdk.cq.bcc
            public void uef(dz dzVar) {
                yo.this.uef(dzVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public boolean zjm() {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = this.lw.sw;
        return bccVar == null || !bccVar.sk().gr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public boolean oa(JSONObject jSONObject) {
        return com.bytedance.sdk.openadsdk.component.reward.oa.uef(this.lw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void oa() {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.oa();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.oa.wk
    public void uef(com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar, dz dzVar) {
        this.cp = moaVar;
        gzw gzwVar = this.wrv;
        if (gzwVar != null && gzwVar.ib()) {
            super.uef(moaVar, dzVar);
            return;
        }
        if (moaVar instanceof ue) {
            ue ueVar = (ue) moaVar;
            if (ueVar.tpx() != null) {
                ueVar.tpx().uef((ab) this);
            }
        }
        if (dzVar != null && dzVar.oa()) {
            uef(dzVar);
            this.moa = moaVar.yo();
            if ((this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) && cp.yo(this.wrv)) {
                yo(dzVar);
            }
            if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm) {
                this.lw.tpx.lw(true);
            }
        }
        super.uef(moaVar, dzVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void oa(int i5) {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.oa(i5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public long yo() {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            return abVar.yo();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public lw.uef yo(int i5) {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        lw.uef uefVarYo = super.yo(i5);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.lw;
        if (oaVar.vjj && (bccVar = oaVar.sw) != null) {
            uefVarYo.f25909oa = bccVar.dj;
        }
        return uefVarYo;
    }

    public void uef(final dz dzVar) {
        if (dzVar == null) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yo.3
            @Override // java.lang.Runnable
            public void run() {
                yo.this.moa(dzVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(String str, JSONObject jSONObject) {
        super.uef(str, jSONObject);
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.uef(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(boolean z2, String str) {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.uef(z2, str);
        }
        setSoundMute(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public boolean uef(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        ab abVar = this.f25453oa;
        if (abVar != null) {
            return abVar.uef(jSONObject);
        }
        return super.uef(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public long moa() {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            return abVar.moa();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef() {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.uef();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5) {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.uef(i5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5, dz dzVar) {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.uef(i5, dzVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.oa.bcc
    public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
        if (i5 != -1 && yoVar != null && i5 == 3) {
            ivm();
        } else {
            super.uef(view, i5, yoVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5, String str) {
        ab abVar = this.f25453oa;
        if (abVar != null) {
            abVar.uef(i5, str);
        }
    }

    public void uef(long j8, long j10) {
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) {
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.moa) moaVar).uef(j8, j10);
        }
    }
}

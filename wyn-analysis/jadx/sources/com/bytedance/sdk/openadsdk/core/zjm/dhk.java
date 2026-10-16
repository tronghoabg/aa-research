package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.wk.oa.ivm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class dhk extends tpx implements yo.moa, yo.InterfaceC0033yo {
    int bcc;
    private long dxx;
    private com.bytedance.sdk.openadsdk.oib.yo.uef fz;
    boolean ivm;
    private boolean km;
    int lw;
    private long lz;
    boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    int f25850oa;
    private com.bytedance.sdk.openadsdk.uef.oa.yo oyt;
    private com.bytedance.sdk.openadsdk.core.wk.oa.ivm pu;
    private bs uef;
    boolean xs;
    boolean yo;

    public dhk(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, String str, boolean z2) {
        super(context, gzwVar, adSlot, str, false, true);
        this.f25850oa = 1;
        this.yo = false;
        this.moa = true;
        this.ivm = true;
        this.xs = true;
        this.bcc = -1;
        this.km = z2;
        wk();
    }

    private void setShowAdInteractionView(boolean z2) {
        bs bsVar = this.uef;
        if (bsVar != null) {
            bsVar.setShowAdInteractionView(z2);
        }
    }

    private void ue() {
        try {
            this.fz = new com.bytedance.sdk.openadsdk.oib.yo.uef();
            bs bsVar = new bs(this.cz, this.wrv, this.zjm, this.gr, this.km);
            this.uef = bsVar;
            bsVar.setShouldCheckNetChange(false);
            this.uef.setControllerStatusCallBack(new ivm.oa() { // from class: com.bytedance.sdk.openadsdk.core.zjm.dhk.2
                @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm.oa
                public void uef(boolean z2, long j8, long j10, long j11, boolean z10) {
                    dhk.this.fz.uef = z2;
                    dhk.this.fz.lw = j8;
                    dhk.this.fz.ivm = j10;
                    dhk.this.fz.xs = j11;
                    dhk.this.fz.moa = z10;
                }
            });
            this.uef.setVideoAdLoadListener(this);
            this.uef.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.zjm)) {
                this.uef.setIsAutoPlay(this.yo ? this.dj.isAutoPlay() : this.moa);
            } else if ("open_ad".equals(this.zjm)) {
                this.uef.setIsAutoPlay(true);
            } else {
                this.uef.setIsAutoPlay(this.moa);
            }
            if ("open_ad".equals(this.zjm)) {
                this.uef.uef(true, "initVideo");
            } else {
                boolean zYo = com.bytedance.sdk.openadsdk.core.sy.moa().yo(String.valueOf(this.lw));
                this.gzw = zYo;
                this.uef.uef(zYo, "initVideo");
            }
            this.uef.moa();
        } catch (Exception unused) {
            this.uef = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        com.bytedance.sdk.openadsdk.core.wk.oa.yo videoController;
        if (uef(dzVar, false)) {
            this.cq.removeAllViews();
            if (this.uef != null) {
                if ((this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) && (dzVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.oa)) {
                    FrameLayout frameLayoutAb = ((com.bytedance.sdk.openadsdk.core.cq.ivm.oa) dzVar).ab();
                    if (frameLayoutAb != null) {
                        frameLayoutAb.removeAllViews();
                        if (this.bcc == 10) {
                            this.uef.setClickable(false);
                        }
                        frameLayoutAb.addView(this.uef, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm) && (videoController = getVideoController()) != null) {
                        videoController.ivm(false);
                    }
                } else if (dzVar.uef() == null) {
                    this.cq.addView(this.uef);
                } else if (this.xs) {
                    dzVar.uef().setTag(com.bytedance.sdk.component.adexpress.dynamic.uef.ivm, 1);
                    ((FrameLayout) dzVar.uef()).removeAllViews();
                    ((FrameLayout) dzVar.uef()).addView(this.uef, new FrameLayout.LayoutParams(-1, -1));
                    this.xs = false;
                }
                this.uef.uef(0L, true, false);
                moa(this.lw);
                if (!com.bytedance.sdk.component.utils.sy.moa(this.cz) && !this.moa && this.ivm) {
                    this.uef.lw();
                }
                if (TextUtils.equals("embeded_ad", this.zjm)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    public void ab() {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.pu;
        if (ivmVar != null) {
            ivmVar.cq();
            return;
        }
        bs bsVar = this.uef;
        if (bsVar != null) {
            bsVar.cq();
        }
    }

    public void bs() {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.pu;
        if (ivmVar != null) {
            ivmVar.wk();
            return;
        }
        bs bsVar = this.uef;
        if (bsVar != null) {
            bsVar.wk();
        }
    }

    public boolean dz() {
        return this.km;
    }

    public bs getExpressVideoView() {
        return this.uef;
    }

    public com.bytedance.sdk.openadsdk.uef.oa.yo getVideoAdListener() {
        return this.oyt;
    }

    public com.bytedance.sdk.openadsdk.core.wk.oa.yo getVideoController() {
        bs bsVar = this.uef;
        if (bsVar != null) {
            return bsVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.oib.yo.uef getVideoModel() {
        return this.fz;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void h_() {
        this.ivm = false;
        this.f25850oa = 2;
        com.bytedance.sdk.openadsdk.uef.oa.yo yoVar = this.oyt;
        if (yoVar != null) {
            yoVar.uef(null);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void i_() {
        this.ivm = false;
        this.dz = true;
        this.f25850oa = 3;
        com.bytedance.sdk.openadsdk.uef.oa.yo yoVar = this.oyt;
        if (yoVar != null) {
            yoVar.oa(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void ivm() {
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void j_() {
        this.ivm = false;
        this.dz = false;
        this.f25850oa = 2;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void k_() {
        this.ivm = false;
        this.f25850oa = 5;
        com.bytedance.sdk.component.adexpress.oa.oa oaVar = this.pz;
        if (oaVar != null && oaVar.oa() != null) {
            this.pz.oa().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.uef.oa.yo yoVar = this.oyt;
        if (yoVar != null) {
            yoVar.yo(null);
        }
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) {
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.moa) moaVar).onvideoComplate();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public int lw() {
        bs bsVar;
        if (this.f25850oa == 3 && (bsVar = this.uef) != null) {
            bsVar.moa();
        }
        bs bsVar2 = this.uef;
        if (bsVar2 != null && bsVar2.getNativeVideoController().dz()) {
            this.f25850oa = 1;
        }
        xs(this.f25850oa);
        return this.f25850oa;
    }

    public void moa(int i5) {
        int iOa = com.bytedance.sdk.openadsdk.core.sy.moa().oa(i5);
        if (3 == iOa) {
            this.yo = false;
            this.moa = false;
        } else if (4 == iOa) {
            this.yo = true;
        } else {
            int iYo = com.bytedance.sdk.component.utils.sy.yo(com.bytedance.sdk.openadsdk.core.sy.uef());
            if (1 == iOa) {
                this.yo = false;
                this.moa = gb.moa(iYo);
            } else if (2 == iOa) {
                if (gb.lw(iYo) || gb.moa(iYo) || gb.ivm(iYo)) {
                    this.yo = false;
                    this.moa = true;
                }
            } else if (5 == iOa && (gb.moa(iYo) || gb.ivm(iYo))) {
                this.yo = false;
                this.moa = true;
            }
        }
        if (this.moa) {
            return;
        }
        this.f25850oa = 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void oa() {
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar) {
        this.pu = ivmVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.uef.oa.yo yoVar) {
        this.oyt = yoVar;
    }

    public void sy() {
        com.bytedance.sdk.openadsdk.core.wk.oa.yo videoController = getVideoController();
        if (videoController instanceof com.bytedance.sdk.openadsdk.core.wk.oa.yo) {
            videoController.uef(3, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef() {
    }

    public void wk() {
        this.cq = new FrameLayout(this.cz);
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.wrv;
        int iJnk = gzwVar != null ? gzwVar.jnk() : 0;
        this.lw = iJnk;
        moa(iJnk);
        ue();
        addView(this.cq, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.cq.bcc() { // from class: com.bytedance.sdk.openadsdk.core.zjm.dhk.1
            @Override // com.bytedance.sdk.openadsdk.cq.bcc
            public void uef(final com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
                km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.dhk.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dhk.this.uef(dzVar, true);
                    }
                });
            }
        });
    }

    private void oa(long j8, long j10) throws JSONException {
        int iAbs = (int) Math.abs(this.oib - j8);
        int i5 = this.oib;
        if (i5 < 0 || iAbs > 500 || i5 > j10 || iAbs >= 500 || this.tpx.contains(this.dhk)) {
            return;
        }
        if (this.oib > j8) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.dhk.4
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    dhk.this.uef.setCanInterruptVideoPlay(true);
                    dhk.this.uef.performClick();
                    dhk dhkVar = dhk.this;
                    dhkVar.oa(dhkVar.oib, dhkVar.dhk);
                }
            }, iAbs);
        } else {
            this.uef.setCanInterruptVideoPlay(true);
            this.uef.performClick();
            oa(this.oib, this.dhk);
        }
        this.tpx.add(this.dhk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.oa.wk
    public void uef(com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar, com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        this.cp = moaVar;
        this.bcc = moaVar.yo();
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar2 = this.cp;
        if ((moaVar2 instanceof ue) && ((ue) moaVar2).tpx() != null) {
            ((ue) this.cp).tpx().uef((ab) this);
        }
        if (dzVar != null && dzVar.oa()) {
            uef(dzVar);
        }
        super.uef(moaVar, dzVar);
    }

    private void uef(final com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        if (dzVar == null) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.dhk.3
            @Override // java.lang.Runnable
            public void run() {
                dhk.this.yo(dzVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(com.bytedance.sdk.component.adexpress.oa.dz dzVar, boolean z2) {
        int i5;
        double dLw = dzVar.lw();
        double dIvm = dzVar.ivm();
        double dXs = dzVar.xs();
        double dBcc = dzVar.bcc();
        if ((dXs == 0.0d || dBcc == 0.0d) && (i5 = this.bcc) != 7 && i5 != 10 && i5 != 9 && !(this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa)) {
            return false;
        }
        int iOa = af.oa(this.cz, (float) dLw);
        int iOa2 = af.oa(this.cz, (float) dIvm);
        int iOa3 = af.oa(this.cz, (float) dXs);
        int iOa4 = af.oa(this.cz, (float) dBcc);
        float fMin = Math.min(Math.min(af.oa(this.cz, dzVar.dj()), af.oa(this.cz, dzVar.wrv())), Math.min(af.oa(this.cz, dzVar.cq()), af.oa(this.cz, dzVar.dz())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.cq.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iOa3, iOa4);
        }
        layoutParams.width = iOa3;
        layoutParams.height = iOa4;
        layoutParams.topMargin = iOa2;
        layoutParams.leftMargin = iOa;
        layoutParams.setMarginStart(iOa);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.cq.setLayoutParams(layoutParams);
        af.oa(this.cq, fMin);
        bs bsVar = this.uef;
        if (bsVar == null || !z2) {
            return true;
        }
        bsVar.uef(iOa3, iOa4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public long moa() {
        return this.dxx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public long yo() {
        return this.dxx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(boolean z2, String str) {
        bs bsVar;
        if (this.wrv.ga() || (bsVar = this.uef) == null) {
            return;
        }
        bsVar.uef(z2, str);
        setSoundMute(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5) {
        bs bsVar = this.uef;
        if (bsVar == null) {
            return;
        }
        if (i5 == 1) {
            bsVar.uef(0L, true, false);
            return;
        }
        if (i5 == 2 || i5 == 3) {
            bsVar.setCanInterruptVideoPlay(true);
            this.uef.performClick();
        } else if (i5 == 4) {
            bsVar.getNativeVideoController().lw();
        } else {
            if (i5 != 5) {
                return;
            }
            bsVar.uef(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.oa.bcc
    public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
        if (i5 == -1 || yoVar == null) {
            return;
        }
        if (i5 == 11) {
            try {
                bs bsVar = this.uef;
                if (bsVar != null) {
                    bsVar.setCanInterruptVideoPlay(true);
                    this.uef.performClick();
                    if (this.dz) {
                        this.uef.findViewById(com.bytedance.sdk.openadsdk.utils.bs.az).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.uef(view, i5, yoVar);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void uef(long j8, long j10) throws JSONException {
        this.ivm = false;
        int i5 = this.f25850oa;
        if (i5 != 5 && i5 != 3 && j8 > this.dxx) {
            this.f25850oa = 2;
        }
        this.dxx = j8;
        this.lz = j10;
        com.bytedance.sdk.component.adexpress.oa.oa oaVar = this.pz;
        if (oaVar != null && oaVar.oa() != null) {
            this.pz.oa().setTimeUpdate(((int) (j10 - j8)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) {
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.moa) moaVar).setTimeUpdate(((int) (j10 - j8)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.moa) this.cp).uef(j8, j10);
        }
        oa(j8, j10);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.moa
    public void uef(int i5, int i10) {
        this.dxx = this.lz;
        this.f25850oa = 4;
        com.bytedance.sdk.openadsdk.uef.oa.yo yoVar = this.oyt;
        if (yoVar != null) {
            yoVar.uef(i5, i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5, String str) {
        this.oib = i5;
        this.dhk = str;
    }
}

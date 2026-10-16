package com.bytedance.sdk.openadsdk.core.moa;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bcc;
import com.bytedance.sdk.openadsdk.core.moa.xs;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.yo.oa;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.sk;
import com.bytedance.sdk.openadsdk.utils.ue;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private final boolean bcc;
    private boolean cz;
    private tpx dj;
    private boolean dz;
    private final Context ivm;
    private PAGBannerAdWrapperListener lw;
    private gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    protected AdSlot f25647oa;
    private long oib;
    protected moa uef;
    private xs wrv;
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo zjm;
    private String yo = "banner_ad";
    private long xs = 0;
    private final AtomicBoolean cq = new AtomicBoolean(false);
    private final int wk = 1;

    /* renamed from: ab, reason: collision with root package name */
    private final int f25646ab = 0;
    private int bs = -1;
    private final View.OnAttachStateChangeListener sy = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (uef.this.bs == 0 || uef.this.cz) {
                return;
            }
            uef uefVar = uef.this;
            uefVar.uef(uefVar.uef.getCurView(), uef.this.moa);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (uef.this.dz) {
                uef.this.bs = 0;
            } else {
                uef.this.ivm();
            }
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.moa.uef$uef, reason: collision with other inner class name */
    public static class C0099uef extends com.bytedance.sdk.component.bcc.oa.yo {

        /* renamed from: oa, reason: collision with root package name */
        gzw f25652oa;
        boolean uef;
        WeakReference<uef> yo;

        public C0099uef(boolean z2, gzw gzwVar, uef uefVar) {
            super("ReportWindowFocusChangedAdShow");
            this.uef = z2;
            this.f25652oa = gzwVar;
            this.yo = new WeakReference<>(uefVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<uef> weakReference = this.yo;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.yo.get().oa(this.uef, this.f25652oa);
        }
    }

    public uef(Context context, gzw gzwVar, AdSlot adSlot, xs xsVar, boolean z2) {
        this.dz = false;
        this.ivm = context;
        this.moa = gzwVar;
        this.f25647oa = adSlot;
        this.wrv = xsVar;
        this.dz = z2;
        uef(context, gzwVar, adSlot);
        this.bcc = false;
        this.cz = false;
    }

    private void wrv() {
        this.moa.uef(SystemClock.elapsedRealtime());
        this.uef.lw();
    }

    private xs.uef dj() {
        return new xs.uef() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.7
            @Override // com.bytedance.sdk.openadsdk.core.moa.xs.uef
            public void uef() {
                int width = uef.this.dj.getWidth();
                int height = uef.this.dj.getHeight();
                View viewUef = uef(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                uef.this.dj.gsd();
                uef.this.dj.removeAllViews();
                uef.this.dj.addView(viewUef, new ViewGroup.LayoutParams(width, height));
                uef.this.dj.setClickCreativeListener(null);
                uef.this.dj.setClickListener(null);
                if (uef.this.lw != null) {
                    uef.this.lw.onAdDismissed();
                }
                uef.this.cz = true;
            }

            private View uef(boolean z2) {
                com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(uef.this.ivm);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                yoVar.setBackgroundColor(-1);
                yoVar.setLayoutParams(layoutParams);
                View view = new View(uef.this.ivm);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                yoVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.ivm.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(uef.this.ivm);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z2) {
                    yoVar2.setBackground(orq.yo(uef.this.ivm, "tt_ad_closed_background_300_250"));
                } else {
                    yoVar2.setBackground(orq.yo(uef.this.ivm, "tt_ad_closed_background_320_50"));
                }
                yoVar.addView(yoVar2, layoutParams3);
                PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(uef.this.ivm, uef.this.moa);
                pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z2) {
                    int iOa = af.oa(uef.this.ivm, 16.0f);
                    layoutParams4.width = af.oa(uef.this.ivm, 77.0f);
                    layoutParams4.height = af.oa(uef.this.ivm, 14.0f);
                    layoutParams4.leftMargin = iOa;
                    layoutParams4.topMargin = iOa;
                } else {
                    int iOa2 = af.oa(uef.this.ivm, 8.0f);
                    layoutParams4.width = af.oa(uef.this.ivm, 45.0f);
                    layoutParams4.height = af.oa(uef.this.ivm, 8.18f);
                    layoutParams4.leftMargin = iOa2;
                    layoutParams4.topMargin = iOa2;
                }
                yoVar2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(uef.this.ivm);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                bccVar.setAlpha(0.5f);
                bccVar.setLines(1);
                bccVar.setText(orq.uef(uef.this.ivm, "tt_ad_is_closed"));
                if (z2) {
                    bccVar.setTextSize(18.0f);
                } else {
                    bccVar.setTextSize(12.0f);
                }
                yoVar2.addView(bccVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.uef(uef.this.ivm, uef.this.moa, uef.this.yo);
                    }
                };
                pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                bccVar.setOnClickListener(onClickListener);
                return yoVar;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zjm() {
        wrv();
    }

    public void bcc() {
        moa moaVar = this.uef;
        if (moaVar instanceof yo) {
            ((yo) moaVar).oa();
        }
    }

    public void cz() {
        moa moaVar = this.uef;
        if (moaVar instanceof yo) {
            ((yo) moaVar).uef();
        }
    }

    public void ivm() {
        this.bs = 1;
        this.uef.moa();
    }

    public void lw() {
        this.xs = System.currentTimeMillis();
    }

    public void moa() {
        oa(this.moa);
        this.xs = 0L;
    }

    public void xs() {
        if (this.uef != null) {
            try {
                ivm();
                this.uef.removeOnAttachStateChangeListener(this.sy);
            } catch (Throwable unused) {
            }
        }
    }

    public com.bytedance.sdk.openadsdk.oib.yo.uef yo() {
        moa moaVar = this.uef;
        if (moaVar instanceof yo) {
            return ((yo) moaVar).getVideoModel();
        }
        return null;
    }

    public boolean oa() {
        return this.uef instanceof yo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(boolean z2, gzw gzwVar) {
        try {
            if (z2) {
                this.xs = System.currentTimeMillis();
            } else {
                if (this.xs <= 0 || this.dj == null) {
                    return;
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.xs);
                this.xs = 0L;
                com.bytedance.sdk.openadsdk.moa.yo.uef(strValueOf, gzwVar, this.yo, this.dj.getAdShowTime());
            }
        } catch (Exception e7) {
            dhk.yo("PAGBannerAdImpl", e7.getMessage());
        }
    }

    public void uef(int i5) {
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.setCurrentIndex(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(gzw gzwVar) {
        if (this.xs <= 0 || gzwVar == null) {
            return;
        }
        try {
            if (this.dj != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.xs);
                this.xs = 0L;
                com.bytedance.sdk.openadsdk.moa.yo.uef(strValueOf, gzwVar, this.yo, this.dj.getAdShowTime());
            }
        } catch (Exception e7) {
            dhk.yo("PAGBannerAdImpl", e7.getMessage());
        }
    }

    public void uef(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        bcc bccVar = new bcc(pAGBannerAdInteractionCallback);
        this.lw = bccVar;
        this.uef.setExpressInteractionListener(bccVar);
    }

    public void uef(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        bcc bccVar = new bcc(pAGBannerAdInteractionListener);
        this.lw = bccVar;
        this.uef.setExpressInteractionListener(bccVar);
    }

    public View uef() {
        com.bytedance.sdk.openadsdk.utils.oa.uef(this.moa);
        IPBroadcastReceiver.oa(this.ivm, this.moa);
        return this.uef;
    }

    private void uef(Context context, gzw gzwVar, AdSlot adSlot) {
        if (gzwVar.nj() != null) {
            yo yoVar = new yo(context, gzwVar, adSlot, this.dz);
            this.uef = yoVar;
            yoVar.addOnAttachStateChangeListener(this.sy);
        } else {
            moa moaVar = new moa(context, gzwVar, adSlot, this.dz);
            this.uef = moaVar;
            moaVar.addOnAttachStateChangeListener(this.sy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(boolean z2, gzw gzwVar) {
        if (z2 && this.moa.vxo() && !this.moa.ue()) {
            this.moa.xs(true);
            gzw gzwVar2 = this.moa;
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar2, this.yo, gzwVar2.lu());
        }
        km.oa(new C0099uef(z2, gzwVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(View view, tpx tpxVar, gzw gzwVar, String str, xs.uef uefVar) throws JSONException {
        zjm.oa().uef(str, uefVar);
        this.xs = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (tpxVar != null) {
                jSONObject.put("dynamic_show_type", tpxVar.getDynamicShowType());
                tpxVar.uef(jSONObject, gzwVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, this.yo, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(gzwVar);
        } catch (JSONException unused2) {
            dhk.yo("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.lw;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, gzwVar.ykf());
        }
        if (gzwVar.zrl()) {
            gb.uef(gzwVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo uef(gzw gzwVar) {
        if (gzwVar.ykf() == 4) {
            return com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this.ivm, this.yo);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final tpx tpxVar, final gzw gzwVar) {
        uef uefVar;
        gzw gzwVar2;
        final tpx tpxVar2;
        com.bytedance.sdk.openadsdk.core.bcc bccVar;
        if (tpxVar == null || gzwVar == null) {
            return;
        }
        this.moa = gzwVar;
        this.zjm = uef(gzwVar);
        this.dj = tpxVar;
        final String strUef = ue.uef();
        final xs.uef uefVarDj = dj();
        tpxVar.setClosedListenerKey(strUef);
        tpxVar.setBannerClickClosedListener(uefVarDj);
        tpxVar.setBackupListener(new com.bytedance.sdk.component.adexpress.oa.yo() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.2
            @Override // com.bytedance.sdk.component.adexpress.oa.yo
            public boolean uef(ViewGroup viewGroup, int i5) {
                try {
                    tpxVar.orq();
                    if (!uef.this.moa.ebe()) {
                        oa oaVar = new oa(tpxVar.getContext());
                        oaVar.setClosedListenerKey(strUef);
                        oaVar.uef(uef.this.moa, tpxVar, uef.this.zjm);
                        oaVar.setAdInteractionListener(uef.this.lw);
                        return true;
                    }
                    cz czVar = new cz(tpxVar.getContext());
                    czVar.setClosedListenerKey(strUef);
                    czVar.uef(uef.this.moa, tpxVar, uef.this.zjm);
                    czVar.setAdInteractionListener(uef.this.lw);
                    tpxVar.setVastVideoHelper(czVar);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.bcc) {
            com.bytedance.sdk.openadsdk.core.bcc bccVarUef = uef(tpxVar);
            if (bccVarUef == null) {
                bccVarUef = new com.bytedance.sdk.openadsdk.core.bcc(this.ivm, tpxVar, this.wrv.uef());
                tpxVar.addView(bccVarUef);
            }
            bccVarUef.setAdType(1);
            tpxVar2 = tpxVar;
            bccVarUef.setCallback(new bcc.uef() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.3
                @Override // com.bytedance.sdk.openadsdk.core.bcc.uef
                public void oa() {
                    uef uefVar2 = uef.this;
                    uefVar2.oa(uefVar2.moa);
                }

                @Override // com.bytedance.sdk.openadsdk.core.bcc.uef
                public void uef(boolean z2) {
                    uef.this.uef(z2, gzwVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.bcc.uef
                public void uef() {
                    if (uef.this.bs != 0) {
                        uef.this.zjm();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.bcc.uef
                public void uef(View view) throws JSONException {
                    if (uef.this.cq.compareAndSet(false, true)) {
                        uef.this.uef(view, tpxVar2, gzwVar, strUef, uefVarDj);
                    }
                    moa moaVar = uef.this.uef;
                    if (moaVar == null || moaVar.getCurView() == null) {
                        return;
                    }
                    uef.this.uef.getCurView().dj();
                    uef.this.uef.getCurView().oib();
                    uef.this.uef.setIsShow(true);
                }
            });
            bccVar = bccVarUef;
            uefVar = this;
            gzwVar2 = gzwVar;
        } else {
            boolean zUef = this.wrv.uef();
            sk.oa oaVar = new sk.oa() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.4
                @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
                public void oa() {
                    uef uefVar2 = uef.this;
                    uefVar2.oa(uefVar2.moa);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
                public void uef(boolean z2) {
                    uef.this.uef(z2, gzwVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
                public void uef() {
                    if (uef.this.bs != 0) {
                        uef.this.zjm();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
                public void uef(View view, boolean z2) throws JSONException {
                    if (!z2) {
                        com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(uef.this.moa, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(uef.this.moa, 4);
                    if (uef.this.cq.compareAndSet(false, true)) {
                        uef.this.uef(view, tpxVar, gzwVar, strUef, uefVarDj);
                    }
                    moa moaVar = uef.this.uef;
                    if (moaVar == null || moaVar.getCurView() == null) {
                        return;
                    }
                    uef.this.uef.getCurView().dj();
                    uef.this.uef.getCurView().oib();
                    uef.this.uef.setIsShow(true);
                }
            };
            uefVar = this;
            gzwVar2 = gzwVar;
            sk.uef(tpxVar, true, 1, zUef, oaVar, null);
            tpxVar2 = tpxVar;
            bccVar = null;
        }
        Context contextUef = com.bytedance.sdk.component.utils.oa.uef(tpxVar2);
        if (contextUef == null) {
            contextUef = uefVar.ivm;
        }
        com.bytedance.sdk.openadsdk.core.zjm.zjm zjmVar = new com.bytedance.sdk.openadsdk.core.zjm.zjm(contextUef, gzwVar2, uefVar.yo, 2);
        zjmVar.oa(tpxVar2);
        zjmVar.uef(this);
        zjmVar.uef(uefVar.zjm);
        zjmVar.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.5
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                if (uef.this.lw != null) {
                    uef.this.lw.onAdClicked();
                }
            }
        });
        tpxVar2.setClickListener(zjmVar);
        com.bytedance.sdk.openadsdk.core.zjm.cz czVar = new com.bytedance.sdk.openadsdk.core.zjm.cz(uefVar.ivm, gzwVar2, uefVar.yo, 2);
        czVar.oa(tpxVar2);
        czVar.uef(this);
        czVar.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.6
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                if (uef.this.lw != null) {
                    uef.this.lw.onAdClicked();
                }
            }
        });
        tpx tpxVar3 = uefVar.dj;
        if (tpxVar3 instanceof com.bytedance.sdk.openadsdk.core.zjm.dhk) {
            czVar.uef(((com.bytedance.sdk.openadsdk.core.zjm.dhk) tpxVar3).getVideoController());
        }
        czVar.uef(uefVar.zjm);
        tpxVar2.setClickCreativeListener(czVar);
        if (uefVar.bcc) {
            return;
        }
        bccVar.setNeedCheckingShow(true);
    }

    private com.bytedance.sdk.openadsdk.core.bcc uef(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            try {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.bcc) {
                    return (com.bytedance.sdk.openadsdk.core.bcc) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void uef(final com.bytedance.sdk.openadsdk.uef.uef.oa oaVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.oib > 500) {
            this.oib = jCurrentTimeMillis;
            moa moaVar = this.uef;
            if (moaVar instanceof yo) {
                moaVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.moa.uef.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((yo) uef.this.uef).uef(oaVar);
                    }
                }, 500L);
            }
        }
    }
}

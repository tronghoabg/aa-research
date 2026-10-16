package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm.ab;
import com.bytedance.sdk.openadsdk.utils.af;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cz {
    private final String bcc;
    private yo cz;
    private boolean dj;
    private final Activity ivm;

    /* renamed from: oa, reason: collision with root package name */
    Handler f25441oa;
    com.bytedance.sdk.openadsdk.tpx.uef.uef.yo uef;
    private final gzw xs;
    private com.bytedance.sdk.openadsdk.component.reward.uef.oa zjm;
    boolean yo = false;
    boolean moa = false;
    boolean lw = false;

    public cz(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.zjm = oaVar;
        this.ivm = oaVar.pu;
        this.xs = oaVar.f25412oa;
        this.bcc = oaVar.lw;
    }

    public void bcc() {
        yo yoVar = this.cz;
        if (yoVar != null) {
            yoVar.wrv();
        }
    }

    public void cq() {
        yo yoVar = this.cz;
        if (yoVar == null) {
            return;
        }
        yoVar.oib();
    }

    public boolean cz() {
        yo yoVar = this.cz;
        if (yoVar == null) {
            return false;
        }
        return yoVar.gzw();
    }

    public int dj() {
        yo yoVar = this.cz;
        if (yoVar != null) {
            return yoVar.getDynamicShowType();
        }
        return 0;
    }

    public void dz() {
        yo yoVar = this.cz;
        if (yoVar == null) {
            return;
        }
        yoVar.tpx();
        this.cz.dj();
    }

    public void ivm() {
        if (this.dj) {
            return;
        }
        this.dj = true;
        yo yoVar = this.cz;
        if (yoVar != null) {
            yoVar.cq();
        }
        Handler handler = this.f25441oa;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public Handler lw() {
        if (this.f25441oa == null) {
            this.f25441oa = new Handler(Looper.getMainLooper());
        }
        return this.f25441oa;
    }

    public boolean moa() {
        return this.moa;
    }

    public FrameLayout oa() {
        yo yoVar = this.cz;
        if (yoVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = yoVar.getVideoFrameLayout();
        if (this.cz.gzw()) {
            wk();
        }
        return videoFrameLayout;
    }

    public void uef(AdSlot adSlot, dhk dhkVar) {
        if (this.lw) {
            return;
        }
        this.lw = true;
        yo yoVar = new yo(this.zjm, adSlot, this.bcc);
        this.cz = yoVar;
        if (dhkVar != null) {
            dhkVar.uef(yoVar, yoVar.getVideoFrameLayout());
        }
    }

    public void wk() {
        if (gzw.lw(this.xs) && this.xs.aos() == 3 && this.xs.bx() == 0) {
            try {
                if (this.xs.cgg() == 1) {
                    int iOa = af.oa(sy.uef(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.cz.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iOa;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean wrv() {
        yo yoVar = this.cz;
        if (yoVar != null) {
            return yoVar.cp instanceof com.bytedance.sdk.component.adexpress.lw.uef;
        }
        return false;
    }

    public void xs() {
        yo yoVar = this.cz;
        if (yoVar != null) {
            yoVar.dj();
        }
    }

    public boolean yo() {
        return this.yo;
    }

    public boolean zjm() {
        yo yoVar = this.cz;
        return yoVar != null && yoVar.rt();
    }

    public void oa(boolean z2) {
        this.moa = z2;
    }

    public yo uef() {
        return this.cz;
    }

    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo oa(gzw gzwVar) {
        if (gzwVar.ykf() == 4) {
            return com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this.ivm, this.bcc);
        }
        return null;
    }

    public void uef(boolean z2) {
        this.yo = z2;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.zjm.zjm zjmVar, com.bytedance.sdk.openadsdk.core.zjm.cz czVar) {
        gzw gzwVar;
        if (this.cz == null || (gzwVar = this.xs) == null) {
            return;
        }
        this.uef = oa(gzwVar);
        zjmVar.oa(this.cz);
        zjmVar.uef(this.uef);
        this.cz.setClickListener(zjmVar);
        czVar.oa(this.cz);
        czVar.uef(this.uef);
        this.cz.setClickCreativeListener(czVar);
    }

    public void uef(ab abVar) {
        yo yoVar = this.cz;
        if (yoVar == null) {
            return;
        }
        yoVar.setExpressVideoListenerProxy(abVar);
    }

    public void uef(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        if (this.cz == null) {
            return;
        }
        this.cz.setExpressInteractionListener(new PAGRewardFullExpressAdListenerProxy(pAGExpressAdWrapperListener));
    }

    public JSONObject uef(JSONObject jSONObject) {
        yo yoVar = this.cz;
        if (yoVar != null) {
            return yoVar.uef(jSONObject, this.zjm.f25412oa);
        }
        return null;
    }

    public void uef(int i5, boolean z2) {
        yo yoVar = this.cz;
        if (yoVar != null) {
            yoVar.uef(i5, z2, false);
        }
    }

    public void uef(int i5, String str) {
        yo yoVar = this.cz;
        if (yoVar != null) {
            yoVar.oa(i5, str);
        }
    }

    public void uef(gzw gzwVar) {
        yo yoVar = this.cz;
        if (yoVar != null) {
            yoVar.uef(gzwVar, gzwVar.cl(), gzwVar.lw(), this.zjm.gem, !r1.vjj);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.zjm = oaVar;
    }
}

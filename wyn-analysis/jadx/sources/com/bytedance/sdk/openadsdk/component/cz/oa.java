package com.bytedance.sdk.openadsdk.component.cz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.adexpress.oa.cq;
import com.bytedance.sdk.component.adexpress.oa.dz;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm.ab;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.core.zjm.ue;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa extends tpx {
    private com.bytedance.sdk.openadsdk.component.bcc.yo bcc;
    private FrameLayout dxx;
    private com.bytedance.sdk.openadsdk.component.ivm.uef fz;
    private final com.bytedance.sdk.openadsdk.component.ivm.oa ivm;
    private final com.bytedance.sdk.openadsdk.component.uef lw;
    private yo.uef lz;
    float moa;

    /* renamed from: oa, reason: collision with root package name */
    boolean f25328oa;
    boolean uef;
    private final com.bytedance.sdk.openadsdk.component.bcc.uef xs;
    int yo;

    public oa(Context context, gzw gzwVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.uef uefVar, com.bytedance.sdk.openadsdk.component.ivm.oa oaVar, com.bytedance.sdk.openadsdk.component.bcc.uef uefVar2) {
        super(context, gzwVar, adSlot, str, true, true);
        this.uef = true;
        this.f25328oa = false;
        this.yo = 0;
        this.moa = 1.0f;
        this.lw = uefVar;
        this.ivm = oaVar;
        this.xs = uefVar2;
        if (gzwVar == null || gzwVar.bbb() == null) {
            return;
        }
        this.yo = gzwVar.bbb().oa();
        this.moa = gzwVar.bbb().uef();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(dz dzVar) {
        if (dzVar == null) {
            return;
        }
        if (dzVar.uef() != null) {
            if (this.uef) {
                dzVar.uef().setTag(com.bytedance.sdk.component.adexpress.dynamic.uef.ivm, 1);
                ((FrameLayout) dzVar.uef()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) dzVar.uef();
                this.dxx = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.uef = false;
                return;
            }
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
            if ((this.cp.yo() == 7 || this.cp.yo() == 10 || (this.cp instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa)) && (dzVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.oa)) {
                FrameLayout frameLayoutAb = ((com.bytedance.sdk.openadsdk.core.cq.ivm.oa) dzVar).ab();
                if (frameLayoutAb != null) {
                    if (this.dxx.getParent() != null) {
                        ((ViewGroup) this.dxx.getParent()).removeView(this.dxx);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutAb.addView(this.dxx, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.dxx.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iOa3, iOa4);
            }
            layoutParams2.width = iOa3;
            layoutParams2.height = iOa4;
            layoutParams2.topMargin = iOa2;
            layoutParams2.leftMargin = iOa;
            layoutParams2.setMarginStart(iOa);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.dxx.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public int getDynamicShowType() {
        if (this.cp == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.xs.uef.uef(this.wrv, sy.moa().xs(String.valueOf(this.wrv.jnk())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.dxx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void ivm() {
        com.bytedance.sdk.openadsdk.component.ivm.uef uefVar = this.fz;
        if (uefVar != null) {
            uefVar.oa(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public int lw() {
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVar = this.bcc;
        if (yoVar != null && yoVar.xs()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVar2 = this.bcc;
        if (yoVar2 != null && yoVar2.ivm()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVar3 = this.bcc;
        if (yoVar3 != null && yoVar3.lw()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVar4 = this.bcc;
        if (yoVar4 == null || !yoVar4.yo()) {
            com.bytedance.sdk.openadsdk.component.bcc.yo yoVar5 = this.bcc;
            return (yoVar5 == null || !yoVar5.moa()) ? 3 : 5;
        }
        xs(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public long moa() {
        return this.xs.yo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void oa() {
        super.oa();
    }

    public void setExpressVideoListenerProxy(yo.uef uefVar) {
        this.lz = uefVar;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.ivm.uef uefVar) {
        this.fz = uefVar;
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.bcc.yo yoVar) {
        this.bcc = yoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void xs() {
        this.wk = true;
        this.dxx = new FrameLayout(this.cz);
        if (!com.bytedance.sdk.openadsdk.core.cq.lw.uef(this.wrv) && !com.bytedance.sdk.openadsdk.core.cq.lw.oa(this.wrv)) {
            addView(this.dxx, new FrameLayout.LayoutParams(-1, -1));
        }
        super.xs();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.cq.bcc() { // from class: com.bytedance.sdk.openadsdk.component.cz.oa.1
            @Override // com.bytedance.sdk.openadsdk.cq.bcc
            public void uef(dz dzVar) {
                oa.this.uef(dzVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.oa.wk
    public void uef(com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar, dz dzVar) {
        this.cp = moaVar;
        if (moaVar instanceof ue) {
            ue ueVar = (ue) moaVar;
            if (ueVar.tpx() != null) {
                ueVar.tpx().uef((ab) this);
            }
        }
        if (dzVar != null && dzVar.oa()) {
            uef(dzVar);
        }
        super.uef(moaVar, dzVar);
    }

    public void uef(final dz dzVar) {
        if (dzVar == null) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.cz.oa.2
            @Override // java.lang.Runnable
            public void run() {
                oa.this.yo(dzVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef() {
        com.bytedance.sdk.openadsdk.component.ivm.uef uefVar = this.fz;
        if (uefVar != null) {
            uefVar.uef(this);
        }
    }

    public void uef(long j8, long j10) {
        com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar = this.cp;
        if (moaVar instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.moa) {
            ((com.bytedance.sdk.openadsdk.core.cq.ivm.moa) moaVar).uef(j8, j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public boolean uef(JSONObject jSONObject) {
        gzw gzwVar;
        if (jSONObject == null) {
            this.f25328oa = false;
            return false;
        }
        int i5 = this.yo;
        if (i5 != 1 && i5 != 2) {
            this.f25328oa = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.moa = fOptDouble;
        if (fOptDouble <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (gzwVar = this.wrv) != null && gzwVar.bbb() != null) {
            this.moa = this.wrv.bbb().uef();
        }
        boolean z2 = iOptInt == 1;
        this.f25328oa = z2;
        com.bytedance.sdk.openadsdk.component.ivm.oa oaVar = this.ivm;
        if (oaVar != null) {
            oaVar.uef(this.yo, this.moa, z2);
            com.bytedance.sdk.openadsdk.component.bcc.yo yoVar = this.bcc;
            if (yoVar != null && yoVar.oa() != null && this.xs != null) {
                this.bcc.oa().uef(this.xs.uef());
                dhk.uef("PAGAppOpenAdExpressView", "isAccelerate =" + this.f25328oa + ",total duration = " + this.bcc.oa().bs());
            }
        }
        if (this.yo == 1) {
            return true;
        }
        if (!this.f25328oa) {
            this.moa = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVar2 = this.bcc;
        if (yoVar2 != null) {
            return yoVar2.uef(this.moa);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5) {
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVar = this.bcc;
        if (yoVar == null) {
            return;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                yoVar.bcc();
                this.ivm.moa();
                return;
            } else if (i5 == 3) {
                yoVar.cz();
                this.ivm.yo();
                return;
            } else if (i5 == 4) {
                yoVar.zjm();
                return;
            } else if (i5 != 5) {
                return;
            }
        }
        if (yoVar.lw() || this.bcc.ivm()) {
            return;
        }
        this.bcc.uef(getVideoFrameLayout(), this.lw, this.wrv);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public long yo() {
        return this.xs.yo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void yo(JSONObject jSONObject) throws JSONException {
        gzw gzwVar = this.wrv;
        boolean z2 = gzwVar != null && gzwVar.ix() == 0;
        gzw gzwVar2 = this.wrv;
        com.bytedance.sdk.openadsdk.component.xs.uef.uef(jSONObject, gzwVar2 != null ? gzwVar2.jnk() : 0, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.oa.bcc
    public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
        if (i5 != -1 && yoVar != null && i5 == 3) {
            ivm();
        } else {
            super.uef(view, i5, yoVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void uef(cq.uef uefVar) {
        uefVar.lw(com.bytedance.sdk.openadsdk.component.xs.uef.uef());
    }
}

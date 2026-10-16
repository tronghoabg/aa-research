package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.oa;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class xs {

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25435oa;
    private oa uef;

    public xs(oa oaVar) {
        this.uef = oaVar;
    }

    private void oa() {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        oa oaVar = this.uef;
        Activity activity = oaVar.pu;
        gzw gzwVar = oaVar.f25412oa;
        String str = oaVar.lw;
        com.bytedance.sdk.openadsdk.core.zjm.zjm zjmVar = new com.bytedance.sdk.openadsdk.core.zjm.zjm(activity, gzwVar, str, gb.uef(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.xs.3
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
                super.uef(view, f10, f11, f12, f13, sparseArray, z2);
            }
        };
        zjmVar.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.xs.4
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                xs.this.uef.gb.lz();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        oa oaVar2 = this.uef;
        if (oaVar2.vjj && (bccVar = oaVar2.sw) != null) {
            int i5 = bccVar.dj + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i5);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        zjmVar.uef(map);
        oa oaVar3 = this.uef;
        Activity activity2 = oaVar3.pu;
        gzw gzwVar2 = oaVar3.f25412oa;
        String str2 = oaVar3.lw;
        com.bytedance.sdk.openadsdk.core.zjm.cz czVar = new com.bytedance.sdk.openadsdk.core.zjm.cz(activity2, gzwVar2, str2, gb.uef(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.xs.5
            @Override // com.bytedance.sdk.openadsdk.core.yo.uef, com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(xs.this.uef.tpx.cq()));
                if (xs.this.uef.sw != null) {
                    xs.this.uef.sw.uef(map2, f10, f11);
                }
                uef(map2);
                super.uef(view, f10, f11, f12, f13, sparseArray, z2);
                xs.this.uef.tpx.swd();
            }
        };
        czVar.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.xs.6
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i10) {
                xs.this.uef.gb.lz();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        czVar.uef(map2);
        this.uef.gsd.uef(zjmVar, czVar);
    }

    public void uef(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar;
        this.f25435oa = true;
        Arrays.toString(fArr);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.uef.f25412oa.jnk())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        oa oaVar = this.uef;
        oaVar.gsd.uef(adSlotBuild, oaVar.oyt.wk);
        oa oaVar2 = this.uef;
        cq cqVar = oaVar2.dxx;
        if (cqVar != null && (czVar = oaVar2.gsd) != null) {
            cqVar.uef(czVar.uef());
        }
        this.uef.gsd.uef(new com.bytedance.sdk.openadsdk.core.zjm.ab() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.xs.1
            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void ivm() {
                xs.this.uef.pz.uef(xs.this.uef.f25410hg);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public int lw() {
                if (xs.this.uef.gsd.yo()) {
                    return 4;
                }
                if (xs.this.uef.gsd.moa()) {
                    return 5;
                }
                if (xs.this.uef.tpx.zjm()) {
                    return 1;
                }
                if (xs.this.uef.tpx.ivm()) {
                    return 2;
                }
                xs.this.uef.tpx.cz();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public long moa() {
                return xs.this.uef.tpx.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public boolean oa(JSONObject jSONObject) {
                return com.bytedance.sdk.openadsdk.component.reward.oa.uef(xs.this.uef);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void uef(boolean z2, String str) {
                if (xs.this.uef.gem != z2) {
                    xs.this.uef.dxx.uef(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public long yo() {
                return xs.this.uef.tpx.dz();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void oa() {
                if (xs.this.uef.oyt == null || xs.this.uef.oyt.zjm() == null) {
                    return;
                }
                xs.this.uef.oyt.zjm().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void uef() {
                xs.this.uef.dxx.moa();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void oa(int i5) {
                xs.this.uef.au = i5;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void uef(String str, JSONObject jSONObject) {
                if (xs.this.uef == null || xs.this.uef.gb == null) {
                    return;
                }
                xs.this.uef.gb.uef(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public boolean uef(JSONObject jSONObject) {
                if (xs.this.uef == null || xs.this.uef.tpx == null) {
                    return false;
                }
                return xs.this.uef.tpx.uef(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void uef(int i5) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        xs.this.uef.tpx.km();
                        return;
                    }
                    if (i5 == 3) {
                        xs.this.uef.tpx.uef(xs.this.uef.gb);
                        return;
                    } else if (i5 == 4) {
                        xs.this.uef.tpx.oib();
                        return;
                    } else if (i5 != 5) {
                        return;
                    }
                }
                if (xs.this.uef.tpx.ivm() || xs.this.uef.tpx.cz()) {
                    return;
                }
                xs.this.uef.gb.uef(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void uef(int i5, String str) {
                xs.this.uef.tpx.uef(i5, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
            public void uef(int i5, com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
                xs.this.uef.oyt.uef(i5, dzVar);
            }
        });
        this.uef.gsd.uef(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.xs.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (xs.this.uef == null || xs.this.uef.f25412oa == null || !xs.this.uef.f25412oa.tv()) {
                    return;
                }
                xs.this.uef.gb.lz();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i5) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i5) {
                boolean z2 = -1024 == i5;
                xs.this.uef.uef(i5, str, z2 ? BackupConstant.SCENE_BACKUP_RENDER_FAIL : 1001);
                xs.this.uef.gr.uef();
                if (z2) {
                    return;
                }
                if (!xs.this.uef.f25412oa.ib()) {
                    xs.this.uef.ku.uef(true);
                    xs.this.uef.ku.lw();
                }
                xs.this.uef.gsd.lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.xs.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xs.this.uef.f25410hg.uef(false, false, false, 90);
                    }
                });
                xs.this.uef.oyt.cq();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                dhk dhkVar;
                if (!xs.this.uef.f25412oa.ib()) {
                    if (xs.this.uef.gsd.cz()) {
                        xs.this.uef.f25410hg.uef(true);
                        xs.this.uef.tpx.moa(false);
                    } else {
                        xs.this.uef.tpx.moa(true);
                    }
                    xs.this.uef.oyt.uef(8);
                    xs.this.uef.ku.uef(true);
                    xs.this.uef.ku.lw();
                    if (xs.this.uef.gsd.cz()) {
                        xs.this.uef.gsd.oa().setBackgroundColor(-16777216);
                        xs.this.uef.f25410hg.uef(xs.this.uef.oyt.ivm());
                    } else if (xs.this.uef.f25412oa.nj() != null && xs.this.uef.f25410hg.uef()) {
                        xs.this.uef.dor = true;
                    }
                }
                xs.this.uef.f25410hg.gzw();
                if (dhk.yo(xs.this.uef.f25412oa) && (dhkVar = xs.this.uef.oyt.wk) != null) {
                    dhkVar.yo();
                }
                xs.this.uef.oyt.cq();
            }
        });
        oa();
        FrameLayout.LayoutParams layoutParams = (this.uef.f25412oa.ib() || com.bytedance.sdk.openadsdk.core.cq.lw.uef(this.uef.f25412oa.ix()) || dhk.yo(this.uef.f25412oa)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.uef.oyt.ivm().addView(this.uef.gsd.uef(), layoutParams);
        if (!this.uef.gsd.cz()) {
            this.uef.f25410hg.uef(false);
        }
        this.uef.gsd.dz();
    }

    public void uef(gzw gzwVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.uef.gsd;
        if (czVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.view.yo yoVarUef = czVar.uef();
            ViewParent parent = yoVarUef.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(yoVarUef);
            }
            this.uef.oyt.ivm().addView(yoVarUef);
            if (!this.uef.gsd.cz()) {
                this.uef.f25410hg.uef(false);
            }
            this.uef.gsd.uef(gzwVar);
            oa();
        }
    }

    public boolean uef() {
        return this.f25435oa;
    }

    public void uef(oa oaVar) {
        this.uef = oaVar;
    }
}

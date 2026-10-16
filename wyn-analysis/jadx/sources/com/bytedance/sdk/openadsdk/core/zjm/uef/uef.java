package com.bytedance.sdk.openadsdk.core.zjm.uef;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.oa;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.core.zjm.cz;
import com.bytedance.sdk.openadsdk.core.zjm.gsd;
import com.bytedance.sdk.openadsdk.core.zjm.lw;
import com.bytedance.sdk.openadsdk.core.zjm.zjm;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class uef {
    protected Context bcc;
    protected AdSlot cz;
    private PAGExpressAdWrapperListener dj;
    protected float ivm;
    protected float lw;
    protected String moa;

    /* renamed from: oa, reason: collision with root package name */
    protected gzw f25874oa;
    protected gsd uef;
    private com.bytedance.sdk.openadsdk.component.reward.yo.oa wrv;
    protected Activity xs;
    protected ViewGroup yo;
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo zjm;

    public uef(ViewGroup viewGroup, gzw gzwVar, String str, Activity activity, Context context, com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar) {
        this.yo = viewGroup;
        this.f25874oa = gzwVar;
        this.moa = str;
        this.xs = activity;
        this.bcc = context;
        this.wrv = oaVar;
    }

    public void ivm() {
        gsd gsdVar = this.uef;
        if (gsdVar != null) {
            gsdVar.cq();
        }
    }

    public void lw() {
        gsd gsdVar = this.uef;
        if (gsdVar != null) {
            gsdVar.dj();
        }
    }

    public void moa() {
        gsd gsdVar = this.uef;
        if (gsdVar != null) {
            gsdVar.wrv();
        }
    }

    public gsd oa() {
        return this.uef;
    }

    public void yo() {
        Activity activity = this.xs;
        gzw gzwVar = this.f25874oa;
        String str = this.moa;
        zjm zjmVar = new zjm(activity, gzwVar, str, gb.uef(str));
        zjmVar.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.zjm.uef.uef.1
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                uef.this.wrv.cz();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        zjmVar.uef(map);
        Activity activity2 = this.xs;
        gzw gzwVar2 = this.f25874oa;
        String str2 = this.moa;
        cz czVar = new cz(activity2, gzwVar2, str2, gb.uef(str2)) { // from class: com.bytedance.sdk.openadsdk.core.zjm.uef.uef.2
            @Override // com.bytedance.sdk.openadsdk.core.yo.uef, com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
                super.uef(view, f10, f11, f12, f13, sparseArray, z2);
            }
        };
        czVar.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.zjm.uef.uef.3
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                uef.this.wrv.cz();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        czVar.uef(map2);
        uef(zjmVar, czVar);
    }

    public void uef(float[] fArr) {
        if (fArr == null || fArr.length != 2) {
            return;
        }
        uef(fArr[0], fArr[1]);
    }

    public void uef(float f10, float f11) {
        this.lw = f10;
        this.ivm = f11;
        this.cz = new AdSlot.Builder().setCodeId(String.valueOf(this.f25874oa.jnk())).setExpressViewAcceptedSize(this.lw, this.ivm).build();
        gsd gsdVar = new gsd(this.xs, this.bcc, this.f25874oa, this.cz, this.moa);
        this.uef = gsdVar;
        gsdVar.setExpressInteractionListener(this.dj);
        yo();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.yo.addView(this.uef, layoutParams);
        this.uef.tpx();
        this.uef.dj();
    }

    public void uef(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.dj = pAGExpressAdWrapperListener;
    }

    public void uef(lw lwVar) {
        this.uef.setDislikeClickListener(lwVar);
    }

    public void uef(zjm zjmVar, cz czVar) {
        gzw gzwVar;
        if (this.uef == null || (gzwVar = this.f25874oa) == null) {
            return;
        }
        this.zjm = uef(gzwVar);
        zjmVar.oa(this.uef);
        zjmVar.uef(this.zjm);
        this.uef.setClickListener(zjmVar);
        czVar.oa(this.uef);
        czVar.uef(this.zjm);
        this.uef.setClickCreativeListener(czVar);
    }

    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo uef(gzw gzwVar) {
        if (gzwVar.ykf() == 4) {
            return com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this.xs, this.moa);
        }
        return null;
    }
}

package com.bytedance.sdk.openadsdk.component.reward.oa;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.component.reward.view.bcc;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.sy;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class xs extends oa {

    /* renamed from: ab, reason: collision with root package name */
    private String f25385ab;
    private final int cq;
    private ViewGroup dz;
    private com.bytedance.sdk.openadsdk.component.reward.view.ivm wk;

    public xs(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        super(oaVar);
        this.f25385ab = "fullscreen_interstitial_ad";
        this.cq = this.f25384oa.hw();
    }

    private void cp() {
        sy syVar;
        List<sy> listLpy = this.f25384oa.lpy();
        if (listLpy == null || listLpy.size() <= 0 || (syVar = listLpy.get(0)) == null) {
            return;
        }
        try {
            int iOa = syVar.oa();
            int iYo = syVar.yo();
            if (iOa != 0 && iYo != 0) {
                this.wk.setRatio(iOa / iYo);
                return;
            }
            int i5 = this.cq;
            if (i5 == 33) {
                this.wk.setRatio(1.0f);
            } else if (i5 == 3) {
                this.wk.setRatio(1.91f);
            } else {
                this.wk.setRatio(0.56f);
            }
        } catch (Exception e7) {
            dhk.yo("TTAD.RFTI", e7.getMessage());
        }
    }

    private boolean ku() {
        gzw gzwVar = this.f25384oa;
        return gzwVar != null && gzwVar.ggp() == 2;
    }

    private void oa(gzw gzwVar) {
        if (gzwVar == null || this.wk == null) {
            return;
        }
        cp();
        uef((ImageView) this.wk);
    }

    private void pz() {
        if (this.dz == null) {
            return;
        }
        uef((View) this.wk);
    }

    private void ue() {
        FrameLayout frameLayout = new FrameLayout(this.uef.pu);
        this.dz = frameLayout;
        frameLayout.setId(bs.cuu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.dz.setLayoutParams(layoutParams);
        View viewDj = this.uef.oyt.dj();
        if (viewDj != null) {
            layoutParams.bottomMargin = viewDj.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.ivm ivmVar = new com.bytedance.sdk.openadsdk.component.reward.view.ivm(this.uef.pu);
        this.wk = ivmVar;
        ivmVar.setId(bs.jp);
        FrameLayout.LayoutParams layoutParams2 = this.uef.f25412oa.cgg() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        this.wk.setLayoutParams(layoutParams2);
        this.dz.addView(this.wk);
        pz();
    }

    private void uef(ImageView imageView) {
        List<sy> listLpy;
        sy syVar;
        gzw gzwVar = this.f25384oa;
        if (gzwVar == null || (listLpy = gzwVar.lpy()) == null || listLpy.size() <= 0 || (syVar = listLpy.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zjm.moa.uef(listLpy.get(0)).yo(1).uef(com.bytedance.sdk.openadsdk.zjm.yo.uef(this.f25384oa, syVar.uef(), imageView));
    }

    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yo(gzw gzwVar) {
        if (gzwVar.ykf() == 4) {
            return new com.bytedance.sdk.openadsdk.tpx.uef.uef.oa(com.bytedance.sdk.openadsdk.core.sy.uef(), this.f25385ab);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void ivm() {
        if (com.bytedance.sdk.openadsdk.core.model.dhk.oa(this.f25384oa)) {
            this.ivm.oa(8);
        }
        this.bcc.yo(false);
        this.bcc.moa(false);
        if (this.f25384oa.ggp() == 2) {
            this.bcc.uef(false);
            this.ivm.ivm(8);
            return;
        }
        this.bcc.uef(this.f25384oa.lox());
        if (this.uef.ou) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
            int iGb = (int) (oaVar.tpx.gb() * 1000.0d);
            oaVar.bcc = iGb;
            messageObtain.arg1 = iGb;
            this.uef.sk.sendMessage(messageObtain);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public boolean lw() {
        return ku();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public boolean moa() {
        return ku();
    }

    public void uef(View view) {
        if (view == null || this.uef.pu == null || this.f25384oa == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar = this.dj;
        if (uefVar == null) {
            Activity activity = this.uef.pu;
            gzw gzwVar = this.f25384oa;
            String str = this.f25385ab;
            uefVar = new com.bytedance.sdk.openadsdk.core.yo.uef(activity, gzwVar, str, gb.uef(str));
            uefVar.uef(yo(this.f25384oa));
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            uefVar.uef(map);
        }
        Activity activity2 = this.uef.pu;
        if (activity2 != null) {
            uefVar.uef(activity2);
        }
        view.setOnTouchListener(uefVar);
        view.setOnClickListener(uefVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void uef(FrameLayout frameLayout) {
        try {
            ue();
            oa(this.f25384oa);
            frameLayout.addView(this.dz);
        } catch (Exception e7) {
            Log.e("TTAD.RFTI", "bindAd: ", e7);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void uef(bcc bccVar) {
        if (com.bytedance.sdk.openadsdk.core.model.dhk.oa(this.f25384oa)) {
            moa.uef(bccVar, this.f25384oa);
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
            oaVar.hnk.uef((long) (oaVar.tpx.gb() * 1000.0d));
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.dhk.moa(this.f25384oa) && !com.bytedance.sdk.openadsdk.core.model.dhk.xs(this.f25384oa)) {
                super.uef(bccVar);
                return;
            }
            moa.oa(bccVar, this.f25384oa);
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.uef;
            if (oaVar2.vjj) {
                return;
            }
            oaVar2.hnk.uef((long) (oaVar2.tpx.gb() * 1000.0d));
        }
    }

    public static boolean uef(gzw gzwVar) {
        return !gzw.lw(gzwVar) && gzwVar.gze() == 100.0f;
    }
}

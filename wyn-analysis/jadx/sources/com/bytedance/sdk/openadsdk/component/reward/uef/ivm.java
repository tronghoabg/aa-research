package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.moa.oa;
import com.bytedance.sdk.openadsdk.utils.gsd;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm {

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.view.xs f25404oa;
    private final oa uef;
    private uef yo;

    public interface uef {
        void uef(boolean z2, boolean z10, boolean z11, com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar, int i5);
    }

    public ivm(oa oaVar) {
        this.uef = oaVar;
        this.f25404oa = new com.bytedance.sdk.openadsdk.component.reward.view.xs(oaVar);
    }

    private int ivm() {
        gzw gzwVar;
        oa oaVar = this.uef;
        if (oaVar != null && (gzwVar = oaVar.f25412oa) != null) {
            int iUz = gzwVar.uz();
            if (com.bytedance.sdk.openadsdk.core.sy.moa() == null) {
                return -1;
            }
            int iUef = com.bytedance.sdk.openadsdk.core.sy.moa().uef(this.uef.f25412oa.jnk());
            if (!uef(iUz) && !uef(iUef)) {
                return Math.min(oa(iUz), oa(iUef));
            }
        }
        return -1;
    }

    private boolean uef(int i5) {
        return i5 < 0 || i5 > 20000;
    }

    public boolean lw() {
        return this.f25404oa.lw();
    }

    public void moa() {
        uef(true);
    }

    public void oa() {
        this.f25404oa.yo();
    }

    public void yo() {
        this.f25404oa.moa();
    }

    public boolean oa(com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar) {
        boolean z2;
        this.uef.xs = ivm();
        oa oaVar2 = this.uef;
        int i5 = oaVar2.xs;
        if (oaVar2.f25412oa.dhk()) {
            return false;
        }
        oa oaVar3 = this.uef;
        int i10 = oaVar3.xs;
        if (i10 != -1) {
            if (i10 >= 0) {
                oaVar3.sy.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                oa oaVar4 = this.uef;
                messageObtain.arg1 = oaVar4.xs;
                oaVar4.sk.sendMessage(messageObtain);
                if (!cp.xs(this.uef.f25412oa)) {
                    z2 = true;
                }
            }
            z2 = false;
        } else if (oaVar3.sw == null && cp.bcc(oaVar3.f25412oa) && this.uef.ku.cq()) {
            oaVar.tpx();
            z2 = false;
        } else {
            oaVar.cq();
            z2 = true;
        }
        if (this.uef.ku.dhk() ? false : z2) {
            oa oaVar5 = this.uef;
            if (oaVar5.hnk == null || !oaVar5.xs()) {
                return true;
            }
            this.uef.hnk.uef(r6.xs);
        }
        return true;
    }

    public void uef() {
        this.f25404oa.uef();
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.lw lwVar) {
        this.f25404oa.uef(lwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(boolean r11, boolean r12, boolean r13, com.bytedance.sdk.openadsdk.component.reward.oa.oa r14, int r15) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.uef.ivm.uef(boolean, boolean, boolean, com.bytedance.sdk.openadsdk.component.reward.oa.oa, int):void");
    }

    private int oa(int i5) {
        if (i5 <= 1000) {
            return 1000;
        }
        return (i5 / 1000) * 1000;
    }

    private boolean oa(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.view.yo yoVarUef;
        if (!dhk.yo(this.uef.f25412oa) || (yoVarUef = this.uef.gsd.uef()) == null || yoVarUef.moa != 0 || z2) {
            return true;
        }
        this.uef.dxx.yo(false);
        return false;
    }

    private void uef(boolean z2, boolean z10, boolean z11, int i5) {
        int i10;
        HashMap map = new HashMap();
        if (this.uef.ku.ue()) {
            i10 = 1;
        } else {
            i10 = !this.uef.ku.dz() ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i10));
        oa oaVar = this.uef;
        com.bytedance.sdk.openadsdk.moa.yo.uef(oaVar.f25412oa, oaVar.lw, z2, z10, z11, oaVar.pu.isFinishing(), i5, map);
    }

    public void uef(boolean z2, com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar) throws JSONException {
        dz dzVar;
        this.uef.wk.set(z2);
        oaVar.wrv();
        this.uef.f25412oa.ebe();
        this.uef.dxx.moa(false);
        this.uef.dxx.yo(false);
        this.uef.ku.gzw();
        dhk dhkVar = this.uef.oyt.wk;
        if (dhkVar != null) {
            dhkVar.lw();
        }
        this.uef.oyt.yo();
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.uef.gsd;
        if (czVar != null) {
            czVar.ivm();
        }
        cz czVar2 = this.uef.gzw;
        if (czVar2 != null) {
            czVar2.yo(cz.f25398oa);
        }
        oa oaVar2 = this.uef;
        if (!TextUtils.isEmpty(gzw.uef(oaVar2.af, oaVar2.f25412oa))) {
            oa oaVar3 = this.uef;
            gsd.uef(oaVar3.pu, cp.wrv(oaVar3.f25412oa), this.uef.f25412oa, oa.uef.yo, true);
            return;
        }
        if (gzw.yo(this.uef.f25412oa) && (dzVar = this.uef.fz) != null) {
            dzVar.ivm();
        }
        if (!gzw.uef(this.uef.f25412oa) && (gzw.yo(this.uef.f25412oa) || !this.uef.ku.cp())) {
            oa oaVar4 = this.uef;
            if (gzw.uef(oaVar4.f25412oa, oaVar4.ku.ue(), this.uef.ku.dxx(), this.uef.fz.wrv(), this.uef.ku.gsd())) {
                if (!gzw.moa(this.uef.f25412oa) && !gzw.yo(this.uef.f25412oa)) {
                    this.uef.ku.uef(true, 0, (String) null);
                }
                oa(oaVar);
                uef(oaVar);
                return;
            }
        }
        moa();
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar) throws JSONException {
        if (!gzw.yo(this.uef.f25412oa)) {
            this.uef.fz.uef(8);
            this.uef.ku.uef(0);
            this.uef.ku.ku();
        } else {
            this.uef.ku.uef(8);
            this.uef.fz.uef(0);
            this.uef.fz.xs();
        }
        this.uef.oyt.moa(8);
        this.uef.oyt.xs();
        if (gzw.yo(this.uef.f25412oa)) {
            this.uef.sk.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        oa oaVar2 = this.uef;
        oaVar2.ku.uef(oaVar2.gem, true);
        this.uef.ku.yo(true);
        this.uef.ku.oa(true);
        oyt oytVarCz = this.uef.ku.cz();
        if (oytVarCz != null) {
            oytVarCz.uef("prerender_page_show", (JSONObject) null);
        }
        if (!cp.oa(this.uef.f25412oa)) {
            this.uef.dxx.yo(false);
        }
        com.bytedance.sdk.component.cz.ivm ivmVarBcc = this.uef.ku.bcc();
        if (ivmVarBcc == null || ivmVarBcc.getWebView() == null) {
            return;
        }
        ivmVarBcc.cq();
        ivmVarBcc.getWebView().resumeTimers();
    }

    public void uef(boolean z2) {
        if (!gzw.moa(this.uef.f25412oa)) {
            this.uef.ku.uef(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.uef.ku.oa(com.bytedance.sdk.openadsdk.core.cq.ivm.uef.yo.uef() ? 1 : 0);
        this.uef.ku.uef(8);
        this.uef.fz.uef(8);
        this.uef.oyt.moa(8);
        if (this.uef.f25412oa.ebe()) {
            if (!this.f25404oa.uef(this.uef.tpx)) {
                this.uef.pu.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = this.uef.sw;
            if (bccVar != null) {
                this.f25404oa.uef(bccVar.sk().zjm());
            }
            this.f25404oa.oa();
        }
        this.uef.oyt.xs();
        if (z2) {
            oa(this.uef.f25410hg);
        }
        this.uef.dxx.yo(false);
        oa oaVar = this.uef;
        oaVar.gr.uef(oaVar.f25412oa.nyn());
    }

    public void uef(uef uefVar) {
        this.yo = uefVar;
    }
}

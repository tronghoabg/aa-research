package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.cq.yo.moa;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.pu;
import com.bytedance.sdk.openadsdk.core.ue;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class sy implements moa.uef, com.bytedance.sdk.openadsdk.core.cq.yo.uef, ue, com.bytedance.sdk.openadsdk.core.zjm.ab {
    private int bcc;
    private boolean dj;
    private oyt ivm;
    private final com.bytedance.sdk.openadsdk.core.yo.uef lw;
    private final com.bytedance.sdk.openadsdk.core.ivm.yo moa;

    /* renamed from: oa, reason: collision with root package name */
    private final uef f25768oa;
    private final com.bytedance.sdk.openadsdk.component.reward.uef.oa uef;
    private final com.bytedance.sdk.openadsdk.core.cq.yo.oa yo;
    private boolean zjm;
    private int xs = 0;
    private int cz = 1;

    public interface uef {
        void ivm();

        void lw();

        int moa();

        void oa();

        void uef();

        void yo();
    }

    public sy(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, uef uefVar) {
        this.uef = oaVar;
        this.f25768oa = uefVar;
        this.moa = new com.bytedance.sdk.openadsdk.core.ivm.yo(oaVar.pu) { // from class: com.bytedance.sdk.openadsdk.core.widget.sy.1
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z2) {
                super.onWindowFocusChanged(z2);
                sy.this.uef(z2);
            }
        };
        com.bytedance.sdk.openadsdk.core.cq.yo.oa oaVar2 = new com.bytedance.sdk.openadsdk.core.cq.yo.oa(oaVar.af, oaVar.f25412oa, true);
        this.yo = oaVar2;
        oaVar2.uef((com.bytedance.sdk.openadsdk.core.zjm.ab) this);
        oaVar2.uef((com.bytedance.sdk.openadsdk.core.cq.yo.uef) this);
        com.bytedance.sdk.openadsdk.core.cq.yo.yo yoVarUef = oaVar2.uef();
        if (yoVarUef instanceof com.bytedance.sdk.openadsdk.core.cq.yo.moa) {
            com.bytedance.sdk.openadsdk.core.cq.yo.moa moaVar = (com.bytedance.sdk.openadsdk.core.cq.yo.moa) yoVarUef;
            moaVar.uef((moa.uef) this);
            oyt oytVarLw = moaVar.lw();
            this.ivm = oytVarLw;
            if (oytVarLw != null) {
                oytVarLw.uef((ue) this);
                this.ivm.oa(oaVar.f25412oa.lw());
            }
        }
        Context context = oaVar.af;
        gzw gzwVar = oaVar.f25412oa;
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar2 = new com.bytedance.sdk.openadsdk.core.yo.uef(context, gzwVar, gzwVar.lw(), gb.oa(oaVar.f25412oa));
        this.lw = uefVar2;
        uefVar2.uef(com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), oaVar.f25412oa.lw()));
        HashMap map = new HashMap();
        if (cp.oa(oaVar.f25412oa)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        uefVar2.uef(map);
    }

    private boolean dj() {
        return this.moa.isAttachedToWindow() && this.moa.getVisibility() == 0;
    }

    private void wrv() {
        this.moa.setVisibility(8);
    }

    private void zjm() throws JSONException {
        this.xs++;
        uef uefVar = this.f25768oa;
        if (uefVar != null) {
            uefVar.yo();
        }
        uef(true);
        oyt oytVar = this.ivm;
        if (oytVar != null) {
            oytVar.uef("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            uef uefVar2 = this.f25768oa;
            if (uefVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(uefVar2.moa(), 0));
            }
            jSONObject2.put("popup_sequence", this.xs);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("UserIdleAskDialog", e7.getMessage());
        }
        gzw gzwVar = this.uef.f25412oa;
        com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, gzwVar.lw(), "show_popup", jSONObject);
    }

    public void bcc() {
        this.zjm = true;
        ViewParent parent = this.moa.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.moa);
        }
        com.bytedance.sdk.openadsdk.core.cq.yo.oa oaVar = this.yo;
        if (oaVar != null) {
            oaVar.moa();
        }
    }

    public boolean cz() {
        if (this.zjm || !dj()) {
            return false;
        }
        o_();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void ivm() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public int lw() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public long moa() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ue
    public void n_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ue
    public void o_() {
        if (this.zjm || !dj()) {
            return;
        }
        wrv();
        uef uefVar = this.f25768oa;
        if (uefVar != null) {
            uefVar.oa();
        }
        uef(false);
        oyt oytVar = this.ivm;
        if (oytVar != null) {
            oytVar.uef("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void oa() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ue
    public int p_() {
        uef uefVar = this.f25768oa;
        if (uefVar != null) {
            return uefVar.moa();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ue
    public void q_() {
        uef uefVar = this.f25768oa;
        if (uefVar != null) {
            uefVar.lw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ue
    public void r_() {
        uef uefVar = this.f25768oa;
        if (uefVar != null) {
            uefVar.ivm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ue
    public void s_() {
        this.cz = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.yo.moa.uef
    public void xs() {
        if (this.bcc != 1) {
            return;
        }
        this.bcc = 3;
        View viewYo = this.yo.yo();
        if (viewYo != null) {
            ViewGroup viewGroup = (ViewGroup) viewYo.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.moa) {
                    return;
                } else {
                    viewGroup.removeView(viewYo);
                }
            }
            if (this.moa != null) {
                viewYo.setVisibility(0);
                this.moa.addView(viewYo, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public long yo() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void oa(int i5) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public boolean oa(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5, com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
    }

    private boolean oa(Activity activity) {
        if (!this.moa.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.dj = false;
                return false;
            }
            this.dj = true;
            window.addContentView(this.moa, new WindowManager.LayoutParams(-1, -1));
        }
        this.moa.setVisibility(0);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(int i5, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(boolean z2, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public boolean uef(JSONObject jSONObject) {
        return false;
    }

    public void uef(ViewGroup viewGroup) {
        View viewYo = this.yo.yo();
        if (viewYo == null) {
            return;
        }
        viewYo.setVisibility(4);
        viewGroup.addView(viewYo, new ViewGroup.LayoutParams(-1, -1));
        this.yo.oa();
        this.bcc = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(boolean z2) {
        com.bytedance.sdk.openadsdk.core.cq.yo.yo yoVarUef = this.yo.uef();
        if (yoVarUef instanceof com.bytedance.sdk.openadsdk.core.cq.yo.moa) {
            ((com.bytedance.sdk.openadsdk.core.cq.yo.moa) yoVarUef).uef(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ab
    public void uef(String str, JSONObject jSONObject) {
        uef uefVar;
        if (!"skipToNextAd".equals(str) || (uefVar = this.f25768oa) == null) {
            return;
        }
        uefVar.uef();
    }

    public boolean uef(Activity activity) throws JSONException {
        if (!this.zjm && activity != null && !activity.isFinishing()) {
            if (this.bcc == 3 && this.cz == 2) {
                if (this.moa.isAttachedToWindow() && this.moa.getVisibility() == 0) {
                    return true;
                }
                if (oa(activity)) {
                    zjm();
                    return true;
                }
            }
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.bcc);
                jSONObject.put("js_finish", this.cz);
                jSONObject.put("has_window", this.dj ? 1 : 0);
                map.put("pag_json_data", jSONObject.toString());
                gzw gzwVar = this.uef.f25412oa;
                com.bytedance.sdk.openadsdk.moa.yo.uef("show_popup_fail", gzwVar, gzwVar.lw(), map);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.yo.uef
    public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
        if (i5 == 2) {
            com.bytedance.sdk.openadsdk.core.model.ab abVar = (com.bytedance.sdk.openadsdk.core.model.ab) yoVar;
            String str = abVar.xs;
            if (abVar.wrv > 0) {
                pu.uef(true);
            }
            this.lw.uef(str);
            this.lw.uef(view, abVar.uef, abVar.f25657oa, abVar.yo, abVar.moa, abVar.zjm, abVar.dj);
            this.uef.gb.hts();
            pu.uef(false);
            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.uef.f25412oa, 9);
        }
    }
}

package com.bytedance.sdk.openadsdk.component.reward.yo.uef;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.yo.bcc;
import com.bytedance.sdk.openadsdk.component.reward.yo.uef.oa;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private oa moa;

    /* renamed from: oa, reason: collision with root package name */
    private Context f25468oa;
    private ViewGroup uef;
    private com.bytedance.sdk.openadsdk.core.ivm.moa yo;

    public uef(ViewGroup viewGroup, Context context) {
        this.uef = viewGroup;
        this.f25468oa = context;
        lw();
    }

    private void lw() {
        int iOa = af.oa(this.f25468oa, 24.0f);
        this.yo = com.bytedance.sdk.openadsdk.core.widget.ivm.oa(this.f25468oa);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = iOa;
        layoutParams.rightMargin = iOa;
        this.yo.setLayoutParams(layoutParams);
        this.yo.setVisibility(8);
        this.moa = new oa();
        int iLw = bcc.lw();
        this.moa.uef(iLw);
        this.moa.oa(iLw);
    }

    public void moa() {
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.oa();
        }
    }

    public void oa() {
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.setVisibility(0);
        }
    }

    public void uef() {
        ViewGroup viewGroup;
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = this.yo;
        if (moaVar == null || (viewGroup = this.uef) == null) {
            return;
        }
        viewGroup.addView(moaVar);
    }

    public void yo() {
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.uef();
        }
    }

    public void uef(View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.setOnClickListener(onClickListener);
        }
    }

    public void uef(oa.uef uefVar) {
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.uef(uefVar);
        }
    }

    public void uef(final gzw gzwVar) {
        if (gzwVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ab.moa.uef("unify_web_close_backup", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.uef.uef.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                if (gzwVar.aje() != null) {
                    jSONObject.put("tpl_id", gzwVar.aje().uef());
                }
                jSONObject.put("aid", gzwVar.iou());
                jSONObject.put("cid", gzwVar.au());
                jSONObject.put("req_id", gzwVar.ofp());
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("unify_web_close_backup").oa(jSONObject.toString());
            }
        });
    }
}

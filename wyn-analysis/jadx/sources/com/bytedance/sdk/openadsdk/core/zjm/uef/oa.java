package com.bytedance.sdk.openadsdk.core.zjm.uef;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.adexpress.oa.dj;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.widget.uef.lw;
import com.bytedance.sdk.openadsdk.cq.cz;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.gb;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa implements cz {
    private lw bcc;
    private com.bytedance.sdk.openadsdk.core.wk.moa.oa cz;
    private Activity dj;
    private JSONObject ivm;
    private dj lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private final ivm f25873oa;
    private final oyt uef;
    private com.bytedance.sdk.openadsdk.moa.moa.lw xs;
    private final gzw yo;
    private int zjm = -1;

    public oa(oyt oytVar, ivm ivmVar, gzw gzwVar) {
        this.uef = oytVar;
        this.f25873oa = ivmVar;
        this.yo = gzwVar;
    }

    public void ivm() {
        ivm ivmVar;
        if (this.uef == null || (ivmVar = this.f25873oa) == null || ivmVar.getWebView() == null) {
            return;
        }
        this.uef.xs(this.f25873oa.getVisibility() == 0);
    }

    public void lw() {
        oyt oytVar = this.uef;
        if (oytVar == null) {
            return;
        }
        oytVar.xs(false);
    }

    public void moa() {
        DeviceUtils.AudioInfoReceiver.uef(this);
    }

    public void yo() {
        DeviceUtils.AudioInfoReceiver.uef(this);
        this.zjm = DeviceUtils.xs();
    }

    public void oa() {
        this.f25873oa.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.zjm.uef.oa.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws JSONException {
                if (oa.this.f25873oa == null || oa.this.f25873oa.getViewTreeObserver() == null) {
                    return;
                }
                oa.this.f25873oa.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredWidth = oa.this.f25873oa.getMeasuredWidth();
                int measuredHeight = oa.this.f25873oa.getMeasuredHeight();
                if (oa.this.f25873oa.getVisibility() == 0) {
                    oa.this.uef.uef(measuredWidth, measuredHeight);
                }
            }
        });
    }

    public oa uef(dj djVar) {
        this.lw = djVar;
        return this;
    }

    public oa uef(com.bytedance.sdk.openadsdk.moa.moa.lw lwVar) {
        this.xs = lwVar;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.cq.cz
    public void yo(int i5) throws JSONException {
        oyt oytVar = this.uef;
        if (oytVar == null) {
            return;
        }
        int i10 = this.zjm;
        if (i10 <= 0 && i5 > 0) {
            oytVar.ivm(false);
        } else if (i10 > 0 && i5 == 0) {
            oytVar.ivm(true);
        }
        this.zjm = i5;
    }

    public oa uef(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        this.cz = oaVar;
        return this;
    }

    public oa uef(String str) {
        this.moa = str;
        return this;
    }

    public oa uef(JSONObject jSONObject) {
        this.ivm = jSONObject;
        return this;
    }

    public oa uef(lw lwVar) {
        this.bcc = lwVar;
        return this;
    }

    public oa uef(Activity activity) {
        this.dj = activity;
        return this;
    }

    public void uef() {
        oyt oytVar;
        ivm ivmVar = this.f25873oa;
        if (ivmVar == null || ivmVar.getWebView() == null || (oytVar = this.uef) == null) {
            return;
        }
        oytVar.oa(this.f25873oa).uef(this.yo).yo(this.yo.iou()).moa(this.yo.em()).oa(gb.uef(this.moa)).lw(this.yo.kid()).uef(new yo(this.f25873oa)).uef(this.lw).uef(this.ivm).oa(this.moa).uef(this.yo.us()).uef(this.dj).uef(this.f25873oa).uef(this.xs);
        this.uef.uef(new moa(this.f25873oa));
    }
}

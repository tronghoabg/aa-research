package com.bytedance.adsdk.ugeno.core.oa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.core.wk;
import com.bytedance.adsdk.ugeno.core.zjm;
import com.bytedance.adsdk.ugeno.xs.cz;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa implements cz.uef {
    private Handler ivm = new cz(Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.oa.yo lw;
    private cq moa;

    /* renamed from: oa, reason: collision with root package name */
    private wk f24686oa;
    private int uef;
    private Context yo;

    public oa(Context context, cq cqVar, com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        this.yo = context;
        this.moa = cqVar;
        this.lw = yoVar;
    }

    public void uef(wk wkVar) {
        this.f24686oa = wkVar;
    }

    public void uef() {
        cq cqVar = this.moa;
        if (cqVar == null) {
            return;
        }
        try {
            int i5 = Integer.parseInt(com.bytedance.adsdk.ugeno.yo.oa.uef(cqVar.yo().optString("delay"), this.lw.wrv()));
            this.uef = i5;
            this.ivm.sendEmptyMessageDelayed(1001, i5);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.xs.cz.uef
    public void uef(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectYo = this.moa.yo();
        if (TextUtils.equals(jSONObjectYo.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectYo.optString("nodeId");
            com.bytedance.adsdk.ugeno.oa.yo yoVar = this.lw;
            com.bytedance.adsdk.ugeno.oa.yo yoVarLw = yoVar.oa(yoVar).lw(strOptString);
            new zjm(yoVarLw.dj(), com.bytedance.adsdk.ugeno.core.uef.uef(jSONObjectYo.optJSONObject("animatorSet"), yoVarLw)).uef();
        } else {
            wk wkVar = this.f24686oa;
            if (wkVar != null) {
                cq cqVar = this.moa;
                com.bytedance.adsdk.ugeno.oa.yo yoVar2 = this.lw;
                wkVar.uef(cqVar, yoVar2, yoVar2);
            }
        }
        this.ivm.removeMessages(1001);
    }
}

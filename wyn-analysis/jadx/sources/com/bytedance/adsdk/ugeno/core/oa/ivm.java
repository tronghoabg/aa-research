package com.bytedance.adsdk.ugeno.core.oa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.core.wk;
import com.bytedance.adsdk.ugeno.xs.cz;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm implements cz.uef {
    private com.bytedance.adsdk.ugeno.oa.yo ivm;
    private cq lw;
    private Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24683oa;
    private boolean uef;
    private Handler xs = new cz(Looper.getMainLooper(), this);
    private wk yo;

    public ivm(Context context, cq cqVar, com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        this.moa = context;
        this.lw = cqVar;
        this.ivm = yoVar;
    }

    public void uef(wk wkVar) {
        this.yo = wkVar;
    }

    public void uef() {
        cq cqVar = this.lw;
        if (cqVar == null) {
            return;
        }
        JSONObject jSONObjectYo = cqVar.yo();
        try {
            this.f24683oa = Integer.parseInt(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObjectYo.optString("interval", "8000"), this.ivm.wrv()));
            this.uef = jSONObjectYo.optBoolean("repeat");
            this.xs.sendEmptyMessageDelayed(1001, this.f24683oa);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.xs.cz.uef
    public void uef(Message message) {
        if (message.what != 1001) {
            return;
        }
        wk wkVar = this.yo;
        if (wkVar != null) {
            cq cqVar = this.lw;
            com.bytedance.adsdk.ugeno.oa.yo yoVar = this.ivm;
            wkVar.uef(cqVar, yoVar, yoVar);
        }
        if (this.uef) {
            this.xs.sendEmptyMessageDelayed(1001, this.f24683oa);
        } else {
            this.xs.removeMessages(1001);
        }
    }
}

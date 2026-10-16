package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* loaded from: classes.dex */
public class oa extends yo implements com.bytedance.adsdk.ugeno.uef.oa {
    private String dj;

    public oa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa
    public void oa() {
        com.bytedance.adsdk.ugeno.moa.dj djVar;
        if ((TextUtils.equals(this.dj, "complete") || TextUtils.isEmpty(this.dj)) && (djVar = this.uef) != null) {
            djVar.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        Object obj;
        com.bytedance.adsdk.ugeno.oa.yo yoVarBcc;
        com.bytedance.adsdk.ugeno.uef.uef uefVarWrv;
        Map<String, Object> map = this.lw;
        if (map == null || map.size() <= 0 || (obj = this.lw.get(MediationMetaData.KEY_NAME)) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            return false;
        }
        Object obj2 = this.lw.get("state");
        if (obj2 != null) {
            this.dj = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.f24741oa;
        com.bytedance.adsdk.ugeno.oa.yo yoVarOa = yoVar.oa(yoVar);
        if (yoVarOa != null && (yoVarBcc = yoVarOa.bcc(strValueOf)) != null && (uefVarWrv = yoVarBcc.wrv(strValueOf)) != null) {
            uefVarWrv.uef(this);
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa
    public void uef() {
        com.bytedance.adsdk.ugeno.moa.dj djVar;
        if ((TextUtils.equals(this.dj, "start") || TextUtils.isEmpty(this.dj)) && (djVar = this.uef) != null) {
            djVar.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
        }
    }
}

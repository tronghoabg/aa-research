package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class moa extends yo implements com.bytedance.adsdk.ugeno.moa.uef.moa {
    private com.bytedance.adsdk.ugeno.moa.uef.yo dj;

    public moa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        com.bytedance.adsdk.ugeno.moa.uef.uef uefVarSk = this.f24741oa.sk();
        if (uefVarSk == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.moa.uef.yo yoVarUef = uefVarSk.uef(this.ivm);
        this.dj = yoVarUef;
        if (yoVarUef != null) {
            yoVarUef.uef(this);
            return false;
        }
        uefVarSk.uef(this.ivm, new com.bytedance.adsdk.ugeno.moa.uef.oa());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.moa.uef.moa
    public void uef(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.uef.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
    }
}

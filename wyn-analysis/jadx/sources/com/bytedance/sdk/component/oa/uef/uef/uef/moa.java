package com.bytedance.sdk.component.oa.uef.uef.uef;

import android.text.TextUtils;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.wrv;

/* loaded from: classes.dex */
public class moa extends dj {
    public ivm cz;
    public uef zjm;

    public moa(dj.uef uefVar) {
        super(uefVar);
        ivm ivmVar = new ivm();
        this.cz = ivmVar;
        this.zjm = new uef(ivmVar.oa());
    }

    @Override // com.bytedance.sdk.component.oa.uef.dj
    public com.bytedance.sdk.component.oa.uef.moa oa() {
        return this.cz;
    }

    @Override // com.bytedance.sdk.component.oa.uef.dj
    public com.bytedance.sdk.component.oa.uef.oa uef(wrv wrvVar) {
        wrvVar.uef(this);
        if (wrvVar.moa() == null || wrvVar.moa().uef() == null || TextUtils.isEmpty(wrvVar.moa().uef().toString())) {
            return null;
        }
        if (uef.uef == null || !uef.uef.oa() || !this.zjm.lw() || "setting".equals(wrvVar.bcc())) {
            oa oaVar = new oa(wrvVar, this.cz);
            this.cz.yo().add(oaVar);
            return oaVar;
        }
        oa oaVar2 = new oa(wrvVar, this.zjm);
        this.zjm.yo().add(oaVar2);
        return oaVar2;
    }
}

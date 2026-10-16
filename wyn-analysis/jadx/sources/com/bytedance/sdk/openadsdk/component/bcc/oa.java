package com.bytedance.sdk.openadsdk.component.bcc;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;
import com.bytedance.sdk.openadsdk.moa.xs;

/* loaded from: classes3.dex */
public class oa extends com.bytedance.sdk.openadsdk.core.wk.moa.uef {
    public oa(Context context, ViewGroup viewGroup, gzw gzwVar) {
        super(context, viewGroup, gzwVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.uef
    public void ab() {
        wk.uef uefVar = new wk.uef();
        uefVar.oa(ivm());
        uefVar.moa(cz());
        uefVar.yo(xs());
        uefVar.moa(bcc());
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.lw(this.xs, uefVar);
    }

    public void uef(wk.uef uefVar) {
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(this.xs, uefVar, (xs) null);
    }
}

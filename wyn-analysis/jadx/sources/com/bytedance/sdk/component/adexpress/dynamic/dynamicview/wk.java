package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public class wk extends ivm {

    /* renamed from: oa, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.moa.bcc f24834oa;
    String uef;

    public wk(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, String str) {
        super(context, dynamicRootView, bccVar);
        this.uef = str;
        this.f24834oa = bccVar;
        com.bytedance.sdk.component.adexpress.ivm.zjm lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.ivm.zjm getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar = this.cq;
        if (bccVar == null || bccVar.zjm() == null || this.dj == null || TextUtils.isEmpty(this.uef)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw = this.cq.zjm().lw();
        String strVjj = ivmVarLw != null ? ivmVarLw.vjj() : "";
        if (TextUtils.isEmpty(strVjj)) {
            return null;
        }
        String strH = AbstractC3256n.h(new StringBuilder(), this.uef, "static/lotties/", strVjj, ".json");
        com.bytedance.sdk.component.adexpress.ivm.zjm zjmVar = new com.bytedance.sdk.component.adexpress.ivm.zjm(this.dj);
        zjmVar.setImageLottieTosPath(strH);
        zjmVar.bcc();
        return zjmVar;
    }
}

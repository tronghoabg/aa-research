package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class yo extends com.bytedance.sdk.openadsdk.core.ivm.moa {
    public yo(Context context) {
        super(context);
        uef();
    }

    private void uef() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.bs.ovw);
    }

    public void uef(int i5, gzw gzwVar) {
        if (gzwVar.ebe() || (gzwVar.tv() && gzwVar.gzw())) {
            af.uef((View) this, 0);
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef((int) af.uef(getContext(), i5, true), this, gzwVar);
        }
    }
}

package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;

/* loaded from: classes3.dex */
public class cq {
    private boolean bcc;
    private final String ivm;
    private ImageView lw;
    private com.bytedance.sdk.component.cz.ivm moa;

    /* renamed from: oa, reason: collision with root package name */
    private RelativeLayout f25301oa;
    private final gzw uef;
    private orq xs;
    private final Context yo;

    public cq(Context context, gzw gzwVar, String str, boolean z2) {
        this.yo = context;
        this.uef = gzwVar;
        this.ivm = str;
        this.bcc = z2;
        lw();
    }

    private void lw() {
        RelativeLayout relativeLayoutUef = uef(this.yo, this.bcc);
        this.f25301oa = relativeLayoutUef;
        this.moa = (com.bytedance.sdk.component.cz.ivm) relativeLayoutUef.findViewById(com.bytedance.sdk.openadsdk.utils.bs.au);
        orq orqVar = new orq(this.yo, (RelativeLayout) this.f25301oa.findViewById(com.bytedance.sdk.openadsdk.utils.bs.f26136ne), this.uef, this.moa, this.ivm, this.bcc);
        this.xs = orqVar;
        this.lw = orqVar.yo();
    }

    private static RelativeLayout uef(Context context, boolean z2) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new cz(context));
        ivm.yo yoVar = ivm.yo.LANDING_PAGE;
        new com.bytedance.sdk.component.cz.ivm(context, yoVar);
        com.bytedance.sdk.component.cz.ivm ivmVar = z2 ? new com.bytedance.sdk.component.cz.ivm(context, ivm.yo.PRIVACY) : new com.bytedance.sdk.component.cz.ivm(context, yoVar);
        ivmVar.setId(com.bytedance.sdk.openadsdk.utils.bs.au);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.bs.f26136ne);
        if (z2) {
            relativeLayout.addView(ivmVar, layoutParams);
        }
        return relativeLayout;
    }

    public View moa() {
        return this.f25301oa;
    }

    public void oa() {
        orq orqVar = this.xs;
        if (orqVar != null) {
            orqVar.oa();
        }
    }

    public com.bytedance.sdk.component.cz.ivm yo() {
        return this.moa;
    }

    public void oa(String str) {
        this.xs.oa(str);
    }

    public void uef() {
        orq orqVar = this.xs;
        if (orqVar != null) {
            orqVar.uef();
        }
    }

    public void uef(WebView webView, ivm.uef uefVar) {
        orq orqVar = this.xs;
        if (orqVar != null) {
            orqVar.uef(webView, uefVar);
        }
    }

    public void uef(String str) {
        this.xs.uef(str);
    }

    public void uef(boolean z2) {
        this.xs.uef(z2);
    }
}

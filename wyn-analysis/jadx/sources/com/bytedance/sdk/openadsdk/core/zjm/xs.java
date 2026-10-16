package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class xs extends com.bytedance.sdk.component.adexpress.dynamic.uef.uef {
    private final Runnable moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.oa.xs f25875oa;
    private final com.bytedance.sdk.component.adexpress.oa.cq uef;
    private final com.bytedance.sdk.component.bcc.oa.yo yo;

    public xs(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z2, com.bytedance.sdk.component.adexpress.dynamic.lw.bcc bccVar, com.bytedance.sdk.component.adexpress.oa.cq cqVar, com.bytedance.sdk.component.adexpress.dynamic.ivm.uef uefVar) {
        super(context, themeStatusBroadcastReceiver, z2, bccVar, cqVar, uefVar);
        this.yo = new com.bytedance.sdk.component.bcc.oa.yo("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.zjm.xs.1
            @Override // java.lang.Runnable
            public void run() {
                xs.this.uef.yo();
                com.bytedance.sdk.openadsdk.core.wk.yo().post(xs.this.moa);
            }
        };
        this.moa = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.xs.2
            @Override // java.lang.Runnable
            public void run() {
                if (xs.this.f25875oa != null) {
                    xs xsVar = xs.this;
                    xs.super.uef(xsVar.f25875oa);
                }
            }
        };
        this.uef = cqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uef.uef
    public void oa() {
        super.oa();
        com.bytedance.sdk.openadsdk.core.wk.yo().removeCallbacks(this.moa);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uef.uef, com.bytedance.sdk.component.adexpress.oa.moa
    public void uef(com.bytedance.sdk.component.adexpress.oa.xs xsVar) {
        this.f25875oa = xsVar;
        km.yo((Runnable) this.yo);
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class cq extends ivm {
    public cq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        TextView textView = new TextView(context);
        this.wk = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.wk, getWidgetLayoutParams());
    }

    private boolean uef() {
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.wrv.f24868oa) && this.wrv.f24868oa.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.lw.dj.oa();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cz() {
        /*
            r4 = this;
            super.cz()
            android.view.View r0 = r4.wk
            com.bytedance.sdk.component.adexpress.dynamic.moa.xs r1 = r4.wrv
            int r1 = r1.bcc()
            r0.setTextAlignment(r1)
            android.view.View r0 = r4.wk
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.moa.xs r1 = r4.wrv
            int r1 = r1.xs()
            r0.setTextColor(r1)
            android.view.View r0 = r4.wk
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.moa.xs r1 = r4.wrv
            float r1 = r1.lw()
            r0.setTextSize(r1)
            boolean r0 = com.bytedance.sdk.component.adexpress.moa.oa()
            if (r0 == 0) goto L8a
            android.view.View r0 = r4.wk
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            r0.setIncludeFontPadding(r1)
            android.view.View r0 = r4.wk
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r2 = com.bytedance.sdk.component.adexpress.moa.uef()
            int r3 = r4.bcc
            float r3 = (float) r3
            int r2 = com.bytedance.sdk.component.adexpress.moa.xs.oa(r2, r3)
            com.bytedance.sdk.component.adexpress.dynamic.moa.xs r3 = r4.wrv
            int r3 = r3.oa()
            int r2 = r2 - r3
            com.bytedance.sdk.component.adexpress.dynamic.moa.xs r3 = r4.wrv
            int r3 = r3.uef()
            int r2 = r2 - r3
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r3
            com.bytedance.sdk.component.adexpress.dynamic.moa.xs r3 = r4.wrv
            float r3 = r3.lw()
            float r2 = java.lang.Math.min(r2, r3)
            r0.setTextSize(r2)
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView r0 = r4.dz
            if (r0 == 0) goto L80
            com.bytedance.sdk.component.adexpress.oa.cq r0 = r0.getRenderRequest()
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.pz()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L80
            android.view.View r2 = r4.wk
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r0)
            goto L82
        L80:
            r1 = 8
        L82:
            android.view.View r0 = r4.wk
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r1)
            goto Lc3
        L8a:
            boolean r0 = r4.uef()
            if (r0 == 0) goto Lb2
            boolean r0 = com.bytedance.sdk.component.adexpress.dynamic.lw.dj.oa()
            if (r0 == 0) goto La2
            android.view.View r0 = r4.wk
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = com.bytedance.sdk.component.adexpress.dynamic.lw.dj.uef()
            r0.setText(r1)
            goto Lc3
        La2:
            android.view.View r0 = r4.wk
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.moa.xs r1 = r4.wrv
            java.lang.String r1 = r1.f24868oa
            java.lang.String r1 = com.bytedance.sdk.component.adexpress.dynamic.lw.dj.uef(r1)
            r0.setText(r1)
            goto Lc3
        Lb2:
            android.view.View r0 = r4.wk
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "tt_logo_cn"
            int r1 = com.bytedance.sdk.component.utils.orq.oa(r1, r2)
            r0.setText(r1)
        Lc3:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cq.cz():boolean");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public void ivm() {
        com.bytedance.sdk.component.adexpress.oa.cq renderRequest = this.dz.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.ue())) {
            super.ivm();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xs, this.bcc);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }
}

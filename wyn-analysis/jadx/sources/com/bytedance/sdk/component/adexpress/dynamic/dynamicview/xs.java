package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class xs extends ivm {
    public xs(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.uef uefVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.uef(context);
        this.wk = uefVar;
        uefVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.wk, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        if (TextUtils.equals("download-progress-button", this.cq.zjm().oa()) && TextUtils.isEmpty(this.wrv.zjm())) {
            this.wk.setVisibility(4);
            return true;
        }
        this.wk.setTextAlignment(this.wrv.bcc());
        ((TextView) this.wk).setText(this.wrv.zjm());
        ((TextView) this.wk).setTextColor(this.wrv.xs());
        ((TextView) this.wk).setTextSize(this.wrv.lw());
        ((TextView) this.wk).setGravity(17);
        ((TextView) this.wk).setIncludeFontPadding(false);
        if ("fillButton".equals(this.cq.zjm().oa())) {
            this.wk.setPadding(0, 0, 0, 0);
        } else {
            this.wk.setPadding(this.wrv.yo(), this.wrv.oa(), this.wrv.moa(), this.wrv.uef());
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.moa.oa() || !"fillButton".equals(this.cq.zjm().oa())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.wk).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.wk).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.wrv.sy() * 2;
        widgetLayoutParams.height -= this.wrv.sy() * 2;
        widgetLayoutParams.topMargin = this.wrv.sy() + widgetLayoutParams.topMargin;
        int iSy = this.wrv.sy() + widgetLayoutParams.leftMargin;
        widgetLayoutParams.leftMargin = iSy;
        widgetLayoutParams.setMarginStart(iSy);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }
}

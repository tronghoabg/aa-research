package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ivm.sy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wk implements xs<com.bytedance.sdk.component.adexpress.ivm.sy> {
    private int bcc;
    private JSONObject cz;
    private int ivm;
    private String lw;
    private com.bytedance.sdk.component.adexpress.dynamic.moa.xs moa;

    /* renamed from: oa, reason: collision with root package name */
    private Context f24893oa;
    private com.bytedance.sdk.component.adexpress.ivm.sy uef;
    private int xs;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw yo;

    public wk(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar, String str, int i5, int i10, int i11, JSONObject jSONObject) {
        this.f24893oa = context;
        this.yo = lwVar;
        this.moa = xsVar;
        this.lw = str;
        this.ivm = i5;
        this.xs = i10;
        this.bcc = i11;
        this.cz = jSONObject;
        lw();
    }

    private void lw() {
        final com.bytedance.sdk.component.adexpress.dynamic.ivm.uef dynamicClickListener = this.yo.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.lw)) {
            Context context = this.f24893oa;
            com.bytedance.sdk.component.adexpress.ivm.sy syVar = new com.bytedance.sdk.component.adexpress.ivm.sy(context, com.bytedance.sdk.component.adexpress.yo.uef.bcc(context), this.ivm, this.xs, this.bcc, this.cz);
            this.uef = syVar;
            if (syVar.getShakeLayout() != null) {
                this.uef.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.f24893oa;
            this.uef = new com.bytedance.sdk.component.adexpress.ivm.sy(context2, com.bytedance.sdk.component.adexpress.yo.uef.xs(context2), this.ivm, this.xs, this.bcc, this.cz);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.uef.setGravity(17);
        layoutParams.gravity = 17;
        this.uef.setLayoutParams(layoutParams);
        this.uef.setTranslationY(com.bytedance.sdk.component.adexpress.moa.xs.uef(this.f24893oa, this.moa.vjj()));
        this.uef.setShakeText(this.moa.rj());
        this.uef.setClipChildren(false);
        this.uef.setOnShakeViewListener(new sy.uef() { // from class: com.bytedance.sdk.component.adexpress.dynamic.yo.wk.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ivm.sy yo() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void oa() {
        this.uef.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void uef() {
        this.uef.uef();
    }
}

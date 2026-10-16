package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ivm.rt;
import com.bytedance.sdk.component.utils.orq;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oib implements xs<rt> {
    private com.bytedance.sdk.component.adexpress.dynamic.moa.zjm ivm;
    private String lw;
    private com.bytedance.sdk.component.adexpress.dynamic.moa.xs moa;

    /* renamed from: oa, reason: collision with root package name */
    private Context f24881oa;
    private rt uef;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw yo;

    public oib(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar, String str, com.bytedance.sdk.component.adexpress.dynamic.moa.zjm zjmVar) {
        this.f24881oa = context;
        this.yo = lwVar;
        this.moa = xsVar;
        this.lw = str;
        this.ivm = zjmVar;
        lw();
    }

    private void lw() {
        int iAu = this.moa.au();
        final com.bytedance.sdk.component.adexpress.dynamic.ivm.uef dynamicClickListener = this.yo.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.lw)) {
            Context context = this.f24881oa;
            rt rtVar = new rt(context, com.bytedance.sdk.component.adexpress.yo.uef.cz(context), this.ivm);
            this.uef = rtVar;
            if (rtVar.getWriggleLayout() != null) {
                this.uef.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.uef.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.moa.ot())) {
                    this.uef.getTopTextView().setText(orq.oa(this.f24881oa, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.uef.getTopTextView().setText(this.moa.ot());
                }
            }
        } else {
            Context context2 = this.f24881oa;
            this.uef = new rt(context2, com.bytedance.sdk.component.adexpress.yo.uef.cz(context2), this.ivm);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.uef.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.f24881oa, iAu)));
        this.uef.setLayoutParams(layoutParams);
        this.uef.setShakeText(this.moa.rj());
        this.uef.setClipChildren(false);
        final View wriggleProgressIv = this.uef.getWriggleProgressIv();
        this.uef.setOnShakeViewListener(new rt.uef() { // from class: com.bytedance.sdk.component.adexpress.dynamic.yo.oib.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public rt yo() {
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

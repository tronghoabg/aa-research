package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ivm.dhk;

/* loaded from: classes.dex */
public class ab implements xs {
    private com.bytedance.sdk.component.adexpress.dynamic.moa.xs moa;

    /* renamed from: oa, reason: collision with root package name */
    private Context f24876oa;
    private dhk uef;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw yo;

    public ab(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        this.f24876oa = context;
        this.yo = lwVar;
        this.moa = xsVar;
        moa();
    }

    private void moa() {
        this.uef = new dhk(this.f24876oa);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.f24876oa, 120.0f));
        layoutParams.gravity = 17;
        this.uef.setLayoutParams(layoutParams);
        this.uef.setClipChildren(false);
        this.uef.setGuideText(this.moa.rj());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar = this.yo;
        if (lwVar != null) {
            this.uef.setOnClickListener((View.OnClickListener) lwVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void oa() {
        dhk dhkVar = this.uef;
        if (dhkVar != null) {
            dhkVar.oa();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void uef() {
        dhk dhkVar = this.uef;
        if (dhkVar != null) {
            dhkVar.uef();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public ViewGroup yo() {
        return this.uef;
    }
}

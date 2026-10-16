package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ivm.tpx;

/* loaded from: classes.dex */
public class bs<E extends tpx> implements xs<E> {
    protected int lw;
    protected com.bytedance.sdk.component.adexpress.dynamic.moa.xs moa;

    /* renamed from: oa, reason: collision with root package name */
    protected Context f24877oa;
    protected tpx uef;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw yo;

    public bs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar, int i5) {
        this.lw = i5;
        this.f24877oa = context;
        this.yo = lwVar;
        this.moa = xsVar;
        moa();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    /* renamed from: lw, reason: merged with bridge method [inline-methods] */
    public E yo() {
        return (E) this.uef;
    }

    public void moa() {
        this.uef = new tpx(this.f24877oa, this.moa.rl());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.f24877oa, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.f24877oa, 100 - this.lw);
        this.uef.setLayoutParams(layoutParams);
        try {
            this.uef.setGuideText(this.moa.rj());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void oa() {
        this.uef.oa();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void uef() {
        this.uef.uef();
    }

    public bs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        this(context, lwVar, xsVar, 0);
    }
}

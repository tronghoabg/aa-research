package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class ivm extends com.bytedance.sdk.openadsdk.core.ivm.moa {

    /* renamed from: oa, reason: collision with root package name */
    private int f25764oa;
    private float uef;

    public ivm(Context context) {
        super(context);
        this.uef = 2.25f;
        this.f25764oa = 12;
        uef();
    }

    public static com.bytedance.sdk.openadsdk.core.ivm.moa oa(Context context) {
        return new ivm(context, 28, 5.0f);
    }

    private void uef() {
        setBackground(moa.uef());
        setImageResource(orq.moa(getContext(), "tt_close_btn"));
        int iOa = af.oa(getContext(), this.uef);
        setPadding(iOa, iOa, iOa, iOa);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ivm.moa, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iOa = af.oa(getContext(), this.f25764oa);
            layoutParams.width = iOa;
            layoutParams.height = iOa;
        }
        super.setLayoutParams(layoutParams);
    }

    public ivm(Context context, int i5, float f10) {
        super(context);
        this.uef = f10;
        this.f25764oa = i5;
        uef();
    }

    public static com.bytedance.sdk.openadsdk.core.ivm.moa uef(Context context) {
        return new ivm(context);
    }
}

package com.bytedance.sdk.openadsdk.yo;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class xs extends LinearLayout {

    /* renamed from: oa, reason: collision with root package name */
    private bcc f26203oa;
    private final FilterWord uef;
    private final zjm yo;

    public xs(Context context, FilterWord filterWord, zjm zjmVar) {
        super(context);
        setOrientation(1);
        this.uef = filterWord;
        this.yo = zjmVar;
        uef();
    }

    private void oa() {
        this.f26203oa = new bcc(getContext(), this.yo);
        new LinearLayout.LayoutParams(-1, -2);
        this.f26203oa.uef(this.uef.getOptions());
        addView(this.f26203oa);
    }

    private void uef() {
        yo();
        oa();
    }

    private void yo() {
        String name = this.uef.getName();
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = af.oa(getContext(), 12.0f);
        layoutParams.gravity = 17;
        bccVar.setGravity(17);
        bccVar.setText(name);
        bccVar.setTextColor(Color.argb(85, 22, 24, 35));
        bccVar.setTextSize(this.yo.cz() ? 14 : 10);
        addView(bccVar, layoutParams);
    }
}

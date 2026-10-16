package com.bytedance.sdk.openadsdk.core.cq.oa.ivm;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.adsdk.ugeno.cz.oa.uef {

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.cz.oa.uef f25526oa;
    private final com.bytedance.adsdk.ugeno.cz.oa.uef uef;

    public uef(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.cz.oa.uef uefVar = new com.bytedance.adsdk.ugeno.cz.oa.uef(context);
        this.uef = uefVar;
        addView(uefVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.cz.oa.uef uefVar2 = new com.bytedance.adsdk.ugeno.cz.oa.uef(context);
        this.f25526oa = uefVar2;
        uefVar2.setBackgroundColor(0);
        addView(uefVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.cz.oa.uef getMarkView() {
        return this.f25526oa;
    }

    public com.bytedance.adsdk.ugeno.cz.oa.uef getVideoView() {
        return this.uef;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f25526oa.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f25526oa.setOnTouchListener(onTouchListener);
    }
}

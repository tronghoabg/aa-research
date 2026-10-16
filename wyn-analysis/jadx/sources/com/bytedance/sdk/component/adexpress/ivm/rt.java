package com.bytedance.sdk.component.adexpress.ivm;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class rt extends LinearLayout {
    private com.bytedance.adsdk.oa.ivm ivm;
    private LinearLayout lw;
    private uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.utils.gsd f24909oa;
    private TextView uef;
    private com.bytedance.sdk.component.adexpress.dynamic.moa.zjm xs;
    private TextView yo;

    public interface uef {
    }

    public rt(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.moa.zjm zjmVar) {
        super(context);
        this.xs = zjmVar;
        uef(context, view);
    }

    public TextView getTopTextView() {
        return this.uef;
    }

    public LinearLayout getWriggleLayout() {
        return this.lw;
    }

    public View getWriggleProgressIv() {
        return this.ivm;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f24909oa == null) {
                this.f24909oa = new com.bytedance.sdk.component.utils.gsd(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.ivm.rt.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.moa.zjm zjmVar = this.xs;
            if (zjmVar != null) {
                zjmVar.yo();
                this.xs.lw();
                this.xs.ivm();
                this.xs.bcc();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.oa.ivm ivmVar = this.ivm;
            if (ivmVar != null) {
                ivmVar.lw();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
    }

    public void setOnShakeViewListener(uef uefVar) {
        this.moa = uefVar;
    }

    public void setShakeText(String str) {
        this.yo.setText(str);
    }

    private void uef(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.lw = (LinearLayout) findViewById(2097610722);
        this.uef = (TextView) findViewById(2097610719);
        this.yo = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.oa.ivm ivmVar = (com.bytedance.adsdk.oa.ivm) findViewById(2097610706);
        this.ivm = ivmVar;
        ivmVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.ivm.setImageAssetsFolder("images/");
        this.ivm.uef(true);
    }

    public void uef() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.rt.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    rt.this.ivm.uef();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}

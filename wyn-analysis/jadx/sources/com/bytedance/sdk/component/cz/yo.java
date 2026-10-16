package com.bytedance.sdk.component.cz;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class yo implements View.OnTouchListener {

    /* renamed from: oa, reason: collision with root package name */
    private int f24983oa = -1;
    private ViewConfiguration uef;

    public abstract void uef(View.OnTouchListener onTouchListener);

    public boolean uef(float f10, float f11, float f12, float f13, Context context) {
        if (this.uef == null) {
            this.uef = ViewConfiguration.get(context);
        }
        if (this.f24983oa == -1) {
            this.f24983oa = this.uef.getScaledTouchSlop();
        }
        return Math.abs(f10 - f12) <= ((float) this.f24983oa) && Math.abs(f11 - f13) <= ((float) this.f24983oa);
    }
}

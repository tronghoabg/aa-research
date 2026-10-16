package com.bytedance.sdk.component.adexpress.dynamic.yo.uef;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class bcc implements View.OnTouchListener {
    private float ivm;
    private float lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private final boolean f24883oa;
    private final com.bytedance.sdk.component.adexpress.dynamic.yo.bcc uef;
    private float xs;
    private final int yo = 10;

    public bcc(com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar, boolean z2) {
        this.uef = bccVar;
        this.f24883oa = z2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar;
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.moa = motionEvent.getX();
            this.lw = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.lw);
        } else if (action == 1) {
            this.ivm = motionEvent.getX();
            this.xs = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.xs);
            if (this.f24883oa || (bccVar2 = this.uef) == null) {
                float f10 = this.ivm - this.moa;
                float f11 = this.xs - this.lw;
                if (com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), Math.abs((float) Math.sqrt((f11 * f11) + (f10 * f10)))) > 10.0f && (bccVar = this.uef) != null) {
                    bccVar.uef();
                }
            } else {
                bccVar2.uef();
            }
        }
        return true;
    }
}

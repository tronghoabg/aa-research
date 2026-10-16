package com.bytedance.sdk.component.adexpress.dynamic.yo.uef;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.yo.cz;

/* loaded from: classes.dex */
public class oa implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.yo.bcc ivm;
    private cz lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24887oa;
    private float uef;
    private long yo;

    public oa(cz czVar, com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar) {
        this.lw = czVar;
        this.ivm = bccVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.yo = System.currentTimeMillis();
            this.uef = motionEvent.getX();
            this.f24887oa = motionEvent.getY();
            this.lw.lw();
        } else if (action != 1) {
            if (action == 2) {
                float x5 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x5 - this.uef) >= com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), 10.0f) || Math.abs(y10 - this.f24887oa) >= com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), 10.0f)) {
                    this.moa = true;
                    this.lw.ivm();
                }
            }
        } else {
            if (this.moa) {
                return false;
            }
            if (System.currentTimeMillis() - this.yo >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar = this.ivm;
                if (bccVar != null) {
                    bccVar.uef();
                }
            } else {
                this.lw.ivm();
            }
        }
        return true;
    }
}

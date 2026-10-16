package com.bytedance.sdk.component.adexpress.dynamic.yo.uef;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class ivm implements View.OnTouchListener {
    private static int yo = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.yo.bcc lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24884oa;
    private float uef;

    public ivm(com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar) {
        this.lw = bccVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.uef = motionEvent.getX();
            this.f24884oa = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x5 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x5 - this.uef) >= yo || Math.abs(y10 - this.f24884oa) >= yo) {
                    this.moa = true;
                }
            } else if (action == 3) {
                this.moa = false;
            }
        } else {
            if (this.moa) {
                this.moa = false;
                return false;
            }
            float x10 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x10 - this.uef) >= yo || Math.abs(y11 - this.f24884oa) >= yo) {
                this.moa = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar = this.lw;
                if (bccVar != null) {
                    bccVar.uef();
                }
            }
        }
        return true;
    }
}

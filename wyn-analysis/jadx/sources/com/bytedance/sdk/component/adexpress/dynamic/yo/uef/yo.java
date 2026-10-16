package com.bytedance.sdk.component.adexpress.dynamic.yo.uef;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class yo implements View.OnTouchListener {
    private boolean bcc;
    private boolean cz;
    private com.bytedance.sdk.component.adexpress.dynamic.yo.bcc ivm;
    private boolean lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24892oa;
    private float uef;
    private int xs;
    private float yo;

    public yo(com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar) {
        this(bccVar, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar;
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar2;
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar3;
        if (this.cz) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.uef = motionEvent.getX();
            this.f24892oa = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.moa = motionEvent.getX();
                this.yo = motionEvent.getY();
                if (Math.abs(this.moa - this.uef) > 10.0f) {
                    this.lw = true;
                }
                if (Math.abs(this.moa - this.uef) > 8.0f || Math.abs(this.yo - this.f24892oa) > 8.0f) {
                    this.bcc = false;
                }
                int iOa = com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), Math.abs(this.moa - this.uef));
                if (this.moa > this.uef && iOa > this.xs && (bccVar3 = this.ivm) != null) {
                    bccVar3.uef();
                    this.cz = true;
                }
            }
        } else {
            if (!this.lw && !this.bcc) {
                return false;
            }
            float x5 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int iOa2 = com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), Math.abs(this.moa - this.uef));
            if (this.moa > this.uef && iOa2 > this.xs && (bccVar2 = this.ivm) != null) {
                bccVar2.uef();
                this.cz = true;
            }
            float fAbs = Math.abs(x5 - this.uef);
            float fAbs2 = Math.abs(y10 - this.f24892oa);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (bccVar = this.ivm) != null) {
                bccVar.oa();
                this.cz = true;
            }
        }
        return true;
    }

    public yo(com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar, int i5) {
        this.xs = 5;
        this.bcc = true;
        this.ivm = bccVar;
        if (i5 > 0) {
            this.xs = i5;
        }
    }
}

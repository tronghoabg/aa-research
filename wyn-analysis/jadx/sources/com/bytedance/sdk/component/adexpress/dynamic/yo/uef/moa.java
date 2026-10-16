package com.bytedance.sdk.component.adexpress.dynamic.yo.uef;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class moa implements View.OnTouchListener {
    private boolean bcc;
    private com.bytedance.sdk.component.adexpress.dynamic.yo.bcc cz;
    private boolean dj;
    private float ivm;
    private boolean lw = true;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24886oa;
    private float uef;
    private float xs;
    private float yo;
    private int zjm;

    public moa(com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar, int i5, boolean z2) {
        this.cz = bccVar;
        this.zjm = i5;
        this.dj = z2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar;
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar2;
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.uef = motionEvent.getX();
            this.f24886oa = motionEvent.getY();
            this.ivm = motionEvent.getY();
            this.lw = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.xs = y10;
                if (Math.abs(y10 - this.ivm) > 10.0f) {
                    this.bcc = true;
                }
                this.moa = motionEvent.getX();
                this.yo = motionEvent.getY();
                if (Math.abs(this.moa - this.uef) > 8.0f || Math.abs(this.yo - this.f24886oa) > 8.0f) {
                    this.lw = false;
                }
            }
        } else {
            if (!this.bcc && !this.lw) {
                return false;
            }
            if (this.dj || (bccVar3 = this.cz) == null) {
                int iOa = com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), Math.abs(this.xs - this.ivm));
                if (this.xs - this.ivm < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iOa > this.zjm && (bccVar2 = this.cz) != null) {
                    bccVar2.uef();
                } else if (this.lw && (bccVar = this.cz) != null) {
                    bccVar.uef();
                }
            } else {
                bccVar3.uef();
            }
        }
        return true;
    }
}

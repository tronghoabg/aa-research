package com.bytedance.sdk.component.adexpress.dynamic.yo.uef;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class lw implements View.OnTouchListener {
    private int lw;
    private com.bytedance.sdk.component.adexpress.dynamic.yo.bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24885oa;
    private float uef;
    private boolean yo;

    public lw(com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar, int i5) {
        this.moa = bccVar;
        this.lw = i5;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.uef = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f24885oa = y10;
                if (Math.abs(y10 - this.uef) > 10.0f) {
                    this.yo = true;
                }
            }
        } else {
            if (!this.yo) {
                return false;
            }
            int iOa = com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), Math.abs(this.f24885oa - this.uef));
            if (this.f24885oa - this.uef < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iOa > this.lw && (bccVar = this.moa) != null) {
                bccVar.uef();
                this.uef = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.f24885oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.yo = false;
            }
        }
        return true;
    }
}

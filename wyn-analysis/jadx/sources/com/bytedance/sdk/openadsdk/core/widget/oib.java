package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class oib {
    private boolean dj;
    private int ivm;
    private float lw;
    private float moa;
    private final uef uef;
    private int xs;

    /* renamed from: oa, reason: collision with root package name */
    private final boolean f25767oa = false;
    private boolean yo = false;
    private boolean bcc = true;
    private boolean cz = false;
    private final View.OnTouchListener zjm = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.oib.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (oib.this.uef.gzw()) {
                return !oib.this.yo;
            }
            float x5 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                oib oibVar = oib.this;
                oibVar.dj = oibVar.uef(motionEvent);
                oib.this.moa = x5;
                oib.this.lw = y10;
                oib.this.ivm = (int) x5;
                oib.this.xs = (int) y10;
                oib.this.bcc = true;
                if (oib.this.uef != null && oib.this.yo) {
                    oib.this.uef.uef(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x5 - oib.this.ivm) > 20.0f || Math.abs(y10 - oib.this.xs) > 20.0f) {
                    oib.this.bcc = false;
                }
                oib.this.bcc = true;
                oib.this.cz = false;
                oib.this.moa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                oib.this.lw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                oib.this.ivm = 0;
                if (oib.this.uef != null) {
                    oib.this.uef.uef(view, oib.this.bcc);
                }
                oib.this.dj = false;
            } else if (action == 3) {
                oib.this.dj = false;
            }
            return !oib.this.yo;
        }
    };

    public interface uef {
        boolean gzw();

        void uef(View view, boolean z2);
    }

    public oib(uef uefVar) {
        this.uef = uefVar;
    }

    public void uef(View view) {
        if (view != null) {
            view.setOnTouchListener(this.zjm);
        }
    }

    public void uef(boolean z2) {
        this.yo = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iYo = af.yo(com.bytedance.sdk.openadsdk.core.sy.uef().getApplicationContext());
        int iLw = af.lw(com.bytedance.sdk.openadsdk.core.sy.uef().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f10 = iYo;
        if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
            return true;
        }
        float f11 = iLw;
        return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
    }
}

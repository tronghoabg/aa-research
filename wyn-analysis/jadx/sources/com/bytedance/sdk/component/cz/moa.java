package com.bytedance.sdk.component.cz;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class moa extends yo {
    private float bcc;
    private float cz;
    private View.OnTouchListener ivm;
    private final ivm lw;
    private final Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private final int f24977oa;
    private final View.OnTouchListener uef;
    private long xs = -1;
    private final long yo;
    private String zjm;

    public moa(Context context, View.OnTouchListener onTouchListener, int i5, long j8, ivm ivmVar) {
        this.moa = context;
        this.uef = onTouchListener;
        this.f24977oa = i5;
        this.yo = j8;
        this.lw = ivmVar;
    }

    private boolean uef(long j8) {
        long j10 = this.xs;
        if (j10 == -1) {
            this.xs = j8;
            return false;
        }
        int i5 = this.f24977oa;
        if (i5 == 1) {
            if (j8 - j10 <= this.yo) {
                return true;
            }
            this.xs = j8;
            return false;
        }
        if (i5 == 2) {
            if (j8 - j10 <= this.yo) {
                this.xs = j8;
                return true;
            }
            this.xs = j8;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        moa moaVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x5 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            moaVar = this;
            moaVar.bcc = x5;
            moaVar.cz = y10;
        } else if (action != 1) {
            moaVar = this;
        } else {
            moaVar = this;
            if (moaVar.uef(x5, y10, this.bcc, this.cz, this.moa)) {
                if (uef(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    uef(1, x5, y10);
                } else {
                    uef(0, x5, y10);
                }
            }
        }
        View.OnTouchListener onTouchListener = moaVar.uef;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = moaVar.ivm;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private void uef(int i5, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i5);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.f24977oa);
            jSONObject.put("lp_click_interval", this.yo);
        } catch (Throwable th) {
            dhk.uef("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (com.bytedance.sdk.component.cz.uef.uef.uef().oa() != null) {
            com.bytedance.sdk.component.cz.uef.oa oaVarOa = com.bytedance.sdk.component.cz.uef.uef.uef().oa();
            ivm ivmVar = this.lw;
            oaVarOa.uef(ivmVar != null ? ivmVar.getMaterialMeta() : null, this.zjm, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void uef(String str) {
        this.zjm = str;
    }

    @Override // com.bytedance.sdk.component.cz.yo
    public void uef(View.OnTouchListener onTouchListener) {
        this.ivm = onTouchListener;
    }
}

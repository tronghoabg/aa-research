package com.bytedance.adsdk.ugeno.core.oa;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.core.wk;

/* loaded from: classes.dex */
public class yo {
    private final int ivm;
    private boolean lw;
    private Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24689oa;
    private float uef;
    private cq yo;

    public yo(Context context, cq cqVar) {
        this.moa = context;
        this.yo = cqVar;
        this.ivm = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean uef(wk wkVar, com.bytedance.adsdk.ugeno.oa.yo yoVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.uef = motionEvent.getX();
            this.f24689oa = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x5 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x5 - this.uef) >= this.ivm || Math.abs(y10 - this.f24689oa) >= this.ivm) {
                    this.lw = true;
                }
            } else if (action == 3) {
                this.lw = false;
            }
        } else {
            if (this.lw) {
                this.lw = false;
                return false;
            }
            float x10 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x10 - this.uef) >= this.ivm || Math.abs(y11 - this.f24689oa) >= this.ivm) {
                this.lw = false;
            } else if (wkVar != null) {
                wkVar.uef(this.yo, yoVar, yoVar);
                return true;
            }
        }
        return true;
    }
}

package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.xs.cz;

/* loaded from: classes.dex */
public class dj extends yo implements cz.uef {
    private Handler cq;
    private int dj;
    private boolean wrv;

    public dj(Context context) {
        super(context);
        this.dj = 500;
        this.cq = new com.bytedance.adsdk.ugeno.xs.cz(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        Object obj = this.lw.get("delay");
        if (obj == null) {
            this.dj = 500;
        } else {
            this.dj = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj), 500);
        }
        return uef(this.f24741oa, motionEvent);
    }

    private boolean uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.moa.dj djVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.cq.sendEmptyMessageDelayed(1102, this.dj);
        } else {
            if (action == 1) {
                if (this.wrv && (djVar = this.uef) != null) {
                    djVar.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
                    this.wrv = false;
                    Handler handler = this.cq;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.cq;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.wrv = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.cq;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.wrv = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.xs.cz.uef
    public void uef(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.wrv = true;
        Handler handler = this.cq;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}

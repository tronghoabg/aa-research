package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.xs.cz;

/* loaded from: classes.dex */
public class wrv extends yo implements cz.uef {
    private int dj;
    private Handler wrv;

    public wrv(Context context) {
        super(context);
        this.dj = 500;
        this.wrv = new com.bytedance.adsdk.ugeno.xs.cz(Looper.getMainLooper(), this);
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
        int action = motionEvent.getAction();
        if (action == 0) {
            this.wrv.sendEmptyMessageDelayed(1101, this.dj);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.wrv.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.xs.cz.uef
    public void uef(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.moa.dj djVar = this.uef;
        if (djVar != null) {
            djVar.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
        }
        Handler handler = this.wrv;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}

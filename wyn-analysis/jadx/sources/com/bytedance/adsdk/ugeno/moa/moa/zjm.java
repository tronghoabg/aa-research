package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.xs.cz;
import java.util.Map;

/* loaded from: classes.dex */
public class zjm extends yo implements cz.uef {
    private Handler cq;
    private int dj;
    private int dz;
    private int wrv;

    public zjm(Context context) {
        super(context);
        this.wrv = 0;
        this.cq = new com.bytedance.adsdk.ugeno.xs.cz(Looper.getMainLooper(), this);
        this.dz = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        Map<String, Object> map = this.lw;
        if (map != null) {
            Object obj = map.get("loop");
            if (obj != null) {
                this.dj = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj), 1);
            } else {
                this.dj = 1;
            }
            int i5 = this.dj;
            if (i5 <= 0) {
                this.dz = -1;
            } else {
                this.dz = i5;
            }
            Object obj2 = this.lw.get("duration");
            if (obj2 == null) {
                this.wrv = 0;
            } else {
                this.wrv = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj2), 0);
            }
        }
        this.cq.sendEmptyMessageDelayed(1001, this.wrv);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.xs.cz.uef
    public void uef(Message message) {
        int i5;
        int i10;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.dz);
        this.uef.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
        int i11 = this.dz + (-1);
        this.dz = i11;
        if (i11 < 0 && (i10 = this.wrv) != 0) {
            this.cq.sendEmptyMessageDelayed(1001, i10);
        } else if (i11 > 0 && (i5 = this.wrv) != 0) {
            this.cq.sendEmptyMessageDelayed(1001, i5);
        } else {
            this.cq.removeMessages(1001);
        }
    }
}

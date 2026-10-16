package com.bytedance.sdk.openadsdk.component.ivm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
public class oa implements Handler.Callback {
    private long dj;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.bcc.uef f25340oa;
    private boolean wrv;
    private boolean xs;
    private uef yo;
    private long zjm;
    private Handler uef = new Handler(Looper.myLooper(), this);
    private int moa = 0;
    private int lw = 5;
    private int ivm = 0;
    private final int bcc = 1000;
    private int cz = 1000;

    public oa(com.bytedance.sdk.openadsdk.component.bcc.uef uefVar) {
        this.f25340oa = uefVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.uef != null) {
            int i5 = message.arg1;
            uef(i5);
            if (i5 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i5 - 1;
                this.uef.sendMessageDelayed(messageObtain, this.cz);
            }
        }
        return true;
    }

    public void lw() {
        this.uef.removeCallbacksAndMessages(null);
        this.uef = null;
    }

    public void moa() {
        Handler handler = this.uef;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void oa(int i5) {
        this.ivm = Math.min(i5, this.lw);
    }

    public void uef(int i5) {
        this.moa = i5;
        int i10 = this.lw - i5;
        this.f25340oa.oa(i10 * 1000);
        boolean z2 = true;
        if (i5 <= 0) {
            uef uefVar = this.yo;
            if (uefVar != null && !this.xs) {
                uefVar.oa();
                this.xs = true;
            }
            i5 = 0;
        }
        uef uefVar2 = this.yo;
        if (uefVar2 != null) {
            int iMax = Math.max(this.ivm - i10, 0);
            if (i5 != 0 && i10 < this.ivm) {
                z2 = false;
            }
            uefVar2.uef(iMax, z2);
        }
    }

    public void yo() {
        if (this.uef != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.moa;
            this.uef.sendMessage(messageObtain);
        }
    }

    public void oa() {
        Handler handler = this.uef;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.lw, 0));
        }
    }

    public void uef(float f10) {
        int i5 = (int) f10;
        this.lw = i5;
        if (i5 <= 0) {
            this.lw = 5;
        }
    }

    public void uef(uef uefVar) {
        this.yo = uefVar;
    }

    public int uef() {
        return this.ivm;
    }

    public void uef(int i5, float f10, boolean z2) {
        com.bytedance.sdk.openadsdk.component.bcc.uef uefVar;
        if ((i5 == 1 || i5 == 2) && this.wrv != z2) {
            this.wrv = z2;
            if (i5 == 1 && (uefVar = this.f25340oa) != null) {
                uefVar.uef(z2);
            }
            if (z2) {
                try {
                    this.cz = (int) (1000.0f / f10);
                    this.dj = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.dj) + this.zjm;
                this.zjm = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.bcc.uef uefVar2 = this.f25340oa;
                if (uefVar2 != null) {
                    uefVar2.uef(jCurrentTimeMillis);
                }
            }
            this.cz = 1000;
        }
    }
}

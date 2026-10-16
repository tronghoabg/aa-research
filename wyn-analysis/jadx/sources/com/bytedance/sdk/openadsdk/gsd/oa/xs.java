package com.bytedance.sdk.openadsdk.gsd.oa;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.dhk;

/* loaded from: classes3.dex */
public class xs {

    /* renamed from: oa, reason: collision with root package name */
    private static HandlerThread f25914oa;
    private static uef uef;

    public static class uef extends Handler {
        public uef(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            oa oaVar = (oa) message.obj;
            if (oaVar == null) {
                return;
            }
            int iOa = oaVar.oa();
            if (iOa == 1) {
                oaVar.xs();
            } else {
                if (iOa != 2) {
                    lw.oa(oaVar.dj());
                    return;
                }
                oaVar.bcc();
            }
            if (oaVar.cz()) {
                lw.oa(oaVar.dj());
            } else if (oaVar.wrv()) {
                uef(oaVar);
            }
        }

        public void uef(oa oaVar) {
            if (oaVar == null) {
                return;
            }
            int iIntValue = oaVar.dj().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = oaVar;
            sendMessageDelayed(messageObtain, oaVar.ivm());
        }
    }

    public static void oa(oa oaVar) {
        if (oaVar == null || uef == null) {
            return;
        }
        try {
            int iIntValue = oaVar.dj().intValue();
            if (uef.hasMessages(iIntValue)) {
                uef.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void uef() {
    }

    public static void uef(oa oaVar) {
        if (oaVar == null) {
            return;
        }
        oa();
        uef uefVar = uef;
        if (uefVar != null) {
            uefVar.uef(oaVar);
        }
    }

    public static void oa() {
        if (uef != null) {
            return;
        }
        try {
            HandlerThread handlerThread = f25914oa;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (xs.class) {
                try {
                    HandlerThread handlerThread2 = f25914oa;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        f25914oa = com.bytedance.sdk.component.utils.bcc.uef("pag_MRC");
                        uef = new uef(f25914oa.getLooper());
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            dhk.yo("MRC", th.getMessage());
        }
    }
}

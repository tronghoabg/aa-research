package com.bytedance.sdk.component.bcc.uef;

import android.os.Handler;
import com.bytedance.sdk.component.utils.bcc;
import com.bytedance.sdk.component.utils.ue;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private Handler f24968oa;
    private final moa<oa> uef;

    /* renamed from: com.bytedance.sdk.component.bcc.uef.uef$uef, reason: collision with other inner class name */
    public static class C0058uef {
        private static final uef uef = new uef();
    }

    public Handler oa() {
        if (this.f24968oa == null) {
            synchronized (uef.class) {
                try {
                    if (this.f24968oa == null) {
                        this.f24968oa = uef("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f24968oa;
    }

    private uef() {
        this.uef = moa.uef(2);
    }

    public static uef uef() {
        return C0058uef.uef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.bcc.uef.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    uef.this.uef(handler, handler2);
                }
            }, 1000L);
        }
    }

    private oa oa(ue.uef uefVar, String str) {
        return new oa(bcc.uef(str), uefVar);
    }

    public ue uef(ue.uef uefVar, final String str) {
        oa oaVar = (oa) this.uef.uef();
        if (oaVar != null) {
            oaVar.uef(uefVar);
            oaVar.post(new Runnable() { // from class: com.bytedance.sdk.component.bcc.uef.uef.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return oaVar;
        }
        return oa(uefVar, str);
    }

    public ue uef(String str) {
        return uef((ue.uef) null, str);
    }

    public boolean uef(ue ueVar) {
        if (!(ueVar instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) ueVar;
        if (this.uef.uef((moa<oa>) oaVar)) {
            return true;
        }
        oaVar.oa();
        return true;
    }
}

package com.bytedance.sdk.openadsdk.moa;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class dz {
    private static volatile dz uef;
    private Map<String, Object> moa;
    private oa yo = oa.uef();

    /* renamed from: oa, reason: collision with root package name */
    private final Handler f25948oa = new Handler(com.bytedance.sdk.openadsdk.core.wk.oa().getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.moa.dz.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 100) {
                return true;
            }
            Object obj = message.obj;
            uef uefVar = (obj == null || !(obj instanceof uef)) ? null : (uef) obj;
            if (uefVar == null) {
                return true;
            }
            dz.this.oa(uefVar);
            return true;
        }
    });

    public static class oa {
        public int uef = 300;

        /* renamed from: oa, reason: collision with root package name */
        public int f25949oa = 6000;

        private oa() {
        }

        public static oa uef() {
            return new oa();
        }
    }

    public static class uef implements Serializable, Runnable {
        public Map<String, Object> lw;
        public String moa;
        public gzw yo;
        public final AtomicInteger uef = new AtomicInteger(0);

        /* renamed from: oa, reason: collision with root package name */
        public final AtomicBoolean f25950oa = new AtomicBoolean(false);
        private final long ivm = SystemClock.elapsedRealtime();

        public uef(gzw gzwVar, String str, Map<String, Object> map) {
            this.yo = gzwVar;
            this.moa = str;
            this.lw = map;
        }

        public static uef uef(gzw gzwVar, String str, Map<String, Object> map) {
            return new uef(gzwVar, str, map);
        }

        public void oa() {
            this.uef.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.yo == null || TextUtils.isEmpty(this.moa)) {
                return;
            }
            String str = this.f25950oa.get() ? "dpl_success" : "dpl_failed";
            if (this.lw == null) {
                this.lw = new HashMap();
            }
            gzw gzwVar = this.yo;
            if (gzwVar != null && gzwVar.orw() == 0) {
                Map<String, Object> map = this.lw;
                gzw gzwVar2 = this.yo;
                map.put("auto_click", Boolean.valueOf((gzwVar2 == null || gzwVar2.oib()) ? false : true));
            }
            this.lw.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.ab.uef().yo()));
            this.lw.put("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.ivm));
            yo.uef(this.yo, this.moa, str, this.lw);
        }

        public uef uef(boolean z2) {
            this.f25950oa.set(z2);
            return this;
        }

        public int uef() {
            return this.uef.get();
        }
    }

    private dz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(uef uefVar) {
        if (uefVar == null) {
            return;
        }
        boolean zMoa = com.bytedance.sdk.openadsdk.core.ab.uef().moa();
        boolean zUef = com.bytedance.sdk.openadsdk.core.ab.uef().uef(true);
        if (!zMoa && zUef) {
            uef(uefVar);
            return;
        }
        if (uefVar.lw == null) {
            uefVar.lw = new HashMap();
        }
        uefVar.lw.put("is_background", Boolean.valueOf(zMoa));
        uefVar.lw.put("has_focus", Boolean.valueOf(zUef));
        yo(uefVar.uef(true));
    }

    private void yo(uef uefVar) {
        if (uefVar == null) {
            return;
        }
        this.f25948oa.post(uefVar);
    }

    public static dz uef() {
        if (uef == null) {
            synchronized (dz.class) {
                try {
                    if (uef == null) {
                        uef = new dz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public dz uef(Map<String, Object> map) {
        this.moa = map;
        return uef();
    }

    public void uef(gzw gzwVar, String str) {
        Message messageObtainMessage = this.f25948oa.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = uef.uef(gzwVar, str, this.moa);
        messageObtainMessage.sendToTarget();
    }

    private void uef(uef uefVar) {
        if (uefVar == null) {
            return;
        }
        uefVar.oa();
        int iUef = uefVar.uef();
        oa oaVar = this.yo;
        if (iUef * oaVar.uef > oaVar.f25949oa) {
            yo(uefVar.uef(false));
            return;
        }
        Message messageObtainMessage = this.f25948oa.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = uefVar;
        this.f25948oa.sendMessageDelayed(messageObtainMessage, this.yo.uef);
    }
}

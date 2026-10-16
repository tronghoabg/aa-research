package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wk {
    private static final Runnable bcc;
    private static volatile HandlerThread ivm = null;
    public static long moa = 0;
    public static volatile boolean uef = false;
    public static long yo;

    /* renamed from: oa, reason: collision with root package name */
    public static AtomicBoolean f25784oa = new AtomicBoolean(false);
    private static volatile int lw = 0;
    private static volatile Handler xs = null;

    static {
        HandlerThread handlerThread = new HandlerThread("pag_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.wk.1
            boolean uef = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.uef) {
                    return;
                }
                this.uef = true;
                super.start();
            }
        };
        ivm = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.bcc.uef(ivm);
        moa = System.currentTimeMillis();
        bcc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.settings.dj.oa().xvp()) {
                    wk.ivm();
                    return;
                }
                String strOa = com.bytedance.sdk.openadsdk.core.settings.dj.oa(sy.uef());
                int iUef = com.bytedance.sdk.openadsdk.core.settings.dj.uef(sy.uef());
                if (!TextUtils.equals(strOa, com.bytedance.sdk.openadsdk.core.settings.dj.moa) || iUef != com.bytedance.sdk.openadsdk.core.settings.dj.lw) {
                    com.bytedance.sdk.openadsdk.core.settings.dj.oa().uef(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.dj.moa = strOa;
                    com.bytedance.sdk.openadsdk.core.settings.dj.lw = iUef;
                }
                wk.ivm();
            }
        };
    }

    public static void ivm() {
        Handler handlerOa = oa();
        Runnable runnable = bcc;
        handlerOa.removeCallbacks(runnable);
        oa().postDelayed(runnable, 10000L);
    }

    public static boolean lw() {
        return moa() == 1;
    }

    public static int moa() {
        return lw;
    }

    public static Handler oa() {
        if (ivm == null || !ivm.isAlive()) {
            synchronized (wk.class) {
                try {
                    if (ivm == null || !ivm.isAlive()) {
                        ivm = com.bytedance.sdk.component.utils.bcc.uef("pag_init_handle", -1);
                        xs = new Handler(ivm.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (xs == null) {
            synchronized (wk.class) {
                try {
                    if (xs == null) {
                        xs = new Handler(ivm.getLooper());
                    }
                } finally {
                }
            }
        }
        return xs;
    }

    public static void uef(long j8) {
        moa = j8;
    }

    public static void xs() {
        oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.wk.3.1
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            return AbstractC1593a.f("init");
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.yo("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static Handler yo() {
        return new Handler(Looper.getMainLooper());
    }

    public static long uef() {
        return moa;
    }

    public static void uef(int i5) {
        lw = i5;
    }

    public static void uef(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                if ("mediation".equals(jSONObject.optString(MediationMetaData.KEY_NAME, ""))) {
                    zjm.oa().oa(jSONObject.optString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("InitHelper", th.getMessage());
        }
    }
}

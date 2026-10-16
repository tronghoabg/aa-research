package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.bcc.oa.xs;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class km {
    private static volatile com.bytedance.sdk.component.bcc.oa.xs bcc;
    private static volatile com.bytedance.sdk.component.bcc.oa.xs cz;
    private static volatile com.bytedance.sdk.component.bcc.oa.xs dj;
    private static volatile com.bytedance.sdk.component.bcc.oa.xs ivm;
    private static volatile com.bytedance.sdk.component.bcc.oa.xs lw;
    private static volatile com.bytedance.sdk.component.bcc.oa.xs moa;

    /* renamed from: oa, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f26153oa;
    private static volatile ScheduledExecutorService uef;
    private static volatile com.bytedance.sdk.component.bcc.oa.xs wrv;
    private static volatile com.bytedance.sdk.component.bcc.oa.xs xs;
    private static volatile boolean yo;
    private static volatile com.bytedance.sdk.component.bcc.oa.xs zjm;

    static {
        com.bytedance.sdk.component.bcc.oa.moa.uef(new com.bytedance.sdk.component.bcc.oa.uef() { // from class: com.bytedance.sdk.openadsdk.utils.km.1
            @Override // com.bytedance.sdk.component.bcc.oa.uef
            public void uef(com.bytedance.sdk.component.bcc.oa.xs xsVar, com.bytedance.sdk.component.bcc.oa.yo yoVar) {
                yoVar.getName();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.bcc.uef.uef(new com.bytedance.sdk.component.uef() { // from class: com.bytedance.sdk.openadsdk.utils.km.2
            @Override // com.bytedance.sdk.component.uef
            public void uef(Runnable runnable) {
                km.yo(runnable);
            }
        });
        f26153oa = null;
        yo = false;
    }

    private static com.bytedance.sdk.component.bcc.oa.xs ab() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = dj;
        if (!uef(xsVar2)) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (uef(dj)) {
                    try {
                        dj = uef("imgdisk", dj);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (dj == null) {
                        dj = bs();
                    }
                }
                xsVar = dj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    public static ExecutorService bcc() {
        return wk();
    }

    private static com.bytedance.sdk.component.bcc.oa.xs bs() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = wrv;
        if (xsVar2 != null) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (wrv == null) {
                    try {
                        wrv = oa(BuildConfig.FLAVOR).uef();
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                xsVar = wrv;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    private static com.bytedance.sdk.component.bcc.oa.xs cq() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = lw;
        if (!uef(xsVar2)) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (uef(lw)) {
                    try {
                        lw = uef("log", lw);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (lw == null) {
                        lw = bs();
                    }
                }
                xsVar = lw;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    public static com.bytedance.sdk.component.bcc.oa.xs cz() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = ivm;
        if (!uef(xsVar2)) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (uef(ivm)) {
                    try {
                        ivm = uef("cache", ivm);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (ivm == null) {
                        ivm = bs();
                    }
                }
                xsVar = ivm;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    public static com.bytedance.sdk.component.bcc.oa.xs dj() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = zjm;
        if (!uef(xsVar2)) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (uef(zjm)) {
                    try {
                        zjm = uef("net", zjm);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (zjm == null) {
                        zjm = bs();
                    }
                }
                xsVar = zjm;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    private static com.bytedance.sdk.component.bcc.oa.xs dz() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = bcc;
        if (!uef(xsVar2)) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (uef(bcc)) {
                    try {
                        bcc = uef("image", bcc);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (bcc == null) {
                        bcc = bs();
                    }
                }
                xsVar = bcc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    public static boolean ivm() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService lw() {
        return cz();
    }

    public static ExecutorService moa() {
        return cq();
    }

    public static ExecutorService oa() {
        return dz();
    }

    public static ScheduledExecutorService uef() {
        if (uef == null) {
            synchronized (km.class) {
                try {
                    if (uef == null) {
                        uef = Executors.newSingleThreadScheduledExecutor(new com.bytedance.sdk.component.bcc.oa.lw("scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    private static com.bytedance.sdk.component.bcc.oa.xs wk() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = xs;
        if (!uef(xsVar2)) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (uef(xs)) {
                    try {
                        xs = uef("io", xs);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (xs == null) {
                        xs = bs();
                    }
                }
                xsVar = xs;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    private static ThreadPoolExecutor wrv() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = moa;
        if (!uef(xsVar2)) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (uef(moa)) {
                    try {
                        moa = uef("ad", moa);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (moa == null) {
                        moa = bs();
                    }
                }
                xsVar = moa;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    public static boolean xs() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    public static ExecutorService yo() {
        return ab();
    }

    public static com.bytedance.sdk.component.bcc.oa.xs zjm() {
        com.bytedance.sdk.component.bcc.oa.xs xsVar;
        com.bytedance.sdk.component.bcc.oa.xs xsVar2 = cz;
        if (!uef(xsVar2)) {
            return xsVar2;
        }
        synchronized (km.class) {
            try {
                if (uef(cz)) {
                    try {
                        cz = uef("express", cz);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (cz == null) {
                        cz = bs();
                    }
                }
                xsVar = cz;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    public static void lw(com.bytedance.sdk.component.bcc.oa.yo yoVar) {
        dj().execute(yoVar);
    }

    public static void moa(com.bytedance.sdk.component.bcc.oa.yo yoVar) {
        if (lz.uef) {
            return;
        }
        wrv().execute(yoVar);
    }

    public static void oa(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.wk.yo().removeCallbacks(runnable);
    }

    public static void yo(Runnable runnable) {
        if (lz.uef) {
            return;
        }
        wk().execute(runnable);
    }

    public static void oa(com.bytedance.sdk.component.bcc.oa.yo yoVar) {
        if (yoVar == null || lz.uef) {
            return;
        }
        cq().execute(yoVar);
    }

    public static void yo(com.bytedance.sdk.component.bcc.oa.yo yoVar) {
        if (yoVar == null || lz.uef) {
            return;
        }
        wrv().execute(yoVar);
    }

    public static void oa(com.bytedance.sdk.component.bcc.oa.yo yoVar, int i5) {
        if (yoVar == null || lz.uef) {
            return;
        }
        yoVar.setPriority(i5);
        cq().execute(yoVar);
    }

    public static void uef(Runnable runnable) {
        if (runnable == null || lz.uef) {
            return;
        }
        if (ivm()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.wk.yo().post(runnable);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bytedance.sdk.component.bcc.oa.xs.uef oa(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.km.oa(java.lang.String):com.bytedance.sdk.component.bcc.oa.xs$uef");
    }

    public static void uef(com.bytedance.sdk.component.bcc.oa.yo yoVar) {
        if (lz.uef) {
            return;
        }
        cz().execute(yoVar);
    }

    public static void uef(com.bytedance.sdk.component.bcc.oa.yo yoVar, int i5) {
        if (yoVar == null || lz.uef) {
            return;
        }
        yoVar.setPriority(i5);
        wk().execute(yoVar);
    }

    private static boolean uef(com.bytedance.sdk.component.bcc.oa.xs xsVar) {
        if (xsVar != null) {
            return !xsVar.uef() && com.bytedance.sdk.openadsdk.core.settings.dj.uu();
        }
        return true;
    }

    private static com.bytedance.sdk.component.bcc.oa.xs uef(String str, com.bytedance.sdk.component.bcc.oa.xs xsVar) {
        xs.uef uefVarUef = uef(str);
        if (xsVar == null) {
            return uefVarUef.uef();
        }
        xsVar.uef(uefVarUef);
        return xsVar;
    }

    private static xs.uef uef(String str) {
        xs.uef uefVarOa = oa(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.dj.uu()) {
                uefVarOa.oa(true);
                JSONObject jSONObjectAos = com.bytedance.sdk.openadsdk.core.settings.dj.oa().aos();
                JSONObject jSONObjectOptJSONObject = jSONObjectAos != null ? jSONObjectAos.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    uefVarOa.oa(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        uefVarOa.uef(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        uefVarOa.oa(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        uefVarOa.yo(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        uefVarOa.uef(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        uefVarOa.uef(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                        return uefVarOa;
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return uefVarOa;
    }
}

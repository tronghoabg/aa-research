package com.bytedance.adsdk.oa;

import android.content.Context;
import android.os.Trace;
import com.google.android.gms.internal.consent_sdk.a;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import wg.b;

/* loaded from: classes.dex */
public class lw {
    private static int bcc = 0;
    private static com.bytedance.adsdk.oa.moa.ivm cz = null;
    private static volatile com.bytedance.adsdk.oa.moa.bcc dj = null;
    private static long[] ivm = null;
    private static String[] lw = null;
    private static boolean moa = true;

    /* renamed from: oa, reason: collision with root package name */
    private static boolean f24564oa = false;
    public static boolean uef = false;
    private static volatile com.bytedance.adsdk.oa.moa.xs wrv = null;
    private static int xs = 0;
    private static boolean yo = true;
    private static com.bytedance.adsdk.oa.moa.lw zjm;

    public static float oa(String str) {
        int i5 = bcc;
        if (i5 > 0) {
            bcc = i5 - 1;
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (!f24564oa) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i10 = xs - 1;
        xs = i10;
        if (i10 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(lw[i10])) {
            throw new IllegalStateException(b.c(a.w("Unbalanced trace call ", str, ". Expected "), lw[xs], "."));
        }
        Trace.endSection();
        return (System.nanoTime() - ivm[xs]) / 1000000.0f;
    }

    public static void uef(String str) {
        if (f24564oa) {
            int i5 = xs;
            if (i5 == 20) {
                bcc++;
                return;
            }
            lw[i5] = str;
            ivm[i5] = System.nanoTime();
            Trace.beginSection(str);
            xs++;
        }
    }

    public static com.bytedance.adsdk.oa.moa.bcc uef(Context context) {
        com.bytedance.adsdk.oa.moa.bcc bccVar;
        com.bytedance.adsdk.oa.moa.bcc bccVar2 = dj;
        if (bccVar2 != null) {
            return bccVar2;
        }
        synchronized (com.bytedance.adsdk.oa.moa.bcc.class) {
            try {
                bccVar = dj;
                if (bccVar == null) {
                    com.bytedance.adsdk.oa.moa.xs xsVarOa = oa(context);
                    com.bytedance.adsdk.oa.moa.ivm oaVar = cz;
                    if (oaVar == null) {
                        oaVar = new com.bytedance.adsdk.oa.moa.oa();
                    }
                    bccVar = new com.bytedance.adsdk.oa.moa.bcc(xsVarOa, oaVar);
                    dj = bccVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bccVar;
    }

    public static boolean uef() {
        return moa;
    }

    public static com.bytedance.adsdk.oa.moa.xs oa(Context context) {
        com.bytedance.adsdk.oa.moa.xs xsVar;
        if (!yo) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.oa.moa.xs xsVar2 = wrv;
        if (xsVar2 != null) {
            return xsVar2;
        }
        synchronized (com.bytedance.adsdk.oa.moa.xs.class) {
            try {
                xsVar = wrv;
                if (xsVar == null) {
                    com.bytedance.adsdk.oa.moa.lw lwVar = zjm;
                    if (lwVar == null) {
                        lwVar = new com.bytedance.adsdk.oa.moa.lw() { // from class: com.bytedance.adsdk.oa.lw.1
                            @Override // com.bytedance.adsdk.oa.moa.lw
                            public File uef() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    xsVar = new com.bytedance.adsdk.oa.moa.xs(lwVar);
                    wrv = xsVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xsVar;
    }
}

package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class gr {
    private static final Object uef = new Object();

    /* renamed from: oa, reason: collision with root package name */
    private static final Map<uef, Object> f25098oa = new ConcurrentHashMap();
    private static final AtomicInteger yo = new AtomicInteger();
    private static AtomicBoolean moa = new AtomicBoolean(false);
    private static volatile int lw = -1;
    private static volatile long ivm = 0;
    private static volatile int xs = 60000;
    private static oib bcc = null;
    private static final AtomicBoolean cz = new AtomicBoolean(false);

    public static class oa extends BroadcastReceiver {
        private oa() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                gr.oa(context, intent, gr.yo.get() > 0, false);
            } catch (Throwable unused) {
            }
        }
    }

    public interface uef {
        void uef(Context context, Intent intent, boolean z2, int i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(final Context context, final Intent intent, final boolean z2, final boolean z10) {
        if (!z2 && z10) {
            lw = 0;
        } else if (cz.compareAndSet(false, true)) {
            com.bytedance.sdk.component.bcc.uef.uef(new Runnable() { // from class: com.bytedance.sdk.component.utils.gr.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = gr.lw = z10 ? 0 : gr.oa(context);
                    gr.cz.set(false);
                    boolean z11 = gr.lw == 0;
                    boolean z12 = z2;
                    if ((z12 || !z11) && z12) {
                        gr.oa(context, intent, gr.lw, z10);
                    }
                }
            });
        }
    }

    private static int yo(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        oib oibVar = bcc;
                        return (oibVar == null || !oibVar.uef(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(Context context, Intent intent, int i5, boolean z2) {
        Map<uef, Object> map = f25098oa;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (uef uefVar : map.keySet()) {
            if (uefVar != null) {
                try {
                    uefVar.uef(context, intent, !z2, i5);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int uef(Context context, long j8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (ivm + j8 <= jElapsedRealtime) {
            return oa(context);
        }
        if (lw == -1) {
            return oa(context);
        }
        if (jElapsedRealtime - ivm >= xs) {
            oa(context, (Intent) null, false, false);
        }
        return lw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int oa(Context context) {
        lw = yo(context);
        ivm = SystemClock.elapsedRealtime();
        return lw;
    }

    public static void uef(uef uefVar, Context context) {
        if (uefVar == null) {
            return;
        }
        if (!moa.get()) {
            try {
                context.registerReceiver(new oa(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                moa.set(true);
            } catch (Throwable unused) {
            }
        }
        Map<uef, Object> map = f25098oa;
        map.put(uefVar, uef);
        yo.set(map.size());
    }

    public static void uef(uef uefVar) {
        if (uefVar == null) {
            return;
        }
        Map<uef, Object> map = f25098oa;
        map.remove(uefVar);
        yo.set(map.size());
    }
}

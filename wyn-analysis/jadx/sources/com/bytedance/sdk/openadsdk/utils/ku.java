package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class ku {
    private static volatile boolean moa = true;

    /* renamed from: oa, reason: collision with root package name */
    private static String f26154oa;
    private static String uef;
    private static String yo;

    public static class uef extends com.bytedance.sdk.component.bcc.oa.yo {
        public static AtomicBoolean uef = new AtomicBoolean(false);

        /* renamed from: oa, reason: collision with root package name */
        private static final AtomicLong f26155oa = new AtomicLong(0);

        public uef(String str, int i5) {
            super(str, i5);
        }

        public static void uef() {
            if (uef.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = f26155oa;
            if (jCurrentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            km.yo((Runnable) new uef("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            uef.set(true);
            ku.lw();
            uef.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lw() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.sy.uef() == null) {
            return;
        }
        moa = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.sy.uef().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    moa = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo("SimUtils", th.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                uef = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                f26154oa = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            yo = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String oa() {
        try {
            uef.uef();
            if (!moa) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                sb2.append(moa ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.dhk.yo("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.sy.uef().getResources().getConfiguration();
            int i5 = configuration.mcc;
            String strValueOf = i5 != 0 ? String.valueOf(i5) : f26154oa;
            com.bytedance.sdk.component.utils.dhk.yo("MCC", "config=" + configuration.mcc + ",sMCC=" + f26154oa);
            return strValueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String uef() {
        uef.uef();
        return uef;
    }

    public static String yo() {
        uef.uef();
        return yo;
    }
}

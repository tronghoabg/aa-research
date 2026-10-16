package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cq {
    private static boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private static String f25501oa;
    private static String uef;
    private static String yo;

    private static void ivm(Context context) {
        if (moa(context) == null) {
            return;
        }
        String strOa = yo.uef().oa("abcd", (String) null);
        if (TextUtils.isEmpty(strOa)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strOa);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            if (iOptInt == 3) {
                String strYo = com.bytedance.sdk.component.utils.uef.yo(strOptString);
                if (TextUtils.isEmpty(strYo)) {
                    return;
                }
                uef = new JSONObject(strYo).optString("abcd");
                uef();
            }
        } catch (Throwable unused) {
        }
    }

    private static void lw(Context context) {
        if (moa || moa(context) == null) {
            return;
        }
        f25501oa = String.valueOf(Build.TIME);
        yo = yo.uef().oa("uuid", (String) null);
        moa = true;
    }

    private static Context moa(Context context) {
        return context == null ? sy.uef() : context;
    }

    public static String oa(Context context) {
        if (f25501oa == null && !moa) {
            synchronized (cq.class) {
                try {
                    if (!moa) {
                        lw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25501oa;
    }

    public static String uef(Context context) {
        if (!TextUtils.isEmpty(uef)) {
            return uef;
        }
        ivm(context);
        return uef;
    }

    public static String yo(Context context) {
        if (TextUtils.isEmpty(yo) && !moa) {
            synchronized (cq.class) {
                try {
                    if (!moa) {
                        lw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return yo;
    }

    public static void uef(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(uef)) {
                uef = str;
            }
            uef();
        }
        if (TextUtils.isEmpty(uef)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.wrv.yo.oa(uef);
        wrv.uef(uef);
    }

    public static String oa() {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(string)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void uef() {
        if (TextUtils.isEmpty(uef)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("update_did") { // from class: com.bytedance.sdk.openadsdk.core.cq.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", cq.uef);
                    yo.uef().uef("abcd", com.bytedance.sdk.component.utils.uef.uef(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}

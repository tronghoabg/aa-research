package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.gb;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public class yo {
    private static String uef;

    public static String bcc() {
        return com.bytedance.sdk.component.utils.sy.xs(com.bytedance.sdk.openadsdk.core.sy.uef());
    }

    public static String cz() {
        try {
            if (!TextUtils.isEmpty(uef)) {
                return uef;
            }
            String strUef = com.bytedance.sdk.openadsdk.core.zjm.uef("sdk_app_sha1", 259200000L);
            uef = strUef;
            if (uef(strUef)) {
                return uef;
            }
            String strUef2 = com.bytedance.sdk.component.utils.yo.uef(com.bytedance.sdk.openadsdk.core.sy.uef());
            uef = strUef2;
            if (!uef(strUef2)) {
                return "";
            }
            String upperCase = uef.toUpperCase();
            uef = upperCase;
            com.bytedance.sdk.openadsdk.core.zjm.uef("sdk_app_sha1", upperCase);
            return uef;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String ivm() {
        return gb.bcc();
    }

    public static long lw() {
        return gb.zjm(BuildConfig.VERSION_NAME);
    }

    public static int moa() {
        return BuildConfig.VERSION_CODE;
    }

    public static String oa() {
        return "1371";
    }

    public static String uef() {
        return "open_news";
    }

    public static String xs() {
        return com.bytedance.sdk.openadsdk.core.zjm.oa().bcc();
    }

    public static String yo() {
        return BuildConfig.VERSION_NAME;
    }

    public static String uef(Context context) {
        return com.bytedance.sdk.openadsdk.core.cq.uef(context);
    }

    private static boolean uef(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) != null && strArrSplit.length >= 20) {
            for (String str2 : strArrSplit) {
                if (!"00".equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

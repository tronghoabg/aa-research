package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;

/* loaded from: classes3.dex */
public class fz {
    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, Double d3) {
        if (gzwVar == null || gzwVar.hjx() == null) {
            return;
        }
        Map<String, Object> mapHjx = gzwVar.hjx();
        try {
            Object obj = gzwVar.hjx().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapHjx.get("nurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d3 != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d3));
                }
                com.bytedance.sdk.openadsdk.core.sy.yo().uef(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.dhk.yo("report Win error", new Object[0]);
        }
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, Double d3, String str, String str2) {
        if (gzwVar == null || gzwVar.hjx() == null) {
            return;
        }
        Map<String, Object> mapHjx = gzwVar.hjx();
        try {
            Object obj = gzwVar.hjx().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapHjx.get("lurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d3 != null) {
                    strReplace = strReplace.replace("${AUCTION_PRICE}", String.valueOf(d3));
                }
                if (str != null) {
                    strReplace = strReplace.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.sy.yo().uef(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.dhk.yo("report Loss error", new Object[0]);
        }
    }
}

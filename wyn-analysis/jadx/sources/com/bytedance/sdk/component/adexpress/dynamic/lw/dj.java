package com.bytedance.sdk.component.adexpress.dynamic.lw;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.lw.oa;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dj {

    /* renamed from: oa, reason: collision with root package name */
    private static String f24838oa;
    private static final Set<String> uef = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    public static double oa(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0462 A[Catch: Exception -> 0x0475, TryCatch #3 {Exception -> 0x0475, blocks: (B:227:0x0456, B:229:0x0462, B:234:0x046e), top: B:288:0x0456 }] */
    /* JADX WARN: Type inference failed for: r4v33, types: [boolean, com.bytedance.sdk.component.adexpress.dynamic.lw.oa$yo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.lw.oa.yo uef(java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, int r31, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc r32, double r33, int r35, double r36, java.lang.String r38, com.bytedance.sdk.component.adexpress.oa.cq r39) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.lw.dj.uef(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.oa.cq):com.bytedance.sdk.component.adexpress.dynamic.lw.oa$yo");
    }

    public static int[] oa(String str, float f10, boolean z2) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.moa.uef());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z2) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean oa() {
        return !TextUtils.isEmpty(f24838oa);
    }

    public static String uef(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static oa.yo uef(oa.yo yoVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            yoVar.uef = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            yoVar.f24846oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return yoVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = uef(str);
        }
        if (TextUtils.isEmpty(str3)) {
            yoVar.uef = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            yoVar.f24846oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return yoVar;
        }
        return uef(str3, str2);
    }

    public static oa.yo uef(String str, String str2) {
        return uef(str, str2, false);
    }

    public static oa.yo uef(String str, String str2, boolean z2) {
        oa.yo yoVar = new oa.yo();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrUef = uef(str, (float) oa(str2), z2);
            yoVar.uef = iArrUef[0];
            yoVar.f24846oa = iArrUef[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                yoVar.f24846oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } catch (Exception unused) {
        }
        return yoVar;
    }

    public static int[] uef(String str, float f10, boolean z2) {
        int[] iArrOa = oa(str, f10, z2);
        return new int[]{com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), iArrOa[0]), com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), iArrOa[1])};
    }

    public static String uef() {
        return f24838oa;
    }
}

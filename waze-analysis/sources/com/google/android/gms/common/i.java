package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.PendingIntentCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4949a;

    /* renamed from: b, reason: collision with root package name */
    private static final i f4950b;

    static {
        boolean z = ag.f4671a;
        f4949a = 262630000;
        f4950b = new i();
    }

    i() {
    }

    public static i o() {
        return f4950b;
    }

    public final int l(Context context) {
        return m(context, f4949a);
    }

    public final int m(Context context, int i2) throws PackageManager.NameNotFoundException {
        int iA = ag.a(context, i2);
        return iA == 1 ? !ag.d(context) ? 1 : 18 : iA;
    }

    public final Intent n(Context context, int i2, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            if (context != null) {
                com.google.android.gms.common.internal.ah.b();
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context == null) {
            context = null;
        } else if (com.google.android.gms.common.util.b.f(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f4949a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.d.c.b(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(TtmlNode.ATTR_ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public final PendingIntent p(Context context, int i2, String str) {
        Intent intentN = n(context, i2, str);
        if (intentN == null) {
            return null;
        }
        return PendingIntentCompat.getActivity(context, 0, intentN, 134217728, false);
    }
}

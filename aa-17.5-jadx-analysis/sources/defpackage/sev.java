package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class sev {
    public static final /* synthetic */ int a = 0;
    private static final xby[] b = {new xby(0, "com.google.android.projection.gearhead", R.string.car_app_name, 2131231091, null, null), new xby(1, RemoteApiConstants.NOW_PACKAGE, R.string.car_frx_app_google_app, 2131231093, null, null), new xby(2, "com.google.android.apps.maps", R.string.car_frx_app_google_maps, 2131231092, null, null), new xby(3, "com.google.android.tts", R.string.car_frx_app_tts, 2131231100, null, null), new xby(2, "com.locnall.KimGiSa", R.string.car_frx_app_kakaomap, R.drawable.car_app_kakaomap, null, null), new xby(2, "com.waze", R.string.car_frx_app_waze, R.drawable.car_app_waze, null, null)};

    public static Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        intent.putExtra("full_docid", str);
        intent.putExtra("backend_docid", str);
        intent.putExtra("offer_type", 1);
        return intent;
    }

    public static Intent b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str != null ? "market://details?id=com.google.android.projection.gearhead&referrer=".concat(str) : "market://details?id=com.google.android.projection.gearhead"));
        intent.setPackage("com.android.vending");
        if (intent.resolveActivity(packageManager) != null) {
            return intent;
        }
        return null;
    }

    public static xby c(String str) {
        xby[] xbyVarArr = b;
        for (int i = 0; i < 6; i++) {
            xby xbyVar = xbyVarArr[i];
            if (xbyVar.b.equals(str)) {
                return xbyVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public static String d(Context context, erb erbVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : erbVar.a.entrySet()) {
            String str = (String) entry.getKey();
            ser serVar = (ser) entry.getValue();
            xby xbyVarC = c(str);
            if (xbyVarC == null) {
                String str2 = serVar.c;
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            } else {
                int i = xbyVarC.c;
                if (i != 0) {
                    arrayList.add(context.getString(i));
                } else {
                    String str3 = xbyVarC.e;
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList.add(str3);
                    }
                }
            }
        }
        return new xxd(", ").b(arrayList);
    }
}

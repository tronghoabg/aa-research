package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class sks {
    public static final int c;
    public static final defpackage.sks d;

    static {
        boolean z = defpackage.sli.a;
        c = 263410000;
        d = new defpackage.sks();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int k(android.content.Context context) {
        return l(context, c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesMissingManifestValueException */
    public final int l(android.content.Context context, int i) throws com.google.android.gms.common.GooglePlayServicesMissingManifestValueException, com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException {
        int iB = defpackage.sli.b(context, i);
        if (iB == 1) {
            return !defpackage.sli.e(context) ? 1 : 18;
        }
        return iB;
    }

    public final android.content.Intent m(android.content.Context context, int i, java.lang.String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            if (context != null) {
                boolean z = defpackage.sov.a;
            }
            android.net.Uri uriFromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context == null) {
            context = null;
        } else if (defpackage.sqj.k(context)) {
            android.content.Intent intent2 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("gcore_");
        sb.append(c);
        sb.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(defpackage.sqx.b(context).i(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.lang.String string = sb.toString();
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder builderAppendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public final android.app.PendingIntent n(android.content.Context context, int i, java.lang.String str) {
        android.content.Intent intentM = m(context, i, str);
        if (intentM == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(context, 0, intentM, 201326592);
    }
}

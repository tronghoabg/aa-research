package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.ConfigurationCompat;
import com.waze.R;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final SimpleArrayMap f5087a = new SimpleArrayMap();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f5088b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.d.c.b(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i2) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i2 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strA);
        }
        if (i2 == 2) {
            return com.google.android.gms.common.util.b.f(context) ? resources.getString(R.string.common_google_play_services_wear_update_text, strA) : resources.getString(R.string.common_google_play_services_update_text, strA);
        }
        if (i2 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strA);
        }
        if (i2 == 4) {
            return resources.getString(R.string.common_google_play_services_signin_required_text, strA);
        }
        if (i2 == 5) {
            return f(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i2 == 7) {
            return f(context, "common_google_play_services_network_error_text", strA);
        }
        if (i2 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strA);
        }
        if (i2 == 20) {
            return f(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i2) {
            case 16:
                return f(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return f(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(R.string.common_google_play_services_try_again_text, strA);
        }
    }

    public static String c(Context context, int i2) {
        return (i2 == 6 || i2 == 19) ? f(context, "common_google_play_services_resolution_required_text", a(context)) : b(context, i2);
    }

    public static String d(Context context, int i2) {
        String strG = i2 == 6 ? g(context, "common_google_play_services_resolution_required_title") : e(context, i2);
        return strG == null ? context.getResources().getString(R.string.common_google_play_services_try_again_title) : strG;
    }

    public static String e(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
                Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(R.string.common_google_play_services_signin_required_title);
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return g(context, "common_google_play_services_invalid_account_title");
            case 6:
                Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return g(context, "common_google_play_services_resolution_required_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return g(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(R.string.common_google_play_services_unsupported_title);
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i2);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return g(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(R.string.common_google_play_services_updating_client_title);
            case 19:
                Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return g(context, "common_google_play_services_resolution_required_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return g(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String f(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strG = g(context, str);
        if (strG == null) {
            strG = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strG, str2);
    }

    private static String g(Context context, String str) {
        Resources resourcesForApplication;
        SimpleArrayMap simpleArrayMap = f5087a;
        synchronized (simpleArrayMap) {
            Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(f5088b)) {
                simpleArrayMap.clear();
                f5088b = locale;
            }
            String str2 = (String) simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            boolean z = com.google.android.gms.common.ag.f4671a;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            int identifier = resourcesForApplication.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = resourcesForApplication.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f5087a.put(str, string);
                return string;
            }
            Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }
}

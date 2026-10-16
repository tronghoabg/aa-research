package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class sns {
    private static final aat a = new aat(0);
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Object obj = spz.b(context).a;
            return ((Context) obj).getPackageManager().getApplicationLabel(((Context) obj).getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_install_button);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i == 1) {
            return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_install_text, strA);
        }
        if (i != 2) {
            if (i == 3) {
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_enable_text, strA);
            }
            if (i == 4) {
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_signin_required_text, strA);
            }
            if (i == 5) {
                return e(context, "common_google_play_services_invalid_account_text", strA);
            }
            if (i == 7) {
                return e(context, "common_google_play_services_network_error_text", strA);
            }
            if (i == 9) {
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_unsupported_text, strA);
            }
            if (i == 20) {
                return e(context, "common_google_play_services_restricted_profile_text", strA);
            }
            if (i != 21) {
                switch (i) {
                    case 16:
                        return e(context, "common_google_play_services_api_unavailable_text", strA);
                    case 17:
                        return e(context, "common_google_play_services_sign_in_failed_text", strA);
                    case 18:
                        return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_updating_text, strA);
                    default:
                        return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_try_again_text, strA);
                }
            }
        }
        return spl.k(context) ? resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_wear_update_text, strA) : resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_update_text, strA);
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_install_title);
            case 2:
            case 21:
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_enable_title);
            case 4:
                Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_signin_required_title);
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 6:
                Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return f(context, "common_google_play_services_resolution_required_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_unsupported_title);
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
                Log.e("GoogleApiAvailability", a.bp(i, "Unexpected error code "));
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_updating_client_title);
            case 19:
                Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return f(context, "common_google_play_services_resolution_required_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String e(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strF = f(context, str);
        if (strF == null) {
            strF = resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strF, str2);
    }

    public static String f(Context context, String str) {
        Resources resourcesForApplication;
        aat aatVar = a;
        synchronized (aatVar) {
            Locale localeE = dsg.y(context.getResources().getConfiguration()).e(0);
            if (!localeE.equals(b)) {
                aatVar.clear();
                b = localeE;
            }
            String str2 = (String) aatVar.get(str);
            if (str2 != null) {
                return str2;
            }
            boolean z = skm.a;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", a.bz(str, "Missing resource: "));
                return null;
            }
            String string = resourcesForApplication.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", a.bz(str, "Got empty resource: "));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }
}

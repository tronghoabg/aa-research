package androidx.car.app.notification;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.car.app.CarContext;
import androidx.car.app.utils.CommonUtils;
import j$.util.Objects;
import java.security.InvalidParameterException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarPendingIntent {
    static final String CAR_APP_ACTIVITY_CLASSNAME = "androidx.car.app.activity.CarAppActivity";
    static final String COMPONENT_EXTRA_KEY = "androidx.car.app.notification.COMPONENT_EXTRA_KEY";
    private static final int FLAG_MUTABLE = 33554432;
    private static final String NAVIGATION_URI_PREFIX = "geo:";
    private static final String PHONE_URI_PREFIX = "tel:";
    private static final String SEARCH_QUERY_PARAMETER = "q";
    private static final String SEARCH_QUERY_PARAMETER_SPLITTER = "q=";

    private CarPendingIntent() {
    }

    private static PendingIntent createForAutomotive(Context context, int i2, Intent intent, int i3) {
        String packageName = context.getPackageName();
        ComponentName component = intent.getComponent();
        if (component != null && Objects.equals(component.getPackageName(), packageName)) {
            intent.setClassName(packageName, CAR_APP_ACTIVITY_CLASSNAME);
        }
        return PendingIntent.getActivity(context, i2, intent, i3);
    }

    private static PendingIntent createForProjected(Context context, int i2, Intent intent, int i3) {
        intent.putExtra(COMPONENT_EXTRA_KEY, intent.getComponent());
        intent.setClass(context, CarAppNotificationBroadcastReceiver.class);
        return PendingIntent.getBroadcast(context, i2, intent, i3);
    }

    public static PendingIntent getCarApp(Context context, int i2, Intent intent, int i3) throws PackageManager.NameNotFoundException {
        Objects.requireNonNull(context);
        Objects.requireNonNull(intent);
        validateIntent(context, intent);
        int i4 = i3 & (-67108865);
        int i5 = 33554432 | i4;
        if (Build.VERSION.SDK_INT >= 34) {
            i5 = i4 | 50331648;
        }
        return CommonUtils.isAutomotiveOS(context) ? createForAutomotive(context, i2, intent, i5) : createForProjected(context, i2, intent, i5);
    }

    private static String getQueryString(Uri uri) {
        if (uri.isHierarchical()) {
            List<String> queryParameters = uri.getQueryParameters(SEARCH_QUERY_PARAMETER);
            if (queryParameters.isEmpty()) {
                return null;
            }
            return queryParameters.get(0);
        }
        String[] strArrSplit = uri.getEncodedSchemeSpecificPart().split(SEARCH_QUERY_PARAMETER_SPLITTER);
        if (strArrSplit.length >= 2) {
            return strArrSplit[1].split("&")[0];
        }
        return null;
    }

    private static boolean isLatitudeLongitude(String str) throws NumberFormatException {
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length == 2) {
            try {
                Double.parseDouble(strArrSplit[0]);
                Double.parseDouble(strArrSplit[1]);
                return true;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    static void validateIntent(Context context, Intent intent) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String action = intent.getAction();
        ComponentName component = intent.getComponent();
        if (component != null && Objects.equals(component.getPackageName(), packageName)) {
            try {
                context.getPackageManager().getServiceInfo(component, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                java.util.Objects.toString(intent);
                throw new InvalidParameterException("Intent does not have the CarAppService's ComponentName as its target".concat(String.valueOf(intent)));
            }
        } else if (Objects.equals(action, CarContext.ACTION_NAVIGATE)) {
            validateNavigationIntentIsValid(intent);
        } else if ("android.intent.action.DIAL".equals(action) || "android.intent.action.CALL".equals(action)) {
            validatePhoneIntentIsValid(intent);
        } else {
            if (component != null) {
                throw new SecurityException("Explicitly starting a separate app is not supported");
            }
            throw new InvalidParameterException("The intent is not for a supported action");
        }
    }

    private static void validateNavigationIntentIsValid(Intent intent) {
        if (!(intent.getDataString() == null ? "" : intent.getDataString()).startsWith(NAVIGATION_URI_PREFIX)) {
            throw new InvalidParameterException("Navigation intent has a malformed uri");
        }
        Uri data = intent.getData();
        if (getQueryString(data) == null && !isLatitudeLongitude(data.getEncodedSchemeSpecificPart())) {
            throw new InvalidParameterException("Navigation intent has neither a location nor a query string");
        }
    }

    private static void validatePhoneIntentIsValid(Intent intent) {
        if (!(intent.getDataString() == null ? "" : intent.getDataString()).startsWith(PHONE_URI_PREFIX)) {
            throw new InvalidParameterException("Phone intent data is not properly formatted");
        }
        if (intent.getComponent() != null) {
            throw new SecurityException("Phone intent cannot have a component");
        }
    }
}

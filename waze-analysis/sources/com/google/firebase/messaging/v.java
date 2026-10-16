package com.google.firebase.messaging;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f10242a;

    public v(Bundle bundle) {
        this.f10242a = new Bundle(bundle);
    }

    public static boolean i(Bundle bundle) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("gcm.n.e")) || IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString(k("gcm.n.e")));
    }

    private static String k(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private static String l(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final Bundle a() {
        Bundle bundle = this.f10242a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals(TypedValues.TransitionType.S_FROM)) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final Bundle b() {
        Bundle bundle = this.f10242a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final Integer c(String str) {
        String strF = f(str);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strF));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + l(str) + "(" + strF + ") into an int");
            return null;
        }
    }

    public final String d(Resources resources, String str, String str2) {
        String[] strArr;
        String strF = f(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        int identifier = resources.getIdentifier(strF, TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            Log.w("NotificationParams", l(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayG = g(str2.concat("_loc_args"));
        if (jSONArrayG == null) {
            strArr = null;
        } else {
            int length = jSONArrayG.length();
            strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = jSONArrayG.optString(i2);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            Log.w("NotificationParams", "Missing format argument for " + l(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e2);
            return null;
        }
    }

    public final String e(Resources resources, String str, String str2) {
        String strF = f(str2);
        return !TextUtils.isEmpty(strF) ? strF : d(resources, str, str2);
    }

    public final String f(String str) {
        Bundle bundle = this.f10242a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strK = k(str);
            if (bundle.containsKey(strK)) {
                str = strK;
            }
        }
        return bundle.getString(str);
    }

    public final JSONArray g(String str) {
        String strF = f(str);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return new JSONArray(strF);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + l(str) + ": " + strF + ", falling back to default");
            return null;
        }
    }

    public final boolean h(String str) {
        String strF = f(str);
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strF) || Boolean.parseBoolean(strF);
    }

    public final Long j() {
        String strF = f("gcm.n.event_time");
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strF));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + l("gcm.n.event_time") + "(" + strF + ") into a long");
            return null;
        }
    }
}

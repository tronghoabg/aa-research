package W9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f15362a;

    public p(Context context) {
        AbstractC3340k.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f15362a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public static boolean l(Bundle bundle) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(bundle.getString("gcm.n.e")) || UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String strJ = j(str);
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(strJ) || Boolean.parseBoolean(strJ);
    }

    public Integer b(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strJ));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + n(str) + "(" + strJ + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return new JSONArray(strJ);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + n(str) + ": " + strJ + ", falling back to default");
            return null;
        }
    }

    public int[] d() throws JSONException {
        JSONArray jSONArrayC = c("gcm.n.light_settings");
        if (jSONArrayC == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayC.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayC.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayC.optInt(1);
            iArr[2] = jSONArrayC.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e7) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayC + ". " + e7.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayC + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] e(String str) {
        JSONArray jSONArrayC = c(str.concat("_loc_args"));
        if (jSONArrayC == null) {
            return null;
        }
        int length = jSONArrayC.length();
        String[] strArr = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            strArr[i5] = jSONArrayC.optString(i5);
        }
        return strArr;
    }

    public String f(String str) {
        return j(str.concat("_loc_key"));
    }

    public Long g() {
        String strJ = j("gcm.n.event_time");
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strJ));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + n("gcm.n.event_time") + "(" + strJ + ") into a long");
            return null;
        }
    }

    public String h(Resources resources, String str, String str2) {
        String strJ = j(str2);
        if (!TextUtils.isEmpty(strJ)) {
            return strJ;
        }
        String strF = f(str2);
        if (!TextUtils.isEmpty(strF)) {
            int identifier = resources.getIdentifier(strF, "string", str);
            if (identifier == 0) {
                Log.w("NotificationParams", n(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            Object[] objArrE = e(str2);
            if (objArrE == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, objArrE);
            } catch (MissingFormatArgumentException e7) {
                Log.w("NotificationParams", "Missing format argument for " + n(str2) + ": " + Arrays.toString(objArrE) + " Default value will be used.", e7);
            }
        }
        return null;
    }

    public Boolean i() {
        Bundle bundle = this.f15362a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public String j(String str) {
        Bundle bundle = this.f15362a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] k() throws JSONException {
        JSONArray jSONArrayC = c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            return null;
        }
        try {
            if (jSONArrayC.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayC.length();
            long[] jArr = new long[length];
            for (int i5 = 0; i5 < length; i5++) {
                jArr[i5] = jSONArrayC.optLong(i5);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayC + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Bundle m() {
        Bundle bundle = this.f15362a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public p(Bundle bundle) {
        if (bundle != null) {
            this.f15362a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException(JsonStorageKeyNames.DATA_KEY);
    }
}

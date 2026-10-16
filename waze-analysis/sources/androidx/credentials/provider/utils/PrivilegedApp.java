package androidx.credentials.provider.utils;

import android.os.Build;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PrivilegedApp {
    private static final String ANDROID_TYPE_KEY = "android";
    private static final String APPS_KEY = "apps";
    private static final String APP_INFO_KEY = "info";
    private static final String BUILD_KEY = "build";
    public static final Companion Companion = new Companion(null);
    private static final String FINGERPRINT_KEY = "cert_fingerprint_sha256";
    private static final String PACKAGE_NAME_KEY = "package_name";
    private static final String SIGNATURES_KEY = "signatures";
    private static final String TYPE_KEY = "type";
    private static final String USER_BUILD_TYPE = "userdebug";
    private static final String USER_DEBUG_KEY = "userdebug";
    private final Set<String> fingerprints;
    private final String packageName;

    public PrivilegedApp(String str, Set<String> set) {
        x.f(str, "packageName");
        x.f(set, "fingerprints");
        this.packageName = str;
        this.fingerprints = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivilegedApp copy$default(PrivilegedApp privilegedApp, String str, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = privilegedApp.packageName;
        }
        if ((i2 & 2) != 0) {
            set = privilegedApp.fingerprints;
        }
        return privilegedApp.copy(str, set);
    }

    public static final PrivilegedApp createFromJSONObject(JSONObject jSONObject, boolean z) {
        return Companion.createFromJSONObject(jSONObject, z);
    }

    public final String component1() {
        return this.packageName;
    }

    public final Set<String> component2() {
        return this.fingerprints;
    }

    public final PrivilegedApp copy(String str, Set<String> set) {
        x.f(str, "packageName");
        x.f(set, "fingerprints");
        return new PrivilegedApp(str, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivilegedApp)) {
            return false;
        }
        PrivilegedApp privilegedApp = (PrivilegedApp) obj;
        return x.n(this.packageName, privilegedApp.packageName) && x.n(this.fingerprints, privilegedApp.fingerprints);
    }

    public final Set<String> getFingerprints() {
        return this.fingerprints;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.packageName.hashCode() * 31) + this.fingerprints.hashCode();
    }

    public String toString() {
        return "PrivilegedApp(packageName=" + this.packageName + ", fingerprints=" + this.fingerprints + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final PrivilegedApp createFromJSONObject(JSONObject jSONObject, boolean z) throws JSONException {
            x.f(jSONObject, "appInfoJsonObject");
            JSONArray jSONArray = jSONObject.getJSONArray(PrivilegedApp.SIGNATURES_KEY);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (!z || !x.n("userdebug", jSONArray.getJSONObject(i2).optString("build")) || x.n("userdebug", Build.TYPE)) {
                    String string = jSONArray.getJSONObject(i2).getString(PrivilegedApp.FINGERPRINT_KEY);
                    x.e(string, "getString(...)");
                    linkedHashSet.add(string);
                }
            }
            String string2 = jSONObject.getString(PrivilegedApp.PACKAGE_NAME_KEY);
            x.e(string2, "getString(...)");
            return new PrivilegedApp(string2, linkedHashSet);
        }

        public final List<PrivilegedApp> extractPrivilegedApps$credentials(JSONObject jSONObject) throws JSONException {
            x.f(jSONObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(PrivilegedApp.APPS_KEY);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (x.n(jSONObject2.getString("type"), PrivilegedApp.ANDROID_TYPE_KEY)) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(PrivilegedApp.APP_INFO_KEY);
                    x.e(jSONObject3, "getJSONObject(...)");
                    arrayList.add(createFromJSONObject(jSONObject3, true));
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

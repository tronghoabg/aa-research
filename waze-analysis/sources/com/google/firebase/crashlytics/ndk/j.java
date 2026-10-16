package com.google.firebase.crashlytics.ndk;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j {
    static String a(String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        HashMap map = new HashMap();
        map.put("app_identifier", str);
        map.put("version_code", str2);
        map.put("version_name", str3);
        map.put("install_uuid", str4);
        map.put("delivery_mechanism", Integer.valueOf(i2));
        map.put("development_platform", b(str5));
        map.put("development_platform_version", b(str6));
        return new JSONObject(map).toString();
    }

    private static String b(String str) {
        return str == null ? "" : str;
    }
}

package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.core.moa.xs;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zjm {
    private static boolean dj = false;

    /* renamed from: oa, reason: collision with root package name */
    public static final Set<String> f25838oa = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.zjm.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static dz uef;

    /* renamed from: ab, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, xs.uef> f25839ab;
    private String bcc;
    private boolean cq;
    private int cz;
    private String dz;
    private String ivm;
    private String lw;
    private String moa;
    private com.bytedance.sdk.openadsdk.core.wk.yo.yo wk;
    private String wrv;
    private int xs;
    private boolean yo;
    private int zjm;

    public static class uef {
        private static final zjm uef = new zjm();
    }

    public static boolean dhk() {
        return dj;
    }

    public static int ivm() {
        try {
            String strUef = uef("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strUef)) {
                return 0;
            }
            return Integer.valueOf(strUef).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static int lw() {
        try {
            String strUef = uef("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strUef)) {
                return 0;
            }
            return Integer.valueOf(strUef).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static zjm oa() {
        return uef.uef;
    }

    public static void tpx() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            dj = true;
        }
    }

    public boolean ab() {
        return "5001121".contains(this.moa);
    }

    public String bcc() {
        if (TextUtils.isEmpty(this.ivm)) {
            this.ivm = uef(sy.uef());
        }
        return this.ivm;
    }

    public boolean bs() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.gb.ivm());
    }

    public com.bytedance.sdk.openadsdk.core.wk.yo.yo cq() {
        if (this.wk == null) {
            this.wk = new com.bytedance.sdk.openadsdk.core.wk.yo.yo(10, 8);
        }
        return this.wk;
    }

    public int cz() {
        return this.xs;
    }

    public boolean dj() {
        int i5 = this.zjm;
        return i5 < -1 || i5 > 1;
    }

    public boolean dz() {
        return true;
    }

    public String moa() {
        if (TextUtils.isEmpty(this.moa)) {
            String strUef = uef("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strUef)) {
                this.moa = strUef;
            }
        }
        return this.moa;
    }

    public void oib() {
        try {
            if (this.f25839ab == null || this.f25839ab.size() != 0) {
                return;
            }
            this.f25839ab = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public String orq() {
        return this.wrv;
    }

    public String sy() {
        if (!TextUtils.isEmpty(this.dz)) {
            return this.dz;
        }
        String strUef = com.bytedance.sdk.openadsdk.utils.wrv.uef();
        this.dz = strUef;
        if (!TextUtils.isEmpty(strUef)) {
            return this.dz;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.wrv.uef(strValueOf);
        this.dz = strValueOf;
        return strValueOf;
    }

    public boolean wk() {
        return f25838oa.contains(this.moa);
    }

    public String wrv() {
        return this.bcc;
    }

    public String xs() {
        String str = this.lw;
        if (str != null) {
            return str;
        }
        String strUef = uef("mediation_info", Long.MAX_VALUE);
        this.lw = strUef;
        if (strUef == null) {
            this.lw = "";
        }
        return this.lw;
    }

    public boolean yo() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_global_file", "sdk_activate_init", true);
    }

    public int zjm() {
        return this.zjm;
    }

    private zjm() {
        this.yo = false;
        this.cz = 0;
        this.zjm = -1;
        this.f25839ab = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cz(String str) {
        if (TextUtils.isEmpty(this.bcc)) {
            this.bcc = str;
            return;
        }
        try {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray(this.bcc);
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(MediationMetaData.KEY_NAME);
                    if (!TextUtils.isEmpty(strOptString)) {
                        map.put(strOptString, jSONObjectOptJSONObject);
                    }
                }
            }
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString(MediationMetaData.KEY_NAME);
                    String strOptString3 = jSONObjectOptJSONObject2.optString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                        map.put(strOptString2, jSONObjectOptJSONObject2);
                    }
                }
            }
            Collection collectionValues = map.values();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                jSONArray3.put((JSONObject) it.next());
            }
            this.bcc = jSONArray3.toString();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static void dj(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        dz dzVar = uef;
        if (dzVar != null) {
            dzVar.uef(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.dhk.yo("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public static void uef(dz dzVar) {
        uef = dzVar;
    }

    private static JSONObject wrv(String str) {
        String strOa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("sp_global_file", str, (String) null);
        if (TextUtils.isEmpty(strOa)) {
            return null;
        }
        try {
            return new JSONObject(strOa);
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.GlobalInfo", e7.getMessage());
            return null;
        }
    }

    private static void zjm(String str) {
        dz dzVar;
        if (TextUtils.isEmpty(str) && (dzVar = uef) != null) {
            dzVar.uef(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.dhk.yo("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public void oa(boolean z2) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_global_file", "sdk_activate_init", Boolean.valueOf(z2));
    }

    public void yo(int i5) {
        this.xs = i5;
    }

    public static void oa(int i5) throws JSONException {
        if (i5 >= 0) {
            uef("config_fail_times", String.valueOf(i5));
        }
    }

    public boolean uef() {
        return this.cq;
    }

    public void yo(final String str) {
        dj(str);
        if (com.bytedance.sdk.openadsdk.utils.km.ivm()) {
            wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.2
                @Override // java.lang.Runnable
                public void run() {
                    zjm.this.cz(str);
                }
            });
        } else {
            cz(str);
        }
    }

    public void bcc(String str) {
        this.wrv = str;
    }

    public void oa(String str) throws JSONException {
        this.lw = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        uef("mediation_info", str);
    }

    public void uef(boolean z2) {
        this.cq = z2;
    }

    public static void uef(int i5) throws JSONException {
        if (i5 >= 0) {
            uef("domain_index", String.valueOf(i5));
        }
    }

    public static boolean xs(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void ivm(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f25839ab == null) {
                return;
            }
            this.f25839ab.remove(str);
        } catch (Throwable unused) {
        }
    }

    public void lw(int i5) {
        this.cz = i5;
    }

    public xs.uef lw(String str) {
        try {
            if (this.f25839ab == null || str == null) {
                return null;
            }
            return this.f25839ab.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void moa(int i5) {
        this.zjm = i5;
    }

    public void uef(String str) throws JSONException {
        zjm(str);
        this.moa = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        uef("app_id", str);
    }

    public static Pair<String, Long> moa(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectWrv = wrv(str);
            if (jSONObjectWrv == null) {
                return null;
            }
            return new Pair<>(jSONObjectWrv.getString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR), Long.valueOf(jSONObjectWrv.getLong("time")));
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.GlobalInfo", e7.getMessage());
            return null;
        }
    }

    public void yo(boolean z2) {
        this.yo = z2;
    }

    private String uef(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void uef(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.GlobalInfo", e7.getMessage());
        }
    }

    public static String uef(String str, long j8) {
        JSONObject jSONObjectWrv;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObjectWrv = wrv(str);
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.GlobalInfo", e7.getMessage());
        }
        if (jSONObjectWrv == null) {
            return null;
        }
        if (System.currentTimeMillis() - jSONObjectWrv.getLong("time") <= j8) {
            return jSONObjectWrv.getString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        }
        return null;
    }

    public void uef(String str, xs.uef uefVar) {
        try {
            if (TextUtils.isEmpty(str) || uefVar == null) {
                return;
            }
            if (this.f25839ab == null) {
                synchronized (zjm.class) {
                    try {
                        if (this.f25839ab == null) {
                            this.f25839ab = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.f25839ab != null) {
                this.f25839ab.put(str, uefVar);
            }
        } catch (Throwable unused) {
        }
    }
}

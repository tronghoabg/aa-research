package com.bytedance.sdk.openadsdk.core.dz.oa;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.openadsdk.core.dz.oa.oa;
import com.bytedance.sdk.openadsdk.core.dz.oa.uef;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.unity3d.services.UnityAdsConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    private boolean ivm;
    private EnumC0096yo lw;
    private final boolean moa;
    private final String yo;
    private static final Map<String, oa> uef = new ConcurrentHashMap();

    /* renamed from: oa, reason: collision with root package name */
    private static final AtomicBoolean f25587oa = new AtomicBoolean(false);

    public static class oa {

        /* renamed from: oa, reason: collision with root package name */
        String f25591oa;
        final gzw uef;
        float yo;

        public oa(String str, gzw gzwVar) {
            this(str, gzwVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public oa(String str, gzw gzwVar, float f10) {
            this.f25591oa = str;
            this.uef = gzwVar;
            this.yo = f10;
        }
    }

    public static class uef {
        private final String uef;

        /* renamed from: oa, reason: collision with root package name */
        private EnumC0096yo f25592oa = EnumC0096yo.TRACKING_URL;
        private boolean yo = false;

        public uef(String str) {
            this.uef = str;
        }

        public uef uef(boolean z2) {
            this.yo = z2;
            return this;
        }

        public yo uef() {
            return new yo(this.uef, this.f25592oa, Boolean.valueOf(this.yo));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.dz.oa.yo$yo, reason: collision with other inner class name */
    public enum EnumC0096yo {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        gr.uef(new gr.uef() { // from class: com.bytedance.sdk.openadsdk.core.dz.oa.yo.1
            @Override // com.bytedance.sdk.component.utils.gr.uef
            public void uef(Context context, Intent intent, boolean z2, int i5) {
                if (i5 == 0 || yo.uef.size() <= 0) {
                    return;
                }
                yo.xs();
            }
        }, sy.uef());
    }

    public yo(String str, EnumC0096yo enumC0096yo, Boolean bool) {
        this.yo = str;
        this.lw = enumC0096yo;
        this.moa = bool.booleanValue();
    }

    public static void oa(gzw gzwVar, List<yo> list, com.bytedance.sdk.openadsdk.core.dz.uef.uef uefVar, long j8, String str, String str2) {
        uef(gzwVar, list, uefVar, j8, str, null, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xs() {
        if (f25587oa.compareAndSet(false, true)) {
            Map<String, oa> map = uef;
            HashSet hashSet = new HashSet(map.entrySet());
            map.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null) {
                    uef((String) entry.getKey(), (oa) entry.getValue(), true);
                }
            }
            f25587oa.set(false);
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.dz.oa.uef> yo(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new uef.C0095uef(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).uef());
                }
            }
        }
        return arrayList;
    }

    public void m_() {
        this.ivm = true;
    }

    public boolean moa() {
        return this.ivm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(final boolean z2, final String str, final String str2, final oa oaVar, final String str3, final boolean z10) {
        gzw gzwVar;
        if (oaVar == null || (gzwVar = oaVar.uef) == null) {
            return;
        }
        final boolean zEbe = gzwVar.ebe();
        final String str4 = zEbe ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo(str4) { // from class: com.bytedance.sdk.openadsdk.core.dz.oa.yo.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", oaVar.f25591oa);
                    jSONObject.put("success", z2);
                    jSONObject.put("url", str3);
                    if (zEbe) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        if (oaVar.yo >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            jSONObject.put("progress", Math.round(r1 * 100.0f) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), oaVar.uef, str2, str4, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.dz.oa.yo.3.1
                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject uef() {
                        if (!z10) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject yo() {
                        return jSONObject;
                    }
                });
            }
        });
    }

    public static List<String> uef(gzw gzwVar, List<yo> list, com.bytedance.sdk.openadsdk.core.dz.uef.uef uefVar, long j8, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (yo yoVar : list) {
            if (yoVar != null && (!yoVar.moa() || yoVar.yo())) {
                arrayList.add(yoVar.oa());
                yoVar.m_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.dz.yo.yo(arrayList, gzwVar).uef(uefVar).uef(j8).oa(str).uef(str2).uef();
    }

    public static List<com.bytedance.sdk.openadsdk.core.dz.oa.oa> oa(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new oa.uef(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).uef());
                }
            }
        }
        return arrayList;
    }

    public boolean yo() {
        return this.moa;
    }

    public String oa() {
        return this.yo;
    }

    public static boolean uef(gzw gzwVar, List<yo> list, com.bytedance.sdk.openadsdk.core.dz.uef.uef uefVar, long j8, String str, oa oaVar, String str2) {
        List<String> listUef = uef(gzwVar, list, uefVar, j8, str, str2);
        uef(listUef, oaVar);
        return !listUef.isEmpty();
    }

    public static void uef(List<String> list, oa oaVar) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str = list.get(i5);
            if (!TextUtils.isEmpty(str)) {
                uef(str, oaVar, false);
            }
        }
    }

    private static void uef(final String str, final oa oaVar, final boolean z2) {
        com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
        if (oaVarYo == null) {
            return;
        }
        oaVarYo.uef(true);
        oaVarYo.yo(str);
        oaVarYo.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.dz.oa.yo.2
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar2) {
                String str2;
                boolean z10;
                oa oaVar3 = oaVar;
                if (oaVar3 == null || oaVar3.uef == null) {
                    return;
                }
                String str3 = null;
                if (oaVar2 == null || !oaVar2.ivm()) {
                    if (oaVar2 != null) {
                        str3 = oaVar2.uef() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + oaVar2.oa();
                        if (!z2 && (oaVar2.uef() <= 300 || oaVar2.uef() >= 400)) {
                            yo.uef.put(str, oaVar);
                        }
                    }
                    str2 = str3;
                    z10 = false;
                } else {
                    str2 = null;
                    z10 = true;
                }
                yo.oa(z10, str2, gb.yo(oaVar.uef.dqw()), oaVar, str, z2);
                if (!z10 || yo.uef.isEmpty()) {
                    return;
                }
                yo.xs();
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                gzw gzwVar;
                oa oaVar2 = oaVar;
                if (oaVar2 != null && (gzwVar = oaVar2.uef) != null) {
                    yo.oa(false, iOException != null ? iOException.getMessage() : null, gb.yo(gzwVar.dqw()), oaVar, str, z2);
                }
                if (z2 || oaVar == null) {
                    return;
                }
                yo.uef.put(str, oaVar);
            }
        });
    }

    public static List<yo> uef(JSONArray jSONArray) {
        return uef(jSONArray, false);
    }

    public static List<yo> uef(JSONArray jSONArray, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                String strOptString = jSONArray.optString(i5);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new uef(strOptString).uef(z2).uef());
                }
            }
        }
        return arrayList;
    }
}

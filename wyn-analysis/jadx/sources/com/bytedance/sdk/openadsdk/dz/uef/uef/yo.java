package com.bytedance.sdk.openadsdk.dz.uef.uef;

import A7.AbstractC0279p0;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.orq;
import com.bytedance.sdk.openadsdk.core.model.rt;
import com.bytedance.sdk.openadsdk.utils.km;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    private static final LinkedHashMap<String, SoftReference<String>> moa = new LinkedHashMap<String, SoftReference<String>>(16, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.dz.uef.uef.yo.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, SoftReference<String>> entry) {
            return size() > 5;
        }
    };
    private static volatile yo uef;
    private gzw lw;

    /* renamed from: oa, reason: collision with root package name */
    private final Object f25904oa = new Object();
    private gzw yo = null;

    public interface oa {
        void uef(List<com.bytedance.sdk.openadsdk.dz.uef.uef> list);
    }

    public interface uef {
        void uef();

        void uef(Exception exc);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.dz.uef.uef.yo$yo, reason: collision with other inner class name */
    public interface InterfaceC0120yo {
        void oa(String str);

        void uef(String str);
    }

    private String lw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f25904oa) {
            try {
                LinkedHashMap<String, SoftReference<String>> linkedHashMap = moa;
                SoftReference<String> softReference = linkedHashMap.get(str);
                if (softReference != null) {
                    String str2 = softReference.get();
                    if (str2 != null) {
                        return str2;
                    }
                    linkedHashMap.remove(str);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void oa() {
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("iabhistory_clear_overlimit") { // from class: com.bytedance.sdk.openadsdk.dz.uef.uef.yo.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.dz.uef.uef.oa.uef().moa();
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public String yo(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.dz.uef.uef.uef.uef(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<gzw> oa(String str) {
        if (str == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.core.model.uef uefVar = new com.bytedance.sdk.openadsdk.core.model.uef();
        try {
            JSONObject jSONObject = new JSONObject(str);
            uefVar.uef(jSONObject.optString("request_id"));
            uefVar.uef(jSONObject.optInt("ret"));
            uefVar.oa(jSONObject.optInt("multi_ad_style", 0));
            uefVar.oa(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String strOptString = jSONObject.optString("gdid_encrypted");
            uefVar.uef(orq.uef(jSONObject.optJSONObject("loop_config")));
            String strOptString2 = jSONObject.optString("auction_price");
            if (uefVar.moa() != 0) {
                return null;
            }
            uefVar.uef(rt.uef(jSONObject.optString("multi_ad_config")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    gzw gzwVarUef = com.bytedance.sdk.openadsdk.core.oa.uef(jSONArrayOptJSONArray.optJSONObject(i5), null, null, uefVar, i5);
                    if (gzwVarUef != null) {
                        gzwVarUef.dz(strOptString2);
                        if (TextUtils.isEmpty(gzwVarUef.cd())) {
                            gzwVarUef.lz(jSONObject.toString());
                        }
                        if (!TextUtils.isEmpty(strOptString)) {
                            gzwVarUef.cz(strOptString);
                        }
                    }
                    uefVar.uef(gzwVarUef);
                    arrayList.add(gzwVarUef);
                }
            }
            return arrayList.isEmpty() ? uefVar.lw() : arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static yo uef() {
        if (uef == null) {
            synchronized (yo.class) {
                try {
                    if (uef == null) {
                        uef = new yo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public String moa(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String strOa = com.bytedance.sdk.openadsdk.dz.uef.uef.uef.oa(str);
            return !TextUtils.isEmpty(strOa) ? strOa : str;
        } catch (Exception unused) {
            return null;
        }
    }

    public gzw yo() {
        return this.lw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        synchronized (this.f25904oa) {
            moa.put(str, new SoftReference<>(str2));
        }
    }

    public void uef(final com.bytedance.sdk.openadsdk.dz.uef.uef uefVar) {
        if (uefVar == null) {
            return;
        }
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("iabhistory_insert") { // from class: com.bytedance.sdk.openadsdk.dz.uef.uef.yo.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.dz.uef.uef.oa.uef().uef(uefVar);
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public void uef(final String str, final InterfaceC0120yo interfaceC0120yo) {
        if (TextUtils.isEmpty(str)) {
            if (interfaceC0120yo != null) {
                interfaceC0120yo.oa("materialKey is empty");
                return;
            }
            return;
        }
        String strLw = lw(str);
        if (strLw == null) {
            km.uef(new com.bytedance.sdk.component.bcc.oa.yo("iabhistory_query_material") { // from class: com.bytedance.sdk.openadsdk.dz.uef.uef.yo.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String strMoa = yo.this.moa(com.bytedance.sdk.openadsdk.dz.uef.uef.oa.uef().uef(str));
                        if (!TextUtils.isEmpty(strMoa)) {
                            yo.this.uef(str, strMoa);
                        }
                        InterfaceC0120yo interfaceC0120yo2 = interfaceC0120yo;
                        if (interfaceC0120yo2 != null) {
                            interfaceC0120yo2.uef(strMoa);
                        }
                    } catch (Exception e7) {
                        InterfaceC0120yo interfaceC0120yo3 = interfaceC0120yo;
                        if (interfaceC0120yo3 != null) {
                            interfaceC0120yo3.oa(e7.getMessage());
                        }
                    }
                }
            }, 8);
        } else if (interfaceC0120yo != null) {
            interfaceC0120yo.uef(strLw);
        }
    }

    public void uef(final oa oaVar) {
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("iabhistory_get_all") { // from class: com.bytedance.sdk.openadsdk.dz.uef.uef.yo.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    List<com.bytedance.sdk.openadsdk.dz.uef.uef> listOa = com.bytedance.sdk.openadsdk.dz.uef.uef.oa.uef().oa();
                    oa oaVar2 = oaVar;
                    if (oaVar2 != null) {
                        if (listOa == null) {
                            listOa = Collections.EMPTY_LIST;
                        }
                        oaVar2.uef(listOa);
                    }
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public void uef(final uef uefVar) {
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("iabhistory_clear") { // from class: com.bytedance.sdk.openadsdk.dz.uef.uef.yo.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.dz.uef.uef.oa.uef().yo();
                    yo.moa.clear();
                    uef uefVar2 = uefVar;
                    if (uefVar2 != null) {
                        uefVar2.uef();
                    }
                } catch (Exception e7) {
                    uef uefVar3 = uefVar;
                    if (uefVar3 != null) {
                        uefVar3.uef(e7);
                    }
                }
            }
        }, 8);
    }

    public String uef(String str) {
        try {
            return AbstractC0279p0.l("https://", new URL(str).getHost(), "/favicon.ico");
        } catch (Exception unused) {
            return null;
        }
    }

    public void uef(gzw gzwVar) {
        this.lw = gzwVar;
    }
}

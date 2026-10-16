package com.bytedance.sdk.openadsdk.core.cq.uef;

import A7.AbstractC0279p0;
import N0.a;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.utils.km;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    private static volatile oa uef;

    public interface uef {
        void uef(int i5, String str, String str2);

        void uef(JSONObject jSONObject, String str);
    }

    private void oa(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.cq.uef.uef uefVar = new com.bytedance.sdk.openadsdk.core.cq.uef.uef();
        uefVar.yo(str).lw(str3).moa(str4).oa(str2).uef(str5).uef(Long.valueOf(System.currentTimeMillis()));
        yo.uef().uef(uefVar);
        oa();
    }

    public static oa uef() {
        if (uef == null) {
            synchronized (oa.class) {
                try {
                    if (uef == null) {
                        uef = new oa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.cq.bcc.uef uefVar, String str) {
        if (uefVar == null || TextUtils.isEmpty(uefVar.uef())) {
            return;
        }
        StringBuilder sbQ = AbstractC0279p0.q(str, Constants.USER_ID_SEPARATOR);
        sbQ.append(uefVar.uef());
        final String string = sbQ.toString();
        final String strYo = uefVar.yo();
        final String strOa = uefVar.oa();
        final String strMoa = uefVar.moa();
        String strLw = uefVar.lw();
        if (TextUtils.isEmpty(strLw)) {
            if (str.equals("ad")) {
                strLw = zjm.oa().moa();
            } else if (str.equals("adv3")) {
                strLw = zjm.oa().moa() + "_v3";
            }
        }
        final String str2 = strLw;
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.oa.1
            @Override // java.lang.Runnable
            public void run() {
                oa.this.uef(string, strYo, strOa, strMoa, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        int iLw = sy.moa().lw();
        if (iLw <= 0) {
            iLw = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.cq.uef.uef> listOa = yo.uef().oa();
        if (listOa == null || listOa.isEmpty() || iLw >= listOa.size()) {
            if (listOa == null) {
                return;
            }
            listOa.size();
            return;
        }
        int size = (int) (listOa.size() - (iLw * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.cq.uef.uef uefVar : listOa) {
            treeMap.put(uefVar.moa(), uefVar);
        }
        HashSet hashSet = new HashSet();
        int i5 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i5 < size) {
                i5++;
                com.bytedance.sdk.openadsdk.core.cq.uef.uef uefVar2 = (com.bytedance.sdk.openadsdk.core.cq.uef.uef) entry.getValue();
                if (uefVar2 != null) {
                    hashSet.add(uefVar2.uef());
                }
            }
        }
        uef(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str, String str2, String str3, String str4, String str5) {
        if (uef(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            oa(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            uef(str2, str, str3, str5, (uef) null);
        } else {
            oa(str2, str3, str5, str4, str);
        }
    }

    public void uef(String str, String str2, String str3, String str4, String str5, final uef uefVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (uefVar != null) {
                uefVar.uef(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String strG = a.g(str, Constants.USER_ID_SEPARATOR, str3);
        com.bytedance.sdk.openadsdk.core.cq.uef.uef uefVarUef = uef(strG, str4);
        if (uefVarUef != null && !TextUtils.isEmpty(uefVarUef.lw())) {
            uef(uefVarUef);
            if (uefVar != null) {
                try {
                    uefVar.uef(new JSONObject(uefVarUef.lw()), ServiceProvider.NAMED_LOCAL);
                    return;
                } catch (JSONException unused) {
                    uefVar.uef(2, "parse json exception data is " + uefVarUef.lw(), ServiceProvider.NAMED_LOCAL);
                    return;
                }
            }
            return;
        }
        uef(str2, strG, str4, str5, new uef() { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.oa.2
            @Override // com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef
            public void uef(JSONObject jSONObject, String str6) {
                uef uefVar2 = uefVar;
                if (uefVar2 != null) {
                    uefVar2.uef(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef
            public void uef(int i5, String str6, String str7) {
                uef uefVar2 = uefVar;
                if (uefVar2 != null) {
                    uefVar2.uef(i5, str6, str7);
                }
            }
        });
    }

    private void uef(final String str, final String str2, final String str3, final String str4, final uef uefVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (uefVar != null) {
                uefVar.uef(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
            oaVarYo.yo(str);
            oaVarYo.uef(7);
            oaVarYo.oa("load_ug_t");
            oaVarYo.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.oa.3
                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                    if (oaVar == null) {
                        return;
                    }
                    if (!oaVar.ivm()) {
                        uef uefVar2 = uefVar;
                        if (uefVar2 != null) {
                            uefVar2.uef(3, "net code error code is " + oaVar.uef() + " message is " + oaVar.oa(), "net");
                            return;
                        }
                        return;
                    }
                    String strMoa = oaVar.moa();
                    if (TextUtils.isEmpty(strMoa)) {
                        uef uefVar3 = uefVar;
                        if (uefVar3 != null) {
                            uefVar3.uef(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    yo.uef().uef(new com.bytedance.sdk.openadsdk.core.cq.uef.uef().uef(str2).oa(str3).yo(str).lw(str4).moa(strMoa).uef(Long.valueOf(System.currentTimeMillis())));
                    oa.this.oa();
                    if (uefVar != null) {
                        try {
                            uefVar.uef(new JSONObject(strMoa), "net");
                        } catch (JSONException unused) {
                            uefVar.uef(2, "parse json exception data is".concat(String.valueOf(strMoa)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                    uef uefVar2 = uefVar;
                    if (uefVar2 != null) {
                        uefVar2.uef(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.cq.uef.uef> uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return yo.uef().uef(str);
    }

    public String uef(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.cq.uef.uef uefVarUef = uef(a.g(str, Constants.USER_ID_SEPARATOR, str2), str3);
        if (uefVarUef == null) {
            return null;
        }
        uef(uefVarUef);
        return uefVarUef.lw();
    }

    private com.bytedance.sdk.openadsdk.core.cq.uef.uef uef(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return yo.uef().uef(str, str2);
    }

    private void uef(final com.bytedance.sdk.openadsdk.core.cq.uef.uef uefVar) {
        uefVar.uef(Long.valueOf(System.currentTimeMillis()));
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.oa.4
            @Override // java.lang.Runnable
            public void run() {
                yo.uef().uef(uefVar);
            }
        }, 10);
    }

    public void uef(Set<String> set) {
        try {
            yo.uef().uef(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}

package com.bytedance.sdk.component.adexpress.uef.oa;

import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xs {
    private static volatile xs uef;

    /* renamed from: oa, reason: collision with root package name */
    private AtomicBoolean f24945oa = new AtomicBoolean(false);

    private xs() {
    }

    private JSONObject yo(String str) {
        com.bytedance.sdk.component.adexpress.uef.uef.yo yoVarYo = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo();
        if (yoVarYo == null) {
            return null;
        }
        com.bytedance.sdk.component.xs.oa.oa oaVarXs = yoVarYo.xs();
        oaVarXs.yo(str);
        com.bytedance.sdk.component.xs.oa oaVarLw = oaVarXs.lw();
        if (oaVarLw != null) {
            try {
                if (oaVarLw.ivm() && oaVarLw.moa() != null) {
                    return new JSONObject(oaVarLw.moa());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> oa(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ivm.uef().oa(str);
    }

    public static xs uef() {
        if (uef == null) {
            synchronized (xs.class) {
                try {
                    if (uef == null) {
                        uef = new xs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    private void oa() {
        if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo() == null) {
            return;
        }
        int iUef = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().uef();
        if (iUef <= 0) {
            iUef = 100;
        }
        List<com.bytedance.sdk.component.adexpress.uef.yo.oa> listOa = ivm.uef().oa();
        if (listOa == null || listOa.isEmpty() || iUef >= listOa.size()) {
            if (listOa == null) {
                return;
            }
            listOa.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.uef.yo.oa oaVar : listOa) {
            treeMap.put(oaVar.xs(), oaVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listOa.size() - (iUef * 0.75f));
        int i5 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i5 < size) {
                i5++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.uef.yo.oa oaVar2 = (com.bytedance.sdk.component.adexpress.uef.yo.oa) entry.getValue();
                if (oaVar2 != null) {
                    hashSet.add(oaVar2.oa());
                }
            }
        }
        uef(hashSet);
        this.f24945oa.set(false);
    }

    public com.bytedance.sdk.component.adexpress.uef.yo.oa uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ivm.uef().uef(str);
    }

    public void uef(com.bytedance.sdk.component.adexpress.uef.yo.moa moaVar, String str) {
        String strBcc;
        if (moaVar == null) {
            return;
        }
        final String str2 = moaVar.uef;
        final String str3 = moaVar.yo;
        final String str4 = moaVar.f24948oa;
        final String str5 = moaVar.moa;
        final String str6 = moaVar.lw;
        if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo() != null) {
            strBcc = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().bcc();
        } else {
            strBcc = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strBcc : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.moa.moa.uef(new com.bytedance.sdk.component.bcc.oa.yo("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.uef.oa.xs.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                xs.this.uef(str2, str3, str4, str5, str6, str7);
            }
        }, 10);
    }

    private void oa(String str, String str2, String str3, String str4, String str5, String str6) {
        ivm.uef().uef(new com.bytedance.sdk.component.adexpress.uef.yo.oa().uef(str).oa(str2).yo(str3).moa(str4).lw(str5).ivm(str6).uef(Long.valueOf(System.currentTimeMillis())), false);
        oa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void uef(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (uef(str) != null) {
                    if (!TextUtils.isEmpty(str4)) {
                        if (!TextUtils.isEmpty(str3)) {
                            str7 = str5;
                            oa(str6, str, str3, str2, str4, str7);
                        }
                    }
                    return;
                }
                str7 = str5;
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                    uef(str2, str6, str);
                } else {
                    oa(str6, str, str3, str2, str4, str7);
                }
                boolean zUef = bcc.uef(str7);
                if (!oa.lw() || zUef) {
                    lw.oa().uef(true);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void uef(String str, String str2, String str3) {
        JSONObject jSONObjectYo;
        if (TextUtils.isEmpty(str) || (jSONObjectYo = yo(str)) == null) {
            return;
        }
        String strOptString = jSONObjectYo.optString("md5");
        String strOptString2 = jSONObjectYo.optString("version");
        String strOptString3 = jSONObjectYo.optString(JsonStorageKeyNames.DATA_KEY);
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.uef.yo.oa oaVarUef = new com.bytedance.sdk.component.adexpress.uef.yo.oa().uef(str2).oa(str3).yo(strOptString).moa(str).lw(strOptString3).ivm(strOptString2).uef(Long.valueOf(System.currentTimeMillis()));
        ivm.uef().uef(oaVarUef, false);
        oa();
        if (bcc.uef(strOptString2)) {
            oaVarUef.ivm(strOptString2);
            lw.oa().uef(true);
        }
    }

    public void uef(Set<String> set) {
        try {
            ivm.uef().uef(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}

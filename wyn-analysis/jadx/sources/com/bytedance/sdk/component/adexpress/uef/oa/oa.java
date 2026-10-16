package com.bytedance.sdk.component.adexpress.uef.oa;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.moa.cz;
import com.bytedance.sdk.component.adexpress.uef.yo.uef;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa {
    static Object uef = new Object();

    private static String ivm() {
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarMoa = moa();
        if (uefVarMoa == null) {
            return null;
        }
        return uefVarMoa.moa();
    }

    public static boolean lw() {
        return lw.oa().lw();
    }

    public static com.bytedance.sdk.component.adexpress.uef.yo.uef moa() {
        return lw.oa().ivm();
    }

    public static void oa() {
        try {
            bcc.moa();
            File fileBcc = lw.bcc();
            if (fileBcc == null || !fileBcc.exists()) {
                return;
            }
            if (fileBcc.getParentFile() != null) {
                com.bytedance.sdk.component.utils.xs.yo(fileBcc.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.xs.yo(fileBcc);
            }
        } catch (Throwable unused) {
        }
    }

    public static void uef() {
        lw.oa();
    }

    private static File xs(String str) {
        List<Pair<String, String>> listOa;
        uef.oa oaVarLw = moa().lw();
        if (oaVarLw != null && (listOa = oaVarLw.oa()) != null && listOa.size() > 0) {
            for (Pair<String, String> pair : listOa) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(lw.bcc(), (String) pair.first);
                }
            }
        }
        return null;
    }

    public static String yo() {
        return ivm.yo();
    }

    private static boolean lw(String str) {
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarMoa;
        List<uef.C0057uef> listIvm;
        if (!lw() || (uefVarMoa = moa()) == null || (listIvm = uefVarMoa.ivm()) == null) {
            return false;
        }
        for (uef.C0057uef c0057uef : listIvm) {
            if (c0057uef != null && TextUtils.equals(str, c0057uef.uef())) {
                return true;
            }
        }
        return false;
    }

    public static String moa(String str) {
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar;
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarMoa = moa();
        if (uefVarMoa == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return ivm();
        }
        Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef = uefVarMoa.uef();
        if (mapUef == null || mapUef.size() <= 0 || (uefVar = mapUef.get(str)) == null) {
            return null;
        }
        return uefVar.moa();
    }

    public static com.bytedance.sdk.component.adexpress.uef.yo.oa uef(String str) {
        return xs.uef().uef(str);
    }

    public static com.bytedance.sdk.component.adexpress.uef.yo.oa yo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.uef.yo.oa oaVarUef = xs.uef().uef(str);
        if (oaVarUef != null) {
            oaVarUef.uef(Long.valueOf(System.currentTimeMillis()));
            uef(oaVarUef);
        }
        return oaVarUef;
    }

    private static File ivm(String str) throws IOException {
        if (lw()) {
            Iterator<uef.C0057uef> it = moa().ivm().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uef.C0057uef next = it.next();
                if (next.uef() != null && next.uef().equals(str)) {
                    File file = new File(lw.bcc(), com.bytedance.sdk.component.utils.lw.uef(next.uef()));
                    String strUef = com.bytedance.sdk.component.utils.lw.uef(file);
                    if (next.oa() == null || !next.oa().equals(strUef)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    public static void uef(com.bytedance.sdk.component.adexpress.uef.yo.moa moaVar) {
        xs.uef().uef(moaVar, moaVar.ivm);
    }

    private static void uef(final com.bytedance.sdk.component.adexpress.uef.yo.oa oaVar) {
        com.bytedance.sdk.component.adexpress.moa.moa.uef(new com.bytedance.sdk.component.bcc.oa.yo("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.uef.oa.oa.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (oa.uef) {
                    ivm.uef().uef(oaVar, true);
                }
            }
        }, 10);
    }

    public static uef uef(String str, cz.uef uefVar, String str2, String str3) throws IOException {
        File fileIvm;
        uef uefVar2 = new uef();
        if (TextUtils.isEmpty(str3)) {
            fileIvm = null;
        } else {
            fileIvm = oa(str3, str);
            if (fileIvm != null) {
                uefVar2.uef(1);
            }
        }
        if (fileIvm == null && (fileIvm = xs(str)) != null) {
            uefVar2.uef(3);
        }
        if (fileIvm == null && (fileIvm = ivm(str)) != null) {
            uefVar2.uef(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!uef(str, str3)) {
                uefVar2.uef(4);
            }
        } else if (!lw(str)) {
            uefVar2.uef(6);
        }
        uefVar2.oa();
        if (fileIvm != null) {
            try {
                uefVar2.uef(new WebResourceResponse(uefVar.uef(), "utf-8", new FileInputStream(fileIvm)));
            } catch (Throwable unused) {
            }
        }
        return uefVar2;
    }

    public static Set<String> oa(String str) {
        return xs.uef().oa(str);
    }

    private static File oa(String str, String str2) throws IOException {
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar;
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarMoa = moa();
        if (uefVarMoa != null && lw()) {
            Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef = uefVarMoa.uef();
            if (mapUef.size() != 0 && (uefVar = mapUef.get(str)) != null) {
                Iterator<uef.C0057uef> it = uefVar.ivm().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    uef.C0057uef next = it.next();
                    if (next.uef() != null && next.uef().equals(str2)) {
                        File file = new File(lw.bcc(), com.bytedance.sdk.component.utils.lw.uef(next.uef()));
                        String strUef = com.bytedance.sdk.component.utils.lw.uef(file);
                        if (next.oa() == null || !next.oa().equals(strUef)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static boolean oa(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean uef(String str, String str2) {
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarMoa;
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar;
        if (!lw() || (uefVarMoa = moa()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef = uefVarMoa.uef();
        if (mapUef.size() == 0 || (uefVar = mapUef.get(str2)) == null) {
            return false;
        }
        for (uef.C0057uef c0057uef : uefVar.ivm()) {
            if (c0057uef != null && TextUtils.equals(str, c0057uef.uef())) {
                return true;
            }
        }
        return false;
    }

    public static boolean uef(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}

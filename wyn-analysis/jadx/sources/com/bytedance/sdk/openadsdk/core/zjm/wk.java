package com.bytedance.sdk.openadsdk.core.zjm;

import N0.a;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dxx;
import com.bytedance.sdk.openadsdk.utils.km;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class wk {
    /* JADX INFO: Access modifiers changed from: private */
    public static void moa(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            String strOptString = jSONArray.optString(i5);
            if (!TextUtils.isEmpty(strOptString)) {
                String strUef = com.bytedance.sdk.openadsdk.core.cq.moa.uef(str, strOptString);
                File fileUef = uef(strUef);
                if (fileUef != null && fileUef.exists() && fileUef.length() > 0) {
                    return;
                } else {
                    yo(strUef);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yo(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            String strOptString = jSONArray.optString(i5);
            if (!TextUtils.isEmpty(strOptString)) {
                String strUef = com.bytedance.sdk.openadsdk.core.cq.moa.uef(str, strOptString);
                File fileUef = uef(strUef);
                if (fileUef != null && fileUef.exists() && fileUef.length() > 0) {
                    return;
                } else {
                    yo(strUef);
                }
            }
        }
    }

    public static boolean oa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        dxx dxxVarAje;
        return (gzwVar == null || (dxxVarAje = gzwVar.aje()) == null || dxxVarAje.ivm() == null) ? false : true;
    }

    public static void uef(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.zjm.wk.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                dxx dxxVarAje;
                dxx.uef uefVarIvm;
                com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 = gzwVar;
                if (gzwVar2 == null || (dxxVarAje = gzwVar2.aje()) == null || (uefVarIvm = dxxVarAje.ivm()) == null) {
                    return;
                }
                String strDhk = com.bytedance.sdk.openadsdk.core.settings.dj.oa().dhk();
                wk.uef(gzwVar, uefVarIvm.uef(), strDhk);
                wk.yo(uefVarIvm.oa(), strDhk);
                wk.moa(uefVarIvm.yo(), strDhk);
            }
        });
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, JSONArray jSONArray, String str) throws IOException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            String strOptString = jSONArray.optString(i5);
            if (!TextUtils.isEmpty(strOptString)) {
                String strUef = com.bytedance.sdk.openadsdk.core.cq.moa.uef(str, strOptString);
                String strUef2 = com.bytedance.sdk.component.utils.lw.uef(strUef);
                InputStream inputStreamUef = com.bytedance.sdk.openadsdk.zjm.moa.uef(strUef, strUef2);
                if (inputStreamUef != null) {
                    try {
                        inputStreamUef.close();
                    } catch (IOException unused) {
                    }
                } else {
                    com.bytedance.sdk.openadsdk.zjm.moa.uef(strUef).yo(1).uef(strUef2).uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, strUef, new com.bytedance.sdk.component.lw.ab() { // from class: com.bytedance.sdk.openadsdk.core.zjm.wk.2
                        @Override // com.bytedance.sdk.component.lw.ab
                        public void uef(int i10, String str2, Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.lw.ab
                        public void uef(com.bytedance.sdk.component.lw.dj djVar) {
                            djVar.uef();
                        }
                    }), 4);
                }
            }
        }
    }

    public static InputStream oa(String str) {
        File fileUef = uef(str);
        if (fileUef == null || !fileUef.exists() || fileUef.length() <= 0) {
            return null;
        }
        try {
            return new FileInputStream(fileUef);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("ExpressStaticResPreload", th.getMessage());
            return null;
        }
    }

    private static void yo(String str) {
        File fileUef = uef(str);
        if (fileUef == null) {
            return;
        }
        File file = new File(fileUef + ".tmp");
        com.bytedance.sdk.component.xs.oa.uef uefVarMoa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().moa();
        uefVarMoa.uef(8);
        uefVarMoa.oa("preloadStaticRes");
        uefVarMoa.yo(str);
        uefVarMoa.uef(fileUef.getParent(), fileUef.getName());
        com.bytedance.sdk.component.xs.oa oaVarLw = uefVarMoa.lw();
        if (oaVarLw != null && oaVarLw.ivm() && oaVarLw.lw() != null && oaVarLw.lw().exists()) {
            com.bytedance.sdk.component.utils.dhk.uef("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (fileUef.exists()) {
            try {
                fileUef.delete();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo("ExpressStaticResPreload", th.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.dhk.yo("ExpressStaticResPreload", th2.getMessage());
            }
        }
    }

    public static File uef(String str) {
        String strUef = com.bytedance.sdk.component.utils.lw.uef(str);
        if (strUef == null) {
            return null;
        }
        return new File(com.bytedance.sdk.component.utils.xs.oa(com.bytedance.sdk.openadsdk.core.sy.uef(), a.f(new File(CacheDirFactory.getRootDir()).getName(), "/express_static_res")), strUef);
    }
}

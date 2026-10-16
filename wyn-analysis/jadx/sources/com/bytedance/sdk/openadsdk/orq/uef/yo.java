package com.bytedance.sdk.openadsdk.orq.uef;

import N0.a;
import Va.M6;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.ab;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.ku;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.orq.oa.uef;
import com.bytedance.sdk.openadsdk.utils.km;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wg.b;

/* loaded from: classes3.dex */
public class yo {
    private static volatile yo uef;
    private final Set<String> lw = DesugarCollections.synchronizedSet(new HashSet());
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f26086oa;
    private String yo;

    private String ivm() {
        if (TextUtils.isEmpty(this.moa)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(moa());
            String strC = b.c(sb2, File.separator, "pregames");
            File file = new File(strC);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.moa = strC;
        }
        return this.moa;
    }

    private String lw() {
        if (TextUtils.isEmpty(this.yo)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(moa());
            String strC = b.c(sb2, File.separator, "common");
            File file = new File(strC);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.yo = strC;
        }
        return this.yo;
    }

    private String moa() {
        if (TextUtils.isEmpty(this.f26086oa)) {
            try {
                File fileUef = xs.uef(sy.uef(), sy.uef().getCacheDir(), "playable");
                if (!fileUef.exists()) {
                    fileUef.mkdirs();
                }
                this.f26086oa = fileUef.getAbsolutePath();
            } catch (Throwable th) {
                dhk.yo("PlayableResManager", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.f26086oa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.orq.uef.yo.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.orq.oa.uef uefVarOa = com.bytedance.sdk.openadsdk.orq.oa.uef.oa(com.bytedance.sdk.openadsdk.oib.moa.uef.oa("pag_plb_config", "model", ""));
                if (uefVarOa != null) {
                    yo.this.uef(uefVarOa, null, 0);
                }
            }
        });
    }

    public void oa() {
        if (!com.bytedance.sdk.openadsdk.core.settings.xs.uef() || com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.oib.moa.uef.uef("pag_plb_config", "last_update_time", 0L);
        final String strUef = lw.uef("plb_res", "");
        long jUef = lw.uef("plb_res_fetch_interval", 3600000);
        if (jUef <= 0 || jUef > 259200000) {
            jUef = 3600000;
        }
        if (jCurrentTimeMillis < jUef || TextUtils.isEmpty(strUef)) {
            return;
        }
        int iUef = lw.uef("plb_res_delay_fetch_time", 0);
        if (iUef <= 0) {
            oa(strUef);
        } else {
            wk.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.uef.yo.3
                @Override // java.lang.Runnable
                public void run() {
                    yo.this.oa(strUef);
                }
            }, iUef);
        }
    }

    private static String yo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(iLastIndexOf + 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(final String str) {
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.orq.uef.yo.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
                try {
                    oaVarYo.yo(com.bytedance.sdk.openadsdk.cz.moa.uef(oaVarYo, str));
                    com.bytedance.sdk.component.xs.oa oaVarLw = oaVarYo.lw();
                    if (oaVarLw == null || !oaVarLw.ivm()) {
                        return;
                    }
                    String strMoa = oaVarLw.moa();
                    com.bytedance.sdk.openadsdk.orq.oa.uef uefVarOa = com.bytedance.sdk.openadsdk.orq.oa.uef.oa(strMoa);
                    com.bytedance.sdk.openadsdk.oib.moa.uef.uef("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (uefVarOa != null) {
                        com.bytedance.sdk.openadsdk.orq.oa.uef uefVarOa2 = com.bytedance.sdk.openadsdk.orq.oa.uef.oa(com.bytedance.sdk.openadsdk.oib.moa.uef.oa("pag_plb_config", "model", ""));
                        if (uefVarOa2 != null && uefVarOa.uef().equals(uefVarOa2.uef())) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("pag_plb_config", "model", strMoa);
                        yo.this.uef(uefVarOa, uefVarOa2, 1);
                    }
                } catch (Exception e7) {
                    dhk.yo("PlayableResManager", e7.getMessage());
                }
            }
        });
    }

    public void uef(Map<String, String> map) {
        File[] fileArrListFiles;
        if (com.bytedance.sdk.openadsdk.core.settings.xs.uef()) {
            String strIvm = ivm();
            if (!TextUtils.isEmpty(strIvm)) {
                File file = new File(strIvm);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileUef = com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef(file2);
                                if (fileUef != null && fileUef.exists()) {
                                    map.put(file2.getName(), fileUef.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iUef = lw.uef("plb_res_delay_fetch_time", 0);
            if (iUef <= 0) {
                yo();
            } else {
                wk.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.uef.yo.1
                    @Override // java.lang.Runnable
                    public void run() {
                        yo.this.yo();
                    }
                }, iUef);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void uef(com.bytedance.sdk.openadsdk.orq.oa.uef uefVar, com.bytedance.sdk.openadsdk.orq.oa.uef uefVar2, int i5) {
        List<uef.C0132uef> listYo = null;
        uef(uefVar.oa(), uefVar2 == null ? null : uefVar2.oa(), 1, i5);
        List<uef.C0132uef> listYo2 = uefVar.yo();
        if (uefVar2 != null) {
            listYo = uefVar2.yo();
        }
        uef(listYo2, listYo, 2, i5);
    }

    private void uef(List<uef.C0132uef> list, List<uef.C0132uef> list2, int i5, int i10) throws NoSuchAlgorithmException {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strLw = i5 == 1 ? lw() : ivm();
        for (uef.C0132uef c0132uef : list) {
            String strUef = c0132uef.uef();
            String strUef2 = ab.uef(strUef);
            if (!TextUtils.isEmpty(strUef2)) {
                if (i5 == 1) {
                    StringBuilder sbJ = a.j(strUef2);
                    sbJ.append(yo(strUef));
                    strUef2 = sbJ.toString();
                }
                String str = strUef2;
                File file = new File(strLw, str);
                boolean zExists = file.exists();
                if (i10 == 1) {
                    if (zExists && list2 != null && list2.contains(c0132uef)) {
                        com.bytedance.sdk.openadsdk.core.wk.yo.uef.yo(file);
                    } else {
                        int i11 = i5;
                        uef(strUef, strLw, str, i11, file, zExists);
                        i5 = i11;
                    }
                } else if (!zExists) {
                    int i112 = i5;
                    uef(strUef, strLw, str, i112, file, zExists);
                    i5 = i112;
                }
            }
        }
    }

    private void uef(final String str, final String str2, final String str3, final int i5, final File file, final boolean z2) {
        String strConcat;
        if (this.lw.contains(str)) {
            return;
        }
        if (i5 == 2) {
            strConcat = a.f(str3, ".zip");
        } else {
            strConcat = z2 ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.lw.add(str);
        com.bytedance.sdk.component.xs.oa.uef uefVarMoa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().moa();
        uefVarMoa.yo(str);
        uefVarMoa.uef(str2, strConcat);
        final com.bytedance.sdk.component.xs.oa oaVarLw = uefVarMoa.lw();
        this.lw.remove(str);
        if (oaVarLw == null || !oaVarLw.ivm() || oaVarLw.lw() == null || !oaVarLw.lw().exists()) {
            File file2 = new File(M6.t(a.j(str2), File.separator, str3, ".tmp"));
            if (file2.exists()) {
                try {
                    file2.delete();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (i5 == 2) {
            km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("downloadZip") { // from class: com.bytedance.sdk.openadsdk.orq.uef.yo.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (z2) {
                            file.delete();
                        }
                        String str4 = str2 + File.separator + str3;
                        ku.uef(oaVarLw.lw().getAbsolutePath(), str4);
                        File file3 = new File(str4);
                        File fileUef = com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef(file3);
                        if (fileUef != null && fileUef.exists()) {
                            com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().yo().put(file3.getName(), fileUef.getAbsolutePath());
                        }
                        com.bytedance.sdk.openadsdk.core.wk.yo.uef.oa(file3);
                    } catch (Throwable th) {
                        dhk.yo("PlayableResManager", "unzip error: ", th, "tp=", Integer.valueOf(i5), ", url=", str);
                    }
                    try {
                        oaVarLw.lw().delete();
                    } catch (Throwable unused2) {
                    }
                }
            });
        } else if (z2) {
            file.delete();
            oaVarLw.lw().renameTo(file);
        }
    }

    public WebResourceResponse uef(String str) throws NoSuchAlgorithmException {
        if (!com.bytedance.sdk.openadsdk.core.settings.xs.uef()) {
            return null;
        }
        String strUef = ab.uef(str);
        if (TextUtils.isEmpty(strUef)) {
            return null;
        }
        String strLw = lw();
        StringBuilder sbJ = a.j(strUef);
        sbJ.append(yo(str));
        File file = new File(strLw, sbJ.toString());
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, "UTF-8", new FileInputStream(file));
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}

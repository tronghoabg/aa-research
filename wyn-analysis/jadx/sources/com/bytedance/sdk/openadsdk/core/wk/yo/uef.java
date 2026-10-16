package com.bytedance.sdk.openadsdk.core.wk.yo;

import N0.a;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.ku;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.orq.uef.moa;
import com.bytedance.sdk.openadsdk.utils.km;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private static volatile uef uef;

    /* renamed from: oa, reason: collision with root package name */
    private String f25809oa;
    private final Map<gzw, oa> yo = new ConcurrentHashMap();
    private final Map<String, JSONObject> moa = new ConcurrentHashMap();
    private final AtomicBoolean lw = new AtomicBoolean(false);
    private final Set<String> ivm = DesugarCollections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.xs.oa.uef> xs = new ConcurrentHashMap<>();
    private final Map<String, String> bcc = new ConcurrentHashMap();

    public static class oa {
        long moa;

        /* renamed from: oa, reason: collision with root package name */
        long f25813oa;
        long uef;
        long yo;

        private oa() {
        }

        public oa moa(long j8) {
            this.moa = j8;
            return this;
        }

        public long oa() {
            return this.moa - this.yo;
        }

        public long uef() {
            return this.f25813oa - this.uef;
        }

        public oa yo(long j8) {
            this.yo = j8;
            return this;
        }

        public oa oa(long j8) {
            this.f25813oa = j8;
            return this;
        }

        public oa uef(long j8) {
            this.uef = j8;
            return this;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.wk.yo.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0107uef {
        void uef(boolean z2);
    }

    private uef() {
    }

    private boolean lw(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File moa(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return lw(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public static void yo(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    public void oa() {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw() || this.lw.get()) {
            return;
        }
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.wk.yo.uef.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strMoa = uef.this.moa();
                    if (!TextUtils.isEmpty(strMoa)) {
                        File file = new File(strMoa);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileUef = uef.uef(file2);
                                        if (fileUef != null && fileUef.exists()) {
                                            uef.this.bcc.put(file2.getName(), fileUef.getAbsolutePath());
                                        }
                                        uef.this.uef(uef.this.moa(fileUef), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.orq.uef.yo.uef().uef(uef.this.bcc);
                uef.this.lw.set(true);
            }
        });
    }

    private String lw() {
        if (TextUtils.isEmpty(this.f25809oa)) {
            try {
                File fileUef = xs.uef(sy.uef(), sy.uef().getCacheDir(), "playable");
                if (!fileUef.exists()) {
                    fileUef.mkdirs();
                }
                this.f25809oa = fileUef.getAbsolutePath();
            } catch (Throwable th) {
                dhk.yo("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.f25809oa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String moa() {
        File file = new File(lw(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static void oa(File file) {
        yo(file);
        try {
            zjm.oa().cq().uef(file);
        } catch (Throwable unused) {
        }
    }

    public static uef uef() {
        if (uef == null) {
            synchronized (uef.class) {
                try {
                    if (uef == null) {
                        uef = new uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public void oa(gzw gzwVar) {
        if (gzwVar == null || gzwVar.nj() == null || TextUtils.isEmpty(gzwVar.nj().cq()) || !lw.uef("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.xs.oa.uef uefVar = this.xs.get(gzwVar.nj().cq());
        if (uefVar != null) {
            uefVar.oa();
        }
    }

    public Map<String, String> yo() {
        return this.bcc;
    }

    public boolean uef(gzw gzwVar) {
        if (this.lw.get() && gzwVar != null && gzwVar.nj() != null && gzwVar.nj().cq() != null) {
            try {
                if (!TextUtils.isEmpty(this.bcc.get(com.bytedance.sdk.component.utils.lw.uef(gzwVar.nj().cq())))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject uef(File file, boolean z2) {
        byte[] bArrMoa;
        String strOa;
        try {
            if (!lw(file) || (bArrMoa = xs.moa(file)) == null || bArrMoa.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strOa = com.bytedance.sdk.component.utils.uef.yo(new String(bArrMoa));
            } else {
                strOa = com.bytedance.sdk.component.moa.uef.oa(new String(bArrMoa), com.bytedance.sdk.openadsdk.core.uef.oa());
            }
            if (TextUtils.isEmpty(strOa)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strOa);
            if (z2 && jSONObject.length() > 0) {
                this.moa.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse uef(String str, String str2, String str3) {
        WebResourceResponse webResourceResponseUef;
        String mimeTypeFromExtension;
        File fileUef;
        try {
            webResourceResponseUef = com.bytedance.sdk.openadsdk.orq.uef.yo.uef().uef(str3);
        } catch (Throwable th) {
            dhk.uef("PlayableCache", "playable intercept error: ", th);
        }
        if (webResourceResponseUef != null) {
            return webResourceResponseUef;
        }
        if (this.lw.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
            } catch (Throwable unused) {
                mimeTypeFromExtension = null;
            }
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                return null;
            }
            String strUef = com.bytedance.sdk.component.utils.lw.uef(str);
            if (TextUtils.isEmpty(strUef)) {
                return null;
            }
            String str4 = this.bcc.get(strUef);
            if (!TextUtils.isEmpty(str4)) {
                fileUef = new File(str4);
            } else {
                fileUef = uef(new File(moa(), strUef));
                if (fileUef != null && fileUef.exists()) {
                    this.bcc.put(strUef, fileUef.getAbsolutePath());
                }
            }
            if (fileUef != null && fileUef.exists()) {
                String strUef2 = uef(str2);
                if (TextUtils.isEmpty(strUef2)) {
                    return null;
                }
                String strReplace = str3.replace(strUef2, "");
                if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith("https://") && !strReplace.startsWith("http://")) {
                    File file = new File(fileUef, strReplace);
                    if (file.exists() && uef(strUef, strReplace, file) && file.getCanonicalPath().startsWith(fileUef.getCanonicalPath())) {
                        return new WebResourceResponse(mimeTypeFromExtension, "utf-8", new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static File uef(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return uef(file3);
                }
            }
        }
        return null;
    }

    private String uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit != null && strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, strArrSplit.length - 1);
            }
            String str3 = strArrSplit[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = strArrSplit[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean uef(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.moa.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(com.bytedance.sdk.component.utils.lw.uef(file))) {
                return true;
            }
        }
        return false;
    }

    public void uef(final gzw gzwVar, final InterfaceC0107uef interfaceC0107uef) {
        File file;
        if (moa.uef().oa() && gzwVar != null && cp.ivm(gzwVar) && gzwVar.cl() != null && !TextUtils.isEmpty(gzwVar.cl().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.wk.yo.oa.uef(gzwVar, -705, "server bidding pre render");
            uef(interfaceC0107uef, false);
            return;
        }
        if (gzwVar != null && gzwVar.nj() != null && !TextUtils.isEmpty(gzwVar.nj().cq())) {
            final String strCq = gzwVar.nj().cq();
            if (this.ivm.contains(strCq)) {
                return;
            }
            this.yo.put(gzwVar, new oa().uef(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.wk.yo.oa.uef(gzwVar);
            String strUef = com.bytedance.sdk.component.utils.lw.uef(strCq);
            final File file2 = new File(moa(), strUef);
            String str = this.bcc.get(strUef);
            if (TextUtils.isEmpty(str)) {
                file = uef(file2);
                if (file != null && file.exists()) {
                    this.bcc.put(strUef, file.getAbsolutePath());
                }
            } else {
                file = new File(str);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.wk.yo.oa.uef(gzwVar, -702, (String) null);
                yo(file2);
                this.yo.remove(gzwVar);
                uef(interfaceC0107uef, true);
                return;
            }
            try {
                xs.yo(file2);
            } catch (Throwable unused) {
            }
            this.ivm.add(strCq);
            File file3 = new File(lw(), a.f(strUef, ".zip"));
            com.bytedance.sdk.component.xs.oa.uef uefVarMoa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().moa();
            this.xs.put(strCq, uefVarMoa);
            uefVarMoa.yo(strCq);
            uefVarMoa.uef(file3.getParent(), file3.getName());
            uefVarMoa.uef(7);
            uefVarMoa.oa("playable_download");
            uefVarMoa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.wk.yo.uef.2
                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, final com.bytedance.sdk.component.xs.oa oaVar) {
                    uef.this.ivm.remove(strCq);
                    uef.this.xs.remove(strCq);
                    final oa oaVar2 = (oa) uef.this.yo.remove(gzwVar);
                    if (oaVar2 != null) {
                        oaVar2.oa(System.currentTimeMillis());
                    }
                    if (oaVar.ivm() && oaVar.lw() != null && oaVar.lw().exists()) {
                        km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.wk.yo.uef.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z2;
                                long jUef;
                                long jOa;
                                try {
                                    oa oaVar3 = oaVar2;
                                    if (oaVar3 != null) {
                                        oaVar3.yo(System.currentTimeMillis());
                                    }
                                    ku.uef(oaVar.lw().getAbsolutePath(), file2.getAbsolutePath());
                                    oa oaVar4 = oaVar2;
                                    if (oaVar4 != null) {
                                        oaVar4.moa(System.currentTimeMillis());
                                    }
                                    oa oaVar5 = oaVar2;
                                    if (oaVar5 != null) {
                                        jUef = oaVar5.uef();
                                        jOa = oaVar2.oa();
                                    } else {
                                        jUef = 0;
                                        jOa = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.wk.yo.oa.uef(gzwVar, jUef, jOa);
                                    uef.oa(file2);
                                    z2 = true;
                                    try {
                                        File fileUef = uef.uef(file2);
                                        if (fileUef != null && fileUef.exists()) {
                                            uef.this.bcc.put(file2.getName(), fileUef.getAbsolutePath());
                                        }
                                        uef.this.uef(uef.this.moa(fileUef), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th) {
                                    dhk.uef("PlayableCache", "unzip error: ", th);
                                    com.bytedance.sdk.openadsdk.core.wk.yo.oa.uef(gzwVar, -704, th.getMessage());
                                    z2 = false;
                                }
                                try {
                                    oaVar.lw().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                uef.this.uef(interfaceC0107uef, z2);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.wk.yo.oa.uef(gzwVar, oaVar.uef() != 0 ? oaVar.uef() : -700, (String) null);
                        uef.this.uef(interfaceC0107uef, false);
                    }
                }

                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                    uef.this.ivm.remove(strCq);
                    uef.this.xs.remove(strCq);
                    uef.this.yo.remove(gzwVar);
                    com.bytedance.sdk.openadsdk.core.wk.yo.oa.uef(gzwVar, -700, iOException.getMessage());
                    uef.this.uef(interfaceC0107uef, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.wk.yo.oa.uef(gzwVar, -701, (String) null);
        uef(interfaceC0107uef, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final InterfaceC0107uef interfaceC0107uef, final boolean z2) {
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.yo.uef.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0107uef interfaceC0107uef2 = interfaceC0107uef;
                if (interfaceC0107uef2 != null) {
                    interfaceC0107uef2.uef(z2);
                }
            }
        });
    }
}

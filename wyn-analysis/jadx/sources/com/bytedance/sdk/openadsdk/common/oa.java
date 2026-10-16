package com.bytedance.sdk.openadsdk.common;

import Va.M6;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class oa {
    private final Map<gzw, Long> ivm = M6.v();
    private final String lw;
    private final uef moa;
    private final Context yo;
    private static final HashMap<String, oa> uef = new HashMap<>();

    /* renamed from: oa, reason: collision with root package name */
    private static final HashMap<String, uef> f25310oa = new HashMap<>();

    private oa(Context context, String str) {
        this.yo = context;
        uef uefVar = f25310oa.get(str);
        this.moa = uefVar == null ? new uef(str) : uefVar;
        this.lw = str;
    }

    public boolean moa(String str) {
        return this.moa.xs(str);
    }

    public String oa(String str) {
        try {
            String strOa = this.moa.oa(str);
            if (TextUtils.isEmpty(strOa)) {
                return null;
            }
            return strOa;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void yo(String str) {
        this.moa.ivm(str);
    }

    public static oa uef(String str) {
        oa oaVar;
        HashMap<String, oa> map = uef;
        oa oaVar2 = map.get(str);
        if (oaVar2 != null) {
            return oaVar2;
        }
        synchronized (oa.class) {
            try {
                oaVar = map.get(str);
                if (oaVar == null) {
                    oaVar = new oa(com.bytedance.sdk.openadsdk.core.sy.uef(), str);
                    map.put(str, oaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oaVar;
    }

    private String oa() {
        return CacheDirFactory.getICacheDir(0).uef();
    }

    public static class uef {
        protected final String uef;
        private final HashSet<String> xs = new HashSet<>();

        /* renamed from: oa, reason: collision with root package name */
        String f25311oa = "material_data";
        String yo = "has_played";
        String moa = "create_time";
        String lw = "in_use_process";
        String ivm = "req_id";

        public uef(String str) {
            this.uef = TextUtils.isEmpty(str) ? "" : str;
        }

        public void bcc(String str) {
            try {
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef(uef(str));
                this.xs.remove(str);
            } catch (Throwable unused) {
            }
        }

        public void ivm(String str) {
            try {
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef(uef(str), this.lw, com.bytedance.sdk.component.utils.tpx.oa(com.bytedance.sdk.openadsdk.core.sy.uef()));
                this.xs.add(str);
            } catch (Throwable unused) {
            }
        }

        public boolean lw(String str) {
            try {
                return com.bytedance.sdk.openadsdk.oib.moa.uef.uef(uef(str), this.yo, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public long moa(String str) {
            try {
                return com.bytedance.sdk.openadsdk.oib.moa.uef.uef(uef(str), this.moa, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public String oa(String str) {
            try {
                return com.bytedance.sdk.openadsdk.oib.moa.uef.oa(uef(str), this.f25311oa, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public String uef(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return M6.t(new StringBuilder(), this.uef, "_cache_", str);
        }

        public boolean xs(String str) {
            String strUef;
            String strOa;
            try {
                strUef = uef(str);
                strOa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa(strUef, this.lw, "");
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(strOa)) {
                return false;
            }
            if (strOa.equals(com.bytedance.sdk.component.utils.tpx.oa(com.bytedance.sdk.openadsdk.core.sy.uef())) && !this.xs.contains(str)) {
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef(strUef, this.lw, "");
                return false;
            }
            return true;
        }

        public String yo(String str) {
            try {
                return com.bytedance.sdk.openadsdk.oib.moa.uef.oa(uef(str), this.ivm, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void uef(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strUef = uef(codeId);
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef(strUef, this.yo, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef(strUef, this.moa, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef(strUef, this.f25311oa, str);
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef(strUef, this.lw, "");
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef(strUef, this.ivm, str2);
                this.xs.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static void uef(String str, uef uefVar) {
        f25310oa.put(str, uefVar);
    }

    public void uef(String str, gzw gzwVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strYo = this.moa.yo(str);
        String strOfp = gzwVar != null ? gzwVar.ofp() : "";
        if (TextUtils.isEmpty(strYo) || TextUtils.isEmpty(strOfp) || strYo.equals(strOfp)) {
            this.moa.bcc(str);
        }
    }

    public void uef() {
        String str;
        File file;
        File[] fileArrListFiles;
        try {
            int i5 = Build.VERSION.SDK_INT;
            boolean zXs = com.bytedance.sdk.openadsdk.core.zjm.xs(this.lw);
            if (zXs) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            if (i5 >= 24) {
                file = new File(this.yo.getDataDir(), str);
            } else {
                file = new File(this.yo.getDatabasePath(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.oa.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(oa.this.lw);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zXs) {
                        try {
                            com.bytedance.sdk.component.utils.xs.yo(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String strReplace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.yo.deleteSharedPreferences(strReplace);
                        } else {
                            this.yo.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.xs.yo(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(oa());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.xs.yo(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        gzw gzwVarXs;
        if ((uefVar != null && uefVar.xs() != null && uefVar.xs().tpq()) || uefVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (gzwVarXs = uefVar.xs()) == null || gzwVarXs.ifj() == 2) {
            return;
        }
        try {
            this.moa.uef(adSlot, uefVar.wrv(), uefVar.yo());
        } catch (Throwable unused) {
        }
    }

    public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, boolean z2) {
        if (uefVar == null || !uefVar.ivm()) {
            return false;
        }
        if (z2) {
            Iterator<gzw> it = uefVar.lw().iterator();
            while (it.hasNext()) {
                if (!uef(it.next())) {
                    it.remove();
                }
            }
        }
        return uefVar.ivm();
    }

    public String uef(String str, long j8) {
        long jMoa = this.moa.moa(str);
        boolean zLw = this.moa.lw(str);
        if (System.currentTimeMillis() - jMoa >= j8 || zLw) {
            return null;
        }
        return oa(str);
    }

    private boolean uef(gzw gzwVar) {
        if (gzwVar != null) {
            return cp.yo(gzwVar) || gzwVar.nj() != null;
        }
        return false;
    }
}

package com.bytedance.sdk.openadsdk.core.dz.yo;

import N0.a;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.dz.uef.oa;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.lw;
import com.bytedance.sdk.openadsdk.core.sy;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa {
    public static final List<String> uef = Arrays.asList("video/mp4", "video/3gpp");

    /* renamed from: oa, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Boolean> f25601oa = new ConcurrentHashMap<>();

    private static double oa(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals("video/mp4")) ? 1.5d : 1.0d;
        }
        str.equals("video/3gpp");
        return 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(gzw gzwVar, File file, lw.uef uefVar, long j8) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw(sy.uef(), 0, 0);
        com.bytedance.sdk.openadsdk.core.dz.uef uefVarUef = lwVar.uef((String) null, file, new ArrayList());
        if (uefVarUef != null) {
            uefVar.uef(uefVarUef.uef());
            uefVar.uef(uefVarUef.wrv());
        }
        oa(gzwVar, uefVar.yo(), true, j8);
        uef(gzwVar, "vast_url", uefVarUef, jElapsedRealtime, lwVar.ivm);
        oa();
    }

    public static double uef(int i5, double d3, int i10, int i11, int i12, String str) {
        double dUef = uef(i5, d3, i10, i11);
        return (1.0d / ((dUef + 1.0d) + uef(i12))) * oa(str);
    }

    private static double uef(int i5, double d3, int i10, int i11) {
        return (d3 > 0.0d ? Math.abs(d3 - (i11 > 0 ? i10 / i11 : 0.0d)) : 0.0d) + (i5 > 0 ? Math.abs((i5 - i10) / i5) : 0.0d);
    }

    private static double uef(int i5) {
        int iMax = Math.max(i5, 0);
        if (700 > iMax || iMax > 1500) {
            return Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(TTAdConstant.STYLE_SIZE_RADIO_3_2 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    private static void oa() {
        File[] fileArrListFiles;
        File fileUef = uef(sy.uef());
        if (fileUef == null || (fileArrListFiles = fileUef.listFiles()) == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.dz.yo.moa.2
            @Override // java.util.Comparator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i5 = 0; i5 < fileArrListFiles.length && i5 < length; i5++) {
            File file = fileArrListFiles[i5];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void uef(gzw gzwVar) throws Throwable {
        lw lwVarVjh;
        ArrayList<lw.uef> arrayListUef;
        gzw gzwVar2;
        if (gzwVar == null || !lw.uef(gzwVar) || (lwVarVjh = gzwVar.vjh()) == null || (arrayListUef = lwVarVjh.uef()) == null || arrayListUef.isEmpty()) {
            return;
        }
        Iterator<lw.uef> it = arrayListUef.iterator();
        while (it.hasNext()) {
            lw.uef next = it.next();
            String strMoa = next.moa();
            if (TextUtils.isEmpty(strMoa)) {
                gzwVar2 = gzwVar;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw(sy.uef(), 0, 0);
                com.bytedance.sdk.openadsdk.core.dz.uef uefVarUef = lwVar.uef(strMoa, (File) null, new ArrayList());
                if (uefVarUef != null) {
                    next.uef(uefVarUef.uef());
                    next.uef(uefVarUef.wrv());
                }
                gzwVar2 = gzwVar;
                uef(gzwVar2, "vast_content", uefVarUef, jElapsedRealtime, lwVar.ivm);
            }
            uef(gzwVar2, next);
            gzwVar = gzwVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(gzw gzwVar, final String str, final boolean z2, final long j8) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, gzwVar.lw(), "track_url_request_result", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.dz.yo.moa.3
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put("duration", j8);
                    jSONObject.put("success", z2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void oa(final gzw gzwVar, final String str, final com.bytedance.sdk.openadsdk.core.dz.uef uefVar, final long j8, final oa.uef uefVar2) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.dz.yo.moa.5
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j8);
                    com.bytedance.sdk.openadsdk.core.dz.uef uefVar3 = uefVar;
                    String str2 = "load_vast_fail";
                    if (uefVar3 == null) {
                        oa.uef uefVar4 = uefVar2;
                        if (uefVar4 != null) {
                            jSONObject.put("error_code", uefVar4.uef);
                        }
                    } else if (TextUtils.isEmpty(uefVar3.cz()) || TextUtils.isEmpty(uefVar.ivm()) || uefVar.bcc() <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.dz.uef uefVar5 = uefVar;
                    if (uefVar5 == null || uefVar5.oa() == null || !TextUtils.isEmpty(uefVar.oa().lw())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, str, "load_vast_icon_fail", jSONObject2);
                    uefVar.uef((com.bytedance.sdk.openadsdk.core.dz.oa) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) throws Throwable {
        List<gzw> listLw = uefVar.lw();
        if (listLw != null) {
            Iterator<gzw> it = listLw.iterator();
            while (it.hasNext()) {
                uef(it.next());
            }
        }
    }

    private static void uef(final gzw gzwVar, final lw.uef uefVar) throws Throwable {
        File fileUef;
        String strYo = uefVar.yo();
        if (TextUtils.isEmpty(strYo)) {
            return;
        }
        StringBuilder sbJ = a.j(strYo);
        sbJ.append(gzwVar.ofp());
        final String string = sbJ.toString();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f25601oa;
        if (concurrentHashMap.containsKey(string) || (fileUef = uef(string)) == null) {
            return;
        }
        if (fileUef.exists() && fileUef.length() > 0) {
            oa(gzwVar, fileUef, uefVar, 0L);
            return;
        }
        concurrentHashMap.put(string, Boolean.TRUE);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.xs.oa.uef uefVarMoa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().moa();
        uefVarMoa.yo(strYo);
        uefVarMoa.uef(fileUef.getParent(), fileUef.getName());
        uefVarMoa.moa(strYo);
        uefVarMoa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.dz.yo.moa.1
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) throws Throwable {
                if (oaVar.ivm() && oaVar.lw() != null && oaVar.lw().exists()) {
                    moa.oa(gzwVar, oaVar.lw(), uefVar, SystemClock.elapsedRealtime() - jElapsedRealtime);
                } else {
                    moa.oa(gzwVar, uefVar.yo(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
                moa.f25601oa.remove(string);
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                moa.oa(gzwVar, uefVar.yo(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                moa.f25601oa.remove(string);
            }
        });
    }

    public static File uef(String str) {
        String strUef = com.bytedance.sdk.component.utils.lw.uef(str);
        if (strUef == null) {
            return null;
        }
        return new File(uef(sy.uef()), strUef);
    }

    private static File uef(Context context) {
        return xs.oa(context, new File(CacheDirFactory.getRootDir()).getName() + "/vast");
    }

    public static void uef(final gzw gzwVar, final String str, final com.bytedance.sdk.openadsdk.core.dz.uef uefVar, final long j8, final oa.uef uefVar2) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.dz.yo.moa.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j8);
                    jSONObject.put("from", str);
                    if (uefVar != null) {
                        gzw gzwVar2 = gzwVar;
                        com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar2, gzwVar2.lw(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    oa.uef uefVar3 = uefVar2;
                    if (uefVar3 != null) {
                        jSONObject.put("error_code", uefVar3.uef);
                    }
                    gzw gzwVar3 = gzwVar;
                    com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar3, gzwVar3.lw(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}

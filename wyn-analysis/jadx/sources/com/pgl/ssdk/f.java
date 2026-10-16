package com.pgl.ssdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static long f32592a = 28800;

    /* renamed from: b, reason: collision with root package name */
    public static int f32593b = 5;

    public static long a(long j8, InputStream inputStream) throws IOException {
        if (j8 != -1) {
            return j8;
        }
        byte[] bArr = new byte[Segment.SIZE];
        long j10 = 0;
        while (true) {
            int i5 = inputStream.read(bArr);
            if (i5 == -1) {
                return j10;
            }
            j10 += i5;
        }
    }

    public static long b() {
        Context contextA = z.a();
        if (contextA == null) {
            return 0L;
        }
        long jA = aw.a(contextA, "pgl_frt", 0L);
        if (jA != 0) {
            return jA;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        aw.b(contextA, "pgl_frt", jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized void c() {
        PglSSCallBack pglCallBack;
        if (d()) {
            String strE = v.e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            File file = new File(strE);
            if (file.exists()) {
                JSONObject jSONObjectA = a(file, true);
                jSONObjectA.put("apk_info", v.c());
                jSONObjectA.put("app_name", ab.d(z.a()));
                PglSSManager pglSSManager = PglSSManager.getInstance();
                if (pglSSManager != null && (pglCallBack = pglSSManager.getPglCallBack()) != null) {
                    pglCallBack.reportSoftDecData("detailed_app_info", jSONObjectA.toString());
                }
            }
        }
    }

    private static boolean d() {
        if (aw.a(z.a(), "pgl_is_hit", 0) > 0) {
            return false;
        }
        if ((System.currentTimeMillis() / 1000) - b() < f32592a) {
            return false;
        }
        aw.b(z.a(), "pgl_is_hit", 1);
        return e();
    }

    private static boolean e() {
        boolean z2 = f32593b == 100;
        return !z2 ? ((int) ((Math.random() * 100.0d) + 1.0d)) <= f32593b : z2;
    }

    public static JSONObject a() throws JSONException {
        String[] strArr;
        Context contextA = z.a();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (contextA != null) {
            ApplicationInfo applicationInfo = contextA.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                        for (File file2 : fileArrListFiles) {
                            arrayList.add(file2.getName());
                        }
                    }
                    a(jSONObject2, "arm64".equals(file.getName()) ? "v8a" : "v7a", arrayList, false);
                    if (jSONObject2.length() > 0) {
                        jSONObject.put("lib", jSONObject2);
                    }
                }
            }
            if (arrayList.isEmpty() && (strArr = applicationInfo.splitPublicSourceDirs) != null) {
                for (String str2 : strArr) {
                    if (str2.endsWith("armeabi-v7a.apk") || str2.endsWith("arm64_v8a.apk")) {
                        File file3 = new File(str2);
                        if (file3.exists()) {
                            return a(file3, false);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:91|3)|(13:93|4|(4:7|(3:96|9|(9:98|13|(5:15|(1:17)|60|44|102)(1:18)|19|(5:21|(1:23)|60|44|102)(1:24)|25|(3:45|(2:50|(2:55|(1:59))(1:54))(1:49)|60)(2:29|(3:35|(2:40|(1:42))(1:39)|43))|44|102)(1:101))(1:100)|99|5)|95|61|(1:63)|(1:67)|68|(1:70)|71|(1:75)|76|(1:80))|89|85|86|(1:(0))) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(java.io.File r19, boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.f.a(java.io.File, boolean):org.json.JSONObject");
    }

    private static JSONObject a(List<String> list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : list) {
            if (str.endsWith(".png")) {
                arrayList2.add(str.substring(0, str.lastIndexOf(".png")));
            } else if (str.endsWith(".xml")) {
                arrayList.add(str.substring(0, str.lastIndexOf(".xml")));
            } else {
                arrayList3.add(str);
            }
        }
        a(jSONObject, "xml", arrayList, true);
        a(jSONObject, "png", arrayList2, true);
        a(jSONObject, "other", arrayList3, true);
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, String str, List<String> list, boolean z2) throws JSONException {
        if (jSONObject == null || list == null || list.isEmpty()) {
            return;
        }
        if (z2) {
            try {
                jSONObject.put(str + "_size", list.size());
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put(str, n.a(list));
    }
}

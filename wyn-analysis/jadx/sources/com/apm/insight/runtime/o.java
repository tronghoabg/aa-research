package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static o f20680a;

    /* renamed from: b, reason: collision with root package name */
    private File f20681b;

    /* renamed from: c, reason: collision with root package name */
    private File f20682c;

    /* renamed from: d, reason: collision with root package name */
    private File f20683d;

    /* renamed from: e, reason: collision with root package name */
    private Context f20684e;

    /* renamed from: f, reason: collision with root package name */
    private a f20685f = null;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f20688a;

        /* renamed from: b, reason: collision with root package name */
        private long f20689b;

        /* renamed from: c, reason: collision with root package name */
        private File f20690c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f20691d;

        public /* synthetic */ a(File file, byte b5) {
            this(file);
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.f20690c.delete();
        }

        private a(File file) throws NumberFormatException {
            this.f20691d = null;
            this.f20690c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f20688a = Long.parseLong(strArrSplit[0]);
                this.f20689b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j8 = Long.parseLong(strSubstring);
                this.f20688a = j8;
                this.f20689b = j8;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f20691d == null) {
                try {
                    this.f20691d = new JSONObject(com.apm.insight.l.f.a(this.f20690c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f20691d == null) {
                    this.f20691d = new JSONObject();
                }
            }
            return this.f20691d;
        }

        public static /* synthetic */ boolean a(a aVar, long j8) {
            long j10 = aVar.f20688a;
            if (j10 > j8 && j10 - j8 > 604800000) {
                return true;
            }
            long j11 = aVar.f20689b;
            if (j11 >= j8 || j8 - j11 <= 604800000) {
                return aVar.f20690c.lastModified() < j8 && j8 - aVar.f20690c.lastModified() > 604800000;
            }
            return true;
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f20681b = fileC;
        this.f20682c = new File(fileC, "did");
        this.f20683d = new File(fileC, "device_uuid");
        this.f20684e = context;
    }

    public static o a() {
        if (f20680a == null) {
            f20680a = new o(com.apm.insight.e.g());
        }
        return f20680a;
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.f20682c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f20683d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f20681b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b5 = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b5);
                    arrayList.add(aVar2);
                    if (this.f20685f == null && ".ctx".equals(str) && (aVar == null || aVar2.f20689b >= aVar.f20689b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            }
            if (this.f20685f == null && aVar != null) {
                this.f20685f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r9, org.json.JSONArray r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f20684e
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.a(r0)
            org.json.JSONObject r6 = r0.a(r9)
            boolean r9 = com.apm.insight.entity.Header.c(r6)
            if (r9 == 0) goto L13
            r1 = r8
            goto La9
        L13:
            long r2 = java.lang.System.currentTimeMillis()
            com.apm.insight.runtime.o$a r9 = r8.f20685f
            if (r9 != 0) goto L20
            java.lang.String r9 = ".ctx"
            r8.c(r9)
        L20:
            com.apm.insight.runtime.o$a r9 = r8.f20685f
            if (r9 != 0) goto L2b
            r4 = r2
            r1 = r8
            r7 = r10
            r1.a(r2, r4, r6, r7)
            return
        L2b:
            r7 = r10
            org.json.JSONObject r10 = com.apm.insight.runtime.o.a.a(r9)
            boolean r0 = com.apm.insight.entity.Header.c(r10)
            r1 = 1
            r4 = 2
            if (r0 != 0) goto L60
            boolean r0 = com.apm.insight.entity.Header.c(r6)
            if (r0 == 0) goto L40
            r10 = 0
            goto L61
        L40:
            java.lang.String r0 = "update_version_code"
            java.lang.Object r5 = r6.opt(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r10.opt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L60
            boolean r10 = com.apm.insight.entity.Header.d(r10)
            if (r10 == 0) goto L60
            r10 = r1
            goto L61
        L60:
            r10 = r4
        L61:
            if (r10 == r1) goto L6d
            if (r10 == r4) goto L67
            r1 = r8
            goto L7e
        L67:
            r4 = r2
            r1 = r8
            r1.a(r2, r4, r6, r7)
            goto L7e
        L6d:
            r4 = r2
            long r2 = com.apm.insight.runtime.o.a.b(r9)
            r1 = r8
            r1.a(r2, r4, r6, r7)
            r2 = r4
            java.io.File r9 = com.apm.insight.runtime.o.a.c(r9)
            com.apm.insight.l.f.a(r9)
        L7e:
            java.lang.String r9 = ""
            java.util.ArrayList r9 = r8.c(r9)     // Catch: java.lang.Throwable -> La6
            int r10 = r9.size()     // Catch: java.lang.Throwable -> La6
            r0 = 6
            if (r10 > r0) goto L8c
            goto La9
        L8c:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> La6
        L90:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r10 == 0) goto La9
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> La6
            com.apm.insight.runtime.o$a r10 = (com.apm.insight.runtime.o.a) r10     // Catch: java.lang.Throwable -> La6
            boolean r0 = com.apm.insight.runtime.o.a.a(r10, r2)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L90
            com.apm.insight.runtime.o.a.d(r10)     // Catch: java.lang.Throwable -> La6
            goto L90
        La6:
            r0 = move-exception
            r9 = r0
            goto Laa
        La9:
            return
        Laa:
            com.apm.insight.c.a()
            java.lang.String r10 = "NPTH_CATCH"
            com.apm.insight.runtime.j.a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.a(java.util.Map, org.json.JSONArray):void");
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f20683d, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONArray b(long j8) {
        File file;
        String strA;
        Iterator<a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j8 >= next.f20688a && j8 <= next.f20689b) {
                file = next.f20690c;
                break;
            }
        }
        if (file == null) {
            Iterator<a> it2 = c(".allData").iterator();
            a aVar = null;
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (aVar == null || Math.abs(aVar.f20689b - j8) > Math.abs(next2.f20689b - j8)) {
                    aVar = next2;
                }
            }
            file = aVar == null ? null : aVar.f20690c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    return new JSONArray(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        return null;
    }

    private void a(long j8, long j10, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f20681b, j8 + "-" + j10 + ".ctx");
        File file2 = new File(this.f20681b, j8 + "-" + j10 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f20685f = new a(file, (byte) 0);
        } catch (IOException e7) {
            com.apm.insight.c.a();
            j.a(e7, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f20682c, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONObject a(long j8) {
        JSONObject jSONObject;
        File file;
        boolean z2;
        String strA;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j8 >= next.f20688a && j8 <= next.f20689b) {
                file = next.f20690c;
                break;
            }
        }
        if (file == null) {
            Iterator<a> it2 = c(".ctx").iterator();
            a aVar = null;
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (aVar == null || Math.abs(aVar.f20689b - j8) > Math.abs(next2.f20689b - j8)) {
                    aVar = next2;
                }
            }
            file = aVar == null ? null : aVar.f20690c;
            z2 = true;
        } else {
            z2 = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    if (jSONObject != null) {
                        try {
                            jSONObject.put("unauthentic_version", 1);
                        } catch (JSONException e7) {
                            com.apm.insight.c.a();
                            j.a(e7, "NPTH_CATCH");
                        }
                    }
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        if (jSONObject != null && z2) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }
}

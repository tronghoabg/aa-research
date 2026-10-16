package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.a.e.bd;
import com.google.firebase.crashlytics.a.e.be;
import com.google.firebase.crashlytics.a.e.cv;
import com.google.firebase.crashlytics.a.e.cw;
import com.google.firebase.crashlytics.a.e.cx;
import com.google.firebase.crashlytics.a.e.cy;
import e.a.b.a.ap$$ExternalSyntheticApiModelOutline1;
import j$.util.Base64;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f9794a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private final Context f9795b;

    /* renamed from: c, reason: collision with root package name */
    private final e f9796c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.f.c f9797d;

    b(Context context, e eVar, com.google.firebase.crashlytics.a.f.c cVar) {
        this.f9795b = context;
        this.f9796c = eVar;
        this.f9797d = cVar;
    }

    private static File c(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().endsWith(str)) {
                    return file2;
                }
            }
        }
        return null;
    }

    private static void d(com.google.firebase.crashlytics.a.f.c cVar, String str, String str2, String str3) throws Throwable {
        BufferedWriter bufferedWriter;
        File file = new File(cVar.c(str), str3);
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f9794a));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str2);
            com.google.firebase.crashlytics.a.c.g.j(bufferedWriter, "Failed to close ".concat(file.toString()));
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.a.c.g.j(bufferedWriter2, "Failed to close ".concat(file.toString()));
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.a.c.g.j(bufferedWriter2, "Failed to close ".concat(file.toString()));
            throw th;
        }
    }

    public final h a(String str) throws IOException {
        com.google.firebase.crashlytics.a.f.c cVar = this.f9797d;
        File fileC = cVar.c(str);
        File file = new File(fileC, "pending");
        com.google.firebase.crashlytics.a.i.a().g("Minidump directory: ".concat(String.valueOf(file.getAbsolutePath())));
        File fileC2 = c(file, ".dmp");
        com.google.firebase.crashlytics.a.i.a().g("Minidump file ".concat((fileC2 == null || !fileC2.exists()) ? "does not exist" : "exists"));
        f fVar = new f();
        if (fileC.exists() && file.exists()) {
            File fileC3 = c(file, ".dmp");
            be beVarA = null;
            str = null;
            String str2 = null;
            beVarA = null;
            if (Build.VERSION.SDK_INT >= 31) {
                List historicalProcessExitReasons = ((ActivityManager) this.f9795b.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                long jLastModified = cVar.f(str, "start-time").lastModified();
                ArrayList arrayList = new ArrayList();
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo applicationExitInfoM = ap$$ExternalSyntheticApiModelOutline1.m(it.next());
                    if (applicationExitInfoM.getReason() == 5 && applicationExitInfoM.getTimestamp() >= jLastModified) {
                        arrayList.add(applicationExitInfoM);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ApplicationExitInfo applicationExitInfoM2 = ap$$ExternalSyntheticApiModelOutline1.m(arrayList.get(0));
                    bd bdVar = new bd();
                    bdVar.c(applicationExitInfoM2.getImportance());
                    bdVar.e(applicationExitInfoM2.getProcessName());
                    bdVar.g(applicationExitInfoM2.getReason());
                    bdVar.i(applicationExitInfoM2.getTimestamp());
                    bdVar.d(applicationExitInfoM2.getPid());
                    bdVar.f(applicationExitInfoM2.getPss());
                    bdVar.h(applicationExitInfoM2.getRss());
                    try {
                        InputStream traceInputStream = applicationExitInfoM2.getTraceInputStream();
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i2 = traceInputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                try {
                                    gZIPOutputStream.write(byteArray);
                                    gZIPOutputStream.finish();
                                    String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream2.toByteArray());
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    str2 = strEncodeToString;
                                } finally {
                                }
                            } finally {
                            }
                        }
                    } catch (IOException unused) {
                        com.google.firebase.crashlytics.a.i.a().h("Failed to get input stream from ApplicationExitInfo");
                    }
                    bdVar.j(str2);
                    beVarA = bdVar.a();
                }
            }
            fVar.j(new g(fileC3, beVarA));
            fVar.i(c(fileC, ".device_info"));
            fVar.l(new File(fileC, "session.json"));
            fVar.g(new File(fileC, "app.json"));
            fVar.h(new File(fileC, "device.json"));
            fVar.k(new File(fileC, "os.json"));
        }
        return new h(fVar);
    }

    public final boolean b(String str, String str2, long j2, cy cyVar) throws Throwable {
        com.google.firebase.crashlytics.a.f.c cVar = this.f9797d;
        try {
            if (!this.f9796c.a(cVar.c(str).getCanonicalPath(), this.f9795b.getAssets())) {
                return false;
            }
            HashMap map = new HashMap();
            map.put("session_id", str);
            map.put("generator", str2);
            map.put("started_at_seconds", Long.valueOf(j2));
            d(cVar, str, new JSONObject(map).toString(), "session.json");
            cv cvVarB = cyVar.b();
            d(cVar, str, j.a(cvVarB.d(), cvVarB.f(), cvVarB.g(), cvVarB.e(), cvVarB.b(), cvVarB.c().b(), cvVarB.c().c()), "app.json");
            cx cxVarD = cyVar.d();
            String strC = cxVarD.c();
            String strB = cxVarD.b();
            boolean zD = cxVarD.d();
            HashMap map2 = new HashMap();
            map2.put("version", strC);
            map2.put("build_version", strB);
            map2.put("is_rooted", Boolean.valueOf(zD));
            d(cVar, str, new JSONObject(map2).toString(), "os.json");
            cw cwVarC = cyVar.c();
            int iB = cwVarC.b();
            String strH = cwVarC.h();
            int iC = cwVarC.c();
            long jF = cwVarC.f();
            long jE = cwVarC.e();
            boolean zJ = cwVarC.j();
            int iD = cwVarC.d();
            String strG = cwVarC.g();
            String strI = cwVarC.i();
            HashMap map3 = new HashMap();
            map3.put("arch", Integer.valueOf(iB));
            map3.put("build_model", strH);
            map3.put("available_processors", Integer.valueOf(iC));
            map3.put("total_ram", Long.valueOf(jF));
            map3.put("disk_space", Long.valueOf(jE));
            map3.put("is_emulator", Boolean.valueOf(zJ));
            map3.put("state", Integer.valueOf(iD));
            map3.put("build_manufacturer", strG);
            map3.put("build_product", strI);
            d(cVar, str, new JSONObject(map3).toString(), "device.json");
            return true;
        } catch (IOException e2) {
            com.google.firebase.crashlytics.a.i.a().e("Error initializing Crashlytics NDK", e2);
            return false;
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class rxo {
    private static final ypf a = yph.c("GH.FILE_WRITER");
    private static final yfq b = yfq.r("com.google.android.gms", "com.google.android.gms.policy_car");
    private final Context c;
    private final File d;

    public rxo(Context context) {
        this.c = context;
        this.d = context.getCacheDir();
    }

    private static String e(String str) {
        return "connectivity/logs/".concat(String.valueOf(str));
    }

    public final File a(String str) throws IOException {
        String str2 = String.format("%s__%s%s", str, "dump", ".log");
        String strE = e(str2);
        ypf ypfVar = a;
        ypfVar.l().ai(8508).y("Loading log file: %s", strE);
        rhx rhxVar = rhx.c;
        File file = new File(this.d, strE);
        ypfVar.l().ai(8509).y("Full file path: %s", file.getAbsolutePath());
        if (file.exists()) {
            return file;
        }
        throw new IOException("Invalid log id ".concat(String.valueOf(str2)));
    }

    public final String b(String str, boolean z) throws IOException {
        String str2 = String.format("%s__%s%s", str, "dump", ".log");
        ypf ypfVar = a;
        ypfVar.l().ai(8502).y("New dump file name: %s", str2);
        try {
            String strE = e(str2);
            ypfVar.l().ai(8510).y("Dumping log to file: %s", strE);
            rhx rhxVar = rhx.c;
            File file = this.d;
            File file2 = new File(file, "connectivity/logs/");
            if (!file2.mkdirs()) {
                ypfVar.h().ai(8507).y("FAILED TO CREATE DIRECTORY: %s", file2.getAbsolutePath());
            }
            File file3 = new File(file, strE);
            if (!file3.exists()) {
                ypfVar.l().ai(8503).y("Creating file: %s", file3.getAbsolutePath());
                if (!file3.createNewFile()) {
                    ypfVar.h().ai(8504).y("FAILED TO CREATE FILE: %s", file3.getAbsolutePath());
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                ypfVar.l().ai(8500).y("Output stream opened: %s", file3.getAbsolutePath());
                riw.a(fileOutputStream, 5000);
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format(Locale.US, "---------- %s ----------\n\n", "Version Info for Apps Relying on Car API "));
                    c(sb);
                    sb.append("\n\n");
                    fileOutputStream.write(sb.toString().getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.write(String.format(Locale.US, "---------- %s ----------\n\n", "Car Dump").getBytes(StandardCharsets.UTF_8));
                    riw.b(this.c, fileOutputStream);
                }
                fileOutputStream.close();
                ypfVar.l().ai(8501).u("Logs captured");
                return str2;
            } finally {
            }
        } catch (IOException e) {
            throw new IOException("Failed to capture Connectivity Log Dump", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(StringBuilder sb) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.c.getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        ygp ygpVar = new ygp();
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (applicationInfo.metaData != null && applicationInfo.metaData.get("com.google.android.gms.car.application") != null) {
                ygpVar.c(applicationInfo.packageName);
            }
        }
        ygpVar.k(b);
        yno it = ygpVar.g().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                sb.append(str);
                sb.append(": ");
                sb.append(packageInfo.versionName);
                sb.append(" / ");
                sb.append(packageInfo.versionCode);
                sb.append("\n");
            } catch (PackageManager.NameNotFoundException unused) {
                sb.append(str);
                sb.append(": <not found>\n");
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final void d(String str) {
        try {
            if (a(str).delete()) {
                return;
            }
            a.g().ai(8505).y("Unable to delete log for id %s", str);
        } catch (IOException unused) {
            a.h().ai(8506).y("Log file for id %s not found, can not delete.", str);
        }
    }
}

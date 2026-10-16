package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class riw {
    private static final ygr a = new ymp("com.google.android.projection.gearhead/com.google.android.apps.auto.carservice.service.impl.GearheadCarStartupService");
    private static final byte[] b = "\n".getBytes();
    private static final ykd c;

    static {
        Runtime runtime = Runtime.getRuntime();
        runtime.getClass();
        c = new ykd(runtime);
    }

    @ResultIgnorabilityUnspecified
    public static long a(OutputStream outputStream, int i) throws IOException {
        char c2;
        char c3;
        char c4;
        char c5;
        f("logcat -b main,system,events,crash", outputStream);
        String[] strArr = {"logcat", "-v", "threadtime", "-d", "-b", "main,system,events,crash"};
        if (i > 0) {
            c2 = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            c3 = 1;
            strArr = (String[]) spu.g(strArr, new String[]{"-t", sb.toString()});
        } else {
            c2 = 0;
            c3 = 1;
        }
        long jC = c(strArr, outputStream);
        if (jC > 100) {
            return jC;
        }
        f("logcat -b main,system,crash", outputStream);
        String[] strArr2 = new String[4];
        strArr2[c2] = "logcat";
        strArr2[c3] = "-v";
        strArr2[2] = "threadtime";
        strArr2[3] = "-d";
        if (i > 0) {
            c4 = 3;
            c5 = 4;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((i * 4) / 5);
            String[] strArr3 = {"-t", sb2.toString()};
            String[][] strArr4 = new String[2][];
            strArr4[c2] = strArr2;
            strArr4[c3] = strArr3;
            strArr2 = (String[]) spu.g(strArr4);
        } else {
            c4 = 3;
            c5 = 4;
        }
        long jC2 = jC + c(strArr2, outputStream);
        f("logcat -b events", outputStream);
        String[] strArr5 = new String[6];
        strArr5[c2] = "logcat";
        strArr5[c3] = "-v";
        strArr5[2] = "threadtime";
        strArr5[c4] = "-d";
        strArr5[c5] = "-b";
        strArr5[5] = "events";
        if (i > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i / 5);
            String[] strArr6 = {"-t", sb3.toString()};
            String[][] strArr7 = new String[2][];
            strArr7[c2] = strArr5;
            strArr7[c3] = strArr6;
            strArr5 = (String[]) spu.g(strArr7);
        }
        return jC2 + c(strArr5, outputStream);
    }

    public static void b(Context context, OutputStream outputStream) throws IOException {
        if (qsu.a(context, "android.permission.DUMP") != 0) {
            outputStream.write("Missing dump permission".getBytes());
            return;
        }
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (applicationInfo.metaData != null && applicationInfo.metaData.get("com.google.android.gms.car.application") != null) {
                arrayList.add(applicationInfo.packageName);
            }
        }
        if (!arrayList.contains("com.google.android.gms")) {
            arrayList.add("com.google.android.gms");
        }
        d("", arrayList, outputStream);
        d("services", arrayList, outputStream);
        d("service", arrayList, outputStream);
        d("service", a, outputStream);
        d("provider", arrayList, outputStream);
        e("meminfo", outputStream);
        if (a.O()) {
            f("audio ring buffer", outputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);
            ols.S(printWriter);
            printWriter.flush();
            outputStream.write(b);
        }
        e("audio", outputStream);
        e("media.audio_flinger", outputStream);
        e("SurfaceFlinger", outputStream);
        e("bluetooth_manager", outputStream);
        e("usb", outputStream);
        e("window", outputStream);
    }

    @ResultIgnorabilityUnspecified
    private static long c(String[] strArr, OutputStream outputStream) throws IOException {
        InputStream inputStream = ((Runtime) c.a).exec(strArr).getInputStream();
        long jA = yts.a(inputStream, outputStream);
        inputStream.close();
        return jA;
    }

    private static void d(String str, Iterable iterable, OutputStream outputStream) throws IOException {
        f("dumpsys activity ".concat(str), outputStream);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                String[] strArr = TextUtils.isEmpty(str) ? new String[]{"dumpsys", "activity", str2} : new String[]{"dumpsys", "activity", str, str2};
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                c(strArr, byteArrayOutputStream);
                String string = byteArrayOutputStream.toString();
                if (!string.startsWith("Bad activity command")) {
                    outputStream.write(string.getBytes());
                }
            } catch (IOException unused) {
            }
            outputStream.write(b);
        }
    }

    private static void e(String str, OutputStream outputStream) throws IOException {
        f("dumpsys ".concat(str), outputStream);
        c(new String[]{"dumpsys", str}, outputStream);
        outputStream.write(b);
    }

    private static void f(String str, OutputStream outputStream) throws IOException {
        outputStream.write(String.format(Locale.US, "---------- %s ----------\n", str).getBytes());
    }
}

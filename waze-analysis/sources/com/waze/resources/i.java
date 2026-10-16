package com.waze.resources;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.waze.web.r;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f35096a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final String f35097b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f35098c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f35099d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f35100e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f35101f;

    static {
        String strConcat = String.valueOf(e()).concat(DomExceptionUtils.SEPARATOR);
        f35097b = strConcat;
        f35098c = String.valueOf(strConcat).concat("waze/");
        f35099d = String.valueOf(Environment.getExternalStorageDirectory().getPath()).concat("/waze/");
        f35100e = strConcat;
        f35101f = true;
    }

    public static void a() {
        Context context = (Context) r.h(Application.class);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            File file = new File(f35098c);
            boolean z = true;
            if (c() >= packageInfo.versionCode && file.exists()) {
                z = false;
            }
            f35096a = z;
            if (z) {
                f(false);
            } else {
                com.waze.shared_infra.i.h.a("Resources extraction unnecessary");
            }
        } catch (PackageManager.NameNotFoundException e2) {
            com.waze.shared_infra.i.h.e("Prepare failure", e2);
            d().a(e2, null);
        }
    }

    public static void b() throws Throwable {
        new File(String.format("%s/%s", f35097b, "version")).delete();
        f35096a = true;
        f(true);
    }

    private static int c() throws NumberFormatException {
        String strConcat = String.valueOf(f35097b).concat("version");
        try {
            if (!new File(strConcat).exists()) {
                return -1;
            }
            char[] cArr = new char[7];
            FileReader fileReader = new FileReader(strConcat);
            fileReader.read(cArr, 0, 7);
            int i2 = Integer.parseInt(new String(cArr));
            fileReader.close();
            return i2;
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Error! While file I/O", e2);
            d().a(e2, null);
            return -1;
        }
    }

    private static com.waze.shared_infra.i.b d() {
        return (com.waze.shared_infra.i.b) r.h(com.waze.shared_infra.i.b.class);
    }

    private static String e() {
        return ((Application) r.h(Application.class)).getFilesDir().getParent();
    }

    private static void f(boolean z) throws Throwable {
        PackageInfo packageInfo;
        int i2;
        String str;
        g[] gVarArr;
        g[] gVarArr2;
        g[] gVarArr3;
        g[] gVarArr4;
        g[] gVarArr5 = null;
        try {
            Application application = (Application) r.h(Application.class);
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            com.waze.shared_infra.i.h.e("Prepare failure", e2);
            d().a(e2, null);
            packageInfo = null;
        }
        int i3 = packageInfo.versionCode;
        int iC = c();
        String str2 = f35098c;
        String str3 = f35097b;
        File file = new File(String.valueOf(str3).concat("waze"));
        if (iC != -1) {
            String strE = e();
            String str4 = f35099d;
            if (!strE.equals(str4) && !file.exists()) {
                new File(str4).renameTo(new File(f35100e));
            }
        }
        String str5 = f35100e;
        boolean zExists = new File(String.valueOf(str5).concat("waze_log.txt")).exists();
        boolean zExists2 = new File(String.valueOf(str3).concat("waze_log.txt")).exists();
        if (zExists) {
            new File(String.valueOf(str5).concat("waze_log.txt")).delete();
        }
        if (zExists2) {
            new File(String.valueOf(str3).concat("waze_log.txt")).delete();
        }
        new File(String.valueOf(str5).concat("logcat.txt")).delete();
        if (iC < 0) {
            h.c(str3, true, g(false));
            h.c(str2, true, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new g("user", 0));
            arrayList.add(new g("session", 0));
            arrayList.add(new g("preferences", 0));
            arrayList.add(new g("history", 0));
            arrayList.add(new g("skins", 0, 1));
            gVarArr4 = new g[arrayList.size()];
            arrayList.toArray(gVarArr4);
            arrayList.clear();
            i2 = i3;
            str = "Prepare failure";
            gVarArr = null;
            gVarArr2 = null;
            gVarArr3 = null;
        } else {
            g[] gVarArrG = g(true);
            String strReplaceAll = "maps/".replaceAll(DomExceptionUtils.SEPARATOR, "");
            String strReplaceAll2 = "tts/".replaceAll(DomExceptionUtils.SEPARATOR, "");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new g("history", 0));
            arrayList2.add(new g("session", 0));
            arrayList2.add(new g("preferences", 0));
            i2 = i3;
            arrayList2.add(new g("locks", 0));
            arrayList2.add(new g("search_conf", 1));
            str = "Prepare failure";
            arrayList2.add(new g("sound", 1, 2));
            arrayList2.add(new g("user", 0));
            arrayList2.add(new g("user.db", 0));
            arrayList2.add(new g(strReplaceAll, 1, 2));
            arrayList2.add(new g("lang.", 1, 2));
            arrayList2.add(new g("prompts.conf", 1));
            arrayList2.add(new g("skins", 0, 1));
            arrayList2.add(new g("shader_cache", 0));
            arrayList2.add(new g(strReplaceAll2, 1, 2));
            arrayList2.add(new g("custom_prompts", 0, 2));
            arrayList2.add(new g("custom_prompts_temp", 0, 2));
            arrayList2.add(new g("cached_data", 1));
            arrayList2.add(new g("insights.db", 1));
            arrayList2.add(new g("insights_config.pb", 1));
            g[] gVarArr6 = new g[arrayList2.size()];
            arrayList2.toArray(gVarArr6);
            arrayList2.clear();
            gVarArr = new g[]{new g("user", 1)};
            gVarArr5 = new g[]{new g("session", 1)};
            gVarArr2 = new g[]{new g("preferences", 1)};
            gVarArr3 = new g[]{new g("history", 1)};
            boolean zExists3 = new File(String.valueOf(str2).concat("user")).exists();
            boolean zExists4 = new File(String.valueOf(str3).concat("user")).exists();
            if (zExists3 && !zExists4) {
                h.a(String.valueOf(str2).concat("user"), String.valueOf(str3).concat("user"));
                h.b(String.valueOf(str2).concat("user"));
            }
            boolean zExists5 = new File(String.valueOf(str2).concat("session")).exists();
            boolean zExists6 = new File(String.valueOf(str3).concat("session")).exists();
            if (zExists5 && !zExists6) {
                h.a(String.valueOf(str2).concat("session"), String.valueOf(str3).concat("session"));
                h.b(String.valueOf(str2).concat("session"));
            }
            boolean zExists7 = new File(String.valueOf(str2).concat("preferences")).exists();
            boolean zExists8 = new File(String.valueOf(str3).concat("preferences")).exists();
            if (zExists7 && !zExists8) {
                h.a(String.valueOf(str2).concat("preferences"), String.valueOf(str3).concat("preferences"));
                h.b(String.valueOf(str2).concat("preferences"));
            }
            boolean zExists9 = new File(String.valueOf(str2).concat("history")).exists();
            boolean zExists10 = new File(String.valueOf(str3).concat("history")).exists();
            if (zExists9 && !zExists10) {
                h.a(String.valueOf(str2).concat("history"), String.valueOf(str3).concat("history"));
                h.b(String.valueOf(str2).concat("history"));
            }
            h.c(str2, true, gVarArr6);
            String[] list = new File(String.valueOf(str2).concat("maps/")).list();
            if (list != null) {
                int i4 = 0;
                while (i4 < list.length) {
                    String str6 = list[i4];
                    g[] gVarArr7 = gVarArr6;
                    if (str6 != null && str6.endsWith(".dat")) {
                        h.b(str2 + "maps/" + str6);
                    }
                    i4++;
                    gVarArr6 = gVarArr7;
                }
            }
            h.c(str3, true, gVarArrG);
            gVarArr4 = gVarArr6;
        }
        System.gc();
        h("assets/res", str2, 2, gVarArr4);
        h("assets/res/skins", String.valueOf(str2).concat("skins/"), 2, null);
        h("assets/res/sound", String.valueOf(str2).concat("sound/"), 2, null);
        h("assets/res/godot", String.valueOf(str2).concat("godot/"), 2, gVarArr4);
        h("assets/res/user", String.valueOf(str3).concat("user"), 1, gVarArr);
        h("assets/res/session", String.valueOf(str3).concat("session"), 1, gVarArr5);
        if (z) {
            h("assets/res/preferences", String.valueOf(str3).concat("preferences"), 1, gVarArr2);
        }
        h("assets/res/history", String.valueOf(str3).concat("history"), 1, gVarArr3);
        if (f35101f) {
            try {
                FileWriter fileWriter = new FileWriter(String.valueOf(str3).concat("version"));
                fileWriter.write(String.valueOf(i2));
                fileWriter.close();
            } catch (Exception e3) {
                com.waze.shared_infra.i.h.e("Error! Failed to update version file", e3);
                d().a(e3, null);
            }
        }
        File file2 = new File(String.valueOf(f35100e).concat("/.nomedia"));
        if (file2.exists()) {
            return;
        }
        try {
            file2.createNewFile();
        } catch (IOException e4) {
            com.waze.shared_infra.i.h.e(str, e4);
            d().a(e4, null);
        }
    }

    private static g[] g(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g("spdlog.", 0, 2));
        arrayList.add(new g("cache", 0));
        arrayList.add(new g("databases", 0));
        arrayList.add(new g("lib", 0));
        arrayList.add(new g("shared_prefs", 0));
        arrayList.add(new g("code_cache", 0));
        arrayList.add(new g("custom_recordings", 0));
        arrayList.add(new g("custom_prompts", 0, 2));
        arrayList.add(new g("custom_prompts_temp", 0, 2));
        arrayList.add(new g("shader_cache", 0));
        arrayList.add(new g("cached_data", 1));
        arrayList.add(new g(".crashlytics", 0, 2));
        arrayList.add(new g("locks", 0));
        arrayList.add(new g("migration_status", 0));
        arrayList.add(new g("waze_config.", 0, 2));
        if (z) {
            String strReplaceAll = "maps/".replaceAll(DomExceptionUtils.SEPARATOR, "");
            String strReplaceAll2 = "tts/".replaceAll(DomExceptionUtils.SEPARATOR, "");
            arrayList.add(new g("user", 0));
            arrayList.add(new g("session", 0));
            arrayList.add(new g("preferences", 0));
            arrayList.add(new g("history", 0));
            arrayList.add(new g("user.db", 0));
            arrayList.add(new g("search_conf", 0));
            arrayList.add(new g("sound", 0, 2));
            arrayList.add(new g(strReplaceAll, 0, 2));
            arrayList.add(new g("lang.", 0, 2));
            arrayList.add(new g("prompts.conf", 0));
            arrayList.add(new g("skins", 0, 1));
            arrayList.add(new g(strReplaceAll2, 0, 2));
            arrayList.add(new g("search_conf", 0, 2));
            arrayList.add(new g("insights.db", 1));
            arrayList.add(new g("insights_config.pb", 1));
        }
        g[] gVarArr = new g[arrayList.size()];
        arrayList.toArray(gVarArr);
        arrayList.clear();
        return gVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(java.lang.String r12, java.lang.String r13, int r14, com.waze.resources.g[] r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.resources.i.h(java.lang.String, java.lang.String, int, com.waze.resources.g[]):void");
    }
}

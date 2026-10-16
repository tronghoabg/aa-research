package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vrn {
    public static volatile android.app.ActivityManager a;
    static volatile boolean b;
    private static volatile java.lang.String c;

    private vrn() {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    public static java.lang.String a() throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        if (c == null) {
            int iMyPid = android.os.Process.myPid();
            java.lang.String strTrim = null;
            strTrim = null;
            strTrim = null;
            java.io.BufferedReader bufferedReader2 = null;
            if (iMyPid > 0) {
                try {
                    bufferedReader = new java.io.BufferedReader(new java.io.FileReader(defpackage.a.bm(iMyPid, "/proc/", "/cmdline")));
                    try {
                        java.lang.String line = bufferedReader.readLine();
                        line.getClass();
                        strTrim = line.trim();
                    } catch (java.io.IOException unused) {
                        if (bufferedReader != null) {
                        }
                        if (strTrim != null) {
                            c = strTrim;
                        }
                        return c;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (java.io.IOException unused3) {
                    bufferedReader = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused4) {
                }
            }
            if (strTrim != null) {
                c = strTrim;
            }
        }
        return c;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str == null || !str2.startsWith(str)) {
            return str2;
        }
        int length = str.length();
        if (str2.length() == length) {
            return null;
        }
        return str2.substring(length + 1);
    }

    public static boolean c(android.content.Context context, defpackage.vro vroVar) {
        if (!vroVar.a) {
            return false;
        }
        defpackage.ygw<android.app.ActivityManager.RunningAppProcessInfo> ygwVarA = vroVar.a();
        java.lang.String packageName = context.getPackageName();
        java.lang.String strValueOf = java.lang.String.valueOf(packageName);
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ygwVarA) {
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(strValueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static defpackage.vro d(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("activity");
        systemService.getClass();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            return new defpackage.vro(true, defpackage.ygw.o(runningAppProcesses));
        }
        int i = defpackage.ygw.d;
        return new defpackage.vro(false, defpackage.ymx.a);
    }
}

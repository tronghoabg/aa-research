package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class waw {
    private static volatile defpackage.xyn a;

    private waw() {
    }

    public static defpackage.xyn a(android.content.Context context) {
        defpackage.xyn xynVar;
        defpackage.xyn xysVar;
        defpackage.xyn xysVar2;
        defpackage.xyn xynVar2 = a;
        if (xynVar2 != null) {
            return xynVar2;
        }
        synchronized (defpackage.waw.class) {
            xynVar = a;
            if (xynVar == null) {
                java.lang.String str = android.os.Build.TYPE;
                java.lang.String str2 = android.os.Build.TAGS;
                int i = defpackage.way.a;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    int i2 = defpackage.tnx.a;
                    if (!a$.ExternalSyntheticApiModelOutline2.m(context)) {
                        context = a$.ExternalSyntheticApiModelOutline2.m(context);
                    }
                    android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        android.os.StrictMode.allowThreadDiskWrites();
                        try {
                            java.io.File file = new java.io.File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            xysVar = file.exists() ? new defpackage.xys(file) : defpackage.xxe.a;
                        } catch (java.lang.RuntimeException e) {
                            android.util.Log.e("HermeticFileOverrides", "no data dir", e);
                            xysVar = defpackage.xxe.a;
                        }
                        if (xysVar.f()) {
                            java.lang.Object objB = xysVar.b();
                            try {
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream((java.io.File) objB)));
                                try {
                                    defpackage.aba abaVar = new defpackage.aba(0);
                                    java.util.HashMap map = new java.util.HashMap();
                                    while (true) {
                                        java.lang.String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        java.lang.String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            android.util.Log.e("HermeticFileOverrides", defpackage.a.bA(line, "Invalid: "));
                                        } else {
                                            java.lang.String str3 = new java.lang.String(strArrSplit[0]);
                                            java.lang.String strDecode = android.net.Uri.decode(new java.lang.String(strArrSplit[1]));
                                            java.lang.String strDecode2 = (java.lang.String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                java.lang.String str4 = new java.lang.String(strArrSplit[2]);
                                                strDecode2 = android.net.Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            defpackage.aba abaVar2 = (defpackage.aba) abaVar.get(str3);
                                            if (abaVar2 == null) {
                                                abaVar2 = new defpackage.aba(0);
                                                abaVar.put(str3, abaVar2);
                                            }
                                            abaVar2.put(strDecode, strDecode2);
                                        }
                                    }
                                    android.util.Log.w("HermeticFileOverrides", "Parsed " + objB.toString() + " for Android package " + context.getPackageName());
                                    defpackage.roy royVar = new defpackage.roy(abaVar);
                                    bufferedReader.close();
                                    xysVar2 = new defpackage.xys(royVar);
                                } catch (java.lang.Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (java.io.IOException e2) {
                                throw new java.lang.RuntimeException(e2);
                            }
                        } else {
                            xysVar2 = defpackage.xxe.a;
                        }
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        xynVar = xysVar2;
                    } catch (java.lang.Throwable th3) {
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    xynVar = defpackage.xxe.a;
                }
                a = xynVar;
            }
        }
        return xynVar;
    }
}

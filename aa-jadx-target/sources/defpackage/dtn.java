package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dtn {
    static android.app.Notification.MessagingStyle a(android.app.Notification.MessagingStyle messagingStyle, android.app.Notification.MessagingStyle.Message message) {
        return a$.ExternalSyntheticApiModelOutline2.m(messagingStyle, message);
    }

    static android.app.Notification.MessagingStyle b(android.app.Notification.MessagingStyle messagingStyle, java.lang.CharSequence charSequence) {
        return a$.ExternalSyntheticApiModelOutline2.m(messagingStyle, charSequence);
    }

    public static java.io.File c(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        java.lang.String str = ".font" + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            java.io.File file = new java.io.File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (java.io.IOException unused) {
            }
        }
        return null;
    }

    public static boolean d(java.io.File file, java.io.InputStream inputStream) throws java.lang.Throwable {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            defpackage.tna.t(fileOutputStream2);
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    android.util.Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    defpackage.tna.t(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    defpackage.tna.t(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static boolean e(java.io.File file, android.content.res.Resources resources, int i) throws java.lang.Throwable {
        java.io.InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zD = d(file, inputStreamOpenRawResource);
                defpackage.tna.t(inputStreamOpenRawResource);
                return zD;
            } catch (java.lang.Throwable th) {
                th = th;
                defpackage.tna.t(inputStreamOpenRawResource);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static final defpackage.afdo f(aiuw aiuwVar) {
        defpackage.bwp bwpVar = aiwg.d;
        defpackage.afdo afdoVar = ((ajcw) aiuwVar).a;
        return afdoVar.get(bwpVar) == null ? afdoVar.plus(new aiwi((aiwg) null)) : afdoVar;
    }
}

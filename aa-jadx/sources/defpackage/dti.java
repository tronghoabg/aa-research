package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dti {
    public static int a(android.app.RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static int b(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static final java.io.IOException c(java.io.File file, java.io.IOException iOException) {
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            return e(file, iOException);
        }
        if (!parentFile.exists()) {
            return e(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? e(file, iOException) : e(file, iOException);
            }
            return parentFile.canWrite() ? e(file, iOException) : e(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? e(file, iOException) : e(file, iOException);
        }
        return parentFile.canWrite() ? e(file, iOException) : e(file, iOException);
    }

    public static final java.lang.Exception d(java.lang.String str, java.lang.Exception exc) {
        int i;
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class);
            method.getClass();
            try {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                parcelObtain.getClass();
                android.os.Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (java.lang.Throwable unused) {
                android.util.Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            java.lang.Object objInvoke = method.invoke(null, defpackage.a.bm(i, "sys.user.", ".ce_available"), "false");
            objInvoke.getClass();
            if (!defpackage.afga.f((java.lang.String) objInvoke, "true")) {
                if (str != null) {
                    java.io.File file = new java.io.File(str, "siblingTestFile.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    try {
                        try {
                            file.createNewFile();
                        } catch (java.io.IOException unused2) {
                            exc = new defpackage.egm(exc);
                        }
                        return exc;
                    } finally {
                        file.delete();
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            defpackage.adrs.E(exc, th);
        }
        return exc;
    }

    private static final java.io.IOException e(java.io.File file, java.io.IOException iOException) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "]");
        } catch (java.io.IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new java.io.IOException(sb.toString(), iOException);
    }
}

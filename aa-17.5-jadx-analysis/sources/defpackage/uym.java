package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;

/* loaded from: classes3.dex */
public final class uym {
    private static final yob a = yob.c("com/google/android/libraries/geo/systems/fileutil/FileUtil");

    public static File a(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        try {
            File file = new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.dataDir, "files");
            file.mkdirs();
            return file;
        } catch (PackageManager.NameNotFoundException e) {
            ((ynz) ((ynz) a.g()).ai((char) 9723)).u("Error trying to get packageInfo from PackageManager");
            throw new AssertionError(e);
        }
    }

    public static File b(File file) {
        return (file == null || !file.getName().equals("files")) ? file : file.getParentFile();
    }

    public static void c(File file) {
        File[] fileArrListFiles;
        if (file.exists()) {
            if (file.isDirectory() && file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    c(file2);
                }
            }
            file.delete();
        }
    }
}

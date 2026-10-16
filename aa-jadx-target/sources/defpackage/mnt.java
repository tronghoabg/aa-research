package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mnt {
    public static final defpackage.mnt a = new defpackage.mnt();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.StatusReportTmpFiles");

    public static final void a(android.content.Context context, java.lang.String str, java.io.PrintWriter printWriter) {
        context.getClass();
        printWriter.getClass();
        if (defpackage.acrc.c()) {
            if (str.length() <= 0) {
                throw new java.lang.IllegalArgumentException("directoryName must be nonempty");
            }
            java.io.File[] fileArrD = d(context, str);
            if (fileArrD != null) {
                for (java.io.File file : defpackage.afga.bV(fileArrD, new aiq(11))) {
                    printWriter.println("-- Previous report at " + file.getName() + " --");
                    try {
                        defpackage.mda mdaVar = new defpackage.mda(printWriter, 10);
                        java.nio.charset.Charset charset = aitd.a;
                        file.getClass();
                        charset.getClass();
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), charset));
                        try {
                            java.util.Iterator itA = afsg.c(new afen(bufferedReader, 0)).a();
                            while (itA.hasNext()) {
                                mdaVar.invoke(itA.next());
                            }
                            defpackage.afga.n(bufferedReader, null);
                        } catch (java.lang.Throwable th) {
                            try {
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                defpackage.afga.n(bufferedReader, th);
                                throw th2;
                            }
                        }
                    } catch (java.io.IOException e) {
                        ((defpackage.yqj) ((defpackage.yqj) b.g()).p(e)).y("Encountered error reading temp file %s", file);
                        printWriter.println("Encountered error reading temp file, skipping remainder...");
                    }
                    printWriter.println();
                }
            }
        }
    }

    public static final void b(android.content.Context context, java.lang.String str, int i, mnr mnrVar) {
        context.getClass();
        if (defpackage.acrc.c()) {
            if (str.length() <= 0) {
                throw new java.lang.IllegalArgumentException("directoryName must be nonempty");
            }
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            mnrVar.a(new java.io.PrintWriter(stringWriter));
            java.lang.String string = stringWriter.toString();
            string.getClass();
            aiuw aiuwVar = mkr.a;
            ahoc.d(mkr.a, defpackage.mks.a.b(), 0, new mns(context, str, string, i, (defpackage.afdk) null), 2);
        }
    }

    public static final java.io.File c(android.content.Context context, java.lang.String str) {
        java.io.File filesDir = context.getFilesDir();
        filesDir.getClass();
        java.io.File fileE = e(filesDir, "status_report_temp_files");
        if (fileE == null) {
            return null;
        }
        return e(fileE, str);
    }

    public static final java.io.File[] d(android.content.Context context, java.lang.String str) {
        java.io.File fileC = c(context, str);
        if (fileC == null) {
            return null;
        }
        java.io.File[] fileArrListFiles = fileC.listFiles();
        if (fileArrListFiles != null) {
            return fileArrListFiles;
        }
        ((defpackage.yqj) b.g()).y("listFiles() on %s returned null. It may not be a directory", fileC);
        return null;
    }

    private static final java.io.File e(java.io.File file, java.lang.String str) {
        java.io.File file2 = new java.io.File(file, str);
        if (file2.exists() || file2.mkdirs()) {
            return file2;
        }
        ((defpackage.yqj) b.h()).y("Failed to locate or create directory %s", str);
        return null;
    }
}

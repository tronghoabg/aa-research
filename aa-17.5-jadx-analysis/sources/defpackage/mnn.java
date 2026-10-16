package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class mnn {
    public static final mnn a = new mnn();
    public static final yph b = yph.c("GH.StatusReportTmpFiles");

    public static final void a(Context context, String str, PrintWriter printWriter) {
        context.getClass();
        printWriter.getClass();
        if (acqa.c()) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("directoryName must be nonempty");
            }
            File[] fileArrD = d(context, str);
            if (fileArrD != null) {
                for (File file : woy.db(fileArrD, new ail(11))) {
                    printWriter.println("-- Previous report at " + file.getName() + " --");
                    try {
                        mcm mcmVar = new mcm(printWriter, 14);
                        Charset charset = aise.a;
                        file.getClass();
                        charset.getClass();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
                        try {
                            Iterator itA = afrg.c(new afdn(bufferedReader, 0)).a();
                            while (itA.hasNext()) {
                                mcmVar.invoke(itA.next());
                            }
                            affa.n(bufferedReader, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                affa.n(bufferedReader, th);
                                throw th2;
                            }
                        }
                    } catch (IOException e) {
                        ((ype) ((ype) b.g()).p(e)).y("Encountered error reading temp file %s", file);
                        printWriter.println("Encountered error reading temp file, skipping remainder...");
                    }
                    printWriter.println();
                }
            }
        }
    }

    public static final void b(Context context, String str, int i, mnl mnlVar) {
        context.getClass();
        if (acqa.c()) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("directoryName must be nonempty");
            }
            StringWriter stringWriter = new StringWriter();
            mnlVar.a(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            string.getClass();
            aitx aitxVar = mkl.a;
            ahnc.d(mkl.a, mkm.a.b(), 0, new mnm(context, str, string, i, null), 2);
        }
    }

    public static final File c(Context context, String str) {
        File filesDir = context.getFilesDir();
        filesDir.getClass();
        File fileE = e(filesDir, "status_report_temp_files");
        if (fileE == null) {
            return null;
        }
        return e(fileE, str);
    }

    public static final File[] d(Context context, String str) {
        File fileC = c(context, str);
        if (fileC == null) {
            return null;
        }
        File[] fileArrListFiles = fileC.listFiles();
        if (fileArrListFiles != null) {
            return fileArrListFiles;
        }
        ((ype) b.g()).y("listFiles() on %s returned null. It may not be a directory", fileC);
        return null;
    }

    private static final File e(File file, String str) {
        File file2 = new File(file, str);
        if (file2.exists() || file2.mkdirs()) {
            return file2;
        }
        ((ype) b.h()).y("Failed to locate or create directory %s", str);
        return null;
    }
}

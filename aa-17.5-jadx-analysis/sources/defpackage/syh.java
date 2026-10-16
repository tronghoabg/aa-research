package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public final class syh extends sxt {
    public syh() {
        super(qnl.FILE_DELETION, 10L);
    }

    private static void c(File file, FilenameFilter filenameFilter) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    c(file2, filenameFilter);
                } else if (filenameFilter.accept(file, file2.getName()) && !file2.delete()) {
                    Log.w("FILE_DELETION", "Unable to delete file: ".concat(String.valueOf(String.valueOf(file2))));
                }
            }
        }
    }

    @Override // defpackage.sxt
    public final sxy a(sxy sxyVar, xxh xxhVar) {
        if (!xxhVar.f() || ((qnz) xxhVar.b()).b != 1) {
            throw new IllegalArgumentException();
        }
        Context context = sxyVar.b;
        qnz qnzVar = (qnz) xxhVar.b();
        qnq qnqVar = qnzVar.b == 1 ? (qnq) qnzVar.c : qnq.a;
        int iAz = a.az(qnqVar.b);
        if (iAz == 0) {
            iAz = 1;
        }
        int i = iAz - 2;
        if (i == 1) {
            aboh abohVar = qnqVar.c;
            File dataDir = context.getDataDir();
            if (dataDir == null) {
                throw new IllegalStateException("Context missing dataDir");
            }
            c(dataDir, new syg(dataDir, abohVar));
            return sxyVar;
        }
        if (i != 2) {
            if (i != 3) {
                throw new UnsupportedOperationException("This storage type does not supported");
            }
            aboh abohVar2 = qnqVar.c;
            File externalFilesDir = context.getExternalFilesDir(null);
            c(externalFilesDir, new syg(externalFilesDir, abohVar2));
            return sxyVar;
        }
        aboh abohVar3 = qnqVar.c;
        File dataDir2 = context.createDeviceProtectedStorageContext().getDataDir();
        if (dataDir2 == null) {
            throw new IllegalStateException("Context missing dataDir");
        }
        c(dataDir2, new syg(dataDir2, abohVar3));
        return sxyVar;
    }

    @Override // defpackage.sxt
    public final String b() {
        return "FILE_DELETION";
    }
}

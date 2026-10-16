package defpackage;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aahl {
    private static final String a = "aahl";
    private final File b;
    private final long c;
    private final zrr d;
    private final aahi e;

    public aahl(File file, aahi aahiVar, long j, zrr zrrVar) {
        this.b = file;
        this.e = aahiVar;
        this.c = j;
        zkt.n(zrrVar, "strictModeUtil");
        this.d = zrrVar;
    }

    public static aahl a(String str, int i, long j, FileFilter fileFilter) {
        zkt.n(str, "cacheDirPath");
        zrr zrrVar = zrr.a;
        StrictMode.ThreadPolicy threadPolicyB = zrrVar.b();
        try {
            File file = new File(str);
            file.mkdirs();
            if (file.exists() && file.isDirectory()) {
                aahl aahlVar = new aahl(file, new aahi(i), j, zrrVar);
                if (fileFilter != null) {
                    aahlVar.b(fileFilter);
                }
                zrrVar.d(threadPolicyB);
                return aahlVar;
            }
            String str2 = a;
            if (zrn.e(str2, 6)) {
                Log.e(str2, a.bz(str, "Could not initialize cache directory "));
            }
            zrr.a.d(threadPolicyB);
            return null;
        } catch (Throwable th) {
            zrr.a.d(threadPolicyB);
            throw th;
        }
    }

    public final synchronized void b(FileFilter fileFilter) {
        int length;
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("loadFromDisk(%s)", fileFilter));
        }
        zrr zrrVar = this.d;
        StrictMode.ThreadPolicy threadPolicyB = zrrVar.b();
        try {
            File[] fileArrListFiles = this.b.listFiles(fileFilter);
            if (fileArrListFiles != null && (length = fileArrListFiles.length) != 0) {
                if (zrn.e(str, 4)) {
                    Log.i(str, a.bn(length, "Found ", " cached files to ingest."));
                }
                aahj[] aahjVarArr = new aahj[length];
                for (int i = 0; i < fileArrListFiles.length; i++) {
                    aahjVarArr[i] = aahj.a(fileArrListFiles[i]);
                }
                Arrays.sort(aahjVarArr, aahk.a);
                for (int i2 = 0; i2 < length; i2++) {
                    aahj aahjVar = aahjVarArr[i2];
                    this.e.put(aahjVar.b, aahjVar);
                }
                if (zrn.e(str, 4)) {
                    Integer numValueOf = Integer.valueOf(fileArrListFiles.length);
                    aahi aahiVar = this.e;
                    Log.i(str, String.format("Final cache %s => %s/%s", numValueOf, Integer.valueOf(aahiVar.size()), Integer.valueOf(aahiVar.maxSize())));
                }
            }
            zrrVar.d(threadPolicyB);
        } catch (Throwable th) {
            this.d.d(threadPolicyB);
            throw th;
        }
    }

    public final synchronized void c(String str, byte[] bArr) {
        File file;
        FileOutputStream fileOutputStream;
        zkt.n(str, "filename");
        zkt.n(bArr, "fileBytes");
        String str2 = a;
        if (zrn.e(str2, 3)) {
            Log.d(str2, String.format("put(%s,#%s)", str, Integer.valueOf(bArr.length)));
        }
        StrictMode.ThreadPolicy threadPolicyB = this.d.b();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                file = new File(this.b, str);
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            fileOutputStream.write(bArr);
            this.e.put(str, aahj.a(file));
            roc.j(fileOutputStream);
            this.d.d(threadPolicyB);
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            String str3 = a;
            if (zrn.e(str3, 6)) {
                Log.e(str3, a.bz(str, "Error writing to disk for "), e);
            }
            this.e.remove(str);
            if (fileOutputStream2 != null) {
                roc.j(fileOutputStream2);
            }
            this.d.d(threadPolicyB);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                roc.j(fileOutputStream2);
            }
            this.d.d(threadPolicyB);
            throw th;
        }
    }

    public final synchronized void d(String str) {
        zkt.n(str, "filename");
        String str2 = a;
        if (zrn.e(str2, 3)) {
            Log.d(str2, String.format("remove(%s)", str));
        }
        StrictMode.ThreadPolicy threadPolicyB = this.d.b();
        try {
            aahj aahjVar = (aahj) this.e.remove(str);
            if (zrn.e(str2, 3)) {
                Log.d(str2, String.format("remove(%s) => ?%s", str, Boolean.valueOf(aahjVar != null)));
            }
        } finally {
            this.d.d(threadPolicyB);
        }
    }

    public final synchronized byte[] e(String str) {
        aahi aahiVar;
        aahj aahjVar;
        zkt.n(str, "filename");
        String str2 = a;
        if (zrn.e(str2, 2)) {
            Log.v(str2, String.format("get(%s)", str));
        }
        zrr zrrVar = this.d;
        StrictMode.ThreadPolicy threadPolicyB = zrrVar.b();
        byte[] bArr = null;
        try {
            try {
                aahiVar = this.e;
                aahjVar = (aahj) aahiVar.get(str);
            } catch (IOException e) {
                String str3 = a;
                if (zrn.e(str3, 6)) {
                    Log.e(str3, a.bz(str, "Error reading from disk for "), e);
                }
                this.e.remove(str);
            }
            if (aahjVar == null) {
                if (zrn.e(str2, 2)) {
                    Log.v(str2, a.bz(str, "No cache entry for "));
                }
            } else if (System.currentTimeMillis() - aahjVar.c > this.c) {
                if (zrn.e(str2, 3)) {
                    Log.d(str2, a.bz(str, "Cache entry expired for "));
                }
                aahiVar.remove(str);
            } else {
                byte[] bArrA = ytv.a(aahjVar.a);
                if (bArrA != null) {
                    if (zrn.e(str2, 3)) {
                        Log.d(str2, String.format("get(%s) => #%s", str, Integer.valueOf(bArrA.length)));
                    }
                    bArr = bArrA;
                    return bArr;
                }
                if (zrn.e(str2, 6)) {
                    Log.e(str2, a.bz(str, "Empty disk file contents for "));
                }
                aahiVar.remove(str);
            }
            zrrVar.d(threadPolicyB);
            return null;
        } finally {
            this.d.d(threadPolicyB);
        }
    }
}

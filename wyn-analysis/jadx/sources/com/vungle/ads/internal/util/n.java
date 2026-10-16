package com.vungle.ads.internal.util;

import J9.C0664x;
import android.os.Build;
import android.webkit.URLUtil;
import com.vungle.ads.AssetFailedToDeleteError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.HttpUrl;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static m f33857a = new C0664x(14);

    /* renamed from: b, reason: collision with root package name */
    public static final List f33858b = AbstractC3935e.D(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    public static final ObjectInputStream a(InputStream inputStream) {
        return new x(inputStream, f33858b);
    }

    public static final void b(File folder, Set set) {
        AbstractC3340k.e(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            a(file, set);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002c: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:45), block:B:11:0x002c */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.vungle.ads.internal.util.m] */
    public static final Object c(File file) throws Throwable {
        Closeable closeable;
        Closeable closeable2;
        ObjectInputStream objectInputStreamA;
        Closeable closeable3;
        AbstractC3340k.e(file, "file");
        ?? Exists = file.exists();
        Closeable closeable4 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
            } catch (IOException e7) {
                e = e7;
                Exists = 0;
                objectInputStreamA = null;
            } catch (ClassNotFoundException e10) {
                e = e10;
                Exists = 0;
                objectInputStreamA = null;
            } catch (Exception e11) {
                e = e11;
                Exists = 0;
                objectInputStreamA = null;
            } catch (Throwable th) {
                th = th;
                closeable2 = null;
                a(closeable2);
                a(closeable4);
                throw th;
            }
            try {
                objectInputStreamA = f33857a.a(Exists);
                try {
                    Object object = objectInputStreamA.readObject();
                    a((Closeable) objectInputStreamA);
                    a((Closeable) Exists);
                    return object;
                } catch (IOException e12) {
                    e = e12;
                    boolean z2 = u.f33874a;
                    t.b("FileUtility", "IOException: " + e.getMessage());
                    closeable3 = Exists;
                    a((Closeable) objectInputStreamA);
                    a(closeable3);
                    try {
                        a(file, (Set) null);
                    } catch (IOException unused) {
                    }
                    return null;
                } catch (ClassNotFoundException e13) {
                    e = e13;
                    boolean z10 = u.f33874a;
                    t.b("FileUtility", "ClassNotFoundException: " + e.getMessage());
                    closeable3 = Exists;
                    a((Closeable) objectInputStreamA);
                    a(closeable3);
                    a(file, (Set) null);
                    return null;
                } catch (Exception e14) {
                    e = e14;
                    boolean z11 = u.f33874a;
                    t.b("FileUtility", "cannot read serializable " + e.getMessage());
                    closeable3 = Exists;
                    a((Closeable) objectInputStreamA);
                    a(closeable3);
                    a(file, (Set) null);
                    return null;
                }
            } catch (IOException e15) {
                e = e15;
                objectInputStreamA = null;
            } catch (ClassNotFoundException e16) {
                e = e16;
                objectInputStreamA = null;
            } catch (Exception e17) {
                e = e17;
                objectInputStreamA = null;
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable4;
                closeable4 = Exists;
                a(closeable2);
                a(closeable4);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable4 = closeable;
        }
    }

    public static String d(File file) {
        AbstractC3340k.e(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return qf.i.W(file);
        } catch (IOException e7) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("IOException: ");
            sbA.append(e7.getMessage());
            t.b("FileUtility", sbA.toString());
            return null;
        } catch (Exception e10) {
            boolean z10 = u.f33874a;
            StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("cannot read string ");
            sbA2.append(e10.getMessage());
            t.b("FileUtility", sbA2.toString());
            return null;
        }
    }

    public static final void a(File file, Set set) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        if (set != null && set.contains(file.getName())) {
                            boolean z2 = u.f33874a;
                            t.a("FileUtility", "Skipping deletion of directory: " + file.getName());
                            return;
                        }
                        b(file, set);
                    }
                    if (set != null && set.contains(file.getName())) {
                        boolean z10 = u.f33874a;
                        t.a("FileUtility", "Skipping deletion of file: " + file.getName());
                        return;
                    }
                    if (file.delete()) {
                        return;
                    }
                    boolean z11 = u.f33874a;
                    t.a("FileUtility", "Failed to delete file: " + file);
                }
            } catch (Exception e7) {
                boolean z12 = u.f33874a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to delete file: ");
                sbA.append(e7.getLocalizedMessage());
                t.b("FileUtility", sbA.toString());
            }
        }
    }

    public static final void b(File file) throws IOException {
        AbstractC3340k.e(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else {
                if (file.delete()) {
                    return;
                }
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e7) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to delete ");
            sbA.append(file.getName());
            sbA.append(" with error :");
            sbA.append(e7.getMessage());
            new AssetFailedToDeleteError(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void a(File file, Serializable serializable) throws Throwable {
        Throwable th;
        ?? objectOutputStream;
        IOException e7;
        FileOutputStream fileOutputStream;
        Closeable closeable;
        AbstractC3340k.e(file, "file");
        if (file.exists()) {
            b(file);
        }
        if (serializable == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException e10) {
            e7 = e10;
            objectOutputStream = 0;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = 0;
            fileOutputStream = fileOutputStream2;
            fileOutputStream2 = objectOutputStream;
            a(fileOutputStream2);
            a(fileOutputStream);
            throw th;
        }
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.reset();
                closeable = objectOutputStream;
            } catch (IOException e11) {
                e7 = e11;
                fileOutputStream2 = fileOutputStream;
                objectOutputStream = objectOutputStream;
                try {
                    boolean z2 = u.f33874a;
                    t.b("FileUtility", String.valueOf(e7.getMessage()));
                    fileOutputStream = fileOutputStream2;
                    closeable = objectOutputStream;
                    a(closeable);
                    a(fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    fileOutputStream2 = objectOutputStream;
                    a(fileOutputStream2);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = objectOutputStream;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
        } catch (IOException e12) {
            e7 = e12;
            objectOutputStream = 0;
        } catch (Throwable th5) {
            th = th5;
            a(fileOutputStream2);
            a(fileOutputStream);
            throw th;
        }
        a(closeable);
        a(fileOutputStream);
    }

    public static void a(File file, String str) {
        AbstractC3340k.e(file, "file");
        if (str == null) {
            return;
        }
        try {
            qf.i.Y(file, str, Bf.a.f1670a);
        } catch (IOException e7) {
            boolean z2 = u.f33874a;
            t.b("FileUtility", String.valueOf(e7.getMessage()));
        }
    }

    public static boolean a(String str) {
        HttpUrl httpUrlC;
        if (str == null) {
            return false;
        }
        try {
            if (Bf.k.y0(str)) {
                return false;
            }
            HttpUrl.k.getClass();
            try {
                httpUrlC = HttpUrl.Companion.c(str);
            } catch (IllegalArgumentException unused) {
                httpUrlC = null;
            }
            return httpUrlC != null;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public static String a(String url, String str) {
        AbstractC3340k.e(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, str);
        AbstractC3340k.d(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }
}

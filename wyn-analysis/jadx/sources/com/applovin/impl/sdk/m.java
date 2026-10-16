package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import cb.AbstractC1593a;
import com.applovin.impl.AbstractC1654o0;
import com.applovin.impl.d2;
import com.applovin.impl.d4;
import com.applovin.impl.e6;
import com.applovin.impl.g2;
import com.applovin.impl.h2;
import com.applovin.impl.j5;
import com.applovin.impl.o7;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y4;
import com.applovin.shadow.okio.Segment;
import com.qonversion.android.sdk.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    private final k f23094b;

    /* renamed from: c, reason: collision with root package name */
    private final o f23095c;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23098f;

    /* renamed from: a, reason: collision with root package name */
    private final String f23093a = "FileManager";

    /* renamed from: d, reason: collision with root package name */
    private final Object f23096d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set f23097e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final g2 f23099g = a();

    public m(k kVar) {
        this.f23094b = kVar;
        this.f23095c = kVar.O();
        this.f23098f = ((Boolean) kVar.a(y4.Z0)).booleanValue();
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f23096d) {
            try {
                if (this.f23097e.contains(absolutePath)) {
                    return false;
                }
                d(file);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean g(File file) {
        if (o.a()) {
            this.f23095c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f23094b.D().a(d2.f21287Q0, "removeFile", mapHashMap);
            }
            h(file);
            return zDelete;
        } catch (Throwable th) {
            try {
                if (o.a()) {
                    this.f23095c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f23094b.D().a("FileManager", "removeFile", th);
                h(file);
                return false;
            } catch (Throwable th2) {
                h(file);
                throw th2;
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f23096d) {
            try {
                if (!this.f23097e.remove(absolutePath)) {
                    this.f23094b.D().a(d2.f21287Q0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
                }
                this.f23096d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f23094b.r0().a((j5) new s6(this.f23094b, false, "removeCachedResourcesForAd", new B(this, bVar, context, 0)), e6.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f23094b.r0().a((j5) new s6(this.f23094b, false, "removeCachedVideoResourceForAd", new B(this, bVar, context, 1)), e6.b.CACHING);
    }

    public String f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (o.a()) {
            this.f23095c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z2 = true;
        try {
            try {
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                d(file);
                                String strA = a(fileInputStream);
                                boolean z10 = strA == null;
                                fileInputStream.close();
                                if (z10 && ((Boolean) this.f23094b.a(y4.f23681R0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                h(file);
                                return strA;
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (z2 && ((Boolean) this.f23094b.a(y4.f23681R0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            throw th;
                        }
                    } catch (IOException e7) {
                        if (o.a()) {
                            this.f23095c.a("FileManager", "Failed to read file: " + file.getName() + e7);
                        }
                        this.f23095c.a("FileManager", e7);
                        this.f23094b.D().a("FileManager", "readFileIO", e7);
                        if (((Boolean) this.f23094b.a(y4.f23681R0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (Throwable th4) {
                    if (o.a()) {
                        this.f23095c.a("FileManager", "Unknown failure to read file.", th4);
                    }
                    this.f23095c.a("FileManager", th4);
                    this.f23094b.D().a("FileManager", "readFile", th4);
                    if (((Boolean) this.f23094b.a(y4.f23681R0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (FileNotFoundException e10) {
                if (o.a()) {
                    this.f23095c.d("FileManager", "File not found. " + e10);
                }
                this.f23095c.a("FileManager", e10);
                this.f23094b.D().a("FileManager", "readFileNotFound", e10);
                if (0 != 0 && ((Boolean) this.f23094b.a(y4.f23681R0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            z2 = false;
        }
    }

    private g2 a() {
        if (AbstractC1654o0.e() && ((Boolean) this.f23094b.a(y4.f23937x3)).booleanValue()) {
            try {
                return new d4(this.f23094b);
            } catch (Throwable th) {
                if (o.a()) {
                    this.f23095c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.f23094b.D().a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new h2(this.f23094b);
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f23096d) {
            zContains = this.f23097e.contains(absolutePath);
        }
        return zContains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f23096d) {
            boolean zAdd = this.f23097e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f23096d.wait();
                    zAdd = this.f23097e.add(absolutePath);
                } catch (InterruptedException e7) {
                    if (o.a()) {
                        this.f23095c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e7);
                    }
                    throw new RuntimeException(e7);
                }
            }
        }
    }

    public void b(Context context) {
        if (this.f23094b.F0()) {
            if (o.a()) {
                this.f23095c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.l0() == null) {
            return;
        }
        g(a(bVar.l0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.EMPTY_LIST;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (o.a()) {
                this.f23095c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (o.a()) {
                this.f23095c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f23094b.D().a(d2.f21287Q0, "createNoMediaFile");
        } catch (IOException e7) {
            if (o.a()) {
                this.f23095c.a("FileManager", "Failed to create .nomedia file", e7);
            }
        }
    }

    private File a(String str, boolean z2, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f23095c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (o.a()) {
            AbstractC1593a.s("Looking up cached resource: ", str, this.f23095c, "FileManager");
        }
        if (str.contains("icon")) {
            str = str.replace("/", Constants.USER_ID_SEPARATOR).replace(".", Constants.USER_ID_SEPARATOR);
        }
        File fileD = d(context);
        File file = new File(fileD, str);
        if (!z2) {
            return file;
        }
        try {
            fileD.mkdirs();
            return file;
        } catch (Throwable th) {
            if (o.a()) {
                this.f23095c.a("FileManager", "Unable to make cache directory at " + fileD, th);
            }
            this.f23094b.D().a("FileManager", "createCacheDir", th);
            return null;
        }
    }

    private String b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z2 = false;
            boolean z10 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z11 = parentFile != null && parentFile.exists();
            if (z11 && parentFile.canWrite()) {
                z2 = true;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z10 + "\nparentDirectoryExists: " + z11 + "\nisParentDirectoryWritable: " + z2;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    public boolean c(String str, Context context) {
        if (this.f23098f) {
            return b(str, context);
        }
        boolean z2 = false;
        File fileA = a(str, false, context);
        if (!e(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z2 = true;
        }
        h(fileA);
        return z2;
    }

    private long b() {
        long jLongValue = ((Long) this.f23094b.a(y4.f23597G0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i5 = inputStream.read(bArr, 0, Segment.SIZE);
                    if (i5 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i5);
                    } else {
                        String string = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return string;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f23095c.a("FileManager", th);
            this.f23094b.D().a("FileManager", "readInputStreamAsString", th);
            return null;
        }
    }

    public boolean a(InputStream inputStream, File file, boolean z2) {
        return a(inputStream, file, z2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0252 A[Catch: all -> 0x01d6, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x01d6, blocks: (B:108:0x01d2, B:111:0x01d9, B:114:0x01eb, B:116:0x01f1, B:118:0x01f7, B:119:0x020f, B:131:0x0252), top: B:244:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f8 A[Catch: all -> 0x02fe, TRY_LEAVE, TryCatch #22 {all -> 0x02fe, blocks: (B:179:0x02f2, B:181:0x02f8), top: B:261:0x02f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0324 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02bb A[EDGE_INSN: B:267:0x02bb->B:161:0x02bb BREAK  A[LOOP:1: B:135:0x025f->B:268:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a A[Catch: all -> 0x0150, TryCatch #11 {all -> 0x0150, blocks: (B:71:0x0144, B:73:0x014a, B:76:0x0153), top: B:240:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r20, java.io.File r21, boolean r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public boolean a(File file, String str, List list, int i5, String str2, Map map) {
        return a(file, str, list, true, i5, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(File file, String str, List list, boolean z2, int i5, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f23094b.g().d(d2.f21275K, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 1;
        while (i10 <= i5) {
            if (a(file, str, list, z2, str2, map2)) {
                a(true, str, i10, jElapsedRealtime, map);
                return true;
            }
            i10++;
            map2 = map;
        }
        a(false, str, i5, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z2, String str2, Map map) {
        Boolean bool = (Boolean) this.f23094b.a(y4.f23751a1);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (o.a()) {
                AbstractC1593a.s("File exists for ", str, this.f23095c, "FileManager");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f23094b.g().d(d2.L, mapHashMap);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z2, map);
            try {
                if (o.a()) {
                    this.f23095c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (o.a()) {
                        this.f23095c.a("FileManager", "Caching completed for " + file);
                    }
                    double d3 = o7.d(jElapsedRealtime2);
                    double dC = o7.c(file.length());
                    long j8 = (long) (dC / d3);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j8), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC), mapA);
                    this.f23094b.g().d(d2.f21286Q, mapA);
                    this.f23094b.d0().b(j8, str, str2);
                } else {
                    if (o.a()) {
                        this.f23095c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f23094b.g().d(d2.f21288R, a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return zA;
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.f23095c.a("FileManager", th);
                this.f23094b.D().a("FileManager", "loadAndCacheResource", th);
                if (bool.booleanValue()) {
                    h(file);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    private Map a(File file, String str, long j8, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j8), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(boolean z2, String str, int i5, long j8, Map map) {
        d2 d2Var = z2 ? d2.f21278M : d2.f21280N;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j8;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i5));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f23094b.g().d(d2Var, map2);
    }

    public InputStream a(String str, List list, boolean z2, Map map) {
        if (z2 && !o7.a(str, list)) {
            if (o.a()) {
                AbstractC1593a.s("Domain is not whitelisted, skipping precache for url: ", str, this.f23095c, "FileManager");
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (o.a()) {
            this.f23095c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f23094b.g().d(d2.f21282O, mapHashMap);
        try {
            return this.f23099g.a(httpsString, map);
        } catch (Throwable th) {
            if (o.a()) {
                this.f23095c.a("FileManager", "Error loading " + httpsString, th);
            }
            this.f23094b.D().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List listT = bVar.T();
        if (bVar.M0() || listT.contains(str)) {
            return bVar.B();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z2, int i5, String str3, Map map) {
        return a(context, str, str2, list, z2, false, i5, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z2, boolean z10, int i5, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f23095c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f23094b.D().a(d2.f21287Q0, "cacheResource");
            return null;
        }
        String strA = o7.a(Uri.parse(str), str2, this.f23094b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z2, i5, str3, map)) {
            return null;
        }
        if (o.a()) {
            AbstractC1593a.s("Caching succeeded for file ", strA, this.f23095c, "FileManager");
        }
        return z10 ? Uri.fromFile(fileA).toString() : strA;
    }

    private long a(Context context) {
        boolean zG;
        long jB = b();
        boolean z2 = jB != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f23094b.c(y4.f23635L0);
        long length = 0;
        for (File file : c(context)) {
            if (!z2 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jB) {
                zG = false;
            } else {
                if (o.a()) {
                    this.f23095c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j8, Context context) {
        long jIntValue = ((Integer) this.f23094b.a(y4.f23605H0)).intValue();
        if (jIntValue == -1) {
            if (o.a()) {
                this.f23095c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j8) > jIntValue) {
                if (o.a()) {
                    this.f23095c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (o.a()) {
                this.f23095c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        Iterator it = new ArrayList(bVar.l().keySet()).iterator();
        while (it.hasNext()) {
            g(a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri uriL0 = bVar.l0();
        if (uriL0 != null) {
            g(a(uriL0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (o.a()) {
            this.f23095c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f23094b.D().a(d2.f21287Q0, str, mapHashMap);
        } catch (Throwable th) {
            if (o.a()) {
                this.f23095c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f23094b.D().a("FileManager", str, th);
        }
    }

    private long a(long j8) {
        return j8 / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}

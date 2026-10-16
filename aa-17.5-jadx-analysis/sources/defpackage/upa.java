package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class upa implements uoi {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/diskcache/SqliteDiskCacheProvider");
    public static final String[] b = {"map_cache.db", "map_cache.db-shm", "map_cache.db-wal"};
    private static final long i;
    public final Context c;
    public final uyp d;
    public final ackk e;
    public final gms h;
    private final tpa j;
    private final tmb k;
    private final zgt l;
    private uoz m;
    private final urg q;
    private final kex r;
    private final ykd s;
    boolean f = false;
    private long n = 0;
    private long o = -1;
    private long p = -1;
    protected File g = null;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        i = 864000000L;
    }

    public upa(Context context, urg urgVar, tpa tpaVar, tmb tmbVar, gms gmsVar, ackk ackkVar, zgt zgtVar, kex kexVar, ykd ykdVar, uyp uypVar) {
        this.c = context;
        this.d = uypVar;
        this.q = urgVar;
        this.j = tpaVar;
        this.k = tmbVar;
        this.h = gmsVar;
        this.e = ackkVar;
        this.l = zgtVar;
        this.r = kexVar;
        this.s = ykdVar;
    }

    public static void i(File file, boolean z) {
        File[] fileArrListFiles;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    ((ynz) ((ynz) a.f()).ai((char) 9523)).y("Deleting old cache file at %s", file2);
                    file2.delete();
                }
            }
            if (z) {
                file.delete();
            }
        }
    }

    private final synchronized long l() {
        long length;
        long j = this.o;
        if (j >= 0) {
            return j;
        }
        long jM = m();
        File file = new File(f(), b[0]);
        if (file.exists()) {
            length = file.length() + jM;
            this.o = length;
        } else {
            this.o = jM;
            length = jM;
        }
        if (jM >= 524288) {
            long jB = this.q.b();
            ackk ackkVar = this.e;
            if (length < jB) {
            }
        }
        return this.o;
    }

    private final synchronized long m() {
        long j = this.p;
        long usableSpace = 0;
        if (j >= 0) {
            return j;
        }
        File fileF = f();
        while (fileF != null && !fileF.exists()) {
            fileF = fileF.getParentFile();
        }
        if (fileF != null) {
            usableSpace = fileF.getUsableSpace();
            this.p = usableSpace;
        } else {
            this.p = 0L;
        }
        if (usableSpace < 524288) {
        }
        return this.p;
    }

    private final synchronized void n(uoz uozVar) throws uox {
        try {
            int serverDataVersion = uozVar.c.getServerDataVersion();
            int iA = this.q.a();
            if (iA != 0) {
                if (serverDataVersion == 0) {
                    try {
                        uozVar.l(iA);
                        return;
                    } catch (IOException e) {
                        ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9517)).w("Failed to set server data version to %d :", iA);
                        return;
                    }
                }
                if (iA != serverDataVersion) {
                    ((ynz) ((ynz) a.f()).ai(9516)).B("Disk cache version is %d but server version is %d ; clearing database.", iA, serverDataVersion);
                    try {
                        uozVar.d.clear();
                        uozVar.c.clear();
                        uozVar.l(iA);
                        return;
                    } catch (uox e2) {
                        uozVar.i(e2);
                        throw e2;
                    }
                }
            }
        } catch (uox e3) {
            try {
                uozVar.i(e3);
                throw e3;
            } catch (uox e4) {
                throw e4;
            }
        }
    }

    @Override // defpackage.uoi
    public final synchronized uoj a(tmb tmbVar) {
        uoz uozVarD = d();
        if (uozVarD == null) {
            return null;
        }
        return new upb(uozVarD, tmbVar);
    }

    @Override // defpackage.uoi
    public final synchronized uok b(tmb tmbVar, achh achhVar) {
        uoz uozVarD = d();
        if (uozVarD == null) {
            return null;
        }
        return new upc(uozVarD, tmbVar, achhVar);
    }

    @Override // defpackage.uoi
    public final synchronized uol c(tox toxVar, ukr ukrVar, uom uomVar) {
        if (l() < this.q.b()) {
            return null;
        }
        uoz uozVarD = d();
        if (uozVarD == null) {
            ((ynz) ((ynz) a.h()).ai((char) 9519)).u("SQLite failed to create an online tile cache.");
            return null;
        }
        return new upd(this.j, uozVarD, toxVar, ukrVar, uomVar, this.r, this.s, this.k, (erb) this.e.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0119 A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x001d, B:8:0x002c, B:10:0x0030, B:12:0x0046, B:14:0x004c, B:15:0x005a, B:16:0x005d, B:19:0x0062, B:20:0x006f, B:22:0x0079, B:24:0x007f, B:26:0x008d, B:40:0x00ec, B:43:0x00f2, B:54:0x0163, B:56:0x0167, B:49:0x0119, B:50:0x011c, B:53:0x0146, B:46:0x00f8, B:29:0x00b0, B:34:0x00b9, B:36:0x00cc, B:38:0x00de, B:57:0x0172), top: B:69:0x0001, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167 A[Catch: all -> 0x0176, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x001d, B:8:0x002c, B:10:0x0030, B:12:0x0046, B:14:0x004c, B:15:0x005a, B:16:0x005d, B:19:0x0062, B:20:0x006f, B:22:0x0079, B:24:0x007f, B:26:0x008d, B:40:0x00ec, B:43:0x00f2, B:54:0x0163, B:56:0x0167, B:49:0x0119, B:50:0x011c, B:53:0x0146, B:46:0x00f8, B:29:0x00b0, B:34:0x00b9, B:36:0x00cc, B:38:0x00de, B:57:0x0172), top: B:69:0x0001, inners: #0, #1, #2, #4 }] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized defpackage.uoz d() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upa.d():uoz");
    }

    public final File e(boolean z) {
        return z ? uyp.a(this.c, true, "cache") : (File) this.d.b.gu();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8 A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:10:0x0012, B:12:0x001f, B:14:0x002d, B:16:0x003c, B:20:0x004d, B:19:0x0040, B:21:0x0050, B:23:0x0054, B:25:0x0057, B:28:0x005c, B:30:0x0062, B:34:0x006b, B:36:0x0071, B:46:0x009c, B:39:0x0080, B:41:0x0086, B:43:0x008c, B:45:0x008f, B:47:0x009f, B:49:0x00a3, B:62:0x0112, B:66:0x0118, B:50:0x00b4, B:52:0x00bf, B:53:0x00d0, B:54:0x00d2, B:56:0x00d8, B:57:0x00e9, B:58:0x00eb, B:60:0x00f1, B:61:0x0102), top: B:76:0x0001, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9 A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:10:0x0012, B:12:0x001f, B:14:0x002d, B:16:0x003c, B:20:0x004d, B:19:0x0040, B:21:0x0050, B:23:0x0054, B:25:0x0057, B:28:0x005c, B:30:0x0062, B:34:0x006b, B:36:0x0071, B:46:0x009c, B:39:0x0080, B:41:0x0086, B:43:0x008c, B:45:0x008f, B:47:0x009f, B:49:0x00a3, B:62:0x0112, B:66:0x0118, B:50:0x00b4, B:52:0x00bf, B:53:0x00d0, B:54:0x00d2, B:56:0x00d8, B:57:0x00e9, B:58:0x00eb, B:60:0x00f1, B:61:0x0102), top: B:76:0x0001, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118 A[Catch: all -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:10:0x0012, B:12:0x001f, B:14:0x002d, B:16:0x003c, B:20:0x004d, B:19:0x0040, B:21:0x0050, B:23:0x0054, B:25:0x0057, B:28:0x005c, B:30:0x0062, B:34:0x006b, B:36:0x0071, B:46:0x009c, B:39:0x0080, B:41:0x0086, B:43:0x008c, B:45:0x008f, B:47:0x009f, B:49:0x00a3, B:62:0x0112, B:66:0x0118, B:50:0x00b4, B:52:0x00bf, B:53:0x00d0, B:54:0x00d2, B:56:0x00d8, B:57:0x00e9, B:58:0x00eb, B:60:0x00f1, B:61:0x0102), top: B:76:0x0001, inners: #2, #3 }] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.io.File f() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upa.f():java.io.File");
    }

    final void g() {
        String[] strArr = b;
        for (int i2 = 0; i2 < 3; i2++) {
            uym.c(new File(f(), strArr[i2]));
        }
        uym.c(new File(this.d.b(), "map_cache.key"));
    }

    public final void h(uoz uozVar) {
        try {
            long jA = this.k.a();
            try {
                vaq.d();
                uov uovVar = uozVar.c;
                int iDeleteExpired = uovVar.deleteExpired();
                uovVar.flushWrites();
                uozVar.d.clear();
                long jA2 = this.k.a() - jA;
                synchronized (this) {
                    this.n += jA2;
                }
                yob yobVar = a;
                ((ynz) ((ynz) yobVar.f()).ai(9520)).C("Deleted %d entries from the disk cache in %d ms", iDeleteExpired, jA2);
                if (iDeleteExpired > 0) {
                    this.l.execute(new unj(this, uozVar, 3, null));
                    return;
                }
                synchronized (this) {
                    ((ynz) ((ynz) yobVar.f()).ai(9521)).x("Deleting expired tiles and resources took %d ms", this.n);
                    this.n = 0L;
                }
                uozVar.k();
            } catch (uox e) {
                uozVar.i(e);
                throw e;
            }
        } catch (IOException e2) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e2)).ai((char) 9522)).u("Failed to delete expired resources:");
            uozVar.k();
        }
    }

    final boolean j() {
        String[] strArr = b;
        for (int i2 = 0; i2 < 3; i2++) {
            if (new File(f(), strArr[i2]).exists()) {
                return true;
            }
        }
        return new File(this.d.b(), "map_cache.key").exists();
    }

    public final File[] k() {
        ArrayList arrayList = new ArrayList(3);
        try {
            for (File file : this.c.getExternalFilesDirs(null)) {
                if (file != null) {
                    arrayList.add(new File(new File(uym.b(file), "cache"), "diskcache"));
                }
            }
        } catch (RuntimeException unused) {
        }
        arrayList.add(new File(this.c.getCacheDir(), "diskcache"));
        return (File[]) arrayList.toArray(new File[0]);
    }
}

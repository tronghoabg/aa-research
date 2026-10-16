package defpackage;

import com.google.android.libraries.geo.mapcore.internal.store.diskcache.NativeSqliteDiskCacheImpl;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class uoz {
    static final long a;
    static final long b;
    private static final yob g = yob.c("com/google/android/libraries/geo/mapcore/internal/store/diskcache/SqliteDiskCache");
    public final uov c;
    public final erb f;
    private final File h;
    private final zgt i;
    private final tmb j;
    private final tpa k;
    private final urg o;
    public final Set d = ConcurrentHashMap.newKeySet();
    public boolean e = false;
    private boolean l = false;
    private long m = 0;
    private long n = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 30000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        b = 1000L;
    }

    public uoz(uov uovVar, File file, erb erbVar, zgt zgtVar, tmb tmbVar, urg urgVar, tpa tpaVar) {
        this.c = uovVar;
        this.h = file;
        this.f = erbVar;
        this.i = zgtVar;
        this.j = tmbVar;
        this.o = urgVar;
        this.k = tpaVar;
        uovVar.setStyleTablePriorityBoostMillis(((ppe) urgVar.a).a().f);
    }

    @ResultIgnorabilityUnspecified
    public static uoz n(File file, File file2, erb erbVar, zgt zgtVar, tmb tmbVar, urg urgVar, tpa tpaVar) throws uox {
        if ((!file.exists() && !file.mkdirs()) || (!file2.exists() && !file2.mkdirs())) {
            if (file.getParentFile() == null || file.getParentFile().getFreeSpace() > 4096) {
            }
            ((ynz) ((ynz) g.g()).ai((char) 9507)).y("%s", "Failed to create sqlite disk cache directory");
            throw new uox();
        }
        ((ynz) ((ynz) g.f()).ai(9506)).M("Create or open database: %s; secure file path: %s", file.getPath(), file2.getPath());
        try {
            uoz uozVar = new uoz(NativeSqliteDiskCacheImpl.createOrOpenDatabase(file, file2, pjs.AES_GCM, ((ppe) urgVar.a).a().i), file, erbVar, zgtVar, tmbVar, urgVar, tpaVar);
            return uozVar;
        } catch (uox e) {
            throw e;
        }
    }

    private final void o() {
        try {
            pjt andClearStats = this.c.getAndClearStats();
            vaq.d();
            erb erbVar = this.f;
            int i = andClearStats.e;
            int i2 = andClearStats.f;
            int i3 = andClearStats.d;
            if ((andClearStats.b & 64) != 0) {
                long j = andClearStats.g;
            }
            if ((andClearStats.b & 128) != 0) {
                long j2 = andClearStats.h;
            }
            if ((andClearStats.b & 256) != 0) {
                long j3 = andClearStats.i;
            }
            for (pju pjuVar : andClearStats.c) {
                abgl abglVarB = abgl.b(this.k.d(pjuVar.b).c);
                if (abglVarB == null) {
                    abglVarB = abgl.UNKNOWN;
                }
                if (abglVarB != abgl.UNKNOWN) {
                    int i4 = pjuVar.e;
                    int i5 = pjuVar.f;
                    int i6 = pjuVar.c;
                    int i7 = pjuVar.d;
                } else {
                    ((ynz) g.a(uys.a).ai(9513)).y("Disk cache reported stats for an unknown pipe name '%s'", pjuVar.b);
                }
            }
        } catch (uox e) {
            ((ynz) ((ynz) ((ynz) g.g()).p(e)).ai((char) 9512)).u("Error getting disk cache statistics:");
        }
    }

    public final long a() {
        try {
            return this.c.getDatabaseSize();
        } catch (uox e) {
            i(e);
            ((ynz) ((ynz) g.a(uys.a).p(e)).ai((char) 9510)).u("Failed to get database size %s");
            return 0L;
        }
    }

    @ResultIgnorabilityUnspecified
    public final pjv b(pjw pjwVar) throws abon, uox {
        try {
            return this.c.getResource(pjwVar);
        } catch (uox e) {
            this.i(e);
            throw e;
        }
    }

    @ResultIgnorabilityUnspecified
    public final pjz c(pjy pjyVar) throws abon, uox {
        try {
            return this.c.getTile(pjyVar);
        } catch (uox e) {
            this.i(e);
            throw e;
        }
    }

    public final pka d(pjy pjyVar) throws abon, uox {
        try {
            return this.c.getTileMetadata(pjyVar);
        } catch (uox e) {
            this.i(e);
            throw e;
        }
    }

    public final void e(pjw pjwVar) throws uox {
        try {
            this.d.remove(pjwVar);
            this.c.deleteResource(pjwVar);
        } catch (uox e) {
            i(e);
            throw e;
        }
    }

    public final void f(pjy pjyVar) throws uox {
        try {
            this.c.deleteTile(pjyVar);
        } catch (uox e) {
            i(e);
            throw e;
        }
    }

    final void g(long j, long j2) {
        long j3;
        long jMax;
        boolean z;
        long databaseSize;
        boolean z2;
        Object obj = this.o.a;
        long jA = this.j.a();
        ppe ppeVar = (ppe) obj;
        double d = j2;
        double d2 = ppeVar.a().e * d;
        double d3 = d * ppeVar.a().d;
        long j4 = (long) d2;
        if (j <= j4) {
            z = false;
            j3 = 0;
        } else {
            long j5 = (long) d3;
            long j6 = j - j4;
            boolean z3 = j6 > 1048576;
            long jK = zeb.k(j6, 0L, 1048576L);
            if (z3) {
                j3 = 0;
                jMax = Math.max(j5, j - 1048576);
            } else {
                j3 = 0;
                jMax = j5;
            }
            erb erbVar = this.f;
            try {
                vaq.d();
                boolean z4 = z3;
                ((ynz) ((ynz) g.f()).ai(9514)).T("Compacting disk cache; current size=%d, iteration trimToSize=%d, iteration bytesToVacuum=%d, final target file size=%d, final target stored data size=%d", Long.valueOf(j), Long.valueOf(jMax), Long.valueOf(jK), Long.valueOf(j4), Long.valueOf(j5));
                uov uovVar = this.c;
                uovVar.trimToSize(jMax);
                if (jK > j3) {
                    uovVar.incrementalVacuum(jK);
                }
                o();
                z = z4;
            } catch (uox e) {
                i(e);
                ((ynz) ((ynz) ((ynz) g.g()).p(e)).ai(9515)).u("Failed to compact database:");
                z = false;
            }
        }
        boolean z5 = !z;
        if (z) {
            try {
                databaseSize = this.c.getDatabaseSize();
                z2 = z5;
            } catch (uox e2) {
                i(e2);
                ((ynz) ((ynz) g.a(uys.a).p(e2)).ai((char) 9509)).u("Failed to get database size %s");
                databaseSize = j3;
                z2 = true;
            }
        } else {
            z2 = z5;
            databaseSize = j3;
        }
        long jA2 = this.j.a();
        synchronized (this) {
            this.n += jA2 - jA;
            if (z2) {
                this.e = false;
                ((ynz) ((ynz) g.f()).ai(9508)).x("Database compaction took %d ms", this.n);
                this.n = j3;
            }
        }
        if (!z2) {
            zgt zgtVar = this.i;
            lws.M(zgtVar.schedule(new uoy(this, databaseSize, j2, 1), b, TimeUnit.MILLISECONDS), zgtVar);
        }
        this.d.clear();
    }

    public final void h(pjx pjxVar, byte[] bArr) throws Throwable {
        try {
            this.c.insertOrUpdateResource(pjxVar, bArr);
            j();
        } catch (uox e) {
            i(e);
            throw e;
        }
    }

    public final void i(uox uoxVar) {
        o();
        Throwable cause = uoxVar.getCause();
        if (cause instanceof pim) {
            pim pimVar = (pim) cause;
            ablt abltVar = pimVar.a;
            if (ablt.INVALID_ARGUMENT.equals(abltVar) || ablt.INTERNAL.equals(abltVar)) {
                ((ynz) ((ynz) g.a(uys.a).p(pimVar)).ai((char) 9511)).s();
            }
        }
    }

    final synchronized void j() throws Throwable {
        try {
            try {
                if (this.l && !this.e) {
                    tmb tmbVar = this.j;
                    if (tmbVar.a() - this.m >= a) {
                        this.m = tmbVar.a();
                        long jA = a();
                        long freeSpace = this.h.getFreeSpace() + jA;
                        Object obj = this.o.a;
                        double d = freeSpace * ((ppe) obj).a().c;
                        long j = ((ppe) obj).a().b;
                        long jMin = (long) d;
                        if (j > 0) {
                            jMin = Math.min(j, jMin);
                        }
                        if (jA >= jMin) {
                            this.e = true;
                            this.m = tmbVar.a();
                            this.n = 0L;
                            this.i.execute(new uoy(this, jA, jMin, 0));
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void k() {
        this.l = true;
    }

    public final void l(int i) throws uox {
        try {
            this.c.setServerDataVersion(i);
        } catch (uox e) {
            i(e);
            throw e;
        }
    }

    public final boolean m(pjw pjwVar) throws uox {
        try {
            if (!((ppe) this.o.a).a().h) {
                return this.c.hasResource(pjwVar);
            }
            int iAm = lvl.am(pjwVar.c);
            if (iAm != 0 && iAm == 2) {
                Set set = this.d;
                if (set.contains(pjwVar)) {
                    return true;
                }
                if (!this.c.hasResource(pjwVar)) {
                    return false;
                }
                set.add(pjwVar);
                return true;
            }
            return this.c.hasResource(pjwVar);
        } catch (uox e) {
            i(e);
            throw e;
        }
    }
}

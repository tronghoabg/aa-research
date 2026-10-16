package com.google.android.libraries.geo.mapcore.internal.store.diskcache;

import com.google.android.apps.gmm.jni.util.NativeHelper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.abnj;
import defpackage.abnp;
import defpackage.abnv;
import defpackage.abon;
import defpackage.pij;
import defpackage.pik;
import defpackage.pim;
import defpackage.pjs;
import defpackage.pjt;
import defpackage.pjv;
import defpackage.pjw;
import defpackage.pjx;
import defpackage.pjy;
import defpackage.pjz;
import defpackage.pka;
import defpackage.uov;
import defpackage.uow;
import defpackage.uox;
import defpackage.uys;
import defpackage.ynz;
import defpackage.yob;
import defpackage.zgp;
import java.io.Closeable;
import java.io.File;

/* loaded from: classes3.dex */
public final class NativeSqliteDiskCacheImpl implements Closeable, uov {
    private static final yob logger = yob.c("com/google/android/libraries/geo/mapcore/internal/store/diskcache/NativeSqliteDiskCacheImpl");
    private static final zgp<Void> nativeLibraryReady = NativeHelper.getLibraryLoadedFuture(new uow());
    private final pik byteArrayPool;
    private long nativeSqliteDiskCache;

    private NativeSqliteDiskCacheImpl(long j, int i) {
        this.nativeSqliteDiskCache = j;
        this.byteArrayPool = new pik(i);
    }

    private static void awaitLibraryReady() {
        NativeHelper.awaitLibraryReady(nativeLibraryReady);
    }

    public static uov createOrOpenDatabase(File file, File file2, pjs pjsVar, int i) throws uox {
        awaitLibraryReady();
        try {
            return new NativeSqliteDiskCacheImpl(nativeOpenOrCreateSqliteDiskCache(file.toString(), file2.toString(), pjsVar.d), i);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    private static native void nativeDestroySqliteDiskCache(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @ResultIgnorabilityUnspecified
    public static native boolean nativeInitClass();

    private static native long nativeOpenOrCreateSqliteDiskCache(String str, String str2, int i);

    private static native void nativeSqliteDiskCacheClear(long j);

    private static native void nativeSqliteDiskCacheClearTiles(long j);

    private static native int nativeSqliteDiskCacheDeleteExpired(long j);

    private static native void nativeSqliteDiskCacheDeleteResource(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheDeleteTile(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheFlushWrites(long j);

    private static native byte[] nativeSqliteDiskCacheGetAndClearStats(long j);

    private static native long nativeSqliteDiskCacheGetDatabaseSize(long j);

    private static native byte[] nativeSqliteDiskCacheGetResource(long j, byte[] bArr, byte[] bArr2, int[] iArr);

    private static native int nativeSqliteDiskCacheGetServerDataVersion(long j);

    private static native byte[] nativeSqliteDiskCacheGetTile(long j, byte[] bArr, byte[] bArr2, int[] iArr);

    private static native byte[] nativeSqliteDiskCacheGetTileMetadata(long j, byte[] bArr, byte[] bArr2, int[] iArr);

    private static native boolean nativeSqliteDiskCacheHasResource(long j, byte[] bArr);

    private static native boolean nativeSqliteDiskCacheHasTile(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheIncrementalVacuum(long j, long j2);

    private static native void nativeSqliteDiskCacheInsertOrUpdateEmptyTile(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheInsertOrUpdateResource(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeSqliteDiskCacheInsertOrUpdateTile(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeSqliteDiskCacheSetServerDataVersion(long j, int i);

    private static native void nativeSqliteDiskCacheSetStyleTablePriorityBoostMillis(long j, long j2);

    private static native void nativeSqliteDiskCacheTrimToSize(long j, long j2);

    private static native void nativeSqliteDiskCacheUpdateTileMetadata(long j, byte[] bArr);

    @Override // defpackage.uov
    public void clear() throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheClear(this.nativeSqliteDiskCache);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    public void clearTiles() throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheClearTiles(this.nativeSqliteDiskCache);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.nativeSqliteDiskCache != 0) {
            awaitLibraryReady();
            nativeDestroySqliteDiskCache(this.nativeSqliteDiskCache);
        }
        this.nativeSqliteDiskCache = 0L;
    }

    @Override // defpackage.uov
    public int deleteExpired() throws uox {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheDeleteExpired(this.nativeSqliteDiskCache);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void deleteResource(pjw pjwVar) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheDeleteResource(this.nativeSqliteDiskCache, pjwVar.h());
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void deleteTile(pjy pjyVar) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheDeleteTile(this.nativeSqliteDiskCache, pjyVar.h());
        } catch (pim e) {
            throw new uox(e);
        }
    }

    protected void finalize() {
        close();
    }

    @Override // defpackage.uov
    public void flushWrites() throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheFlushWrites(this.nativeSqliteDiskCache);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public pjt getAndClearStats() throws uox {
        awaitLibraryReady();
        try {
            try {
                return (pjt) abnv.B(pjt.a, nativeSqliteDiskCacheGetAndClearStats(this.nativeSqliteDiskCache), abnj.a());
            } catch (abon e) {
                throw new uox(e);
            }
        } catch (pim unused) {
            ((ynz) logger.a(uys.a).ai((char) 9505)).u("getAndClearStats result bytes were null");
            return pjt.a;
        }
    }

    @Override // defpackage.uov
    public long getDatabaseSize() throws uox {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheGetDatabaseSize(this.nativeSqliteDiskCache);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public pjv getResource(pjw pjwVar) throws abon, uox {
        awaitLibraryReady();
        try {
            pij pijVarA = this.byteArrayPool.a();
            try {
                byte[] bArrNativeSqliteDiskCacheGetResource = nativeSqliteDiskCacheGetResource(this.nativeSqliteDiskCache, pjwVar.h(), pijVarA.a, pijVarA.b);
                if (bArrNativeSqliteDiskCacheGetResource == null) {
                    pijVarA.close();
                    return null;
                }
                abnp abnpVarN = pjv.a.n();
                abnpVarN.x(bArrNativeSqliteDiskCacheGetResource, 0, pijVarA.a(), abnj.a());
                pjv pjvVar = (pjv) abnpVarN.q();
                pijVarA.close();
                return pjvVar;
            } finally {
            }
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public int getServerDataVersion() throws uox {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheGetServerDataVersion(this.nativeSqliteDiskCache);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public pjz getTile(pjy pjyVar) throws abon, uox {
        awaitLibraryReady();
        try {
            pij pijVarA = this.byteArrayPool.a();
            try {
                byte[] bArrNativeSqliteDiskCacheGetTile = nativeSqliteDiskCacheGetTile(this.nativeSqliteDiskCache, pjyVar.h(), pijVarA.a, pijVarA.b);
                if (bArrNativeSqliteDiskCacheGetTile == null) {
                    pijVarA.close();
                    return null;
                }
                abnp abnpVarN = pjz.a.n();
                abnpVarN.x(bArrNativeSqliteDiskCacheGetTile, 0, pijVarA.a(), abnj.a());
                pjz pjzVar = (pjz) abnpVarN.q();
                pijVarA.close();
                return pjzVar;
            } finally {
            }
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public pka getTileMetadata(pjy pjyVar) throws abon, uox {
        awaitLibraryReady();
        try {
            pij pijVarA = this.byteArrayPool.a();
            try {
                byte[] bArrNativeSqliteDiskCacheGetTileMetadata = nativeSqliteDiskCacheGetTileMetadata(this.nativeSqliteDiskCache, pjyVar.h(), pijVarA.a, pijVarA.b);
                if (bArrNativeSqliteDiskCacheGetTileMetadata == null) {
                    pijVarA.close();
                    return null;
                }
                abnp abnpVarN = pka.a.n();
                abnpVarN.x(bArrNativeSqliteDiskCacheGetTileMetadata, 0, pijVarA.a(), abnj.a());
                pka pkaVar = (pka) abnpVarN.q();
                pijVarA.close();
                return pkaVar;
            } finally {
            }
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public boolean hasResource(pjw pjwVar) throws uox {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheHasResource(this.nativeSqliteDiskCache, pjwVar.h());
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public boolean hasTile(pjy pjyVar) throws uox {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheHasTile(this.nativeSqliteDiskCache, pjyVar.h());
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void incrementalVacuum(long j) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheIncrementalVacuum(this.nativeSqliteDiskCache, j);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void insertOrUpdateEmptyTile(pka pkaVar) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheInsertOrUpdateEmptyTile(this.nativeSqliteDiskCache, pkaVar.h());
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void insertOrUpdateResource(pjx pjxVar, byte[] bArr) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheInsertOrUpdateResource(this.nativeSqliteDiskCache, pjxVar.h(), bArr);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void insertOrUpdateTile(pka pkaVar, byte[] bArr) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheInsertOrUpdateTile(this.nativeSqliteDiskCache, pkaVar.h(), bArr);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void setServerDataVersion(int i) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheSetServerDataVersion(this.nativeSqliteDiskCache, i);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void setStyleTablePriorityBoostMillis(long j) {
        awaitLibraryReady();
        nativeSqliteDiskCacheSetStyleTablePriorityBoostMillis(this.nativeSqliteDiskCache, j);
    }

    @Override // defpackage.uov
    public void trimToSize(long j) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheTrimToSize(this.nativeSqliteDiskCache, j);
            nativeSqliteDiskCacheFlushWrites(this.nativeSqliteDiskCache);
        } catch (pim e) {
            throw new uox(e);
        }
    }

    @Override // defpackage.uov
    public void updateTileMetadata(pka pkaVar) throws uox {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheUpdateTileMetadata(this.nativeSqliteDiskCache, pkaVar.h());
        } catch (pim e) {
            throw new uox(e);
        }
    }
}

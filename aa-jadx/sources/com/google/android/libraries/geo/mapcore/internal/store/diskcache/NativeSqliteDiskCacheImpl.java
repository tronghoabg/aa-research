package com.google.android.libraries.geo.mapcore.internal.store.diskcache;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeSqliteDiskCacheImpl implements java.io.Closeable, defpackage.upu {
    private static final defpackage.ypg logger = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/internal/store/diskcache/NativeSqliteDiskCacheImpl");
    private static final defpackage.zhs<java.lang.Void> nativeLibraryReady = com.google.android.apps.gmm.jni.util.NativeHelper.getLibraryLoadedFuture(new defpackage.upv());
    private final defpackage.pjg byteArrayPool;
    private long nativeSqliteDiskCache;

    private NativeSqliteDiskCacheImpl(long j, int i) {
        this.nativeSqliteDiskCache = j;
        this.byteArrayPool = new defpackage.pjg(i);
    }

    private static void awaitLibraryReady() {
        com.google.android.apps.gmm.jni.util.NativeHelper.awaitLibraryReady(nativeLibraryReady);
    }

    public static defpackage.upu createOrOpenDatabase(java.io.File file, java.io.File file2, defpackage.pkm pkmVar, int i) throws defpackage.upw {
        awaitLibraryReady();
        try {
            return new com.google.android.libraries.geo.mapcore.internal.store.diskcache.NativeSqliteDiskCacheImpl(nativeOpenOrCreateSqliteDiskCache(file.toString(), file2.toString(), pkmVar.d), i);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    private static native void nativeDestroySqliteDiskCache(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static native boolean nativeInitClass();

    private static native long nativeOpenOrCreateSqliteDiskCache(java.lang.String str, java.lang.String str2, int i);

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

    @Override // defpackage.upu
    public void clear() throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheClear(this.nativeSqliteDiskCache);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    public void clearTiles() throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheClearTiles(this.nativeSqliteDiskCache);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
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

    @Override // defpackage.upu
    public int deleteExpired() throws defpackage.upw {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheDeleteExpired(this.nativeSqliteDiskCache);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void deleteResource(defpackage.pkq pkqVar) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheDeleteResource(this.nativeSqliteDiskCache, pkqVar.h());
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void deleteTile(defpackage.pks pksVar) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheDeleteTile(this.nativeSqliteDiskCache, pksVar.h());
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    protected void finalize() {
        close();
    }

    @Override // defpackage.upu
    public void flushWrites() throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheFlushWrites(this.nativeSqliteDiskCache);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public defpackage.pkn getAndClearStats() throws defpackage.upw {
        awaitLibraryReady();
        try {
            try {
                return (defpackage.pkn) defpackage.abox.B(defpackage.pkn.a, nativeSqliteDiskCacheGetAndClearStats(this.nativeSqliteDiskCache), defpackage.abol.a());
            } catch (defpackage.abpp e) {
                throw new defpackage.upw(e);
            }
        } catch (defpackage.pji unused) {
            ((defpackage.ype) logger.a(defpackage.uzo.a).ai((char) 9532)).u("getAndClearStats result bytes were null");
            return defpackage.pkn.a;
        }
    }

    @Override // defpackage.upu
    public long getDatabaseSize() throws defpackage.upw {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheGetDatabaseSize(this.nativeSqliteDiskCache);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public defpackage.pkp getResource(defpackage.pkq pkqVar) throws defpackage.abpp, defpackage.upw {
        awaitLibraryReady();
        try {
            defpackage.pjf pjfVarA = this.byteArrayPool.a();
            try {
                byte[] bArrNativeSqliteDiskCacheGetResource = nativeSqliteDiskCacheGetResource(this.nativeSqliteDiskCache, pkqVar.h(), pjfVarA.a, pjfVarA.b);
                if (bArrNativeSqliteDiskCacheGetResource == null) {
                    pjfVarA.close();
                    return null;
                }
                defpackage.abor aborVarN = defpackage.pkp.a.n();
                aborVarN.x(bArrNativeSqliteDiskCacheGetResource, 0, pjfVarA.a(), defpackage.abol.a());
                defpackage.pkp pkpVar = (defpackage.pkp) aborVarN.q();
                pjfVarA.close();
                return pkpVar;
            } catch (java.lang.Throwable th) {
                try {
                    pjfVarA.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
        throw new defpackage.upw(e);
    }

    @Override // defpackage.upu
    public int getServerDataVersion() throws defpackage.upw {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheGetServerDataVersion(this.nativeSqliteDiskCache);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public defpackage.pkt getTile(defpackage.pks pksVar) throws defpackage.abpp, defpackage.upw {
        awaitLibraryReady();
        try {
            defpackage.pjf pjfVarA = this.byteArrayPool.a();
            try {
                byte[] bArrNativeSqliteDiskCacheGetTile = nativeSqliteDiskCacheGetTile(this.nativeSqliteDiskCache, pksVar.h(), pjfVarA.a, pjfVarA.b);
                if (bArrNativeSqliteDiskCacheGetTile == null) {
                    pjfVarA.close();
                    return null;
                }
                defpackage.abor aborVarN = defpackage.pkt.a.n();
                aborVarN.x(bArrNativeSqliteDiskCacheGetTile, 0, pjfVarA.a(), defpackage.abol.a());
                defpackage.pkt pktVar = (defpackage.pkt) aborVarN.q();
                pjfVarA.close();
                return pktVar;
            } catch (java.lang.Throwable th) {
                try {
                    pjfVarA.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
        throw new defpackage.upw(e);
    }

    @Override // defpackage.upu
    public defpackage.pku getTileMetadata(defpackage.pks pksVar) throws defpackage.abpp, defpackage.upw {
        awaitLibraryReady();
        try {
            defpackage.pjf pjfVarA = this.byteArrayPool.a();
            try {
                byte[] bArrNativeSqliteDiskCacheGetTileMetadata = nativeSqliteDiskCacheGetTileMetadata(this.nativeSqliteDiskCache, pksVar.h(), pjfVarA.a, pjfVarA.b);
                if (bArrNativeSqliteDiskCacheGetTileMetadata == null) {
                    pjfVarA.close();
                    return null;
                }
                defpackage.abor aborVarN = defpackage.pku.a.n();
                aborVarN.x(bArrNativeSqliteDiskCacheGetTileMetadata, 0, pjfVarA.a(), defpackage.abol.a());
                defpackage.pku pkuVar = (defpackage.pku) aborVarN.q();
                pjfVarA.close();
                return pkuVar;
            } catch (java.lang.Throwable th) {
                try {
                    pjfVarA.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
        throw new defpackage.upw(e);
    }

    @Override // defpackage.upu
    public boolean hasResource(defpackage.pkq pkqVar) throws defpackage.upw {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheHasResource(this.nativeSqliteDiskCache, pkqVar.h());
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public boolean hasTile(defpackage.pks pksVar) throws defpackage.upw {
        awaitLibraryReady();
        try {
            return nativeSqliteDiskCacheHasTile(this.nativeSqliteDiskCache, pksVar.h());
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void incrementalVacuum(long j) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheIncrementalVacuum(this.nativeSqliteDiskCache, j);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void insertOrUpdateEmptyTile(defpackage.pku pkuVar) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheInsertOrUpdateEmptyTile(this.nativeSqliteDiskCache, pkuVar.h());
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void insertOrUpdateResource(defpackage.pkr pkrVar, byte[] bArr) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheInsertOrUpdateResource(this.nativeSqliteDiskCache, pkrVar.h(), bArr);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void insertOrUpdateTile(defpackage.pku pkuVar, byte[] bArr) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheInsertOrUpdateTile(this.nativeSqliteDiskCache, pkuVar.h(), bArr);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void setServerDataVersion(int i) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheSetServerDataVersion(this.nativeSqliteDiskCache, i);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void setStyleTablePriorityBoostMillis(long j) {
        awaitLibraryReady();
        nativeSqliteDiskCacheSetStyleTablePriorityBoostMillis(this.nativeSqliteDiskCache, j);
    }

    @Override // defpackage.upu
    public void trimToSize(long j) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheTrimToSize(this.nativeSqliteDiskCache, j);
            nativeSqliteDiskCacheFlushWrites(this.nativeSqliteDiskCache);
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }

    @Override // defpackage.upu
    public void updateTileMetadata(defpackage.pku pkuVar) throws defpackage.upw {
        awaitLibraryReady();
        try {
            nativeSqliteDiskCacheUpdateTileMetadata(this.nativeSqliteDiskCache, pkuVar.h());
        } catch (defpackage.pji e) {
            throw new defpackage.upw(e);
        }
    }
}

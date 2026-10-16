package androidx.media3.datasource.cache;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.ContentMetadata;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SimpleCache implements Cache {
    private static final int SUBDIRECTORY_COUNT = 10;
    private static final String TAG = "SimpleCache";
    private static final String UID_FILE_SUFFIX = ".uid";
    private static final HashSet<File> lockedCacheDirs = new HashSet<>();
    private final File cacheDir;
    private final CachedContentIndex contentIndex;
    private final CacheEvictor evictor;
    private final CacheFileMetadataIndex fileIndex;
    private Cache.CacheException initializationException;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private final Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.media3.datasource.cache.SimpleCache$1] */
    SimpleCache(File file, CacheEvictor cacheEvictor, CachedContentIndex cachedContentIndex, CacheFileMetadataIndex cacheFileMetadataIndex) {
        if (!lockFolder(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(String.valueOf(String.valueOf(file))));
        }
        this.cacheDir = file;
        this.evictor = cacheEvictor;
        this.contentIndex = cachedContentIndex;
        this.fileIndex = cacheFileMetadataIndex;
        this.listeners = new HashMap<>();
        this.random = new Random();
        this.touchCacheSpans = cacheEvictor.requiresCacheSpanTouches();
        this.uid = -1L;
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread(this, "ExoPlayer:SimpleCacheInit") { // from class: androidx.media3.datasource.cache.SimpleCache.1
            final /* synthetic */ SimpleCache this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                synchronized (this.this$0) {
                    conditionVariable.open();
                    this.this$0.initialize();
                    this.this$0.evictor.onCacheInitialized();
                }
            }
        }.start();
        conditionVariable.block();
    }

    private void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.contentIndex.getOrAdd(simpleCacheSpan.key).addSpan(simpleCacheSpan);
        this.totalSpace += simpleCacheSpan.length;
        notifySpanAdded(simpleCacheSpan);
    }

    private static void createCacheDirectories(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strConcat = "Failed to create cache directory: ".concat(String.valueOf(String.valueOf(file)));
        Log.e(TAG, strConcat);
        throw new Cache.CacheException(strConcat);
    }

    private static long createUid(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, String.valueOf(Long.toString(jAbs, 16)).concat(UID_FILE_SUFFIX));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: ".concat(file2.toString()));
    }

    public static void delete(File file, DatabaseProvider databaseProvider) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (databaseProvider != null) {
                long jLoadUid = loadUid(fileArrListFiles);
                if (jLoadUid != -1) {
                    try {
                        CacheFileMetadataIndex.delete(databaseProvider, jLoadUid);
                    } catch (DatabaseIOException unused) {
                        Log.w(TAG, "Failed to delete file metadata: " + jLoadUid);
                    }
                    try {
                        CachedContentIndex.delete(databaseProvider, jLoadUid);
                    } catch (DatabaseIOException unused2) {
                        Log.w(TAG, "Failed to delete file metadata: " + jLoadUid);
                    }
                }
            }
            Util.recursiveDelete(file);
        }
    }

    private SimpleCacheSpan getSpan(String str, long j2, long j3) {
        SimpleCacheSpan span;
        CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent == null) {
            return SimpleCacheSpan.createHole(str, j2, j3);
        }
        while (true) {
            span = cachedContent.getSpan(j2, j3);
            if (!span.isCached) {
                break;
            }
            File file = span.file;
            an.B(file);
            if (file.length() == span.length) {
                break;
            }
            removeStaleSpans();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() throws NumberFormatException {
        if (!this.cacheDir.exists()) {
            try {
                createCacheDirectories(this.cacheDir);
            } catch (Cache.CacheException e2) {
                this.initializationException = e2;
                return;
            }
        }
        File[] fileArrListFiles = this.cacheDir.listFiles();
        if (fileArrListFiles == null) {
            String strConcat = "Failed to list cache directory files: ".concat(String.valueOf(String.valueOf(this.cacheDir)));
            Log.e(TAG, strConcat);
            this.initializationException = new Cache.CacheException(strConcat);
            return;
        }
        long jLoadUid = loadUid(fileArrListFiles);
        this.uid = jLoadUid;
        if (jLoadUid == -1) {
            try {
                jLoadUid = createUid(this.cacheDir);
                this.uid = jLoadUid;
            } catch (IOException e3) {
                String strConcat2 = "Failed to create cache UID: ".concat(String.valueOf(String.valueOf(this.cacheDir)));
                Log.e(TAG, strConcat2, e3);
                this.initializationException = new Cache.CacheException(strConcat2, e3);
                return;
            }
        }
        try {
            this.contentIndex.initialize(jLoadUid);
            CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
            if (cacheFileMetadataIndex != null) {
                cacheFileMetadataIndex.initialize(this.uid);
                Map<String, CacheFileMetadata> all = this.fileIndex.getAll();
                loadDirectory(this.cacheDir, true, fileArrListFiles, all);
                this.fileIndex.removeAll(all.keySet());
            } else {
                loadDirectory(this.cacheDir, true, fileArrListFiles, null);
            }
            this.contentIndex.removeEmpty();
            try {
                this.contentIndex.store();
            } catch (IOException e4) {
                Log.e(TAG, "Storing index file failed", e4);
            }
        } catch (IOException e5) {
            String strConcat3 = "Failed to initialize cache indices: ".concat(String.valueOf(String.valueOf(this.cacheDir)));
            Log.e(TAG, strConcat3, e5);
            this.initializationException = new Cache.CacheException(strConcat3, e5);
        }
    }

    public static synchronized boolean isCacheFolderLocked(File file) {
        return lockedCacheDirs.contains(file.getAbsoluteFile());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadDirectory(java.io.File r9, boolean r10, java.io.File[] r11, java.util.Map<java.lang.String, androidx.media3.datasource.cache.CacheFileMetadata> r12) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            if (r11 == 0) goto L5d
            int r0 = r11.length
            if (r0 != 0) goto L6
            goto L5d
        L6:
            r9 = 0
            r1 = r9
        L8:
            if (r1 >= r0) goto L62
            r2 = r11[r1]
            java.lang.String r3 = r2.getName()
            if (r10 == 0) goto L31
            r4 = 46
            int r4 = r3.indexOf(r4)
            r5 = -1
            if (r4 != r5) goto L23
            java.io.File[] r3 = r2.listFiles()
            r8.loadDirectory(r2, r9, r3, r12)
            goto L5a
        L23:
            boolean r4 = androidx.media3.datasource.cache.CachedContentIndex.isIndexFile(r3)
            if (r4 != 0) goto L5a
            java.lang.String r4 = ".uid"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L5a
        L31:
            if (r12 == 0) goto L3a
            java.lang.Object r3 = r12.remove(r3)
            androidx.media3.datasource.cache.CacheFileMetadata r3 = (androidx.media3.datasource.cache.CacheFileMetadata) r3
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 == 0) goto L42
            long r4 = r3.length
            long r6 = r3.lastTouchTimestamp
            goto L49
        L42:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -1
        L49:
            r3 = r4
            r5 = r6
            androidx.media3.datasource.cache.CachedContentIndex r7 = r8.contentIndex
            androidx.media3.datasource.cache.SimpleCacheSpan r3 = androidx.media3.datasource.cache.SimpleCacheSpan.createCacheEntry(r2, r3, r5, r7)
            if (r3 == 0) goto L57
            r8.addSpan(r3)
            goto L5a
        L57:
            r2.delete()
        L5a:
            int r1 = r1 + 1
            goto L8
        L5d:
            if (r10 != 0) goto L62
            r9.delete()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.cache.SimpleCache.loadDirectory(java.io.File, boolean, java.io.File[], java.util.Map):void");
    }

    private static long loadUid(File[] fileArr) {
        int length = fileArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            File file = fileArr[i2];
            String name = file.getName();
            if (name.endsWith(UID_FILE_SUFFIX)) {
                try {
                    return parseUid(name);
                } catch (NumberFormatException unused) {
                    Log.e(TAG, "Malformed UID file: ".concat(String.valueOf(String.valueOf(file))));
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean lockFolder(File file) {
        return lockedCacheDirs.add(file.getAbsoluteFile());
    }

    private void notifySpanAdded(SimpleCacheSpan simpleCacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    arrayList.get(size).onSpanAdded(this, simpleCacheSpan);
                }
            }
        }
        this.evictor.onSpanAdded(this, simpleCacheSpan);
    }

    private void notifySpanRemoved(CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    arrayList.get(size).onSpanRemoved(this, cacheSpan);
                }
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanTouched(SimpleCacheSpan simpleCacheSpan, CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    arrayList.get(size).onSpanTouched(this, simpleCacheSpan, cacheSpan);
                }
            }
        }
        this.evictor.onSpanTouched(this, simpleCacheSpan, cacheSpan);
    }

    private static long parseUid(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void removeSpanInternal(CacheSpan cacheSpan) {
        CachedContent cachedContent = this.contentIndex.get(cacheSpan.key);
        if (cachedContent == null || !cachedContent.removeSpan(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (this.fileIndex != null) {
            File file = cacheSpan.file;
            an.B(file);
            String name = file.getName();
            try {
                this.fileIndex.remove(name);
            } catch (IOException unused) {
                Log.w(TAG, "Failed to remove file index entry for: ".concat(String.valueOf(name)));
            }
        }
        this.contentIndex.maybeRemove(cachedContent.key);
        notifySpanRemoved(cacheSpan);
    }

    private void removeStaleSpans() {
        ArrayList arrayList = new ArrayList();
        Iterator<CachedContent> it = this.contentIndex.getAll().iterator();
        while (it.hasNext()) {
            Iterator<SimpleCacheSpan> it2 = it.next().getSpans().iterator();
            while (it2.hasNext()) {
                SimpleCacheSpan next = it2.next();
                File file = next.file;
                an.B(file);
                if (file.length() != next.length) {
                    arrayList.add(next);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            removeSpanInternal((CacheSpan) arrayList.get(i2));
        }
    }

    private SimpleCacheSpan touchSpan(String str, SimpleCacheSpan simpleCacheSpan) throws SQLException {
        boolean z;
        if (!this.touchCacheSpans) {
            return simpleCacheSpan;
        }
        File file = simpleCacheSpan.file;
        an.B(file);
        String name = file.getName();
        long j2 = simpleCacheSpan.length;
        CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (cacheFileMetadataIndex != null) {
            z = false;
            try {
                this.fileIndex.set(name, j2, jCurrentTimeMillis);
            } catch (IOException unused) {
                Log.w(TAG, "Failed to update index with new touch timestamp.");
            }
        } else {
            z = true;
        }
        CachedContent cachedContent = this.contentIndex.get(str);
        an.B(cachedContent);
        SimpleCacheSpan lastTouchTimestamp = cachedContent.setLastTouchTimestamp(simpleCacheSpan, jCurrentTimeMillis, z);
        notifySpanTouched(simpleCacheSpan, lastTouchTimestamp);
        return lastTouchTimestamp;
    }

    private static synchronized void unlockFolder(File file) {
        lockedCacheDirs.remove(file.getAbsoluteFile());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized NavigableSet<CacheSpan> addListener(String str, Cache.Listener listener) {
        an.u(!this.released);
        an.B(str);
        an.B(listener);
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.listeners.put(str, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        an.u(!this.released);
        checkInitialization();
        this.contentIndex.applyContentMetadataMutations(str, contentMetadataMutations);
        try {
            this.contentIndex.store();
        } catch (IOException e2) {
            throw new Cache.CacheException(e2);
        }
    }

    public synchronized void checkInitialization() {
        Cache.CacheException cacheException = this.initializationException;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void commitFile(File file, long j2) {
        boolean z = true;
        an.u(!this.released);
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            SimpleCacheSpan simpleCacheSpanCreateCacheEntry = SimpleCacheSpan.createCacheEntry(file, j2, this.contentIndex);
            an.B(simpleCacheSpanCreateCacheEntry);
            SimpleCacheSpan simpleCacheSpan = simpleCacheSpanCreateCacheEntry;
            CachedContent cachedContent = this.contentIndex.get(simpleCacheSpanCreateCacheEntry.key);
            an.B(cachedContent);
            an.u(cachedContent.isFullyLocked(simpleCacheSpanCreateCacheEntry.position, simpleCacheSpanCreateCacheEntry.length));
            long contentLength = ContentMetadata.CC.getContentLength(cachedContent.getMetadata());
            if (contentLength != -1) {
                if (simpleCacheSpanCreateCacheEntry.position + simpleCacheSpanCreateCacheEntry.length > contentLength) {
                    z = false;
                }
                an.u(z);
            }
            if (this.fileIndex == null) {
                addSpan(simpleCacheSpanCreateCacheEntry);
                this.contentIndex.store();
                notifyAll();
                return;
            }
            try {
                this.fileIndex.set(file.getName(), simpleCacheSpanCreateCacheEntry.length, simpleCacheSpanCreateCacheEntry.lastTouchTimestamp);
                addSpan(simpleCacheSpanCreateCacheEntry);
                try {
                    this.contentIndex.store();
                    notifyAll();
                    return;
                } catch (IOException e2) {
                    throw new Cache.CacheException(e2);
                }
            } catch (IOException e3) {
                throw new Cache.CacheException(e3);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long getCacheSpace() {
        an.u(!this.released);
        return this.totalSpace;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long getCachedBytes(String str, long j2, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j3 + j2;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        j4 = 0;
        while (j2 < j6) {
            long cachedLength = getCachedLength(str, j2, j6 - j2);
            if (cachedLength > 0) {
                j4 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j2 += cachedLength;
        }
        return j4;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long getCachedLength(String str, long j2, long j3) {
        CachedContent cachedContent;
        an.u(!this.released);
        cachedContent = this.contentIndex.get(str);
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        return cachedContent != null ? cachedContent.getCachedBytesLength(j2, j3) : -j3;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized NavigableSet<CacheSpan> getCachedSpans(String str) {
        CachedContent cachedContent;
        an.u(!this.released);
        cachedContent = this.contentIndex.get(str);
        return (cachedContent == null || cachedContent.isEmpty()) ? new TreeSet() : new TreeSet((Collection) cachedContent.getSpans());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized ContentMetadata getContentMetadata(String str) {
        an.u(!this.released);
        return this.contentIndex.getContentMetadata(str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized Set<String> getKeys() {
        an.u(!this.released);
        return new HashSet(this.contentIndex.getKeys());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long getUid() {
        return this.uid;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized boolean isCached(String str, long j2, long j3) {
        an.u(!this.released);
        CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent != null) {
            if (cachedContent.getCachedBytesLength(j2, j3) >= j3) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void release() {
        if (this.released) {
            return;
        }
        this.listeners.clear();
        removeStaleSpans();
        try {
            try {
                this.contentIndex.store();
            } catch (IOException e2) {
                Log.e(TAG, "Storing index file failed", e2);
            }
        } finally {
            unlockFolder(this.cacheDir);
            this.released = true;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void releaseHoleSpan(CacheSpan cacheSpan) {
        an.u(!this.released);
        CachedContent cachedContent = this.contentIndex.get(cacheSpan.key);
        an.B(cachedContent);
        cachedContent.unlockRange(cacheSpan.position);
        this.contentIndex.maybeRemove(cachedContent.key);
        notifyAll();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void removeListener(String str, Cache.Listener listener) {
        ArrayList<Cache.Listener> arrayList;
        if (!this.released && (arrayList = this.listeners.get(str)) != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.listeners.remove(str);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void removeResource(String str) {
        an.u(!this.released);
        Iterator<CacheSpan> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            removeSpanInternal(it.next());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void removeSpan(CacheSpan cacheSpan) {
        an.u(!this.released);
        removeSpanInternal(cacheSpan);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized File startFile(String str, long j2, long j3) throws Throwable {
        Throwable th;
        SimpleCache simpleCache;
        CachedContent cachedContent;
        File file;
        try {
            try {
                an.u(!this.released);
                checkInitialization();
                cachedContent = this.contentIndex.get(str);
                an.B(cachedContent);
                an.u(cachedContent.isFullyLocked(j2, j3));
                if (!this.cacheDir.exists()) {
                    try {
                        createCacheDirectories(this.cacheDir);
                        removeStaleSpans();
                    } catch (Throwable th2) {
                        th = th2;
                        simpleCache = this;
                        throw th;
                    }
                }
                this.evictor.onStartFile(this, str, j2, j3);
                file = new File(this.cacheDir, Integer.toString(this.random.nextInt(10)));
                if (!file.exists()) {
                    createCacheDirectories(file);
                }
            } catch (Throwable th3) {
                th = th3;
                simpleCache = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        return SimpleCacheSpan.getCacheFile(file, cachedContent.id, j2, System.currentTimeMillis());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized CacheSpan startReadWrite(String str, long j2, long j3) {
        CacheSpan cacheSpanStartReadWriteNonBlocking;
        an.u(!this.released);
        checkInitialization();
        while (true) {
            cacheSpanStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j2, j3);
            if (cacheSpanStartReadWriteNonBlocking == null) {
                wait();
            }
        }
        return cacheSpanStartReadWriteNonBlocking;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized CacheSpan startReadWriteNonBlocking(String str, long j2, long j3) {
        an.u(!this.released);
        checkInitialization();
        SimpleCacheSpan span = getSpan(str, j2, j3);
        if (span.isCached) {
            return touchSpan(str, span);
        }
        if (this.contentIndex.getOrAdd(str).lockRange(j2, span.length)) {
            return span;
        }
        return null;
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider) {
        this(file, cacheEvictor, databaseProvider, null, false, false);
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider, byte[] bArr, boolean z, boolean z2) {
        CachedContentIndex cachedContentIndex = new CachedContentIndex(databaseProvider, file, bArr, z, z2);
        CacheFileMetadataIndex cacheFileMetadataIndex = null;
        if (databaseProvider != null && !z2) {
            cacheFileMetadataIndex = new CacheFileMetadataIndex(databaseProvider);
        }
        this(file, cacheEvictor, cachedContentIndex, cacheFileMetadataIndex);
    }

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, null, null, false, true);
    }
}

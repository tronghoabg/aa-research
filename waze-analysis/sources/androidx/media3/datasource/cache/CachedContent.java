package androidx.media3.datasource.cache;

import androidx.media3.common.util.Log;
import com.google.d.b.an;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;
    public final int id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    /* compiled from: WazeSource */
    final class Range {
        public final long length;
        public final long position;

        public Range(long j2, long j3) {
            this.position = j2;
            this.length = j3;
        }

        public boolean contains(long j2, long j3) {
            long j4 = this.length;
            if (j4 == -1) {
                return j2 >= this.position;
            }
            if (j3 == -1) {
                return false;
            }
            long j5 = this.position;
            return j5 <= j2 && j2 + j3 <= j5 + j4;
        }

        public boolean intersects(long j2, long j3) {
            long j4 = this.position;
            if (j4 > j2) {
                return j3 == -1 || j2 + j3 > j4;
            }
            long j5 = this.length;
            return j5 == -1 || j4 + j5 > j2;
        }
    }

    public CachedContent(int i2, String str, DefaultContentMetadata defaultContentMetadata) {
        this.id = i2;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
        this.lockedRanges = new ArrayList<>();
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        DefaultContentMetadata defaultContentMetadata = this.metadata;
        DefaultContentMetadata defaultContentMetadataCopyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(contentMetadataMutations);
        this.metadata = defaultContentMetadataCopyWithMutationsApplied;
        return !defaultContentMetadataCopyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CachedContent cachedContent = (CachedContent) obj;
            if (this.id == cachedContent.id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata)) {
                return true;
            }
        }
        return false;
    }

    public long getCachedBytesLength(long j2, long j3) {
        an.l(j2 >= 0);
        an.l(j3 >= 0);
        SimpleCacheSpan span = getSpan(j2, j3);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j3);
        }
        long j4 = j2 + j3;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = span.position + span.length;
        if (jMax < j5) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j6 = simpleCacheSpan.position;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + simpleCacheSpan.length);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j2, j3);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j2, long j3) {
        TreeSet<SimpleCacheSpan> treeSet = this.cachedSpans;
        SimpleCacheSpan simpleCacheSpanCreateLookup = SimpleCacheSpan.createLookup(this.key, j2);
        SimpleCacheSpan simpleCacheSpanFloor = treeSet.floor(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanFloor != null && simpleCacheSpanFloor.position + simpleCacheSpanFloor.length > j2) {
            return simpleCacheSpanFloor;
        }
        SimpleCacheSpan simpleCacheSpanCeiling = this.cachedSpans.ceiling(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanCeiling != null) {
            long j4 = simpleCacheSpanCeiling.position - j2;
            j3 = j3 != -1 ? Math.min(j4, j3) : j4;
        }
        return SimpleCacheSpan.createHole(this.key, j2, j3);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return (((this.id * 31) + this.key.hashCode()) * 31) + this.metadata.hashCode();
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isFullyLocked(long j2, long j3) {
        for (int i2 = 0; i2 < this.lockedRanges.size(); i2++) {
            if (this.lockedRanges.get(i2).contains(j2, j3)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean lockRange(long j2, long j3) {
        int i2 = 0;
        while (true) {
            int size = this.lockedRanges.size();
            ArrayList<Range> arrayList = this.lockedRanges;
            if (i2 >= size) {
                arrayList.add(new Range(j2, j3));
                return true;
            }
            if (arrayList.get(i2).intersects(j2, j3)) {
                return false;
            }
            i2++;
        }
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        File file = cacheSpan.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j2, boolean z) {
        long j3;
        an.u(this.cachedSpans.remove(simpleCacheSpan));
        File file = simpleCacheSpan.file;
        an.B(file);
        if (z) {
            File parentFile = file.getParentFile();
            an.B(parentFile);
            j3 = j2;
            File cacheFile = SimpleCacheSpan.getCacheFile(parentFile, this.id, simpleCacheSpan.position, j3);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.w(TAG, "Failed to rename " + file.toString() + " to " + cacheFile.toString());
            }
        } else {
            j3 = j2;
        }
        SimpleCacheSpan simpleCacheSpanCopyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j3);
        this.cachedSpans.add(simpleCacheSpanCopyWithFileAndLastTouchTimestamp);
        return simpleCacheSpanCopyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j2) {
        for (int i2 = 0; i2 < this.lockedRanges.size(); i2++) {
            if (this.lockedRanges.get(i2).position == j2) {
                this.lockedRanges.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public CachedContent(int i2, String str) {
        this(i2, str, DefaultContentMetadata.EMPTY);
    }
}

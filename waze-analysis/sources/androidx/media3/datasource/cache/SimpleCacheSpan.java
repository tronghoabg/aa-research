package androidx.media3.datasource.cache;

import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    static final String COMMON_SUFFIX = ".exo";
    private static final String SUFFIX = ".v3.exo";

    private SimpleCacheSpan(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    public static SimpleCacheSpan createCacheEntry(File file, long j2, long j3, CachedContentIndex cachedContentIndex) throws NumberFormatException {
        String name = file.getName();
        if (!name.endsWith(SUFFIX)) {
            file = upgradeFile(file, cachedContentIndex);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        an.B(strGroup);
        String keyForId = cachedContentIndex.getKeyForId(Integer.parseInt(strGroup));
        if (keyForId == null) {
            return null;
        }
        if (j2 == -1) {
            j2 = file2.length();
        }
        long j4 = j2;
        if (j4 == 0) {
            return null;
        }
        String strGroup2 = matcher.group(2);
        an.B(strGroup2);
        long j5 = Long.parseLong(strGroup2);
        if (j3 == C.TIME_UNSET) {
            String strGroup3 = matcher.group(3);
            an.B(strGroup3);
            j3 = Long.parseLong(strGroup3);
        }
        return new SimpleCacheSpan(keyForId, j5, j4, j3, file2);
    }

    public static SimpleCacheSpan createHole(String str, long j2, long j3) {
        return new SimpleCacheSpan(str, j2, j3, C.TIME_UNSET, null);
    }

    public static SimpleCacheSpan createLookup(String str, long j2) {
        return new SimpleCacheSpan(str, j2, -1L, C.TIME_UNSET, null);
    }

    public static File getCacheFile(File file, int i2, long j2, long j3) {
        return new File(file, i2 + "." + j2 + "." + j3 + SUFFIX);
    }

    private static File upgradeFile(File file, CachedContentIndex cachedContentIndex) throws NumberFormatException {
        String strGroup;
        String name = file.getName();
        Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            String strGroup2 = matcher.group(1);
            an.B(strGroup2);
            strGroup = Util.unescapeFileName(strGroup2);
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                an.B(strGroup);
            } else {
                strGroup = null;
            }
        }
        if (strGroup == null) {
            return null;
        }
        File parentFile = file.getParentFile();
        an.B(parentFile);
        int iAssignIdForKey = cachedContentIndex.assignIdForKey(strGroup);
        String strGroup3 = matcher.group(2);
        an.B(strGroup3);
        long j2 = Long.parseLong(strGroup3);
        String strGroup4 = matcher.group(3);
        an.B(strGroup4);
        File cacheFile = getCacheFile(parentFile, iAssignIdForKey, j2, Long.parseLong(strGroup4));
        if (file.renameTo(cacheFile)) {
            return cacheFile;
        }
        return null;
    }

    public SimpleCacheSpan copyWithFileAndLastTouchTimestamp(File file, long j2) {
        an.u(this.isCached);
        return new SimpleCacheSpan(this.key, this.position, this.length, j2, file);
    }

    public static SimpleCacheSpan createCacheEntry(File file, long j2, CachedContentIndex cachedContentIndex) {
        return createCacheEntry(file, j2, C.TIME_UNSET, cachedContentIndex);
    }
}

package net.zetetic.database.sqlcipher;

import net.zetetic.database.Logger;

/* loaded from: classes5.dex */
public final class SQLiteDebug {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f41133a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f41134b;

    public static class DbStats {
        public DbStats(String str, long j8, long j10, int i5, int i10, int i11, int i12) {
        }
    }

    public static class PagerStats {
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    static {
        Logger.b().b(2, "SQLiteLog");
        f41133a = Logger.b().b(2, "SQLiteStatements");
        f41134b = Logger.b().b(2, "SQLiteTime");
    }

    private static native void nativeGetPagerStats(PagerStats pagerStats);
}

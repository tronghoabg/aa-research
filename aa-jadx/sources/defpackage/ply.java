package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ply {
    ALL_OBJECT_POOL(0, true),
    SHAKE_GESTURE_RECOGNIZER_IMPL(1, true),
    GENERIC_DISK_CACHE_HASH_BITS(2, true),
    RESOURCE_MANAGER_IMPL_BITMAP_POOL(3, true),
    RESOURCE_MANAGER_IMPL_BITMAP_OPTIONS_POOL(4, true),
    CALLOUT_LABELS(5, false),
    LINE_LABELS(6, false),
    POINTS_LABELS(7, false),
    GENERIC_DISK_CACHE(8, true),
    BYTE_ARRAY_POOL(9, true),
    OTHER(10, true),
    NO_LOGGING_FOR_TEST(11, false);

    public final int m;
    public final boolean n;

    ply(int i, boolean z) {
        this.m = i;
        this.n = z;
    }
}

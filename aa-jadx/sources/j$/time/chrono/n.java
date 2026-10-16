package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        a = iArr;
        try {
            iArr[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[j$.time.temporal.a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            a[j$.time.temporal.a.ERA.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}

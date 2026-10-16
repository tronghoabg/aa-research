package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum rzy implements java.util.Comparator {
    INSTANCE;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        long j = jLongValue / 1000000;
        long jLongValue2 = ((java.lang.Long) obj2).longValue();
        return java.lang.Long.compare((j * 1000000) + (((jLongValue % 100000) / 10) * 10), ((jLongValue2 / 1000000) * 1000000) + (((jLongValue2 % 100000) / 10) * 10));
    }
}

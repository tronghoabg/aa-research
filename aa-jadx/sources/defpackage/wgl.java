package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wgl implements java.util.Iterator {
    private long a = 10;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Long next() {
        long j = this.a;
        this.a = j >= 30000 ? 60000L : j + j;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return true;
    }
}

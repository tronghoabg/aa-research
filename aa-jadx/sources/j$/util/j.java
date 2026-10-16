package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends j$.util.h implements java.util.RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private java.lang.Object writeReplace() {
        return new j$.util.h(this.c);
    }

    @Override // j$.util.h, java.util.List
    public final java.util.List subList(int i, int i2) {
        j$.util.j jVar;
        synchronized (this.b) {
            jVar = new j$.util.j(this.c.subList(i, i2), this.b);
        }
        return jVar;
    }
}

package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends j$.util.p implements java.util.RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private java.lang.Object writeReplace() {
        return new j$.util.p(this.b);
    }

    @Override // j$.util.p, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new j$.util.u(this.b.subList(i, i2));
    }
}

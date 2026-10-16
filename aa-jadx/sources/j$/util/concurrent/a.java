package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends j$.util.concurrent.o {
    public final j$.util.concurrent.ConcurrentHashMap i;
    public j$.util.concurrent.k j;

    public a(j$.util.concurrent.k[] kVarArr, int i, int i2, j$.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        j$.util.concurrent.k kVar = this.j;
        if (kVar == null) {
            throw new java.lang.IllegalStateException();
        }
        this.j = null;
        this.i.g(kVar.b, null, null);
    }
}

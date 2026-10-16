package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends j$.util.concurrent.a implements java.util.Iterator, java.util.Enumeration {
    public final /* synthetic */ byte k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j$.util.concurrent.k[] kVarArr, int i, int i2, j$.util.concurrent.ConcurrentHashMap concurrentHashMap, byte b) {
        super(kVarArr, i, i2, concurrentHashMap);
        this.k = b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.k) {
            case 0:
                j$.util.concurrent.k kVar = this.b;
                if (kVar == null) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj = kVar.b;
                this.j = kVar;
                a();
                return obj;
            default:
                j$.util.concurrent.k kVar2 = this.b;
                if (kVar2 == null) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj2 = kVar2.c;
                this.j = kVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final java.lang.Object nextElement() {
        switch (this.k) {
            case 0:
                break;
        }
        return next();
    }
}

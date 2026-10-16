package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends j$.util.concurrent.k {
    public final j$.util.concurrent.k[] e;

    public g(j$.util.concurrent.k[] kVarArr) {
        super(-1, null, null);
        this.e = kVarArr;
    }

    @Override // j$.util.concurrent.k
    public final j$.util.concurrent.k a(int i, java.lang.Object obj) {
        j$.util.concurrent.k kVarK;
        java.lang.Object obj2;
        j$.util.concurrent.k[] kVarArr = this.e;
        while (true) {
            int length = kVarArr.length;
            if (length == 0 || (kVarK = j$.util.concurrent.ConcurrentHashMap.k(kVarArr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = kVarK.a;
                if (i2 == i && ((obj2 = kVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return kVarK;
                }
                if (i2 >= 0) {
                    kVarK = kVarK.d;
                } else {
                    if (!(kVarK instanceof j$.util.concurrent.g)) {
                        return kVarK.a(i, obj);
                    }
                    kVarArr = ((j$.util.concurrent.g) kVarK).e;
                }
            } while (kVarK != null);
            return null;
        }
    }
}

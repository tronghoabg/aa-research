package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends j$.util.concurrent.k {
    public j$.util.concurrent.q e;
    public j$.util.concurrent.q f;
    public j$.util.concurrent.q g;
    public j$.util.concurrent.q h;
    public boolean i;

    public q(int i, java.lang.Object obj, java.lang.Object obj2, j$.util.concurrent.k kVar, j$.util.concurrent.q qVar) {
        super(i, obj, obj2, kVar);
        this.e = qVar;
    }

    @Override // j$.util.concurrent.k
    public final j$.util.concurrent.k a(int i, java.lang.Object obj) {
        return b(i, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0046 A[PHI: r7
  0x0046: PHI (r7v5 java.lang.Class) = (r7v4 java.lang.Class), (r7v6 java.lang.Class) binds: [B:28:0x003f, B:20:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x004c A[SYNTHETIC] */
    public final j$.util.concurrent.q b(int i, java.lang.Object obj, java.lang.Class cls) {
        j$.util.concurrent.q qVarB;
        if (obj == null) {
            return null;
        }
        do {
            j$.util.concurrent.q qVar = this.f;
            j$.util.concurrent.q qVar2 = this.g;
            int i2 = this.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    java.lang.Object obj2 = this.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return this;
                    }
                    if (qVar != null) {
                        if (qVar2 != null) {
                            if (cls == null && (cls = j$.util.concurrent.ConcurrentHashMap.c(obj)) == null) {
                                qVarB = qVar2.b(i, obj, cls);
                                if (qVarB != null) {
                                    return qVarB;
                                }
                            } else {
                                int i3 = j$.util.concurrent.ConcurrentHashMap.g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((java.lang.Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    qVarB = qVar2.b(i, obj, cls);
                                    if (qVarB != null) {
                                        return qVarB;
                                    }
                                } else if (iCompareTo >= 0) {
                                    qVar = qVar2;
                                }
                            }
                        }
                        this = qVar;
                    }
                }
                this = qVar2;
            } else {
                this = qVar;
            }
        } while (this != null);
        return null;
    }
}

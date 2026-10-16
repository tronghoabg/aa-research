package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yfw<K, V> extends defpackage.ycx<V, K> {
    final defpackage.yge a;
    final java.lang.Object b;
    int c;

    public yfw(defpackage.yge ygeVar, int i) {
        this.a = ygeVar;
        this.b = ygeVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            defpackage.yge ygeVar = this.a;
            if (i <= ygeVar.c && j$.util.Objects.equals(this.b, ygeVar.b[i])) {
                return;
            }
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final V getKey() {
        return (V) this.b;
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final K getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return (K) this.a.a[i];
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final K setValue(K k) {
        a();
        int i = this.c;
        defpackage.yge ygeVar = this.a;
        if (i == -1) {
            ygeVar.k(this.b, k);
            return null;
        }
        K k2 = (K) ygeVar.a[i];
        if (j$.util.Objects.equals(k2, k)) {
            return k;
        }
        ygeVar.l(this.c, k);
        return k2;
    }
}

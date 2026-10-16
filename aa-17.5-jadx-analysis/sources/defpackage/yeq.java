package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class yeq<K, V> extends ybr<V, K> {
    final yey a;
    final Object b;
    int c;

    public yeq(yey yeyVar, int i) {
        this.a = yeyVar;
        this.b = yeyVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            yey yeyVar = this.a;
            if (i <= yeyVar.c && Objects.equals(this.b, yeyVar.b[i])) {
                return;
            }
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final V getKey() {
        return (V) this.b;
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final K getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return (K) this.a.a[i];
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final K setValue(K k) {
        a();
        int i = this.c;
        yey yeyVar = this.a;
        if (i == -1) {
            yeyVar.k(this.b, k);
            return null;
        }
        K k2 = (K) yeyVar.a[i];
        if (Objects.equals(k2, k)) {
            return k;
        }
        yeyVar.l(this.c, k);
        return k2;
    }
}

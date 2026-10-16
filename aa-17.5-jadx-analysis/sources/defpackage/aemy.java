package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aemy extends aeqw implements Set, aeum {
    public final /* synthetic */ aend a;

    public aemy(aend aendVar) {
        this.a = aendVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aemt(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aemu(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        long j;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Long) && entry.getValue() != null && (entry.getValue() instanceof Long)) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            long jLongValue2 = ((Long) entry.getValue()).longValue();
            aend aendVar = this.a;
            if (jLongValue == 0) {
                return aendVar.e && aendVar.c[aendVar.f] == jLongValue2;
            }
            long j2 = (-7046029254386353131L) * jLongValue;
            long j3 = j2 ^ (j2 >>> 32);
            long[] jArr = aendVar.b;
            int i = ((int) (j3 ^ (j3 >>> 16))) & aendVar.d;
            long j4 = jArr[i];
            if (j4 == 0) {
                return false;
            }
            if (jLongValue == j4) {
                return aendVar.c[i] == jLongValue2;
            }
            do {
                i = (i + 1) & aendVar.d;
                j = jArr[i];
                if (j == 0) {
                    return false;
                }
            } while (jLongValue != j);
            if (aendVar.c[i] == jLongValue2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aemx> consumer) {
        aend aendVar = this.a;
        if (aendVar.e) {
            consumer.accept(new aemx(aendVar, aendVar.f));
        }
        long[] jArr = aendVar.b;
        int i = aendVar.f;
        while (i != 0) {
            i--;
            if (jArr[i] != 0) {
                consumer.accept(new aemx(aendVar, i));
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long) || entry.getValue() == null || !(entry.getValue() instanceof Long)) {
            return false;
        }
        long jLongValue = ((Long) entry.getKey()).longValue();
        long jLongValue2 = ((Long) entry.getValue()).longValue();
        aend aendVar = this.a;
        if (jLongValue == 0) {
            if (!aendVar.e || aendVar.c[aendVar.f] != jLongValue2) {
                return false;
            }
            aendVar.x();
            return true;
        }
        long j = (-7046029254386353131L) * jLongValue;
        long j2 = j ^ (j >>> 32);
        long[] jArr = aendVar.b;
        int i = ((int) (j2 ^ (j2 >>> 16))) & aendVar.d;
        long j3 = jArr[i];
        if (j3 == 0) {
            return false;
        }
        if (j3 == jLongValue) {
            if (aendVar.c[i] != jLongValue2) {
                return false;
            }
            aendVar.w(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aendVar.d;
            long j4 = jArr[i];
            if (j4 == 0) {
                return false;
            }
            if (j4 == jLongValue && aendVar.c[i] == jLongValue2) {
                aendVar.w(i);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.i;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}

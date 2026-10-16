package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeok extends aeqw implements Set, aeum {
    final /* synthetic */ aeop a;

    public aeok(aeop aeopVar) {
        this.a = aeopVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aeoe(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeoo(this.a, 1);
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
        if (entry.getKey() != null && (entry.getKey() instanceof Long)) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            Object value = entry.getValue();
            aeop aeopVar = this.a;
            if (jLongValue == 0) {
                return aeopVar.d && aeopVar.b[aeopVar.e] == value;
            }
            long j2 = (-7046029254386353131L) * jLongValue;
            long j3 = j2 ^ (j2 >>> 32);
            long[] jArr = aeopVar.a;
            int i = ((int) (j3 ^ (j3 >>> 16))) & aeopVar.c;
            long j4 = jArr[i];
            if (j4 == 0) {
                return false;
            }
            if (jLongValue == j4) {
                return aeopVar.b[i] == value;
            }
            do {
                i = (i + 1) & aeopVar.c;
                j = jArr[i];
                if (j == 0) {
                    return false;
                }
            } while (jLongValue != j);
            if (aeopVar.b[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aeoj> consumer) {
        aeop aeopVar = this.a;
        if (aeopVar.d) {
            consumer.accept(new aeoj(aeopVar, aeopVar.e));
        }
        long[] jArr = aeopVar.a;
        int i = aeopVar.e;
        while (i != 0) {
            i--;
            if (jArr[i] != 0) {
                consumer.accept(new aeoj(aeopVar, i));
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long jLongValue = ((Long) entry.getKey()).longValue();
        Object value = entry.getValue();
        aeop aeopVar = this.a;
        if (jLongValue == 0) {
            if (!aeopVar.d || aeopVar.b[aeopVar.e] != value) {
                return false;
            }
            aeopVar.m();
            return true;
        }
        long j = (-7046029254386353131L) * jLongValue;
        long j2 = j ^ (j >>> 32);
        long[] jArr = aeopVar.a;
        int i = ((int) (j2 ^ (j2 >>> 16))) & aeopVar.c;
        long j3 = jArr[i];
        if (j3 == 0) {
            return false;
        }
        if (j3 == jLongValue) {
            if (aeopVar.b[i] != value) {
                return false;
            }
            aeopVar.l(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aeopVar.c;
            long j4 = jArr[i];
            if (j4 == 0) {
                return false;
            }
            if (j4 == jLongValue && aeopVar.b[i] == value) {
                aeopVar.l(i);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}

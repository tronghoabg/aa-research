package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aemd extends aeqw implements Set, aeum {
    final /* synthetic */ aemi a;

    public aemd(aemi aemiVar) {
        this.a = aemiVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aelw(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aelx(this.a);
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
        if (entry.getKey() != null && (entry.getKey() instanceof Long) && entry.getValue() != null && (entry.getValue() instanceof Integer)) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            aemi aemiVar = this.a;
            if (jLongValue == 0) {
                return aemiVar.d && aemiVar.b[aemiVar.e] == iIntValue;
            }
            long j2 = (-7046029254386353131L) * jLongValue;
            long j3 = j2 ^ (j2 >>> 32);
            long[] jArr = aemiVar.a;
            int i = ((int) (j3 ^ (j3 >>> 16))) & aemiVar.c;
            long j4 = jArr[i];
            if (j4 == 0) {
                return false;
            }
            if (jLongValue == j4) {
                return aemiVar.b[i] == iIntValue;
            }
            do {
                i = (i + 1) & aemiVar.c;
                j = jArr[i];
                if (j == 0) {
                    return false;
                }
            } while (jLongValue != j);
            if (aemiVar.b[i] == iIntValue) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aemc> consumer) {
        aemi aemiVar = this.a;
        if (aemiVar.d) {
            consumer.accept(new aemc(aemiVar, aemiVar.e));
        }
        long[] jArr = aemiVar.a;
        int i = aemiVar.e;
        while (i != 0) {
            i--;
            if (jArr[i] != 0) {
                consumer.accept(new aemc(aemiVar, i));
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long) || entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        long jLongValue = ((Long) entry.getKey()).longValue();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        aemi aemiVar = this.a;
        if (jLongValue == 0) {
            if (!aemiVar.d || aemiVar.b[aemiVar.e] != iIntValue) {
                return false;
            }
            aemiVar.w();
            return true;
        }
        long j = (-7046029254386353131L) * jLongValue;
        long j2 = j ^ (j >>> 32);
        long[] jArr = aemiVar.a;
        int i = ((int) (j2 ^ (j2 >>> 16))) & aemiVar.c;
        long j3 = jArr[i];
        if (j3 == 0) {
            return false;
        }
        if (j3 == jLongValue) {
            if (aemiVar.b[i] != iIntValue) {
                return false;
            }
            aemiVar.v(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aemiVar.c;
            long j4 = jArr[i];
            if (j4 == 0) {
                return false;
            }
            if (j4 == jLongValue && aemiVar.b[i] == iIntValue) {
                aemiVar.v(i);
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

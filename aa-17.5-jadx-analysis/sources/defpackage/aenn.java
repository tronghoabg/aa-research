package defpackage;

import j$.util.Objects;
import j$.util.SortedSet;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aenn extends aeqx implements SortedSet, aeur, aeum {
    final /* synthetic */ aenq a;

    public aenn(aenq aenqVar) {
        this.a = aenqVar;
    }

    public static final aeur h() {
        throw new UnsupportedOperationException();
    }

    public static final aeur i() {
        throw new UnsupportedOperationException();
    }

    public static final aeur j() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeuy(iterator(), adzo.m(this.a), 81);
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: c */
    public final aetu iterator() {
        return new aeni(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        long j;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long jLongValue = ((Long) entry.getKey()).longValue();
        Object value = entry.getValue();
        aenq aenqVar = this.a;
        if (jLongValue == 0) {
            return aenqVar.d && Objects.equals(aenqVar.b[aenqVar.h], value);
        }
        long j2 = (-7046029254386353131L) * jLongValue;
        long j3 = j2 ^ (j2 >>> 32);
        long[] jArr = aenqVar.a;
        int i = ((int) (j3 ^ (j3 >>> 16))) & aenqVar.c;
        long j4 = jArr[i];
        if (j4 == 0) {
            return false;
        }
        if (jLongValue == j4) {
            return Objects.equals(aenqVar.b[i], value);
        }
        do {
            i = (i + 1) & aenqVar.c;
            j = jArr[i];
            if (j == 0) {
                return false;
            }
        } while (jLongValue != j);
        return Objects.equals(aenqVar.b[i], value);
    }

    public final aeui d() {
        return new aenj(this.a);
    }

    @Override // defpackage.aeur
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ aeur headSet(Object obj) {
        return h();
    }

    @Override // defpackage.aeur
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ aeur subSet(Object obj, Object obj2) {
        return i();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        aenq aenqVar = this.a;
        if (aenqVar.k != 0) {
            return new aenm(aenqVar, aenqVar.e);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aenm> consumer) {
        aenq aenqVar = this.a;
        long[] jArr = aenqVar.g;
        int i = aenqVar.k;
        int i2 = aenqVar.e;
        while (i != 0) {
            i--;
            int i3 = (int) jArr[i2];
            consumer.accept(new aenm(aenqVar, i2));
            i2 = i3;
        }
    }

    @Override // defpackage.aeur
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ aeur tailSet(Object obj) {
        return j();
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return h();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        aenq aenqVar = this.a;
        if (aenqVar.k != 0) {
            return new aenm(aenqVar, aenqVar.f);
        }
        throw new NoSuchElementException();
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
        aenq aenqVar = this.a;
        if (jLongValue == 0) {
            if (!aenqVar.d || !Objects.equals(aenqVar.b[aenqVar.h], value)) {
                return false;
            }
            aenqVar.v();
            return true;
        }
        long j = (-7046029254386353131L) * jLongValue;
        long j2 = j ^ (j >>> 32);
        long[] jArr = aenqVar.a;
        int i = ((int) (j2 ^ (j2 >>> 16))) & aenqVar.c;
        long j3 = jArr[i];
        if (j3 == 0) {
            return false;
        }
        if (j3 == jLongValue) {
            if (!Objects.equals(aenqVar.b[i], value)) {
                return false;
            }
            aenqVar.u(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aenqVar.c;
            long j4 = jArr[i];
            if (j4 == 0) {
                return false;
            }
            if (j4 == jLongValue && Objects.equals(aenqVar.b[i], value)) {
                aenqVar.u(i);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.k;
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return i();
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return j();
    }
}

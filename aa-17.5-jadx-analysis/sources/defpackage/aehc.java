package defpackage;

import j$.util.Objects;
import j$.util.SortedSet;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aehc extends aeqx implements SortedSet, aeur, aehi {
    final /* synthetic */ aehf a;

    public aehc(aehf aehfVar) {
        this.a = aehfVar;
    }

    public static final aeur i() {
        throw new UnsupportedOperationException();
    }

    public static final aeur j() {
        throw new UnsupportedOperationException();
    }

    public static final aeur k() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeuy(iterator(), adzo.m(this.a), 81);
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aetu iterator() {
        return new aegy(this.a);
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
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        aehf aehfVar = this.a;
        if (iIntValue == 0) {
            return aehfVar.d && Objects.equals(aehfVar.b[aehfVar.h], value);
        }
        int i2 = (-1640531527) * iIntValue;
        int[] iArr = aehfVar.a;
        int i3 = (i2 ^ (i2 >>> 16)) & aehfVar.c;
        int i4 = iArr[i3];
        if (i4 == 0) {
            return false;
        }
        if (iIntValue == i4) {
            return Objects.equals(aehfVar.b[i3], value);
        }
        do {
            i3 = (i3 + 1) & aehfVar.c;
            i = iArr[i3];
            if (i == 0) {
                return false;
            }
        } while (iIntValue != i);
        return Objects.equals(aehfVar.b[i3], value);
    }

    @Override // defpackage.aehi
    public final /* bridge */ /* synthetic */ aety d() {
        return new aegz(this.a);
    }

    @Override // defpackage.aeur
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ aeur headSet(Object obj) {
        return i();
    }

    @Override // defpackage.aeur
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ aeur subSet(Object obj, Object obj2) {
        return j();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        aehf aehfVar = this.a;
        if (aehfVar.k != 0) {
            return new aehs(aehfVar, aehfVar.e, 1);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aehh> consumer) {
        aehf aehfVar = this.a;
        long[] jArr = aehfVar.g;
        int i = aehfVar.k;
        int i2 = aehfVar.e;
        while (i != 0) {
            i--;
            int i3 = (int) jArr[i2];
            consumer.accept(new aehs(aehfVar, i2, 1));
            i2 = i3;
        }
    }

    @Override // defpackage.aeur
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ aeur tailSet(Object obj) {
        return k();
    }

    @Override // defpackage.aehi
    public final void h(Consumer consumer) {
        aehf aehfVar = this.a;
        aehs aehsVar = new aehs(aehfVar, 1, (byte[]) null);
        long[] jArr = aehfVar.g;
        int i = aehfVar.k;
        int i2 = aehfVar.e;
        while (i != 0) {
            i--;
            aehsVar.a = i2;
            i2 = (int) jArr[i2];
            consumer.accept(aehsVar);
        }
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return i();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        aehf aehfVar = this.a;
        if (aehfVar.k != 0) {
            return new aehs(aehfVar, aehfVar.f, 1);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        aehf aehfVar = this.a;
        if (iIntValue == 0) {
            if (!aehfVar.d || !Objects.equals(aehfVar.b[aehfVar.h], value)) {
                return false;
            }
            aehfVar.v();
            return true;
        }
        int i = (-1640531527) * iIntValue;
        int[] iArr = aehfVar.a;
        int i2 = (i ^ (i >>> 16)) & aehfVar.c;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return false;
        }
        if (i3 == iIntValue) {
            if (!Objects.equals(aehfVar.b[i2], value)) {
                return false;
            }
            aehfVar.u(i2);
            return true;
        }
        while (true) {
            i2 = (i2 + 1) & aehfVar.c;
            int i4 = iArr[i2];
            if (i4 == 0) {
                return false;
            }
            if (i4 == iIntValue && Objects.equals(aehfVar.b[i2], value)) {
                aehfVar.u(i2);
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
        return j();
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return k();
    }
}

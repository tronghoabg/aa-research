package defpackage;

import j$.util.Objects;
import j$.util.SortedSet;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aesr extends aeqx implements SortedSet, aeur, aesx {
    final /* synthetic */ aesu a;

    public aesr(aesu aesuVar) {
        this.a = aesuVar;
    }

    public static final aeur j() {
        throw new UnsupportedOperationException();
    }

    public static final aeur k() {
        throw new UnsupportedOperationException();
    }

    public static final aeur l() {
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
        return new aeso(this.a);
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
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        aesu aesuVar = this.a;
        if (key == null) {
            return aesuVar.d && Objects.equals(aesuVar.b[aesuVar.h], value);
        }
        Object[] objArr = aesuVar.a;
        int iHashCode = key.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & aesuVar.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (key.equals(obj3)) {
            return Objects.equals(aesuVar.b[i], value);
        }
        do {
            i = (i + 1) & aesuVar.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
        } while (!key.equals(obj2));
        return Objects.equals(aesuVar.b[i], value);
    }

    @Override // defpackage.aeur
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ aeur headSet(Object obj) {
        return j();
    }

    @Override // defpackage.aeur
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ aeur subSet(Object obj, Object obj2) {
        return k();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        aesu aesuVar = this.a;
        if (aesuVar.k != 0) {
            return new aetg(aesuVar, aesuVar.e, 1);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aesw> consumer) {
        aesu aesuVar = this.a;
        long[] jArr = aesuVar.g;
        int i = aesuVar.k;
        int i2 = aesuVar.e;
        while (i != 0) {
            i--;
            int i3 = (int) jArr[i2];
            consumer.accept(new aetg(aesuVar, i2, 1));
            i2 = i3;
        }
    }

    @Override // defpackage.aeur
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ aeur tailSet(Object obj) {
        return l();
    }

    @Override // defpackage.aesx
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final aeui d() {
        return new aesp(this.a);
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return j();
    }

    @Override // defpackage.aesx
    public final void i(Consumer consumer) {
        aesu aesuVar = this.a;
        aetg aetgVar = new aetg(aesuVar, 1, (byte[]) null);
        long[] jArr = aesuVar.g;
        int i = aesuVar.k;
        int i2 = aesuVar.e;
        while (i != 0) {
            i--;
            aetgVar.a = i2;
            i2 = (int) jArr[i2];
            consumer.accept(aetgVar);
        }
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        aesu aesuVar = this.a;
        if (aesuVar.k != 0) {
            return new aetg(aesuVar, aesuVar.f, 1);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        aesu aesuVar = this.a;
        if (key == null) {
            if (!aesuVar.d || !Objects.equals(aesuVar.b[aesuVar.h], value)) {
                return false;
            }
            aesuVar.j();
            return true;
        }
        Object[] objArr = aesuVar.a;
        int iHashCode = key.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & aesuVar.c;
        Object obj2 = objArr[i];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            if (!Objects.equals(aesuVar.b[i], value)) {
                return false;
            }
            aesuVar.i(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aesuVar.c;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key) && Objects.equals(aesuVar.b[i], value)) {
                aesuVar.i(i);
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
        return k();
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return l();
    }
}

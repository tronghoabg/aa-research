package defpackage;

import j$.util.Objects;
import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeht extends aeqw implements Set, aehi {
    final /* synthetic */ aehy a;

    public aeht(aehy aehyVar) {
        this.a = aehyVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aehn(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aehx(this.a, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
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
        aehy aehyVar = this.a;
        if (iIntValue == 0) {
            return aehyVar.d && Objects.equals(aehyVar.b[aehyVar.e], value);
        }
        int i2 = (-1640531527) * iIntValue;
        int[] iArr = aehyVar.a;
        int i3 = (i2 ^ (i2 >>> 16)) & aehyVar.c;
        int i4 = iArr[i3];
        if (i4 == 0) {
            return false;
        }
        if (iIntValue == i4) {
            return Objects.equals(aehyVar.b[i3], value);
        }
        do {
            i3 = (i3 + 1) & aehyVar.c;
            i = iArr[i3];
            if (i == 0) {
                return false;
            }
        } while (iIntValue != i);
        return Objects.equals(aehyVar.b[i3], value);
    }

    @Override // defpackage.aehi
    public final aety d() {
        return new aeho(this.a);
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aehh> consumer) {
        aehy aehyVar = this.a;
        if (aehyVar.d) {
            consumer.accept(new aehs(aehyVar, aehyVar.e, 0));
        }
        int[] iArr = aehyVar.a;
        int i = aehyVar.e;
        while (i != 0) {
            i--;
            if (iArr[i] != 0) {
                consumer.accept(new aehs(aehyVar, i, 0));
            }
        }
    }

    @Override // defpackage.aehi
    public final void h(Consumer consumer) {
        aehy aehyVar = this.a;
        aehs aehsVar = new aehs(aehyVar, 0, (byte[]) null);
        if (aehyVar.d) {
            aehsVar.a = aehyVar.e;
            consumer.accept(aehsVar);
        }
        int[] iArr = aehyVar.a;
        int i = aehyVar.e;
        while (i != 0) {
            i--;
            if (iArr[i] != 0) {
                aehsVar.a = i;
                consumer.accept(aehsVar);
            }
        }
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
        aehy aehyVar = this.a;
        if (iIntValue == 0) {
            if (!aehyVar.d || !Objects.equals(aehyVar.b[aehyVar.e], value)) {
                return false;
            }
            aehyVar.m();
            return true;
        }
        int i = (-1640531527) * iIntValue;
        int[] iArr = aehyVar.a;
        int i2 = (i ^ (i >>> 16)) & aehyVar.c;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return false;
        }
        if (i3 == iIntValue) {
            if (!Objects.equals(aehyVar.b[i2], value)) {
                return false;
            }
            aehyVar.k(i2);
            return true;
        }
        while (true) {
            i2 = (i2 + 1) & aehyVar.c;
            int i4 = iArr[i2];
            if (i4 == 0) {
                return false;
            }
            if (i4 == iIntValue && Objects.equals(aehyVar.b[i2], value)) {
                aehyVar.k(i2);
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

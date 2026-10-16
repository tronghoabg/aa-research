package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeio extends aeqw implements Set, aeum {
    final /* synthetic */ aeit a;

    public aeio(aeit aeitVar) {
        this.a = aeitVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aeii(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeis(this.a, 1);
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
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            Object value = entry.getValue();
            aeit aeitVar = this.a;
            if (iIntValue == 0) {
                return aeitVar.d && aeitVar.b[aeitVar.e] == value;
            }
            int i2 = (-1640531527) * iIntValue;
            int[] iArr = aeitVar.a;
            int i3 = (i2 ^ (i2 >>> 16)) & aeitVar.c;
            int i4 = iArr[i3];
            if (i4 == 0) {
                return false;
            }
            if (iIntValue == i4) {
                return aeitVar.b[i3] == value;
            }
            do {
                i3 = (i3 + 1) & aeitVar.c;
                i = iArr[i3];
                if (i == 0) {
                    return false;
                }
            } while (iIntValue != i);
            if (aeitVar.b[i3] == value) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aein> consumer) {
        aeit aeitVar = this.a;
        if (aeitVar.d) {
            consumer.accept(new aein(aeitVar, aeitVar.e));
        }
        int[] iArr = aeitVar.a;
        int i = aeitVar.e;
        while (i != 0) {
            i--;
            if (iArr[i] != 0) {
                consumer.accept(new aein(aeitVar, i));
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
        aeit aeitVar = this.a;
        if (iIntValue == 0) {
            if (!aeitVar.d || aeitVar.b[aeitVar.e] != value) {
                return false;
            }
            aeitVar.m();
            return true;
        }
        int i = (-1640531527) * iIntValue;
        int[] iArr = aeitVar.a;
        int i2 = (i ^ (i >>> 16)) & aeitVar.c;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return false;
        }
        if (i3 == iIntValue) {
            if (aeitVar.b[i2] != value) {
                return false;
            }
            aeitVar.l(i2);
            return true;
        }
        while (true) {
            i2 = (i2 + 1) & aeitVar.c;
            int i4 = iArr[i2];
            if (i4 == 0) {
                return false;
            }
            if (i4 == iIntValue && aeitVar.b[i2] == value) {
                aeitVar.l(i2);
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

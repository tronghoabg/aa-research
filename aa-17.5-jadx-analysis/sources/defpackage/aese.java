package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aese extends aeqw implements Set, aeum {
    public final /* synthetic */ aesj a;

    public aese(aesj aesjVar) {
        this.a = aesjVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aery(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aesc(this.a, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() != null && (entry.getValue() instanceof Integer)) {
            Object key = entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            aesj aesjVar = this.a;
            if (key == null) {
                return aesjVar.d && aesjVar.b[aesjVar.e] == iIntValue;
            }
            Object[] objArr = aesjVar.a;
            int iHashCode = key.hashCode() * (-1640531527);
            int i = (iHashCode ^ (iHashCode >>> 16)) & aesjVar.c;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                return false;
            }
            if (key.equals(obj3)) {
                return aesjVar.b[i] == iIntValue;
            }
            do {
                i = (i + 1) & aesjVar.c;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return false;
                }
            } while (!key.equals(obj2));
            if (aesjVar.b[i] == iIntValue) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aers> consumer) {
        aesj aesjVar = this.a;
        if (aesjVar.d) {
            consumer.accept(new aesd(aesjVar, aesjVar.e));
        }
        Object[] objArr = aesjVar.a;
        int i = aesjVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                consumer.accept(new aesd(aesjVar, i));
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        aesj aesjVar = this.a;
        if (key == null) {
            if (!aesjVar.d || aesjVar.b[aesjVar.e] != iIntValue) {
                return false;
            }
            aesjVar.s();
            return true;
        }
        Object[] objArr = aesjVar.a;
        int iHashCode = key.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & aesjVar.c;
        Object obj2 = objArr[i];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            if (aesjVar.b[i] != iIntValue) {
                return false;
            }
            aesjVar.r(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aesjVar.c;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key) && aesjVar.b[i] == iIntValue) {
                aesjVar.r(i);
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

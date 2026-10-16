package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aewy extends aeqw implements Set, aeum {
    final /* synthetic */ aexc a;

    public aewy(aexc aexcVar) {
        this.a = aexcVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aewt(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeww(this.a, 1);
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
        Object key = entry.getKey();
        Object value = entry.getValue();
        aexc aexcVar = this.a;
        if (key == null) {
            return aexcVar.d && aexcVar.b[aexcVar.e] == value;
        }
        Object[] objArr = aexcVar.a;
        int iIdentityHashCode = System.identityHashCode(key) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & aexcVar.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (key == obj3) {
            return aexcVar.b[i] == value;
        }
        do {
            i = (i + 1) & aexcVar.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
        } while (key != obj2);
        return aexcVar.b[i] == value;
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aewx> consumer) {
        aexc aexcVar = this.a;
        if (aexcVar.d) {
            consumer.accept(new aewx(aexcVar, aexcVar.e, 0));
        }
        Object[] objArr = aexcVar.a;
        int i = aexcVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                consumer.accept(new aewx(aexcVar, i, 0));
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        aexc aexcVar = this.a;
        if (key == null) {
            if (!aexcVar.d || aexcVar.b[aexcVar.e] != value) {
                return false;
            }
            aexcVar.h();
            return true;
        }
        Object[] objArr = aexcVar.a;
        int iIdentityHashCode = System.identityHashCode(key) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & aexcVar.c;
        Object obj2 = objArr[i];
        if (obj2 == null) {
            return false;
        }
        if (obj2 == key) {
            if (aexcVar.b[i] != value) {
                return false;
            }
            aexcVar.g(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aexcVar.c;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                return false;
            }
            if (obj3 == key && aexcVar.b[i] == value) {
                aexcVar.g(i);
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

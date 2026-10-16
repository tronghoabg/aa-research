package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aevo extends aeqw implements Set, aeum {
    final /* synthetic */ aevt a;

    public aevo(aevt aevtVar) {
        this.a = aevtVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aevi(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aevm(this.a, 1);
    }

    public final aety c() {
        return new aevj(this.a);
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
            aevt aevtVar = this.a;
            if (key == null) {
                return aevtVar.d && aevtVar.b[aevtVar.e] == iIntValue;
            }
            Object[] objArr = aevtVar.a;
            int iIdentityHashCode = System.identityHashCode(key) * (-1640531527);
            int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & aevtVar.c;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                return false;
            }
            if (key == obj3) {
                return aevtVar.b[i] == iIntValue;
            }
            do {
                i = (i + 1) & aevtVar.c;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return false;
                }
            } while (key != obj2);
            if (aevtVar.b[i] == iIntValue) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aevn> consumer) {
        aevt aevtVar = this.a;
        if (aevtVar.d) {
            consumer.accept(new aevn(aevtVar, aevtVar.e));
        }
        Object[] objArr = aevtVar.a;
        int i = aevtVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                consumer.accept(new aevn(aevtVar, i));
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
        aevt aevtVar = this.a;
        if (key == null) {
            if (!aevtVar.d || aevtVar.b[aevtVar.e] != iIntValue) {
                return false;
            }
            aevtVar.s();
            return true;
        }
        Object[] objArr = aevtVar.a;
        int iIdentityHashCode = System.identityHashCode(key) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & aevtVar.c;
        Object obj2 = objArr[i];
        if (obj2 == null) {
            return false;
        }
        if (obj2 == key) {
            if (aevtVar.b[i] != iIntValue) {
                return false;
            }
            aevtVar.r(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aevtVar.c;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                return false;
            }
            if (obj3 == key && aevtVar.b[i] == iIntValue) {
                aevtVar.r(i);
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

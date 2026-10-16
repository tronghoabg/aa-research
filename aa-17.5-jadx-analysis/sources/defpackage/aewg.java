package defpackage;

import j$.util.Objects;
import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aewg extends aeqw implements Set, aeum {
    final /* synthetic */ aewk a;

    public aewg(aewk aewkVar) {
        this.a = aewkVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aewc(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aewf(this.a, 1);
    }

    public final aety c() {
        return new aewd(this.a);
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
        aewk aewkVar = this.a;
        if (key == null) {
            return aewkVar.d && Objects.equals(aewkVar.b[aewkVar.e], value);
        }
        Object[] objArr = aewkVar.a;
        int iIdentityHashCode = System.identityHashCode(key) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & aewkVar.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (key == obj3) {
            return Objects.equals(aewkVar.b[i], value);
        }
        do {
            i = (i + 1) & aewkVar.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
        } while (key != obj2);
        return Objects.equals(aewkVar.b[i], value);
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aewx> consumer) {
        aewk aewkVar = this.a;
        if (aewkVar.d) {
            consumer.accept(new aewx(aewkVar, aewkVar.e, 1));
        }
        Object[] objArr = aewkVar.a;
        int i = aewkVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                consumer.accept(new aewx(aewkVar, i, 1));
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
        aewk aewkVar = this.a;
        if (key == null) {
            if (!aewkVar.d || !Objects.equals(aewkVar.b[aewkVar.e], value)) {
                return false;
            }
            aewkVar.h();
            return true;
        }
        Object[] objArr = aewkVar.a;
        int iIdentityHashCode = System.identityHashCode(key) * (-1640531527);
        int i = (iIdentityHashCode ^ (iIdentityHashCode >>> 16)) & aewkVar.c;
        Object obj2 = objArr[i];
        if (obj2 == null) {
            return false;
        }
        if (obj2 == key) {
            if (!Objects.equals(aewkVar.b[i], value)) {
                return false;
            }
            aewkVar.g(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aewkVar.c;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                return false;
            }
            if (obj3 == key && Objects.equals(aewkVar.b[i], value)) {
                aewkVar.g(i);
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

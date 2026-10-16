package defpackage;

import j$.util.Objects;
import j$.util.Set;
import j$.util.Spliterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeth extends aeqw implements Set, aesx {
    final /* synthetic */ aetl a;

    public aeth(aetl aetlVar) {
        this.a = aetlVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aetc(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aetf(this.a, 1);
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
        aetl aetlVar = this.a;
        if (key == null) {
            return aetlVar.d && Objects.equals(aetlVar.b[aetlVar.e], value);
        }
        Object[] objArr = aetlVar.a;
        int iHashCode = key.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & aetlVar.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (key.equals(obj3)) {
            return Objects.equals(aetlVar.b[i], value);
        }
        do {
            i = (i + 1) & aetlVar.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
        } while (!key.equals(obj2));
        return Objects.equals(aetlVar.b[i], value);
    }

    @Override // defpackage.aesx
    public final aety d() {
        return new aetd(this.a);
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super aesw> consumer) {
        aetl aetlVar = this.a;
        if (aetlVar.d) {
            consumer.accept(new aetg(aetlVar, aetlVar.e, 0));
        }
        Object[] objArr = aetlVar.a;
        int i = aetlVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                consumer.accept(new aetg(aetlVar, i, 0));
            }
        }
    }

    @Override // defpackage.aesx
    public final void i(Consumer consumer) {
        aetl aetlVar = this.a;
        aetg aetgVar = new aetg(aetlVar, 0, (byte[]) null);
        if (aetlVar.d) {
            aetgVar.a = aetlVar.e;
            consumer.accept(aetgVar);
        }
        Object[] objArr = aetlVar.a;
        int i = aetlVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                aetgVar.a = i;
                consumer.accept(aetgVar);
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
        aetl aetlVar = this.a;
        if (key == null) {
            if (!aetlVar.d || !Objects.equals(aetlVar.b[aetlVar.e], value)) {
                return false;
            }
            aetlVar.h();
            return true;
        }
        Object[] objArr = aetlVar.a;
        int iHashCode = key.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & aetlVar.c;
        Object obj2 = objArr[i];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            if (!Objects.equals(aetlVar.b[i], value)) {
                return false;
            }
            aetlVar.g(i);
            return true;
        }
        while (true) {
            i = (i + 1) & aetlVar.c;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key) && Objects.equals(aetlVar.b[i], value)) {
                aetlVar.g(i);
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

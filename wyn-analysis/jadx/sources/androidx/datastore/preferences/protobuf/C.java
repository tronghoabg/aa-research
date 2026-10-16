package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class C extends AbstractC1384b implements D, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18138b;

    static {
        new C(10).f18185a = false;
    }

    public C(int i5) {
        this(new ArrayList(i5));
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void D(C1390g c1390g) {
        a();
        this.f18138b.add(c1390g);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        a();
        this.f18138b.add(i5, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1384b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f18138b.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1384b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f18138b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        String str;
        ArrayList arrayList = this.f18138b;
        Object obj = arrayList.get(i5);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C1390g)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC1407y.f18274a);
            Q q4 = v0.f18273a;
            if (v0.f18273a.i(bArr, 0, bArr.length) == 0) {
                arrayList.set(i5, str2);
            }
            return str2;
        }
        C1390g c1390g = (C1390g) obj;
        c1390g.getClass();
        Charset charset = AbstractC1407y.f18274a;
        if (c1390g.size() == 0) {
            str = "";
        } else {
            str = new String(c1390g.f18206b, c1390g.b(), c1390g.size(), charset);
        }
        int iB = c1390g.b();
        if (v0.f18273a.i(c1390g.f18206b, iB, c1390g.size() + iB) == 0) {
            arrayList.set(i5, str);
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final Object getRaw(int i5) {
        return this.f18138b.get(i5);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final List getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.f18138b);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final D getUnmodifiableView() {
        return this.f18185a ? new n0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1406x
    public final InterfaceC1406x mutableCopyWithCapacity(int i5) {
        ArrayList arrayList = this.f18138b;
        if (i5 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i5);
        arrayList2.addAll(arrayList);
        return new C(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        Object objRemove = this.f18138b.remove(i5);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C1390g)) {
            return new String((byte[]) objRemove, AbstractC1407y.f18274a);
        }
        C1390g c1390g = (C1390g) objRemove;
        c1390g.getClass();
        Charset charset = AbstractC1407y.f18274a;
        if (c1390g.size() == 0) {
            return "";
        }
        return new String(c1390g.f18206b, c1390g.b(), c1390g.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        a();
        Object obj2 = this.f18138b.set(i5, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C1390g)) {
            return new String((byte[]) obj2, AbstractC1407y.f18274a);
        }
        C1390g c1390g = (C1390g) obj2;
        c1390g.getClass();
        Charset charset = AbstractC1407y.f18274a;
        if (c1390g.size() == 0) {
            return "";
        }
        return new String(c1390g.f18206b, c1390g.b(), c1390g.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18138b.size();
    }

    public C(ArrayList arrayList) {
        this.f18138b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1384b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        a();
        if (collection instanceof D) {
            collection = ((D) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f18138b.addAll(i5, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}

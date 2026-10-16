package androidx.datastore.preferences.protobuf;

import Va.M6;

/* loaded from: classes.dex */
public final class T implements InterfaceC1385b0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1404v f18170a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f18171b;

    /* renamed from: c, reason: collision with root package name */
    public final C1397n f18172c;

    public T(k0 k0Var, C1397n c1397n, AbstractC1404v abstractC1404v) {
        this.f18171b = k0Var;
        c1397n.getClass();
        this.f18172c = c1397n;
        this.f18170a = abstractC1404v;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final void a(Object obj) {
        this.f18171b.getClass();
        ((AbstractC1404v) obj).unknownFields.f18239e = false;
        this.f18172c.getClass();
        M6.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final boolean b(Object obj) {
        this.f18172c.getClass();
        M6.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final void c(Object obj, J j8) {
        this.f18172c.getClass();
        M6.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final int d(AbstractC1382a abstractC1382a) {
        this.f18171b.getClass();
        j0 j0Var = ((AbstractC1404v) abstractC1382a).unknownFields;
        int i5 = j0Var.f18238d;
        if (i5 != -1) {
            return i5;
        }
        int iR = 0;
        for (int i10 = 0; i10 < j0Var.f18235a; i10++) {
            int i11 = j0Var.f18236b[i10] >>> 3;
            iR += C1393j.r(3, (C1390g) j0Var.f18237c[i10]) + C1393j.z(i11) + C1393j.y(2) + (C1393j.y(1) * 2);
        }
        j0Var.f18238d = iR;
        return iR;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final void e(Object obj, G4.f fVar, C1396m c1396m) {
        this.f18171b.getClass();
        AbstractC1404v abstractC1404v = (AbstractC1404v) obj;
        if (abstractC1404v.unknownFields == j0.f18234f) {
            abstractC1404v.unknownFields = j0.b();
        }
        this.f18172c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final void f(AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2) {
        c0.x(this.f18171b, abstractC1404v, abstractC1404v2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final int g(AbstractC1404v abstractC1404v) {
        this.f18171b.getClass();
        return abstractC1404v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final boolean h(AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2) {
        this.f18171b.getClass();
        return abstractC1404v.unknownFields.equals(abstractC1404v2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final Object newInstance() {
        return ((AbstractC1402t) this.f18170a.d(5)).b();
    }
}

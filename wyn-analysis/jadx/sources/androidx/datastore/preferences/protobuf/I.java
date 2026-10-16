package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class I implements P {

    /* renamed from: a, reason: collision with root package name */
    public P[] f18142a;

    @Override // androidx.datastore.preferences.protobuf.P
    public final C1383a0 a(Class cls) {
        for (P p10 : this.f18142a) {
            if (p10.b(cls)) {
                return p10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean b(Class cls) {
        for (P p10 : this.f18142a) {
            if (p10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}

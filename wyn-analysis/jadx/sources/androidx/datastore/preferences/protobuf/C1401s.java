package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401s implements P {

    /* renamed from: b, reason: collision with root package name */
    public static final C1401s f18259b = new C1401s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18260a;

    public /* synthetic */ C1401s(int i5) {
        this.f18260a = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final C1383a0 a(Class cls) {
        switch (this.f18260a) {
            case 0:
                if (!AbstractC1404v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1383a0) AbstractC1404v.e(cls.asSubclass(AbstractC1404v.class)).d(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean b(Class cls) {
        switch (this.f18260a) {
            case 0:
                return AbstractC1404v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

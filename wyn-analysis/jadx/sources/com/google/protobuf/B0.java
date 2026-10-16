package com.google.protobuf;

/* loaded from: classes4.dex */
public final class B0 implements InterfaceC1802h1 {

    /* renamed from: b, reason: collision with root package name */
    public static final B0 f27520b = new B0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27521a;

    public /* synthetic */ B0(int i5) {
        this.f27521a = i5;
    }

    @Override // com.google.protobuf.InterfaceC1802h1
    public final InterfaceC1799g1 a(Class cls) {
        switch (this.f27521a) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (InterfaceC1799g1) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.InterfaceC1802h1
    public final boolean b(Class cls) {
        switch (this.f27521a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

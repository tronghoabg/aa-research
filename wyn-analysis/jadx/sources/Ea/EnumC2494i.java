package ea;

import j9.InterfaceC3096f;

/* renamed from: ea.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC2494i implements InterfaceC3096f {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f34556a;

    EnumC2494i(int i5) {
        this.f34556a = i5;
    }

    @Override // j9.InterfaceC3096f
    public final int getNumber() {
        return this.f34556a;
    }
}

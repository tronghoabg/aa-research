package ea;

import j9.InterfaceC3096f;

/* renamed from: ea.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC2496k implements InterfaceC3096f {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* renamed from: a, reason: collision with root package name */
    public final int f34562a;

    EnumC2496k(int i5) {
        this.f34562a = i5;
    }

    @Override // j9.InterfaceC3096f
    public final int getNumber() {
        return this.f34562a;
    }
}

package ea;

import j9.InterfaceC3096f;

/* renamed from: ea.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC2503s implements InterfaceC3096f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f34579a;

    EnumC2503s(int i5) {
        this.f34579a = i5;
    }

    @Override // j9.InterfaceC3096f
    public final int getNumber() {
        return this.f34579a;
    }
}

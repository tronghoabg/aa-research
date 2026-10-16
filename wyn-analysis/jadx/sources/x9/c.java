package X9;

/* loaded from: classes4.dex */
public enum c implements k9.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f16200a;

    c(int i5) {
        this.f16200a = i5;
    }

    @Override // k9.c
    public final int getNumber() {
        return this.f16200a;
    }
}

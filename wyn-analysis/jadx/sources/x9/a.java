package X9;

/* loaded from: classes4.dex */
public enum a implements k9.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f16193a;

    a(int i5) {
        this.f16193a = i5;
    }

    @Override // k9.c
    public final int getNumber() {
        return this.f16193a;
    }
}

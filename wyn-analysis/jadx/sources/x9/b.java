package X9;

/* loaded from: classes4.dex */
public enum b implements k9.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f16197a;

    b(int i5) {
        this.f16197a = i5;
    }

    @Override // k9.c
    public final int getNumber() {
        return this.f16197a;
    }
}

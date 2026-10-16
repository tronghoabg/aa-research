package w5;

/* renamed from: w5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4363c implements k9.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f47295a;

    EnumC4363c(int i5) {
        this.f47295a = i5;
    }

    @Override // k9.c
    public final int getNumber() {
        return this.f47295a;
    }
}

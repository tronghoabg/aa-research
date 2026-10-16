package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ozl {
    SUPPORTED(true),
    NOT_SUPPORTED(false),
    NOT_BONDED(false),
    UNKNOWN_AND_TRY_RFCOMM(false),
    UNKNOWN_AND_DONT_TRY_RFCOMM(false);

    public final boolean f;

    ozl(boolean z) {
        this.f = z;
    }
}

package defpackage;

/* loaded from: classes2.dex */
public enum oyn {
    SUPPORTED(true),
    NOT_SUPPORTED(false),
    NOT_BONDED(false),
    UNKNOWN_AND_TRY_RFCOMM(false),
    UNKNOWN_AND_DONT_TRY_RFCOMM(false);

    public final boolean f;

    oyn(boolean z) {
        this.f = z;
    }
}

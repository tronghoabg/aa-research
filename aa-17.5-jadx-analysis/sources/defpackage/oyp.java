package defpackage;

/* loaded from: classes2.dex */
public enum oyp {
    DONT_REQUEST(false),
    REQUEST_AND_IGNORE_RESULT(true),
    REQUEST_AND_WAIT_FOR_UUID(true);

    public final boolean d;

    oyp(boolean z) {
        this.d = z;
    }
}

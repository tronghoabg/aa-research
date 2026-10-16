package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ozn {
    DONT_REQUEST(false),
    REQUEST_AND_IGNORE_RESULT(true),
    REQUEST_AND_WAIT_FOR_UUID(true);

    public final boolean d;

    ozn(boolean z) {
        this.d = z;
    }
}

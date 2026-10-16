package defpackage;

/* loaded from: classes.dex */
public final class buu extends IllegalStateException {
    private final String a;

    public buu(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class zoe extends Exception {
    public final int a;

    public zoe(int i, String str) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = this.a;
        return "Error type: " + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE") + ". " + getMessage();
    }
}

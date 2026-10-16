package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zpg extends java.lang.Exception {
    public final int a;

    public zpg(int i, java.lang.String str) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.a;
        if (i == 1) {
            str = "INVALID_COUNTRY_CODE";
        } else if (i == 2) {
            str = "NOT_A_NUMBER";
        } else if (i == 3) {
            str = "TOO_SHORT_AFTER_IDD";
        } else if (i != 4) {
            str = i != 5 ? "null" : "TOO_LONG";
        } else {
            str = "TOO_SHORT_NSN";
        }
        return "Error type: " + str + ". " + getMessage();
    }
}

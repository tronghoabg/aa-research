package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum akdb {
    UNSET(0),
    TRUE(1),
    FALSE(2);

    public final int d;

    akdb(int i) {
        this.d = i;
    }

    public static defpackage.akdb a(java.lang.Boolean bool) {
        if (bool == null) {
            return UNSET;
        }
        return bool.booleanValue() ? TRUE : FALSE;
    }
}

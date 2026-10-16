package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum xid implements defpackage.abpb {
    ACTION_UNKNOWN(0),
    ACTION_RESIZE_TO_SMALLER(1),
    ACTION_RESIZE_TO_LARGER(2);

    public final int d;

    xid(int i) {
        this.d = i;
    }

    public static defpackage.xid b(int i) {
        if (i == 0) {
            return ACTION_UNKNOWN;
        }
        if (i == 1) {
            return ACTION_RESIZE_TO_SMALLER;
        }
        if (i != 2) {
            return null;
        }
        return ACTION_RESIZE_TO_LARGER;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ysy {
    public static final java.util.Comparator a = new defpackage.azq(11);
    public static final defpackage.ysy b = new defpackage.ysy(new defpackage.ysw(java.util.Collections.EMPTY_LIST));
    public final defpackage.ysw c;

    public ysy(defpackage.ysw yswVar) {
        this.c = yswVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ysy) && ((defpackage.ysy) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final java.lang.String toString() {
        return this.c.toString();
    }
}

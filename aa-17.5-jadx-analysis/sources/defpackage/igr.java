package defpackage;

/* loaded from: classes2.dex */
public final class igr extends ihz {
    public static final igr a = new igr(0);
    public final int b;

    public igr(int i) {
        this.b = i;
    }

    public final String toString() {
        return String.format("#%06x", Integer.valueOf(this.b));
    }
}

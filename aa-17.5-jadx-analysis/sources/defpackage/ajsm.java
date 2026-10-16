package defpackage;

/* loaded from: classes2.dex */
public final class ajsm implements Cloneable {
    public static final ajsm a = new ajsm(-1, -1);
    public final int b;
    public final int c;

    public ajsm(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (ajsm) super.clone();
    }

    public final String toString() {
        return "[maxLineLength=" + this.b + ", maxHeaderCount=" + this.c + "]";
    }
}

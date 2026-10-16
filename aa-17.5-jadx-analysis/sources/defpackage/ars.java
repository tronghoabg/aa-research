package defpackage;

/* loaded from: classes.dex */
public final class ars implements art {
    private final /* synthetic */ int c;
    public static final ars b = new ars(1);
    public static final ars a = new ars(0);

    private ars(int i) {
        this.c = i;
    }

    @Override // defpackage.art
    public final int a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.c != 0) {
            return ((i - i3) - i4) - i2;
        }
        return 0;
    }

    public final String toString() {
        return this.c != 0 ? "End" : "Start";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class arx implements defpackage.ary {
    private final /* synthetic */ int c;
    public static final defpackage.arx b = new defpackage.arx(1);
    public static final defpackage.arx a = new defpackage.arx(0);

    private arx(int i) {
        this.c = i;
    }

    @Override // defpackage.ary
    public final int a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.c != 0) {
            return ((i - i3) - i4) - i2;
        }
        return 0;
    }

    public final java.lang.String toString() {
        return this.c != 0 ? "End" : "Start";
    }
}

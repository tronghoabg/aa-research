package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class czm implements defpackage.czr {
    protected java.lang.String a;
    private final int[] b = new int[2];

    protected final java.lang.String a() {
        java.lang.String str = this.a;
        if (str != null) {
            return str;
        }
        defpackage.afga.d("text");
        return null;
    }

    protected final int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }
}

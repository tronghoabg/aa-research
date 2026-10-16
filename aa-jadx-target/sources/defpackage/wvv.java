package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wvv implements wvh {
    final int a;
    final defpackage.wvi b;
    final int[][] c;
    final defpackage.wvi[] d;

    public wvv(wvu wvuVar) {
        this.a = wvuVar.a;
        this.b = (defpackage.wvi) wvuVar.b;
        this.c = (int[][]) wvuVar.c;
        this.d = (defpackage.wvi[]) wvuVar.d;
    }

    public static defpackage.wvv g(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && j$.util.Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new wvu(context, resourceId).a();
        }
        return null;
    }

    private final int h(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (android.util.StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public final defpackage.wvi a() {
        return this.b;
    }

    public final defpackage.wvi b(int[] iArr) {
        int iH = h(iArr);
        if (iH < 0) {
            iH = h(android.util.StateSet.WILD_CARD);
        }
        return this.d[iH];
    }

    public final defpackage.wvi c(float f) {
        return this.b.c(f);
    }

    public final defpackage.wvi d(wuy wuyVar) {
        return this.b.d(wuyVar);
    }

    public final boolean e() {
        return this.a > 1;
    }

    public final defpackage.wvi[] f() {
        return this.d;
    }
}

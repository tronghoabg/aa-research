package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uxg {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/renderer/TextureAtlasUploadManager");
    public final java.lang.String b;
    public defpackage.uuz c;
    public final int f;
    public int d = 0;
    public int g = 0;
    public int i = 0;
    public int j = 0;
    public final defpackage.uva[] e = new defpackage.uva[1];
    public final int[] h = new int[1];

    public uxg(java.lang.String str, int i) {
        this.b = str;
        this.f = i;
        char c = 0;
        while (true) {
            defpackage.uva[] uvaVarArr = this.e;
            if (c > 0) {
                return;
            }
            this.h[0] = 0;
            uvaVarArr[0] = defpackage.uva.a;
            c = 1;
        }
    }

    public final defpackage.uva a() {
        return this.e[0];
    }
}

package defpackage;

/* loaded from: classes3.dex */
final class uwj {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/renderer/TextureAtlasUploadManager");
    public final String b;
    public uud c;
    public final int f;
    public int d = 0;
    public int g = 0;
    public int i = 0;
    public int j = 0;
    public final uue[] e = new uue[1];
    public final int[] h = new int[1];

    public uwj(String str, int i) {
        this.b = str;
        this.f = i;
        char c = 0;
        while (true) {
            uue[] uueVarArr = this.e;
            if (c > 0) {
                return;
            }
            this.h[0] = 0;
            uueVarArr[0] = uue.a;
            c = 1;
        }
    }

    public final uue a() {
        return this.e[0];
    }
}

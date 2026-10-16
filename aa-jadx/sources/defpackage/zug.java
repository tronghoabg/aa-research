package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zug {
    public static final /* synthetic */ int d = 0;
    private static final java.util.Set e = new java.util.HashSet(java.util.Arrays.asList("anthias", "carp", "smelt", "sparrow", "sprat", "tetra", "wren"));
    public boolean a = false;
    public final boolean b;
    public final defpackage.erh c;

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public zug(defpackage.erh erhVar) {
        this.c = erhVar;
        if (erhVar.a.contains("IsLowBitDisplay")) {
            this.b = erhVar.a.getBoolean("IsLowBitDisplay", false);
        } else {
            this.b = e.contains(android.os.Build.DEVICE);
        }
    }

    public final void a() {
        this.a = false;
    }
}

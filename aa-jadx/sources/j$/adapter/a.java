package j$.adapter;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        try {
            java.lang.Class.forName("java.util.StringJoiner");
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        try {
            java.lang.Class.forName("java.nio.file.FileSystems");
            z2 = true;
        } catch (java.lang.ClassNotFoundException unused2) {
            z2 = false;
        }
        b = z2;
        try {
            java.lang.Class.forName("android.os.Build");
            z3 = true;
        } catch (java.lang.ClassNotFoundException unused3) {
        }
        c = z3;
    }
}

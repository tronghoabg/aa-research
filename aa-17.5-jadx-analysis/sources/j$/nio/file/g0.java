package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class g0 implements v {
    public static final g0 APPEND;
    public static final g0 CREATE;
    public static final g0 CREATE_NEW;
    public static final g0 DELETE_ON_CLOSE;
    public static final g0 DSYNC;
    public static final g0 READ;
    public static final g0 SPARSE;
    public static final g0 SYNC;
    public static final g0 TRUNCATE_EXISTING;
    public static final g0 WRITE;
    public static final /* synthetic */ g0[] a;

    static {
        g0 g0Var = new g0("READ", 0);
        READ = g0Var;
        g0 g0Var2 = new g0("WRITE", 1);
        WRITE = g0Var2;
        g0 g0Var3 = new g0("APPEND", 2);
        APPEND = g0Var3;
        g0 g0Var4 = new g0("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = g0Var4;
        g0 g0Var5 = new g0("CREATE", 4);
        CREATE = g0Var5;
        g0 g0Var6 = new g0("CREATE_NEW", 5);
        CREATE_NEW = g0Var6;
        g0 g0Var7 = new g0("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = g0Var7;
        g0 g0Var8 = new g0("SPARSE", 7);
        SPARSE = g0Var8;
        g0 g0Var9 = new g0("SYNC", 8);
        SYNC = g0Var9;
        g0 g0Var10 = new g0("DSYNC", 9);
        DSYNC = g0Var10;
        a = new g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) a.clone();
    }
}

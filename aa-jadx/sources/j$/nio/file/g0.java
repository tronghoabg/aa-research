package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements j$.nio.file.v {
    public static final j$.nio.file.g0 APPEND;
    public static final j$.nio.file.g0 CREATE;
    public static final j$.nio.file.g0 CREATE_NEW;
    public static final j$.nio.file.g0 DELETE_ON_CLOSE;
    public static final j$.nio.file.g0 DSYNC;
    public static final j$.nio.file.g0 READ;
    public static final j$.nio.file.g0 SPARSE;
    public static final j$.nio.file.g0 SYNC;
    public static final j$.nio.file.g0 TRUNCATE_EXISTING;
    public static final j$.nio.file.g0 WRITE;
    public static final /* synthetic */ j$.nio.file.g0[] a;

    static {
        j$.nio.file.g0 g0Var = new j$.nio.file.g0("READ", 0);
        READ = g0Var;
        j$.nio.file.g0 g0Var2 = new j$.nio.file.g0("WRITE", 1);
        WRITE = g0Var2;
        j$.nio.file.g0 g0Var3 = new j$.nio.file.g0("APPEND", 2);
        APPEND = g0Var3;
        j$.nio.file.g0 g0Var4 = new j$.nio.file.g0("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = g0Var4;
        j$.nio.file.g0 g0Var5 = new j$.nio.file.g0("CREATE", 4);
        CREATE = g0Var5;
        j$.nio.file.g0 g0Var6 = new j$.nio.file.g0("CREATE_NEW", 5);
        CREATE_NEW = g0Var6;
        j$.nio.file.g0 g0Var7 = new j$.nio.file.g0("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = g0Var7;
        j$.nio.file.g0 g0Var8 = new j$.nio.file.g0("SPARSE", 7);
        SPARSE = g0Var8;
        j$.nio.file.g0 g0Var9 = new j$.nio.file.g0("SYNC", 8);
        SYNC = g0Var9;
        j$.nio.file.g0 g0Var10 = new j$.nio.file.g0("DSYNC", 9);
        DSYNC = g0Var10;
        a = new j$.nio.file.g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10};
    }

    public static j$.nio.file.g0 valueOf(java.lang.String str) {
        return (j$.nio.file.g0) java.lang.Enum.valueOf(j$.nio.file.g0.class, str);
    }

    public static j$.nio.file.g0[] values() {
        return (j$.nio.file.g0[]) a.clone();
    }
}

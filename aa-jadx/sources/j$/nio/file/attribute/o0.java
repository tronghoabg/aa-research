package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {
    public static final j$.nio.file.attribute.o0 GROUP_EXECUTE;
    public static final j$.nio.file.attribute.o0 GROUP_READ;
    public static final j$.nio.file.attribute.o0 GROUP_WRITE;
    public static final j$.nio.file.attribute.o0 OTHERS_EXECUTE;
    public static final j$.nio.file.attribute.o0 OTHERS_READ;
    public static final j$.nio.file.attribute.o0 OTHERS_WRITE;
    public static final j$.nio.file.attribute.o0 OWNER_EXECUTE;
    public static final j$.nio.file.attribute.o0 OWNER_READ;
    public static final j$.nio.file.attribute.o0 OWNER_WRITE;
    public static final /* synthetic */ j$.nio.file.attribute.o0[] a;

    static {
        j$.nio.file.attribute.o0 o0Var = new j$.nio.file.attribute.o0("OWNER_READ", 0);
        OWNER_READ = o0Var;
        j$.nio.file.attribute.o0 o0Var2 = new j$.nio.file.attribute.o0("OWNER_WRITE", 1);
        OWNER_WRITE = o0Var2;
        j$.nio.file.attribute.o0 o0Var3 = new j$.nio.file.attribute.o0("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = o0Var3;
        j$.nio.file.attribute.o0 o0Var4 = new j$.nio.file.attribute.o0("GROUP_READ", 3);
        GROUP_READ = o0Var4;
        j$.nio.file.attribute.o0 o0Var5 = new j$.nio.file.attribute.o0("GROUP_WRITE", 4);
        GROUP_WRITE = o0Var5;
        j$.nio.file.attribute.o0 o0Var6 = new j$.nio.file.attribute.o0("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = o0Var6;
        j$.nio.file.attribute.o0 o0Var7 = new j$.nio.file.attribute.o0("OTHERS_READ", 6);
        OTHERS_READ = o0Var7;
        j$.nio.file.attribute.o0 o0Var8 = new j$.nio.file.attribute.o0("OTHERS_WRITE", 7);
        OTHERS_WRITE = o0Var8;
        j$.nio.file.attribute.o0 o0Var9 = new j$.nio.file.attribute.o0("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = o0Var9;
        a = new j$.nio.file.attribute.o0[]{o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8, o0Var9};
    }

    public static j$.nio.file.attribute.o0 valueOf(java.lang.String str) {
        return (j$.nio.file.attribute.o0) java.lang.Enum.valueOf(j$.nio.file.attribute.o0.class, str);
    }

    public static j$.nio.file.attribute.o0[] values() {
        return (j$.nio.file.attribute.o0[]) a.clone();
    }
}

package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o0 {
    public static final o0 GROUP_EXECUTE;
    public static final o0 GROUP_READ;
    public static final o0 GROUP_WRITE;
    public static final o0 OTHERS_EXECUTE;
    public static final o0 OTHERS_READ;
    public static final o0 OTHERS_WRITE;
    public static final o0 OWNER_EXECUTE;
    public static final o0 OWNER_READ;
    public static final o0 OWNER_WRITE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ o0[] f49724a;

    static {
        o0 o0Var = new o0("OWNER_READ", 0);
        OWNER_READ = o0Var;
        o0 o0Var2 = new o0("OWNER_WRITE", 1);
        OWNER_WRITE = o0Var2;
        o0 o0Var3 = new o0("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = o0Var3;
        o0 o0Var4 = new o0("GROUP_READ", 3);
        GROUP_READ = o0Var4;
        o0 o0Var5 = new o0("GROUP_WRITE", 4);
        GROUP_WRITE = o0Var5;
        o0 o0Var6 = new o0("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = o0Var6;
        o0 o0Var7 = new o0("OTHERS_READ", 6);
        OTHERS_READ = o0Var7;
        o0 o0Var8 = new o0("OTHERS_WRITE", 7);
        OTHERS_WRITE = o0Var8;
        o0 o0Var9 = new o0("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = o0Var9;
        f49724a = new o0[]{o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8, o0Var9};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f49724a.clone();
    }
}

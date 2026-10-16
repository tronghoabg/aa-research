package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class y implements n {
    public static final y APPEND;
    public static final y CREATE;
    public static final y CREATE_NEW;
    public static final y DELETE_ON_CLOSE;
    public static final y DSYNC;
    public static final y READ;
    public static final y SPARSE;
    public static final y SYNC;
    public static final y TRUNCATE_EXISTING;
    public static final y WRITE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ y[] f49783a;

    static {
        y yVar = new y("READ", 0);
        READ = yVar;
        y yVar2 = new y("WRITE", 1);
        WRITE = yVar2;
        y yVar3 = new y("APPEND", 2);
        APPEND = yVar3;
        y yVar4 = new y("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = yVar4;
        y yVar5 = new y("CREATE", 4);
        CREATE = yVar5;
        y yVar6 = new y("CREATE_NEW", 5);
        CREATE_NEW = yVar6;
        y yVar7 = new y("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = yVar7;
        y yVar8 = new y("SPARSE", 7);
        SPARSE = yVar8;
        y yVar9 = new y("SYNC", 8);
        SYNC = yVar9;
        y yVar10 = new y("DSYNC", 9);
        DSYNC = yVar10;
        f49783a = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f49783a.clone();
    }
}

package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class b {
    public static final b EXECUTE;
    public static final b READ;
    public static final b WRITE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f49740a;

    static {
        b bVar = new b("READ", 0);
        READ = bVar;
        b bVar2 = new b("WRITE", 1);
        WRITE = bVar2;
        b bVar3 = new b("EXECUTE", 2);
        EXECUTE = bVar3;
        f49740a = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49740a.clone();
    }
}

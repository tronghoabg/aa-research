package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static final j$.nio.file.b EXECUTE;
    public static final j$.nio.file.b READ;
    public static final j$.nio.file.b WRITE;
    public static final /* synthetic */ j$.nio.file.b[] a;

    static {
        j$.nio.file.b bVar = new j$.nio.file.b("READ", 0);
        READ = bVar;
        j$.nio.file.b bVar2 = new j$.nio.file.b("WRITE", 1);
        WRITE = bVar2;
        j$.nio.file.b bVar3 = new j$.nio.file.b("EXECUTE", 2);
        EXECUTE = bVar3;
        a = new j$.nio.file.b[]{bVar, bVar2, bVar3};
    }

    public static j$.nio.file.b valueOf(java.lang.String str) {
        return (j$.nio.file.b) java.lang.Enum.valueOf(j$.nio.file.b.class, str);
    }

    public static j$.nio.file.b[] values() {
        return (j$.nio.file.b[]) a.clone();
    }
}

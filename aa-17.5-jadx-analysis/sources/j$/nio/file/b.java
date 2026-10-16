package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class b {
    public static final b EXECUTE;
    public static final b READ;
    public static final b WRITE;
    public static final /* synthetic */ b[] a;

    static {
        b bVar = new b("READ", 0);
        READ = bVar;
        b bVar2 = new b("WRITE", 1);
        WRITE = bVar2;
        b bVar3 = new b("EXECUTE", 2);
        EXECUTE = bVar3;
        a = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) a.clone();
    }
}

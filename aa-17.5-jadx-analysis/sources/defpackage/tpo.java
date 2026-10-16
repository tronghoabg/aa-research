package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class tpo {
    public static final tpo a;
    public static final tpo b;
    private static final /* synthetic */ tpo[] c;

    static {
        ulx ulxVar = ulx.a;
        tpo tpoVar = new tpo("LEGACY_AMBIENT", 0);
        a = tpoVar;
        tpo tpoVar2 = new tpo("AMBIENT_2", 1);
        b = tpoVar2;
        c = new tpo[]{tpoVar, tpoVar2};
    }

    public static tpo valueOf(String str) {
        return (tpo) Enum.valueOf(tpo.class, str);
    }

    public static tpo[] values() {
        return (tpo[]) c.clone();
    }
}

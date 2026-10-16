package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class p {
    public static final p END_DIRECTORY;
    public static final p ENTRY;
    public static final p START_DIRECTORY;
    public static final /* synthetic */ p[] a;

    static {
        p pVar = new p("START_DIRECTORY", 0);
        START_DIRECTORY = pVar;
        p pVar2 = new p("END_DIRECTORY", 1);
        END_DIRECTORY = pVar2;
        p pVar3 = new p("ENTRY", 2);
        ENTRY = pVar3;
        a = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) a.clone();
    }
}

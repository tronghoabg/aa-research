package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public static final j$.nio.file.p END_DIRECTORY;
    public static final j$.nio.file.p ENTRY;
    public static final j$.nio.file.p START_DIRECTORY;
    public static final /* synthetic */ j$.nio.file.p[] a;

    static {
        j$.nio.file.p pVar = new j$.nio.file.p("START_DIRECTORY", 0);
        START_DIRECTORY = pVar;
        j$.nio.file.p pVar2 = new j$.nio.file.p("END_DIRECTORY", 1);
        END_DIRECTORY = pVar2;
        j$.nio.file.p pVar3 = new j$.nio.file.p("ENTRY", 2);
        ENTRY = pVar3;
        a = new j$.nio.file.p[]{pVar, pVar2, pVar3};
    }

    public static j$.nio.file.p valueOf(java.lang.String str) {
        return (j$.nio.file.p) java.lang.Enum.valueOf(j$.nio.file.p.class, str);
    }

    public static j$.nio.file.p[] values() {
        return (j$.nio.file.p[]) a.clone();
    }
}

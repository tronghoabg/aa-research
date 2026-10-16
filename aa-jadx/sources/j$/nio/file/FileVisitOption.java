package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class FileVisitOption {
    public static final j$.nio.file.FileVisitOption FOLLOW_LINKS;
    public static final /* synthetic */ j$.nio.file.FileVisitOption[] a;

    static {
        j$.nio.file.FileVisitOption fileVisitOption = new j$.nio.file.FileVisitOption("FOLLOW_LINKS", 0);
        FOLLOW_LINKS = fileVisitOption;
        a = new j$.nio.file.FileVisitOption[]{fileVisitOption};
    }

    public static j$.nio.file.FileVisitOption valueOf(java.lang.String str) {
        return (j$.nio.file.FileVisitOption) java.lang.Enum.valueOf(j$.nio.file.FileVisitOption.class, str);
    }

    public static j$.nio.file.FileVisitOption[] values() {
        return (j$.nio.file.FileVisitOption[]) a.clone();
    }
}

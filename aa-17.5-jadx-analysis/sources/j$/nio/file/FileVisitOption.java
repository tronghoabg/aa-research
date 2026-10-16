package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class FileVisitOption {
    public static final FileVisitOption FOLLOW_LINKS;
    public static final /* synthetic */ FileVisitOption[] a;

    static {
        FileVisitOption fileVisitOption = new FileVisitOption("FOLLOW_LINKS", 0);
        FOLLOW_LINKS = fileVisitOption;
        a = new FileVisitOption[]{fileVisitOption};
    }

    public static FileVisitOption valueOf(String str) {
        return (FileVisitOption) Enum.valueOf(FileVisitOption.class, str);
    }

    public static FileVisitOption[] values() {
        return (FileVisitOption[]) a.clone();
    }
}

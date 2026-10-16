package j$.nio.file;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FileVisitOption.values().length];
        a = iArr;
        try {
            iArr[FileVisitOption.FOLLOW_LINKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}

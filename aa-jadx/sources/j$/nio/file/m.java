package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[j$.nio.file.FileVisitOption.values().length];
        a = iArr;
        try {
            iArr[j$.nio.file.FileVisitOption.FOLLOW_LINKS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
    }
}

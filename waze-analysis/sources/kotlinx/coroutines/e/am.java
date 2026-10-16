package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class am {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51870a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f51871b = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f51871b;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}

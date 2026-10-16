package j$.time;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void b(String str, int i) {
        throw new DateTimeException(str + i);
    }

    public static /* synthetic */ void c(String str, int i, Object obj) {
        throw new DateTimeException(str + i + obj);
    }

    public static /* synthetic */ void d(String str, Object[] objArr) {
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static /* synthetic */ void e(String str) {
        throw new j$.time.temporal.p(str);
    }

    public static /* synthetic */ void f(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void g(String str) {
        throw new DateTimeException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(String str, int i) {
        throw new IllegalArgumentException(str + ((char) i));
    }
}

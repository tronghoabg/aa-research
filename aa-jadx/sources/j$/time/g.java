package j$.time;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static /* synthetic */ void b(java.lang.String str, int i) {
        throw new j$.time.DateTimeException(str + i);
    }

    public static /* synthetic */ void c(java.lang.String str, int i, java.lang.Object obj) {
        throw new j$.time.DateTimeException(str + i + obj);
    }

    public static /* synthetic */ void d(java.lang.String str, java.lang.Object[] objArr) {
        throw new java.lang.IllegalStateException(java.lang.String.format(str, objArr));
    }

    public static /* synthetic */ void e(java.lang.String str) {
        throw new j$.time.temporal.o(str);
    }

    public static /* synthetic */ void f(java.lang.String str, int i) {
        throw new java.lang.IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void g(java.lang.String str) {
        throw new j$.time.DateTimeException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(java.lang.String str, int i) {
        throw new java.lang.IllegalArgumentException(str + ((char) i));
    }
}

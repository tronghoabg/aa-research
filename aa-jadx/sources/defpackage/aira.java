package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aira {
    private static final j$.util.concurrent.ConcurrentHashMap<defpackage.afer<?>, java.lang.Object> constantMap = new j$.util.concurrent.ConcurrentHashMap<>();

    public static final java.lang.Void shouldNotBeCalled(java.lang.String str) {
        str.getClass();
        throw new java.lang.IllegalStateException(str);
    }

    public static /* synthetic */ java.lang.Void shouldNotBeCalled$default(java.lang.String str, int i, java.lang.Object obj) {
        if (1 == (i & 1)) {
            str = "should not be called";
        }
        return shouldNotBeCalled(str);
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class aiqa {
    private static final ConcurrentHashMap<afdr<?>, Object> constantMap = new ConcurrentHashMap<>();

    public static final Void shouldNotBeCalled(String str) {
        str.getClass();
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ Void shouldNotBeCalled$default(String str, int i, Object obj) {
        if (1 == (i & 1)) {
            str = "should not be called";
        }
        return shouldNotBeCalled(str);
    }
}

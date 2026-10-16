package defpackage;

/* loaded from: classes3.dex */
public final class aipl {
    private static final afec<Object, Object> IDENTITY = aipf.INSTANCE;
    private static final afec<Object, Boolean> ALWAYS_TRUE = aipg.INSTANCE;
    private static final afec<Object, Object> ALWAYS_NULL = aipk.INSTANCE;
    private static final afec<Object, afak> DO_NOTHING = aiph.INSTANCE;
    private static final afeg<Object, Object, afak> DO_NOTHING_2 = aipi.INSTANCE;
    private static final afeh<Object, Object, Object, afak> DO_NOTHING_3 = aipj.INSTANCE;

    private static final boolean ALWAYS_TRUE$lambda$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak DO_NOTHING$lambda$0(Object obj) {
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak DO_NOTHING_2$lambda$0(Object obj, Object obj2) {
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak DO_NOTHING_3$lambda$0(Object obj, Object obj2, Object obj3) {
        return afak.a;
    }

    static /* synthetic */ boolean accessor$FunctionsKt$lambda4(Object obj) {
        return true;
    }

    public static final <T> afec<T, Boolean> alwaysTrue() {
        return (afec<T, Boolean>) ALWAYS_TRUE;
    }

    public static final afeh<Object, Object, Object, afak> getDO_NOTHING_3() {
        return DO_NOTHING_3;
    }

    private static final Object IDENTITY$lambda$0(Object obj) {
        return obj;
    }

    static /* synthetic */ Object accessor$FunctionsKt$lambda3(Object obj) {
        return obj;
    }
}

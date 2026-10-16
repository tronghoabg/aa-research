package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final /* synthetic */ class agks extends afey implements afec {
    public static final agks INSTANCE = new agks();

    public agks() {
        super(1, aglc.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
    }

    @Override // defpackage.afec
    public final aglc invoke(Method method) {
        method.getClass();
        return new aglc(method);
    }
}

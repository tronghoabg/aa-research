package defpackage;

import java.lang.reflect.Constructor;

/* loaded from: classes3.dex */
final /* synthetic */ class agkp extends afey implements afec {
    public static final agkp INSTANCE = new agkp();

    public agkp() {
        super(1, agkw.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
    }

    @Override // defpackage.afec
    public final agkw invoke(Constructor<?> constructor) {
        constructor.getClass();
        return new agkw(constructor);
    }
}

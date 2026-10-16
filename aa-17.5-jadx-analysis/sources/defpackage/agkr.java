package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
final /* synthetic */ class agkr extends afey implements afec {
    public static final agkr INSTANCE = new agkr();

    public agkr() {
        super(1, agkz.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
    }

    @Override // defpackage.afec
    public final agkz invoke(Field field) {
        field.getClass();
        return new agkz(field);
    }
}

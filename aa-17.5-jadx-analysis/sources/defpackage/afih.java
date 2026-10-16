package defpackage;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
final /* synthetic */ class afih extends afey implements afec {
    public static final afih a = new afih();

    public afih() {
        super(1, afik.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Type type = (Type) obj;
        type.getClass();
        return afik.a(type);
    }
}

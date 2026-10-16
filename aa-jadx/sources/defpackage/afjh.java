package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class afjh extends defpackage.affy implements defpackage.affc {
    public static final defpackage.afjh a = new defpackage.afjh();

    public afjh() {
        super(1, defpackage.afjk.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        java.lang.reflect.Type type = (java.lang.reflect.Type) obj;
        type.getClass();
        return defpackage.afjk.a(type);
    }
}

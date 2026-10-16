package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class afjj extends defpackage.affy implements defpackage.affc {
    public static final defpackage.afjj a = new defpackage.afjj();

    public afjj() {
        super(1, java.lang.Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Class cls = (java.lang.Class) obj;
        cls.getClass();
        return cls.getComponentType();
    }
}

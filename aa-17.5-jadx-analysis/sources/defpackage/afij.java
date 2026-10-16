package defpackage;

/* loaded from: classes3.dex */
final /* synthetic */ class afij extends afey implements afec {
    public static final afij a = new afij();

    public afij() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Class cls = (Class) obj;
        cls.getClass();
        return cls.getComponentType();
    }
}

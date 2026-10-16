package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class aglp extends defpackage.affy implements defpackage.affc {
    public static final defpackage.aglp INSTANCE = new defpackage.aglp();

    public aglp() {
        super(1, defpackage.aglw.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
    }

    @Override // defpackage.affc
    public final defpackage.aglw invoke(java.lang.reflect.Constructor<?> constructor) {
        constructor.getClass();
        return new defpackage.aglw(constructor);
    }
}

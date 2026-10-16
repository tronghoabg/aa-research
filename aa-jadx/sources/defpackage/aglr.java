package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class aglr extends defpackage.affy implements defpackage.affc {
    public static final defpackage.aglr INSTANCE = new defpackage.aglr();

    public aglr() {
        super(1, defpackage.aglz.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
    }

    @Override // defpackage.affc
    public final defpackage.aglz invoke(java.lang.reflect.Field field) {
        field.getClass();
        return new defpackage.aglz(field);
    }
}

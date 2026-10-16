package defpackage;

/* loaded from: classes3.dex */
final class afjv implements afeg {
    private final ClassLoader arg$0;
    private final afvq arg$1;
    private final afdr arg$2;
    private final affv arg$3;

    public afjv(ClassLoader classLoader, afvq afvqVar, afdr afdrVar, affv affvVar) {
        this.arg$0 = classLoader;
        this.arg$1 = afvqVar;
        this.arg$2 = afdrVar;
        this.arg$3 = affvVar;
    }

    @Override // defpackage.afeg
    public Object invoke(Object obj, Object obj2) {
        return afjz.toKType$lambda$2(this.arg$0, this.arg$1, this.arg$2, this.arg$3, ((Number) obj).intValue(), (agop) obj2);
    }
}

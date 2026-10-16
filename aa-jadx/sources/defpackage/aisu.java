package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aisu extends defpackage.affy implements defpackage.affc {
    public static final defpackage.aisu a = new defpackage.aisu();

    public aisu() {
        super(1, java.lang.Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Iterable iterable = (java.lang.Iterable) obj;
        iterable.getClass();
        return iterable.iterator();
    }
}

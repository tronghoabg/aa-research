package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class airv extends afey implements afec {
    public static final airv a = new airv();

    public airv() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        iterable.getClass();
        return iterable.iterator();
    }
}

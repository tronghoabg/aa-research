package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aeun implements java.util.function.Supplier {
    private final /* synthetic */ int a;

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.a;
        if (i == 0) {
            return new defpackage.aeuq();
        }
        if (i == 1) {
            return new java.util.ArrayList();
        }
        if (i != 2) {
            return i != 3 ? new defpackage.aeyh() : new defpackage.aevl(16);
        }
        return new defpackage.aevg(null);
    }
}

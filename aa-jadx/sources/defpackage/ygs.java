package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ygs extends defpackage.you {
    private final defpackage.ygw a;

    public ygs(defpackage.ygw ygwVar, int i) {
        super(ygwVar.size(), i);
        this.a = ygwVar;
    }

    @Override // defpackage.you
    public final java.lang.Object a(int i) {
        return this.a.get(i);
    }
}

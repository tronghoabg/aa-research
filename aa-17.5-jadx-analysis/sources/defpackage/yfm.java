package defpackage;

/* loaded from: classes.dex */
final class yfm extends ynp {
    private final yfq a;

    public yfm(yfq yfqVar, int i) {
        super(yfqVar.size(), i);
        this.a = yfqVar;
    }

    @Override // defpackage.ynp
    public final Object a(int i) {
        return this.a.get(i);
    }
}

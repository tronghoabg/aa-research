package defpackage;

/* loaded from: classes.dex */
final class xxt extends xvz {
    final /* synthetic */ xwp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxt(xxx xxxVar, CharSequence charSequence, xwp xwpVar) {
        super(xxxVar, charSequence);
        this.g = xwpVar;
    }

    @Override // defpackage.xvz
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.xvz
    public final int b(int i) {
        return this.g.f(this.b, i);
    }
}

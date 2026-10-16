package defpackage;

/* loaded from: classes2.dex */
class jy extends jx {
    final /* synthetic */ ka b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(ka kaVar) {
        super(kaVar);
        this.b = kaVar;
    }

    @Override // defpackage.jx
    public final void a(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.jx
    public final void b(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}

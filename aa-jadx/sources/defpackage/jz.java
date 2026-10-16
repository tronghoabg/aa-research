package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class jz extends defpackage.jy {
    final /* synthetic */ defpackage.kb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(defpackage.kb kbVar) {
        super(kbVar);
        this.b = kbVar;
    }

    @Override // defpackage.jy
    public final void a(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.jy
    public final void b(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}

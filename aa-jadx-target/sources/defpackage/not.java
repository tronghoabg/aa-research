package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class not extends defpackage.bg implements defpackage.esa {
    final /* synthetic */ defpackage.nou a;
    private final android.content.Context f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public not(defpackage.nou nouVar, android.content.Context context, android.os.Handler handler) {
        super(context, handler);
        this.a = nouVar;
        this.f = context;
    }

    @Override // defpackage.bg, defpackage.be
    public final android.view.View a(int i) {
        return this.a.c.findViewById(i);
    }

    @Override // defpackage.bg
    public final android.view.LayoutInflater c() {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.c);
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom.cloneInContext(this.f);
    }

    @Override // defpackage.bg
    public final /* synthetic */ java.lang.Object e() {
        return this.a;
    }

    @Override // defpackage.esa
    public final defpackage.erz getViewModelStore() {
        return this.a.i;
    }

    @Override // defpackage.bg
    public final boolean o(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Permissions not implemented in AbstractFragmentHost");
    }

    @Override // defpackage.bg
    public final void u(java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("Permissions not implemented in AbstractFragmentHost");
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ebk implements android.view.View.OnApplyWindowInsetsListener {
    defpackage.edf a = null;
    final /* synthetic */ android.view.View b;
    final /* synthetic */ defpackage.eap c;

    public ebk(android.view.View view, defpackage.eap eapVar) {
        this.b = view;
        this.c = eapVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        defpackage.edf edfVarQ = defpackage.edf.q(windowInsets, view);
        if (android.os.Build.VERSION.SDK_INT < 30) {
            defpackage.ebl.d(windowInsets, this.b);
            if (edfVarQ.equals(this.a)) {
                return this.c.a(view, edfVarQ).e();
            }
        }
        this.a = edfVarQ;
        defpackage.edf edfVarA = this.c.a(view, edfVarQ);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return edfVarA.e();
        }
        int[] iArr = defpackage.ebt.a;
        view.requestApplyInsets();
        return edfVarA.e();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jo extends defpackage.ky {
    final /* synthetic */ defpackage.js a;
    final /* synthetic */ android.support.v7.widget.AppCompatSpinner b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(android.support.v7.widget.AppCompatSpinner appCompatSpinner, android.view.View view, defpackage.js jsVar) {
        super(view);
        this.b = appCompatSpinner;
        this.a = jsVar;
    }

    @Override // defpackage.ky
    public final defpackage.hx a() {
        return this.a;
    }

    @Override // defpackage.ky
    public final boolean b() {
        android.support.v7.widget.AppCompatSpinner appCompatSpinner = this.b;
        if (appCompatSpinner.b.u()) {
            return true;
        }
        appCompatSpinner.b();
        return true;
    }
}

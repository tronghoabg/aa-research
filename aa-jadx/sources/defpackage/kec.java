package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kec implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ defpackage.him a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ kec(defpackage.him himVar, int i, int i2) {
        this.c = i2;
        this.a = himVar;
        this.b = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        if (this.c != 0) {
            int i = com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowContainerViewRowImpl.b;
            this.a.b(this.b, z);
        } else {
            int i2 = com.google.android.apps.auto.components.apphost.view.widgets.common.RowContainerViewRowImpl.b;
            this.a.b(this.b, z);
        }
    }
}

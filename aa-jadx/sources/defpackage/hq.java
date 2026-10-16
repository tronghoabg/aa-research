package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hq implements android.widget.PopupWindow.OnDismissListener {
    final /* synthetic */ defpackage.hr a;

    public hq(defpackage.hr hrVar) {
        this.a = hrVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}

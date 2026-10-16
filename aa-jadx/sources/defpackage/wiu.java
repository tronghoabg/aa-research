package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wiu extends android.text.style.ClickableSpan {
    final /* synthetic */ defpackage.wix a;

    public wiu(defpackage.wix wixVar) {
        this.a = wixVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        this.a.a();
    }
}

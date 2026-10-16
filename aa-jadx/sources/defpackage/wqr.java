package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wqr extends defpackage.dzw {
    final /* synthetic */ com.google.android.material.internal.CheckableImageButton a;

    public wqr(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.dzw
    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.dzw
    public final void c(android.view.View view, defpackage.edn ednVar) {
        super.c(view, ednVar);
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.a;
        ednVar.p(checkableImageButton.b);
        ednVar.q(checkableImageButton.a);
    }
}

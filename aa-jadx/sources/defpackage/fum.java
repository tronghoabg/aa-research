package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fum extends defpackage.dzw {
    final /* synthetic */ com.android.bubble.CheckableImageButton a;

    public fum(com.android.bubble.CheckableImageButton checkableImageButton) {
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
        ednVar.p(true);
        ednVar.q(this.a.a);
    }
}

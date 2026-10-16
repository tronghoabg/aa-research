package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class edl extends android.text.style.ClickableSpan {
    private final int a;
    private final defpackage.edn b;
    private final int c;

    public edl(int i, defpackage.edn ednVar, int i2) {
        this.a = i;
        this.b = ednVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}

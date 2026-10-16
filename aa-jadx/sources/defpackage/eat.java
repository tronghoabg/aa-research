package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eat implements defpackage.eav {
    private final android.view.ScrollFeedbackProvider a;

    public eat(android.view.View view) {
        this.a = android.view.ScrollFeedbackProvider.createProvider(view);
    }

    @Override // defpackage.eav
    public final void a(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.eav
    public final void b(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}

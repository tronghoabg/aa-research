package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nbd extends defpackage.emu {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ android.view.View d;
    final /* synthetic */ android.view.View e;

    public nbd(android.view.View view, float f, float f2, android.view.View view2, android.view.View view3) {
        this.a = view;
        this.b = f;
        this.c = f2;
        this.d = view2;
        this.e = view3;
    }

    @Override // defpackage.emu
    public final /* bridge */ /* synthetic */ float a(java.lang.Object obj) {
        ((android.view.ViewGroup) obj).getClass();
        return this.a.getAlpha();
    }

    @Override // defpackage.emu
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, float f) {
        ((android.view.ViewGroup) obj).getClass();
        this.a.setAlpha(f);
        android.view.View view = this.d;
        float f2 = (this.b + this.c) * (-(1.0f - f));
        view.setTranslationX(f2);
        this.e.setTranslationX(f2);
    }
}

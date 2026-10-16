package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sra implements defpackage.srd {
    final /* synthetic */ android.widget.FrameLayout a;
    final /* synthetic */ android.view.LayoutInflater b;
    final /* synthetic */ android.view.ViewGroup c;
    final /* synthetic */ android.os.Bundle d;
    final /* synthetic */ defpackage.sre e;

    public sra(defpackage.sre sreVar, android.widget.FrameLayout frameLayout, android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
        this.e = sreVar;
    }

    @Override // defpackage.srd
    public final int a() {
        return 2;
    }

    @Override // defpackage.srd
    public final void b() {
        android.widget.FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        frameLayout.addView(this.e.a.onCreateView(this.b, this.c, this.d));
    }
}

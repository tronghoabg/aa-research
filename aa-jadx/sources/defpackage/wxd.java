package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wxd {
    public java.lang.Object a;
    public java.lang.CharSequence b;
    public android.view.View d;
    public com.google.android.material.tabs.TabLayout f;
    public defpackage.wxf g;
    public int c = -1;
    public final int e = 1;
    public int h = -1;

    public final void a() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f;
        if (tabLayout == null) {
            throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.k(this, true);
    }

    public final void b() {
        defpackage.wxf wxfVar = this.g;
        if (wxfVar != null) {
            wxfVar.b();
        }
    }
}

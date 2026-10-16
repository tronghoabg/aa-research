package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eof implements defpackage.affc {
    private final int a;
    private android.support.v4.app.FragmentContainerView b;

    public eof(int i) {
        this.a = i;
    }

    public final android.support.v4.app.FragmentContainerView a() {
        android.support.v4.app.FragmentContainerView fragmentContainerView = this.b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new java.lang.IllegalStateException("AndroidView has not created a container for " + this.a + " yet");
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        android.support.v4.app.FragmentContainerView fragmentContainerView = new android.support.v4.app.FragmentContainerView((android.content.Context) obj);
        fragmentContainerView.setId(this.a);
        this.b = fragmentContainerView;
        return fragmentContainerView;
    }
}

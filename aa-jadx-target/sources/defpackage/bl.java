package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bl implements defpackage.bw {
    final /* synthetic */ android.support.v4.app.Fragment a;

    public bl(android.support.v4.app.Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.bw
    public final void p(android.support.v4.app.Fragment fragment) {
        this.a.onAttachFragment(fragment);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kma extends android.support.v4.app.Fragment {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.NoVideoFocusFragment");

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onCreate */
    public final void m6lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        super.m6lambda$performCreate$3$androidsupportv4appFragment(bundle);
        ((defpackage.yqj) b.l().ai((char) 3196)).u("onCreate");
        defpackage.knb.a(defpackage.mkp.a.c).edit().putBoolean("SHOWN_NO_VIDEO_FOCUS_SCREEN_KEY", true).apply();
        defpackage.omf.u().o(defpackage.zbe.LOCK_SCREEN, defpackage.zbd.jq);
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View viewInflate = layoutInflater.inflate(2131624070, viewGroup, false);
        viewInflate.findViewById(2131428041).setOnClickListener(new defpackage.ker(this, 2));
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        defpackage.bc activity = getActivity();
        activity.getWindow().setStatusBarColor(-1);
        activity.getWindow().setNavigationBarColor(-1);
        activity.getWindow().getDecorView().setSystemUiVisibility(8208);
    }
}

package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
final class bl implements bw {
    final /* synthetic */ Fragment a;

    public bl(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.bw
    public final void p(Fragment fragment) {
        this.a.onAttachFragment(fragment);
    }
}

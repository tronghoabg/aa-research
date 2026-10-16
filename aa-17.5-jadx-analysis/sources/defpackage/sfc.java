package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class sfc extends sfw implements seo {
    private static final ypf b = ols.R("CAR.SETUP.FRX");
    final sfd a = new sfd();
    private seq c;

    @Override // defpackage.seo
    public final void a(Intent intent) {
        startActivityForResult(intent, 37);
    }

    @Override // defpackage.sfw
    public final yzz b() {
        return yzz.FRX_PRESETUP_INTRO_DOWNLOAD;
    }

    @Override // android.support.v4.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ypf ypfVar = b;
        ypfVar.f().ai(8853).B("onActivityResult. requestCode=%d resultCode=%d", i, i2);
        if (i == 37) {
            if (i2 == -1) {
                ypfVar.f().ai(8855).u("installation ok");
                c().g.L(yzz.FRX_PRESETUP_INTRO_DOWNLOAD, yzy.bS);
            } else if (i2 == 0) {
                ypfVar.f().ai(8854).u("installation canceled");
                c().g.L(yzz.FRX_PRESETUP_INTRO_DOWNLOAD, yzy.bT);
                this.c.g.l(this);
                c().h(5);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.c = new seq(this, requireContext().getPackageManager());
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfd sfdVar = this.a;
        sfdVar.setArguments(getArguments());
        sfdVar.f(getChildFragmentManager(), "download_gearhead_dialog");
        return null;
    }
}

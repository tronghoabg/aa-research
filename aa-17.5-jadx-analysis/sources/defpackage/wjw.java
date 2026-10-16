package defpackage;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment;
import com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class wjw implements why {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wjw(Object obj, String str, int i) {
        this.c = i;
        this.b = obj;
        this.a = str;
    }

    @Override // defpackage.why
    public final void a() {
        int i = this.c;
        if (i == 0) {
            wic wicVar = new wic();
            SystemInfoDialogFragment systemInfoDialogFragment = new SystemInfoDialogFragment();
            Bundle bundle = new Bundle(2);
            String str = this.a;
            bundle.putString("EXTRA_ACCOUNT_NAME", str);
            wjx wjxVar = (wjx) this.b;
            bundle.putBundle("EXTRA_PSD_BUNDLE", wid.b(wjxVar.e.c));
            systemInfoDialogFragment.setArguments(bundle);
            bt btVar = wjxVar.w;
            systemInfoDialogFragment.e(btVar, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
            btVar.ah();
            vuf.B(wicVar, wjxVar.u, str);
            return;
        }
        if (i != 1) {
            wic wicVar2 = new wic();
            SystemInfoDialogFragment systemInfoDialogFragment2 = new SystemInfoDialogFragment();
            Bundle bundle2 = new Bundle(2);
            String str2 = this.a;
            bundle2.putString("EXTRA_ACCOUNT_NAME", str2);
            whi whiVar = (whi) this.b;
            bundle2.putBundle("EXTRA_PSD_BUNDLE", wid.b(whiVar.f.c));
            systemInfoDialogFragment2.setArguments(bundle2);
            bt btVar2 = whiVar.m;
            systemInfoDialogFragment2.e(btVar2, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
            btVar2.ah();
            vuf.B(wicVar2, whiVar.a(), str2);
            return;
        }
        wic wicVar3 = new wic();
        wjb wjbVar = (wjb) this.b;
        Activity activity = wjbVar.e;
        boolean z = activity instanceof bc;
        String str3 = this.a;
        if (z) {
            bt btVarA = ((bc) activity).a();
            SystemInfoDialogFragment systemInfoDialogFragment3 = new SystemInfoDialogFragment();
            Bundle bundle3 = new Bundle(2);
            bundle3.putString("EXTRA_ACCOUNT_NAME", str3);
            bundle3.putBundle("EXTRA_PSD_BUNDLE", wid.b(wjbVar.c.c));
            systemInfoDialogFragment3.setArguments(bundle3);
            systemInfoDialogFragment3.e(btVarA, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
            btVarA.ah();
        } else {
            FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
            PlatformSystemInfoDialogFragment platformSystemInfoDialogFragment = new PlatformSystemInfoDialogFragment();
            Bundle bundle4 = new Bundle(2);
            bundle4.putString("EXTRA_ACCOUNT_NAME", str3);
            bundle4.putBundle("EXTRA_PSD_BUNDLE", wid.b(wjbVar.c.c));
            platformSystemInfoDialogFragment.setArguments(bundle4);
            fragmentTransactionBeginTransaction.add(platformSystemInfoDialogFragment, "com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
        vuf.B(wicVar3, wjbVar.d, str3);
    }
}

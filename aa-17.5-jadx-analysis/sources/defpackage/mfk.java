package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class mfk extends qru implements mgd {
    public static final ComponentName a = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.preflight.PreflightCarActivityService");

    @Override // defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) {
        super.a(bundle);
        v(R.layout.preflight_placeholder);
        mge mgeVar = new mge();
        Bundle extras = q().getExtras();
        extras.getClass();
        mgeVar.setArguments(extras);
        w wVar = new w(S());
        wVar.e(R.id.preflight_placeholder, mgeVar, null, 1);
        wVar.c();
    }
}

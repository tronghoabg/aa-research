package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.auto.components.media.app.MediaCarAppService;

/* loaded from: classes2.dex */
public final class lkf extends jsf {
    private final void V(Intent intent) {
        jsf.l(intent, new mqb(new ComponentName(getPackageName(), MediaCarAppService.class.getName()), (byte[]) null));
    }

    @Override // defpackage.jsf, defpackage.qrq, defpackage.qqh
    public final void e(Intent intent) {
        if (intent != null) {
            V(intent);
        } else {
            intent = null;
        }
        super.e(intent);
    }

    @Override // defpackage.qqh
    public final Intent q() {
        Intent intentQ = super.q();
        intentQ.getClass();
        V(intentQ);
        return intentQ;
    }
}

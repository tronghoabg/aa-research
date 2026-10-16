package com.google.android.projection.gearhead.companion;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import defpackage.lgv;
import defpackage.lvl;
import defpackage.mdl;
import defpackage.nuj;
import defpackage.nur;
import defpackage.obs;
import defpackage.wyq;
import defpackage.wyr;
import defpackage.wzj;
import defpackage.xck;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class RequestNotificationAccessActivity extends wyr {
    public static nur a;
    private static final ComponentName b = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity");
    private static final wyq c = new wzj();
    private final mdl d = new xck(this, 1);

    @Override // defpackage.wyr
    protected final Collection a() {
        return Collections.singleton(c);
    }

    @Override // defpackage.wyr
    public final void b() {
        lvl.E().a(lgv.b().a(), this.d, this);
        lgv.b().a().c(this);
    }

    @Override // defpackage.wyr, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!lgv.c().m()) {
            obs.a().f(this, b, true != ((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked() ? R.string.notification_access_settings_opened : R.string.notification_access_settings_unlock, 1);
        }
        if (a != null) {
            nuj.b().g("NOTIFICATION_ACCESS", 1001L, "com.google.android.projection.gearhead");
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        lvl.E().b(this);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        if (lgv.c().m()) {
            finish();
        }
    }
}

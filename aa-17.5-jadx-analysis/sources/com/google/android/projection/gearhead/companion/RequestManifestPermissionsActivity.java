package com.google.android.projection.gearhead.companion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.ebf;
import defpackage.lgv;
import defpackage.rrc;
import defpackage.wyr;
import defpackage.wzi;
import defpackage.yfq;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import java.util.Collection;

/* loaded from: classes3.dex */
public class RequestManifestPermissionsActivity extends wyr {
    static final yfq a = yfq.p(wzi.values());

    private final void c() {
        if (getIntent().getStringExtra("PermissionEntryPoint") != null) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.NOTIFICATION_MESSAGE, yzy.hT).l());
        }
    }

    @Override // defpackage.wyr
    protected final Collection a() {
        return a;
    }

    @Override // defpackage.wyr
    public final void b() {
        lgv.c().l(this);
    }

    @Override // defpackage.wyr, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        setIntent(intent);
        c();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if ("android.permission.READ_CALENDAR".equals(strArr[i2])) {
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.NOTIFICATION_MESSAGE, iArr[i2] == 0 ? yzy.hU : yzy.hV).l());
            }
        }
        if (i != 46) {
            return;
        }
        if (!lgv.c().f()) {
            Uri uriFromParts = Uri.fromParts("package", getPackageName(), null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
        finish();
    }
}

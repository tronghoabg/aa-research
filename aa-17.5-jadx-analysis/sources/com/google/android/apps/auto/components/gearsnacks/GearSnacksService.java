package com.google.android.apps.auto.components.gearsnacks;

import android.content.Context;
import android.content.res.Resources;
import defpackage.lff;
import defpackage.qg;
import defpackage.qz;
import defpackage.tt;
import defpackage.yk;
import defpackage.yph;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class GearSnacksService extends qg {
    public static final yph c = yph.c("GH.GearSnacksSvc");

    @Override // defpackage.qg
    public final qz b() {
        return new lff();
    }

    @Override // defpackage.qg
    public final yk d() throws Resources.NotFoundException {
        if ((getApplicationInfo().flags & 2) != 0) {
            return yk.a;
        }
        Context applicationContext = getApplicationContext();
        HashMap map = new HashMap();
        tt.b(map, applicationContext);
        return tt.a(map, applicationContext);
    }
}

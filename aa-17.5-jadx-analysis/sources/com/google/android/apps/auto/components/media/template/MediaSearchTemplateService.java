package com.google.android.apps.auto.components.media.template;

import android.content.Context;
import android.content.res.Resources;
import defpackage.lsz;
import defpackage.qg;
import defpackage.qz;
import defpackage.tt;
import defpackage.yk;
import defpackage.ype;
import defpackage.yph;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class MediaSearchTemplateService extends qg {
    public static final yph c = yph.c("GH.MediaSearchTemplate");

    @Override // defpackage.qg
    public final qz b() {
        ((ype) c.l().ai((char) 4269)).u("#onCreateSession");
        return new lsz();
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

package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;

/* loaded from: classes.dex */
public final class zzaf {
    public final r removeActivityUpdates(o oVar, PendingIntent pendingIntent) {
        return ((J) oVar).f26468b.doWrite((l) new zzad(this, oVar, pendingIntent));
    }

    public final r requestActivityUpdates(o oVar, long j8, PendingIntent pendingIntent) {
        return ((J) oVar).f26468b.doWrite((l) new zzac(this, oVar, j8, pendingIntent));
    }
}

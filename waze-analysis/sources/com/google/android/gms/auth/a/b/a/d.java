package com.google.android.gms.auth.a.b.a;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.az;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.api.a {
    @Override // com.google.android.gms.common.api.a
    public final /* bridge */ /* synthetic */ h b(Context context, Looper looper, p pVar, Object obj, r rVar, az azVar) {
        x.f(context, "context");
        x.f(looper, "looper");
        x.f(pVar, "commonSettings");
        x.f((com.google.android.gms.common.api.e) obj, "apiOptions");
        x.f(rVar, "connectedListener");
        x.f(azVar, "connectionFailedListener");
        return new f(context, looper, pVar, rVar, azVar);
    }
}

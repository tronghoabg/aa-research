package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.az;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class a extends g {
    @Deprecated
    public h a(Context context, Looper looper, com.google.android.gms.common.internal.p pVar, Object obj, r rVar, s sVar) {
        return b(context, looper, pVar, obj, rVar, sVar);
    }

    public h b(Context context, Looper looper, com.google.android.gms.common.internal.p pVar, Object obj, com.google.android.gms.common.api.internal.r rVar, az azVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1694h;
import com.google.android.gms.common.api.internal.InterfaceC1704s;
import com.google.android.gms.common.internal.C1720i;

/* renamed from: com.google.android.gms.common.api.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1686a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, C1720i c1720i, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, c1720i, obj, (InterfaceC1694h) mVar, (InterfaceC1704s) nVar);
    }

    public g buildClient(Context context, Looper looper, C1720i c1720i, Object obj, InterfaceC1694h interfaceC1694h, InterfaceC1704s interfaceC1704s) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}

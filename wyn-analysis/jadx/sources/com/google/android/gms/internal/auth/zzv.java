package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC1694h;
import com.google.android.gms.common.api.internal.InterfaceC1704s;
import com.google.android.gms.common.internal.C1720i;

/* loaded from: classes3.dex */
final class zzv extends AbstractC1686a {
    @Override // com.google.android.gms.common.api.AbstractC1686a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C1720i c1720i, Object obj, InterfaceC1694h interfaceC1694h, InterfaceC1704s interfaceC1704s) {
        return new zzi(context, looper, c1720i, interfaceC1694h, interfaceC1704s);
    }
}

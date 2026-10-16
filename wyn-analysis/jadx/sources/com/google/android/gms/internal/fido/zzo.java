package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C1720i;

/* loaded from: classes.dex */
public final class zzo extends AbstractC1686a {
    @Override // com.google.android.gms.common.api.AbstractC1686a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C1720i c1720i, Object obj, m mVar, n nVar) {
        return new zzp(context, looper, c1720i, mVar, nVar);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzuy extends Handler {
    final /* synthetic */ zzva zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzuy(zzva zzvaVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zzvaVar);
        this.zza = zzvaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}

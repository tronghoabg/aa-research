package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
final class zziay extends ThreadLocal {
    final /* synthetic */ zziaz zza;

    public zziay(zziaz zziazVar) {
        Objects.requireNonNull(zziazVar);
        this.zza = zziazVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            zziak zziakVar = zziak.zzb;
            zziaz zziazVar = this.zza;
            Mac mac = (Mac) zziakVar.zzb(zziazVar.zzb());
            mac.init(zziazVar.zzc());
            return mac;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}

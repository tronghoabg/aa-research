package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class zzgil extends zzgji {
    private final Activity zza;
    private final View zzb;

    public zzgil(zzaxt zzaxtVar, zzgie zzgieVar, View view, Activity activity, zzgqo zzgqoVar) {
        super("MB4NRPoKbszEsZs50F7mJwzu+33Ub7A+OagrfmieGdBjZs38LvzcQgcwQTLr3PB3", "U7Z7WtTc2NEgeomO+YkeOiOPYLQ8ra19osxSo/kBqLE=", zzaxtVar, zzgieVar, zzgqoVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        synchronized (zzaxtVar) {
            zzaxtVar.zzS(((Long) objArr[0]).longValue());
            zzaxtVar.zzT(((Long) objArr[1]).longValue());
            zzaxtVar.zzU((String) objArr[2]);
        }
    }
}

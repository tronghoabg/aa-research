package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;
import u1.C4209G;
import u1.C4221j;

/* loaded from: classes3.dex */
public final class zzgbn implements zzimz {
    private final zzini zza;

    private zzgbn(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzgbn zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgbn(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcnx) this.zza).zza();
        zzgbr coroutineScopeProvider = zzcob.zzc();
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(coroutineScopeProvider, "coroutineScopeProvider");
        C4209G c4209gA = C4221j.a(zzgbl.zza, null, null, coroutineScopeProvider.zza(), new tf.a() { // from class: com.google.android.gms.internal.ads.zzgbm
            @Override // tf.a
            public final Object invoke() {
                Context context2 = context;
                AbstractC3340k.e(context2, "<this>");
                return new File(context2.getApplicationContext().getFilesDir(), AbstractC3340k.k("ad_quality_data.pb", "datastore/"));
            }
        }, 6);
        zzinh.zzb(c4209gA);
        return c4209gA;
    }
}

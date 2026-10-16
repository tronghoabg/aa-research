package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzcog implements zzimz {
    private zzcog(zzcns zzcnsVar) {
    }

    public static zzcog zza(zzcns zzcnsVar) {
        return new zzcog(zzcnsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}

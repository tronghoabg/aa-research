package com.google.android.gms.internal.ads;

import G6.U;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfdh implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;

    public zzfdh(zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 39;
    }

    public final zzfdf zzc() {
        boolean zIsActiveNetworkMetered;
        int i5;
        Context context = this.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        int i10 = -1;
        if (U.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i5 = type;
                i10 = iOrdinal;
            } else {
                i5 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i5 = -2;
        }
        return new zzfdf(networkOperator, i5, nVar.f1866f.g(context), phoneType, zIsActiveNetworkMetered, i10);
    }
}

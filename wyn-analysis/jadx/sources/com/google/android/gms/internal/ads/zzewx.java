package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzewx implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;

    public zzewx(zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
        this.zzb = context;
    }

    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmF)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 14;
    }

    public final zzewy zzc() {
        double intExtra;
        boolean zIsCharging;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznI)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : zze(zzd());
        } else {
            Intent intentZzd = zzd();
            boolean zZze = zze(intentZzd);
            intExtra = intentZzd != null ? intentZzd.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / intentZzd.getIntExtra("scale", -1) : -1.0d;
            zIsCharging = zZze;
        }
        return new zzewy(intExtra, zIsCharging);
    }
}

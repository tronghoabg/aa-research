package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzgry {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgsq zzc = new zzgsq("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzgsp zza;
    private final String zze;

    public zzgry(Context context) {
        if (zzgss.zza(context)) {
            this.zza = new zzgsp(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, zzgrj.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(String str) {
        return zzgui.zza(str).trim().isEmpty();
    }

    private static void zzi(String str, zzgrx zzgrxVar) {
        if (zzh(str)) {
            return;
        }
        str.getClass();
        zzgrxVar.zza(str.trim());
    }

    private static boolean zzj(zzgsd zzgsdVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new Object[0]);
        zzgsb zzgsbVarZze = zzgsc.zze();
        zzgsbVarZze.zzc(0);
        zzgsbVarZze.zza(8160);
        zzgsdVar.zza(zzgsbVarZze.zze());
        return false;
    }

    public final void zza(final zzgsa zzgsaVar, final zzgsd zzgsdVar) {
        zzgsp zzgspVar = this.zza;
        if (zzgspVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgsdVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgsaVar.zzb()))) {
            zzgspVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzgsaVar, zzgsdVar);
                }
            });
        }
    }

    public final void zzb(final zzgrf zzgrfVar, final zzgsd zzgsdVar) {
        zzgsp zzgspVar = this.zza;
        if (zzgspVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgsdVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgrfVar.zza(), zzgrfVar.zzb()))) {
            zzgspVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzgrfVar, zzgsdVar);
                }
            });
        }
    }

    public final void zzc(final zzgsf zzgsfVar, final zzgsd zzgsdVar, final int i5) {
        zzgsp zzgspVar = this.zza;
        if (zzgspVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgsdVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgsfVar.zza(), zzgsfVar.zzb()))) {
            zzgspVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzgsfVar, i5, zzgsdVar);
                }
            });
        }
    }

    public final void zzd() {
        zzgsp zzgspVar = this.zza;
        if (zzgspVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new Object[0]);
        zzgspVar.zzb();
    }

    public final /* synthetic */ void zze(zzgsa zzgsaVar, zzgsd zzgsdVar) {
        try {
            zzgsp zzgspVar = this.zza;
            if (zzgspVar == null) {
                throw null;
            }
            zzgqt zzgqtVar = (zzgqt) zzgspVar.zzc();
            if (zzgqtVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgsaVar.zza());
            zzi(zzgsaVar.zzj(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrn
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i5 = zzgry.zzb;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", zzgsaVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgsaVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzgsaVar.zzh());
            zzi(null, new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgro
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i5 = zzgry.zzb;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            zzi(null, new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrp
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i5 = zzgry.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgsaVar.zzb(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrq
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i5 = zzgry.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzi(null, new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrr
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i5 = zzgry.zzb;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzgqtVar.zze(str, bundle, new zzgrw(this, zzgsdVar));
        } catch (RemoteException e7) {
            zzc.zzd(e7, "show overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzf(zzgrf zzgrfVar, zzgsd zzgsdVar) {
        try {
            zzgsp zzgspVar = this.zza;
            if (zzgspVar == null) {
                throw null;
            }
            zzgqt zzgqtVar = (zzgqt) zzgspVar.zzc();
            if (zzgqtVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgrfVar.zza(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrs
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i5 = zzgry.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgrfVar.zzb(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrt
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i5 = zzgry.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgqtVar.zzf(bundle, new zzgrw(this, zzgsdVar));
        } catch (RemoteException e7) {
            zzc.zzd(e7, "dismiss overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzg(zzgsf zzgsfVar, int i5, zzgsd zzgsdVar) {
        try {
            zzgsp zzgspVar = this.zza;
            if (zzgspVar == null) {
                throw null;
            }
            zzgqt zzgqtVar = (zzgqt) zzgspVar.zzc();
            if (zzgqtVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i5);
            zzi(zzgsfVar.zza(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgru
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgry.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgsfVar.zzb(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrl
                @Override // com.google.android.gms.internal.ads.zzgrx
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgry.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgqtVar.zzg(bundle, new zzgrw(this, zzgsdVar));
        } catch (RemoteException e7) {
            zzc.zzd(e7, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i5), this.zze);
        }
    }
}

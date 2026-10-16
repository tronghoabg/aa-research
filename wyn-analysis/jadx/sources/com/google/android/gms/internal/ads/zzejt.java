package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbic;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzejt extends zzeju {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzdce zzc;
    private final TelephonyManager zzd;
    private final zzejl zze;
    private zzbic.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbic.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbic.zzaf.zzd zzdVar = zzbic.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbic.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbic.zzaf.zzd zzdVar2 = zzbic.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbic.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzejt(Context context, zzdce zzdceVar, zzejl zzejlVar, zzejh zzejhVar, G6.N n10) {
        super(zzejhVar, n10);
        this.zzb = context;
        this.zzc = zzdceVar;
        this.zze = zzejlVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    public static final /* synthetic */ zzbic.zzaf.zzd zze(Bundle bundle) {
        return (zzbic.zzaf.zzd) zzg.get(zzflv.zza(zzflv.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbic.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbic.zzq zzg(boolean z2) {
        return z2 ? zzbic.zzq.ENUM_TRUE : zzbic.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z2) {
        zzhcf.zzr(this.zzc.zza(new Bundle()), new zzejs(this, z2), zzcfy.zzh);
    }

    public final /* synthetic */ zzbic.zzab zzb(Bundle bundle) {
        zzbic.zzab.zzb zzbVar;
        zzbic.zzab.zza zzaVarZzq = zzbic.zzab.zzq();
        int i5 = bundle.getInt("cnt", -2);
        int i10 = bundle.getInt("gnt", 0);
        if (i5 == -1) {
            this.zzf = zzbic.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbic.zzq.ENUM_FALSE;
            if (i5 == 0) {
                zzaVarZzq.zzc(zzbic.zzab.zzc.CELL);
            } else if (i5 != 1) {
                zzaVarZzq.zzc(zzbic.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZzq.zzc(zzbic.zzab.zzc.WIFI);
            }
            switch (i10) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbic.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbic.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbic.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbic.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZzq.zzg(zzbVar);
        }
        return zzaVarZzq.zzbu();
    }

    public final byte[] zzc(boolean z2, ArrayList arrayList, zzbic.zzab zzabVar, zzbic.zzaf.zzd zzdVar) {
        zzbic.zzaf.zza.C0142zza c0142zzaZzz = zzbic.zzaf.zza.zzz();
        c0142zzaZzz.zzv(arrayList);
        Context context = this.zzb;
        c0142zzaZzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        TelephonyManager telephonyManager = this.zzd;
        C6.n nVar = C6.n.f1857D;
        c0142zzaZzz.zzN(nVar.f1866f.a(context, telephonyManager));
        zzejl zzejlVar = this.zze;
        c0142zzaZzz.zzk(zzejlVar.zzf());
        c0142zzaZzz.zzo(zzejlVar.zzj());
        c0142zzaZzz.zzR(zzejlVar.zzd());
        c0142zzaZzz.zzZ(zzdVar);
        c0142zzaZzz.zzz(zzabVar);
        c0142zzaZzz.zzV(this.zzf);
        c0142zzaZzz.zzg(zzg(z2));
        c0142zzaZzz.zzad(zzejlVar.zzb());
        nVar.k.getClass();
        c0142zzaZzz.zzc(System.currentTimeMillis());
        c0142zzaZzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c0142zzaZzz.zzbu().zzaN();
    }

    public final /* synthetic */ zzejl zzd() {
        return this.zze;
    }
}

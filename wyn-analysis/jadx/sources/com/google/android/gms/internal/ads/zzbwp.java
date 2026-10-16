package com.google.android.gms.internal.ads;

import D6.InterfaceC0385m0;
import D6.Z0;
import D6.r1;
import android.location.Location;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.metadata.Office;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class zzbwp implements J6.s {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbma zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbwp(Date date, int i5, Set set, Location location, boolean z2, int i10, zzbma zzbmaVar, List list, boolean z10, int i11, String str) {
        this.zza = date;
        this.zzb = i5;
        this.zzc = set;
        this.zze = location;
        this.zzd = z2;
        this.zzf = i10;
        this.zzg = zzbmaVar;
        this.zzi = z10;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith(Office.USER_DEFINED_METADATA_NAME_PREFIX)) {
                    String[] strArrSplit = str2.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 3);
                    if (strArrSplit.length == 3) {
                        String str3 = strArrSplit[2];
                        if ("true".equals(str3)) {
                            this.zzj.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str3)) {
                            this.zzj.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            float fZzk = 1.0f;
            if (interfaceC0385m0 == null) {
                return 1.0f;
            }
            try {
                fZzk = interfaceC0385m0.zzk();
            } catch (RemoteException e7) {
                H6.l.d("Unable to get app volume.", e7);
            }
            return fZzk;
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // J6.d
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // J6.s
    public final A6.e getNativeAdOptions() {
        Parcelable.Creator<zzbma> creator = zzbma.CREATOR;
        A6.d dVar = new A6.d();
        zzbma zzbmaVar = this.zzg;
        if (zzbmaVar == null) {
            return new A6.e(dVar);
        }
        int i5 = zzbmaVar.zza;
        if (i5 == 2) {
            dVar.f395f = zzbmaVar.zze;
        } else {
            if (i5 != 3) {
                if (i5 == 4) {
                    dVar.f394e = zzbmaVar.zzg;
                    dVar.f393d = zzbmaVar.zzh;
                }
            }
            r1 r1Var = zzbmaVar.zzf;
            if (r1Var != null) {
                dVar.f396g = new x6.w(r1Var);
            }
            dVar.f395f = zzbmaVar.zze;
        }
        dVar.f390a = zzbmaVar.zzb;
        dVar.f391b = zzbmaVar.zzc;
        dVar.f392c = zzbmaVar.zzd;
        return new A6.e(dVar);
    }

    @Override // J6.s
    public final com.google.android.gms.ads.nativead.g getNativeAdRequestOptions() {
        return zzbma.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            boolean zZzl = false;
            if (interfaceC0385m0 == null) {
                return false;
            }
            try {
                zZzl = interfaceC0385m0.zzl();
            } catch (RemoteException e7) {
                H6.l.d("Unable to get app mute state.", e7);
            }
            return zZzl;
        }
    }

    @Override // J6.d
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // J6.d
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // J6.s
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // J6.d
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // J6.s
    public final boolean zza() {
        return this.zzh.contains("3");
    }

    @Override // J6.s
    public final Map zzb() {
        return this.zzj;
    }
}

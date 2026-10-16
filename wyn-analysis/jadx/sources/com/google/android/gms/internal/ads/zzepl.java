package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.SystemClock;
import android.text.TextUtils;
import com.qonversion.android.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzepl {
    private final InterfaceC3596a zza;
    private final zzepn zzb;
    private final zzfsm zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhT)).booleanValue();
    private final zzemf zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzepl(InterfaceC3596a interfaceC3596a, zzepn zzepnVar, zzemf zzemfVar, zzfsm zzfsmVar) {
        this.zza = interfaceC3596a;
        this.zzb = zzepnVar;
        this.zzf = zzemfVar;
        this.zzc = zzfsmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfkn zzfknVar) {
        zzepk zzepkVar = (zzepk) this.zzd.get(zzfknVar);
        if (zzepkVar == null) {
            return false;
        }
        return zzepkVar.zzc == 8;
    }

    public final synchronized void zza() {
        ((C3597b) this.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
    }

    public final synchronized void zzb() {
        ((C3597b) this.zza).getClass();
        this.zzh = SystemClock.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        ((C3597b) this.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfkn zzfknVar = (zzfkn) it.next();
            String str = zzfknVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfknVar, new zzepk(str, zzfknVar.zzaf, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void zzd(zzfkn zzfknVar) {
        try {
            ((C3597b) this.zza).getClass();
            this.zzh = SystemClock.elapsedRealtime() - this.zzi;
            if (zzfknVar != null) {
                this.zzf.zzi(zzfknVar);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized p8.p zze(zzfky zzfkyVar, zzfkn zzfknVar, p8.p pVar, zzfsi zzfsiVar) {
        zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
        ((C3597b) this.zza).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = zzfknVar.zzw;
        if (str != null) {
            this.zzd.put(zzfknVar, new zzepk(str, zzfknVar.zzaf, 9, 0L, null));
            zzhcf.zzr(pVar, new zzepj(this, jElapsedRealtime, zzfkqVar, zzfknVar, str, zzfsiVar, zzfkyVar), zzcfy.zzh);
        }
        return pVar;
    }

    public final synchronized void zzf(zzfkn zzfknVar) {
        zzepk zzepkVar = (zzepk) this.zzd.get(zzfknVar);
        if (zzepkVar == null || this.zzg) {
            return;
        }
        zzepkVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzepk zzepkVar = (zzepk) ((Map.Entry) it.next()).getValue();
                if (zzepkVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzepkVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join(Constants.USER_ID_SEPARATOR, arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    public final /* synthetic */ InterfaceC3596a zzj() {
        return this.zza;
    }

    public final /* synthetic */ zzepn zzk() {
        return this.zzb;
    }

    public final /* synthetic */ zzfsm zzl() {
        return this.zzc;
    }

    public final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    public final /* synthetic */ zzemf zzo() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}

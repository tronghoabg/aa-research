package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.SystemClock;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzeae {
    private final String zze;
    private final zzdzy zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final G6.N zza = C6.n.f1857D.f1868h.zzp();

    public zzeae(String str, zzdzy zzdzyVar) {
        this.zze = str;
        this.zzf = zzdzyVar;
    }

    private final Map zzg() {
        Map mapZza = this.zzf.zza();
        C6.n.f1857D.k.getClass();
        mapZza.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        mapZza.put(ScarConstants.TOKEN_ID_KEY, ((G6.O) this.zza).D() ? "" : this.zze);
        return mapZza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcP)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(HandleInvocationsFromAdViewer.KEY_ACTION, "adapter_init_started");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzb(String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcP)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(HandleInvocationsFromAdViewer.KEY_ACTION, "adapter_init_finished");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzc(String str, String str2) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcP)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(HandleInvocationsFromAdViewer.KEY_ACTION, "adapter_init_finished");
            mapZzg.put("ancn", str);
            mapZzg.put("rqe", str2);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcP)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(HandleInvocationsFromAdViewer.KEY_ACTION, "aaia");
            mapZzg.put("aair", "MalformedJson");
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zze() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcP)).booleanValue() && !this.zzc) {
            Map mapZzg = zzg();
            mapZzg.put(HandleInvocationsFromAdViewer.KEY_ACTION, "init_started");
            this.zzb.add(mapZzg);
            this.zzc = true;
        }
    }

    public final synchronized void zzf() {
        try {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcP)).booleanValue() && !this.zzd) {
                Map mapZzg = zzg();
                mapZzg.put(HandleInvocationsFromAdViewer.KEY_ACTION, "init_finished");
                List list = this.zzb;
                list.add(mapZzg);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzf.zzb((Map) it.next());
                }
                this.zzd = true;
            }
        } finally {
        }
    }
}

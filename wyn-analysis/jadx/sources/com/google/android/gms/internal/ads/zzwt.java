package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class zzwt extends zzwm {
    private final HashMap zza = new HashMap();
    private Handler zzb;

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzN() {
        for (zzws zzwsVar : this.zza.values()) {
            zzwsVar.zza.zzr(zzwsVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public void zza(zzip zzipVar) {
        this.zzb = zzfm.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzc() {
        for (zzws zzwsVar : this.zza.values()) {
            zzwsVar.zza.zzs(zzwsVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public void zzd() {
        HashMap map = this.zza;
        for (zzws zzwsVar : map.values()) {
            zzxn zzxnVar = zzwsVar.zza;
            zzxnVar.zzt(zzwsVar.zzb);
            zzwr zzwrVar = zzwsVar.zzc;
            zzxnVar.zzn(zzwrVar);
            zzxnVar.zzp(zzwrVar);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public void zzu() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzws) it.next()).zza.zzu();
        }
    }

    public abstract void zzv(Object obj, zzxn zzxnVar, zzbf zzbfVar);

    public final void zzw(final Object obj, zzxn zzxnVar) {
        HashMap map = this.zza;
        zzgtr.zza(!map.containsKey(obj));
        zzxm zzxmVar = new zzxm() { // from class: com.google.android.gms.internal.ads.zzwq
            @Override // com.google.android.gms.internal.ads.zzxm
            public final /* synthetic */ void zza(zzxn zzxnVar2, zzbf zzbfVar) {
                this.zza.zzv(obj, zzxnVar2, zzbfVar);
            }
        };
        zzwr zzwrVar = new zzwr(this, obj);
        map.put(obj, new zzws(zzxnVar, zzxmVar, zzwrVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzxnVar.zzm(handler, zzwrVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzxnVar.zzo(handler2, zzwrVar);
        zzxnVar.zzq(zzxmVar, zzk(), zzl());
        if (zzj()) {
            return;
        }
        zzxnVar.zzs(zzxmVar);
    }

    public int zzx(Object obj, int i5) {
        return 0;
    }

    public zzxl zzy(Object obj, zzxl zzxlVar) {
        throw null;
    }

    public long zzz(Object obj, long j8, zzxl zzxlVar) {
        return j8;
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class zzdla extends zzdix implements zzbex {
    private final Map zzb;
    private final Context zzc;
    private final zzfkn zzd;

    public zzdla(Context context, Set set, zzfkn zzfknVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfknVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzbez zzbezVar = (zzbez) map.get(view);
            if (zzbezVar == null) {
                zzbez zzbezVar2 = new zzbez(this.zzc, view);
                zzbezVar2.zza(this);
                map.put(view, zzbezVar2);
                zzbezVar = zzbezVar2;
            }
            if (this.zzd.zzX) {
                zzbio zzbioVar = zzbix.zzcf;
                C0395s c0395s = C0395s.f2489e;
                if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                    zzbezVar.zzd(((Long) c0395s.f2492c.zzd(zzbix.zzce)).longValue());
                    return;
                }
            }
            zzbezVar.zze();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzbez) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final synchronized void zzdj(final zzbew zzbewVar) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzbex) obj).zzdj(zzbewVar);
            }
        });
    }
}

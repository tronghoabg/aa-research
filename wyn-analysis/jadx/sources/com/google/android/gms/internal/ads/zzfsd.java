package com.google.android.gms.internal.ads;

import D6.C0395s;
import Va.M6;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfsd {
    private final H6.s zza;
    private final H6.p zzb;
    private final zzhcq zzc;
    private final zzfse zzd;
    private final zzcnn zze;

    public zzfsd(H6.s sVar, H6.p pVar, zzhcq zzhcqVar, zzfse zzfseVar, zzcnn zzcnnVar) {
        this.zza = sVar;
        this.zzb = pVar;
        this.zzc = zzhcqVar;
        this.zzd = zzfseVar;
        this.zze = zzcnnVar;
    }

    private final p8.p zze(final String str, final long j8, final int i5) {
        final String strT;
        H6.s sVar = this.zza;
        if (i5 > ((H6.k) sVar).f4956a) {
            zzfse zzfseVar = this.zzd;
            if (zzfseVar == null || !((H6.k) sVar).f4959d) {
                return zzhcf.zza(H6.o.f4963c);
            }
            zzfseVar.zza(str, "", 2);
            return zzhcf.zza(H6.o.f4964d);
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjW)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i5));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strT = M6.t(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strT = str;
        }
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfsc
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzb(i5, j8, str, (H6.o) obj);
            }
        };
        if (j8 == 0) {
            zzhcq zzhcqVar = this.zzc;
            return zzhcf.zzj(zzhcqVar.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsb
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzd(strT);
                }
            }), zzhbnVar, zzhcqVar);
        }
        zzhcq zzhcqVar2 = this.zzc;
        return zzhcf.zzj(zzhcqVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsa
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(strT);
            }
        }, j8, TimeUnit.MILLISECONDS), zzhbnVar, zzhcqVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final H6.o zzd(String str) {
        zzcnn zzcnnVar;
        zzbio zzbioVar = zzbix.zzko;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (zzcnnVar = this.zze) != null) {
            C6.n nVar = C6.n.f1857D;
            if (nVar.f1863c.F(str) || nVar.f1863c.G(str)) {
                String strZzb = zzcnnVar.zzb();
                HashMap map = new HashMap();
                if (strZzb != null) {
                    map.put((String) c0395s.f2492c.zzd(zzbix.zzkp), strZzb);
                }
                return this.zzb.a(map, str);
            }
        }
        return this.zzb.a(null, str);
    }

    public final p8.p zza(String str) {
        H6.o oVar = H6.o.f4962b;
        if (str != null) {
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzhcf.zza(oVar);
                }
            }
        }
        return zzhcf.zza(oVar);
    }

    public final p8.p zzb(int i5, long j8, String str, H6.o oVar) {
        if (oVar != H6.o.f4963c) {
            return zzhcf.zza(oVar);
        }
        H6.s sVar = this.zza;
        long j10 = ((H6.k) sVar).f4957b;
        if (i5 != 1) {
            j10 = (long) (((H6.k) sVar).f4958c * j8);
        }
        return zze(str, j10, i5 + 1);
    }
}

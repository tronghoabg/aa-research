package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeiq extends zzcaw {
    private final Context zza;
    private final zzhcp zzb;
    private final zzeiy zzc;
    private final zzcrx zzd;
    private final ArrayDeque zze;
    private final zzfqt zzf;
    private final zzcbs zzg;

    public zzeiq(Context context, zzhcp zzhcpVar, zzcbs zzcbsVar, zzcrx zzcrxVar, zzeiy zzeiyVar, ArrayDeque arrayDeque, zzeiv zzeivVar, zzfqt zzfqtVar) {
        zzbix.zza(context);
        this.zza = context;
        this.zzb = zzhcpVar;
        this.zzg = zzcbsVar;
        this.zzc = zzeiyVar;
        this.zzd = zzcrxVar;
        this.zze = arrayDeque;
        this.zzf = zzfqtVar;
    }

    private static p8.p zzm(final zzcbk zzcbkVar, zzfps zzfpsVar, final zzfdu zzfduVar) {
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeie
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final p8.p zza(Object obj) {
                return zzfduVar.zzc().zza(C0392q.f2477g.f2478a.m((Bundle) obj), zzcbkVar.zzm);
            }
        };
        return zzfpsVar.zza(zzfpm.GMS_SIGNALS, zzhcf.zza(zzcbkVar.zza)).zzc(zzhbnVar).zzb(zzeif.zza).zzi();
    }

    private static p8.p zzn(p8.p pVar, zzfps zzfpsVar, zzbup zzbupVar, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        zzbuf zzbufVarZza = zzbupVar.zza("AFMA_getAdDictionary", zzbum.zza, zzeik.zza);
        zzfqp.zzb(pVar, zzfqgVar);
        zzfoz zzfozVarZzi = zzfpsVar.zza(zzfpm.BUILD_URL, pVar).zzc(zzbufVarZza).zzi();
        zzfqp.zzf(zzfozVarZzi, zzfqqVar, zzfqgVar);
        return zzfozVarZzi;
    }

    private final void zzo(p8.p pVar, zzcbb zzcbbVar, zzcbk zzcbkVar) {
        zzhcf.zzr(zzhcf.zzj(pVar, new zzhbn(this) { // from class: com.google.android.gms.internal.ads.zzeii
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return zzhcf.zza(zzfmh.zza((InputStream) obj));
            }
        }, zzcfy.zza), new zzeib(this, zzcbkVar, zzcbbVar), zzcfy.zzh);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzble.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzeil zzeilVar) {
        zzp();
        this.zze.addLast(zzeilVar);
    }

    private final synchronized zzeil zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeil zzeilVar = (zzeil) it.next();
            if (zzeilVar.zzc.equals(str)) {
                it.remove();
                return zzeilVar;
            }
        }
        return null;
    }

    public final p8.p zzb(final zzcbk zzcbkVar, int i5) {
        zzeil zzeilVarZzr;
        zzfoz zzfozVarZzi;
        zzbug zzbugVar = C6.n.f1857D.f1877r;
        Context context = this.zza;
        zzbup zzbupVarZza = zzbugVar.zza(context, H6.a.V(), this.zzf);
        zzfdu zzfduVarZzy = this.zzd.zzy(zzcbkVar, i5);
        zzbuf zzbufVarZza = zzbupVarZza.zza("google.afma.response.normalize", zzein.zzd, zzbum.zzb);
        if (((Boolean) zzble.zza.zze()).booleanValue()) {
            zzeilVarZzr = zzr(zzcbkVar.zzh);
            if (zzeilVarZzr == null) {
                G6.L.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcbkVar.zzj;
            zzeilVarZzr = null;
            if (str != null && !str.isEmpty()) {
                G6.L.k("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzeil zzeilVar = zzeilVarZzr;
        zzfqg zzfqgVarA = zzeilVar == null ? u.a(context, 9) : zzeilVar.zzd;
        zzfqq zzfqqVarZzf = zzfduVarZzy.zzf();
        zzfqqVarZzf.zzb(zzcbkVar.zza.getStringArrayList("ad_types"));
        zzeix zzeixVar = new zzeix(zzcbkVar.zzg, zzfqqVarZzf, zzfqgVarA);
        zzeiu zzeiuVar = new zzeiu(context, zzcbkVar.zzb.f4927a, this.zzg, i5, null);
        zzfps zzfpsVarZze = zzfduVarZzy.zze();
        zzfqg zzfqgVarA2 = u.a(context, 11);
        if (zzeilVar == null) {
            final p8.p pVarZzm = zzm(zzcbkVar, zzfpsVarZze, zzfduVarZzy);
            final p8.p pVarZzn = zzn(pVarZzm, zzfpsVarZze, zzbupVarZza, zzfqqVarZzf, zzfqgVarA);
            zzfqg zzfqgVarA3 = u.a(context, 10);
            final zzfoz zzfozVarZzi2 = zzfpsVarZze.zzb(zzfpm.HTTP, pVarZzn, pVarZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeij
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    zzcbm zzcbmVar = (zzcbm) pVarZzn.get();
                    if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue() && (bundle = zzcbkVar.zzm) != null) {
                        bundle.putLong(zzdzc.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzcbmVar.zzj());
                        bundle.putLong(zzdzc.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzcbmVar.zzk());
                    }
                    return new zzeiw((JSONObject) pVarZzm.get(), zzcbmVar);
                }
            }).zzb(zzeixVar).zzb(zzfqp.zzc(zzfqgVarA3)).zzb(zzeiuVar).zzi();
            zzfqp.zzd(zzfozVarZzi2, zzfqqVarZzf, zzfqgVarA3);
            zzfqp.zzb(zzfozVarZzi2, zzfqgVarA2);
            zzfozVarZzi = zzfpsVarZze.zzb(zzfpm.PRE_PROCESS, pVarZzm, pVarZzn, zzfozVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeic
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue() && (bundle = zzcbkVar.zzm) != null) {
                        String strZza = zzdzc.HTTP_RESPONSE_READY.zza();
                        C6.n.f1857D.k.getClass();
                        bundle.putLong(strZza, System.currentTimeMillis());
                    }
                    return new zzein((zzeit) zzfozVarZzi2.get(), (JSONObject) pVarZzm.get(), (zzcbm) pVarZzn.get());
                }
            }).zzc(zzbufVarZza).zzi();
        } else {
            zzeiw zzeiwVar = new zzeiw(zzeilVar.zzb, zzeilVar.zza);
            zzfqg zzfqgVarA4 = u.a(context, 10);
            final zzfoz zzfozVarZzi3 = zzfpsVarZze.zza(zzfpm.HTTP, zzhcf.zza(zzeiwVar)).zzb(zzeixVar).zzb(zzfqp.zzc(zzfqgVarA4)).zzb(zzeiuVar).zzi();
            zzfqp.zzd(zzfozVarZzi3, zzfqqVarZzf, zzfqgVarA4);
            final p8.p pVarZza = zzhcf.zza(zzeilVar);
            zzfqp.zzb(zzfozVarZzi3, zzfqgVarA2);
            zzfozVarZzi = zzfpsVarZze.zzb(zzfpm.PRE_PROCESS, zzfozVarZzi3, pVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeid
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzeit zzeitVar = (zzeit) zzfozVarZzi3.get();
                    p8.p pVar = pVarZza;
                    return new zzein(zzeitVar, ((zzeil) pVar.get()).zzb, ((zzeil) pVar.get()).zza);
                }
            }).zzc(zzbufVarZza).zzi();
        }
        zzfqp.zzd(zzfozVarZzi, zzfqqVarZzf, zzfqgVarA2);
        return zzfozVarZzi;
    }

    public final p8.p zzc(final zzcbk zzcbkVar, int i5) {
        if (!((Boolean) zzble.zza.zze()).booleanValue()) {
            return zzhcf.zzc(new Exception("Split request is disabled."));
        }
        zzfnc zzfncVar = zzcbkVar.zzi;
        if (zzfncVar == null) {
            return zzhcf.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfncVar.zzc == 0 || zzfncVar.zzd == 0) {
            return zzhcf.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbup zzbupVarZza = C6.n.f1857D.f1877r.zza(context, H6.a.V(), this.zzf);
        zzfdu zzfduVarZzy = this.zzd.zzy(zzcbkVar, i5);
        zzfps zzfpsVarZze = zzfduVarZzy.zze();
        final p8.p pVarZzm = zzm(zzcbkVar, zzfpsVarZze, zzfduVarZzy);
        zzfqq zzfqqVarZzf = zzfduVarZzy.zzf();
        final zzfqg zzfqgVarA = u.a(context, 9);
        final p8.p pVarZzn = zzn(pVarZzm, zzfpsVarZze, zzbupVarZza, zzfqqVarZzf, zzfqgVarA);
        return zzfpsVarZze.zzb(zzfpm.GET_URL_AND_CACHE_KEY, pVarZzm, pVarZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(pVarZzn, pVarZzm, zzcbkVar, zzfqgVarA);
            }
        }).zzi();
    }

    public final p8.p zzd(String str) {
        if (((Boolean) zzble.zza.zze()).booleanValue()) {
            return zzr(str) == null ? zzhcf.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzhcf.zza(new zzeia(this));
        }
        return zzhcf.zzc(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zze(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        Bundle bundle;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue() && (bundle = zzcbkVar.zzm) != null) {
            String strZza = zzdzc.SERVICE_CONNECTED.zza();
            C6.n.f1857D.k.getClass();
            bundle.putLong(strZza, System.currentTimeMillis());
        }
        p8.p pVarZzb = zzb(zzcbkVar, Binder.getCallingUid());
        zzo(pVarZzb, zzcbbVar, zzcbkVar);
        if (((Boolean) zzbkx.zzi.zze()).booleanValue()) {
            final zzeiy zzeiyVar = this.zzc;
            Objects.requireNonNull(zzeiyVar);
            pVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeiyVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzf(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        Bundle bundle;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue() && (bundle = zzcbkVar.zzm) != null) {
            String strZza = zzdzc.SERVICE_CONNECTED.zza();
            C6.n.f1857D.k.getClass();
            bundle.putLong(strZza, System.currentTimeMillis());
        }
        zzo(zzk(zzcbkVar, Binder.getCallingUid()), zzcbbVar, zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzg(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        zzo(zzc(zzcbkVar, Binder.getCallingUid()), zzcbbVar, zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzh(String str, zzcbb zzcbbVar) {
        zzo(zzd(str), zzcbbVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        zzbio zzbioVar = zzbix.zzpL;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            String str2 = (String) c0395s.f2492c.zzd(zzbix.zzpM);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzf = zzgug.zza(zzgtf.zzd(',')).zzf(str2);
            G6.L.k("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzf) {
                Context context = this.zza;
                zzeiu zzeiuVar = new zzeiu(context, str, this.zzg, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put("User-Agent", C6.n.f1857D.f1863c.E(context, str));
                try {
                    zzeit zzeitVarZzb = zzeiuVar.zza(new zzeis(str3, 30000, map, new byte[0], "", false));
                    if (zzeitVarZzb.zza != 200) {
                        int i5 = zzeitVarZzb.zza;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 32);
                        sb2.append("Unexpected preconnect response: ");
                        sb2.append(i5);
                        throw new RemoteException(sb2.toString());
                    }
                } catch (Exception e7) {
                    throw new RemoteException(e7.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzj(zzcat zzcatVar, zzcbc zzcbcVar) {
        if (((Boolean) zzblm.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzcatVar.zza;
            zzhcf.zzr(zzhcf.zza(null), new zzehz(this, zzcbcVar, zzcatVar), zzcfy.zzh);
        } else {
            try {
                zzcbcVar.zze("", zzcatVar);
            } catch (RemoteException e7) {
                G6.L.l("Service can't call client", e7);
            }
        }
    }

    public final p8.p zzk(final zzcbk zzcbkVar, int i5) {
        zzbug zzbugVar = C6.n.f1857D.f1877r;
        Context context = this.zza;
        zzbup zzbupVarZza = zzbugVar.zza(context, H6.a.V(), this.zzf);
        if (!((Boolean) zzblk.zza.zze()).booleanValue()) {
            return zzhcf.zzc(new Exception("Signal collection disabled."));
        }
        zzfdu zzfduVarZzy = this.zzd.zzy(zzcbkVar, i5);
        final zzfcv zzfcvVarZzd = zzfduVarZzy.zzd();
        zzbuf zzbufVarZza = zzbupVarZza.zza("google.afma.request.getSignals", zzbum.zza, zzbum.zzb);
        zzfqg zzfqgVarA = u.a(context, 22);
        zzfps zzfpsVarZze = zzfduVarZzy.zze();
        zzfpm zzfpmVar = zzfpm.GET_SIGNALS;
        Bundle bundle = zzcbkVar.zza;
        zzfoz zzfozVarZzi = zzfpsVarZze.zza(zzfpmVar, zzhcf.zza(bundle)).zzb(zzfqp.zzc(zzfqgVarA)).zzc(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeih
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final p8.p zza(Object obj) throws JSONException {
                return zzfcvVarZzd.zza(C0392q.f2477g.f2478a.m((Bundle) obj), zzcbkVar.zzm);
            }
        }).zzj(zzfpm.JS_SIGNALS).zzc(zzbufVarZza).zzi();
        zzfqq zzfqqVarZzf = zzfduVarZzy.zzf();
        zzfqqVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfqqVarZzf.zzd(bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS));
        zzfqp.zze(zzfozVarZzi, zzfqqVarZzf, zzfqgVarA);
        if (((Boolean) zzbkx.zzj.zze()).booleanValue()) {
            final zzeiy zzeiyVar = this.zzc;
            Objects.requireNonNull(zzeiyVar);
            zzfozVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeio
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeiyVar.zza();
                }
            }, this.zzb);
        }
        return zzfozVarZzi;
    }

    public final /* synthetic */ InputStream zzl(p8.p pVar, p8.p pVar2, zzcbk zzcbkVar, zzfqg zzfqgVar) {
        String strZzi = ((zzcbm) pVar.get()).zzi();
        zzq(new zzeil((zzcbm) pVar.get(), (JSONObject) pVar2.get(), zzcbkVar.zzh, strZzi, zzfqgVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzbub {
    private final Context zzb;
    private final String zzc;
    private final H6.a zzd;
    private final zzfqt zze;
    private final G6.r zzf;
    private final G6.r zzg;
    private zzbua zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbub(Context context, H6.a aVar, String str, G6.r rVar, G6.r rVar2, zzfqt zzfqtVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = aVar;
        this.zze = zzfqtVar;
        this.zzf = rVar;
        this.zzg = rVar2;
    }

    public final zzbua zza(zzbaw zzbawVar) {
        zzfqg zzfqgVarA = u.a(this.zzb, 6);
        zzfqgVarA.zza();
        final zzbua zzbuaVar = new zzbua(this.zzg);
        G6.L.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzbaw zzbawVar2 = null;
        zzcfy.zzf.execute(new Runnable(zzbawVar2, zzbuaVar) { // from class: com.google.android.gms.internal.ads.zzbtr
            private final /* synthetic */ zzbua zzb;

            {
                this.zzb = zzbuaVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(null, this.zzb);
            }
        });
        G6.L.k("loadNewJavascriptEngine: Promise created");
        zzbuaVar.zze(new zzbtk(this, zzbuaVar, zzfqgVarA), new zzbtl(this, zzbuaVar, zzfqgVarA));
        return zzbuaVar;
    }

    public final zzbtv zzb(zzbaw zzbawVar) {
        G6.L.k("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            try {
                G6.L.k("getEngine: Lock acquired");
                G6.L.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        G6.L.k("refreshIfDestroyed: Lock acquired");
                        zzbua zzbuaVar = this.zzh;
                        if (zzbuaVar != null && this.zzi == 0) {
                            zzbuaVar.zze(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzbtn
                                @Override // com.google.android.gms.internal.ads.zzcgh
                                public final /* synthetic */ void zza(Object obj2) {
                                    this.zza.zze((zzbsw) obj2);
                                }
                            }, zzbto.zza);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G6.L.k("refreshIfDestroyed: Lock released");
        zzbua zzbuaVar2 = this.zzh;
        if (zzbuaVar2 != null && zzbuaVar2.zzi() != -1) {
            int i5 = this.zzi;
            if (i5 == 0) {
                G6.L.k("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i5 != 1) {
                G6.L.k("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            G6.L.k("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        G6.L.k("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        zzbua zzbuaVar = this.zzh;
        if (zzbuaVar != null) {
            zzbuaVar.zzc();
            this.zzh = null;
        }
    }

    public final void zzd(zzbaw zzbawVar, final zzbua zzbuaVar) {
        C6.n.f1857D.k.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        try {
            G6.L.k("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbte zzbteVar = new zzbte(this.zzb, this.zzd, null, null);
            G6.L.k("loadJavascriptEngine > After createJavascriptEngine");
            G6.L.k("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbteVar.zzi(new zzbsv() { // from class: com.google.android.gms.internal.ads.zzbtp
                @Override // com.google.android.gms.internal.ads.zzbsv
                public final void zza() {
                    C6.n.f1857D.k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    final long j8 = jCurrentTimeMillis;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(jCurrentTimeMillis2 - j8));
                    String strValueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52);
                    sb2.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb2.append(strValueOf);
                    sb2.append(" ms.");
                    G6.L.k(sb2.toString());
                    G6.M m10 = U.f4562l;
                    final zzbub zzbubVar = this.zza;
                    final zzbua zzbuaVar2 = zzbuaVar;
                    final zzbsw zzbswVar = zzbteVar;
                    m10.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbubVar.zzf(zzbuaVar2, zzbswVar, arrayList2, j8);
                        }
                    }, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzd)).intValue());
                }
            });
            G6.L.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbteVar.zzm("/jsLoaded", new zzbtg(this, jCurrentTimeMillis, zzbuaVar, zzbteVar));
            G6.D d3 = new G6.D();
            zzbth zzbthVar = new zzbth(this, null, zzbteVar, d3);
            d3.f4500a = zzbthVar;
            G6.L.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((Boolean) zzbkx.zzd.zze()).booleanValue() || TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbteVar.zzm("/requestReload", zzbthVar);
            }
            String str = this.zzc;
            G6.L.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                G6.L.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbteVar.zzf(str);
                G6.L.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                G6.L.k("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbteVar.zzh(str);
                G6.L.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                G6.L.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbteVar.zzg(str);
                G6.L.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            G6.L.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            U.f4562l.postDelayed(new zzbtj(this, zzbuaVar, zzbteVar, arrayList, jCurrentTimeMillis), ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zze)).intValue());
        } catch (Throwable th) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error creating webview.", th);
            zzbio zzbioVar = zzbix.zziL;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                zzbuaVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zziN)).booleanValue()) {
                C6.n.f1857D.f1868h.zzi(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbuaVar.zzg();
            } else {
                C6.n.f1857D.f1868h.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbuaVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zze(zzbsw zzbswVar) {
        if (zzbswVar.zzk()) {
            this.zzi = 1;
        }
    }

    public final void zzf(zzbua zzbuaVar, final zzbsw zzbswVar, ArrayList arrayList, long j8) {
        G6.L.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                G6.L.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbuaVar.zzi() != -1 && zzbuaVar.zzi() != 1) {
                    zzbio zzbioVar = zzbix.zziL;
                    C0395s c0395s = C0395s.f2489e;
                    if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                        zzbuaVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbuaVar.zzg();
                    }
                    zzhcp zzhcpVar = zzcfy.zzf;
                    Objects.requireNonNull(zzbswVar);
                    zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbswVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(c0395s.f2492c.zzd(zzbix.zzd));
                    int iZzi = zzbuaVar.zzi();
                    int i5 = this.zzi;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    C6.n.f1857D.k.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() - j8;
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 94 + String.valueOf(iZzi).length() + 39 + String.valueOf(i5).length() + 57 + strValueOf2.length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                    sb2.append("Could not receive /jsLoaded in ");
                    sb2.append(strValueOf);
                    sb2.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                    sb2.append(iZzi);
                    sb2.append(". Update status(onEngLoadedTimeout) is ");
                    sb2.append(i5);
                    sb2.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                    sb2.append(strValueOf2);
                    sb2.append(" ms. Total latency(onEngLoadedTimeout) is ");
                    sb2.append(jCurrentTimeMillis);
                    sb2.append(" ms. Rejecting.");
                    G6.L.k(sb2.toString());
                    G6.L.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                G6.L.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzg() {
        return this.zza;
    }

    public final /* synthetic */ zzfqt zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzbua zzi() {
        return this.zzh;
    }

    public final /* synthetic */ void zzj(zzbua zzbuaVar) {
        this.zzh = zzbuaVar;
    }

    public final /* synthetic */ int zzk() {
        return this.zzi;
    }

    public final /* synthetic */ void zzl(int i5) {
        this.zzi = i5;
    }
}

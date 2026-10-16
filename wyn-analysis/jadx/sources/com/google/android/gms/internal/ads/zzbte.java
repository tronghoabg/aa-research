package com.google.android.gms.internal.ads;

import D6.C0392q;
import G6.U;
import android.content.Context;
import android.os.Looper;
import j$.util.Objects;
import java.util.Map;
import n7.InterfaceC3600e;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbte implements zzbsw, zzbsu {
    private zzclb zza;

    public zzbte(Context context, H6.a aVar, zzbaw zzbawVar, C6.a aVar2) throws zzclq {
        zzclr zzclrVar = C6.n.f1857D.f1864d;
        zzclb zzclbVarZza = zzclr.zza(context, zzcnl.zzb(), "", false, false, null, null, aVar, null, null, null, zzbhw.zza(), null, null, null, null, null);
        this.zza = zzclbVarZza;
        zzclbVarZza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        H6.f fVar = C0392q.f2477g.f2478a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            G6.L.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            G6.L.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (U.f4562l.post(runnable)) {
                return;
            }
            H6.l.f("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zza(final String str) {
        G6.L.k("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final /* synthetic */ void zzb(String str, JSONObject jSONObject) {
        AbstractC1748l.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final /* synthetic */ void zzc(String str, String str2) {
        AbstractC1748l.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    public final /* synthetic */ void zzd(String str, JSONObject jSONObject) {
        AbstractC1748l.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    public final /* synthetic */ void zze(String str, Map map) {
        AbstractC1748l.d(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf(String str) {
        G6.L.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzg(final String str) {
        G6.L.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzh(final String str) {
        G6.L.k("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbta
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi(final zzbsv zzbsvVar) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzcmz zzcmzVarZzP = zzclbVar.zzP();
            Objects.requireNonNull(zzbsvVar);
            zzcmzVarZzP.zzH(new zzcmy() { // from class: com.google.android.gms.internal.ads.zzbsy
                @Override // com.google.android.gms.internal.ads.zzcmy
                public final /* synthetic */ void zza() {
                    zzbsvVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzk() {
        zzclb zzclbVar = this.zza;
        return zzclbVar == null || zzclbVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final zzbud zzl() {
        return new zzbud(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzm(String str, zzbpx zzbpxVar) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.zzab(str, new zzbsx(this, zzbpxVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzn(String str, final zzbpx zzbpxVar) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.zzad(str, new InterfaceC3600e() { // from class: com.google.android.gms.internal.ads.zzbtc
                @Override // n7.InterfaceC3600e
                public final /* synthetic */ boolean apply(Object obj) {
                    zzbpx zzbpxVar2 = (zzbpx) obj;
                    if (zzbpxVar2 instanceof zzbsx) {
                        return ((zzbsx) zzbpxVar2).zzb().equals(zzbpxVar);
                    }
                    return false;
                }
            });
        }
    }

    public final /* synthetic */ void zzo(String str) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.zza(str);
        }
    }

    public final /* synthetic */ void zzp(String str) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.loadData(str, "text/html", "UTF-8");
        }
    }

    public final /* synthetic */ void zzq(String str) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.loadData(str, "text/html", "UTF-8");
        }
    }

    public final /* synthetic */ void zzr(String str) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.loadUrl(str);
        }
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.InterfaceC0358a;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import cb.AbstractC1593a;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdwp {
    private final zzdcx zza;
    private final zzdle zzb;
    private final zzdeg zzc;
    private final zzdet zzd;
    private final zzdfk zze;
    private final zzdid zzf;
    private final Executor zzg;
    private final zzdla zzh;
    private final zzcun zzi;
    private final C6.b zzj;
    private final zzcdu zzk;
    private final zzbaw zzl;
    private final zzdhu zzm;
    private final zzeko zzn;
    private final zzfsm zzo;
    private final zzdzt zzp;
    private final zzctq zzq;
    private final zzdwv zzr;
    private final zzeaw zzs;
    private final zzdca zzt;
    private final zzdbv zzu;

    public zzdwp(zzdcx zzdcxVar, zzdeg zzdegVar, zzdet zzdetVar, zzdfk zzdfkVar, zzdid zzdidVar, Executor executor, zzdla zzdlaVar, zzcun zzcunVar, C6.b bVar, zzcdu zzcduVar, zzbaw zzbawVar, zzdhu zzdhuVar, zzeko zzekoVar, zzfsm zzfsmVar, zzdzt zzdztVar, zzdle zzdleVar, zzctq zzctqVar, zzdwv zzdwvVar, zzeaw zzeawVar, zzdca zzdcaVar, zzdbv zzdbvVar) {
        this.zza = zzdcxVar;
        this.zzc = zzdegVar;
        this.zzd = zzdetVar;
        this.zze = zzdfkVar;
        this.zzf = zzdidVar;
        this.zzg = executor;
        this.zzh = zzdlaVar;
        this.zzi = zzcunVar;
        this.zzj = bVar;
        this.zzk = zzcduVar;
        this.zzl = zzbawVar;
        this.zzm = zzdhuVar;
        this.zzn = zzekoVar;
        this.zzo = zzfsmVar;
        this.zzp = zzdztVar;
        this.zzb = zzdleVar;
        this.zzq = zzctqVar;
        this.zzr = zzdwvVar;
        this.zzs = zzeawVar;
        this.zzt = zzdcaVar;
        this.zzu = zzdbvVar;
    }

    public static final p8.p zzj(zzclb zzclbVar, String str, String str2, final zzdzo zzdzoVar, zzfqq zzfqqVar) {
        zzbio zzbioVar = zzbix.zzcV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, zzdzoVar, zzdzc.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcgd zzcgdVar = new zzcgd();
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkq)).booleanValue()) {
            zzfqg zzfqgVarA = u.a(zzclbVar.getContext(), 112);
            zzfqgVarA.zza();
            zzfqp.zzd(zzcgdVar, zzfqqVar, zzfqgVarA);
        }
        zzclbVar.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdwn
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final void zza(boolean z2, int i5, String str3, String str4) {
                zzcgd zzcgdVar2 = zzcgdVar;
                if (z2) {
                    if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcV)).booleanValue()) {
                        AbstractC1593a.y(C6.n.f1857D.k, zzdzoVar, zzdzc.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcgdVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i5).length();
                StringBuilder sb2 = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb2.append("Ad Web View failed to load. Error code: ");
                sb2.append(i5);
                sb2.append(", Description: ");
                sb2.append(str3);
                zzcgdVar2.zzd(new Exception(wg.b.c(sb2, ", Failing URL: ", str4)));
            }
        });
        zzclbVar.zzau(str, str2, null);
        return zzcgdVar;
    }

    public final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    public final boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlH)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.f1809b = true;
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zze(View view) {
        this.zzj.f1809b = true;
    }

    public final /* synthetic */ void zzf(zzclb zzclbVar, zzclb zzclbVar2, Map map) {
        this.zzi.zzn(zzclbVar);
    }

    public final /* synthetic */ zzdeg zzg() {
        return this.zzc;
    }

    public final /* synthetic */ zzdhu zzh() {
        return this.zzm;
    }

    public final void zzi(final zzclb zzclbVar, boolean z2, zzbqa zzbqaVar, zzdzo zzdzoVar) {
        zzbar zzbarVarZzb;
        zzbio zzbioVar = zzbix.zzcV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, zzdzoVar, zzdzc.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzclbVar.zzP().zzab(new InterfaceC0358a() { // from class: com.google.android.gms.internal.ads.zzdwo
            @Override // D6.InterfaceC0358a
            public final /* synthetic */ void onAdClicked() {
                this.zza.zza();
            }
        }, this.zzd, this.zze, new zzbop() { // from class: com.google.android.gms.internal.ads.zzdwh
            @Override // com.google.android.gms.internal.ads.zzbop
            public final /* synthetic */ void zzb(String str, String str2) {
                this.zza.zzb(str, str2);
            }
        }, new F6.c() { // from class: com.google.android.gms.internal.ads.zzdwi
            @Override // F6.c
            public final /* synthetic */ void zzl() {
                this.zza.zzc();
            }
        }, z2, zzbqaVar, this.zzj, new zzdwg(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt, this.zzu);
        zzclbVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdwj
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzd(view, motionEvent);
                return false;
            }
        });
        zzclbVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdwk
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.zza.zze(view);
            }
        });
        zzbio zzbioVar2 = zzbix.zzdE;
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue() && (zzbarVarZzb = this.zzl.zzb()) != null) {
            zzbarVarZzb.zzh(zzclbVar.zzE());
        }
        zzdla zzdlaVar = this.zzh;
        Executor executor = this.zzg;
        zzdlaVar.zzq(zzclbVar, executor);
        zzdlaVar.zzq(new zzbex() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzbex
            public final /* synthetic */ void zzdj(zzbew zzbewVar) {
                Rect rect = zzbewVar.zzd;
                zzclbVar.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzdlaVar.zza(zzclbVar.zzE());
        zzclbVar.zzab("/trackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdwm
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzf(zzclbVar, (zzclb) obj, map);
            }
        });
        this.zzi.zzo(zzclbVar);
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, zzdzoVar, zzdzc.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}

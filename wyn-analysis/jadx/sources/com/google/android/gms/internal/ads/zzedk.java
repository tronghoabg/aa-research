package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.InterfaceC0404w0;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes3.dex */
public final class zzedk implements F6.o, zzcmx {
    private final Context zza;
    private final H6.a zzb;
    private zzecz zzc;
    private zzclb zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private InterfaceC0404w0 zzh;
    private boolean zzi;

    public zzedk(Context context, H6.a aVar) {
        this.zza = context;
        this.zzb = aVar;
    }

    private final synchronized boolean zzq(InterfaceC0404w0 interfaceC0404w0) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkv)).booleanValue()) {
            int i5 = G6.L.f4523b;
            H6.l.f("Ad inspector had an internal error.");
            try {
                interfaceC0404w0.zze(zzfmi.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i10 = G6.L.f4523b;
            H6.l.f("Ad inspector had an internal error.");
            try {
                C6.n.f1857D.f1868h.zzh(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                interfaceC0404w0.zze(zzfmi.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            C6.n.f1857D.k.getClass();
            if (System.currentTimeMillis() >= this.zzg + ((Integer) r1.f2492c.zzd(zzbix.zzky)).intValue()) {
                return true;
            }
        }
        int i11 = G6.L.f4523b;
        H6.l.f("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC0404w0.zze(zzfmi.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmx
    public final synchronized void zza(boolean z2, int i5, String str, String str2) {
        if (z2) {
            G6.L.k("Ad inspector loaded.");
            this.zze = true;
            zzn();
            return;
        }
        int i10 = G6.L.f4523b;
        H6.l.f("Ad inspector failed to load.");
        try {
            zzcfk zzcfkVar = C6.n.f1857D.f1868h;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb2.append("Failed to load UI. Error code: ");
            sb2.append(i5);
            sb2.append(", Description: ");
            sb2.append(str);
            sb2.append(", Failing URL: ");
            sb2.append(str2);
            zzcfkVar.zzh(new Exception(sb2.toString()), "InspectorUi.onAdWebViewFinishedLoading 0");
            InterfaceC0404w0 interfaceC0404w0 = this.zzh;
            if (interfaceC0404w0 != null) {
                interfaceC0404w0.zze(zzfmi.zzd(17, null, null));
            }
        } catch (RemoteException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // F6.o
    public final void zzdT() {
    }

    @Override // F6.o
    public final synchronized void zzdU(int i5) {
        this.zzd.destroy();
        if (!this.zzi) {
            G6.L.k("Inspector closed.");
            InterfaceC0404w0 interfaceC0404w0 = this.zzh;
            if (interfaceC0404w0 != null) {
                try {
                    interfaceC0404w0.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Override // F6.o
    public final void zzdo() {
    }

    @Override // F6.o
    public final void zzdp() {
    }

    @Override // F6.o
    public final void zzdq() {
    }

    @Override // F6.o
    public final void zzdv() {
    }

    @Override // F6.o
    public final void zzdw() {
    }

    @Override // F6.o
    public final void zzdx() {
    }

    @Override // F6.o
    public final void zzdy() {
    }

    @Override // F6.o
    public final void zzdz() {
    }

    @Override // F6.o
    public final synchronized void zzh() {
        this.zzf = true;
        zzn();
    }

    public final void zzl(zzecz zzeczVar) {
        this.zzc = zzeczVar;
    }

    public final synchronized void zzm(InterfaceC0404w0 interfaceC0404w0, zzbqs zzbqsVar, zzbql zzbqlVar, zzbpy zzbpyVar) {
        if (zzq(interfaceC0404w0)) {
            try {
                C6.n nVar = C6.n.f1857D;
                zzclr zzclrVar = nVar.f1864d;
                zzclb zzclbVarZza = zzclr.zza(this.zza, zzcnl.zzb(), "", false, false, null, null, this.zzb, null, null, null, zzbhw.zza(), null, null, null, null, null);
                this.zzd = zzclbVarZza;
                zzcmz zzcmzVarZzP = zzclbVarZza.zzP();
                if (zzcmzVarZzP == null) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("Failed to obtain a web view for the ad inspector");
                    try {
                        nVar.f1868h.zzh(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        interfaceC0404w0.zze(zzfmi.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e7) {
                        C6.n.f1857D.f1868h.zzh(e7, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = interfaceC0404w0;
                Context context = this.zza;
                zzcmzVarZzP.zzab(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbqsVar, null, new zzbqr(context), zzbqlVar, zzbpyVar, null, null, null, null);
                zzcmzVarZzP.zzG(this);
                this.zzd.loadUrl((String) C0395s.f2489e.f2492c.zzd(zzbix.zzkw));
                Xd.c.t(context, new AdOverlayInfoParcel(this, this.zzd, this.zzb), true, null);
                nVar.k.getClass();
                this.zzg = System.currentTimeMillis();
            } catch (zzclq e10) {
                int i10 = G6.L.f4523b;
                H6.l.g("Failed to obtain a web view for the ad inspector", e10);
                try {
                    C6.n.f1857D.f1868h.zzh(e10, "InspectorUi.openInspector 0");
                    interfaceC0404w0.zze(zzfmi.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e11) {
                    C6.n.f1857D.f1868h.zzh(e11, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzn() {
        if (this.zze && this.zzf) {
            zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp();
                }
            });
        }
    }

    public final Activity zzo() {
        zzclb zzclbVar = this.zzd;
        if (zzclbVar == null || zzclbVar.zzX()) {
            return null;
        }
        return this.zzd.zzj();
    }

    public final /* synthetic */ void zzp() {
        this.zzd.zzc("window.inspectorInfo", this.zzc.zzr().toString());
    }
}

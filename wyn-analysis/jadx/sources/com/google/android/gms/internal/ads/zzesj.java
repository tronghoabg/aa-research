package com.google.android.gms.internal.ads;

import D6.A0;
import D6.A1;
import D6.C0369e0;
import D6.C0395s;
import D6.H0;
import D6.InterfaceC0362b0;
import D6.InterfaceC0373g0;
import D6.InterfaceC0401v;
import D6.InterfaceC0407y;
import D6.L0;
import D6.O0;
import D6.r1;
import D6.v1;
import D6.x1;
import G6.U;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Collections;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzesj extends D6.K {
    private final Context zza;
    private final InterfaceC0407y zzb;
    private final zzflg zzc;
    private final zzcvs zzd;
    private final ViewGroup zze;
    private final zzdzt zzf;

    public zzesj(Context context, InterfaceC0407y interfaceC0407y, zzflg zzflgVar, zzcvs zzcvsVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = interfaceC0407y;
        this.zzc = zzflgVar;
        this.zzd = zzcvsVar;
        this.zzf = zzdztVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZza = zzcvsVar.zza();
        U u10 = C6.n.f1857D.f1863c;
        frameLayout.addView(viewZza, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzn().f2532c);
        frameLayout.setMinimumWidth(zzn().f2535f);
        this.zze = frameLayout;
    }

    @Override // D6.L
    public final boolean zzA() throws RemoteException {
        zzcvs zzcvsVar = this.zzd;
        return zzcvsVar != null && zzcvsVar.zzs();
    }

    @Override // D6.L
    public final boolean zzB() throws RemoteException {
        return false;
    }

    @Override // D6.L
    public final void zzC(zzccc zzcccVar) throws RemoteException {
    }

    @Override // D6.L
    public final void zzD(String str) throws RemoteException {
    }

    @Override // D6.L
    public final void zzE(String str) throws RemoteException {
    }

    @Override // D6.L
    public final L0 zzF() throws RemoteException {
        return this.zzd.zzc();
    }

    @Override // D6.L
    public final void zzG(r1 r1Var) throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D6.L
    public final void zzJ(zzbgt zzbgtVar) throws RemoteException {
    }

    @Override // D6.L
    public final void zzK(boolean z2) throws RemoteException {
    }

    @Override // D6.L
    public final void zzP(A0 a02) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznk)).booleanValue()) {
            int i5 = G6.L.f4523b;
            H6.l.e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzetk zzetkVar = this.zzc.zzc;
        if (zzetkVar != null) {
            try {
                if (!a02.zzf()) {
                    this.zzf.zzb();
                }
            } catch (RemoteException e7) {
                int i10 = G6.L.f4523b;
                H6.l.b("Error in making CSI ping for reporting paid event callback", e7);
            }
            zzetkVar.zzp(a02);
        }
    }

    @Override // D6.L
    public final void zzT(long j8) {
        zzcvs zzcvsVar = this.zzd;
        if (zzcvsVar.zzo() != null) {
            zzcvsVar.zzo().zzb(j8);
        }
    }

    @Override // D6.L
    public final long zzU() {
        zzcvs zzcvsVar = this.zzd;
        if (zzcvsVar == null || zzcvsVar.zzo() == null) {
            return 0L;
        }
        return zzcvsVar.zzo().zza();
    }

    @Override // D6.L
    public final void zzY(C0369e0 c0369e0) throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D6.L
    public final InterfaceC3876a zzb() throws RemoteException {
        return new BinderC3877b(this.zze);
    }

    @Override // D6.L
    public final void zzc() throws RemoteException {
        AbstractC1732v.e("destroy must be called on the main UI thread.");
        this.zzd.zzd();
    }

    @Override // D6.L
    public final boolean zzd() throws RemoteException {
        return false;
    }

    @Override // D6.L
    public final void zzdS(InterfaceC0407y interfaceC0407y) throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D6.L
    public final boolean zze(v1 v1Var) throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // D6.L
    public final void zzf() throws RemoteException {
        AbstractC1732v.e("destroy must be called on the main UI thread.");
        this.zzd.zzl().zza(null);
    }

    @Override // D6.L
    public final void zzg() throws RemoteException {
        AbstractC1732v.e("destroy must be called on the main UI thread.");
        this.zzd.zzl().zzb(null);
    }

    @Override // D6.L
    public final void zzi(InterfaceC0362b0 interfaceC0362b0) throws RemoteException {
        zzetk zzetkVar = this.zzc.zzc;
        if (zzetkVar != null) {
            zzetkVar.zzo(interfaceC0362b0);
        }
    }

    @Override // D6.L
    public final void zzj(D6.O o7) throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D6.L
    public final Bundle zzk() throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // D6.L
    public final void zzl() throws RemoteException {
    }

    @Override // D6.L
    public final void zzm() throws RemoteException {
        this.zzd.zzi();
    }

    @Override // D6.L
    public final x1 zzn() {
        AbstractC1732v.e("getAdSize must be called on the main UI thread.");
        return zzflm.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // D6.L
    public final void zzo(x1 x1Var) throws RemoteException {
        AbstractC1732v.e("setAdSize must be called on the main UI thread.");
        zzcvs zzcvsVar = this.zzd;
        if (zzcvsVar != null) {
            zzcvsVar.zzb(this.zze, x1Var);
        }
    }

    @Override // D6.L
    public final void zzp(zzbzr zzbzrVar) throws RemoteException {
    }

    @Override // D6.L
    public final void zzq(zzbzu zzbzuVar, String str) throws RemoteException {
    }

    @Override // D6.L
    public final String zzr() throws RemoteException {
        zzcvs zzcvsVar = this.zzd;
        if (zzcvsVar.zzn() != null) {
            return zzcvsVar.zzn().zze();
        }
        return null;
    }

    @Override // D6.L
    public final String zzs() throws RemoteException {
        zzcvs zzcvsVar = this.zzd;
        if (zzcvsVar.zzn() != null) {
            return zzcvsVar.zzn().zze();
        }
        return null;
    }

    @Override // D6.L
    public final H0 zzt() {
        return this.zzd.zzn();
    }

    @Override // D6.L
    public final String zzu() throws RemoteException {
        return this.zzc.zzg;
    }

    @Override // D6.L
    public final InterfaceC0362b0 zzv() throws RemoteException {
        return this.zzc.zzo;
    }

    @Override // D6.L
    public final InterfaceC0407y zzw() throws RemoteException {
        return this.zzb;
    }

    @Override // D6.L
    public final void zzx(zzbjs zzbjsVar) throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D6.L
    public final void zzy(InterfaceC0401v interfaceC0401v) throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D6.L
    public final void zzz(boolean z2) throws RemoteException {
        int i5 = G6.L.f4523b;
        H6.l.e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D6.L
    public final void zzH(O0 o02) throws RemoteException {
    }

    @Override // D6.L
    public final void zzI(A1 a12) throws RemoteException {
    }

    @Override // D6.L
    public final void zzR(InterfaceC3876a interfaceC3876a) {
    }

    @Override // D6.L
    public final void zzS(InterfaceC0373g0 interfaceC0373g0) {
    }

    @Override // D6.L
    public final void zzQ(v1 v1Var, D6.B b5) {
    }
}

package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbxz implements F6.o {
    final /* synthetic */ zzbyb zza;

    public zzbxz(zzbyb zzbybVar) {
        Objects.requireNonNull(zzbybVar);
        this.zza = zzbybVar;
    }

    @Override // F6.o
    public final void zzdT() {
        H6.l.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // F6.o
    public final void zzdU(int i5) {
        H6.l.a("AdMobCustomTabsAdapter overlay is closed.");
        zzbyb zzbybVar = this.zza;
        zzbybVar.zzb().onAdClosed(zzbybVar);
    }

    @Override // F6.o
    public final void zzdo() {
        H6.l.a("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // F6.o
    public final void zzdp() {
        H6.l.a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // F6.o
    public final void zzdq() {
        H6.l.a("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // F6.o
    public final void zzdv() {
    }

    @Override // F6.o
    public final void zzdw() {
        H6.l.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // F6.o
    public final void zzdx() {
        H6.l.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // F6.o
    public final void zzdy() {
        H6.l.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // F6.o
    public final void zzdz() {
        H6.l.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // F6.o
    public final void zzh() {
        H6.l.a("Opening AdMobCustomTabsAdapter overlay.");
        zzbyb zzbybVar = this.zza;
        zzbybVar.zzb().onAdOpened(zzbybVar);
    }
}

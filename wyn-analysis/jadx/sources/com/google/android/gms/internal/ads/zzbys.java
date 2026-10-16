package com.google.android.gms.internal.ads;

import D6.BinderC0363b1;
import D6.BinderC0393q0;
import D6.C0398t0;
import D6.H0;
import D6.InterfaceC0396s0;
import D6.e1;
import D6.n1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import x6.InterfaceC4482m;
import x6.InterfaceC4483n;
import x6.InterfaceC4484o;
import x6.InterfaceC4486q;

/* loaded from: classes3.dex */
public final class zzbys extends NativeAd {
    private final zzboc zza;
    private final zzbyr zzc;
    private final com.google.android.gms.ads.nativead.b zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();
    private final AtomicLong zzf = new AtomicLong();

    public zzbys(zzboc zzbocVar) {
        zzbml zzbmlVarZzh;
        this.zza = zzbocVar;
        zzbyp zzbypVar = null;
        try {
            List listZzf = zzbocVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    zzbml zzbmlVarZzh2 = obj instanceof IBinder ? zzbmk.zzh((IBinder) obj) : null;
                    if (zzbmlVarZzh2 != null) {
                        this.zzb.add(new zzbyr(zzbmlVarZzh2));
                    }
                }
            }
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
        try {
            List listZzz = this.zza.zzz();
            if (listZzz != null) {
                for (Object obj2 : listZzz) {
                    InterfaceC0396s0 interfaceC0396s0R = obj2 instanceof IBinder ? BinderC0363b1.R((IBinder) obj2) : null;
                    if (interfaceC0396s0R != null) {
                        this.zze.add(new C0398t0(interfaceC0396s0R));
                    }
                }
            }
        } catch (RemoteException e10) {
            H6.l.d("", e10);
        }
        try {
            zzbmlVarZzh = this.zza.zzh();
        } catch (RemoteException e11) {
            H6.l.d("", e11);
        }
        zzbyr zzbyrVar = zzbmlVarZzh != null ? new zzbyr(zzbmlVarZzh) : null;
        this.zzc = zzbyrVar;
        try {
            if (this.zza.zzq() != null) {
                zzbypVar = new zzbyp(this.zza.zzq());
            }
        } catch (RemoteException e12) {
            H6.l.d("", e12);
        }
        this.zzd = zzbypVar;
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzy();
        } catch (RemoteException e7) {
            H6.l.d("Failed to cancelUnconfirmedClick", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzp();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final com.google.android.gms.ads.nativead.b getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle bundleZzw = this.zza.zzw();
            if (bundleZzw != null) {
                return bundleZzw;
            }
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.zza.zze();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.nativead.c getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<com.google.android.gms.ads.nativead.c> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final InterfaceC4482m getMediaContent() {
        try {
            zzboc zzbocVar = this.zza;
            if (zzbocVar.zzF() != null) {
                return new e1(zzbocVar.zzF(), null);
            }
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
        return null;
    }

    public final List<InterfaceC4484o> getMuteThisAdReasons() {
        return this.zze;
    }

    public final long getPlacementId() {
        long j8;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long jZzK = this.zza.zzK();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(jZzK);
                    j8 = atomicLong2.get();
                } catch (RemoteException e7) {
                    H6.l.d("Failed to getPlacementId", e7);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8;
    }

    public final String getPrice() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final x6.t getResponseInfo() {
        H0 h0ZzH;
        try {
            h0ZzH = this.zza.zzH();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            h0ZzH = null;
        }
        if (h0ZzH != null) {
            return new x6.t(h0ZzH);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double dZzk = this.zza.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return false;
        }
    }

    public final void muteThisAd(InterfaceC4484o interfaceC4484o) {
        try {
            try {
                if (this.zza.zzA()) {
                    if (interfaceC4484o == null) {
                        this.zza.zzB(null);
                        return;
                    } else if (interfaceC4484o instanceof C0398t0) {
                        this.zza.zzB(((C0398t0) interfaceC4484o).f2497b);
                        return;
                    } else {
                        H6.l.c("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e7) {
                H6.l.d("", e7);
            }
            H6.l.c("Ad is not custom mute enabled");
        } catch (RemoteException e10) {
            H6.l.d("", e10);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zza.zzE();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzJ(bundle);
        } catch (RemoteException e7) {
            H6.l.d("Failed to record native event", e7);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final void setMuteThisAdListener(InterfaceC4483n interfaceC4483n) {
        try {
            this.zza.zzC(new BinderC0393q0("com.google.android.gms.ads.internal.client.IMuteThisAdListener"));
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(InterfaceC4486q interfaceC4486q) {
        try {
            this.zza.zzI(new n1(interfaceC4486q));
        } catch (RemoteException e7) {
            H6.l.d("Failed to setOnPaidEventListener", e7);
        }
    }

    public final void setPlacementId(long j8) {
        try {
            this.zza.zzL(j8);
            this.zzf.set(j8);
        } catch (RemoteException e7) {
            H6.l.d("Failed to setPlacementId", e7);
        }
    }

    public final void setUnconfirmedClickListener(com.google.android.gms.ads.nativead.e eVar) {
        try {
            this.zza.zzx(new zzbyy(eVar));
        } catch (RemoteException e7) {
            H6.l.d("Failed to setUnconfirmedClickListener", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzu();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }
}

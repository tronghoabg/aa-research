package com.google.android.gms.internal.ads;

import D6.BinderC0363b1;
import D6.C0398t0;
import D6.InterfaceC0396s0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import java.util.ArrayList;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbod {
    private final zzboc zza;
    private final zzbmm zzc;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zze = new ArrayList();

    public zzbod(zzboc zzbocVar) {
        zzbml zzbmjVar;
        IBinder iBinder;
        this.zza = zzbocVar;
        zzbmm zzbmmVar = null;
        try {
            List listZzf = zzbocVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzbmjVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbmjVar = iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(iBinder);
                    }
                    if (zzbmjVar != null) {
                        this.zzb.add(new zzbmm(zzbmjVar));
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
            zzbml zzbmlVarZzh = this.zza.zzh();
            if (zzbmlVarZzh != null) {
                zzbmmVar = new zzbmm(zzbmlVarZzh);
            }
        } catch (RemoteException e11) {
            H6.l.d("", e11);
        }
        this.zzc = zzbmmVar;
        try {
            if (this.zza.zzq() != null) {
                new zzbmf(this.zza.zzq());
            }
        } catch (RemoteException e12) {
            H6.l.d("", e12);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
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

    public final String zza() {
        try {
            return this.zza.zze();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final List zzb() {
        return this.zzb;
    }

    public final String zzc() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final A6.b zzd() {
        return this.zzc;
    }

    public final String zze() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final String zzf() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final Double zzg() {
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

    public final String zzh() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final String zzi() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final VideoController zzj() {
        try {
            zzboc zzbocVar = this.zza;
            if (zzbocVar.zzn() != null) {
                this.zzd.a(zzbocVar.zzn());
            }
        } catch (RemoteException e7) {
            H6.l.d("Exception occurred while getting video controller", e7);
        }
        return this.zzd;
    }

    public final Object zzk() {
        try {
            InterfaceC3876a interfaceC3876aZzv = this.zza.zzv();
            if (interfaceC3876aZzv != null) {
                return BinderC3877b.S(interfaceC3876aZzv);
            }
            return null;
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }
}

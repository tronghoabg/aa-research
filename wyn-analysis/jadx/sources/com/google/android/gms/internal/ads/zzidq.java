package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class zzidq implements zzigm {
    private final zzidp zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzidq(zzidp zzidpVar) {
        zzidpVar.getClass();
        this.zza = zzidpVar;
        zzidpVar.zzd = this;
    }

    private final void zzQ(int i5) throws IOException {
        if ((this.zzb & 7) != i5) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        zzidp zzidpVar = this.zza;
        int iZzo = zzidpVar.zzo();
        zzidpVar.zzJ();
        int iZzB = zzidpVar.zzB(iZzo);
        zzidpVar.zza++;
        zzigrVar.zzg(obj, this, zzidzVar);
        zzidpVar.zzb(0);
        zzidpVar.zza--;
        zzidpVar.zzC(iZzB);
    }

    private final Object zzS(zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        Object objZza = zzigrVar.zza();
        zzR(objZza, zzigrVar, zzidzVar);
        zzigrVar.zzk(objZza);
        return objZza;
    }

    private final void zzT(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        int i5 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzigrVar.zzg(obj, this, zzidzVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzifh("Failed to parse the message.");
            }
        } finally {
            this.zzc = i5;
        }
    }

    private final Object zzU(zzihq zzihqVar, Class cls, zzidz zzidzVar) throws IOException {
        zzihq zzihqVar2 = zzihq.zza;
        switch (zzihqVar.ordinal()) {
            case 0:
                return Double.valueOf(zze());
            case 1:
                return Float.valueOf(zzf());
            case 2:
                return Long.valueOf(zzh());
            case 3:
                return Long.valueOf(zzg());
            case 4:
                return Integer.valueOf(zzi());
            case 5:
                return Long.valueOf(zzj());
            case 6:
                return Integer.valueOf(zzk());
            case 7:
                return Boolean.valueOf(zzl());
            case 8:
                return zzn();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                zzQ(2);
                return zzS(zzigj.zza().zzb(cls), zzidzVar);
            case 11:
                return zzq();
            case 12:
                return Integer.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Integer.valueOf(zzt());
            case 15:
                return Long.valueOf(zzu());
            case 16:
                return Integer.valueOf(zzv());
            case 17:
                return Long.valueOf(zzw());
        }
    }

    private final void zzV(int i5) throws IOException {
        if (this.zza.zzE() != i5) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i5) throws IOException {
        if ((i5 & 3) != 0) {
            throw new zzifh("Failed to parse the message.");
        }
    }

    private static final void zzX(int i5) throws IOException {
        if ((i5 & 7) != 0) {
            throw new zzifh("Failed to parse the message.");
        }
    }

    public static zzidq zza(zzidp zzidpVar) {
        Object obj = zzidpVar.zzd;
        return obj != null ? (zzidq) obj : new zzidq(zzidpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzA(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i5 = this.zzb & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzifnVar.zzd(zzidpVar.zzg());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzg());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Long.valueOf(zzidpVar3.zzg()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzg()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzB(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i5 = this.zzb & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzieqVar.zzi(zzidpVar.zzh());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzh());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzh()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzh()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzC(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i5 = this.zzb & 7;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzX(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzifnVar.zzd(zzidpVar.zzi());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzi());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Long.valueOf(zzidpVar3.zzi()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzi()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzD(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzW(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzieqVar.zzi(zzidpVar.zzj());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            if (i5 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzj());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzj()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            if (i10 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzj()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzE(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzidb) {
            zzidb zzidbVar = (zzidb) list;
            int i5 = this.zzb & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzidbVar.zzg(zzidpVar.zzk());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzidbVar.zzg(zzidpVar2.zzk());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zzidpVar3.zzk()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Boolean.valueOf(zzidpVar4.zzk()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    public final void zzF(List list, boolean z2) throws IOException {
        int iZza;
        int iZza2;
        if ((this.zzb & 7) != 2) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzifk) && !z2) {
            zzifk zzifkVar = (zzifk) list;
            do {
                zzq();
                zzifkVar.zzb();
                zzidp zzidpVar = this.zza;
                if (zzidpVar.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            do {
                list.add(z2 ? zzn() : zzm());
                zzidp zzidpVar2 = this.zza;
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar2.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzG(List list, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        int iZza;
        int i5 = this.zzb;
        if ((i5 & 7) != 2) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zzigrVar, zzidzVar));
            zzidp zzidpVar = this.zza;
            if (zzidpVar.zzD() || this.zzd != 0) {
                return;
            } else {
                iZza = zzidpVar.zza();
            }
        } while (iZza == i5);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    @Deprecated
    public final void zzH(List list, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        int iZza;
        int i5 = this.zzb;
        if ((i5 & 7) != 3) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZza = zzigrVar.zza();
            zzT(objZza, zzigrVar, zzidzVar);
            zzigrVar.zzk(objZza);
            list.add(objZza);
            zzidp zzidpVar = this.zza;
            if (zzidpVar.zzD() || this.zzd != 0) {
                return;
            } else {
                iZza = zzidpVar.zza();
            }
        } while (iZza == i5);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzI(List list) throws IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            zzidp zzidpVar = this.zza;
            if (zzidpVar.zzD()) {
                return;
            } else {
                iZza = zzidpVar.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzJ(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i5 = this.zzb & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzieqVar.zzi(zzidpVar.zzo());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzo());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzo()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzo()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzK(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i5 = this.zzb & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzieqVar.zzi(zzidpVar.zzp());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzp());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzp()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzp()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzL(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzW(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzieqVar.zzi(zzidpVar.zzq());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            if (i5 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzq());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzq()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            if (i10 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzq()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzM(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i5 = this.zzb & 7;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzX(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzifnVar.zzd(zzidpVar.zzr());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzr());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Long.valueOf(zzidpVar3.zzr()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzr()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzN(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i5 = this.zzb & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzieqVar.zzi(zzidpVar.zzs());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzs());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzs()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzs()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzO(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i5 = this.zzb & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzifnVar.zzd(zzidpVar.zzt());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzt());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Long.valueOf(zzidpVar3.zzt()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzt()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r9.zza.zzC(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.ads.zzigm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzP(java.util.Map r10, com.google.android.gms.internal.ads.zzifr r11, com.google.android.gms.internal.ads.zzidz r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            r9.zzQ(r0)
            com.google.android.gms.internal.ads.zzidp r1 = r9.zza
            int r2 = r1.zzo()
            int r2 = r1.zzB(r2)
            java.lang.Object r3 = r11.zzd
            java.lang.Object r4 = r11.zzb
            r5 = r3
        L13:
            int r6 = r9.zzb()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5b
            boolean r7 = r1.zzD()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L5b
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L46
            if (r6 == r0) goto L3b
            boolean r6 = r9.zzd()     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.google.android.gms.internal.ads.zzifh r6 = new com.google.android.gms.internal.ads.zzifh     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
            throw r6     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
        L37:
            r10 = move-exception
            goto L64
        L39:
            r6 = move-exception
            goto L4e
        L3b:
            com.google.android.gms.internal.ads.zzihq r6 = r11.zzc     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
            java.lang.Object r5 = r9.zzU(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
            goto L13
        L46:
            com.google.android.gms.internal.ads.zzihq r6 = r11.zza     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
            r7 = 0
            java.lang.Object r4 = r9.zzU(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzifg -> L39
            goto L13
        L4e:
            boolean r7 = r9.zzd()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L55
            goto L13
        L55:
            com.google.android.gms.internal.ads.zzifh r10 = new com.google.android.gms.internal.ads.zzifh     // Catch: java.lang.Throwable -> L37
            r10.<init>(r8, r6)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L5b:
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzidp r10 = r9.zza
            r10.zzC(r2)
            return
        L64:
            com.google.android.gms.internal.ads.zzidp r11 = r9.zza
            r11.zzC(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidq.zzP(java.util.Map, com.google.android.gms.internal.ads.zzifr, com.google.android.gms.internal.ads.zzidz):void");
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzb() throws IOException {
        int iZza = this.zzd;
        if (iZza != 0) {
            this.zzb = iZza;
            this.zzd = 0;
        } else {
            iZza = this.zza.zza();
            this.zzb = iZza;
        }
        return (iZza == 0 || iZza == this.zzc) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : iZza >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() throws IOException {
        int i5;
        zzidp zzidpVar = this.zza;
        if (zzidpVar.zzD() || (i5 = this.zzb) == this.zzc) {
            return false;
        }
        return zzidpVar.zzc(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final double zze() throws IOException {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final float zzf() throws IOException {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzg() throws IOException {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzh() throws IOException {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzi() throws IOException {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzj() throws IOException {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzk() throws IOException {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final boolean zzl() throws IOException {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final String zzm() throws IOException {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final String zzn() throws IOException {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzo(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        zzQ(2);
        zzR(obj, zzigrVar, zzidzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzp(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        zzQ(3);
        zzT(obj, zzigrVar, zzidzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final zzidl zzq() throws IOException {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzr() throws IOException {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzs() throws IOException {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzt() throws IOException {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzu() throws IOException {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzv() throws IOException {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzw() throws IOException {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzx(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzidw) {
            zzidw zzidwVar = (zzidw) list;
            int i5 = this.zzb & 7;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzX(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzidwVar.zzg(zzidpVar.zzd());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzidwVar.zzg(zzidpVar2.zzd());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Double.valueOf(zzidpVar3.zzd()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Double.valueOf(zzidpVar4.zzd()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzy(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieg) {
            zzieg zziegVar = (zzieg) list;
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzW(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zziegVar.zzg(zzidpVar.zze());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            if (i5 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zziegVar.zzg(zzidpVar2.zze());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Float.valueOf(zzidpVar3.zze()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            if (i10 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Float.valueOf(zzidpVar4.zze()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzz(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i5 = this.zzb & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzifnVar.zzd(zzidpVar.zzf());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzf());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Long.valueOf(zzidpVar3.zzf()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzf()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }
}

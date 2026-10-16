package com.google.android.gms.internal.ads;

import D6.L0;
import D6.v1;
import D6.x1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbxh extends zzbem implements zzbxi {
    public zzbxh() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbxi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbxi ? (zzbxi) iInterfaceQueryLocalInterface : new zzbxg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbxl zzbxjVar = null;
        zzbwt zzbwrVar = null;
        zzbxc zzbxaVar = null;
        zzbww zzbwuVar = null;
        zzbxf zzbxdVar = null;
        zzbxc zzbxaVar2 = null;
        zzbxf zzbxdVar2 = null;
        zzbwz zzbwxVar = null;
        zzbww zzbwuVar2 = null;
        if (i5 == 1) {
            InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzben.zzb(parcel, creator);
            Bundle bundle2 = (Bundle) zzben.zzb(parcel, creator);
            x1 x1Var = (x1) zzben.zzb(parcel, x1.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbxjVar = iInterfaceQueryLocalInterface instanceof zzbxl ? (zzbxl) iInterfaceQueryLocalInterface : new zzbxj(strongBinder);
            }
            zzben.zzh(parcel);
            zze(interfaceC3876aR, string, bundle, bundle2, x1Var, zzbxjVar);
            parcel2.writeNoException();
        } else if (i5 == 2) {
            zzbxx zzbxxVarZzf = zzf();
            parcel2.writeNoException();
            zzben.zzd(parcel2, zzbxxVarZzf);
        } else if (i5 == 3) {
            zzbxx zzbxxVarZzg = zzg();
            parcel2.writeNoException();
            zzben.zzd(parcel2, zzbxxVarZzg);
        } else if (i5 == 5) {
            L0 l0Zzh = zzh();
            parcel2.writeNoException();
            zzben.zze(parcel2, l0Zzh);
        } else if (i5 == 10) {
            BinderC3877b.R(parcel.readStrongBinder());
            zzben.zzh(parcel);
            parcel2.writeNoException();
        } else if (i5 != 11) {
            switch (i5) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    v1 v1Var = (v1) zzben.zzb(parcel, v1.CREATOR);
                    InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwuVar2 = iInterfaceQueryLocalInterface2 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface2 : new zzbwu(strongBinder2);
                    }
                    zzbww zzbwwVar = zzbwuVar2;
                    zzbvp zzbvpVarZzb = zzbvo.zzb(parcel.readStrongBinder());
                    x1 x1Var2 = (x1) zzben.zzb(parcel, x1.CREATOR);
                    zzben.zzh(parcel);
                    zzi(string2, string3, v1Var, interfaceC3876aR2, zzbwwVar, zzbvpVarZzb, x1Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    v1 v1Var2 = (v1) zzben.zzb(parcel, v1.CREATOR);
                    InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbwxVar = iInterfaceQueryLocalInterface3 instanceof zzbwz ? (zzbwz) iInterfaceQueryLocalInterface3 : new zzbwx(strongBinder3);
                    }
                    zzbvp zzbvpVarZzb2 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzj(string4, string5, v1Var2, interfaceC3876aR3, zzbwxVar, zzbvpVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    boolean zZzk = zzk(interfaceC3876aR4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzk ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    v1 v1Var3 = (v1) zzben.zzb(parcel, v1.CREATOR);
                    InterfaceC3876a interfaceC3876aR5 = BinderC3877b.R(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbxdVar2 = iInterfaceQueryLocalInterface4 instanceof zzbxf ? (zzbxf) iInterfaceQueryLocalInterface4 : new zzbxd(strongBinder4);
                    }
                    zzbvp zzbvpVarZzb3 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzl(string6, string7, v1Var3, interfaceC3876aR5, zzbxdVar2, zzbvpVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    InterfaceC3876a interfaceC3876aR6 = BinderC3877b.R(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    boolean zZzm = zzm(interfaceC3876aR6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzm ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    v1 v1Var4 = (v1) zzben.zzb(parcel, v1.CREATOR);
                    InterfaceC3876a interfaceC3876aR7 = BinderC3877b.R(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbxaVar2 = iInterfaceQueryLocalInterface5 instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface5 : new zzbxa(strongBinder5);
                    }
                    zzbvp zzbvpVarZzb4 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzn(string8, string9, v1Var4, interfaceC3876aR7, zzbxaVar2, zzbvpVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzben.zzh(parcel);
                    zzo(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    v1 v1Var5 = (v1) zzben.zzb(parcel, v1.CREATOR);
                    InterfaceC3876a interfaceC3876aR8 = BinderC3877b.R(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbxdVar = iInterfaceQueryLocalInterface6 instanceof zzbxf ? (zzbxf) iInterfaceQueryLocalInterface6 : new zzbxd(strongBinder6);
                    }
                    zzbvp zzbvpVarZzb5 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzp(string11, string12, v1Var5, interfaceC3876aR8, zzbxdVar, zzbvpVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    v1 v1Var6 = (v1) zzben.zzb(parcel, v1.CREATOR);
                    InterfaceC3876a interfaceC3876aR9 = BinderC3877b.R(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwuVar = iInterfaceQueryLocalInterface7 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface7 : new zzbwu(strongBinder7);
                    }
                    zzbww zzbwwVar2 = zzbwuVar;
                    zzbvp zzbvpVarZzb6 = zzbvo.zzb(parcel.readStrongBinder());
                    x1 x1Var3 = (x1) zzben.zzb(parcel, x1.CREATOR);
                    zzben.zzh(parcel);
                    zzq(string13, string14, v1Var6, interfaceC3876aR9, zzbwwVar2, zzbvpVarZzb6, x1Var3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    v1 v1Var7 = (v1) zzben.zzb(parcel, v1.CREATOR);
                    InterfaceC3876a interfaceC3876aR10 = BinderC3877b.R(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbxaVar = iInterfaceQueryLocalInterface8 instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface8 : new zzbxa(strongBinder8);
                    }
                    zzbvp zzbvpVarZzb7 = zzbvo.zzb(parcel.readStrongBinder());
                    zzbma zzbmaVar = (zzbma) zzben.zzb(parcel, zzbma.CREATOR);
                    zzben.zzh(parcel);
                    zzr(string15, string16, v1Var7, interfaceC3876aR10, zzbxaVar, zzbvpVarZzb7, zzbmaVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    v1 v1Var8 = (v1) zzben.zzb(parcel, v1.CREATOR);
                    InterfaceC3876a interfaceC3876aR11 = BinderC3877b.R(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface9 instanceof zzbwt ? (zzbwt) iInterfaceQueryLocalInterface9 : new zzbwr(strongBinder9);
                    }
                    zzbvp zzbvpVarZzb8 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzs(string17, string18, v1Var8, interfaceC3876aR11, zzbwrVar, zzbvpVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    InterfaceC3876a interfaceC3876aR12 = BinderC3877b.R(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    boolean zZzt = zzt(interfaceC3876aR12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzben.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}

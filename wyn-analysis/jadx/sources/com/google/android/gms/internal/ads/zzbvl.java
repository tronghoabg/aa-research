package com.google.android.gms.internal.ads;

import D6.L0;
import D6.v1;
import D6.x1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbvl extends zzbem implements zzbvm {
    public zzbvl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbvp zzbvnVar;
        zzbvp zzbvnVar2;
        zzbvp zzbvnVar3;
        zzbvp zzbvnVar4;
        zzbvp zzbvnVar5;
        zzbvp zzbvnVar6;
        zzbvp zzbvnVar7;
        zzbvp zzbvnVar8;
        zzbvp zzbvnVar9 = null;
        switch (i5) {
            case 1:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                x1 x1Var = (x1) zzben.zzb(parcel, x1.CREATOR);
                v1 v1Var = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbvnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar = iInterfaceQueryLocalInterface instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface : new zzbvn(strongBinder);
                }
                zzben.zzh(parcel);
                zze(interfaceC3876aR, x1Var, v1Var, string, zzbvnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC3876a interfaceC3876aZzf = zzf();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzf);
                return true;
            case 3:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                v1 v1Var2 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbvnVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar2 = iInterfaceQueryLocalInterface2 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface2 : new zzbvn(strongBinder2);
                }
                zzben.zzh(parcel);
                zzg(interfaceC3876aR2, v1Var2, string2, zzbvnVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                x1 x1Var2 = (x1) zzben.zzb(parcel, x1.CREATOR);
                v1 v1Var3 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzbvnVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar3 = iInterfaceQueryLocalInterface3 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface3 : new zzbvn(strongBinder3);
                }
                zzben.zzh(parcel);
                zzj(interfaceC3876aR3, x1Var2, v1Var3, string3, string4, zzbvnVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                v1 v1Var4 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    zzbvnVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar4 = iInterfaceQueryLocalInterface4 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface4 : new zzbvn(strongBinder4);
                }
                zzben.zzh(parcel);
                zzk(interfaceC3876aR4, v1Var4, string5, string6, zzbvnVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC3876a interfaceC3876aR5 = BinderC3877b.R(parcel.readStrongBinder());
                v1 v1Var5 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string7 = parcel.readString();
                zzcch zzcchVarZzb = zzccg.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzben.zzh(parcel);
                zzn(interfaceC3876aR5, v1Var5, string7, zzcchVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                v1 v1Var6 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string9 = parcel.readString();
                zzben.zzh(parcel);
                zzo(v1Var6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                InterfaceC3876a interfaceC3876aR6 = BinderC3877b.R(parcel.readStrongBinder());
                v1 v1Var7 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    zzbvnVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar5 = iInterfaceQueryLocalInterface5 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface5 : new zzbvn(strongBinder5);
                }
                zzbma zzbmaVar = (zzbma) zzben.zzb(parcel, zzbma.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzben.zzh(parcel);
                zzr(interfaceC3876aR6, v1Var7, string10, string11, zzbvnVar5, zzbmaVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 17:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzs);
                return true;
            case 18:
                Bundle bundleZzt = zzt();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzt);
                return true;
            case 19:
                Bundle bundleZzu = zzu();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzu);
                return true;
            case 20:
                v1 v1Var8 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzben.zzh(parcel);
                zzv(v1Var8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC3876a interfaceC3876aR7 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzw(interfaceC3876aR7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i12 = zzben.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                InterfaceC3876a interfaceC3876aR8 = BinderC3877b.R(parcel.readStrongBinder());
                zzcch zzcchVarZzb2 = zzccg.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzben.zzh(parcel);
                zzy(interfaceC3876aR8, zzcchVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbnc zzbncVarZzz = zzz();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbncVarZzz);
                return true;
            case 25:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzA(zZza);
                parcel2.writeNoException();
                return true;
            case 26:
                L0 l0ZzB = zzB();
                parcel2.writeNoException();
                zzben.zze(parcel2, l0ZzB);
                return true;
            case 27:
                zzbvy zzbvyVarZzC = zzC();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbvyVarZzC);
                return true;
            case 28:
                InterfaceC3876a interfaceC3876aR9 = BinderC3877b.R(parcel.readStrongBinder());
                v1 v1Var9 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    zzbvnVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar6 = iInterfaceQueryLocalInterface6 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface6 : new zzbvn(strongBinder6);
                }
                zzben.zzh(parcel);
                zzD(interfaceC3876aR9, v1Var9, string14, zzbvnVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                InterfaceC3876a interfaceC3876aR10 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzE(interfaceC3876aR10);
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC3876a interfaceC3876aR11 = BinderC3877b.R(parcel.readStrongBinder());
                zzbsa zzbsaVarZzb = zzbrz.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbsg.CREATOR);
                zzben.zzh(parcel);
                zzF(interfaceC3876aR11, zzbsaVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                InterfaceC3876a interfaceC3876aR12 = BinderC3877b.R(parcel.readStrongBinder());
                v1 v1Var10 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    zzbvnVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar7 = iInterfaceQueryLocalInterface7 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface7 : new zzbvn(strongBinder7);
                }
                zzben.zzh(parcel);
                zzG(interfaceC3876aR12, v1Var10, string15, zzbvnVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbxx zzbxxVarZzH = zzH();
                parcel2.writeNoException();
                zzben.zzd(parcel2, zzbxxVarZzH);
                return true;
            case 34:
                zzbxx zzbxxVarZzI = zzI();
                parcel2.writeNoException();
                zzben.zzd(parcel2, zzbxxVarZzI);
                return true;
            case 35:
                InterfaceC3876a interfaceC3876aR13 = BinderC3877b.R(parcel.readStrongBinder());
                x1 x1Var3 = (x1) zzben.zzb(parcel, x1.CREATOR);
                v1 v1Var11 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    zzbvnVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar8 = iInterfaceQueryLocalInterface8 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface8 : new zzbvn(strongBinder8);
                }
                zzben.zzh(parcel);
                zzJ(interfaceC3876aR13, x1Var3, v1Var11, string16, string17, zzbvnVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbvs zzbvsVarZzK = zzK();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbvsVarZzK);
                return true;
            case 37:
                InterfaceC3876a interfaceC3876aR14 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzL(interfaceC3876aR14);
                parcel2.writeNoException();
                return true;
            case 38:
                InterfaceC3876a interfaceC3876aR15 = BinderC3877b.R(parcel.readStrongBinder());
                v1 v1Var12 = (v1) zzben.zzb(parcel, v1.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar9 = iInterfaceQueryLocalInterface9 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface9 : new zzbvn(strongBinder9);
                }
                zzben.zzh(parcel);
                zzM(interfaceC3876aR15, v1Var12, string18, zzbvnVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                InterfaceC3876a interfaceC3876aR16 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzN(interfaceC3876aR16);
                parcel2.writeNoException();
                return true;
        }
    }
}

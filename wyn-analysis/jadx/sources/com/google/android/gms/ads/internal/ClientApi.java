package com.google.android.gms.ads.internal;

import C6.m;
import D6.D0;
import D6.H;
import D6.InterfaceC0367d0;
import D6.InterfaceC0385m0;
import D6.L;
import D6.X;
import D6.x1;
import F6.b;
import F6.d;
import H6.a;
import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqw;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzcet;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzdqu;
import com.google.android.gms.internal.ads.zzdqw;
import com.google.android.gms.internal.ads.zzebk;
import com.google.android.gms.internal.ads.zzesl;
import com.google.android.gms.internal.ads.zzffo;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfkg;
import com.google.android.gms.internal.ads.zzfkk;
import java.util.HashMap;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public class ClientApi extends zzbem implements InterfaceC0367d0 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // D6.InterfaceC0367d0
    public final zzccp A(InterfaceC3876a interfaceC3876a, String str, zzbvj zzbvjVar, int i5) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        zzfkg zzfkgVarZzq = zzcnq.zza(context, zzbvjVar, i5).zzq();
        zzfkgVarZzq.zzc(context);
        zzfkgVarZzq.zzb(str);
        return zzfkgVarZzq.zza().zzb();
    }

    @Override // D6.InterfaceC0367d0
    public final zzbmp C(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2) {
        return new zzdqw((FrameLayout) BinderC3877b.S(interfaceC3876a), (FrameLayout) BinderC3877b.S(interfaceC3876a2), 261710000);
    }

    @Override // D6.InterfaceC0367d0
    public final zzcet F(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) {
        return zzcnq.zza((Context) BinderC3877b.S(interfaceC3876a), zzbvjVar, i5).zzs();
    }

    @Override // D6.InterfaceC0367d0
    public final zzbra I(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5, zzbqx zzbqxVar) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        zzebk zzebkVarZzA = zzcnq.zza(context, zzbvjVar, i5).zzA();
        zzebkVarZzA.zzc(context);
        zzebkVarZzA.zzb(zzbqxVar);
        return zzebkVarZzA.zza().zzb();
    }

    @Override // D6.InterfaceC0367d0
    public final zzbzb J(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) {
        return zzcnq.zza((Context) BinderC3877b.S(interfaceC3876a), zzbvjVar, i5).zzu();
    }

    @Override // D6.InterfaceC0367d0
    public final D0 N(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) {
        return zzcnq.zza((Context) BinderC3877b.S(interfaceC3876a), zzbvjVar, i5).zzC();
    }

    @Override // D6.InterfaceC0367d0
    public final L O(InterfaceC3876a interfaceC3876a, x1 x1Var, String str, zzbvj zzbvjVar, int i5) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        zzffo zzffoVarZzl = zzcnq.zza(context, zzbvjVar, i5).zzl();
        zzffoVarZzl.zzb(str);
        zzffoVarZzl.zzc(context);
        return zzffoVarZzl.zza().zza();
    }

    @Override // D6.InterfaceC0367d0
    public final H e(InterfaceC3876a interfaceC3876a, String str, zzbvj zzbvjVar, int i5) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        return new zzesl(zzcnq.zza(context, zzbvjVar, i5), context, str);
    }

    @Override // D6.InterfaceC0367d0
    public final X p(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) {
        return zzcnq.zza((Context) BinderC3877b.S(interfaceC3876a), zzbvjVar, i5).zzf();
    }

    @Override // D6.InterfaceC0367d0
    public final InterfaceC0385m0 q(InterfaceC3876a interfaceC3876a, int i5) {
        return zzcnq.zza((Context) BinderC3877b.S(interfaceC3876a), null, i5).zze();
    }

    @Override // D6.InterfaceC0367d0
    public final L u(InterfaceC3876a interfaceC3876a, x1 x1Var, String str, zzbvj zzbvjVar, int i5) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        zzfis zzfisVarZzn = zzcnq.zza(context, zzbvjVar, i5).zzn();
        zzfisVarZzn.zzd(context);
        zzfisVarZzn.zzb(x1Var);
        zzfisVarZzn.zzc(str);
        return zzfisVarZzn.zza().zza();
    }

    @Override // D6.InterfaceC0367d0
    public final L y(InterfaceC3876a interfaceC3876a, x1 x1Var, String str, zzbvj zzbvjVar, int i5) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        zzfhc zzfhcVarZzj = zzcnq.zza(context, zzbvjVar, i5).zzj();
        zzfhcVarZzj.zzd(context);
        zzfhcVarZzj.zzb(x1Var);
        zzfhcVarZzj.zzc(str);
        return zzfhcVarZzj.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        switch (i5) {
            case 1:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                x1 x1Var = (x1) zzben.zzb(parcel, x1.CREATOR);
                String string = parcel.readString();
                zzbvj zzbvjVarZzf = zzbvi.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzben.zzh(parcel);
                L lY = y(interfaceC3876aR, x1Var, string, zzbvjVarZzf, i11);
                parcel2.writeNoException();
                zzben.zze(parcel2, lY);
                return true;
            case 2:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                x1 x1Var2 = (x1) zzben.zzb(parcel, x1.CREATOR);
                String string2 = parcel.readString();
                zzbvj zzbvjVarZzf2 = zzbvi.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzben.zzh(parcel);
                L lU = u(interfaceC3876aR2, x1Var2, string2, zzbvjVarZzf2, i12);
                parcel2.writeNoException();
                zzben.zze(parcel2, lU);
                return true;
            case 3:
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbvj zzbvjVarZzf3 = zzbvi.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzben.zzh(parcel);
                H hE = e(interfaceC3876aR3, string3, zzbvjVarZzf3, i13);
                parcel2.writeNoException();
                zzben.zze(parcel2, hE);
                return true;
            case 4:
                BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 5:
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                InterfaceC3876a interfaceC3876aR5 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzbmp zzbmpVarC = C(interfaceC3876aR4, interfaceC3876aR5);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmpVarC);
                return true;
            case 6:
                InterfaceC3876a interfaceC3876aR6 = BinderC3877b.R(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf4 = zzbvi.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzben.zzh(parcel);
                Context context = (Context) BinderC3877b.S(interfaceC3876aR6);
                zzfkg zzfkgVarZzq = zzcnq.zza(context, zzbvjVarZzf4, i14).zzq();
                zzfkgVarZzq.zzc(context);
                zzfkk zzfkkVarZza = zzfkgVarZzq.zza().zza();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzfkkVarZza);
                return true;
            case 7:
                BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 8:
                InterfaceC3876a interfaceC3876aR7 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzbzi zzbziVarZzg = zzg(interfaceC3876aR7);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbziVarZzg);
                return true;
            case 9:
                InterfaceC3876a interfaceC3876aR8 = BinderC3877b.R(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzben.zzh(parcel);
                InterfaceC0385m0 interfaceC0385m0Q = q(interfaceC3876aR8, i15);
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC0385m0Q);
                return true;
            case 10:
                InterfaceC3876a interfaceC3876aR9 = BinderC3877b.R(parcel.readStrongBinder());
                x1 x1Var3 = (x1) zzben.zzb(parcel, x1.CREATOR);
                String string4 = parcel.readString();
                int i16 = parcel.readInt();
                zzben.zzh(parcel);
                m mVar = new m((Context) BinderC3877b.S(interfaceC3876aR9), x1Var3, string4, new a(261710000, i16, true, false));
                parcel2.writeNoException();
                zzben.zze(parcel2, mVar);
                return true;
            case 11:
                InterfaceC3876a interfaceC3876aR10 = BinderC3877b.R(parcel.readStrongBinder());
                InterfaceC3876a interfaceC3876aR11 = BinderC3877b.R(parcel.readStrongBinder());
                InterfaceC3876a interfaceC3876aR12 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzdqu zzdquVar = new zzdqu((View) BinderC3877b.S(interfaceC3876aR10), (HashMap) BinderC3877b.S(interfaceC3876aR11), (HashMap) BinderC3877b.S(interfaceC3876aR12));
                parcel2.writeNoException();
                zzben.zze(parcel2, zzdquVar);
                return true;
            case 12:
                InterfaceC3876a interfaceC3876aR13 = BinderC3877b.R(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbvj zzbvjVarZzf5 = zzbvi.zzf(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                zzben.zzh(parcel);
                zzccp zzccpVarA = A(interfaceC3876aR13, string5, zzbvjVarZzf5, i17);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzccpVarA);
                return true;
            case 13:
                InterfaceC3876a interfaceC3876aR14 = BinderC3877b.R(parcel.readStrongBinder());
                x1 x1Var4 = (x1) zzben.zzb(parcel, x1.CREATOR);
                String string6 = parcel.readString();
                zzbvj zzbvjVarZzf6 = zzbvi.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzben.zzh(parcel);
                L lO = O(interfaceC3876aR14, x1Var4, string6, zzbvjVarZzf6, i18);
                parcel2.writeNoException();
                zzben.zze(parcel2, lO);
                return true;
            case 14:
                InterfaceC3876a interfaceC3876aR15 = BinderC3877b.R(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf7 = zzbvi.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzben.zzh(parcel);
                zzcet zzcetVarF = F(interfaceC3876aR15, zzbvjVarZzf7, i19);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzcetVarF);
                return true;
            case 15:
                InterfaceC3876a interfaceC3876aR16 = BinderC3877b.R(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf8 = zzbvi.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzben.zzh(parcel);
                zzbzb zzbzbVarJ = J(interfaceC3876aR16, zzbvjVarZzf8, i20);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbzbVarJ);
                return true;
            case 16:
                InterfaceC3876a interfaceC3876aR17 = BinderC3877b.R(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf9 = zzbvi.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzbqx zzbqxVarZzc = zzbqw.zzc(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzbra zzbraVarI = I(interfaceC3876aR17, zzbvjVarZzf9, i21, zzbqxVarZzc);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbraVarI);
                return true;
            case 17:
                InterfaceC3876a interfaceC3876aR18 = BinderC3877b.R(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf10 = zzbvi.zzf(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                zzben.zzh(parcel);
                D0 d0N = N(interfaceC3876aR18, zzbvjVarZzf10, i22);
                parcel2.writeNoException();
                zzben.zze(parcel2, d0N);
                return true;
            case 18:
                InterfaceC3876a interfaceC3876aR19 = BinderC3877b.R(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf11 = zzbvi.zzf(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                zzben.zzh(parcel);
                X xP = p(interfaceC3876aR19, zzbvjVarZzf11, i23);
                parcel2.writeNoException();
                zzben.zze(parcel2, xP);
                return true;
            default:
                return false;
        }
    }

    @Override // D6.InterfaceC0367d0
    public final zzbzi zzg(InterfaceC3876a interfaceC3876a) {
        Activity activity = (Activity) BinderC3877b.S(interfaceC3876a);
        AdOverlayInfoParcel adOverlayInfoParcelV = AdOverlayInfoParcel.V(activity.getIntent());
        if (adOverlayInfoParcelV == null) {
            return new d(activity, 4);
        }
        int i5 = adOverlayInfoParcelV.k;
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? new d(activity, 4) : new d(activity, 0) : new b(activity, adOverlayInfoParcelV) : new d(activity, 2) : new d(activity, 1) : new d(activity, 3);
    }
}

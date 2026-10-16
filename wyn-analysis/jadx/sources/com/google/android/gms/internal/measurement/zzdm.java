package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes4.dex */
public abstract class zzdm extends zzbx implements zzdj {
    public zzdm() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdl(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzdo zzdqVar = null;
        zzdo zzdqVar2 = null;
        zzdo zzdqVar3 = null;
        zzdo zzdqVar4 = null;
        zzdp zzdrVar = null;
        zzdp zzdrVar2 = null;
        zzdp zzdrVar3 = null;
        zzdo zzdqVar5 = null;
        zzdo zzdqVar6 = null;
        zzdo zzdqVar7 = null;
        zzdo zzdqVar8 = null;
        zzdo zzdqVar9 = null;
        zzdo zzdqVar10 = null;
        zzdu zzdtVar = null;
        zzdo zzdqVar11 = null;
        zzdo zzdqVar12 = null;
        zzdo zzdqVar13 = null;
        zzdo zzdqVar14 = null;
        zzdo zzdqVar15 = null;
        switch (i5) {
            case 1:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzdw zzdwVar = (zzdw) zzbw.zza(parcel, zzdw.CREATOR);
                long j8 = parcel.readLong();
                zzbw.zzb(parcel);
                initialize(interfaceC3876aR, zzdwVar, j8);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                boolean zZzc = zzbw.zzc(parcel);
                boolean zZzc2 = zzbw.zzc(parcel);
                long j10 = parcel.readLong();
                zzbw.zzb(parcel);
                logEvent(string, string2, bundle, zZzc, zZzc2, j10);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar = iInterfaceQueryLocalInterface instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface : new zzdq(strongBinder);
                }
                long j11 = parcel.readLong();
                zzbw.zzb(parcel);
                logEventAndBundle(string3, string4, bundle2, zzdqVar, j11);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                boolean zZzc3 = zzbw.zzc(parcel);
                long j12 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserProperty(string5, string6, interfaceC3876aR2, zZzc3, j12);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zZzc4 = zzbw.zzc(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar15 = iInterfaceQueryLocalInterface2 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface2 : new zzdq(strongBinder2);
                }
                zzbw.zzb(parcel);
                getUserProperties(string7, string8, zZzc4, zzdqVar15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar14 = iInterfaceQueryLocalInterface3 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface3 : new zzdq(strongBinder3);
                }
                zzbw.zzb(parcel);
                getMaxUserProperties(string9, zzdqVar14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j13 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserId(string10, j13);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long j14 = parcel.readLong();
                zzbw.zzb(parcel);
                setConditionalUserProperty(bundle3, j14);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar13 = iInterfaceQueryLocalInterface4 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface4 : new zzdq(strongBinder4);
                }
                zzbw.zzb(parcel);
                getConditionalUserProperties(string13, string14, zzdqVar13);
                break;
            case 11:
                boolean zZzc5 = zzbw.zzc(parcel);
                long j15 = parcel.readLong();
                zzbw.zzb(parcel);
                setMeasurementEnabled(zZzc5, j15);
                break;
            case 12:
                long j16 = parcel.readLong();
                zzbw.zzb(parcel);
                resetAnalyticsData(j16);
                break;
            case 13:
                long j17 = parcel.readLong();
                zzbw.zzb(parcel);
                setMinimumSessionDuration(j17);
                break;
            case 14:
                long j18 = parcel.readLong();
                zzbw.zzb(parcel);
                setSessionTimeoutDuration(j18);
                break;
            case 15:
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j19 = parcel.readLong();
                zzbw.zzb(parcel);
                setCurrentScreen(interfaceC3876aR3, string15, string16, j19);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar12 = iInterfaceQueryLocalInterface5 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface5 : new zzdq(strongBinder5);
                }
                zzbw.zzb(parcel);
                getCurrentScreenName(zzdqVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar11 = iInterfaceQueryLocalInterface6 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface6 : new zzdq(strongBinder6);
                }
                zzbw.zzb(parcel);
                getCurrentScreenClass(zzdqVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzdtVar = iInterfaceQueryLocalInterface7 instanceof zzdu ? (zzdu) iInterfaceQueryLocalInterface7 : new zzdt(strongBinder7);
                }
                zzbw.zzb(parcel);
                setInstanceIdProvider(zzdtVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar10 = iInterfaceQueryLocalInterface8 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface8 : new zzdq(strongBinder8);
                }
                zzbw.zzb(parcel);
                getCachedAppInstanceId(zzdqVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar9 = iInterfaceQueryLocalInterface9 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface9 : new zzdq(strongBinder9);
                }
                zzbw.zzb(parcel);
                getAppInstanceId(zzdqVar9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar8 = iInterfaceQueryLocalInterface10 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface10 : new zzdq(strongBinder10);
                }
                zzbw.zzb(parcel);
                getGmpAppId(zzdqVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar7 = iInterfaceQueryLocalInterface11 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface11 : new zzdq(strongBinder11);
                }
                zzbw.zzb(parcel);
                generateEventId(zzdqVar7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j20 = parcel.readLong();
                zzbw.zzb(parcel);
                beginAdUnitExposure(string17, j20);
                break;
            case 24:
                String string18 = parcel.readString();
                long j21 = parcel.readLong();
                zzbw.zzb(parcel);
                endAdUnitExposure(string18, j21);
                break;
            case 25:
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStarted(interfaceC3876aR4, j22);
                break;
            case 26:
                InterfaceC3876a interfaceC3876aR5 = BinderC3877b.R(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStopped(interfaceC3876aR5, j23);
                break;
            case 27:
                InterfaceC3876a interfaceC3876aR6 = BinderC3877b.R(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityCreated(interfaceC3876aR6, bundle5, j24);
                break;
            case 28:
                InterfaceC3876a interfaceC3876aR7 = BinderC3877b.R(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityDestroyed(interfaceC3876aR7, j25);
                break;
            case 29:
                InterfaceC3876a interfaceC3876aR8 = BinderC3877b.R(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityPaused(interfaceC3876aR8, j26);
                break;
            case 30:
                InterfaceC3876a interfaceC3876aR9 = BinderC3877b.R(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityResumed(interfaceC3876aR9, j27);
                break;
            case 31:
                InterfaceC3876a interfaceC3876aR10 = BinderC3877b.R(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar6 = iInterfaceQueryLocalInterface12 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface12 : new zzdq(strongBinder12);
                }
                long j28 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivitySaveInstanceState(interfaceC3876aR10, zzdqVar6, j28);
                break;
            case 32:
                Bundle bundle6 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar5 = iInterfaceQueryLocalInterface13 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface13 : new zzdq(strongBinder13);
                }
                long j29 = parcel.readLong();
                zzbw.zzb(parcel);
                performAction(bundle6, zzdqVar5, j29);
                break;
            case 33:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC3876a interfaceC3876aR11 = BinderC3877b.R(parcel.readStrongBinder());
                InterfaceC3876a interfaceC3876aR12 = BinderC3877b.R(parcel.readStrongBinder());
                InterfaceC3876a interfaceC3876aR13 = BinderC3877b.R(parcel.readStrongBinder());
                zzbw.zzb(parcel);
                logHealthData(i11, string19, interfaceC3876aR11, interfaceC3876aR12, interfaceC3876aR13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdrVar3 = iInterfaceQueryLocalInterface14 instanceof zzdp ? (zzdp) iInterfaceQueryLocalInterface14 : new zzdr(strongBinder14);
                }
                zzbw.zzb(parcel);
                setEventInterceptor(zzdrVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdrVar2 = iInterfaceQueryLocalInterface15 instanceof zzdp ? (zzdp) iInterfaceQueryLocalInterface15 : new zzdr(strongBinder15);
                }
                zzbw.zzb(parcel);
                registerOnMeasurementEventListener(zzdrVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdrVar = iInterfaceQueryLocalInterface16 instanceof zzdp ? (zzdp) iInterfaceQueryLocalInterface16 : new zzdr(strongBinder16);
                }
                zzbw.zzb(parcel);
                unregisterOnMeasurementEventListener(zzdrVar);
                break;
            case 37:
                HashMap mapZza = zzbw.zza(parcel);
                zzbw.zzb(parcel);
                initForTests(mapZza);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar4 = iInterfaceQueryLocalInterface17 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface17 : new zzdq(strongBinder17);
                }
                int i12 = parcel.readInt();
                zzbw.zzb(parcel);
                getTestFlag(zzdqVar4, i12);
                break;
            case 39:
                boolean zZzc6 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                setDataCollectionEnabled(zZzc6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar3 = iInterfaceQueryLocalInterface18 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface18 : new zzdq(strongBinder18);
                }
                zzbw.zzb(parcel);
                isDataCollectionEnabled(zzdqVar3);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j30 = parcel.readLong();
                zzbw.zzb(parcel);
                clearMeasurementEnabled(j30);
                break;
            case 44:
                Bundle bundle8 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsent(bundle8, j31);
                break;
            case 45:
                Bundle bundle9 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsentThirdParty(bundle9, j32);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdqVar2 = iInterfaceQueryLocalInterface19 instanceof zzdo ? (zzdo) iInterfaceQueryLocalInterface19 : new zzdq(strongBinder19);
                }
                zzbw.zzb(parcel);
                getSessionId(zzdqVar2);
                break;
            case 48:
                Intent intent = (Intent) zzbw.zza(parcel, Intent.CREATOR);
                zzbw.zzb(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

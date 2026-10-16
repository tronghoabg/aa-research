package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import q7.InterfaceC3876a;

/* loaded from: classes4.dex */
public interface zzdj extends IInterface {
    void beginAdUnitExposure(String str, long j8) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j8) throws RemoteException;

    void endAdUnitExposure(String str, long j8) throws RemoteException;

    void generateEventId(zzdo zzdoVar) throws RemoteException;

    void getAppInstanceId(zzdo zzdoVar) throws RemoteException;

    void getCachedAppInstanceId(zzdo zzdoVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzdo zzdoVar) throws RemoteException;

    void getCurrentScreenClass(zzdo zzdoVar) throws RemoteException;

    void getCurrentScreenName(zzdo zzdoVar) throws RemoteException;

    void getGmpAppId(zzdo zzdoVar) throws RemoteException;

    void getMaxUserProperties(String str, zzdo zzdoVar) throws RemoteException;

    void getSessionId(zzdo zzdoVar) throws RemoteException;

    void getTestFlag(zzdo zzdoVar, int i5) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z2, zzdo zzdoVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(InterfaceC3876a interfaceC3876a, zzdw zzdwVar, long j8) throws RemoteException;

    void isDataCollectionEnabled(zzdo zzdoVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j8) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzdo zzdoVar, long j8) throws RemoteException;

    void logHealthData(int i5, String str, InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, InterfaceC3876a interfaceC3876a3) throws RemoteException;

    void onActivityCreated(InterfaceC3876a interfaceC3876a, Bundle bundle, long j8) throws RemoteException;

    void onActivityDestroyed(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException;

    void onActivityPaused(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException;

    void onActivityResumed(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException;

    void onActivitySaveInstanceState(InterfaceC3876a interfaceC3876a, zzdo zzdoVar, long j8) throws RemoteException;

    void onActivityStarted(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException;

    void onActivityStopped(InterfaceC3876a interfaceC3876a, long j8) throws RemoteException;

    void performAction(Bundle bundle, zzdo zzdoVar, long j8) throws RemoteException;

    void registerOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException;

    void resetAnalyticsData(long j8) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j8) throws RemoteException;

    void setConsent(Bundle bundle, long j8) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j8) throws RemoteException;

    void setCurrentScreen(InterfaceC3876a interfaceC3876a, String str, String str2, long j8) throws RemoteException;

    void setDataCollectionEnabled(boolean z2) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(zzdp zzdpVar) throws RemoteException;

    void setInstanceIdProvider(zzdu zzduVar) throws RemoteException;

    void setMeasurementEnabled(boolean z2, long j8) throws RemoteException;

    void setMinimumSessionDuration(long j8) throws RemoteException;

    void setSessionTimeoutDuration(long j8) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j8) throws RemoteException;

    void setUserProperty(String str, String str2, InterfaceC3876a interfaceC3876a, boolean z2, long j8) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException;
}

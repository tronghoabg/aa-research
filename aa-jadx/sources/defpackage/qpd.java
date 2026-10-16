package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qpd {
    public static final defpackage.rov d;
    public static final java.lang.String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final java.lang.String c = "androidPackageName";
    private static final android.content.ComponentName a = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        java.lang.String str = new java.lang.String[]{"GoogleAuthUtil"}[0];
        if (sb.length() > 1) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("] ");
        d = new defpackage.rov(sb.toString());
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.String a(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.lang.Exception {
        long j;
        java.lang.Exception exc;
        d(account);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        defpackage.rif rifVarL = defpackage.rif.l(context);
        try {
            defpackage.sqs.au("Calling this from your main thread can lead to deadlock");
            defpackage.sqs.ay(str, "Scope cannot be empty or null.");
            d(account);
            b(context);
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            java.lang.String str2 = context.getApplicationInfo().packageName;
            bundle2.putString("clientPackageName", str2);
            java.lang.String str3 = c;
            if (android.text.TextUtils.isEmpty(bundle2.getString(str3))) {
                try {
                    bundle2.putString(str3, str2);
                } catch (java.lang.Exception e) {
                    exc = e;
                    j = jCurrentTimeMillis;
                    rifVarL.j(1709, 13, j, java.lang.System.currentTimeMillis(), jElapsedRealtime);
                    throw exc;
                }
            }
            bundle2.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
            j = jCurrentTimeMillis;
            try {
                defpackage.qpc qpcVar = new defpackage.qpc(account, str, bundle2, context, rifVarL, j, jElapsedRealtime);
                rifVarL = rifVarL;
                try {
                    return ((com.google.android.gms.auth.TokenData) e(context, a, qpcVar)).b;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    exc = e;
                    rifVarL.j(1709, 13, j, java.lang.System.currentTimeMillis(), jElapsedRealtime);
                    throw exc;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                rifVarL = rifVarL;
            }
        } catch (java.lang.Exception e4) {
            e = e4;
            j = jCurrentTimeMillis;
        }
    }

    public static void b(android.content.Context context) throws defpackage.qpa {
        try {
            defpackage.sli.c(context.getApplicationContext(), 8400000);
        } catch (com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException | defpackage.slg e) {
            throw new defpackage.qpa(e.getMessage(), e);
        } catch (defpackage.slh e2) {
            java.lang.String message = e2.getMessage();
            new android.content.Intent(e2.b);
            throw new defpackage.qpe(message);
        }
    }

    public static android.accounts.Account[] c(android.content.Context context) throws java.lang.Exception {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        defpackage.rif rifVarL = defpackage.rif.l(context);
        try {
            defpackage.sqs.ax("com.google");
            try {
                int i = defpackage.sks.c;
                defpackage.sli.c(context, 8400000);
                defpackage.sqs.aA(context);
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient("com.google.android.gms.auth.accounts");
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new android.os.RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                    }
                    try {
                        try {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("callingActivity", context instanceof android.app.Activity ? ((android.app.Activity) context).getComponentName().getClassName() : "");
                            android.os.Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("get_accounts", "com.google", bundle);
                            if (bundleCall == null) {
                                throw new android.os.RemoteException("Null result from AccountChimeraContentProvider");
                            }
                            android.os.Parcelable[] parcelableArray = android.os.Build.VERSION.SDK_INT >= 34 ? (android.os.Parcelable[]) bundleCall.getParcelableArray("accounts", android.accounts.Account.class) : bundleCall.getParcelableArray("accounts");
                            if (parcelableArray == null) {
                                throw new android.os.RemoteException("Key_Accounts is Null");
                            }
                            android.accounts.Account[] accountArr = new android.accounts.Account[parcelableArray.length];
                            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                                accountArr[i2] = (android.accounts.Account) parcelableArray[i2];
                            }
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            rifVarL.j(1708, 0, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
                            return accountArr;
                        } catch (java.lang.Exception e) {
                            d.c("Exception when getting accounts", e);
                            throw new android.os.RemoteException("Accounts ContentProvider failed: " + e.getMessage());
                        }
                    } catch (android.os.RemoteException e2) {
                        d.c("RemoteException when fetching accounts", e2);
                        throw e2;
                    }
                } catch (java.lang.Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException unused) {
                throw new defpackage.slg(18);
            }
        } catch (java.lang.Exception e3) {
            rifVarL.j(1708, 13, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
            throw e3;
        }
    }

    private static void d(android.accounts.Account account) {
        if (android.text.TextUtils.isEmpty(account.name)) {
            throw new java.lang.IllegalArgumentException("Account name cannot be empty!");
        }
        java.lang.String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Account type not supported");
    }

    private static java.lang.Object e(android.content.Context context, android.content.ComponentName componentName, defpackage.qpc qpcVar) throws defpackage.qpa, java.io.IOException {
        defpackage.qdi qdiVar;
        com.google.android.gms.auth.TokenData tokenData;
        defpackage.qqb qqbVar;
        java.lang.String strE;
        defpackage.skn sknVar = new defpackage.skn();
        defpackage.sox soxVarB = defpackage.sox.b(context);
        try {
            try {
                if (!soxVarB.d(new defpackage.sow(componentName), sknVar, "GoogleAuthUtil", null).c()) {
                    throw new java.io.IOException("Could not bind to service.");
                }
                try {
                    defpackage.sqs.au("BlockingServiceConnection.getService() called on main thread");
                    if (sknVar.a) {
                        throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
                    }
                    sknVar.a = true;
                    android.os.IBinder iBinder = (android.os.IBinder) sknVar.b.take();
                    android.accounts.Account account = qpcVar.a;
                    java.lang.String str = qpcVar.b;
                    android.os.Bundle bundle = qpcVar.c;
                    android.content.Context context2 = qpcVar.d;
                    defpackage.rif rifVar = qpcVar.g;
                    long j = qpcVar.e;
                    long j2 = qpcVar.f;
                    if (iBinder == null) {
                        qdiVar = null;
                    } else {
                        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                        qdiVar = iInterfaceQueryLocalInterface instanceof defpackage.qdi ? (defpackage.qdi) iInterfaceQueryLocalInterface : new defpackage.qdi(iBinder);
                    }
                    android.os.Parcel parcelFp = qdiVar.fp();
                    defpackage.ijx.g(parcelFp, account);
                    parcelFp.writeString(str);
                    defpackage.ijx.g(parcelFp, bundle);
                    android.os.Parcel parcelFq = qdiVar.fq(5, parcelFp);
                    android.os.Bundle bundle2 = (android.os.Bundle) defpackage.ijx.a(parcelFq, android.os.Bundle.CREATOR);
                    parcelFq.recycle();
                    if (bundle2 == null) {
                        throw new java.io.IOException("Service call returned null");
                    }
                    java.lang.ClassLoader classLoader = com.google.android.gms.auth.TokenData.class.getClassLoader();
                    if (classLoader != null) {
                        bundle2.setClassLoader(classLoader);
                    }
                    android.os.Bundle bundle3 = bundle2.getBundle("tokenDetails");
                    if (bundle3 == null) {
                        tokenData = null;
                    } else {
                        if (classLoader != null) {
                            bundle3.setClassLoader(classLoader);
                        }
                        tokenData = (com.google.android.gms.auth.TokenData) defpackage.ebl.v(bundle3, "TokenData", com.google.android.gms.auth.TokenData.class);
                    }
                    if (tokenData != null) {
                        rifVar.j(1709, 0, j, java.lang.System.currentTimeMillis(), j2);
                        soxVarB.c(componentName, sknVar);
                        return tokenData;
                    }
                    java.lang.String string = bundle2.getString("Error");
                    android.content.Intent intent = (android.content.Intent) defpackage.ebl.v(bundle2, "userRecoveryIntent", android.content.Intent.class);
                    android.app.PendingIntent pendingIntent = (android.app.PendingIntent) defpackage.ebl.v(bundle2, "userRecoveryPendingIntent", android.app.PendingIntent.class);
                    int i = 49500;
                    while (true) {
                        if (i < 50000) {
                            if (i != 495243) {
                                switch (i) {
                                    case 49500:
                                        strE = "AccountNotPresent";
                                        break;
                                    case 49501:
                                        strE = "AppSuspended";
                                        break;
                                    case 49502:
                                        strE = "InvalidScope";
                                        break;
                                    case 49503:
                                        strE = "NeedPermission";
                                        break;
                                    case 49504:
                                        strE = "NeedRemoteConsent";
                                        break;
                                    case 49505:
                                        strE = "PermissionDenied";
                                        break;
                                    case 49506:
                                        strE = "UnknownError";
                                        break;
                                    default:
                                        switch (i) {
                                            case 49508:
                                                strE = "ServiceUnavailable";
                                                break;
                                            case 49509:
                                                strE = "InvalidRequest";
                                                break;
                                            case 49510:
                                                strE = "EmptyConsumerPackageOrSignature";
                                                break;
                                            case 49511:
                                                strE = "NeedsTwoFactorAuth";
                                                break;
                                            case 49512:
                                                strE = "NeedsBrowser";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 49514:
                                                        strE = "UserCancel";
                                                        break;
                                                    case 49515:
                                                        strE = "RestrictedClient";
                                                        break;
                                                    case 49516:
                                                        strE = "InvalidAudience";
                                                        break;
                                                    case 49517:
                                                        strE = "UnregisteredOnApiConsole";
                                                        break;
                                                    case 49518:
                                                        strE = "ThirdPartyDeviceManagementRequired";
                                                        break;
                                                    case 49519:
                                                        strE = "DeviceManagementInternalError";
                                                        break;
                                                    case 49520:
                                                        strE = "DeviceManagementSyncDisabled";
                                                        break;
                                                    case 49521:
                                                        strE = "DeviceManagementAdminBlocked";
                                                        break;
                                                    case 49522:
                                                        strE = "DeviceManagementAdminPendingApproval";
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 49524:
                                                                strE = "DeviceManagementDeactivated";
                                                                break;
                                                            case 49525:
                                                                strE = "DeviceManagementScreenLockRequired";
                                                                break;
                                                            case 49526:
                                                                strE = "DeviceManagementRequired";
                                                                break;
                                                            case 49527:
                                                                strE = "DeviceManagementRequiredOrSyncDisabled";
                                                                break;
                                                            case 49528:
                                                                strE = "AuthSecurityError";
                                                                break;
                                                            case 49529:
                                                                strE = "AuthBindingError";
                                                                break;
                                                            case 49530:
                                                                strE = "BadAuthentication";
                                                                break;
                                                            case 49531:
                                                                strE = "NetworkError";
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 49754:
                                                                        strE = "CapabilityResponseYes";
                                                                        break;
                                                                    case 49755:
                                                                        strE = "CapabilityResponseNo";
                                                                        break;
                                                                    case 49756:
                                                                        strE = "CapabilityResponseNotPermitted";
                                                                        break;
                                                                    case 49757:
                                                                        strE = "CapabilityResponseRequestFailed";
                                                                        break;
                                                                    case 49758:
                                                                        strE = "CapabilityResponseUnknownCapability";
                                                                        break;
                                                                    case 49759:
                                                                        strE = "CapabilityResponseFailedToSync";
                                                                        break;
                                                                    default:
                                                                        strE = defpackage.sqg.e(i);
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                strE = "DeviceManagementStaleSyncRequired";
                            }
                            if (!strE.equals(string)) {
                                i++;
                            }
                        } else {
                            i = 13;
                        }
                    }
                    rifVar.j(1709, i, j, java.lang.System.currentTimeMillis(), j2);
                    defpackage.qqb[] qqbVarArrValues = defpackage.qqb.values();
                    int length = qqbVarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            qqbVar = qqbVarArrValues[i2];
                            if (!qqbVar.al.equals(string)) {
                                i2++;
                            }
                        } else {
                            qqbVar = defpackage.qqb.UNKNOWN;
                        }
                    }
                    defpackage.rov rovVar = d;
                    android.util.Log.w((java.lang.String) rovVar.b, rovVar.b(java.lang.String.format("[GoogleAuthUtil] error status:%s with method:%s", qqbVar, "getTokenWithDetails")));
                    if (!defpackage.qqb.BAD_AUTHENTICATION.equals(qqbVar) && !defpackage.qqb.CAPTCHA.equals(qqbVar) && !defpackage.qqb.NEED_PERMISSION.equals(qqbVar) && !defpackage.qqb.NEED_REMOTE_CONSENT.equals(qqbVar) && !defpackage.qqb.NEEDS_BROWSER.equals(qqbVar) && !defpackage.qqb.USER_CANCEL.equals(qqbVar) && !defpackage.qqb.DEVICE_MANAGEMENT_REQUIRED.equals(qqbVar) && !defpackage.qqb.DM_INTERNAL_ERROR.equals(qqbVar) && !defpackage.qqb.DM_SYNC_DISABLED.equals(qqbVar) && !defpackage.qqb.DM_ADMIN_BLOCKED.equals(qqbVar) && !defpackage.qqb.DM_ADMIN_PENDING_APPROVAL.equals(qqbVar) && !defpackage.qqb.DM_STALE_SYNC_REQUIRED.equals(qqbVar) && !defpackage.qqb.DM_DEACTIVATED.equals(qqbVar) && !defpackage.qqb.DM_REQUIRED.equals(qqbVar) && !defpackage.qqb.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(qqbVar) && !defpackage.qqb.DM_SCREENLOCK_REQUIRED.equals(qqbVar)) {
                        if (!defpackage.qqb.NETWORK_ERROR.equals(qqbVar) && !defpackage.qqb.SERVICE_UNAVAILABLE.equals(qqbVar) && !defpackage.qqb.INTNERNAL_ERROR.equals(qqbVar) && !defpackage.qqb.AUTH_SECURITY_ERROR.equals(qqbVar)) {
                            throw new defpackage.qpa(string);
                        }
                        throw new java.io.IOException(string);
                    }
                    if (pendingIntent != null && intent != null) {
                        throw com.google.android.gms.auth.UserRecoverableAuthException.a(string, intent);
                    }
                    defpackage.skr skrVar = defpackage.skr.a;
                    int iA = defpackage.sli.a(context2);
                    if (iA >= 233800000 && pendingIntent == null) {
                        rovVar.d(java.lang.String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", java.lang.Integer.valueOf(iA), "getTokenWithDetails", 233800000));
                    }
                    if (intent == null) {
                        rovVar.d(java.lang.String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", string, "getTokenWithDetails"));
                    }
                    throw new com.google.android.gms.auth.UserRecoverableAuthException(string);
                } catch (android.os.RemoteException | java.lang.InterruptedException | java.util.concurrent.TimeoutException e) {
                    android.util.Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new java.io.IOException("Error on service connection.", e);
                }
            } catch (java.lang.Throwable th) {
                soxVarB.c(componentName, sknVar);
                throw th;
            }
        } catch (java.lang.SecurityException e2) {
            android.util.Log.w("GoogleAuthUtil", java.lang.String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new java.io.IOException("SecurityException while binding to Auth service.", e2);
        }
    }
}

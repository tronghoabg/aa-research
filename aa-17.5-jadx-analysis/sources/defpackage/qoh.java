package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class qoh {
    public static final rjg d;
    public static final String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final String c = "androidPackageName";
    private static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        String str = new String[]{"GoogleAuthUtil"}[0];
        if (sb.length() > 1) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("] ");
        d = new rjg(sb.toString());
    }

    @ResultIgnorabilityUnspecified
    public static String a(Context context, Account account, String str, Bundle bundle) throws Exception {
        long j;
        Exception exc;
        qog qogVar;
        d(account);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        rhj rhjVarL = rhj.l(context);
        try {
            spu.aq("Calling this from your main thread can lead to deadlock");
            spu.au(str, "Scope cannot be empty or null.");
            d(account);
            b(context);
            Bundle bundle2 = new Bundle(bundle);
            String str2 = context.getApplicationInfo().packageName;
            bundle2.putString("clientPackageName", str2);
            String str3 = c;
            if (TextUtils.isEmpty(bundle2.getString(str3))) {
                try {
                    bundle2.putString(str3, str2);
                } catch (Exception e) {
                    exc = e;
                    j = jCurrentTimeMillis;
                    rhjVarL.j(1709, 13, j, System.currentTimeMillis(), jElapsedRealtime);
                    throw exc;
                }
            }
            bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
            j = jCurrentTimeMillis;
            try {
                qogVar = new qog(account, str, bundle2, context, rhjVarL, j, jElapsedRealtime);
                rhjVarL = rhjVarL;
            } catch (Exception e2) {
                e = e2;
                rhjVarL = rhjVarL;
            }
        } catch (Exception e3) {
            e = e3;
            j = jCurrentTimeMillis;
        }
        try {
            return ((TokenData) e(context, a, qogVar)).b;
        } catch (Exception e4) {
            e = e4;
            exc = e;
            rhjVarL.j(1709, 13, j, System.currentTimeMillis(), jElapsedRealtime);
            throw exc;
        }
    }

    public static void b(Context context) throws qoe {
        try {
            skm.c(context.getApplicationContext(), 8400000);
        } catch (GooglePlayServicesIncorrectManifestValueException | skk e) {
            throw new qoe(e.getMessage(), e);
        } catch (skl e2) {
            String message = e2.getMessage();
            new Intent(e2.b);
            throw new qoi(message);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static Account[] c(Context context) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        rhj rhjVarL = rhj.l(context);
        try {
            spu.at("com.google");
            try {
                int i = sjw.c;
                skm.c(context, 8400000);
                spu.aw(context);
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient("com.google.android.gms.auth.accounts");
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                    }
                    try {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putString("callingActivity", context instanceof Activity ? ((Activity) context).getComponentName().getClassName() : "");
                            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("get_accounts", "com.google", bundle);
                            if (bundleCall == null) {
                                throw new RemoteException("Null result from AccountChimeraContentProvider");
                            }
                            Parcelable[] parcelableArray = bundleCall.getParcelableArray("accounts");
                            if (parcelableArray == null) {
                                throw new RemoteException("Key_Accounts is Null");
                            }
                            Account[] accountArr = new Account[parcelableArray.length];
                            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                                accountArr[i2] = (Account) parcelableArray[i2];
                            }
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            rhjVarL.j(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                            return accountArr;
                        } catch (RemoteException e) {
                            d.c("RemoteException when fetching accounts", e);
                            throw e;
                        }
                    } catch (Exception e2) {
                        d.c("Exception when getting accounts", e2);
                        throw new RemoteException("Accounts ContentProvider failed: " + e2.getMessage());
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (GooglePlayServicesIncorrectManifestValueException unused) {
                throw new skk(18);
            }
        } catch (Exception e3) {
            rhjVarL.j(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw e3;
        }
    }

    private static void d(Account account) {
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static Object e(Context context, ComponentName componentName, qog qogVar) throws qoe, IOException {
        qck qckVar;
        TokenData tokenData;
        qpf qpfVar;
        String strI;
        sjr sjrVar = new sjr();
        soc socVarB = soc.b(context);
        try {
            try {
                if (!socVarB.d(new sob(componentName), sjrVar, "GoogleAuthUtil", null).c()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    spu.aq("BlockingServiceConnection.getService() called on main thread");
                    if (sjrVar.a) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    sjrVar.a = true;
                    IBinder iBinder = (IBinder) sjrVar.b.take();
                    Account account = qogVar.a;
                    String str = qogVar.b;
                    Bundle bundle = qogVar.c;
                    Context context2 = qogVar.d;
                    rhj rhjVar = qogVar.g;
                    long j = qogVar.e;
                    long j2 = qogVar.f;
                    if (iBinder == null) {
                        qckVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                        qckVar = iInterfaceQueryLocalInterface instanceof qck ? (qck) iInterfaceQueryLocalInterface : new qck(iBinder);
                    }
                    Parcel parcelGh = qckVar.gh();
                    ijp.g(parcelGh, account);
                    parcelGh.writeString(str);
                    ijp.g(parcelGh, bundle);
                    Parcel parcelGi = qckVar.gi(5, parcelGh);
                    Bundle bundle2 = (Bundle) ijp.a(parcelGi, Bundle.CREATOR);
                    parcelGi.recycle();
                    if (bundle2 == null) {
                        throw new IOException("Service call returned null");
                    }
                    ClassLoader classLoader = TokenData.class.getClassLoader();
                    if (classLoader != null) {
                        bundle2.setClassLoader(classLoader);
                    }
                    Bundle bundle3 = bundle2.getBundle("tokenDetails");
                    if (bundle3 == null) {
                        tokenData = null;
                    } else {
                        if (classLoader != null) {
                            bundle3.setClassLoader(classLoader);
                        }
                        tokenData = (TokenData) bundle3.getParcelable("TokenData");
                    }
                    if (tokenData != null) {
                        rhjVar.j(1709, 0, j, System.currentTimeMillis(), j2);
                        return tokenData;
                    }
                    String string = bundle2.getString("Error");
                    Intent intent = (Intent) bundle2.getParcelable("userRecoveryIntent");
                    PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable("userRecoveryPendingIntent");
                    int i = 49500;
                    while (true) {
                        if (i < 50000) {
                            if (i != 495243) {
                                switch (i) {
                                    case 49500:
                                        strI = "AccountNotPresent";
                                        break;
                                    case 49501:
                                        strI = "AppSuspended";
                                        break;
                                    case 49502:
                                        strI = "InvalidScope";
                                        break;
                                    case 49503:
                                        strI = "NeedPermission";
                                        break;
                                    case 49504:
                                        strI = "NeedRemoteConsent";
                                        break;
                                    case 49505:
                                        strI = "PermissionDenied";
                                        break;
                                    case 49506:
                                        strI = "UnknownError";
                                        break;
                                    default:
                                        switch (i) {
                                            case 49508:
                                                strI = "ServiceUnavailable";
                                                break;
                                            case 49509:
                                                strI = "InvalidRequest";
                                                break;
                                            case 49510:
                                                strI = "EmptyConsumerPackageOrSignature";
                                                break;
                                            case 49511:
                                                strI = "NeedsTwoFactorAuth";
                                                break;
                                            case 49512:
                                                strI = "NeedsBrowser";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 49514:
                                                        strI = "UserCancel";
                                                        break;
                                                    case 49515:
                                                        strI = "RestrictedClient";
                                                        break;
                                                    case 49516:
                                                        strI = "InvalidAudience";
                                                        break;
                                                    case 49517:
                                                        strI = "UnregisteredOnApiConsole";
                                                        break;
                                                    case 49518:
                                                        strI = "ThirdPartyDeviceManagementRequired";
                                                        break;
                                                    case 49519:
                                                        strI = "DeviceManagementInternalError";
                                                        break;
                                                    case 49520:
                                                        strI = "DeviceManagementSyncDisabled";
                                                        break;
                                                    case 49521:
                                                        strI = "DeviceManagementAdminBlocked";
                                                        break;
                                                    case 49522:
                                                        strI = "DeviceManagementAdminPendingApproval";
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 49524:
                                                                strI = "DeviceManagementDeactivated";
                                                                break;
                                                            case 49525:
                                                                strI = "DeviceManagementScreenLockRequired";
                                                                break;
                                                            case 49526:
                                                                strI = "DeviceManagementRequired";
                                                                break;
                                                            case 49527:
                                                                strI = "DeviceManagementRequiredOrSyncDisabled";
                                                                break;
                                                            case 49528:
                                                                strI = "AuthSecurityError";
                                                                break;
                                                            case 49529:
                                                                strI = "AuthBindingError";
                                                                break;
                                                            case 49530:
                                                                strI = "BadAuthentication";
                                                                break;
                                                            case 49531:
                                                                strI = "NetworkError";
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 49754:
                                                                        strI = "CapabilityResponseYes";
                                                                        break;
                                                                    case 49755:
                                                                        strI = "CapabilityResponseNo";
                                                                        break;
                                                                    case 49756:
                                                                        strI = "CapabilityResponseNotPermitted";
                                                                        break;
                                                                    case 49757:
                                                                        strI = "CapabilityResponseRequestFailed";
                                                                        break;
                                                                    case 49758:
                                                                        strI = "CapabilityResponseUnknownCapability";
                                                                        break;
                                                                    case 49759:
                                                                        strI = "CapabilityResponseFailedToSync";
                                                                        break;
                                                                    default:
                                                                        strI = uqw.I(i);
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                            } else {
                                strI = "DeviceManagementStaleSyncRequired";
                            }
                            if (!strI.equals(string)) {
                                i++;
                            }
                        } else {
                            i = 13;
                        }
                    }
                    rhjVar.j(1709, i, j, System.currentTimeMillis(), j2);
                    qpf[] qpfVarArrValues = qpf.values();
                    int length = qpfVarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            qpfVar = qpfVarArrValues[i2];
                            if (!qpfVar.al.equals(string)) {
                                i2++;
                            }
                        } else {
                            qpfVar = qpf.UNKNOWN;
                        }
                    }
                    rjg rjgVar = d;
                    Log.w((String) rjgVar.a, rjgVar.b(String.format("[GoogleAuthUtil] error status:%s with method:%s", qpfVar, "getTokenWithDetails")));
                    if (!qpf.BAD_AUTHENTICATION.equals(qpfVar) && !qpf.CAPTCHA.equals(qpfVar) && !qpf.NEED_PERMISSION.equals(qpfVar) && !qpf.NEED_REMOTE_CONSENT.equals(qpfVar) && !qpf.NEEDS_BROWSER.equals(qpfVar) && !qpf.USER_CANCEL.equals(qpfVar) && !qpf.DEVICE_MANAGEMENT_REQUIRED.equals(qpfVar) && !qpf.DM_INTERNAL_ERROR.equals(qpfVar) && !qpf.DM_SYNC_DISABLED.equals(qpfVar) && !qpf.DM_ADMIN_BLOCKED.equals(qpfVar) && !qpf.DM_ADMIN_PENDING_APPROVAL.equals(qpfVar) && !qpf.DM_STALE_SYNC_REQUIRED.equals(qpfVar) && !qpf.DM_DEACTIVATED.equals(qpfVar) && !qpf.DM_REQUIRED.equals(qpfVar) && !qpf.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(qpfVar) && !qpf.DM_SCREENLOCK_REQUIRED.equals(qpfVar)) {
                        if (!qpf.NETWORK_ERROR.equals(qpfVar) && !qpf.SERVICE_UNAVAILABLE.equals(qpfVar) && !qpf.INTNERNAL_ERROR.equals(qpfVar) && !qpf.AUTH_SECURITY_ERROR.equals(qpfVar)) {
                            throw new qoe(string);
                        }
                        throw new IOException(string);
                    }
                    if (pendingIntent != null && intent != null) {
                        throw UserRecoverableAuthException.a(string, intent);
                    }
                    sjv sjvVar = sjv.a;
                    int iA = skm.a(context2);
                    if (iA >= 233800000 && pendingIntent == null) {
                        rjgVar.d(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(iA), "getTokenWithDetails", 233800000));
                    }
                    if (intent == null) {
                        rjgVar.d(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", string, "getTokenWithDetails"));
                    }
                    throw new UserRecoverableAuthException(string);
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                }
            } finally {
                socVarB.c(componentName, sjrVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }
}

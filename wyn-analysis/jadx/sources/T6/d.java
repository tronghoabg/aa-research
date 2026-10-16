package T6;

import A7.AbstractC0279p0;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.AbstractC1724m;
import com.google.android.gms.common.internal.U;
import com.google.android.gms.common.internal.X;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d7.ServiceConnectionC2398a;
import d7.i;
import h7.C2793a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f11764a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b, reason: collision with root package name */
    public static final ComponentName f11765b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: c, reason: collision with root package name */
    public static final C2793a f11766c = new C2793a("Auth", "GoogleAuthUtil");

    public static TokenData a(Context context, Bundle bundle) throws Ya.a, IOException {
        TokenData tokenData;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        zzby zzbyVarZza = zzby.zza(string);
        C2793a c2793a = f11766c;
        c2793a.f("[GoogleAuthUtil] error status:" + zzbyVarZza + " with method:getTokenWithDetails", new Object[0]);
        if (!zzby.BAD_AUTHENTICATION.equals(zzbyVarZza) && !zzby.CAPTCHA.equals(zzbyVarZza) && !zzby.NEED_PERMISSION.equals(zzbyVarZza) && !zzby.NEED_REMOTE_CONSENT.equals(zzbyVarZza) && !zzby.NEEDS_BROWSER.equals(zzbyVarZza) && !zzby.USER_CANCEL.equals(zzbyVarZza) && !zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zzbyVarZza) && !zzby.DM_INTERNAL_ERROR.equals(zzbyVarZza) && !zzby.DM_SYNC_DISABLED.equals(zzbyVarZza) && !zzby.DM_ADMIN_BLOCKED.equals(zzbyVarZza) && !zzby.DM_ADMIN_PENDING_APPROVAL.equals(zzbyVarZza) && !zzby.DM_STALE_SYNC_REQUIRED.equals(zzbyVarZza) && !zzby.DM_DEACTIVATED.equals(zzbyVarZza) && !zzby.DM_REQUIRED.equals(zzbyVarZza) && !zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zzbyVarZza) && !zzby.DM_SCREENLOCK_REQUIRED.equals(zzbyVarZza)) {
            if (zzby.NETWORK_ERROR.equals(zzbyVarZza) || zzby.SERVICE_UNAVAILABLE.equals(zzbyVarZza) || zzby.INTNERNAL_ERROR.equals(zzbyVarZza) || zzby.AUTH_SECURITY_ERROR.equals(zzbyVarZza) || zzby.ACCOUNT_NOT_PRESENT.equals(zzbyVarZza)) {
                throw new IOException(string);
            }
            throw new Ya.a(string);
        }
        zzdc.zzd(context);
        if (!zzht.zzc()) {
            throw new UserRecoverableAuthException(1, intent, string);
        }
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(2, intent, string);
        }
        Object obj = d7.e.f34126c;
        if (d7.f.a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            c2793a.c("Recovery PendingIntent is missing on current Gms version: 2147483647 for method: getTokenWithDetails. It should always be present on or above Gms version 2147483647. This indicates a bug in Gms implementation.", new Object[0]);
        }
        if (intent == null) {
            c2793a.c(AbstractC0279p0.l("no recovery Intent found with status=", string, " for method=getTokenWithDetails. This shouldn't happen"), new Object[0]);
        }
        throw new UserRecoverableAuthException(1, intent, string);
    }

    public static Object b(Context context, ComponentName componentName, h hVar) throws IOException {
        ServiceConnectionC2398a serviceConnectionC2398a = new ServiceConnectionC2398a();
        X xA = AbstractC1724m.a(context);
        try {
            xA.getClass();
            try {
                if (!xA.c(new U(componentName), serviceConnectionC2398a, "GoogleAuthUtil", null).V()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return hVar.c(serviceConnectionC2398a.a());
                } catch (RemoteException | InterruptedException | TimeoutException e7) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e7);
                    throw new IOException("Error on service connection.", e7);
                }
            } finally {
                xA.d(new U(componentName), serviceConnectionC2398a);
            }
        } catch (SecurityException e10) {
            Log.w("GoogleAuthUtil", "SecurityException while bind to auth service: " + e10.getMessage());
            throw new IOException("SecurityException while binding to Auth service.", e10);
        }
    }

    public static Object c(Task task, String str) throws j, IOException {
        C2793a c2793a = f11766c;
        try {
            return Tasks.await(task);
        } catch (InterruptedException e7) {
            String strL = AbstractC0279p0.l("Interrupted while waiting for the task of ", str, " to finish.");
            c2793a.f(strL, new Object[0]);
            throw new IOException(strL, e7);
        } catch (CancellationException e10) {
            String strL2 = AbstractC0279p0.l("Canceled while waiting for the task of ", str, " to finish.");
            c2793a.f(strL2, new Object[0]);
            throw new IOException(strL2, e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof j) {
                throw ((j) cause);
            }
            String strL3 = AbstractC0279p0.l("Unable to get a result for ", str, " due to ExecutionException.");
            c2793a.f(strL3, new Object[0]);
            throw new IOException(strL3, e11);
        }
    }

    public static void d(Context context) throws Ya.a {
        try {
            i.a(context.getApplicationContext(), 8400000);
        } catch (GooglePlayServicesIncorrectManifestValueException | d7.g e7) {
            throw new Ya.a(e7.getMessage(), e7);
        } catch (d7.h e10) {
            throw new e(1, new Intent(e10.f34130a), e10.getMessage());
        }
    }

    public static void e(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void f(Account account) {
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f11764a;
        for (int i5 = 0; i5 < 3; i5++) {
            if (strArr[i5].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    public static boolean g(Context context) {
        if (d7.e.f34127d.d(context, 17895000) != 0) {
            return false;
        }
        List listZzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        Iterator it = listZzq.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}

package W9;

import A7.V1;
import Va.M6;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import md.n0;
import pb.RunnableC3790a;

/* loaded from: classes4.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15397a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15398b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15399c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15400d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15401e;

    public w(FirebaseMessaging firebaseMessaging, long j8) {
        this.f15397a = 0;
        this.f15401e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new H6.b("firebase-iid-executor", 2));
        this.f15400d = firebaseMessaging;
        this.f15398b = j8;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f27361b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f15399c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f15400d).f27361b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f15400d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            String message = e7.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15397a) {
            case 0:
                u uVarF = u.f();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f15400d;
                boolean zH = uVarF.h(firebaseMessaging.f27361b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f15399c;
                if (zH) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f27369j = true;
                        }
                        if (!firebaseMessaging.f27368i.f()) {
                            firebaseMessaging.j(false);
                            if (!u.f().h(firebaseMessaging.f27361b)) {
                                return;
                            }
                        } else if (!u.f().g(firebaseMessaging.f27361b) || a()) {
                            if (b()) {
                                firebaseMessaging.j(false);
                            } else {
                                firebaseMessaging.m(this.f15398b);
                            }
                            if (!u.f().h(firebaseMessaging.f27361b)) {
                                return;
                            }
                        } else {
                            V1 v1 = new V1();
                            v1.f726b = this;
                            v1.b();
                            if (!u.f().h(firebaseMessaging.f27361b)) {
                                return;
                            }
                        }
                    } catch (IOException e7) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.j(false);
                        if (!u.f().h(firebaseMessaging.f27361b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (u.f().h(firebaseMessaging.f27361b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                ((n0) this.f15401e).execute((N6.w) this.f15399c);
                return;
        }
    }

    public String toString() {
        switch (this.f15397a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((RunnableC3790a) this.f15400d).toString());
                sb2.append("(scheduled in SynchronizationContext with delay of ");
                return M6.s(sb2, this.f15398b, ")");
            default:
                return super.toString();
        }
    }

    public w(n0 n0Var, N6.w wVar, RunnableC3790a runnableC3790a, long j8) {
        this.f15397a = 1;
        this.f15401e = n0Var;
        this.f15399c = wVar;
        this.f15400d = runnableC3790a;
        this.f15398b = j8;
    }
}

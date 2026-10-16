package W9;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x.C4412e;

/* loaded from: classes4.dex */
public final class A {

    /* renamed from: i, reason: collision with root package name */
    public static final long f15279i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15280j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15281a;

    /* renamed from: b, reason: collision with root package name */
    public final o f15282b;

    /* renamed from: c, reason: collision with root package name */
    public final C6.l f15283c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f15284d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f15286f;

    /* renamed from: h, reason: collision with root package name */
    public final y f15288h;

    /* renamed from: e, reason: collision with root package name */
    public final C4412e f15285e = new C4412e(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f15287g = false;

    public A(FirebaseMessaging firebaseMessaging, o oVar, y yVar, C6.l lVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f15284d = firebaseMessaging;
        this.f15282b = oVar;
        this.f15288h = yVar;
        this.f15283c = lVar;
        this.f15281a = context;
        this.f15286f = scheduledThreadPoolExecutor;
    }

    public static void b(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e7) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e7);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void a(x xVar, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f15285e) {
            try {
                String str = xVar.f15405c;
                if (this.f15285e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.f15285e.get(str);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f15285e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) throws IOException {
        String strA = this.f15284d.a();
        C6.l lVar = this.f15283c;
        lVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        b(lVar.p(lVar.D(strA, "/topics/" + str, bundle)));
    }

    public final void d(String str) throws IOException {
        String strA = this.f15284d.a();
        C6.l lVar = this.f15283c;
        lVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        b(lVar.p(lVar.D(strA, "/topics/" + str, bundle)));
    }

    public final void f(x xVar) {
        synchronized (this.f15285e) {
            try {
                String str = xVar.f15405c;
                if (this.f15285e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f15285e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f15285e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task g(x xVar) {
        y yVar = this.f15288h;
        synchronized (yVar) {
            yVar.f15408b.h(xVar.f15405c);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(xVar, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final synchronized void h(boolean z2) {
        this.f15287g = z2;
    }

    public final void i() {
        boolean z2;
        if (this.f15288h.a() != null) {
            synchronized (this) {
                z2 = this.f15287g;
            }
            if (z2) {
                return;
            }
            k(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W9.A.j():boolean");
    }

    public final void k(long j8) {
        long jMin = Math.min(Math.max(30L, 2 * j8), f15279i);
        this.f15286f.schedule(new C(this, this.f15281a, this.f15282b, jMin), j8, TimeUnit.SECONDS);
        h(true);
    }
}

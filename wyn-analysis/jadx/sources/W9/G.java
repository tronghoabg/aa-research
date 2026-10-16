package W9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m7.C3493a;

/* loaded from: classes4.dex */
public final class G implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15305a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f15306b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f15307c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f15308d;

    /* renamed from: e, reason: collision with root package name */
    public E f15309e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15310f;

    public G(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15308d = new ArrayDeque();
        this.f15310f = false;
        Context applicationContext = context.getApplicationContext();
        this.f15305a = applicationContext;
        this.f15306b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f15307c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f15308d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                E e7 = this.f15309e;
                if (e7 == null || !e7.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f15309e.a((F) this.f15308d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Task b(Intent intent) {
        F f10;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            f10 = new F(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f15307c;
            f10.f15304b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new S8.b(scheduledThreadPoolExecutor.schedule(new C8.g(f10, 20), 20L, TimeUnit.SECONDS), 15));
            this.f15308d.add(f10);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return f10.f15304b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f15310f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f15310f) {
            return;
        }
        this.f15310f = true;
        try {
        } catch (SecurityException e7) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e7);
        }
        if (C3493a.b().a(this.f15305a, this.f15306b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f15310f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f15308d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((F) arrayDeque.poll()).f15304b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f15310f = false;
            if (iBinder instanceof E) {
                this.f15309e = (E) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f15308d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((F) arrayDeque.poll()).f15304b.trySetResult(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}

package W9;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.applovin.impl.T0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: W9.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC1236g extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f15333a;

    /* renamed from: b, reason: collision with root package name */
    public E f15334b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15335c;

    /* renamed from: d, reason: collision with root package name */
    public int f15336d;

    /* renamed from: e, reason: collision with root package name */
    public int f15337e;

    public AbstractServiceC1236g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new H6.b("Firebase-Messaging-Intent-Handle", 2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15333a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f15335c = new Object();
        this.f15337e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            D.b(intent);
        }
        synchronized (this.f15335c) {
            try {
                int i5 = this.f15337e - 1;
                this.f15337e = i5;
                if (i5 == 0) {
                    stopSelfResult(this.f15336d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f15334b == null) {
                this.f15334b = new E(new S3.l((Object) this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15334b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f15333a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        synchronized (this.f15335c) {
            this.f15336d = i10;
            this.f15337e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) u.f().f15392d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15333a.execute(new Ab.a(this, intent2, taskCompletionSource, 15));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new T0(1), new A5.h(23, this, intent));
        return 3;
    }
}

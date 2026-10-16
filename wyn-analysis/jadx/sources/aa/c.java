package aa;

import a2.C1323c;
import android.util.Log;
import com.applovin.impl.T0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f17410d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final T0 f17411e = new T0(1);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f17412a;

    /* renamed from: b, reason: collision with root package name */
    public final o f17413b;

    /* renamed from: c, reason: collision with root package name */
    public Task f17414c = null;

    public c(Executor executor, o oVar) {
        this.f17412a = executor;
        this.f17413b = oVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C1323c c1323c = new C1323c(1);
        Executor executor = f17411e;
        task.addOnSuccessListener(executor, c1323c);
        task.addOnFailureListener(executor, c1323c);
        task.addOnCanceledListener(executor, c1323c);
        if (!((CountDownLatch) c1323c.f17156b).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized c d(Executor executor, o oVar) {
        String str;
        HashMap map;
        try {
            str = oVar.f17479b;
            map = f17410d;
            if (!map.containsKey(str)) {
                map.put(str, new c(executor, oVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (c) map.get(str);
    }

    public final synchronized Task b() {
        try {
            Task task = this.f17414c;
            if (task == null || (task.isComplete() && !this.f17414c.isSuccessful())) {
                Executor executor = this.f17412a;
                o oVar = this.f17413b;
                Objects.requireNonNull(oVar);
                this.f17414c = Tasks.call(executor, new G8.c(oVar, 9));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17414c;
    }

    public final e c() {
        synchronized (this) {
            try {
                Task task = this.f17414c;
                if (task != null && task.isSuccessful()) {
                    return (e) this.f17414c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (e) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e7) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e7);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task e(e eVar) {
        B8.c cVar = new B8.c(8, this, eVar);
        Executor executor = this.f17412a;
        return Tasks.call(executor, cVar).onSuccessTask(executor, new A5.h(28, this, eVar));
    }
}

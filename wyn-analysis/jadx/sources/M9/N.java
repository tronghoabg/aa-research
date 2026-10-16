package m9;

import A.AbstractC0213f;
import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class N extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40441a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public O f40442b = O.f40446g;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f40443c;

    /* renamed from: d, reason: collision with root package name */
    public final Task f40444d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f40445e;

    public N() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f40443c = taskCompletionSource;
        this.f40444d = taskCompletionSource.getTask();
        this.f40445e = new ArrayDeque();
    }

    public final void a(Vc.c cVar) {
        M m10 = new M();
        m10.f40439a = TaskExecutors.MAIN_THREAD;
        m10.f40440b = cVar;
        synchronized (this.f40441a) {
            this.f40445e.add(m10);
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return this.f40444d.addOnCanceledListener(onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        return this.f40444d.addOnCompleteListener(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        return this.f40444d.addOnFailureListener(onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        return this.f40444d.addOnSuccessListener(onSuccessListener);
    }

    public final void b(G g9) {
        synchronized (this.f40441a) {
            try {
                O o7 = this.f40442b;
                O o10 = new O(o7.f40447a, o7.f40448b, o7.f40449c, o7.f40450d, g9, 1);
                this.f40442b = o10;
                Iterator it = this.f40445e.iterator();
                while (it.hasNext()) {
                    M m10 = (M) it.next();
                    m10.getClass();
                    m10.f40439a.execute(new com.applovin.impl.sdk.nativeAd.e(29, m10, o10));
                }
                this.f40445e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f40443c.setException(g9);
    }

    public final void c(O o7) {
        boolean zB = AbstractC0213f.b(o7.f40451e, 3);
        int i5 = o7.f40451e;
        A6.c.z(zB, "Expected success, but was ".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "SUCCESS" : "RUNNING" : "ERROR"), new Object[0]);
        synchronized (this.f40441a) {
            try {
                this.f40442b = o7;
                Iterator it = this.f40445e.iterator();
                while (it.hasNext()) {
                    M m10 = (M) it.next();
                    O o10 = this.f40442b;
                    m10.getClass();
                    m10.f40439a.execute(new com.applovin.impl.sdk.nativeAd.e(29, m10, o10));
                }
                this.f40445e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f40443c.setResult(o7);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation) {
        return this.f40444d.continueWith(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        return this.f40444d.continueWithTask(continuation);
    }

    public final void d(O o7) {
        synchronized (this.f40441a) {
            try {
                this.f40442b = o7;
                Iterator it = this.f40445e.iterator();
                while (it.hasNext()) {
                    M m10 = (M) it.next();
                    m10.getClass();
                    m10.f40439a.execute(new com.applovin.impl.sdk.nativeAd.e(29, m10, o7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        return this.f40444d.getException();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        return (O) this.f40444d.getResult();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f40444d.isCanceled();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        return this.f40444d.isComplete();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        return this.f40444d.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        return this.f40444d.onSuccessTask(successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return this.f40444d.addOnCanceledListener(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        return this.f40444d.addOnCompleteListener(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return this.f40444d.addOnFailureListener(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        return this.f40444d.addOnSuccessListener(executor, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        return this.f40444d.continueWith(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        return this.f40444d.continueWithTask(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        return (O) this.f40444d.getResult(cls);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return this.f40444d.onSuccessTask(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        return this.f40444d.addOnCanceledListener(activity, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        return this.f40444d.addOnCompleteListener(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        return this.f40444d.addOnFailureListener(activity, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        return this.f40444d.addOnSuccessListener(activity, onSuccessListener);
    }
}

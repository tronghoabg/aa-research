package Nc;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8645c;

    public /* synthetic */ a(e eVar, TaskCompletionSource taskCompletionSource, int i5) {
        this.f8643a = i5;
        this.f8644b = eVar;
        this.f8645c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task taskForException;
        Task taskForException2;
        int i5 = this.f8643a;
        TaskCompletionSource taskCompletionSource = this.f8645c;
        switch (i5) {
            case 0:
                this.f8644b.getClass();
                try {
                    taskCompletionSource.setResult(new d());
                    break;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 1:
                e eVar = this.f8644b;
                eVar.getClass();
                try {
                    FirebaseAnalytics firebaseAnalytics = eVar.f8652a;
                    firebaseAnalytics.getClass();
                    try {
                        taskForException = Tasks.call(firebaseAnalytics.b(), new v8.d(firebaseAnalytics, 0));
                    } catch (RuntimeException e10) {
                        firebaseAnalytics.f27279a.zza(5, "Failed to schedule task for getSessionId", (Object) null, (Object) null, (Object) null);
                        taskForException = Tasks.forException(e10);
                    }
                    taskCompletionSource.setResult((Long) Tasks.await(taskForException));
                    break;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            case 2:
                e eVar2 = this.f8644b;
                eVar2.getClass();
                try {
                    FirebaseAnalytics firebaseAnalytics2 = eVar2.f8652a;
                    firebaseAnalytics2.getClass();
                    try {
                        taskForException2 = Tasks.call(firebaseAnalytics2.b(), new v8.d(firebaseAnalytics2, 1));
                    } catch (RuntimeException e12) {
                        firebaseAnalytics2.f27279a.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
                        taskForException2 = Tasks.forException(e12);
                    }
                    taskCompletionSource.setResult((String) Tasks.await(taskForException2));
                    break;
                } catch (Exception e13) {
                    taskCompletionSource.setException(e13);
                    return;
                }
            default:
                e eVar3 = this.f8644b;
                eVar3.getClass();
                try {
                    eVar3.f8652a.f27279a.zzj();
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e14) {
                    taskCompletionSource.setException(e14);
                }
        }
    }
}

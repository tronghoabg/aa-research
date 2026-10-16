package J9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: J9.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0654m implements Le.c, Le.b, OnSuccessListener, OnFailureListener, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5958a;

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        this.f5958a.setResult(obj);
    }

    @Override // Le.c
    public Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        boolean z2 = th instanceof Exception;
        TaskCompletionSource taskCompletionSource = this.f5958a;
        if (z2) {
            taskCompletionSource.setException((Exception) th);
        } else {
            taskCompletionSource.setException(new RuntimeException(th));
        }
        return Se.e.f11072a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f5958a.setException(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f5958a.setResult((Map) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = this.f5958a;
        if (zIsSuccessful) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }
}

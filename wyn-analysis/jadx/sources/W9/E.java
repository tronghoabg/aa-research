package W9;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.applovin.impl.T0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class E extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final S3.l f15302a;

    public E(S3.l lVar) {
        this.f15302a = lVar;
    }

    public final void a(F f10) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = f10.f15303a;
        AbstractServiceC1236g abstractServiceC1236g = (AbstractServiceC1236g) this.f15302a.f10967a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractServiceC1236g.f15333a.execute(new Ab.a(abstractServiceC1236g, intent, taskCompletionSource, 15));
        taskCompletionSource.getTask().addOnCompleteListener(new T0(1), new S8.b(f10, 14));
    }
}

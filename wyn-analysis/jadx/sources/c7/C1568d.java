package c7;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;

/* renamed from: c7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1568d implements Continuation, SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1568d f19682b = new C1568d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1568d f19683c = new C1568d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1568d f19684d = new C1568d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19685a;

    public /* synthetic */ C1568d(int i5) {
        this.f19685a = i5;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i5 = C1566b.f19671h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        switch (this.f19685a) {
            case 0:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            default:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new C1565a(intent);
                }
                return null;
        }
    }
}

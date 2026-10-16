package K8;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: K8.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0703o implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6665b;

    public /* synthetic */ C0703o(Context context, TaskCompletionSource taskCompletionSource) {
        this.f6664a = taskCompletionSource;
        this.f6665b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f6664a.setException(exc);
        E4.F.w(this.f6665b);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        this.f6664a.setResult((T) obj);
        E4.F.w(this.f6665b);
    }
}

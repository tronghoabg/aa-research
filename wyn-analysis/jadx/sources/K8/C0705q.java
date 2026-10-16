package K8;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: K8.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0705q implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6669b;

    public /* synthetic */ C0705q(Context context, TaskCompletionSource taskCompletionSource) {
        this.f6668a = taskCompletionSource;
        this.f6669b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f6668a.setException(exc);
        E4.F.w(this.f6669b);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        this.f6668a.setResult((T) obj);
        E4.F.w(this.f6669b);
    }
}

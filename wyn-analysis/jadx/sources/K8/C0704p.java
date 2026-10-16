package K8;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: K8.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0704p implements OnFailureListener, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6667b;

    public /* synthetic */ C0704p(Context context, TaskCompletionSource taskCompletionSource) {
        this.f6666a = taskCompletionSource;
        this.f6667b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f6666a.setException(exc);
        E4.F.w(this.f6667b);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        this.f6666a.setResult((T) obj);
        E4.F.w(this.f6667b);
    }
}

package K8;

import J8.C0635j;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class G implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6581b;

    public /* synthetic */ G(int i5, TaskCompletionSource taskCompletionSource) {
        this.f6580a = i5;
        this.f6581b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("b", "Failed to get reCAPTCHA token with error [" + exc.getMessage() + "]- calling backend without app verification");
        boolean z2 = exc instanceof C0635j;
        TaskCompletionSource taskCompletionSource = this.f6581b;
        if (z2 && ((C0635j) exc).f5807a.endsWith("UNAUTHORIZED_DOMAIN")) {
            taskCompletionSource.setException(exc);
        } else {
            taskCompletionSource.setResult(new K(null, null, null));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f6580a) {
            case 0:
                this.f6581b.setResult(new K(null, null, (String) obj));
                break;
            default:
                this.f6581b.setResult(new K((String) obj, null, null));
                break;
        }
    }
}

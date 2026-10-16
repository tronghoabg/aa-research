package W9;

import A.e0;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f15350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15351c;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource, int i5) {
        this.f15349a = i5;
        this.f15350b = firebaseMessaging;
        this.f15351c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15349a) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f15351c;
                e0 e0Var = FirebaseMessaging.f27357l;
                FirebaseMessaging firebaseMessaging = this.f15350b;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging2 = this.f15350b;
                TaskCompletionSource taskCompletionSource2 = this.f15351c;
                e0 e0Var2 = FirebaseMessaging.f27357l;
                try {
                    C6.l lVar = firebaseMessaging2.f27362c;
                    lVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    Tasks.await(lVar.p(lVar.D(o.d((s8.g) lVar.f1844a), "*", bundle)));
                    e0 e0VarD = FirebaseMessaging.d(firebaseMessaging2.f27361b);
                    String strE = firebaseMessaging2.e();
                    String strD = o.d(firebaseMessaging2.f27360a);
                    synchronized (e0VarD) {
                        String strJ = e0.j(strE, strD);
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) e0VarD.f152b).edit();
                        editorEdit.remove(strJ);
                        editorEdit.commit();
                    }
                    taskCompletionSource2.setResult(null);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
        }
    }
}

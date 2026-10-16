package W9;

import A.e0;
import c7.C1565a;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import p7.AbstractC3772b;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f15348b;

    public /* synthetic */ k(FirebaseMessaging firebaseMessaging, int i5) {
        this.f15347a = i5;
        this.f15348b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) throws NumberFormatException {
        FirebaseMessaging firebaseMessaging = this.f15348b;
        switch (this.f15347a) {
            case 0:
                A a5 = (A) obj;
                if (firebaseMessaging.f27364e.f()) {
                    a5.i();
                    break;
                }
                break;
            default:
                C1565a c1565a = (C1565a) obj;
                e0 e0Var = FirebaseMessaging.f27357l;
                firebaseMessaging.getClass();
                if (c1565a != null) {
                    AbstractC3772b.K(c1565a.f19670a);
                    firebaseMessaging.g();
                    break;
                }
                break;
        }
    }
}

package W9;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import x9.C4503c;
import x9.C4504d;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements L8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L8.t f15353b;

    public /* synthetic */ m(L8.t tVar, int i5) {
        this.f15352a = i5;
        this.f15353b = tVar;
    }

    @Override // L8.e
    public final Object o(C6.l lVar) {
        switch (this.f15352a) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f15353b, lVar);
            case 1:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f15353b, lVar);
            default:
                return new C4503c((Context) lVar.a(Context.class), ((s8.g) lVar.a(s8.g.class)).g(), lVar.B(C4504d.class), lVar.c(Y9.b.class), (Executor) lVar.b(this.f15353b));
        }
    }
}

package J8;

import Pc.T;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public final class K extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f5763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5764b;

    public K(FirebaseAuth firebaseAuth, T t10) {
        this.f5763a = t10;
        this.f5764b = firebaseAuth;
    }

    @Override // J8.x
    public final void onCodeSent(String str, w wVar) {
        String str2 = (String) this.f5764b.f27289g.f6642d;
        AbstractC1732v.i(str2);
        this.f5763a.onVerificationCompleted(u.Y(str, str2));
    }

    @Override // J8.x
    public final void onVerificationCompleted(u uVar) {
        this.f5763a.onVerificationCompleted(uVar);
    }

    @Override // J8.x
    public final void onVerificationFailed(s8.j jVar) {
        this.f5763a.onVerificationFailed(jVar);
    }

    @Override // J8.x
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }
}

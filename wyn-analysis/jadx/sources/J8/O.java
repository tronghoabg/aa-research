package J8;

import Pc.C0785a;
import Pc.S;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import n9.C3608c;

/* loaded from: classes4.dex */
public final class O implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5775a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5776b;

    public O(FirebaseAuth firebaseAuth) {
        this.f5776b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5775a) {
            case 0:
                FirebaseAuth firebaseAuth = this.f5776b;
                Iterator it = firebaseAuth.f27285c.iterator();
                while (it.hasNext()) {
                    ((C3608c) it.next()).f40948a.Z();
                }
                Iterator it2 = firebaseAuth.f27284b.iterator();
                while (it2.hasNext()) {
                    ((S) it2.next()).a(firebaseAuth);
                }
                break;
            default:
                FirebaseAuth firebaseAuth2 = this.f5776b;
                Iterator it3 = firebaseAuth2.f27286d.iterator();
                while (it3.hasNext()) {
                    ((C0785a) it3.next()).a(firebaseAuth2);
                }
                break;
        }
    }

    public O(FirebaseAuth firebaseAuth, T9.b bVar) {
        this.f5776b = firebaseAuth;
    }
}

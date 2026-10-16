package n9;

import E5.A;
import J8.AbstractC0640o;
import K8.C0693e;
import K8.InterfaceC0689a;
import L8.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.util.concurrent.CopyOnWriteArrayList;
import s8.C4027c;
import w9.AbstractC4392k;
import w9.InterfaceC4395n;

/* renamed from: n9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3609d extends Fe.b {

    /* renamed from: b, reason: collision with root package name */
    public final C3608c f40949b = new C3608c(this);

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0689a f40950c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4395n f40951d;

    /* renamed from: e, reason: collision with root package name */
    public int f40952e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40953f;

    public C3609d(r rVar) {
        rVar.a(new com.unity3d.services.core.webview.b(this, 24));
    }

    public final synchronized Task W() {
        InterfaceC0689a interfaceC0689a = this.f40950c;
        if (interfaceC0689a == null) {
            return Tasks.forException(new C4027c("auth is not available"));
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0689a;
        Task taskI = firebaseAuth.i(firebaseAuth.f27288f, this.f40953f);
        this.f40953f = false;
        return taskI.continueWithTask(AbstractC4392k.f47445b, new A(this, this.f40952e, 4));
    }

    public final synchronized C3610e X() {
        String str;
        AbstractC0640o abstractC0640o;
        try {
            InterfaceC0689a interfaceC0689a = this.f40950c;
            str = null;
            if (interfaceC0689a != null && (abstractC0640o = ((FirebaseAuth) interfaceC0689a).f27288f) != null) {
                str = ((C0693e) abstractC0640o).f6628b.f6614a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str != null ? new C3610e(str) : C3610e.f40954b;
    }

    public final synchronized void Y() {
        this.f40953f = true;
    }

    public final synchronized void Z() {
        this.f40952e++;
        InterfaceC4395n interfaceC4395n = this.f40951d;
        if (interfaceC4395n != null) {
            interfaceC4395n.b(X());
        }
    }

    public final synchronized void a0() {
        this.f40951d = null;
        InterfaceC0689a interfaceC0689a = this.f40950c;
        if (interfaceC0689a != null) {
            C3608c c3608c = this.f40949b;
            FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0689a;
            CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f27285c;
            copyOnWriteArrayList.remove(c3608c);
            firebaseAuth.s().a(copyOnWriteArrayList.size());
        }
    }
}

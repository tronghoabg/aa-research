package Se;

import J9.A;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class d extends He.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11070a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11071b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f11070a = i5;
        this.f11071b = obj;
    }

    @Override // He.g
    public final void c(He.h hVar) {
        switch (this.f11070a) {
            case 0:
                c cVar = new c(hVar);
                hVar.a(cVar);
                try {
                    A5.h hVar2 = (A5.h) this.f11071b;
                    A a5 = new A(cVar);
                    Task task = (Task) hVar2.f361b;
                    Executor executor = (Executor) hVar2.f362c;
                    task.addOnSuccessListener(executor, a5);
                    task.addOnFailureListener(executor, new A(cVar));
                    break;
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    cVar.onError(th);
                    return;
                }
            default:
                ((He.a) this.f11071b).d(new l(hVar, 0));
                break;
        }
    }
}

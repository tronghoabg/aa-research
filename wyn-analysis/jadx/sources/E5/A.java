package E5;

import J8.C0641p;
import N1.C0773w;
import Va.Za;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n9.C3609d;
import r9.C3955l;
import r9.InterfaceC3940A;
import w9.InterfaceC4396o;

/* loaded from: classes3.dex */
public final /* synthetic */ class A implements u6.g, Q1.g, l1.o, Continuation, InterfaceC4396o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3007c;

    public /* synthetic */ A(Object obj, int i5, int i10) {
        this.f3005a = i10;
        this.f3007c = obj;
        this.f3006b = i5;
    }

    @Override // w9.InterfaceC4396o
    public Object get() {
        C3955l c3955l = (C3955l) this.f3007c;
        r9.v vVar = c3955l.f44633c;
        int i5 = this.f3006b;
        t9.i iVarC = vVar.c(i5);
        A6.c.z(iVarC != null, "Attempt to reject nonexistent batch!", new Object[0]);
        c3955l.f44633c.e(iVarC);
        c3955l.f44633c.a();
        c3955l.f44634d.f(i5);
        Za za2 = c3955l.f44636f;
        za2.k(((InterfaceC3940A) za2.f13915a).y(iVarC.b()));
        return c3955l.f44636f.e(iVarC.b());
    }

    @Override // u6.g
    public void invoke(Object obj) {
        switch (this.f3005a) {
            case 0:
                ((u0) obj).E((C0446d0) this.f3007c, this.f3006b);
                break;
            case 1:
                N1.N n10 = ((U1.P) this.f3007c).f11977a;
                ((N1.H) obj).d(this.f3006b);
                break;
            default:
                ((N1.H) obj).z((C0773w) this.f3007c, this.f3006b);
                break;
        }
    }

    @Override // l1.o
    public boolean l(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3007c;
        sideSheetBehavior.getClass();
        int i5 = this.f3006b;
        if (i5 == 1 || i5 == 2) {
            throw new IllegalArgumentException(wg.b.c(new StringBuilder("STATE_"), i5 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f27001o;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i5);
            return true;
        }
        View view2 = (View) sideSheetBehavior.f27001o.get();
        RunnableC0443c runnableC0443c = new RunnableC0443c(sideSheetBehavior, i5, 7);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = k1.S.f38779a;
            if (view2.isAttachedToWindow()) {
                view2.post(runnableC0443c);
                return true;
            }
        }
        runnableC0443c.run();
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C3609d c3609d = (C3609d) this.f3007c;
        int i5 = this.f3006b;
        synchronized (c3609d) {
            try {
                if (i5 != c3609d.f40952e) {
                    Ba.c.p("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", 1, new Object[0]);
                    return c3609d.W();
                }
                if (task.isSuccessful()) {
                    return Tasks.forResult(((C0641p) task.getResult()).f5812a);
                }
                return Tasks.forException(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package m9;

import E5.C0441b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import ka.C1;
import p9.C3781b;
import p9.C3786g;
import w9.AbstractC4392k;
import w9.AbstractC4397p;

/* renamed from: m9.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3514m {

    /* renamed from: a, reason: collision with root package name */
    public final s9.h f40495a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f40496b;

    public C3514m(s9.h hVar, FirebaseFirestore firebaseFirestore) {
        hVar.getClass();
        this.f40495a = hVar;
        this.f40496b = firebaseFirestore;
    }

    public final C3513l a(Executor executor, C3786g c3786g, InterfaceC3517p interfaceC3517p) {
        C3513l c3513l;
        C3781b c3781b = new C3781b(executor, new Vc.a(2, this, interfaceC3517p));
        p9.u uVar = new p9.u(this.f40495a.f45375a, null);
        Dd.c cVar = this.f40496b.k;
        synchronized (cVar) {
            cVar.C();
            p9.n nVar = (p9.n) cVar.f2643c;
            c3513l = new C3513l(c3781b, nVar, nVar.b(uVar, c3786g, c3781b), 0);
        }
        return c3513l;
    }

    public final Task b() {
        Task taskF;
        List listSingletonList = Collections.singletonList(new t9.e(this.f40495a, t9.m.f45963c));
        Dd.c cVar = this.f40496b.k;
        synchronized (cVar) {
            cVar.C();
            taskF = ((p9.n) cVar.f2643c).f(listSingletonList);
        }
        return taskF.continueWith(AbstractC4392k.f47445b, AbstractC4397p.f47455a);
    }

    public final Task c(int i5) {
        Task taskContinueWith;
        if (i5 != 3) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            C3786g c3786g = new C3786g();
            c3786g.f43354a = true;
            c3786g.f43355b = true;
            c3786g.f43356c = true;
            taskCompletionSource2.setResult(a(AbstractC4392k.f47445b, c3786g, new C3512k(taskCompletionSource, taskCompletionSource2, i5, 0)));
            return taskCompletionSource.getTask();
        }
        Dd.c cVar = this.f40496b.k;
        synchronized (cVar) {
            cVar.C();
            p9.n nVar = (p9.n) cVar.f2643c;
            nVar.e();
            taskContinueWith = nVar.f43382d.f47427a.b(new B8.c(11, nVar, this.f40495a)).continueWith(new B(13));
        }
        return taskContinueWith.continueWith(AbstractC4392k.f47445b, new com.unity3d.services.core.webview.b(this, 20));
    }

    public final String d() {
        return this.f40495a.f45375a.c();
    }

    public final Task e(Object obj, a0 a0Var) {
        Task taskF;
        Fe.c.l(obj, "Provided data must not be null.");
        Fe.c.l(a0Var, "Provided options must not be null.");
        List listSingletonList = Collections.singletonList((a0Var.f40466a ? this.f40496b.f27329h.e(obj, a0Var.f40467b) : this.f40496b.f27329h.g(obj)).y(this.f40495a, t9.m.f45963c));
        Dd.c cVar = this.f40496b.k;
        synchronized (cVar) {
            cVar.C();
            taskF = ((p9.n) cVar.f2643c).f(listSingletonList);
        }
        return taskF.continueWith(AbstractC4392k.f47445b, AbstractC4397p.f47455a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3514m)) {
            return false;
        }
        C3514m c3514m = (C3514m) obj;
        return this.f40495a.equals(c3514m.f40495a) && this.f40496b.equals(c3514m.f40496b);
    }

    public final Task f(r rVar, Object obj, Object... objArr) {
        Task taskF;
        f0 f0Var = this.f40496b.f27329h;
        B b5 = AbstractC4397p.f47455a;
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(rVar);
        arrayList.add(obj);
        Collections.addAll(arrayList, objArr);
        for (int i5 = 0; i5 < arrayList.size(); i5 += 2) {
            Object obj2 = arrayList.get(i5);
            if (!(obj2 instanceof String) && !(obj2 instanceof r)) {
                throw new IllegalArgumentException("Excepted field name at argument position " + (i5 + 2) + " but got " + obj2 + " in call to update.  The arguments to update should alternate between field names and values");
            }
        }
        A6.c.z(arrayList.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        E4.n nVar = new E4.n(3, 19);
        C0441b c0441bX = nVar.x();
        s9.l lVar = new s9.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z2 = next instanceof String;
            A6.c.z(z2 || (next instanceof r), "Expected argument to be String or FieldPath.", new Object[0]);
            s9.j jVar = z2 ? r.a((String) next).f40508a : ((r) next).f40508a;
            if (next2 instanceof C3521u) {
                c0441bX.a(jVar);
            } else {
                C1 c1B = f0Var.b(next2, c0441bX.c(jVar));
                if (c1B != null) {
                    c0441bX.a(jVar);
                    lVar.g(c1B, jVar);
                }
            }
        }
        List listSingletonList = Collections.singletonList(new t9.l(this.f40495a, lVar, new t9.f((HashSet) nVar.f2939c), t9.m.a(true), DesugarCollections.unmodifiableList((ArrayList) nVar.f2940d)));
        Dd.c cVar = this.f40496b.k;
        synchronized (cVar) {
            cVar.C();
            taskF = ((p9.n) cVar.f2643c).f(listSingletonList);
        }
        return taskF.continueWith(AbstractC4392k.f47445b, AbstractC4397p.f47455a);
    }

    public final int hashCode() {
        return this.f40496b.hashCode() + (this.f40495a.f45375a.hashCode() * 31);
    }
}

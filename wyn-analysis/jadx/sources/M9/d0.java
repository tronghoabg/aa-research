package m9;

import Va.Za;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import ka.AbstractC3230e0;
import ka.C3244j;
import ka.C3247k;
import ka.C3259o;
import o1.C3641c;
import p9.C3777B;
import w9.AbstractC4392k;
import w9.C4386e;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3777B f40473a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f40474b;

    public d0(C3777B c3777b, FirebaseFirestore firebaseFirestore) {
        c3777b.getClass();
        this.f40473a = c3777b;
        firebaseFirestore.getClass();
        this.f40474b = firebaseFirestore;
    }

    public final C3516o a(C3514m c3514m) throws G {
        this.f40474b.k(c3514m);
        try {
            return (C3516o) Tasks.await(b(c3514m));
        } catch (InterruptedException e7) {
            throw new RuntimeException(e7);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof G) {
                throw ((G) e10.getCause());
            }
            throw new RuntimeException(e10.getCause());
        }
    }

    public final Task b(C3514m c3514m) {
        Task taskContinueWithTask;
        C3777B c3777b = this.f40473a;
        List listSingletonList = Collections.singletonList(c3514m.f40495a);
        A6.c.z(!c3777b.f43319d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
        if (c3777b.f43318c.size() != 0) {
            taskContinueWithTask = Tasks.forException(new G("Firestore transactions require all reads to be executed before all writes.", F.INVALID_ARGUMENT));
        } else {
            v9.g gVar = c3777b.f43316a;
            gVar.getClass();
            C3244j c3244jE = C3247k.e();
            c3244jE.b(gVar.f47066a.f47102b);
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                c3244jE.a(gVar.f47066a.h((s9.h) it.next()));
            }
            ArrayList arrayList = new ArrayList();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            v9.m mVar = gVar.f47068c;
            F6.r rVarD = AbstractC3230e0.f39401a;
            if (rVarD == null) {
                synchronized (AbstractC3230e0.class) {
                    try {
                        rVarD = AbstractC3230e0.f39401a;
                        if (rVarD == null) {
                            M.y yVarD = F6.r.d();
                            yVarD.f7229d = md.c0.f40629b;
                            yVarD.f7230e = F6.r.a("google.firestore.v1.Firestore", "BatchGetDocuments");
                            yVarD.f7226a = true;
                            C3247k c3247kD = C3247k.d();
                            ExtensionRegistryLite extensionRegistryLite = td.c.f46039a;
                            yVarD.f7227b = new td.b(c3247kD);
                            yVarD.f7228c = new td.b(C3259o.b());
                            rVarD = yVarD.d();
                            AbstractC3230e0.f39401a = rVarD;
                        }
                    } finally {
                    }
                }
            }
            C3247k c3247k = (C3247k) c3244jE.build();
            Za za2 = new Za();
            za2.f13918d = gVar;
            za2.f13915a = arrayList;
            za2.f13916b = listSingletonList;
            za2.f13917c = taskCompletionSource;
            X8.c cVar = mVar.f47095d;
            ((Task) cVar.f16184a).continueWithTask(((C4386e) cVar.f16185b).f47427a, new aa.f(26, cVar, rVarD)).addOnCompleteListener(mVar.f47092a.f47427a, new A5.g(mVar, za2, c3247k, 21));
            taskContinueWithTask = taskCompletionSource.getTask().continueWithTask(AbstractC4392k.f47445b, new C3641c(c3777b, 1));
        }
        return taskContinueWithTask.continueWith(AbstractC4392k.f47445b, new com.unity3d.services.core.webview.b(this, 22));
    }

    public final void c(C3514m c3514m, Map map, a0 a0Var) {
        FirebaseFirestore firebaseFirestore = this.f40474b;
        firebaseFirestore.k(c3514m);
        Fe.c.l(map, "Provided data must not be null.");
        Fe.c.l(a0Var, "Provided options must not be null.");
        boolean z2 = a0Var.f40466a;
        f0 f0Var = firebaseFirestore.f27329h;
        md.J jE = z2 ? f0Var.e(map, a0Var.f40467b) : f0Var.g(map);
        C3777B c3777b = this.f40473a;
        s9.h hVar = c3514m.f40495a;
        List listSingletonList = Collections.singletonList(jE.y(hVar, c3777b.a(hVar)));
        A6.c.z(!c3777b.f43319d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
        c3777b.f43318c.addAll(listSingletonList);
        c3777b.f43321f.add(hVar);
    }
}

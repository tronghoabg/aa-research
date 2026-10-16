package m9;

import A7.C0237b0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import w9.C4386e;
import w9.InterfaceC4394m;

/* loaded from: classes4.dex */
public final /* synthetic */ class C implements InterfaceC4394m, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f40408a;

    public /* synthetic */ C(FirebaseFirestore firebaseFirestore) {
        this.f40408a = firebaseFirestore;
    }

    @Override // w9.InterfaceC4394m
    public Object apply(Object obj) {
        p9.n nVar;
        FirebaseFirestore firebaseFirestore = this.f40408a;
        C4386e c4386e = (C4386e) obj;
        synchronized (firebaseFirestore.k) {
            s9.f fVar = firebaseFirestore.f27324c;
            String str = firebaseFirestore.f27325d;
            H h10 = firebaseFirestore.f27331j;
            nVar = new p9.n(firebaseFirestore.f27323b, new C0237b0(fVar, str, h10.f40426a, h10.f40427b), firebaseFirestore.f27326e, firebaseFirestore.f27327f, c4386e, firebaseFirestore.f27332l, (p9.s) firebaseFirestore.f27322a.apply(h10));
        }
        return nVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        FirebaseFirestore firebaseFirestore = this.f40408a;
        firebaseFirestore.getClass();
        p9.u uVar = (p9.u) task.getResult();
        if (uVar != null) {
            return new W(uVar, firebaseFirestore);
        }
        return null;
    }
}

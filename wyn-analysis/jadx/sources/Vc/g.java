package Vc;

import A5.h;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import m9.e0;
import p9.C3777B;
import p9.n;
import r9.RunnableC3954k;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import w9.ExecutorC4384c;

/* loaded from: classes5.dex */
public final class g implements InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public final h f14874a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f14875b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f14876c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f14877d;

    /* renamed from: f, reason: collision with root package name */
    public int f14879f;

    /* renamed from: g, reason: collision with root package name */
    public List f14880g;

    /* renamed from: e, reason: collision with root package name */
    public final Semaphore f14878e = new Semaphore(0);

    /* renamed from: h, reason: collision with root package name */
    public final Handler f14881h = new Handler(Looper.getMainLooper());

    public g(h hVar, FirebaseFirestore firebaseFirestore, Long l10, Long l11) {
        this.f14874a = hVar;
        this.f14875b = firebaseFirestore;
        this.f14876c = l10;
        this.f14877d = l11;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        this.f14878e.release();
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        Task task;
        FirebaseFirestore firebaseFirestore = this.f14875b;
        int iIntValue = this.f14877d.intValue();
        if (iIntValue < 1) {
            throw new IllegalArgumentException("Max attempts must be at least 1");
        }
        e0 e0Var = new e0(iIntValue);
        C4271h c4271h = (C4271h) interfaceC4270g;
        e eVar = new e(this, c4271h);
        firebaseFirestore.getClass();
        ThreadPoolExecutor threadPoolExecutor = C3777B.f43315g;
        firebaseFirestore.k.C();
        A5.g gVar = new A5.g(firebaseFirestore, threadPoolExecutor, eVar, 17);
        Dd.c cVar = firebaseFirestore.k;
        synchronized (cVar) {
            cVar.C();
            n nVar = (n) cVar.f2643c;
            nVar.e();
            ExecutorC4384c executorC4384c = nVar.f43382d.f47427a;
            K3.e eVar2 = new K3.e(nVar, e0Var, gVar, 3);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorC4384c.execute(new RunnableC3954k(eVar2, executorC4384c, taskCompletionSource, 2));
            task = taskCompletionSource.getTask();
        }
        task.addOnCompleteListener(new e(this, c4271h));
    }
}

package I8;

import B8.c;
import C8.d;
import C8.i;
import C8.j;
import D6.c1;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.C1733w;
import com.google.android.gms.internal.safetynet.zzae;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d7.e;
import java.util.concurrent.Executor;
import s8.g;
import z8.InterfaceC4621a;

/* loaded from: classes4.dex */
public final class b implements InterfaceC4621a {

    /* renamed from: a, reason: collision with root package name */
    public final Task f5426a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5427b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f5428c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f5429d;

    /* renamed from: e, reason: collision with root package name */
    public final j f5430e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5431f;

    public b(g gVar, Executor executor, Executor executor2, Executor executor3) {
        i iVar = new i(gVar);
        Object obj = e.f34126c;
        AbstractC1732v.i(executor2);
        gVar.a();
        this.f5431f = gVar.f45330c.f45343a;
        this.f5428c = executor;
        this.f5429d = executor3;
        gVar.a();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor2.execute(new d(gVar.f45328a, taskCompletionSource));
        this.f5426a = taskCompletionSource.getTask();
        this.f5427b = iVar;
        this.f5430e = new j(0);
    }

    @Override // z8.InterfaceC4621a
    public final Task getToken() {
        final int i5 = 0;
        SuccessContinuation successContinuation = new SuccessContinuation(this) { // from class: I8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f5425b;

            {
                this.f5425b = this;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                switch (i5) {
                    case 0:
                        b bVar = this.f5425b;
                        bVar.getClass();
                        return AbstractC1732v.o(zzae.zza(((C7.g) obj).asGoogleApiClient(), "".getBytes(), bVar.f5431f), new C1733w(new C7.d()));
                    default:
                        C7.d dVar = (C7.d) obj;
                        b bVar2 = this.f5425b;
                        bVar2.getClass();
                        AbstractC1732v.i(dVar);
                        String jwsResult = ((C7.e) ((t) dVar.f421a)).getJwsResult();
                        AbstractC1732v.f(jwsResult);
                        return Tasks.call(bVar2.f5429d, new c(3, bVar2, new c1(jwsResult, false))).onSuccessTask(bVar2.f5428c, new F5.d(9));
                }
            }
        };
        Task task = this.f5426a;
        Executor executor = this.f5428c;
        final int i10 = 1;
        return task.onSuccessTask(executor, successContinuation).onSuccessTask(executor, new SuccessContinuation(this) { // from class: I8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f5425b;

            {
                this.f5425b = this;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                switch (i10) {
                    case 0:
                        b bVar = this.f5425b;
                        bVar.getClass();
                        return AbstractC1732v.o(zzae.zza(((C7.g) obj).asGoogleApiClient(), "".getBytes(), bVar.f5431f), new C1733w(new C7.d()));
                    default:
                        C7.d dVar = (C7.d) obj;
                        b bVar2 = this.f5425b;
                        bVar2.getClass();
                        AbstractC1732v.i(dVar);
                        String jwsResult = ((C7.e) ((t) dVar.f421a)).getJwsResult();
                        AbstractC1732v.f(jwsResult);
                        return Tasks.call(bVar2.f5429d, new c(3, bVar2, new c1(jwsResult, false))).onSuccessTask(bVar2.f5428c, new F5.d(9));
                }
            }
        });
    }
}

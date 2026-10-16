package G8;

import C8.i;
import C8.j;
import D6.c1;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.util.concurrent.Executor;
import s8.g;
import x9.C4504d;
import z8.InterfaceC4621a;

/* loaded from: classes4.dex */
public final class d implements InterfaceC4621a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4671a;

    /* renamed from: b, reason: collision with root package name */
    public final IntegrityManager f4672b;

    /* renamed from: c, reason: collision with root package name */
    public final i f4673c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f4674d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f4675e;

    /* renamed from: f, reason: collision with root package name */
    public final j f4676f;

    public d(g gVar, Executor executor, Executor executor2) {
        gVar.a();
        String str = gVar.f45330c.f45347e;
        gVar.a();
        IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(gVar.f45328a);
        i iVar = new i(gVar);
        j jVar = new j(0);
        this.f4671a = str;
        this.f4672b = integrityManagerCreate;
        this.f4673c = iVar;
        this.f4674d = executor;
        this.f4675e = executor2;
        this.f4676f = jVar;
    }

    @Override // z8.InterfaceC4621a
    public final Task getToken() {
        Task taskCall = Tasks.call(this.f4675e, new c(this, new C4504d(18)));
        final int i5 = 1;
        SuccessContinuation successContinuation = new SuccessContinuation(this) { // from class: G8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f4668b;

            {
                this.f4668b = this;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                switch (i5) {
                    case 0:
                        d dVar = this.f4668b;
                        dVar.getClass();
                        return Tasks.call(dVar.f4675e, new B8.c(2, dVar, new c1(((IntegrityTokenResponse) obj).token(), false)));
                    default:
                        d dVar2 = this.f4668b;
                        dVar2.getClass();
                        return dVar2.f4672b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(dVar2.f4671a)).setNonce(((a) obj).f4666a).build());
                }
            }
        };
        Executor executor = this.f4674d;
        final int i10 = 0;
        return taskCall.onSuccessTask(executor, successContinuation).onSuccessTask(executor, new SuccessContinuation(this) { // from class: G8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f4668b;

            {
                this.f4668b = this;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                switch (i10) {
                    case 0:
                        d dVar = this.f4668b;
                        dVar.getClass();
                        return Tasks.call(dVar.f4675e, new B8.c(2, dVar, new c1(((IntegrityTokenResponse) obj).token(), false)));
                    default:
                        d dVar2 = this.f4668b;
                        dVar2.getClass();
                        return dVar2.f4672b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(dVar2.f4671a)).setNonce(((a) obj).f4666a).build());
                }
            }
        }).onSuccessTask(executor, new F5.d(8));
    }
}

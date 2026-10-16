package com.waze.uid.state_impl.b;

import android.content.Context;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44612a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f44613b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f44614c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ GetCredentialRequest f44615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(n nVar, Context context, GetCredentialRequest getCredentialRequest, h.c.e eVar) {
        super(2, eVar);
        this.f44613b = nVar;
        this.f44614c = context;
        this.f44615d = getCredentialRequest;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f44613b, this.f44614c, this.f44615d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws com.google.android.libraries.c.a.e {
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f44612a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f44612a = 1;
                obj = n.a(this.f44613b).getCredential(this.f44614c, this.f44615d, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            this.f44613b.g((GetCredentialResponse) obj);
        } catch (GetCredentialCancellationException e2) {
            e2.toString();
            com.waze.shared_infra.i.h.l("UidEventsController", "GetCredentialCancellationException ".concat(e2.toString()), e2);
            CharSequence errorMessage = e2.getErrorMessage();
            boolean zF = h.n.o.F(errorMessage != null ? errorMessage.toString() : "", "Cancelled by user", true);
            n nVar = this.f44613b;
            if (zF) {
                nVar.j();
            } else {
                nVar.l();
            }
        } catch (GetCredentialException e3) {
            e3.toString();
            com.waze.shared_infra.i.h.k("UidEventsController", "GetCredentialException: ".concat(e3.toString()));
            this.f44613b.l();
        }
        return ab.f48028a;
    }
}

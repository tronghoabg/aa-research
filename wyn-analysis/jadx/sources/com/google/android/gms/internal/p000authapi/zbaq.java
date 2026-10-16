package com.google.android.gms.internal.p000authapi;

import X6.b;
import X6.c;
import X6.d;
import X6.e;
import X6.f;
import X6.g;
import X6.n;
import X6.o;
import X6.s;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C1695i;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zbaq extends l implements n {
    private static final h zba;
    private static final AbstractC1686a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbalVar, hVar);
    }

    public zbaq(Activity activity, s sVar) {
        super(activity, activity, zbc, sVar, k.f26561c);
        this.zbd = zbat.zba();
    }

    @Override // X6.n
    public final Task<g> beginSignIn(f fVar) {
        AbstractC1732v.i(fVar);
        b bVar = fVar.f16143b;
        AbstractC1732v.i(bVar);
        e eVar = fVar.f16142a;
        AbstractC1732v.i(eVar);
        d dVar = fVar.f16147f;
        AbstractC1732v.i(dVar);
        c cVar = fVar.f16148g;
        AbstractC1732v.i(cVar);
        final f fVar2 = new f(eVar, bVar, this.zbd, fVar.f16145d, fVar.f16146e, dVar, cVar);
        N7.e eVarA = A.a();
        eVarA.f8591e = new d7.d[]{zbas.zba};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api.zbaj
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbam zbamVar = new zbam(this.zba, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                f fVar3 = fVar2;
                AbstractC1732v.i(fVar3);
                zbwVar.zbc(zbamVar, fVar3);
            }
        };
        eVarA.f8588b = false;
        eVarA.f8589c = 1553;
        return doRead(eVarA.e());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws j {
        Status status = Status.f26426g;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : android.support.v4.media.session.b.c0(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f26428i);
        }
        if (!status2.V()) {
            throw new j(status2);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final X6.i iVar) {
        AbstractC1732v.i(iVar);
        N7.e eVarA = A.a();
        eVarA.f8591e = new d7.d[]{zbas.zbh};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zba.zba(iVar, (zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        eVarA.f8589c = 1653;
        return doRead(eVarA.e());
    }

    public final o getSignInCredentialFromIntent(Intent intent) throws j {
        Status status = Status.f26426g;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : android.support.v4.media.session.b.c0(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f26428i);
        }
        if (!status2.V()) {
            throw new j(status2);
        }
        Parcelable.Creator<o> creator2 = o.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        o oVar = (o) (byteArrayExtra2 != null ? android.support.v4.media.session.b.c0(byteArrayExtra2, creator2) : null);
        if (oVar != null) {
            return oVar;
        }
        throw new j(status);
    }

    @Override // X6.n
    public final Task<PendingIntent> getSignInIntent(X6.j jVar) {
        AbstractC1732v.i(jVar);
        String str = jVar.f16151a;
        AbstractC1732v.i(str);
        final X6.j jVar2 = new X6.j(jVar.f16155e, str, jVar.f16152b, this.zbd, jVar.f16154d, jVar.f16156f);
        N7.e eVarA = A.a();
        eVarA.f8591e = new d7.d[]{zbas.zbf};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api.zbak
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbao zbaoVar = new zbao(this.zba, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                X6.j jVar3 = jVar2;
                AbstractC1732v.i(jVar3);
                zbwVar.zbe(zbaoVar, jVar3);
            }
        };
        eVarA.f8589c = 1555;
        return doRead(eVarA.e());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = com.google.android.gms.common.api.o.f26564a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((com.google.android.gms.common.api.o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C1695i.a();
        N7.e eVarA = A.a();
        eVarA.f8591e = new d7.d[]{zbas.zbb};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zba.zbb((zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        eVarA.f8588b = false;
        eVarA.f8589c = 1554;
        return doWrite(eVarA.e());
    }

    public final /* synthetic */ void zba(X6.i iVar, zbar zbarVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), iVar, this.zbd);
    }

    public final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }

    public zbaq(Context context, s sVar) {
        super(context, null, zbc, sVar, k.f26561c);
        this.zbd = zbat.zba();
    }
}

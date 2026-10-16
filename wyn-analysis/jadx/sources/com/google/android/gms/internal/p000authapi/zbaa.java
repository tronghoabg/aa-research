package com.google.android.gms.internal.p000authapi;

import N7.e;
import X6.a;
import X6.q;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.b;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zbaa extends l {
    private static final h zba;
    private static final AbstractC1686a zbb;
    private static final i zbc;

    static {
        h hVar = new h();
        zba = hVar;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new i("Auth.Api.Identity.Authorization.API", zbyVar, hVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaa(Activity activity, q qVar) {
        i iVar = zbc;
        String str = qVar.f16173a;
        if (str != null) {
            AbstractC1732v.f(str);
        }
        String strZba = zbat.zba();
        AbstractC1732v.f(strZba);
        super(activity, activity, iVar, new q(strZba), k.f26561c);
    }

    public final Task<a> authorize(AuthorizationRequest authorizationRequest) {
        String str;
        boolean z2;
        boolean z10;
        boolean z11;
        String str2;
        AbstractC1732v.i(authorizationRequest);
        ArrayList arrayList = authorizationRequest.f26366a;
        AbstractC1732v.a("requestedScopes cannot be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        String str3 = null;
        String str4 = authorizationRequest.f26371f;
        if (str4 != null) {
            AbstractC1732v.f(str4);
            str = str4;
        } else {
            str = null;
        }
        Account account = authorizationRequest.f26370e;
        Account account2 = account != null ? account : null;
        boolean z12 = authorizationRequest.f26369d;
        String str5 = authorizationRequest.f26367b;
        if (!z12 || str5 == null) {
            z2 = false;
        } else {
            z2 = true;
            str3 = str5;
        }
        if (!authorizationRequest.f26368c || str5 == null) {
            z10 = false;
            z11 = false;
            str2 = str3;
        } else {
            AbstractC1732v.a("two different server client ids provided", str3 == null || str3.equals(str5));
            z11 = authorizationRequest.f26373h;
            str2 = str5;
            z10 = true;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(arrayList, str2, z10, z2, account2, str, ((q) getApiOptions()).f16173a, z11);
        e eVarA = A.a();
        eVarA.f8591e = new d[]{zbas.zbc};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api.zbx
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbz zbzVar = new zbz(this.zba, (TaskCompletionSource) obj2);
                zbk zbkVar = (zbk) ((zbg) obj).getService();
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                AbstractC1732v.i(authorizationRequest3);
                zbkVar.zbc(zbzVar, authorizationRequest3);
            }
        };
        eVarA.f8588b = false;
        eVarA.f8589c = 1534;
        return doRead(eVarA.e());
    }

    public final a getAuthorizationResultFromIntent(Intent intent) throws j {
        Status status = Status.f26426g;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : b.c0(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f26428i);
        }
        if (!status2.V()) {
            throw new j(status2);
        }
        Parcelable.Creator<a> creator2 = a.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        a aVar = (a) (byteArrayExtra2 != null ? b.c0(byteArrayExtra2, creator2) : null);
        if (aVar != null) {
            return aVar;
        }
        throw new j(status);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaa(Context context, q qVar) {
        i iVar = zbc;
        String str = qVar.f16173a;
        if (str != null) {
            AbstractC1732v.f(str);
        }
        String strZba = zbat.zba();
        AbstractC1732v.f(strZba);
        super(context, null, iVar, new q(strZba), k.f26561c);
    }
}

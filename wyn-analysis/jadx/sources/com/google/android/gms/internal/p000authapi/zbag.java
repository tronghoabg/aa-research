package com.google.android.gms.internal.p000authapi;

import N7.e;
import X6.h;
import X6.m;
import X6.r;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zbag extends l implements h {
    private static final com.google.android.gms.common.api.h zba;
    private static final AbstractC1686a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        com.google.android.gms.common.api.h hVar = new com.google.android.gms.common.api.h();
        zba = hVar;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbadVar, hVar);
    }

    public zbag(Activity activity, r rVar) {
        super(activity, activity, zbc, rVar, k.f26561c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status = Status.f26426g;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : b.c0(byteArrayExtra, creator));
        return status2 == null ? status : status2;
    }

    public final Task<X6.k> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC1732v.i(saveAccountLinkingTokenRequest);
        new ArrayList();
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f26378e);
        String str = this.zbd;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f26374a;
        AbstractC1732v.a("Consent PendingIntent cannot be null", pendingIntent != null);
        String str2 = saveAccountLinkingTokenRequest.f26375b;
        AbstractC1732v.a("Invalid tokenType", "auth_code".equals(str2));
        String str3 = saveAccountLinkingTokenRequest.f26376c;
        AbstractC1732v.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str3));
        ArrayList arrayList = saveAccountLinkingTokenRequest.f26377d;
        AbstractC1732v.a("scopes cannot be null", arrayList != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str3, arrayList, str, saveAccountLinkingTokenRequest.f26379f);
        e eVarA = A.a();
        eVarA.f8591e = new d[]{zbas.zbg};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api.zbab
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbae zbaeVar = new zbae(this.zba, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                AbstractC1732v.i(saveAccountLinkingTokenRequest3);
                zbnVar.zbc(zbaeVar, saveAccountLinkingTokenRequest3);
            }
        };
        eVarA.f8588b = false;
        eVarA.f8589c = 1535;
        return doRead(eVarA.e());
    }

    @Override // X6.h
    public final Task<m> savePassword(X6.l lVar) {
        AbstractC1732v.i(lVar);
        final X6.l lVar2 = new X6.l(lVar.f16158a, this.zbd, lVar.f16160c);
        e eVarA = A.a();
        eVarA.f8591e = new d[]{zbas.zbe};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api.zbac
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbaf zbafVar = new zbaf(this.zba, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                X6.l lVar3 = lVar2;
                AbstractC1732v.i(lVar3);
                zbnVar.zbd(zbafVar, lVar3);
            }
        };
        eVarA.f8588b = false;
        eVarA.f8589c = 1536;
        return doRead(eVarA.e());
    }

    public zbag(Context context, r rVar) {
        super(context, null, zbc, rVar, k.f26561c);
        this.zbd = zbat.zba();
    }
}

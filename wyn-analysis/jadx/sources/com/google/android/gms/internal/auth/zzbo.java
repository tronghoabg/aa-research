package com.google.android.gms.internal.auth;

import N7.e;
import V6.b;
import V6.c;
import Z6.a;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class zzbo extends l {
    public zzbo(Activity activity, c cVar) {
        super(activity, activity, b.f13154a, cVar == null ? c.f13155b : cVar, k.f26561c);
    }

    public final Task<String> getSpatulaHeader() {
        e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        };
        eVarA.f8589c = 1520;
        return doRead(eVarA.e());
    }

    public final Task<Z6.b> performProxyRequest(final a aVar) {
        e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzbo zzboVar = this.zza;
                a aVar2 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar2);
            }
        };
        eVarA.f8589c = 1518;
        return doWrite(eVarA.e());
    }

    public zzbo(Context context, c cVar) {
        super(context, null, b.f13154a, cVar == null ? c.f13155b : cVar, k.f26561c);
    }
}

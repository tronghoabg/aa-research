package com.google.android.gms.internal.auth;

import T6.b;
import T6.g;
import a.AbstractC1304a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;
import h7.C2793a;

/* loaded from: classes3.dex */
final class zzab extends l implements zzg {
    private static final h zza;
    private static final AbstractC1686a zzb;
    private static final i zzc;
    private static final C2793a zzd;
    private final Context zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new i("GoogleAuthService.API", zzvVar, hVar);
        zzd = new C2793a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, null, zzc, e.f26433X8, k.f26561c);
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (AbstractC1304a.O(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.f("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        N7.e eVarA = A.a();
        eVarA.f8591e = new d[]{g.f11770c};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        eVarA.f8589c = 1513;
        return doWrite(eVarA.e());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final b bVar) {
        AbstractC1732v.j(bVar, "request cannot be null.");
        N7.e eVarA = A.a();
        eVarA.f8591e = new d[]{g.f11769b};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        };
        eVarA.f8589c = 1515;
        return doWrite(eVarA.e());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        AbstractC1732v.j(account, "Account name cannot be null!");
        AbstractC1732v.g(str, "Scope cannot be null!");
        N7.e eVarA = A.a();
        eVarA.f8591e = new d[]{g.f11770c};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        eVarA.f8589c = 1512;
        return doWrite(eVarA.e());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        AbstractC1732v.j(account, "account cannot be null.");
        N7.e eVarA = A.a();
        eVarA.f8591e = new d[]{g.f11769b};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        eVarA.f8589c = 1517;
        return doWrite(eVarA.e());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        AbstractC1732v.j(str, "Client package name cannot be null!");
        N7.e eVarA = A.a();
        eVarA.f8591e = new d[]{g.f11769b};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        eVarA.f8589c = 1514;
        return doWrite(eVarA.e());
    }
}
